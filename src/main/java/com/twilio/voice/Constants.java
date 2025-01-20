package com.twilio.voice;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

abstract class Constants {
    public static enum Direction {
        INCOMING,
        OUTGOING;

    }

    public static enum SeverityLevel {
        INFO,
        DEBUG,
        WARNING,
        ERROR;

    }

    public static final String APP_JSON_PAYLOADTYPE = "application/json";
    public static int CALL_SID_LENGTH = 34;
    public static final String CLIENT_SDK_PRODUCT_NAME = "twilio-voice-android";
    private static final String DEFAULT_NOTIFICATION_SERVICE_HOST_URL = "https://ers.twilio.com";
    public static String EDGE_ROAMING = "roaming";
    public static String GLOBAL_LOW_LATENCY_REGION = "gll";
    private static final String KEY_KIBANA_EVENT_GATEWAY_HOST_URL = "kibana-event-gateway-host";
    private static final String KEY_KIBANA_METRICS_HOST_URL = "kibana-metrics-host";
    private static final String KEY_NOTIFICATION_SERVICE_HOST = "notification-service";
    public static final String PLATFORM_ANDROID = "android";
    private static final String TWILIO_DEFAULT_KIBANA_EVENT_GATEWAY_HOST_URL = "https://eventgw.twilio.com/v4/EndpointEvents";
    private static final String TWILIO_DEFAULT_KIBANA_METRICS_HOST_URL = "https://eventgw.twilio.com/v4/EndpointMetrics";
    static final String TWILIO_REQUEST_HEADER = "X-Twilio-Request-Id";
    static final String TWILIO_REQUEST_SID_PREFIX = "RQ";
    public static final boolean dev = true;
    private static Map params;

    static {
        Constants.params = new HashMap();
    }

    // Deobfuscation rating: LOW(20)
    public static final String getKeyKibanaEventGatewayHostUrl() {
        return Constants.params.containsKey("kibana-event-gateway-host") ? ((String)Constants.params.get("kibana-event-gateway-host")) : "https://eventgw.twilio.com/v4/EndpointEvents";
    }

    // Deobfuscation rating: LOW(20)
    public static final String getKeyKibanaMetricsHostUrl() {
        return Constants.params.containsKey("kibana-metrics-host") ? ((String)Constants.params.get("kibana-metrics-host")) : "https://eventgw.twilio.com/v4/EndpointMetrics";
    }

    // Deobfuscation rating: LOW(20)
    public static final String getNotificationServiceUrl() {
        return Constants.params.containsKey("notification-service") ? ((String)Constants.params.get("notification-service")) : "https://ers.twilio.com";
    }

    private static final void setDevParams(Map map0) {
        Constants.params = Collections.unmodifiableMap(map0);
    }
}

