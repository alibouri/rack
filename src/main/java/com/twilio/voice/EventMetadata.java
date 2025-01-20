package com.twilio.voice;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import android.os.Build;
import org.json.JSONObject;

class EventMetadata {
    String callSid;
    String eventName;
    String groupName;
    boolean isPrivate;
    SeverityLevel level;
    String payloadType;
    String productName;
    String timeStamp;
    long timestampMS;

    public EventMetadata() {
        this.isPrivate = false;
    }

    public String getCallSid() {
        return this.callSid;
    }

    public String getEventName() {
        return this.eventName;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public SeverityLevel getLevel() {
        return this.level;
    }

    public Object getPayloadType() {
        return this.payloadType;
    }

    public String getProductName() {
        return this.productName;
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

    public JSONObject jsonEnvelopePreparation(String s, String s1, String s2) {
        JSONObject jSONObject0 = new JSONObject();
        jSONObject0.put("name", this.eventName);
        jSONObject0.put("group", this.groupName);
        jSONObject0.put("timestamp", this.timeStamp);
        jSONObject0.put("level", this.level);
        jSONObject0.put("private", this.isPrivate);
        jSONObject0.put("payload_type", this.payloadType);
        jSONObject0.put("publisher", this.productName);
        return jSONObject0;
    }

    public JSONObject jsonPublisherMetadataPreparation(Context context0) {
        PackageInfo packageInfo0;
        JSONObject jSONObject0 = new JSONObject();
        jSONObject0.put("client_address", Utils.getIPAddress(false));
        jSONObject0.put("os_name", "android");
        jSONObject0.put("os_version", Build.VERSION.RELEASE);
        String s = Build.MODEL;
        jSONObject0.put("device_model", s);
        jSONObject0.put("device_vendor", Build.MANUFACTURER);
        jSONObject0.put("device_type", s);
        jSONObject0.put("cpu_architecture", Build.CPU_ABI);
        if(context0 != null) {
            PackageManager packageManager0 = context0.getPackageManager();
            try {
                packageInfo0 = null;
                packageInfo0 = packageManager0.getPackageInfo("com.wave.personal", 0);
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
            }
            String s1 = packageInfo0.versionName;
            String s2 = String.valueOf(packageInfo0.versionCode);
            ApplicationInfo applicationInfo0 = context0.getApplicationInfo();
            int v = applicationInfo0.labelRes;
            if(v != 0) {
                jSONObject0.put("app_name", context0.getString(v));
            }
            jSONObject0.put("app_id", applicationInfo0.packageName);
            jSONObject0.put("app_version", s1);
            jSONObject0.put("app_build_number", s2);
            if(Build.VERSION.SDK_INT >= 24) {
                jSONObject0.put("app_min_os_version", applicationInfo0.minSdkVersion);
            }
            jSONObject0.put("app_target_os_version", 34);
        }
        return jSONObject0;
    }
}

