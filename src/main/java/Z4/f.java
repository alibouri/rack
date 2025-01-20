package Z4;

import J2.i;
import Nb.j;
import R4.g;
import Vb.q;
import a5.w;
import android.view.View.OnClickListener;
import android.view.View;
import f5.a;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import org.json.JSONObject;

public final class f implements View.OnClickListener {
    public final View.OnClickListener X;
    public final WeakReference Y;
    public final WeakReference Z;
    public final String b0;
    public static final HashSet c0;

    static {
        f.c0 = new HashSet();
    }

    public f(View view0, View view1, String s) {
        this.X = g.e(view0);
        this.Y = new WeakReference(view1);
        this.Z = new WeakReference(view0);
        String s1 = s.toLowerCase();
        j.e(s1, "(this as java.lang.String).toLowerCase()");
        this.b0 = q.M(s1, "activity", "");
    }

    public final void a() {
        JSONObject jSONObject0;
        String s1;
        String s;
        if(a.b(this)) {
            return;
        }
        try {
            View view0 = (View)this.Y.get();
            View view1 = (View)this.Z.get();
            if(view0 != null && view1 != null) {
                try {
                    s = c.d(view1);
                    s1 = b.b(view1, s);
                    if(s1 == null) {
                        return;
                    }
                    if(Z4.a.a(s1, s)) {
                        return;
                    }
                    jSONObject0 = new JSONObject();
                    jSONObject0.put("view", c.b(view0, view1));
                    jSONObject0.put("screenname", this.b0);
                    if(!a.b(this)) {
                        goto label_15;
                    }
                }
                catch(Exception unused_ex) {
                }
            }
        }
        catch(Throwable throwable0) {
            a.a(throwable0, this);
        }
        return;
        try {
        label_15:
            w.g0(new i(jSONObject0, s, this, s1, 1));
            return;
        }
        catch(Throwable throwable1) {
            try {
                a.a(throwable1, this);
                return;
            }
            catch(Exception unused_ex) {
                return;
            }
            catch(Throwable throwable0) {
            }
        }
        a.a(throwable0, this);
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        if(a.b(this)) {
            return;
        }
        try {
            j.f(view0, "view");
            View.OnClickListener view$OnClickListener0 = this.X;
            if(view$OnClickListener0 != null) {
                view$OnClickListener0.onClick(view0);
            }
            this.a();
        }
        catch(Throwable throwable0) {
            a.a(throwable0, this);
        }
    }
}

