package com.twilio.voice;

public class IceServer {
    public final String password;
    public final String serverUrl;
    public final String username;

    public IceServer(String s) {
        this(s, "", "");
    }

    public IceServer(String s, String s1, String s2) {
        this.username = s1;
        this.password = s2;
        this.serverUrl = s;
    }
}

