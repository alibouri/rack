package com.twilio.voice;

import android.annotation.SuppressLint;
import android.util.Pair;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import org.json.JSONObject;

class EventPayload {
    static class Builder {
        private String callSid;
        private String candidateType;
        private String clientName;
        private String codecParams;
        private Boolean deleted;
        private Direction direction;
        private Long errorCode;
        private String errorMessage;
        private String gateway;
        private String ip;
        private Boolean isRemote;
        private String issue;
        private Long lastDataReceivedMs;
        private String level;
        private JSONObject localCandidate;
        private String messageSid;
        private String name;
        private Long networkCost;
        private Long networkId;
        private String networkType;
        private JSONObject payload;
        private String payloadType;
        private Long port;
        private Long priority;
        private String productName;
        private String protocol;
        private String qualityParam;
        private int qualityScore;
        private Pair qualityThresholdValuePair;
        private String reason;
        private String region;
        private String relatedAddress;
        private Long relatedPort;
        private JSONObject remoteCandidate;
        private String requestId;
        private String selectedCodec;
        private String selectedRegion;
        private String tcpType;
        private String tempCallSid;
        private String timeStamp;
        private long timestampMS;
        private String transportId;
        private String url;
        private String value;
        private String values;

        @SuppressLint({"SimpleDateFormat"})
        public Builder() {
            TimeZone timeZone0 = TimeZone.getTimeZone("UTC");
            SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat("yyyy-MM-dd\'T\'HH:mm:ss.SSS\'Z\'");
            simpleDateFormat0.setTimeZone(timeZone0);
            Date date0 = new Date();
            this.timeStamp = simpleDateFormat0.format(date0);
            this.timestampMS = date0.getTime();
        }

        public static int A(Builder eventPayload$Builder0) {
            return eventPayload$Builder0.qualityScore;
        }

        public static Pair B(Builder eventPayload$Builder0) {
            return eventPayload$Builder0.qualityThresholdValuePair;
        }

        public static String C(Builder eventPayload$Builder0) {
            return eventPayload$Builder0.reason;
        }

        public static String D(Builder eventPayload$Builder0) {
            return eventPayload$Builder0.region;
        }

        public static String E(Builder eventPayload$Builder0) {
            return eventPayload$Builder0.relatedAddress;
        }

        public static Long F(Builder eventPayload$Builder0) {
            return eventPayload$Builder0.relatedPort;
        }

        public static JSONObject G(Builder eventPayload$Builder0) {
            return eventPayload$Builder0.remoteCandidate;
        }

        public static String H(Builder eventPayload$Builder0) {
            return eventPayload$Builder0.requestId;
        }

        public static String I(Builder eventPayload$Builder0) {
            return eventPayload$Builder0.selectedCodec;
        }

        public static String J(Builder eventPayload$Builder0) {
            return eventPayload$Builder0.selectedRegion;
        }

        public static String K(Builder eventPayload$Builder0) {
            return eventPayload$Builder0.tcpType;
        }

        public static String L(Builder eventPayload$Builder0) {
            return eventPayload$Builder0.tempCallSid;
        }

        public static String M(Builder eventPayload$Builder0) {
            return eventPayload$Builder0.timeStamp;
        }

        public static long N(Builder eventPayload$Builder0) {
            return eventPayload$Builder0.timestampMS;
        }

        public static String O(Builder eventPayload$Builder0) {
            return eventPayload$Builder0.transportId;
        }

        public static String P(Builder eventPayload$Builder0) {
            return eventPayload$Builder0.url;
        }

        public static String Q(Builder eventPayload$Builder0) {
            return eventPayload$Builder0.value;
        }

        public static String R(Builder eventPayload$Builder0) {
            return eventPayload$Builder0.values;
        }

        public static String a(Builder eventPayload$Builder0) {
            return eventPayload$Builder0.callSid;
        }

        public static String b(Builder eventPayload$Builder0) {
            return eventPayload$Builder0.candidateType;
        }

        public EventPayload build() {
            if(this.productName == null) {
                throw new NullPointerException("productName must not be null");
            }
            if(this.payloadType == null) {
                throw new NullPointerException("payloadType must not be null");
            }
            return new EventPayload(this, 0);
        }

        public static String c(Builder eventPayload$Builder0) {
            return eventPayload$Builder0.clientName;
        }

        public Builder callSid(String s) {
            this.callSid = s;
            return this;
        }

        public Builder candidateType(String s) {
            this.candidateType = s;
            return this;
        }

        public Builder clientName(String s) {
            this.clientName = s;
            return this;
        }

        public Builder codecParams(String s) {
            this.codecParams = s;
            return this;
        }

        public static String d(Builder eventPayload$Builder0) {
            return eventPayload$Builder0.codecParams;
        }

        public Builder deleted(Boolean boolean0) {
            this.deleted = boolean0;
            return this;
        }

        public Builder direction(Direction constants$Direction0) {
            this.direction = constants$Direction0;
            return this;
        }

        public static Boolean e(Builder eventPayload$Builder0) {
            return eventPayload$Builder0.deleted;
        }

        public Builder errorCode(Long long0) {
            this.errorCode = long0;
            return this;
        }

        public Builder errorMessage(String s) {
            this.errorMessage = s;
            return this;
        }

        public static Direction f(Builder eventPayload$Builder0) {
            return eventPayload$Builder0.direction;
        }

        public static Long g(Builder eventPayload$Builder0) {
            return eventPayload$Builder0.errorCode;
        }

        public Builder gateway(String s) {
            this.gateway = s;
            return this;
        }

        public static String h(Builder eventPayload$Builder0) {
            return eventPayload$Builder0.errorMessage;
        }

        public static String i(Builder eventPayload$Builder0) {
            return eventPayload$Builder0.gateway;
        }

        public Builder ip(String s) {
            this.ip = s;
            return this;
        }

        public Builder isRemote(Boolean boolean0) {
            this.isRemote = boolean0;
            return this;
        }

        public Builder issue(Issue call$Issue0) {
            if(call$Issue0 != null) {
                this.issue = call$Issue0.toString();
            }
            return this;
        }

        public static String j(Builder eventPayload$Builder0) {
            return eventPayload$Builder0.ip;
        }

        public static Boolean k(Builder eventPayload$Builder0) {
            return eventPayload$Builder0.isRemote;
        }

        public static String l(Builder eventPayload$Builder0) {
            return eventPayload$Builder0.issue;
        }

        public Builder lastDataReceivedMs(Long long0) {
            this.lastDataReceivedMs = long0;
            return this;
        }

        public Builder level(String s) {
            this.level = s;
            return this;
        }

        public Builder localCandidate(JSONObject jSONObject0) {
            this.localCandidate = jSONObject0;
            return this;
        }

        public static Long m(Builder eventPayload$Builder0) {
            return eventPayload$Builder0.lastDataReceivedMs;
        }

        public Builder messageSid(String s) {
            this.messageSid = s;
            return this;
        }

        public static String n(Builder eventPayload$Builder0) {
            return eventPayload$Builder0.level;
        }

        public Builder name(String s) {
            this.name = s;
            return this;
        }

        public Builder networkCost(Long long0) {
            this.networkCost = long0;
            return this;
        }

        public Builder networkId(Long long0) {
            this.networkId = long0;
            return this;
        }

        public Builder networkType(String s) {
            this.networkType = s;
            return this;
        }

        public static JSONObject o(Builder eventPayload$Builder0) {
            return eventPayload$Builder0.localCandidate;
        }

        public static String p(Builder eventPayload$Builder0) {
            return eventPayload$Builder0.messageSid;
        }

        public Builder payLoadType(String s) {
            this.payloadType = s;
            return this;
        }

        public Builder port(Long long0) {
            this.port = long0;
            return this;
        }

        public Builder priority(Long long0) {
            this.priority = long0;
            return this;
        }

        public Builder productName(String s) {
            this.productName = s;
            return this;
        }

        public Builder protocol(String s) {
            this.protocol = s;
            return this;
        }

        public static String q(Builder eventPayload$Builder0) {
            return eventPayload$Builder0.name;
        }

        public Builder qualityThresholdValuePair(Pair pair0) {
            this.qualityThresholdValuePair = pair0;
            return this;
        }

        public static Long r(Builder eventPayload$Builder0) {
            return eventPayload$Builder0.networkCost;
        }

        public Builder reason(String s) {
            this.reason = s;
            return this;
        }

        public Builder region(String s) {
            this.region = s;
            return this;
        }

        public Builder relatedAddress(String s) {
            this.relatedAddress = s;
            return this;
        }

        public Builder relatedPort(Long long0) {
            this.relatedPort = long0;
            return this;
        }

        public Builder remoteCandidate(JSONObject jSONObject0) {
            this.remoteCandidate = jSONObject0;
            return this;
        }

        public Builder requestId(String s) {
            this.requestId = s;
            return this;
        }

        public static Long s(Builder eventPayload$Builder0) {
            return eventPayload$Builder0.networkId;
        }

        public Builder score(Score call$Score0) {
            if(call$Score0 != null) {
                this.qualityScore = call$Score0.getValue();
            }
            return this;
        }

        public Builder selectedCodec(String s) {
            this.selectedCodec = s;
            return this;
        }

        public Builder selectedRegion(String s) {
            this.selectedRegion = s;
            return this;
        }

        public static String t(Builder eventPayload$Builder0) {
            return eventPayload$Builder0.networkType;
        }

        public Builder tcpType(String s) {
            this.tcpType = s;
            return this;
        }

        public Builder tempCallSid(String s) {
            this.tempCallSid = s;
            return this;
        }

        public Builder transportId(String s) {
            this.transportId = s;
            return this;
        }

        public static JSONObject u(Builder eventPayload$Builder0) {
            return eventPayload$Builder0.payload;
        }

        public Builder url(String s) {
            this.url = s;
            return this;
        }

        public static String v(Builder eventPayload$Builder0) {
            return eventPayload$Builder0.payloadType;
        }

        public Builder value(String s) {
            this.value = s;
            return this;
        }

        public Builder values(String s) {
            this.values = s;
            return this;
        }

        public static Long w(Builder eventPayload$Builder0) {
            return eventPayload$Builder0.port;
        }

        public static Long x(Builder eventPayload$Builder0) {
            return eventPayload$Builder0.priority;
        }

        public static String y(Builder eventPayload$Builder0) {
            return eventPayload$Builder0.productName;
        }

        public static String z(Builder eventPayload$Builder0) {
            return eventPayload$Builder0.protocol;
        }
    }

    private String callSid;
    private String candidateType;
    private String clientName;
    private String codecParams;
    private Boolean deleted;
    private Direction direction;
    private Long errorCode;
    private String errorMessage;
    private String gateway;
    private String ip;
    boolean isPrivate;
    private Boolean isRemote;
    private String issueName;
    private Long lastDataReceivedMs;
    private String level;
    private JSONObject localCandidate;
    private String messageSid;
    private String name;
    private Long networkCost;
    private Long networkId;
    private String networkType;
    private JSONObject payload;
    private String payloadType;
    private Long port;
    private Long priority;
    private String productName;
    private String protocol;
    private int qualityScore;
    private Pair qualityThresholdValuePair;
    private String reason;
    private String region;
    private String relatedAddress;
    private Long relatedPort;
    private JSONObject remoteCandidate;
    private String requestId;
    private String selectedCodec;
    private String selectedRegion;
    private String tcpType;
    private String tempCallSid;
    private String timeStamp;
    private long timestampMS;
    private String transportId;
    private String url;
    private String value;
    private String values;

    private EventPayload(Builder eventPayload$Builder0) {
        this.isPrivate = false;
        this.productName = Builder.y(eventPayload$Builder0);
        this.payload = Builder.u(eventPayload$Builder0);
        this.payloadType = Builder.v(eventPayload$Builder0);
        this.timeStamp = Builder.M(eventPayload$Builder0);
        this.timestampMS = Builder.N(eventPayload$Builder0);
        this.clientName = Builder.c(eventPayload$Builder0);
        this.direction = Builder.f(eventPayload$Builder0);
        this.callSid = Builder.a(eventPayload$Builder0);
        this.messageSid = Builder.p(eventPayload$Builder0);
        this.tempCallSid = Builder.L(eventPayload$Builder0);
        this.qualityScore = Builder.A(eventPayload$Builder0);
        this.issueName = Builder.l(eventPayload$Builder0);
        this.errorCode = Builder.g(eventPayload$Builder0);
        this.errorMessage = Builder.h(eventPayload$Builder0);
        this.requestId = Builder.H(eventPayload$Builder0);
        this.selectedRegion = Builder.J(eventPayload$Builder0);
        this.gateway = Builder.i(eventPayload$Builder0);
        this.region = Builder.D(eventPayload$Builder0);
        this.codecParams = Builder.d(eventPayload$Builder0);
        this.selectedCodec = Builder.I(eventPayload$Builder0);
        this.transportId = Builder.O(eventPayload$Builder0);
        this.isRemote = Builder.k(eventPayload$Builder0);
        this.ip = Builder.j(eventPayload$Builder0);
        this.port = Builder.w(eventPayload$Builder0);
        this.protocol = Builder.z(eventPayload$Builder0);
        this.candidateType = Builder.b(eventPayload$Builder0);
        this.priority = Builder.x(eventPayload$Builder0);
        this.url = Builder.P(eventPayload$Builder0);
        this.deleted = Builder.e(eventPayload$Builder0);
        this.networkCost = Builder.r(eventPayload$Builder0);
        this.values = Builder.R(eventPayload$Builder0);
        this.value = Builder.Q(eventPayload$Builder0);
        this.qualityThresholdValuePair = Builder.B(eventPayload$Builder0);
        this.networkId = Builder.s(eventPayload$Builder0);
        this.relatedPort = Builder.F(eventPayload$Builder0);
        this.level = Builder.n(eventPayload$Builder0);
        this.relatedAddress = Builder.E(eventPayload$Builder0);
        this.networkType = Builder.t(eventPayload$Builder0);
        this.name = Builder.q(eventPayload$Builder0);
        this.tcpType = Builder.K(eventPayload$Builder0);
        this.localCandidate = Builder.o(eventPayload$Builder0);
        this.remoteCandidate = Builder.G(eventPayload$Builder0);
        this.reason = Builder.C(eventPayload$Builder0);
        this.lastDataReceivedMs = Builder.m(eventPayload$Builder0);
    }

    public EventPayload(Builder eventPayload$Builder0, int v) {
        this(eventPayload$Builder0);
    }

    public static Object fromStringThreshold(Pair pair0) {
        Class class0 = Float.class;
        if(((Class)pair0.second).equals(class0)) {
            return class0.cast(Float.parseFloat(((String)pair0.first)));
        }
        return ((Class)pair0.second).equals(Long.class) ? Long.class.cast(Long.parseLong(((String)pair0.first))) : String.class.cast(pair0.first);
    }

    public String getCallSid() {
        return this.callSid;
    }

    public String getClientName() {
        return this.clientName;
    }

    public Direction getDirection() {
        return this.direction;
    }

    public String getIssueName() {
        return this.issueName;
    }

    public JSONObject getPayload() {
        this.jsonPayloadPreparation();
        return this.payload;
    }

    public Object getPayloadType() {
        return this.payloadType;
    }

    public String getProductName() {
        return this.productName;
    }

    public int getQualityScore() {
        return this.qualityScore;
    }

    public String getTempCallSid() {
        return this.tempCallSid;
    }

    public String getTimeStamp() {
        return this.timeStamp;
    }

    public long getTimestampMillis() {
        return this.timestampMS;
    }

    public boolean isPrivate() {
        return this.isPrivate;
    }

    public JSONObject jsonPayloadPreparation() {
        JSONObject jSONObject0 = new JSONObject();
        jSONObject0.put("timestamp_ms", this.timestampMS);
        jSONObject0.put("client_name", this.clientName);
        jSONObject0.put("temp_call_sid", this.tempCallSid);
        jSONObject0.put("call_sid", this.callSid);
        jSONObject0.put("message_sid", this.messageSid);
        jSONObject0.put("sdk_version", "6.1.2");
        jSONObject0.put("platform", "android");
        jSONObject0.put("direction", this.direction);
        jSONObject0.put("selected_region", this.selectedRegion);
        jSONObject0.put("gateway", this.gateway);
        jSONObject0.put("region", this.region);
        jSONObject0.put("codec_params", this.codecParams);
        jSONObject0.put("selected_codec", this.selectedCodec);
        jSONObject0.put("transport_id", this.transportId);
        jSONObject0.put("is_remote", this.isRemote);
        jSONObject0.put("ip", this.ip);
        jSONObject0.put("port", this.port);
        jSONObject0.put("protocol", this.protocol);
        jSONObject0.put("candidate_type", this.candidateType);
        jSONObject0.put("priority", this.priority);
        jSONObject0.put("url", this.url);
        jSONObject0.put("deleted", this.deleted);
        jSONObject0.put("network-cost", this.networkCost);
        jSONObject0.put("network-id", this.networkId);
        jSONObject0.put("related_port", this.relatedPort);
        jSONObject0.put("level", this.level);
        jSONObject0.put("related_address", this.relatedAddress);
        jSONObject0.put("network-type", this.networkType);
        jSONObject0.put("name", this.name);
        jSONObject0.put("tcp_type", this.tcpType);
        jSONObject0.put("local_candidate", this.localCandidate);
        jSONObject0.put("remote_candidate", this.remoteCandidate);
        jSONObject0.put("reason", this.reason);
        jSONObject0.put("last_data_received_ms", this.lastDataReceivedMs);
        if(this.errorCode != null && this.errorCode.compareTo(0L) > 0) {
            jSONObject0.put("code", this.errorCode);
            jSONObject0.put("message", this.errorMessage);
        }
        String s = this.requestId;
        if(s != null) {
            jSONObject0.put("request_sid", s);
        }
        JSONObject jSONObject1 = new JSONObject();
        if(this.values != null) {
            jSONObject1.put("threshold", EventPayload.fromStringThreshold(this.qualityThresholdValuePair));
            jSONObject1.put("values", this.values);
        }
        else if(this.value == null) {
            int v = this.qualityScore;
            if(v > 0) {
                jSONObject0.put("quality_score", v);
            }
            if(this.issueName != null && !this.issueName.equals(Issue.NOT_REPORTED.toString())) {
                jSONObject0.put("issue_name", this.issueName);
            }
            jSONObject1 = null;
        }
        else {
            jSONObject1.put("threshold", EventPayload.fromStringThreshold(this.qualityThresholdValuePair));
            jSONObject1.put("value", this.value);
        }
        jSONObject0.put("data", jSONObject1);
        this.payload = jSONObject0;
        return jSONObject0;
    }
}

