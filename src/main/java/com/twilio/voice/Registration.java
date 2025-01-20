package com.twilio.voice;

import android.util.Log;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class Registration {
    class MessageTypes {
        private final String CALL_TYPE;

        private MessageTypes() {
            this.CALL_TYPE = "twilio.voice.call";
        }

        public MessageTypes(int v) {
        }

        public JSONArray toJson() {
            try {
                JSONArray jSONArray0 = new JSONArray();
                jSONArray0.put(0, "twilio.voice.call");
                return jSONArray0;
            }
            catch(JSONException jSONException0) {
                Log.e(this.getClass().getSimpleName(), jSONException0.toString());
                return null;
            }
        }
    }

    class RegistrationData {
        String registrationId;

        public RegistrationData(String s) {
            this.registrationId = s;
        }

        public JSONObject toJson() {
            try {
                JSONObject jSONObject0 = new JSONObject();
                jSONObject0.put("registration_id", this.registrationId);
                return jSONObject0;
            }
            catch(Exception exception0) {
                Log.e(this.getClass().getSimpleName(), exception0.toString());
                return null;
            }
        }
    }

    private static final String VERSION = "3";
    private final String channelType;
    private final RegistrationData data;
    private final MessageTypes messageTypes;
    private final String version;

    public Registration(String s, String s1) {
        this.channelType = s;
        this.messageTypes = new MessageTypes(this, 0);
        this.version = "3";
        this.data = new RegistrationData(this, s1);
    }

    public JSONObject toJson() {
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("channel_type", this.channelType);
            jSONObject0.put("message_types", this.messageTypes.toJson());
            jSONObject0.put("data", this.data.toJson());
            jSONObject0.put("version", this.version);
            return jSONObject0;
        }
        catch(Exception exception0) {
            Log.e(this.getClass().getSimpleName(), exception0.toString());
            return null;
        }
    }
}

