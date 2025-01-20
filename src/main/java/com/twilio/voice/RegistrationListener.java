package com.twilio.voice;

public interface RegistrationListener {
    void onError(RegistrationException arg1, String arg2, String arg3);

    void onRegistered(String arg1, String arg2);
}

