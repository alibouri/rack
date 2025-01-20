package N4;

import Bb.p;
import H6.e;
import M4.h;
import M4.y;
import Nb.j;
import U4.g;
import Y4.b;
import android.os.Bundle;
import f5.a;
import io.sentry.hints.i;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class f implements Serializable {
    public final JSONObject X;
    public final boolean Y;
    public final boolean Z;
    public final String b0;
    public final String c0;
    public static final HashSet d0;

    static {
        f.d0 = new HashSet();
    }

    public f(String s, String s1, Double double0, Bundle bundle0, boolean z, boolean z1, UUID uUID0) {
        j.f(s, "contextName");
        Iterator iterator8;
        JSONArray jSONArray0;
        g g0;
        String s6;
        String s2;
        U4.f f0;
        Object object1;
        Object object0;
        boolean z2;
        b b0;
        j.f(s1, "eventName");
        super();
        this.Y = z;
        this.Z = z1;
        this.b0 = s1;
        e.e(s1);
        JSONObject jSONObject0 = new JSONObject();
        Class class0 = b.class;
        if(!a.b(class0)) {
            try {
                if(b.b) {
                    b0 = b.a;
                    if(a.b(b0)) {
                        z2 = false;
                        object0 = z2 ? "_removed_" : s1;
                        goto label_30;
                    }
                    else {
                        z2 = b.d.contains(s1);
                    }
                    object0 = z2 ? "_removed_" : s1;
                }
                else {
                    object0 = s1;
                }
                goto label_30;
            }
            catch(Throwable throwable0) {
                goto label_26;
            }
            try {
                z2 = b.d.contains(s1);
                object0 = z2 ? "_removed_" : s1;
                goto label_30;
            }
            catch(Throwable throwable1) {
                try {
                    a.a(throwable1, b0);
                    z2 = false;
                    object0 = z2 ? "_removed_" : s1;
                    goto label_30;
                }
                catch(Throwable throwable0) {
                }
            }
        label_26:
            a.a(throwable0, class0);
        }
        object0 = null;
    label_30:
        if(j.a(object0, s1)) {
            Class class1 = U4.f.class;
            if(a.b(class1)) {
                object1 = null;
            }
            else {
                try {
                    if(U4.f.b) {
                        object1 = null;
                        f0 = U4.f.a;
                        if(!a.b(f0)) {
                            goto label_37;
                        }
                        goto label_48;
                    }
                    else {
                        object1 = s1;
                    }
                    goto label_57;
                }
                catch(Throwable throwable2) {
                    goto label_54;
                }
                try {
                label_37:
                    Iterator iterator0 = U4.f.c.keySet().iterator();
                    while(true) {
                        if(!iterator0.hasNext()) {
                            goto label_48;
                        }
                        Object object2 = iterator0.next();
                        s2 = (String)object2;
                        HashSet hashSet0 = (HashSet)U4.f.c.get(s2);
                        if(hashSet0 == null || !hashSet0.contains(s1)) {
                            continue;
                        }
                        goto label_47;
                    }
                }
                catch(Throwable throwable3) {
                    try {
                        a.a(throwable3, f0);
                        goto label_48;
                    label_47:
                        object1 = s2;
                    label_48:
                        if(object1 == null) {
                            object1 = s1;
                        }
                        goto label_57;
                    }
                    catch(Throwable throwable2) {
                    }
                }
            label_54:
                a.a(throwable2, class1);
            }
        label_57:
            object0 = object1;
        }
        jSONObject0.put("_eventName", object0);
        jSONObject0.put("_logTime", System.currentTimeMillis() / 1000L);
        jSONObject0.put("_ui", s);
        if(uUID0 != null) {
            jSONObject0.put("_session_id", uUID0);
        }
        HashMap hashMap0 = new HashMap();
        for(Object object3: bundle0.keySet()) {
            String s3 = (String)object3;
            j.e(s3, "key");
            e.e(s3);
            Object object4 = bundle0.get(s3);
            if(!(object4 instanceof String) && !(object4 instanceof Number)) {
                throw new h(String.format("Parameter value \'%s\' for key \'%s\' should be a string or a numeric type.", Arrays.copyOf(new Object[]{object4, s3}, 2)));
            }
            hashMap0.put(s3, object4.toString());
        }
        U4.e e0 = U4.e.a;
        boolean z3 = a.b(e0);
        String s4 = this.b0;
        String s5 = "1";
        if(z3) {
        label_84:
            Class class2 = g.class;
            if(!a.b(class2)) {
                try {
                    j.f(s4, "eventName");
                    if(g.b) {
                        if(g.c != null && !g.c.isEmpty()) {
                            jSONArray0 = new JSONArray();
                            try {
                            label_93:
                                HashSet hashSet1 = (HashSet)g.d.get(s4);
                                Iterator iterator2 = new ArrayList(hashMap0.keySet()).iterator();
                                while(true) {
                                label_95:
                                    if(!iterator2.hasNext()) {
                                        goto label_108;
                                    }
                                    Object object5 = iterator2.next();
                                    s6 = (String)object5;
                                    g0 = g.a;
                                    if(!a.b(g0)) {
                                        goto label_100;
                                    }
                                }
                            }
                            catch(Exception unused_ex) {
                                goto label_108;
                            }
                        }
                        else if(g.d.containsKey(s4)) {
                            jSONArray0 = new JSONArray();
                            goto label_93;
                        }
                    }
                    goto label_113;
                }
                catch(Throwable throwable5) {
                    goto label_112;
                }
                try {
                label_100:
                    if(!g.c.contains(s6) && (hashSet1 == null || hashSet1.isEmpty() || !hashSet1.contains(s6))) {
                        goto label_95;
                    }
                    goto label_105;
                }
                catch(Throwable throwable6) {
                    try {
                        try {
                            a.a(throwable6, g0);
                            goto label_95;
                        label_105:
                            hashMap0.remove(s6);
                            jSONArray0.put(s6);
                            goto label_95;
                        }
                        catch(Exception unused_ex) {
                        label_108:
                            if(jSONArray0.length() > 0) {
                                hashMap0.put("_filteredKey", jSONArray0.toString());
                            }
                            goto label_113;
                        }
                    }
                    catch(Throwable throwable5) {
                    }
                }
            label_112:
                a.a(throwable5, class2);
            }
        }
        else {
            try {
                if(!bundle0.containsKey("pm") || !j.a(bundle0.get("pm"), "1")) {
                    goto label_84;
                }
            }
            catch(Throwable throwable4) {
                a.a(throwable4, e0);
                goto label_84;
            }
        }
    label_113:
        Class class3 = U4.b.class;
        if(!a.b(class3) && U4.b.b && !hashMap0.isEmpty()) {
            try {
                List list0 = p.Q0(hashMap0.keySet());
                JSONObject jSONObject1 = new JSONObject();
                for(Object object6: list0) {
                    String s7 = (String)object6;
                    Object object7 = hashMap0.get(s7);
                    if(object7 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    String s8 = (String)object7;
                    if(U4.b.a.a(s7) || U4.b.a.a(s8)) {
                        hashMap0.remove(s7);
                        if(!U4.b.c) {
                            s8 = "";
                        }
                        jSONObject1.put(s7, s8);
                    }
                }
                if(jSONObject1.length() != 0) {
                    String s9 = jSONObject1.toString();
                    j.e(s9, "restrictiveParamJson.toString()");
                    hashMap0.put("_onDeviceParams", s9);
                }
                goto label_138;
            }
            catch(Exception unused_ex) {
                goto label_138;
            }
            catch(Throwable throwable7) {
            }
            a.a(throwable7, class3);
        }
    label_138:
        if(!a.b(class0)) {
            try {
                j.f(s4, "eventName");
                if(b.b) {
                    HashMap hashMap1 = new HashMap();
                    for(Object object8: new ArrayList(hashMap0.keySet())) {
                        String s10 = (String)object8;
                        String s11 = b.a.a(s4, s10);
                        if(s11 != null) {
                            hashMap1.put(s10, s11);
                            hashMap0.remove(s10);
                        }
                    }
                    if(!hashMap1.isEmpty()) {
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            for(Object object9: hashMap1.entrySet()) {
                                jSONObject2.put(((String)((Map.Entry)object9).getKey()), ((String)((Map.Entry)object9).getValue()));
                            }
                            hashMap0.put("_restrictedParams", jSONObject2.toString());
                        }
                        catch(JSONException unused_ex) {
                        }
                    }
                }
                goto label_162;
            }
            catch(Throwable throwable8) {
            }
            a.a(throwable8, class0);
        }
    label_162:
        Class class4 = S4.b.class;
        if(a.b(class4)) {
        label_187:
            iterator8 = hashMap0.keySet().iterator();
        }
        else {
            try {
                j.f(s4, "eventName");
                if(S4.b.b) {
                    ArrayList arrayList0 = new ArrayList(hashMap0.keySet());
                    Iterator iterator6 = new ArrayList(S4.b.c).iterator();
                    while(true) {
                        if(!iterator6.hasNext()) {
                            goto label_187;
                        }
                        Object object10 = iterator6.next();
                        S4.a a0 = (S4.a)object10;
                        if(j.a(a0.a, s4)) {
                            for(Object object11: arrayList0) {
                                String s12 = (String)object11;
                                if(a0.b.contains(s12)) {
                                    hashMap0.remove(s12);
                                }
                            }
                        }
                    }
                }
                else {
                    goto label_187;
                }
            }
            catch(Throwable throwable9) {
                a.a(throwable9, class4);
                iterator8 = hashMap0.keySet().iterator();
            }
        }
        while(iterator8.hasNext()) {
            Object object12 = iterator8.next();
            jSONObject0.put(((String)object12), hashMap0.get(((String)object12)));
        }
        if(double0 != null) {
            jSONObject0.put("_valueToSum", ((double)double0));
        }
        if(this.Z) {
            jSONObject0.put("_inBackground", "1");
        }
        if(this.Y) {
            jSONObject0.put("_implicitlyLogged", "1");
        }
        else {
            String s13 = jSONObject0.toString();
            j.e(s13, "eventObject.toString()");
            i.D(y.b0, "AppEvents", "Created app event \'%s\'", new Object[]{s13});
        }
        this.X = jSONObject0;
        String s14 = jSONObject0.toString();
        j.e(s14, "jsonObject.toString()");
        try {
            MessageDigest messageDigest0 = MessageDigest.getInstance("MD5");
            Charset charset0 = Charset.forName("UTF-8");
            j.e(charset0, "Charset.forName(charsetName)");
            byte[] arr_b = s14.getBytes(charset0);
            j.e(arr_b, "(this as java.lang.String).getBytes(charset)");
            messageDigest0.update(arr_b, 0, arr_b.length);
            byte[] arr_b1 = messageDigest0.digest();
            j.e(arr_b1, "digest.digest()");
            s5 = V4.e.a(arr_b1);
        }
        catch(NoSuchAlgorithmException unused_ex) {
            s5 = "0";
        }
        catch(UnsupportedEncodingException unused_ex) {
        }
        this.c0 = s5;
    }

    public f(String s, String s1, boolean z, boolean z1) {
        JSONObject jSONObject0 = new JSONObject(s);
        this.X = jSONObject0;
        this.Y = z;
        String s2 = jSONObject0.optString("_eventName");
        j.e(s2, "jsonObject.optString(Constants.EVENT_NAME_EVENT_KEY)");
        this.b0 = s2;
        this.c0 = s1;
        this.Z = z1;
    }

    @Override
    public final String toString() {
        return String.format("\"%s\", implicit: %b, json: %s", Arrays.copyOf(new Object[]{this.X.optString("_eventName"), Boolean.valueOf(this.Y), this.X.toString()}, 3));
    }

    private final Object writeReplace() {
        String s = this.X.toString();
        j.e(s, "jsonObject.toString()");
        return new N4.e(s, this.c0, this.Y, this.Z);
    }
}

