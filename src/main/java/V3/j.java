package v3;

import D0.Z;
import E3.f;
import J2.w;
import Nb.k;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable.Callback;
import android.widget.ImageView;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.unit.LayoutDirection;
import g0.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import m0.e;
import n0.t;
import p0.d;
import r3.a;
import r3.i;

public final class j extends k implements Function1 {
    public final Rect X;
    public final D0.j Y;
    public final c Z;
    public final Matrix b0;
    public final r3.j c0;
    public final boolean d0;
    public final boolean e0;
    public final int f0;
    public final int g0;
    public final a h0;
    public final Map i0;
    public final boolean j0;
    public final boolean k0;
    public final boolean l0;
    public final boolean m0;
    public final boolean n0;
    public final boolean o0;
    public final Context p0;
    public final Function0 q0;
    public final MutableState r0;

    public j(Rect rect0, D0.j j0, c c0, Matrix matrix0, r3.j j1, boolean z, boolean z1, int v, int v1, a a0, Map map0, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, Context context0, Function0 function00, MutableState mutableState0) {
        this.X = rect0;
        this.Y = j0;
        this.Z = c0;
        this.b0 = matrix0;
        this.c0 = j1;
        this.d0 = z;
        this.e0 = z1;
        this.f0 = v;
        this.g0 = v1;
        this.h0 = a0;
        this.i0 = map0;
        this.j0 = z2;
        this.k0 = z3;
        this.l0 = z4;
        this.m0 = z5;
        this.n0 = z6;
        this.o0 = z7;
        this.p0 = context0;
        this.q0 = function00;
        this.r0 = mutableState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        Nb.j.f(((d)object0), "$this$Canvas");
        t t0 = ((d)object0).A().o();
        Rect rect0 = this.X;
        long v = w.m(rect0.width(), rect0.height());
        long v1 = io.sentry.config.a.d(Pb.a.H(e.d(((d)object0).d())), Pb.a.H(e.b(((d)object0).d())));
        long v2 = ((d)object0).d();
        long v3 = this.Y.a(v, v2);
        float f = e.d(v);
        float f1 = Z.a(v3);
        float f2 = e.b(v);
        long v4 = io.sentry.config.a.d(((int)(f1 * f)), ((int)(Z.b(v3) * f2)));
        LayoutDirection layoutDirection0 = ((d)object0).getLayoutDirection();
        long v5 = this.Z.a(v4, v1, layoutDirection0);
        Matrix matrix0 = this.b0;
        matrix0.reset();
        matrix0.preTranslate(((float)(((int)(v5 >> 0x20)))), ((float)(((int)(v5 & 0xFFFFFFFFL)))));
        matrix0.preScale(Z.a(v3), Z.b(v3));
        r3.j j0 = this.c0;
        HashSet hashSet0 = (HashSet)j0.g0.X;
        boolean z = this.d0 ? hashSet0.add(r3.k.X) : hashSet0.remove(r3.k.X);
        if(j0.X != null && z) {
            j0.b();
        }
        j0.b0 = this.e0;
        j0.K0 = this.f0;
        j0.c();
        j0.L0 = this.g0;
        boolean z1 = true;
        a a0 = this.h0;
        f f3 = j0.Y;
        if(j0.X != a0) {
            j0.D0 = true;
            if(f3.k0) {
                f3.cancel();
                if(!j0.isVisible()) {
                    j0.J0 = 1;
                }
            }
            j0.X = null;
            j0.j0 = null;
            j0.d0 = null;
            j0.I0 = -3.402823E+38f;
            f3.j0 = null;
            f3.h0 = -2147483648.0f;
            f3.i0 = 2147483648.0f;
            j0.invalidateSelf();
            j0.X = a0;
            j0.b();
            boolean z2 = f3.j0 == null;
            f3.j0 = a0;
            if(z2) {
                f3.j(Math.max(f3.h0, a0.l), Math.min(f3.i0, a0.m));
            }
            else {
                f3.j(((float)(((int)a0.l))), ((float)(((int)a0.m))));
            }
            float f4 = f3.f0;
            f3.f0 = 0.0f;
            f3.e0 = 0.0f;
            f3.i(((float)(((int)f4))));
            f3.g();
            j0.l(f3.getAnimatedFraction());
            ArrayList arrayList0 = j0.c0;
            Iterator iterator0 = new ArrayList(arrayList0).iterator();
            while(iterator0.hasNext()) {
                Object object1 = iterator0.next();
                i i0 = (i)object1;
                if(i0 != null) {
                    i0.run();
                }
                iterator0.remove();
            }
            arrayList0.clear();
            a0.a.getClass();
            j0.c();
            Drawable.Callback drawable$Callback0 = j0.getCallback();
            if(drawable$Callback0 instanceof ImageView) {
                ((ImageView)drawable$Callback0).setImageDrawable(null);
                ((ImageView)drawable$Callback0).setImageDrawable(j0);
            }
        }
        Map map0 = this.i0;
        if(map0 != j0.f0) {
            j0.f0 = map0;
            j0.invalidateSelf();
        }
        if(this.r0.getValue() != null) {
            throw new ClassCastException();
        }
        boolean z3 = this.j0;
        if(j0.l0 != z3) {
            j0.l0 = z3;
            A3.c c0 = j0.j0;
            if(c0 != null) {
                c0.l(z3);
            }
        }
        j0.m0 = this.k0;
        j0.n0 = this.l0;
        j0.h0 = this.m0;
        boolean z4 = this.n0;
        if(z4 != j0.i0) {
            j0.i0 = z4;
            A3.c c1 = j0.j0;
            if(c1 != null) {
                c1.L = z4;
            }
            j0.invalidateSelf();
        }
        boolean z5 = this.o0;
        if(z5 != j0.o0) {
            j0.o0 = z5;
            j0.invalidateSelf();
        }
        x3.f f5 = j0.g();
        if(j0.a(this.p0) || f5 == null) {
            j0.l(((Number)this.q0.invoke()).floatValue());
        }
        else {
            j0.l(f5.b);
        }
        j0.setBounds(0, 0, rect0.width(), rect0.height());
        Canvas canvas0 = n0.d.a(t0);
        A3.c c2 = j0.j0;
        if(c2 != null && j0.X != null) {
            if((j0.L0 == 0 ? 1 : j0.L0) != 2) {
                z1 = false;
            }
            ThreadPoolExecutor threadPoolExecutor0 = r3.j.O0;
            Semaphore semaphore0 = j0.E0;
            r3.f f6 = j0.H0;
            if(z1) {
                try {
                    semaphore0.acquire();
                    if(j0.m()) {
                        j0.l(f3.b());
                    }
                label_116:
                    if(j0.b0) {
                        goto label_126;
                    }
                    else {
                        int v6 = j0.k0;
                        if(j0.p0) {
                            canvas0.save();
                            canvas0.concat(matrix0);
                            j0.i(canvas0, c2);
                            canvas0.restore();
                        }
                        else {
                            c2.e(canvas0, matrix0, v6, null);
                        }
                        goto label_150;
                    }
                    return Ab.t.a;
                }
                catch(InterruptedException unused_ex) {
                }
                catch(Throwable throwable0) {
                    goto label_144;
                }
            }
            else {
                goto label_116;
                try {
                label_126:
                    int v7 = j0.k0;
                    if(j0.p0) {
                        canvas0.save();
                        canvas0.concat(matrix0);
                        j0.i(canvas0, c2);
                        canvas0.restore();
                    }
                    else {
                        c2.e(canvas0, matrix0, v7, null);
                    }
                    goto label_150;
                }
                catch(Throwable unused_ex) {
                    try {
                        E3.d.a.getClass();
                        goto label_150;
                    }
                    catch(InterruptedException unused_ex) {
                    }
                    catch(Throwable throwable0) {
                        goto label_144;
                    }
                }
            }
            if(z1) {
                semaphore0.release();
                float f7 = f3.b();
                if(c2.K != f7) {
                    threadPoolExecutor0.execute(f6);
                    return Ab.t.a;
                }
                return Ab.t.a;
            label_144:
                if(z1) {
                    semaphore0.release();
                    float f8 = f3.b();
                    if(c2.K != f8) {
                        threadPoolExecutor0.execute(f6);
                    }
                }
                throw throwable0;
            label_150:
                j0.D0 = false;
                if(z1) {
                    semaphore0.release();
                    float f9 = f3.b();
                    if(c2.K != f9) {
                        threadPoolExecutor0.execute(f6);
                        return Ab.t.a;
                    }
                }
            }
        }
        return Ab.t.a;
    }
}

