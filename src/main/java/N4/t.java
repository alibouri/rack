package N4;

import Nb.j;
import V4.e;
import V4.g;
import a5.b;
import android.content.Context;
import android.os.Bundle;
import f5.a;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import jeb.synthetic.FIN;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class t {
    public final b a;
    public final String b;
    public ArrayList c;
    public final ArrayList d;
    public int e;

    public t(b b0, String s) {
        this.a = b0;
        this.b = s;
        this.c = new ArrayList();
        this.d = new ArrayList();
    }

    public final void a(f f0) {
        synchronized(this) {
            if(a.b(this)) {
                return;
            }
            goto label_4;
        }
        return;
        try {
        label_4:
            j.f(f0, "event");
            if(this.c.size() + this.d.size() >= 1000) {
                ++this.e;
            }
            else {
                this.c.add(f0);
            }
            return;
        }
        catch(Throwable throwable1) {
        }
        a.a(throwable1, this);
    }

    public final void b(boolean z) {
        synchronized(this) {
            if(a.b(this)) {
                return;
            }
            goto label_4;
        }
        return;
        try {
        label_4:
            if(z) {
                this.c.addAll(this.d);
            }
            this.d.clear();
            this.e = 0;
            return;
        }
        catch(Throwable throwable1) {
        }
        a.a(throwable1, this);
    }

    public final int c() {
        synchronized(this) {
            if(a.b(this)) {
                return 0;
            }
        }
        return this.c.size();
    }

    public final List d() {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        if(a.b(this)) {
            FIN.finallyCodeBegin$NT(v);
            __monitor_exit(this);
            FIN.finallyCodeEnd$NT(v);
            return null;
        }
        try {
            List list0 = this.c;
            this.c = new ArrayList();
            FIN.finallyExec$NT(v);
            return list0;
        }
        catch(Throwable throwable0) {
            a.a(throwable0, this);
            FIN.finallyExec$NT(v);
            return null;
        }
    }

    public final int e(M4.t t0, Context context0, boolean z, boolean z1) {
        String s2;
        boolean z2;
        JSONArray jSONArray0;
        int v;
        if(a.b(this)) {
            return 0;
        }
        try {
            __monitor_enter(this);
        }
        catch(Throwable throwable0) {
            a.a(throwable0, this);
            return 0;
        }
        try {
            v = this.e;
            S4.b.b(this.c);
            this.d.addAll(this.c);
            this.c.clear();
            jSONArray0 = new JSONArray();
            for(Object object0: this.d) {
                f f0 = (f)object0;
                String s = f0.c0;
                if(s == null) {
                    z2 = true;
                }
                else {
                    String s1 = f0.X.toString();
                    j.e(s1, "jsonObject.toString()");
                    try {
                        MessageDigest messageDigest0 = MessageDigest.getInstance("MD5");
                        Charset charset0 = Charset.forName("UTF-8");
                        j.e(charset0, "Charset.forName(charsetName)");
                        byte[] arr_b = s1.getBytes(charset0);
                        j.e(arr_b, "(this as java.lang.String).getBytes(charset)");
                        messageDigest0.update(arr_b, 0, arr_b.length);
                        byte[] arr_b1 = messageDigest0.digest();
                        j.e(arr_b1, "digest.digest()");
                        s2 = "1";
                        s2 = e.a(arr_b1);
                        z2 = s2.equals(s);
                    }
                    catch(NoSuchAlgorithmException unused_ex) {
                        s2 = "0";
                        z2 = s2.equals(s);
                    }
                    catch(UnsupportedEncodingException unused_ex) {
                        z2 = s2.equals(s);
                    }
                }
                if(z2 && (z || !f0.Y)) {
                    jSONArray0.put(f0.X);
                }
            }
            if(jSONArray0.length() == 0) {
                goto label_39;
            }
            goto label_41;
        }
        catch(Throwable throwable1) {
        }
        try {
            __monitor_exit(this);
            throw throwable1;
        label_39:
            __monitor_exit(this);
            return 0;
        label_41:
            __monitor_exit(this);
            this.f(t0, context0, v, jSONArray0, z1);
            return jSONArray0.length();
        }
        catch(Throwable throwable0) {
        }
        a.a(throwable0, this);
        return 0;
    }

    public final void f(M4.t t0, Context context0, int v, JSONArray jSONArray0, boolean z) {
        JSONObject jSONObject0;
        if(a.b(this)) {
            return;
        }
        try {
            try {
                jSONObject0 = g.a(V4.f.Y, this.a, this.b, z, context0);
                if(this.e > 0) {
                    jSONObject0.put("num_skipped_events", v);
                }
            }
            catch(JSONException unused_ex) {
                jSONObject0 = new JSONObject();
            }
            t0.c = jSONObject0;
            Bundle bundle0 = t0.d;
            String s = jSONArray0.toString();
            j.e(s, "events.toString()");
            bundle0.putString("custom_events", s);
            t0.e = s;
            t0.d = bundle0;
        }
        catch(Throwable throwable0) {
            a.a(throwable0, this);
        }
    }
}

