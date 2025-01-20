package R9;

import Ab.t;
import Eb.a;
import Fb.j;
import R2.m;
import W5.f;
import Y8.m2;
import android.net.Uri;
import com.sendwave.backend.fragment.CustomerHomeFragment;
import com.wave.customer.CustomerApp;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class p0 extends j implements Function2 {
    public String c0;
    public int d0;
    public Object e0;
    public final m f0;

    public p0(m m0, g g0) {
        this.f0 = m0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((p0)this.t(((Uri)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new p0(this.f0, g0);
        g1.e0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        String s;
        Object object1 = a.X;
        m m0 = this.f0;
        switch(this.d0) {
            case 0: {
                f.b0(object0);
                Uri uri0 = (Uri)this.e0;
                s = uri0.getQueryParameter("message");
                if(s == null) {
                    s = "";
                }
                String s1 = uri0.getQueryParameter("baseUrl");
                if(s1 == null) {
                    s1 = "";
                }
                this.e0 = s;
                this.c0 = s1;
                this.d0 = 1;
                Object object2 = m0.j(this);
                return object2 == object1 ? object1 : w2.c(((CustomerApp)m0.X), s, s1 + "/" + ((CustomerHomeFragment)((m2)object2).a).h.b.f);
            }
            case 1: {
                String s2 = this.c0;
                s = (String)this.e0;
                f.b0(object0);
                return w2.c(((CustomerApp)m0.X), s, s2 + "/" + ((CustomerHomeFragment)((m2)object0).a).h.b.f);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

