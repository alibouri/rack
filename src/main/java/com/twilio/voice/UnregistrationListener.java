package com.twilio.voice;

public interface UnregistrationListener {
    void onError(RegistrationException arg1, String arg2, String arg3);

    void onUnregistered(String arg1, String arg2);
}

