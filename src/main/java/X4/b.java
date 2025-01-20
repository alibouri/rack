package X4;

import Bb.p;
import N4.f;
import Nb.j;
import V4.e;
import a5.m;
import android.os.Bundle;
import f5.a;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b {
    public static final b a;

    static {
        b.a = new b();  // initializer: Ljava/lang/Object;-><init>()V
    }

    public static final Bundle a(c c0, String s, List list0) {
        Class class0 = b.class;
        if(a.b(class0)) {
            return null;
        }
        try {
            Bundle bundle0 = new Bundle();
            bundle0.putString("event", c0.X);
            bundle0.putString("app_id", s);
            if(c.Z == c0) {
                JSONArray jSONArray0 = b.a.b(s, list0);
                if(jSONArray0.length() == 0) {
                    return null;
                }
                bundle0.putString("custom_events", jSONArray0.toString());
                return bundle0;
            }
            return bundle0;
        }
        catch(Throwable throwable0) {
            a.a(throwable0, class0);
            return null;
        }
    }

    public final JSONArray b(String s, List list0) {
        String s3;
        boolean z1;
        boolean z;
        ArrayList arrayList0;
        JSONArray jSONArray0;
        if(a.b(this)) {
            return null;
        }
        try {
            jSONArray0 = new JSONArray();
            arrayList0 = p.R0(list0);
            S4.b.b(arrayList0);
            if(a.b(this)) {
                goto label_14;
            }
            else {
                goto label_6;
            }
            goto label_15;
        }
        catch(Throwable throwable0) {
            a.a(throwable0, this);
            return null;
        }
        try {
        label_6:
            m m0 = a5.p.h(s, false);
            z = m0 == null ? false : m0.a;
            goto label_15;
        }
        catch(Throwable throwable1) {
            try {
                a.a(throwable1, this);
                z = false;
                goto label_15;
            label_14:
                z = false;
            label_15:
                Iterator iterator0 = arrayList0.iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        return jSONArray0;
                    }
                    Object object0 = iterator0.next();
                    String s1 = ((f)object0).c0;
                    JSONObject jSONObject0 = ((f)object0).X;
                    if(s1 == null) {
                        z1 = true;
                    }
                    else {
                        String s2 = jSONObject0.toString();
                        j.e(s2, "jsonObject.toString()");
                        try {
                            MessageDigest messageDigest0 = MessageDigest.getInstance("MD5");
                            Charset charset0 = Charset.forName("UTF-8");
                            j.e(charset0, "Charset.forName(charsetName)");
                            byte[] arr_b = s2.getBytes(charset0);
                            j.e(arr_b, "(this as java.lang.String).getBytes(charset)");
                            messageDigest0.update(arr_b, 0, arr_b.length);
                            byte[] arr_b1 = messageDigest0.digest();
                            j.e(arr_b1, "digest.digest()");
                            s3 = "1";
                            s3 = e.a(arr_b1);
                            z1 = s3.equals(s1);
                        }
                        catch(NoSuchAlgorithmException unused_ex) {
                            s3 = "0";
                            z1 = s3.equals(s1);
                        }
                        catch(UnsupportedEncodingException unused_ex) {
                            z1 = s3.equals(s1);
                        }
                    }
                    if(z1 && (!((f)object0).Y || z)) {
                        jSONArray0.put(jSONObject0);
                    }
                }
            }
            catch(Throwable throwable0) {
            }
        }
        a.a(throwable0, this);
        return null;
    }
}

