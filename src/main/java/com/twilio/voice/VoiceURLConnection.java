package com.twilio.voice;

import android.net.TrafficStats;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

class VoiceURLConnection {
    static final int CONNECTION_TIMEOUT = 10000;
    private static final String HEADER_ACCEPT_KEY = "Accept";
    private static final String HEADER_CONTENT_TYPE_KEY = "Content-Type";
    private static final String HEADER_CONTENT_TYPE_VALUE = "application/json";
    private static final String HEADER_TWILIO_TOKEN_KEY = "X-Twilio-Token";
    static final int HTTP_TOO_MANY_REQUEST = 429;
    static final int HTTP_UPGRADE_REQUIRED = 426;
    public static final String METHOD_TYPE_DELETE = "DELETE";
    public static final String METHOD_TYPE_POST = "POST";
    static final int SOCKET_READ_TIMEOUT = 10000;
    private static final int VOICE_URL_CONNECTION_THREAD_ID = 1000;
    private static final Logger logger;

    static {
        VoiceURLConnection.logger = Logger.getLogger(VoiceURLConnection.class);
    }

    public static HttpsURLConnection create(String s, String s1, String s2) {
        TrafficStats.setThreadStatsTag(1000);
        HttpsURLConnection httpsURLConnection0 = (HttpsURLConnection)new URL(s1).openConnection();
        if(s2.equals("DELETE")) {
            httpsURLConnection0.setDoOutput(false);
        }
        else {
            httpsURLConnection0.setDoOutput(true);
        }
        httpsURLConnection0.setDoInput(true);
        httpsURLConnection0.setRequestProperty("Content-Type", "application/json");
        httpsURLConnection0.setRequestProperty("Accept", "application/json");
        httpsURLConnection0.setRequestProperty("X-Twilio-Token", s);
        httpsURLConnection0.setConnectTimeout(10000);
        httpsURLConnection0.setReadTimeout(10000);
        httpsURLConnection0.setRequestMethod(s2);
        return httpsURLConnection0;
    }

    public static void release(HttpsURLConnection httpsURLConnection0) {
        if(httpsURLConnection0 != null) {
            try {
                httpsURLConnection0.getInputStream().close();
            }
            catch(Exception unused_ex) {
            }
            try {
                httpsURLConnection0.getOutputStream().close();
            }
            catch(Exception unused_ex) {
            }
            try {
                httpsURLConnection0.getErrorStream().close();
            }
            catch(Exception unused_ex) {
            }
            httpsURLConnection0.disconnect();
        }
    }
}

