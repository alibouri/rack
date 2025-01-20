package com.twilio.voice;

public class RegistrationException extends VoiceException {
    static final RegistrationException ConflictException = null;
    public static final int EXCEPTION_CONFLICT = 31409;
    public static final int EXCEPTION_REGISTRATION_ERROR = 31301;
    public static final int EXCEPTION_TOO_MANY_REQUEST = 0x7AC5;
    public static final int EXCEPTION_UNSUPPORTED_CANCEL_MESSAGE_ERROR = 31302;
    public static final int EXCEPTION_UPGRADE_REQUIRED = 0x7AC2;
    static final RegistrationException TooManyRequestException;
    static final RegistrationException UnsupportedCancelMessageException;
    static final RegistrationException UpgradeRequiredException;

    static {
        RegistrationException.UnsupportedCancelMessageException = new RegistrationException(31302, "Unsupported Cancel Message Error", "This version of the SDK no longer supports processing cancel push notification messages. You must register via Voice.register(...) on Android or [TwilioVoice registerWithAccessToken:deviceToken:completion:] on iOS with this version of the SDK to stop receiving cancel push notification messages. Cancellations are now handled internally and reported to you on behalf of the SDK.");
        RegistrationException.ConflictException = new RegistrationException(31409, "Conflict", "The request could not be processed because of a conflict in the current state of the resource. Another request may be in progress.");
        RegistrationException.TooManyRequestException = new RegistrationException(0x7AC5, "Too Many Requests", "Too many requests were sent in a given amount of time.");
        RegistrationException.UpgradeRequiredException = new RegistrationException(0x7AC2, "Upgrade Required", "The client should switch to a different protocol.");
    }

    public RegistrationException(int v, String s, String s1) {
        super(v, s, s1);
    }
}

