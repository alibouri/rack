package Z4;

import M4.l;
import N4.c;
import Nb.j;
import W4.e;
import a5.m;
import a5.p;
import android.app.Activity;
import f5.a;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import jeb.synthetic.FIN;
import org.json.JSONArray;
import org.json.JSONObject;

public final class d {
    public static final d a;
    public static final AtomicBoolean b;
    public static final LinkedHashSet c;
    public static final LinkedHashSet d;

    static {
        d.a = new d();  // initializer: Ljava/lang/Object;-><init>()V
        d.b = new AtomicBoolean(false);
        d.c = new LinkedHashSet();
        d.d = new LinkedHashSet();
    }

    public static final void a() {
        Class class0 = d.class;
        __monitor_enter(class0);
        int v = FIN.finallyOpen$NT();
        if(a.b(d.class)) {
            FIN.finallyCodeBegin$NT(v);
            __monitor_exit(class0);
            FIN.finallyCodeEnd$NT(v);
            return;
        }
        try {
            l.c().execute(new c(15));
            FIN.finallyExec$NT(v);
        }
        catch(Throwable throwable0) {
            a.a(throwable0, d.class);
            FIN.finallyExec$NT(v);
        }
    }

    public final void b() {
        if(a.b(this)) {
            return;
        }
        try {
            m m0 = p.h(l.b(), false);
            if(m0 == null) {
                return;
            }
            String s = m0.j;
            if(s == null) {
                return;
            }
            this.c(s);
            if(!d.c.isEmpty() || !d.d.isEmpty()) {
                File file0 = e.d();
                if(file0 == null) {
                    return;
                }
                Z4.a.f(file0);
                Activity activity0 = V4.d.k == null ? null : ((Activity)V4.d.k.get());
                if(activity0 != null) {
                    d.d(activity0);
                    return;
                }
            }
            return;
        }
        catch(Exception unused_ex) {
            return;
        }
        catch(Throwable throwable0) {
        }
        a.a(throwable0, this);
    }

    public final void c(String s) {
        int v;
        if(a.b(this)) {
            return;
        }
        try {
            v = 0;
            JSONObject jSONObject0 = new JSONObject(s);
            if(jSONObject0.has("production_events")) {
                JSONArray jSONArray0 = jSONObject0.getJSONArray("production_events");
                int v1 = jSONArray0.length();
                if(v1 > 0) {
                    for(int v2 = 0; true; ++v2) {
                        String s1 = jSONArray0.getString(v2);
                        j.e(s1, "jsonArray.getString(i)");
                        d.c.add(s1);
                        if(v2 + 1 >= v1) {
                            break;
                        }
                    }
                }
            }
            if(jSONObject0.has("eligible_for_prediction_events")) {
                JSONArray jSONArray1 = jSONObject0.getJSONArray("eligible_for_prediction_events");
                int v3 = jSONArray1.length();
                if(v3 > 0) {
                    while(true) {
                    label_19:
                        String s2 = jSONArray1.getString(v);
                        j.e(s2, "jsonArray.getString(i)");
                        d.d.add(s2);
                        goto label_26;
                    }
                }
            }
            return;
        }
        catch(Exception unused_ex) {
            return;
        }
        catch(Throwable throwable0) {
        }
        a.a(throwable0, this);
        return;
    label_26:
        if(v + 1 < v3) {
            ++v;
            goto label_19;
        }
    }

    public static final void d(Activity activity0) {
        Class class0 = d.class;
        if(a.b(class0)) {
            return;
        }
        try {
            boolean z = false;
            j.f(activity0, "activity");
            try {
                if(d.b.get()) {
                    if(!a.b(Z4.a.class)) {
                        z = Z4.a.f;
                    }
                    if(z && (!d.c.isEmpty() || !d.d.isEmpty())) {
                        Pb.a.P(activity0);
                        return;
                    }
                }
                Pb.a.Q(activity0);
            }
            catch(Exception unused_ex) {
            }
        }
        catch(Throwable throwable0) {
            a.a(throwable0, class0);
        }
    }
}

