package com.twilio.voice;

import M.J;
import android.os.Handler;
import m5.b;

class Registrar implements RegistrarListener {
    static final String RELATIVE_REGISTER_URL = "/v1/registrations?productId=voice";
    private static final String RELATIVE_UNREGISTER_URL = "?productId=voice";
    private final String accessToken;
    private final String channelType;
    private final Handler handler;
    private String homeRegion;
    private final String notificationToken;
    private RegistrationListener registrationListener;
    private UnregistrationListener unregistrationListener;
    String urlString;

    public Registrar(String s, String s1, String s2) {
        this.accessToken = s;
        this.channelType = s1;
        this.notificationToken = s2;
        this.handler = Utils.createHandler();
        try {
            this.homeRegion = new AccessTokenParser(s).getHomeRegion();
        }
        catch(AccessTokenParseException accessTokenParseException0) {
            accessTokenParseException0.printStackTrace();
        }
        String s3 = this.homeRegion;
        if(s3 == null) {
            this.urlString = b.y(new StringBuilder(), Constants.getNotificationServiceUrl(), "/v1/registrations?productId=voice");
            return;
        }
        this.urlString = J.e("https://ers.", s3, ".twilio.com/v1/registrations?productId=voice");
    }

    @Override  // com.twilio.voice.RegistrarListener
    public void onError(RegistrationException registrationException0) {
        com.twilio.voice.Registrar.3 registrar$30 = new Runnable() {
            @Override
            public void run() {
                if(Registrar.this.registrationListener != null) {
                    Registrar.this.registrationListener.onError(registrationException0, Registrar.this.accessToken, Registrar.this.notificationToken);
                    return;
                }
                Registrar.this.unregistrationListener.onError(registrationException0, Registrar.this.accessToken, Registrar.this.notificationToken);
            }
        };
        this.handler.post(registrar$30);
    }

    @Override  // com.twilio.voice.RegistrarListener
    public void onSuccess(String s) {
        com.twilio.voice.Registrar.2 registrar$20 = new Runnable() {
            @Override
            public void run() {
                if(Registrar.this.registrationListener != null) {
                    Registrar.this.registrationListener.onRegistered(Registrar.this.accessToken, Registrar.this.notificationToken);
                    return;
                }
                Registrar.this.unregistrationListener.onUnregistered(Registrar.this.accessToken, Registrar.this.notificationToken);
            }
        };
        this.handler.post(registrar$20);
    }

    public void register(RegistrationListener registrationListener0) {
        this.registrationListener = registrationListener0;
        String s = new Registration(this.channelType, this.notificationToken).toJson().toString();
        HttpsRegistrar.register(this.accessToken, s, this.urlString, this);
    }

    public void unregister(UnregistrationListener unregistrationListener0) {
        this.unregistrationListener = unregistrationListener0;
        String s = new Registration(this.channelType, this.notificationToken).toJson().toString();
        String s1 = this.urlString;
        com.twilio.voice.Registrar.1 registrar$10 = new RegistrarListener() {
            @Override  // com.twilio.voice.RegistrarListener
            public void onError(RegistrationException registrationException0) {
                Registrar.this.onError(registrationException0);
            }

            @Override  // com.twilio.voice.RegistrarListener
            public void onSuccess(String s) {
                HttpsRegistrar.unregister(Registrar.this.accessToken, s + "?productId=voice", Registrar.this);
            }
        };
        HttpsRegistrar.register(this.accessToken, s, s1, true, registrar$10);
    }
}

