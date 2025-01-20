package com.twilio.voice;

public class CallException extends VoiceException {
    static final CallException AddressIncompleteException = null;
    static final CallException AuthorizationInvalidAccessTokenException = null;
    static final CallException BusyEverywhereException = null;
    static final CallException BusyHereException = null;
    static final CallException CallCancelledException = null;
    static final CallException CallConnectionErrorException = null;
    static final CallException CallDoesNotExistException = null;
    static final CallException CallTwiMLApplicationNotFoundException = null;
    static final CallException DNSResolutionException = null;
    static final CallException DeclineException = null;
    static final CallException DoesNotExistAnywhereException = null;
    public static final int EXCEPTION_ADDRESS_INCOMPLETE_ERROR = 0x7AFC;
    public static final int EXCEPTION_AUTHORIZATION_ERROR = 31201;
    public static final int EXCEPTION_BUSY_EVERYWHERE_ERROR = 31600;
    public static final int EXCEPTION_BUSY_HERE_ERROR = 0x7AFE;
    public static final int EXCEPTION_CALL_CANCELLED = 31008;
    public static final int EXCEPTION_CALL_OR_TRANSACTION_DOES_NOT_EXIST_ERROR = 0x7AF9;
    public static final int EXCEPTION_CLIENT_LOCAL_MEDIA_DESCRIPTION = 53400;
    public static final int EXCEPTION_CLIENT_REMOTE_MEDIA_DESCRIPTION = 0xD09A;
    public static final int EXCEPTION_CONNECTION_ERROR = 31005;
    public static final int EXCEPTION_DECLINE_ERROR = 31603;
    public static final int EXCEPTION_DNS_RESOLUTION = 31530;
    public static final int EXCEPTION_DOES_NOT_EXIST_ANYWHERE_ERROR = 31604;
    public static final int EXCEPTION_INVALID_APPLICATION_SID = 0x52E2;
    public static final int EXCEPTION_MALFORMED_REQUEST = 31100;
    public static final int EXCEPTION_MEDIA_CONNECTION_FAILED = 0xD09D;
    public static final int EXCEPTION_MEDIA_DTLS_TRANSPORT_FAILED = 0xD09F;
    public static final int EXCEPTION_NO_SUPPORTED_CODEC = 0xD09C;
    public static final int EXCEPTION_REQUEST_TERMINATED_ERROR = 0x7AFF;
    public static final int EXCEPTION_SERVER_LOCAL_MEDIA_DESCRIPTION = 0xD099;
    public static final int EXCEPTION_SERVER_REMOTE_MEDIA_DESCRIPTION = 0xD09B;
    public static final int EXCEPTION_SIGNALING_CONNECTION_DISCONNECTED = 0xCF09;
    public static final int EXCEPTION_TEMPORARILY_UNAVAILABLE_ERROR = 0x7AF8;
    public static final int EXCEPTION_TRANSPORT_ERROR = 31009;
    static final CallException MalformedInvalidRequestException;
    static final CallException MediaClientLocalDescFailedErrorCode;
    static final CallException MediaClientRemoteDescFailedErrorCode;
    static final CallException MediaConnectionErrorCode;
    static final CallException MediaDTLSTransportErrorCode;
    static final CallException MediaNoSupportedCodecErrorCode;
    static final CallException MediaServerLocalDescFailedErrorCode;
    static final CallException MediaServerRemoteDescFailedErrorCode;
    static final CallException RequestTerminatedException;
    static final CallException SignalingConnectionDisconnectedErrorCode;
    static final CallException TemporarilyUnavailableException;
    static final CallException TransportErrorException;

    static {
        CallException.CallTwiMLApplicationNotFoundException = new CallException(0x52E2, "Invalid ApplicationSid", "The server was not able to find the TwiML application associated with the App SID.");
        CallException.CallConnectionErrorException = new CallException(31005, "Connection error", "A connection error occurred during the call.");
        CallException.CallCancelledException = new CallException(31008, "Call Cancelled", "Unable to answer because the call has ended.");
        CallException.TransportErrorException = new CallException(31009, "Transport error", "No transport available to send or receive messages.");
        CallException.MalformedInvalidRequestException = new CallException(31100, "Malformed request", "The request could not be understood due to malformed syntax.");
        CallException.AuthorizationInvalidAccessTokenException = new CallException(31201, "Authorization error", "The request requires user authentication.The server understood the request, but is refusing to fulfill it.");
        CallException.TemporarilyUnavailableException = new CallException(0x7AF8, "Temporarily Unavailable", "The callee is currently unavailable");
        CallException.CallDoesNotExistException = new CallException(0x7AF9, "Call/Transaction Does Not Exist", "The call no longer exists.");
        CallException.AddressIncompleteException = new CallException(0x7AFC, "Address Incomplete", "The provided phone number is malformed.");
        CallException.BusyHereException = new CallException(0x7AFE, "Busy Here", "The callee is busy.");
        CallException.RequestTerminatedException = new CallException(0x7AFF, "Request Terminated", "The request has terminated as a result of a bye or cancel.");
        CallException.DNSResolutionException = new CallException(31530, "DNS Resolution Error", "Could not connect to the server.");
        CallException.BusyEverywhereException = new CallException(31600, "Busy Everywhere", "All possible destinations are busy.");
        CallException.DeclineException = new CallException(31603, "Decline", "The callee does not wish to participate in the call.");
        CallException.DoesNotExistAnywhereException = new CallException(31604, "Does Not Exist Anywhere", "The requested callee does not exist anywhere.");
        CallException.SignalingConnectionDisconnectedErrorCode = new CallException(0xCF09, "Signaling connection disconnected", "Raised whenever the signaling connection is unexpectedly disconnected.");
        CallException.MediaClientLocalDescFailedErrorCode = new CallException(53400, "Client is unable to create or apply a local media description", "Raised whenever a Client is unable to create or apply a local media description.");
        CallException.MediaServerLocalDescFailedErrorCode = new CallException(0xD099, "Server is unable to create or apply a local media description", "Raised whenever the Server is unable to create or apply a local media description");
        CallException.MediaClientRemoteDescFailedErrorCode = new CallException(0xD09A, "Client is unable to apply a remote media description", "Raised whenever the Client receives a remote media description but is unable to apply it");
        CallException.MediaServerRemoteDescFailedErrorCode = new CallException(0xD09B, "Server is unable to apply a remote media description", "Raised whenever the Server receives a remote media description but is unable to apply it");
        CallException.MediaNoSupportedCodecErrorCode = new CallException(0xD09C, "No supported code", "Raised whenever the intersection of codecs supported by the Client and the Server (or, in peer-to-peer, the Client and another Participant) is empty.");
        CallException.MediaConnectionErrorCode = new CallException(0xD09D, "Media connection failed", "Raised by the Client or Server whenever a media connection fails.");
        CallException.MediaDTLSTransportErrorCode = new CallException(0xD09F, "The media connection failed due to DTLS handshake failure", "There was a problem while negotiating with the remote DTLS peer. Therefore the Client will not be able to establish the media connection.");
    }

    public CallException(int v, String s, String s1) {
        super(v, s, s1);
    }
}

