package com.twilio.voice;

import android.util.Base64;
import java.util.HashMap;

class AccessTokenParser {
    String homeRegion;
    private static final Logger logger;
    final int numberOfSegmentsInAccessToken;
    final int numberOfSegmentsInridgeToken;
    String rawToken;
    final String twilioVoiceHomeRegionSpecifier;

    static {
        AccessTokenParser.logger = Logger.getLogger(AccessTokenParser.class);
    }

    public AccessTokenParser(String s) {
        this.twilioVoiceHomeRegionSpecifier = "twr";
        this.numberOfSegmentsInAccessToken = 3;
        this.numberOfSegmentsInridgeToken = 5;
        this.rawToken = null;
        this.homeRegion = null;
        this.parse(s);
    }

    public void extractHeader(String s) {
        AccessTokenParser.logger.i("JWT token HEADER: " + s);
        String[] arr_s = s.replace("{", "").replace("}", "").split(",");
        HashMap hashMap0 = new HashMap();
        for(int v = 0; v < arr_s.length; ++v) {
            String[] arr_s1 = arr_s[v].split(":");
            hashMap0.put(arr_s1[0].replace("\"", ""), arr_s1[1].replace("\"", ""));
        }
        String s1 = (String)hashMap0.get("twr");
        this.homeRegion = s1;
        if(s1 != null && s1.equalsIgnoreCase("null")) {
            this.homeRegion = null;
        }
    }

    public String getHomeRegion() {
        return this.homeRegion;
    }

    public void parse(String s) {
        this.rawToken = s;
        if(s != null) {
            String[] arr_s = s.trim().split("\\.");
            if(arr_s.length != 3 && arr_s.length != 5) {
                throw new AccessTokenParseException("Access token must have 3 or 5 segments");
            }
            for(int v = 0; v < arr_s.length; ++v) {
                arr_s[v] = new String(Base64.decode(arr_s[v].getBytes(), 8));
            }
            this.extractHeader(arr_s[0]);
        }
    }
}

