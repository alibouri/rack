package com.twilio.voice;

import android.annotation.SuppressLint;
import android.content.Context;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import org.json.JSONObject;

class Event extends EventMetadata {
    public static class Builder {
        private String eventName;
        private String groupName;
        private SeverityLevel level;
        private JSONObject payload;
        private String payloadType;
        private String productName;
        private String timeStamp;
        private long timestampMS;

        @SuppressLint({"SimpleDateFormat"})
        public Builder() {
            TimeZone timeZone0 = TimeZone.getTimeZone("UTC");
            SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat("yyyy-MM-dd\'T\'HH:mm:ss.SSS\'Z\'");
            simpleDateFormat0.setTimeZone(timeZone0);
            Date date0 = new Date();
            this.timeStamp = simpleDateFormat0.format(date0);
            this.timestampMS = date0.getTime();
        }

        public static String a(Builder event$Builder0) {
            return event$Builder0.eventName;
        }

        public static String b(Builder event$Builder0) {
            return event$Builder0.groupName;
        }

        public Event build() {
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
            return new Event(this, 0);
        }

        public static SeverityLevel c(Builder event$Builder0) {
            return event$Builder0.level;
        }

        public static JSONObject d(Builder event$Builder0) {
            return event$Builder0.payload;
        }

        public static String e(Builder event$Builder0) {
            return event$Builder0.payloadType;
        }

        public Builder eventName(String s) {
            this.eventName = s;
            return this;
        }

        public static String f(Builder event$Builder0) {
            return event$Builder0.productName;
        }

        public static String g(Builder event$Builder0) {
            return event$Builder0.timeStamp;
        }

        public Builder groupName(String s) {
            this.groupName = s;
            return this;
        }

        public static long h(Builder event$Builder0) {
            return event$Builder0.timestampMS;
        }

        public Builder level(SeverityLevel constants$SeverityLevel0) {
            this.level = constants$SeverityLevel0;
            return this;
        }

        public Builder payLoad(JSONObject jSONObject0) {
            this.payload = jSONObject0;
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

    private JSONObject payload;

    private Event(Builder event$Builder0) {
        this.productName = Builder.f(event$Builder0);
        this.level = Builder.c(event$Builder0);
        this.groupName = Builder.b(event$Builder0);
        this.eventName = Builder.a(event$Builder0);
        this.payload = Builder.d(event$Builder0);
        this.payloadType = Builder.e(event$Builder0);
        this.timeStamp = Builder.g(event$Builder0);
        this.timestampMS = Builder.h(event$Builder0);
    }

    public Event(Builder event$Builder0, int v) {
        this(event$Builder0);
    }

    public JSONObject getPayload() {
        return this.payload;
    }

    @SuppressLint({"SimpleDateFormat"})
    public JSONObject toJSONObject(Context context0) {
        TimeZone timeZone0 = TimeZone.getTimeZone("UTC");
        SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat("yyyy-MM-dd\'T\'HH:mm:ss.SSS\'Z\'");
        simpleDateFormat0.setTimeZone(timeZone0);
        this.timeStamp = simpleDateFormat0.format(new Date());
        JSONObject jSONObject0 = this.jsonEnvelopePreparation(this.productName, this.eventName, this.groupName);
        jSONObject0.put("publisher_metadata", this.jsonPublisherMetadataPreparation(context0));
        jSONObject0.put("payload_type", this.payloadType);
        jSONObject0.put("payload", this.payload);
        return jSONObject0;
    }
}

