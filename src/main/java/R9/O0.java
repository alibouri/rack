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
import com.sendwave.backend.fragment.CustomerHomeFragment;
import com.sendwave.backend.fragment.ReferralFragment;
import com.wave.customer.CustomerApp;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class o0 extends j implements Function2 {
    public int c0;
    public int d0;
    public final m e0;

    public o0(m m0, g g0) {
        this.e0 = m0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((o0)this.t(((Uri)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new o0(this.e0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        int v;
        Object object1 = a.X;
        m m0 = this.e0;
        switch(this.d0) {
            case 0: {
                f.b0(object0);
                boolean z = false;
                try {
                    z = ((CustomerApp)m0.X).getPackageManager().getApplicationInfo("com.whatsapp", 0).enabled;
                }
                catch(PackageManager.NameNotFoundException unused_ex) {
                }
                this.c0 = z;
                this.d0 = 1;
                Object object2 = m0.j(this);
                if(object2 == object1) {
                    return object1;
                }
                v = z;
                object0 = object2;
                break;
            }
            case 1: {
                v = this.c0;
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ReferralFragment referralFragment0 = ((CustomerHomeFragment)((m2)object0).a).h.b.e.b;
        String s = referralFragment0.b;
        String s1 = referralFragment0.c;
        if(v != 0) {
            Object object3 = new Intent("android.intent.action.SEND");
            ((Intent)object3).setType("text/plain");
            ((Intent)object3).setPackage("com.whatsapp");
            ((Intent)object3).putExtra("android.intent.extra.TEXT", s1 + "\n\n" + s);
            return object3;
        }
        return w2.c(((CustomerApp)m0.X), s1, s);
    }
}

