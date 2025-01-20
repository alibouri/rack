package R9;

import Ab.t;
import Eb.a;
import Fb.j;
import R2.m;
import W5.f;
import Y8.m2;
import android.content.Intent;
import android.net.Uri;
import com.sendwave.backend.fragment.CustomerHomeFragment;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class r0 extends j implements Function2 {
    public int c0;
    public final m d0;

    public r0(m m0, g g0) {
        this.d0 = m0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((r0)this.t(((Uri)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new r0(this.d0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                this.c0 = 1;
                object0 = this.d0.j(this);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Object object2 = new Intent("android.intent.action.VIEW");
        ((Intent)object2).setData(Uri.parse(("https://play.google.com/store/apps/details?id=com.wave.personal&utm_source%3D" + ((CustomerHomeFragment)((m2)object0).a).d.b + "&utm_medium=update_app_announcement")));
        ((Intent)object2).setPackage("com.android.vending");
        return object2;
    }
}

