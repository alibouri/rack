package com.twilio.voice;

interface RegistrarListener {
    void onError(RegistrationException arg1);

    void onSuccess(String arg1);
}

