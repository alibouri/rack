package com.twilio.voice;

public class VoiceException extends Exception {
    static final VoiceException AccessTokenRejectedException = null;
    static final VoiceException AuthFailureException = null;
    static final VoiceException BadGatewayException = null;
    static final VoiceException BadRequestException = null;
    public static final int EXCEPTION_ACCESS_TOKEN_REJECTED = 51007;
    public static final int EXCEPTION_AUTH_FAILURE = 20151;
    public static final int EXCEPTION_BAD_GATEWAY = 0x7B0E;
    public static final int EXCEPTION_BAD_REQUEST = 31400;
    public static final int EXCEPTION_FORBIDDEN = 31403;
    public static final int EXCEPTION_GATEWAY_TIMEOUT = 0x7B10;
    public static final int EXCEPTION_INTERNAL_SERVER_ERROR = 31500;
    public static final int EXCEPTION_INVALID_ACCESS_TOKEN = 20101;
    public static final int EXCEPTION_INVALID_ACCESS_TOKEN_EXPIRY = 20104;
    public static final int EXCEPTION_INVALID_ACCESS_TOKEN_GRANT = 20106;
    public static final int EXCEPTION_INVALID_ACCESS_TOKEN_HEADER = 20102;
    public static final int EXCEPTION_INVALID_ACCESS_TOKEN_NOT_VALID_YET = 20105;
    public static final int EXCEPTION_INVALID_ISSUER_SUBJECT = 20103;
    public static final int EXCEPTION_INVALID_SIGNATURE = 20107;
    public static final int EXCEPTION_INVALID_TOKEN = 20403;
    public static final int EXCEPTION_INVALID_TTL = 20157;
    public static final int EXCEPTION_NOT_FOUND = 31404;
    public static final int EXCEPTION_REQUEST_TIMEOUT = 0x7AB0;
    public static final int EXCEPTION_SERVICE_UNAVAILABLE = 0x7B0F;
    static final VoiceException ForbiddenException;
    static final VoiceException GatewayTimeoutException;
    static final VoiceException InternalServerErrorException;
    static final VoiceException InvalidAccessTokenException;
    static final VoiceException InvalidAccessTokenExpiryException;
    static final VoiceException InvalidAccessTokenGrantException;
    static final VoiceException InvalidAccessTokenHeaderException;
    static final VoiceException InvalidAccessTokenNotValidYetException;
    static final VoiceException InvalidIssuerSubjectException;
    static final VoiceException InvalidSignatureException;
    static final VoiceException InvalidTTLException;
    static final VoiceException InvalidTokenException;
    static final VoiceException NotFoundException;
    static final VoiceException RequestTimeoutException;
    static final VoiceException ServiceUnavailableException;
    private int errorCode;
    private String errorMessage;
    private String explanation;

    static {
        VoiceException.InvalidAccessTokenException = new VoiceException(20101, "Invalid access token", "Twilio was unable to validate your Access Token");
        VoiceException.InvalidAccessTokenHeaderException = new VoiceException(20102, "Invalid access token header", "The header of the Access Token provided to the Twilio API was invalid");
        VoiceException.InvalidIssuerSubjectException = new VoiceException(20103, "Invalid access token issuer/subject", "The issuer or subject of the Access Token provided to the Twilio API was invalid");
        VoiceException.InvalidAccessTokenExpiryException = new VoiceException(20104, "Access token expired or expiration date invalid", "The Access Token provided to the Twilio API has expired, the expiration time specified in the token was invalid");
        VoiceException.InvalidAccessTokenNotValidYetException = new VoiceException(20105, "Access token not yet valid", "The Access Token provided to the Twilio API is not yet valid");
        VoiceException.InvalidAccessTokenGrantException = new VoiceException(20106, "Invalid access token grants", "The Access Token signature and issuer were valid, but the grants specified in the token were invalid, unparseable, or did not authorize the action being requested");
        VoiceException.InvalidSignatureException = new VoiceException(20107, "Invalid access token signature", "The signature for the Access Token provided was invalid");
        VoiceException.AuthFailureException = new VoiceException(20151, "Authentication Failed", "The Authentication with the provided JWT failed");
        VoiceException.InvalidTTLException = new VoiceException(20157, "Expiration Time Exceeds Maximum Time Allowed", "The expiration time provided when creating the JWT exceeds the maximum duration allowed");
        VoiceException.InvalidTokenException = new VoiceException(20403, "403 Forbidden", "The account lacks permission to access the Twilio API. Typically this means the account has been suspended or closed. For assistance, please contact support");
        VoiceException.AccessTokenRejectedException = new VoiceException(51007, "Token authentication is rejected by authentication service", "The authentication service has rejected the provided Access Token. To check whether the Access Token is structurally correct, you can use the tools available at https://jwt.io. For the details of Twilio\'s specific Access Token implementation including the grant format, check https://www.twilio.com/docs/iam/access-tokens");
        VoiceException.BadRequestException = new VoiceException(31400, "Bad Request", "The request could not be understood due to malformed syntax.");
        VoiceException.ForbiddenException = new VoiceException(31403, "Forbidden", "The server understood the request, but is refusing to fulfill it.");
        VoiceException.NotFoundException = new VoiceException(31404, "Not Found", "The server has not found anything matching the request.");
        VoiceException.RequestTimeoutException = new VoiceException(0x7AB0, "Request Timeout", "A request timeout occurred.");
        VoiceException.InternalServerErrorException = new VoiceException(31500, "Internal Server Error", "The server could not fulfill the request due to some unexpected condition.");
        VoiceException.BadGatewayException = new VoiceException(0x7B0E, "Bad Gateway", "The server is acting as a gateway or proxy, and received an invalid response from a downstream server while attempting to fulfill the request.");
        VoiceException.ServiceUnavailableException = new VoiceException(0x7B0F, "Service Unavailable", "The server is currently unable to handle the request due to a temporary overloading or maintenance of the server.");
        VoiceException.GatewayTimeoutException = new VoiceException(0x7B10, "Gateway Timeout", "The server, while acting as a gateway or proxy, did not receive a timely response from an upstream server.");
    }

    public VoiceException(int v, String s, String s1) {
        this.errorCode = v;
        this.errorMessage = s;
        this.explanation = s1;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getExplanation() {
        return this.explanation;
    }

    @Override
    public String getMessage() {
        return this.errorMessage;
    }
}

