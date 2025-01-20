package G0;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Zb.b;
import Zb.i;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.provider.Settings.Global;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class d1 extends j implements Function2 {
    public b c0;
    public int d0;
    public Object e0;
    public final ContentResolver f0;
    public final Uri g0;
    public final e1 h0;
    public final i i0;
    public final Context j0;

    public d1(ContentResolver contentResolver0, Uri uri0, e1 e10, i i0, Context context0, g g0) {
        this.f0 = contentResolver0;
        this.g0 = uri0;
        this.h0 = e10;
        this.i0 = i0;
        this.j0 = context0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((d1)this.t(((ac.i)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        d1 d10 = new d1(this.f0, this.g0, this.h0, this.i0, this.j0, g0);
        d10.e0 = object0;
        return d10;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        ac.i i1;
        b b1;
        b b0;
        ac.i i0;
        Object object1 = a.X;
        e1 e10 = this.h0;
        ContentResolver contentResolver0 = this.f0;
        switch(this.d0) {
            case 0: {
                f.b0(object0);
                i0 = (ac.i)this.e0;
                contentResolver0.registerContentObserver(this.g0, false, e10);
                try {
                    b0 = new b(this.i0);
                    goto label_19;
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            case 1: {
                b1 = this.c0;
                i1 = (ac.i)this.e0;
                try {
                    f.b0(object0);
                    goto label_28;
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            case 2: {
                b1 = this.c0;
                i1 = (ac.i)this.e0;
                try {
                    f.b0(object0);
                    while(true) {
                        i0 = i1;
                        b0 = b1;
                    label_19:
                        this.e0 = i0;
                        this.c0 = b0;
                        this.d0 = 1;
                        Object object2 = b0.a(this);
                        if(object2 == object1) {
                            return object1;
                        }
                        i1 = i0;
                        object0 = object2;
                        b1 = b0;
                    label_28:
                        if(!((Boolean)object0).booleanValue()) {
                            goto label_40;
                        }
                        b1.b();
                        Float float0 = new Float(Settings.Global.getFloat(this.j0.getContentResolver(), "animator_duration_scale", 1.0f));
                        this.e0 = i1;
                        this.c0 = b1;
                        this.d0 = 2;
                        if(i1.c(float0, this) != object1) {
                            continue;
                        }
                        return object1;
                    }
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        contentResolver0.unregisterContentObserver(e10);
        throw throwable0;
    label_40:
        contentResolver0.unregisterContentObserver(e10);
        return t.a;
    }
}

