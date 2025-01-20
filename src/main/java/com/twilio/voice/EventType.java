package com.twilio.voice;

final class EventType {
    static final String ACCEPTED_BY_LOCAL_EVENT = "accepted-by-local";
    static final String ACCEPTED_BY_REMOTE = "accepted-by-remote";
    static final String CALL_METRIC_EVENT = "metrics-sample";
    static final String CANCEL_EVENT = "cancel";
    public static final String CODEC_EVENT = "codec";
    static final String CONNECTED_EVENT = "connected";
    static final String DISCONNECTED_BY_LOCAL_EVENT = "disconnected-by-local";
    static final String DISCONNECTED_BY_REMOTE_EVENT = "disconnected-by-remote";
    static final String DISCONNECT_CALLED_EVENT = "disconnect-called";
    public static final String EDGE_EVENT = "edge";
    static final String ERROR_EVENT = "error";
    static final String FEEDBACK_RECEIVED_EVENT = "received";
    static final String FEEDBACK_RECEIVED_NONE_EVENT = "received-none";
    public static final String ICE_CANDIDATE_EVENT = "ice-candidate";
    static final String ICE_CONNECTION_CHECKING_EVENT = "checking";
    static final String ICE_CONNECTION_CLOSED_EVENT = "closed";
    static final String ICE_CONNECTION_COMPLETED_EVENT = "completed";
    static final String ICE_CONNECTION_CONNECTED_EVENT = "connected";
    static final String ICE_CONNECTION_FAILED_EVENT = "failed";
    static final String ICE_GATHERING_COMPLETE = "complete";
    static final String ICE_GATHERING_EVENT = "gathering";
    static final String INCOMING_EVENT = "incoming";
    static final String LISTENING_ERROR_EVENT = "listening-error";
    static final String LISTENING_EVENT = "listening";
    static final String LISTEN_EVENT = "listen";
    static final String OUTGOING_EVENT = "outgoing";
    static final String PC_CONNECTION_STATE_CLOSED_EVENT = "closed";
    static final String PC_CONNECTION_STATE_CONNECTED_EVENT = "connected";
    static final String PC_CONNECTION_STATE_CONNECTING_EVENT = "connecting";
    static final String PC_CONNECTION_STATE_DISCONNECTED_EVENT = "disconnected";
    static final String PC_CONNECTION_STATE_FAILED_EVENT = "failed";
    static final String PC_CONNECTION_STATE_NEW_EVENT = "new";
    static final String REGISTRATION_ERROR_EVENT = "registration-error";
    static final String REGISTRATION_EVENT = "registration";
    static final String REJECTED_BY_LOCAL = "rejected-by-local";
    static final String RINGING_EVENT = "ringing";
    public static final String SELECTED_ICE_CANDIDATE_PAIR_EVENT = "selected-ice-candidate-pair";
    static final String SIGNALING_STATE_CLOSED_EVENT = "closed";
    static final String SIGNALING_STATE_HAVE_LOCAL_OFFER_EVENT = "have-local-offer";
    static final String SIGNALING_STATE_STABLE_EVENT = "stable";
    static final String UNREGISTRATION_ERROR_EVENT = "unregistration-error";
    static final String UNREGISTRATION_EVENT = "unregistration";
    static final String UNREGISTRATION_REGISTRATION_ERROR_EVENT = "unregistration-registration-error";
    static final String UNSUPPORTED_CANCEL_MESSAGE_ERROR_EVENT = "unsupported-cancel-message-error";

}

