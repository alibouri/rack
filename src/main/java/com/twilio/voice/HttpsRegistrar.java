package com.twilio.voice;

import android.os.AsyncTask;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;

class HttpsRegistrar {
    static final String DEFAULT_REGISTRATION_FAILED_MESSAGE = "Registration failed";
    static final String DEFAULT_UNREGISTRATION_FAILED_MESSAGE = "Unregistration failed";
    static final String JSON_CODE_KEY = "code";
    static final String JSON_MESSAGE_KEY = "message";
    private static final String REGISTRATION_ID_LOCATION = "Location";

    public static void d(String s, String s1, int v, String s2) {
        HttpsRegistrar.publishRegistrationErrorEvent(s, s1, "unregistration-error", v, s2);
    }

    private static void handleException(Boolean boolean0, Exception exception0, HttpsURLConnection httpsURLConnection0, RegistrarListener registrarListener0) {
        String s = boolean0.booleanValue() ? "Unregistration failed" : "Registration failed";
        if(httpsURLConnection0 != null) {
            try {
                JSONObject jSONObject0 = HttpsRegistrar.processJSONError(httpsURLConnection0.getErrorStream());
                registrarListener0.onError(HttpsRegistrar.handleHttpAuthErrorCode(boolean0.booleanValue(), jSONObject0.getInt("code"), jSONObject0.getString("message")));
            }
            catch(Exception unused_ex) {
                registrarListener0.onError(new RegistrationException(31301, s, exception0.getMessage()));
            }
            return;
        }
        registrarListener0.onError(new RegistrationException(31301, s, exception0.getMessage()));
    }

    private static RegistrationException handleHttpAuthErrorCode(boolean z, int v, String s) {
        String s1 = v + " : " + s;
        if(v != 20151 && v != 20157 && v != 20403 && v != 51007) {
            switch(v) {
                case 20101: 
                case 20102: 
                case 20103: 
                case 20104: 
                case 20105: 
                case 20106: 
                case 20107: {
                    break;
                }
                default: {
                    return z ? new RegistrationException(31301, "Unregistration failed", s1) : new RegistrationException(31301, "Registration failed", s1);
                }
            }
        }
        return new RegistrationException(v, s, s1);
    }

    public static RegistrationException handleHttpErrorCode(boolean z, int v, int v1, String s, String s1) {
        String s2 = v1 + " : " + s;
        switch(v) {
            case 400: {
                int v2 = VoiceException.BadRequestException.getErrorCode();
                String s3 = VoiceException.BadRequestException.getMessage();
                return s == null ? new RegistrationException(v2, s3, VoiceException.BadRequestException.getExplanation()) : new RegistrationException(v2, s3, v1 + " : " + s);
            }
            case 401: {
                return HttpsRegistrar.handleHttpAuthErrorCode(z, v1, s);
            }
            case 403: {
                int v3 = VoiceException.ForbiddenException.getErrorCode();
                String s4 = VoiceException.ForbiddenException.getMessage();
                return s == null ? new RegistrationException(v3, s4, VoiceException.ForbiddenException.getExplanation()) : new RegistrationException(v3, s4, v1 + " : " + s);
            }
            case 404: {
                int v4 = VoiceException.NotFoundException.getErrorCode();
                String s5 = VoiceException.NotFoundException.getMessage();
                return s == null ? new RegistrationException(v4, s5, VoiceException.NotFoundException.getExplanation()) : new RegistrationException(v4, s5, v1 + " : " + s);
            }
            case 408: {
                int v5 = VoiceException.RequestTimeoutException.getErrorCode();
                String s6 = VoiceException.RequestTimeoutException.getMessage();
                return s == null ? new RegistrationException(v5, s6, VoiceException.RequestTimeoutException.getExplanation()) : new RegistrationException(v5, s6, v1 + " : " + s);
            }
            case 409: {
                int v6 = RegistrationException.ConflictException.getErrorCode();
                String s7 = RegistrationException.ConflictException.getMessage();
                return s == null ? new RegistrationException(v6, s7, RegistrationException.ConflictException.getExplanation()) : new RegistrationException(v6, s7, v1 + " : " + s);
            }
            case 426: {
                int v7 = RegistrationException.UpgradeRequiredException.getErrorCode();
                String s8 = RegistrationException.UpgradeRequiredException.getMessage();
                return s == null ? new RegistrationException(v7, s8, RegistrationException.UpgradeRequiredException.getExplanation()) : new RegistrationException(v7, s8, v1 + " : " + s);
            }
            case 429: {
                int v8 = RegistrationException.TooManyRequestException.getErrorCode();
                String s9 = RegistrationException.TooManyRequestException.getMessage();
                return s == null ? new RegistrationException(v8, s9, RegistrationException.TooManyRequestException.getExplanation()) : new RegistrationException(v8, s9, v1 + " : " + s);
            }
            case 500: {
                int v9 = VoiceException.InternalServerErrorException.getErrorCode();
                String s10 = VoiceException.InternalServerErrorException.getMessage();
                return s == null ? new RegistrationException(v9, s10, VoiceException.InternalServerErrorException.getExplanation()) : new RegistrationException(v9, s10, v1 + " : " + s);
            }
            case 502: {
                int v10 = VoiceException.BadGatewayException.getErrorCode();
                String s11 = VoiceException.BadGatewayException.getMessage();
                return s == null ? new RegistrationException(v10, s11, VoiceException.BadGatewayException.getExplanation()) : new RegistrationException(v10, s11, v1 + " : " + s);
            }
            case 503: {
                int v11 = VoiceException.ServiceUnavailableException.getErrorCode();
                String s12 = VoiceException.ServiceUnavailableException.getMessage();
                return s == null ? new RegistrationException(v11, s12, VoiceException.ServiceUnavailableException.getExplanation()) : new RegistrationException(v11, s12, v1 + " : " + s);
            }
            case 504: {
                int v12 = VoiceException.GatewayTimeoutException.getErrorCode();
                String s13 = VoiceException.GatewayTimeoutException.getMessage();
                return s == null ? new RegistrationException(v12, s13, VoiceException.GatewayTimeoutException.getExplanation()) : new RegistrationException(v12, s13, v1 + " : " + s);
            }
            default: {
                if(v1 == 0) {
                    s2 = v + " : " + s1;
                }
                return new RegistrationException(31301, (z ? "Unregistration failed" : "Registration failed"), s2);
            }
        }
    }

    private static JSONObject processJSONError(InputStream inputStream0) {
        StringBuilder stringBuilder0 = new StringBuilder();
        if(inputStream0 != null) {
            BufferedReader bufferedReader0 = new BufferedReader(new InputStreamReader(inputStream0));
            String s;
            while((s = bufferedReader0.readLine()) != null) {
                stringBuilder0.append(s);
                stringBuilder0.append('\n');
            }
            bufferedReader0.close();
        }
        return new JSONObject(stringBuilder0.toString());
    }

    private static void publishError(boolean z, String s, String s1, int v, String s2) {
        if(!z) {
            HttpsRegistrar.publishRegistrationErrorEvent(s, s1, "registration-error", v, s2);
            return;
        }
        HttpsRegistrar.publishRegistrationErrorEvent(s, s1, "unregistration-registration-error", v, s2);
    }

    private static void publishRegistrationErrorEvent(String s, String s1, String s2, int v, String s3) {
        EventPublisher eventPublisher0 = new EventPublisher("twilio-voice-android", s);
        EventPayload eventPayload0 = new Builder().productName("twilio-voice-android").requestId(s1).errorCode(((long)v)).errorMessage(s3).payLoadType("application/json").build();
        try {
            JSONObject jSONObject0 = eventPayload0.getPayload();
            Event event0 = eventPublisher0.createEvent(SeverityLevel.ERROR, "registration", s2, jSONObject0);
            eventPublisher0.publish(SeverityLevel.ERROR, "registration", s2, event0);
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
        }
    }

    private static void publishRegistrationSuccessfulEvent(String s, String s1, String s2) {
        EventPublisher eventPublisher0 = new EventPublisher("twilio-voice-android", s);
        EventPayload eventPayload0 = new Builder().productName("twilio-voice-android").requestId(s1).payLoadType("application/json").build();
        try {
            JSONObject jSONObject0 = eventPayload0.getPayload();
            Event event0 = eventPublisher0.createEvent(SeverityLevel.INFO, "registration", s2, jSONObject0);
            eventPublisher0.publish(SeverityLevel.INFO, "registration", s2, event0);
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
        }
    }

    public static void register(String s, String s1, String s2, RegistrarListener registrarListener0) {
        HttpsRegistrar.register(s, s1, s2, false, registrarListener0);
    }

    public static void register(String s, String s1, String s2, boolean z, RegistrarListener registrarListener0) {
        new AsyncTask() {
            public Void doInBackground(Void[] arr_void) {
                String s2;
                int v1;
                HttpsURLConnection httpsURLConnection1;
                HttpsURLConnection httpsURLConnection0;
                String s = "Registration failed";
                try {
                    httpsURLConnection0 = null;
                    httpsURLConnection1 = null;
                    httpsURLConnection1 = VoiceURLConnection.create(s, s2, "POST");
                    goto label_7;
                }
                catch(Exception exception0) {
                    goto label_39;
                }
                catch(Throwable throwable0) {
                }
                VoiceURLConnection.release(httpsURLConnection0);
                throw throwable0;
                try {
                    try {
                    label_7:
                        httpsURLConnection1.addRequestProperty("X-Twilio-Request-Id", SidUtil.generateGUID("RQ", s));
                        OutputStreamWriter outputStreamWriter0 = new OutputStreamWriter(httpsURLConnection1.getOutputStream());
                        outputStreamWriter0.write(s1);
                        outputStreamWriter0.close();
                        int v = httpsURLConnection1.getResponseCode();
                        String s1 = httpsURLConnection1.getResponseMessage();
                        if(v == 201) {
                            String s3 = httpsURLConnection1.getHeaderField("Location");
                            if(s3 == null) {
                                HttpsRegistrar.publishError(z, s, SidUtil.generateGUID("RQ", s), 201, s1);
                                RegistrationException registrationException1 = new RegistrationException(31301, (z ? "Unregistration failed" : "Registration failed"), "Registration Location is null");
                                registrarListener0.onError(registrationException1);
                            }
                            else {
                                if(!z) {
                                    HttpsRegistrar.publishRegistrationSuccessfulEvent(s, SidUtil.generateGUID("RQ", s), "registration");
                                }
                                registrarListener0.onSuccess(s3);
                            }
                        }
                        else {
                            JSONObject jSONObject0 = HttpsRegistrar.processJSONError(httpsURLConnection1.getErrorStream());
                            if(jSONObject0 == null) {
                                v1 = 0;
                                s2 = null;
                            }
                            else {
                                v1 = jSONObject0.getInt("code");
                                s2 = jSONObject0.getString("message");
                            }
                            RegistrationException registrationException0 = HttpsRegistrar.handleHttpErrorCode(z, v, v1, s2, s1);
                            HttpsRegistrar.publishError(z, s, SidUtil.generateGUID("RQ", s), registrationException0.getErrorCode(), registrationException0.getMessage() + " : " + registrationException0.getExplanation());
                            registrarListener0.onError(registrationException0);
                        }
                    }
                    catch(Exception exception0) {
                    label_39:
                        HttpsRegistrar.handleException(Boolean.valueOf(z), exception0, httpsURLConnection1, registrarListener0);
                        boolean z = z;
                        if(z) {
                            s = "Unregistration failed";
                        }
                        HttpsRegistrar.publishError(z, s, SidUtil.generateGUID("RQ", s), 31301, s + " : " + exception0.getMessage());
                    }
                }
                catch(Throwable throwable0) {
                    httpsURLConnection0 = httpsURLConnection1;
                    VoiceURLConnection.release(httpsURLConnection0);
                    throw throwable0;
                }
                VoiceURLConnection.release(httpsURLConnection1);
                return null;
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public static void unregister(String s, String s1, RegistrarListener registrarListener0) {
        new AsyncTask() {
            public Void doInBackground(Void[] arr_void) {
                String s1;
                int v1;
                HttpsURLConnection httpsURLConnection1;
                HttpsURLConnection httpsURLConnection0 = null;
                try {
                    httpsURLConnection1 = null;
                    httpsURLConnection1 = VoiceURLConnection.create(s, s1, "DELETE");
                    goto label_6;
                }
                catch(Exception exception0) {
                    goto label_29;
                }
                catch(Throwable throwable0) {
                }
                VoiceURLConnection.release(httpsURLConnection0);
                throw throwable0;
                try {
                    try {
                    label_6:
                        httpsURLConnection1.addRequestProperty("X-Twilio-Request-Id", SidUtil.generateGUID("RQ", s));
                        httpsURLConnection1.connect();
                        int v = httpsURLConnection1.getResponseCode();
                        String s = httpsURLConnection1.getResponseMessage();
                        if(v == 200 || v == 204) {
                            HttpsRegistrar.publishRegistrationSuccessfulEvent(s, SidUtil.generateGUID("RQ", s), "unregistration");
                            registrarListener0.onSuccess(null);
                        }
                        else {
                            JSONObject jSONObject0 = HttpsRegistrar.processJSONError(httpsURLConnection1.getErrorStream());
                            if(jSONObject0 == null) {
                                v1 = 0;
                                s1 = null;
                            }
                            else {
                                v1 = jSONObject0.getInt("code");
                                s1 = jSONObject0.getString("message");
                            }
                            RegistrationException registrationException0 = HttpsRegistrar.handleHttpErrorCode(true, v, v1, s1, s);
                            HttpsRegistrar.d(s, SidUtil.generateGUID("RQ", s), registrationException0.getErrorCode(), registrationException0.getMessage() + " : " + registrationException0.getExplanation());
                            registrarListener0.onError(registrationException0);
                        }
                    }
                    catch(Exception exception0) {
                    label_29:
                        HttpsRegistrar.handleException(Boolean.TRUE, exception0, httpsURLConnection1, registrarListener0);
                        HttpsRegistrar.publishError(true, s, SidUtil.generateGUID("RQ", s), 31301, "Unregistration failed : " + exception0.getMessage());
                    }
                }
                catch(Throwable throwable0) {
                    httpsURLConnection0 = httpsURLConnection1;
                    VoiceURLConnection.release(httpsURLConnection0);
                    throw throwable0;
                }
                VoiceURLConnection.release(httpsURLConnection1);
                return null;
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }
}

