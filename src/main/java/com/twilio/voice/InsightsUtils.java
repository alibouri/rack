package com.twilio.voice;

import android.util.Pair;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class InsightsUtils {
    public static RTCStatsSample createRtcSample(Map map0) {
        RTCStatsSample rTCStatsSample0 = new RTCStatsSample();
        rTCStatsSample0.packetsReceived = (Long)InsightsUtils.fromString(((Pair)map0.get("packets_received")), Long.class);
        rTCStatsSample0.totalPacketsLost = (Long)InsightsUtils.fromString(((Pair)map0.get("total_packets_lost")), Long.class);
        rTCStatsSample0.fractionLost = (float)(((Float)InsightsUtils.fromString(((Pair)map0.get("packets_lost_fraction")), Float.class)));
        rTCStatsSample0.packetsLost = (Long)InsightsUtils.fromString(((Pair)map0.get("packets_lost")), Long.class);
        rTCStatsSample0.totalPacketsSent = (Long)InsightsUtils.fromString(((Pair)map0.get("total_packets_sent")), Long.class);
        rTCStatsSample0.totalPacketsReceived = (Long)InsightsUtils.fromString(((Pair)map0.get("total_packets_received")), Long.class);
        rTCStatsSample0.totalBytesReceived = (Long)InsightsUtils.fromString(((Pair)map0.get("total_bytes_received")), Long.class);
        rTCStatsSample0.totalBytesSent = (Long)InsightsUtils.fromString(((Pair)map0.get("total_bytes_sent")), Long.class);
        rTCStatsSample0.jitter = (Long)InsightsUtils.fromString(((Pair)map0.get("jitter")), Long.class);
        rTCStatsSample0.rtt = (Long)InsightsUtils.fromString(((Pair)map0.get("rtt")), Long.class);
        rTCStatsSample0.audioInputLevel = (Long)InsightsUtils.fromString(((Pair)map0.get("audio_level_in")), Long.class);
        rTCStatsSample0.audioOutputLevel = (Long)InsightsUtils.fromString(((Pair)map0.get("audio_level_out")), Long.class);
        rTCStatsSample0.mos = (float)(((Float)InsightsUtils.fromString(((Pair)map0.get("mos")), Float.class)));
        rTCStatsSample0.codec = (String)InsightsUtils.fromString(((Pair)map0.get("audio_codec")), String.class);
        rTCStatsSample0.timestampMS = (String)InsightsUtils.fromString(((Pair)map0.get("timestamp_ms")), String.class);
        TimeZone timeZone0 = TimeZone.getTimeZone("UTC");
        SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat("yyyy-MM-dd\'T\'HH:mm:ss.SSS\'Z\'");
        simpleDateFormat0.setTimeZone(timeZone0);
        rTCStatsSample0.timeStamp = simpleDateFormat0.format(new Date(Double.valueOf(rTCStatsSample0.timestampMS).longValue()));
        return rTCStatsSample0;
    }

    public static EventPayload createWarningEventPayload(Map map0, Builder eventPayload$Builder0) {
        String s = (String)InsightsUtils.fromString(((Pair)map0.get("group")), String.class);
        String s1 = (String)InsightsUtils.fromString(((Pair)map0.get("values")), String.class);
        Pair pair0 = (Pair)map0.get("threshold");
        return s.equals("audio-level-warning-raised") ? eventPayload$Builder0.value(s1).qualityThresholdValuePair(pair0).payLoadType("application/json").build() : eventPayload$Builder0.values(s1).qualityThresholdValuePair(pair0).payLoadType("application/json").build();
    }

    public static Object fromString(Pair pair0, Class class0) {
        if(((Class)pair0.second).equals(Boolean.class)) {
            return class0.cast(Boolean.valueOf(Boolean.parseBoolean(((String)pair0.first))));
        }
        if(((Class)pair0.second).equals(Float.class)) {
            return class0.cast(Float.parseFloat(((String)pair0.first)));
        }
        if(((Class)pair0.second).equals(Long.class)) {
            return class0.cast(Long.parseLong(((String)pair0.first)));
        }
        if(((Class)pair0.second).equals(JSONObject.class)) {
            try {
                return class0.cast(new JSONObject(((String)pair0.first)));
            }
            catch(JSONException jSONException0) {
                jSONException0.printStackTrace();
                return class0.cast(null);
            }
        }
        return class0.cast(pair0.first);
    }

    public static void processEvent(Map map0, Builder eventPayload$Builder0, EventPublisher eventPublisher0, Direction constants$Direction0) {
        Pair pair0 = (Pair)map0.get("group");
        Class class0 = String.class;
        if(((String)InsightsUtils.fromString(pair0, class0)).equals("ice-candidate")) {
            if(((String)InsightsUtils.fromString(((Pair)map0.get("name")), class0)).equals("ice-candidate")) {
                InsightsUtils.publishIceCandidateEvent(map0, eventPayload$Builder0, eventPublisher0, constants$Direction0);
                return;
            }
            if(((String)InsightsUtils.fromString(((Pair)map0.get("name")), class0)).equals("selected-ice-candidate-pair")) {
                InsightsUtils.publishSelectedIceCandidateEvent(map0, eventPayload$Builder0, eventPublisher0, constants$Direction0);
            }
        }
        else {
            if(!((String)InsightsUtils.fromString(((Pair)map0.get("name")), class0)).equals("error") && !((String)InsightsUtils.fromString(((Pair)map0.get("name")), class0)).equals("listening-error") && !((String)InsightsUtils.fromString(((Pair)map0.get("name")), class0)).equals("unsupported-cancel-message-error")) {
                InsightsUtils.publishEvent(map0, eventPayload$Builder0, eventPublisher0);
                return;
            }
            if(map0.get("error_code") != null) {
                InsightsUtils.publishConnectionErrorEvent(map0, eventPayload$Builder0, eventPublisher0);
            }
        }
    }

    public static void processWarningEvent(Map map0, Builder eventPayload$Builder0, EventPublisher eventPublisher0) {
        String s = (String)InsightsUtils.fromString(((Pair)map0.get("name")), String.class);
        SeverityLevel constants$SeverityLevel0 = SeverityLevel.valueOf(((String)InsightsUtils.fromString(((Pair)map0.get("level")), String.class)));
        String s1 = (String)InsightsUtils.fromString(((Pair)map0.get("group")), String.class);
        InsightsUtils.publish(InsightsUtils.createWarningEventPayload(map0, eventPayload$Builder0), constants$SeverityLevel0, s1, s, eventPublisher0);
    }

    private static void publish(EventPayload eventPayload0, SeverityLevel constants$SeverityLevel0, String s, String s1, EventPublisher eventPublisher0) {
        try {
            JSONObject jSONObject0 = eventPayload0.getPayload();
            if(eventPublisher0 != null) {
                eventPublisher0.publish(constants$SeverityLevel0, s, s1, eventPublisher0.createEvent(constants$SeverityLevel0, s, s1, jSONObject0));
            }
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
        }
    }

    private static void publishConnectionErrorEvent(Map map0, Builder eventPayload$Builder0, EventPublisher eventPublisher0) {
        String s = (String)InsightsUtils.fromString(((Pair)map0.get("name")), String.class);
        SeverityLevel constants$SeverityLevel0 = SeverityLevel.valueOf(((String)InsightsUtils.fromString(((Pair)map0.get("level")), String.class)));
        String s1 = (String)InsightsUtils.fromString(((Pair)map0.get("group")), String.class);
        InsightsUtils.publish(eventPayload$Builder0.errorCode(((Long)InsightsUtils.fromString(((Pair)map0.get("error_code")), Long.class))).errorMessage(((String)InsightsUtils.fromString(((Pair)map0.get("error_message")), String.class)) + " : " + ((String)InsightsUtils.fromString(((Pair)map0.get("error_explanation")), String.class))).build(), constants$SeverityLevel0, s1, s, eventPublisher0);
    }

    private static void publishEvent(Map map0, Builder eventPayload$Builder0, EventPublisher eventPublisher0) {
        String s = (String)InsightsUtils.fromString(((Pair)map0.get("name")), String.class);
        SeverityLevel constants$SeverityLevel0 = SeverityLevel.valueOf(((String)InsightsUtils.fromString(((Pair)map0.get("level")), String.class)));
        String s1 = (String)InsightsUtils.fromString(((Pair)map0.get("group")), String.class);
        InsightsUtils.publish(eventPayload$Builder0.build(), constants$SeverityLevel0, s1, s, eventPublisher0);
    }

    private static void publishIceCandidateEvent(Map map0, Builder eventPayload$Builder0, EventPublisher eventPublisher0, Direction constants$Direction0) {
        String s = (String)InsightsUtils.fromString(((Pair)map0.get("name")), String.class);
        SeverityLevel constants$SeverityLevel0 = SeverityLevel.valueOf(((String)InsightsUtils.fromString(((Pair)map0.get("level")), String.class)));
        String s1 = (String)InsightsUtils.fromString(((Pair)map0.get("group")), String.class);
        InsightsUtils.publish(eventPayload$Builder0.transportId(((String)InsightsUtils.fromString(((Pair)map0.get("transport_id")), String.class))).isRemote(((Boolean)InsightsUtils.fromString(((Pair)map0.get("is_remote")), Boolean.class))).ip(((String)InsightsUtils.fromString(((Pair)map0.get("ip")), String.class))).port(((Long)InsightsUtils.fromString(((Pair)map0.get("port")), Long.class))).protocol(((String)InsightsUtils.fromString(((Pair)map0.get("protocol")), String.class))).candidateType(((String)InsightsUtils.fromString(((Pair)map0.get("candidate_type")), String.class))).priority(((Long)InsightsUtils.fromString(((Pair)map0.get("priority")), Long.class))).url(((String)InsightsUtils.fromString(((Pair)map0.get("url")), String.class))).deleted(((Boolean)InsightsUtils.fromString(((Pair)map0.get("deleted")), Boolean.class))).networkCost(((Long)InsightsUtils.fromString(((Pair)map0.get("network-cost")), Long.class))).networkId(((Long)InsightsUtils.fromString(((Pair)map0.get("network-id")), Long.class))).relatedPort(((Long)InsightsUtils.fromString(((Pair)map0.get("related_port")), Long.class))).level(((String)InsightsUtils.fromString(((Pair)map0.get("level")), String.class))).relatedAddress(((String)InsightsUtils.fromString(((Pair)map0.get("related_address")), String.class))).name(((String)InsightsUtils.fromString(((Pair)map0.get("name")), String.class))).tcpType(((String)InsightsUtils.fromString(((Pair)map0.get("tcp_type")), String.class))).networkType(((String)InsightsUtils.fromString(((Pair)map0.get("network-type")), String.class))).direction(constants$Direction0).build(), constants$SeverityLevel0, s1, s, eventPublisher0);
    }

    public static JSONArray publishMetrics(RTCStatsSample rTCStatsSample0, int v, String s, Direction constants$Direction0, JSONArray jSONArray0, EventPublisher eventPublisher0) {
        if(v % 4 == 0) {
            rTCStatsSample0.setCallSid(s);
            rTCStatsSample0.setDirection(constants$Direction0);
            if(jSONArray0 == null) {
                jSONArray0 = new JSONArray();
            }
            jSONArray0.put(rTCStatsSample0.toJson());
            if(jSONArray0.length() == 2) {
                if(eventPublisher0 != null) {
                    try {
                        eventPublisher0.publishMetrics(eventPublisher0.createMetricEvent("quality-metrics-samples", "metrics-sample", jSONArray0));
                        return new JSONArray();
                    }
                    catch(Exception exception0) {
                        exception0.printStackTrace();
                        return new JSONArray();
                    }
                }
                return new JSONArray();
            }
        }
        return jSONArray0;
    }

    private static void publishSelectedIceCandidateEvent(Map map0, Builder eventPayload$Builder0, EventPublisher eventPublisher0, Direction constants$Direction0) {
        String s = (String)InsightsUtils.fromString(((Pair)map0.get("name")), String.class);
        SeverityLevel constants$SeverityLevel0 = SeverityLevel.valueOf(((String)InsightsUtils.fromString(((Pair)map0.get("level")), String.class)));
        String s1 = (String)InsightsUtils.fromString(((Pair)map0.get("group")), String.class);
        InsightsUtils.publish(eventPayload$Builder0.reason(((String)InsightsUtils.fromString(((Pair)map0.get("reason")), String.class))).lastDataReceivedMs(((Long)InsightsUtils.fromString(((Pair)map0.get("last_data_received_ms")), Long.class))).level(((String)InsightsUtils.fromString(((Pair)map0.get("level")), String.class))).name(((String)InsightsUtils.fromString(((Pair)map0.get("name")), String.class))).localCandidate(((JSONObject)InsightsUtils.fromString(((Pair)map0.get("local_candidate")), JSONObject.class))).remoteCandidate(((JSONObject)InsightsUtils.fromString(((Pair)map0.get("remote_candidate")), JSONObject.class))).build(), constants$SeverityLevel0, s1, s, eventPublisher0);
    }
}

