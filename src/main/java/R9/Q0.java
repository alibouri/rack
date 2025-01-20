package R9;

import Ab.t;
import Eb.a;
import Fb.j;
import R2.m;
import W5.f;
import Y8.m2;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import com.apollographql.apollo.api.b;
import com.sendwave.backend.fragment.CustomerHomeFragment;
import com.wave.customer.CustomerApp;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class q0 extends j implements Function2 {
    public String c0;
    public int d0;
    public int e0;
    public Object f0;
    public final m g0;

    public q0(m m0, g g0) {
        this.g0 = m0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((q0)this.t(((Uri)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new q0(this.g0, g0);
        g1.f0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        String s3;
        String s2;
        int v;
        Object object1 = a.X;
        m m0 = this.g0;
        switch(this.e0) {
            case 0: {
                f.b0(object0);
                Uri uri0 = (Uri)this.f0;
                boolean z = false;
                try {
                    z = ((CustomerApp)m0.X).getPackageManager().getApplicationInfo("com.whatsapp", 0).enabled;
                }
                catch(PackageManager.NameNotFoundException unused_ex) {
                }
                String s = uri0.getQueryParameter("message");
                if(s == null) {
                    s = "";
                }
                String s1 = uri0.getQueryParameter("baseUrl");
                if(s1 == null) {
                    s1 = "";
                }
                this.f0 = s;
                this.c0 = s1;
                this.d0 = z;
                this.e0 = 1;
                Object object2 = m0.j(this);
                if(object2 == object1) {
                    return object1;
                }
                v = z;
                s2 = s1;
                object0 = object2;
                s3 = s;
                break;
            }
            case 1: {
                v = this.d0;
                s2 = this.c0;
                s3 = (String)this.f0;
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        String s4 = b.q(s2, "/", ((CustomerHomeFragment)((m2)object0).a).h.b.f);
        if(v != 0) {
            Object object3 = new Intent("android.intent.action.SEND");
            ((Intent)object3).setType("text/plain");
            ((Intent)object3).setPackage("com.whatsapp");
            ((Intent)object3).putExtra("android.intent.extra.TEXT", s3 + "\n\n" + s4);
            return object3;
        }
        return w2.c(((CustomerApp)m0.X), s3, s4);
    }
}

