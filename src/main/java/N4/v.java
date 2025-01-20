package N4;

import M4.l;
import Nb.j;
import O4.c;
import a5.w;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import android.util.Patterns;
import f5.a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

public final class v {
    public static final v a;
    public static SharedPreferences b;
    public static final AtomicBoolean c;
    public static final ConcurrentHashMap d;
    public static final ConcurrentHashMap e;

    static {
        v.a = new v();  // initializer: Ljava/lang/Object;-><init>()V
        v.c = new AtomicBoolean(false);
        v.d = new ConcurrentHashMap();
        v.e = new ConcurrentHashMap();
    }

    public final HashMap a() {
        if(a.b(this)) {
            return null;
        }
        try {
            HashMap hashMap0 = new HashMap();
            HashSet hashSet0 = new HashSet();
            for(Object object0: c.a()) {
                hashSet0.add(((c)object0).c());
            }
            ConcurrentHashMap concurrentHashMap0 = v.e;
            for(Object object1: concurrentHashMap0.keySet()) {
                String s = (String)object1;
                if(hashSet0.contains(s)) {
                    hashMap0.put(s, concurrentHashMap0.get(s));
                }
            }
            return hashMap0;
        }
        catch(Throwable throwable0) {
            a.a(throwable0, this);
            return null;
        }
    }

    public final void b() {
        synchronized(this) {
            if(a.b(this)) {
                return;
            }
            goto label_4;
        }
        return;
        try {
        label_4:
            AtomicBoolean atomicBoolean0 = v.c;
            if(!atomicBoolean0.get()) {
                SharedPreferences sharedPreferences0 = PreferenceManager.getDefaultSharedPreferences(l.a());
                j.e(sharedPreferences0, "getDefaultSharedPreferences(FacebookSdk.getApplicationContext())");
                v.b = sharedPreferences0;
                String s = sharedPreferences0.getString("com.facebook.appevents.UserDataStore.userData", "");
                if(s == null) {
                    s = "";
                }
                SharedPreferences sharedPreferences1 = v.b;
                if(sharedPreferences1 == null) {
                    j.p("sharedPreferences");
                    throw null;
                }
                String s1 = sharedPreferences1.getString("com.facebook.appevents.UserDataStore.internalUserData", "");
                if(s1 == null) {
                    s1 = "";
                }
                HashMap hashMap0 = w.R(s);
                v.d.putAll(hashMap0);
                HashMap hashMap1 = w.R(s1);
                v.e.putAll(hashMap1);
                atomicBoolean0.set(true);
                return;
            }
            return;
        }
        catch(Throwable throwable1) {
        }
        a.a(throwable1, this);
    }

    public final String c(String s, String s1) {
        String s5;
        if(a.b(this)) {
            return null;
        }
        try {
            int v = s1.length() - 1;
            int v1 = 0;
            boolean z = false;
            while(v1 <= v) {
                boolean z1 = j.h(s1.charAt((z ? v : v1)), 0x20) <= 0;
                if(z) {
                    if(!z1) {
                        break;
                    }
                    --v;
                }
                else if(z1) {
                    ++v1;
                }
                else {
                    z = true;
                }
            }
            String s2 = s1.subSequence(v1, v + 1).toString();
            if(s2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String s3 = s2.toLowerCase();
            j.e(s3, "(this as java.lang.String).toLowerCase()");
            if("em".equals(s)) {
                if(!Patterns.EMAIL_ADDRESS.matcher(s3).matches()) {
                    Log.e("v", "Setting email failure: this is not a valid email address");
                    return "";
                }
                return s3;
            }
            if("ph".equals(s)) {
                Pattern pattern0 = Pattern.compile("[^0-9]");
                j.e(pattern0, "compile(...)");
                String s4 = pattern0.matcher(s3).replaceAll("");
                j.e(s4, "replaceAll(...)");
                return s4;
            }
            if("ge".equals(s)) {
                if(s3.length() > 0) {
                    s5 = s3.substring(0, 1);
                    j.e(s5, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                }
                else {
                    s5 = "";
                }
                if(!"f".equals(s5) && !"m".equals(s5)) {
                    Log.e("v", "Setting gender failure: the supported value for gender is f or m");
                    return "";
                }
                return s5;
            }
            return s3;
        }
        catch(Throwable throwable0) {
        }
        a.a(throwable0, this);
        return null;
    }
}

