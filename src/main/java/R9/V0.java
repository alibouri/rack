package R9;

import Ab.t;
import Eb.a;
import Fb.j;
import R2.m;
import W5.f;
import Y8.m2;
import android.net.Uri;
import com.sendwave.backend.fragment.CustomerHomeFragment;
import com.sendwave.backend.fragment.SettingsFragment;
import com.wave.customer.linkedaccounts.typeselect.LinkedAccountTypeSelectParams;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class v0 extends j implements Function2 {
    public int c0;
    public final m d0;

    public v0(m m0, g g0) {
        this.d0 = m0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((v0)this.t(((Uri)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new v0(this.d0, g0);
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
        SettingsFragment settingsFragment0 = ((CustomerHomeFragment)((m2)object0).a).h;
        return new LinkedAccountTypeSelectParams(((m2)object0).a(settingsFragment0.b.i), settingsFragment0.c.a);
    }
}

