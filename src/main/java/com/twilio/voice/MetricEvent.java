package com.twilio.voice;

import android.annotation.SuppressLint;
import android.content.Context;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONObject;

class MetricEvent extends EventMetadata {
    static class Builder {
        private String callSid;
        private String eventName;
        private String groupName;
        private SeverityLevel level;
        private JSONArray payload;
        private String payloadType;
        private String productName;

        public static String a(Builder metricEvent$Builder0) {
            return metricEvent$Builder0.callSid;
        }

        public static String b(Builder metricEvent$Builder0) {
            return metricEvent$Builder0.eventName;
        }

        public MetricEvent build() {
            if(this.productName == null) {
                throw new NullPointerException("productName must not be null");
            }
            if(this.level == null) {
                throw new NullPointerException("level must not be null");
            }
            if(this.groupName == null) {
                throw new NullPointerException("groupName must not be null");
            }
            if(this.eventName == null) {
                throw new NullPointerException("eventName must not be null");
            }
            if(this.payloadType == null) {
                throw new NullPointerException("payloadType must not be null");
            }
            return new MetricEvent(this, 0);
        }

        public static String c(Builder metricEvent$Builder0) {
            return metricEvent$Builder0.groupName;
        }

        public static SeverityLevel d(Builder metricEvent$Builder0) {
            return metricEvent$Builder0.level;
        }

        public static JSONArray e(Builder metricEvent$Builder0) {
            return metricEvent$Builder0.payload;
        }

        public Builder eventName(String s) {
            this.eventName = s;
            return this;
        }

        public static String f(Builder metricEvent$Builder0) {
            return metricEvent$Builder0.payloadType;
        }

        public static String g(Builder metricEvent$Builder0) {
            return metricEvent$Builder0.productName;
        }

        public Builder groupName(String s) {
            this.groupName = s;
            return this;
        }

        public Builder level(SeverityLevel constants$SeverityLevel0) {
            this.level = constants$SeverityLevel0;
            return this;
        }

        public Builder payLoad(JSONArray jSONArray0) {
            this.payload = jSONArray0;
            return this;
        }

        public Builder payLoadType(String s) {
            this.payloadType = s;
            return this;
        }

        public Builder productName(String s) {
            this.productName = s;
            return this;
        }
    }

    private JSONArray payload;

    private MetricEvent(Builder metricEvent$Builder0) {
        this.productName = Builder.g(metricEvent$Builder0);
        this.level = Builder.d(metricEvent$Builder0);
        this.groupName = Builder.c(metricEvent$Builder0);
        this.eventName = Builder.b(metricEvent$Builder0);
        this.callSid = Builder.a(metricEvent$Builder0);
        this.payloadType = Builder.f(metricEvent$Builder0);
        this.payload = Builder.e(metricEvent$Builder0);
    }

    public MetricEvent(Builder metricEvent$Builder0, int v) {
        this(metricEvent$Builder0);
    }

    public void addStatsToPayload(JSONObject jSONObject0) {
        if(this.payload == null) {
            this.payload = new JSONArray();
        }
        this.payload.put(jSONObject0);
    }

    public JSONArray getPayload() {
        return this.payload;
    }

    public void setPayload(JSONArray jSONArray0) {
        this.payload = jSONArray0;
    }

    @SuppressLint({"SimpleDateFormat"})
    public JSONObject toJSONObject(Context context0) {
        TimeZone timeZone0 = TimeZone.getTimeZone("UTC");
        SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat("yyyy-MM-dd\'T\'HH:mm:ss.SSS\'Z\'");
        simpleDateFormat0.setTimeZone(timeZone0);
        this.timeStamp = simpleDateFormat0.format(new Date());
        JSONObject jSONObject0 = this.jsonEnvelopePreparation(this.productName, "metrics-sample", "quality-metrics-samples");
        jSONObject0.put("publisher_metadata", this.jsonPublisherMetadataPreparation(context0));
        jSONObject0.put("payload", this.payload);
        return jSONObject0;
    }
}

