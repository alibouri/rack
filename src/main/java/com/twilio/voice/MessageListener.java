package com.twilio.voice;

public interface MessageListener {
    void onCallInvite(CallInvite arg1);

    void onCancelledCallInvite(CancelledCallInvite arg1, CallException arg2);
}

