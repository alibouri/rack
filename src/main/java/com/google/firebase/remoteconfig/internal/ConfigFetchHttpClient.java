package com.google.firebase.remoteconfig.internal;

import A1.b;
import V7.c;
import V7.d;
import V7.f;
import W7.e;
import W7.g;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.util.Log;
import androidx.annotation.Keep;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jeb.synthetic.FIN;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ConfigFetchHttpClient {
    public final Context a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    public final long g;
    public static final Pattern h;

    static {
        ConfigFetchHttpClient.h = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
    }

    public ConfigFetchHttpClient(Context context0, String s, String s1, String s2, long v, long v1) {
        this.a = context0;
        this.b = s;
        this.c = s1;
        Matcher matcher0 = ConfigFetchHttpClient.h.matcher(s);
        this.d = matcher0.matches() ? matcher0.group(1) : null;
        this.e = s2;
        this.f = v;
        this.g = v1;
    }

    public final JSONObject a(String s, String s1, Map map0, Long long0) {
        HashMap hashMap0 = new HashMap();
        if(s == null) {
            throw new c("Fetch failed: Firebase installation id is null.");  // initializer: LE7/B;-><init>(Ljava/lang/String;)V
        }
        hashMap0.put("appInstanceId", s);
        hashMap0.put("appInstanceIdToken", s1);
        hashMap0.put("appId", this.b);
        Locale locale0 = this.a.getResources().getConfiguration().locale;
        hashMap0.put("countryCode", locale0.getCountry());
        int v = Build.VERSION.SDK_INT;
        hashMap0.put("languageCode", locale0.toLanguageTag());
        hashMap0.put("platformVersion", Integer.toString(v));
        hashMap0.put("timeZone", TimeZone.getDefault().getID());
        try {
            PackageInfo packageInfo0 = this.a.getPackageManager().getPackageInfo("com.wave.personal", 0);
            if(packageInfo0 != null) {
                hashMap0.put("appVersion", packageInfo0.versionName);
                hashMap0.put("appBuild", Long.toString((v < 28 ? ((long)packageInfo0.versionCode) : b.d(packageInfo0))));
            }
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
        hashMap0.put("packageName", "com.wave.personal");
        hashMap0.put("sdkVersion", "22.0.1");
        hashMap0.put("analyticsUserProperties", new JSONObject(map0));
        if(long0 != null) {
            SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat("yyyy-MM-dd\'T\'HH:mm:ss.SSS\'Z\'", Locale.US);
            simpleDateFormat0.setTimeZone(TimeZone.getTimeZone("UTC"));
            hashMap0.put("firstOpenTime", simpleDateFormat0.format(long0));
        }
        return new JSONObject(hashMap0);
    }

    public final HttpURLConnection b() {
        try {
            return (HttpURLConnection)new URL("https://firebaseremoteconfig.googleapis.com/v1/projects/" + this.d + "/namespaces/" + this.e + ":fetch").openConnection();
        }
        catch(IOException iOException0) {
            throw new d(iOException0.getMessage());  // initializer: LE7/B;-><init>(Ljava/lang/String;)V
        }
    }

    public static JSONObject c(HttpURLConnection httpURLConnection0) {
        BufferedReader bufferedReader0 = new BufferedReader(new InputStreamReader(httpURLConnection0.getInputStream(), "utf-8"));
        StringBuilder stringBuilder0 = new StringBuilder();
        int v;
        while((v = bufferedReader0.read()) != -1) {
            stringBuilder0.append(((char)v));
        }
        return new JSONObject(stringBuilder0.toString());
    }

    public static void d(HttpURLConnection httpURLConnection0, byte[] arr_b) {
        httpURLConnection0.setFixedLengthStreamingMode(arr_b.length);
        BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(httpURLConnection0.getOutputStream());
        bufferedOutputStream0.write(arr_b);
        bufferedOutputStream0.flush();
        bufferedOutputStream0.close();
    }

    @Keep
    public g fetch(HttpURLConnection httpURLConnection0, String s, String s1, Map map0, String s2, Map map1, Long long0, Date date0) {
        int v2;
        e e0;
        JSONArray jSONArray1;
        JSONObject jSONObject2;
        JSONArray jSONArray0;
        JSONObject jSONObject1;
        W7.d d0;
        JSONObject jSONObject0;
        String s4;
        int v;
        String s3;
        httpURLConnection0.setDoOutput(true);
        TimeUnit timeUnit0 = TimeUnit.SECONDS;
        httpURLConnection0.setConnectTimeout(((int)timeUnit0.toMillis(this.f)));
        httpURLConnection0.setReadTimeout(((int)timeUnit0.toMillis(this.g)));
        httpURLConnection0.setRequestProperty("If-None-Match", s2);
        httpURLConnection0.setRequestProperty("X-Goog-Api-Key", this.c);
        httpURLConnection0.setRequestProperty("X-Android-Package", "com.wave.personal");
        try {
            byte[] arr_b = S5.c.c(this.a, "com.wave.personal");
            if(arr_b == null) {
                Log.e("FirebaseRemoteConfig", "Could not get fingerprint hash for package: com.wave.personal");
                goto label_15;
            }
            else {
                s3 = S5.c.a(arr_b);
            }
            goto label_16;
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
        }
    label_14:
        Log.e("FirebaseRemoteConfig", "No such package: com.wave.personal", packageManager$NameNotFoundException0);
        try {
        label_15:
            s3 = null;
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            goto label_14;
        }
    label_16:
        httpURLConnection0.setRequestProperty("X-Android-Cert", s3);
        httpURLConnection0.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection0.setRequestProperty("X-Goog-Firebase-Installations-Auth", s1);
        httpURLConnection0.setRequestProperty("Content-Type", "application/json");
        httpURLConnection0.setRequestProperty("Accept", "application/json");
        for(Object object0: map1.entrySet()) {
            httpURLConnection0.setRequestProperty(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
        }
        try {
            v = FIN.finallyOpen$NT();
            ConfigFetchHttpClient.d(httpURLConnection0, this.a(s, s1, map0, long0).toString().getBytes("utf-8"));
            httpURLConnection0.connect();
            int v1 = httpURLConnection0.getResponseCode();
            if(v1 != 200) {
                FIN.finallyExec$NT(v);
                throw new f(v1, httpURLConnection0.getResponseMessage());
            }
            s4 = httpURLConnection0.getHeaderField("ETag");
            jSONObject0 = ConfigFetchHttpClient.c(httpURLConnection0);
        }
        catch(IOException | JSONException iOException0) {
            FIN.finallyExec$NT(v);
            throw new c("The client had an error while calling the backend!", iOException0);  // initializer: LE7/B;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
        }
        FIN.finallyCodeBegin$NT(v);
        httpURLConnection0.disconnect();
        try {
            httpURLConnection0.getInputStream().close();
            FIN.finallyCodeEnd$NT(v);
        }
        catch(IOException unused_ex) {
        }
        try {
            d0 = e.c();
            d0.b = date0;
        }
        catch(JSONException jSONException0) {
            throw new c("Fetch failed: fetch response could not be parsed.", jSONException0);  // initializer: LE7/B;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
        }
        try {
            jSONObject1 = null;
            jSONObject1 = jSONObject0.getJSONObject("entries");
        }
        catch(JSONException unused_ex) {
        }
        if(jSONObject1 != null) {
            try {
                d0.a = new JSONObject(jSONObject1.toString());
            }
            catch(JSONException unused_ex) {
            }
        }
        try {
            jSONArray0 = null;
            jSONArray0 = jSONObject0.getJSONArray("experimentDescriptions");
        }
        catch(JSONException unused_ex) {
        }
        if(jSONArray0 != null) {
            try {
                d0.c = new JSONArray(jSONArray0.toString());
            }
            catch(JSONException unused_ex) {
            }
        }
        try {
            jSONObject2 = null;
            jSONObject2 = jSONObject0.getJSONObject("personalizationMetadata");
        }
        catch(JSONException unused_ex) {
        }
        if(jSONObject2 != null) {
            try {
                d0.d = new JSONObject(jSONObject2.toString());
            }
            catch(JSONException unused_ex) {
            }
        }
        try {
            String s5 = jSONObject0.has("templateVersion") ? jSONObject0.getString("templateVersion") : null;
            if(s5 != null) {
                d0.e = Long.parseLong(s5);
            }
        }
        catch(JSONException jSONException0) {
            throw new c("Fetch failed: fetch response could not be parsed.", jSONException0);  // initializer: LE7/B;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
        }
        try {
            jSONArray1 = null;
            jSONArray1 = jSONObject0.getJSONArray("rolloutMetadata");
        }
        catch(JSONException unused_ex) {
        }
        if(jSONArray1 != null) {
            try {
                d0.f = new JSONArray(jSONArray1.toString());
            }
            catch(JSONException unused_ex) {
            }
        }
        try {
            e0 = new e(d0.a, d0.b, d0.c, d0.d, d0.e, d0.f);
            goto label_68;
        }
        catch(JSONException jSONException0) {
        }
        throw new c("Fetch failed: fetch response could not be parsed.", jSONException0);  // initializer: LE7/B;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
        try {
        label_68:
            v2 = 1;
            v2 = !jSONObject0.get("state").equals("NO_CHANGE");
        }
        catch(JSONException unused_ex) {
        }
        return v2 == 0 ? new g(1, e0, null) : new g(0, e0, s4);
    }
}

