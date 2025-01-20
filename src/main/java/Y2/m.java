package Y2;

import Ab.k;
import Ab.o;
import Bb.p;
import C3.i;
import N4.h;
import W5.f;
import Xb.H;
import Xb.J;
import Xb.r0;
import a8.Q;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.lifecycle.Lifecycle;
import dc.e;
import f3.a;
import i3.c;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.CoroutineContext.Element.DefaultImpls;
import m3.d;
import m3.g;
import m3.j;
import pc.r;
import q9.n;

public final class m {
    public final Context a;
    public final c b;
    public final o c;
    public final j d;
    public final e e;
    public final Q f;
    public final b g;
    public final ArrayList h;

    public m(Context context0, c c0, o o0, o o1, o o2, b b0, j j0) {
        this.a = context0;
        this.b = c0;
        this.c = o0;
        this.d = j0;
        this.e = H.a(DefaultImpls.d(J.c(), dc.o.a.d0).r(new l(this)));
        m3.l l0 = new m3.l(this);
        Q q0 = new Q(this, l0);
        this.f = q0;
        i i0 = new i();  // initializer: Ljava/lang/Object;-><init>()V
        i0.X = p.R0(b0.a);
        i0.Y = p.R0(b0.b);
        i0.Z = p.R0(b0.c);
        i0.b0 = p.R0(b0.d);
        i0.c0 = p.R0(b0.e);
        i0.f(new a(2), r.class);
        i0.f(new a(5), String.class);
        i0.f(new a(1), Uri.class);
        i0.f(new a(4), Uri.class);
        i0.f(new a(3), Integer.class);
        i0.f(new a(0), byte[].class);
        e3.c c1 = new e3.c();  // initializer: Ljava/lang/Object;-><init>()V
        ArrayList arrayList0 = (ArrayList)i0.Z;
        arrayList0.add(new k(c1, Uri.class));
        arrayList0.add(new k(new e3.a(j0.a), File.class));
        i0.e(new c3.i(o2, o1, j0.c), Uri.class);
        i0.e(new c3.a(5), File.class);
        i0.e(new c3.a(0), Uri.class);
        i0.e(new c3.a(3), Uri.class);
        i0.e(new c3.a(6), Uri.class);
        i0.e(new c3.a(4), Drawable.class);
        i0.e(new c3.a(1), Bitmap.class);
        i0.e(new c3.a(2), ByteBuffer.class);
        a3.c c2 = new a3.c(j0.d, j0.e);
        ArrayList arrayList1 = (ArrayList)i0.c0;
        arrayList1.add(c2);
        List list0 = h.N(((ArrayList)i0.X));
        this.g = new b(list0, h.N(((ArrayList)i0.Y)), h.N(arrayList0), h.N(((ArrayList)i0.b0)), h.N(arrayList1));
        this.h = p.G0(list0, new d3.h(this, l0, q0));
        new AtomicBoolean(false);
    }

    public static final Object a(m m0, i3.i i0, int v, Fb.c c0) {
        Y2.c c1;
        Object object3;
        Bitmap bitmap0;
        Object object2;
        m m2;
        Y2.c c2;
        Object object1;
        Object object0;
        Y2.j j0;
        m m1 = m0;
        m0.getClass();
        if(c0 instanceof Y2.j) {
            j0 = (Y2.j)c0;
            int v1 = j0.i0;
            if((v1 & 0x80000000) == 0) {
                j0 = new Y2.j(m1, c0);
            }
            else {
                j0.i0 = v1 ^ 0x80000000;
            }
        }
        else {
            j0 = new Y2.j(m1, c0);
        }
        try {
            object0 = j0.g0;
            object1 = Eb.a.X;
            switch(j0.i0) {
                case 0: {
                    goto label_15;
                }
                case 1: {
                    goto label_43;
                }
                case 2: {
                    goto label_67;
                }
                case 3: {
                    goto label_88;
                }
            }
        }
        catch(Throwable throwable0) {
            c1 = c2;
            m1 = m2;
            goto label_124;
        }
        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
    label_15:
        f.b0(object0);
        Nb.j.c(j0.Y);
        r0 r00 = J.k(j0.Y);
        Q q0 = m1.f;
        q0.getClass();
        Lifecycle lifecycle0 = i0.w;
        k3.b b0 = i0.c;
        i3.o o0 = b0 instanceof k3.a ? new i3.r(((m)q0.Y), i0, ((k3.a)b0), lifecycle0, r00) : new i3.a(lifecycle0, r00);
        o0.h();
        i3.h h0 = i3.i.a(i0);
        h0.b = m1.b;
        h0.v = null;
        i3.i i1 = h0.a();
        c1 = Y2.c.a;
        try {
            if(i1.b == i3.k.b) {
                throw new i3.l("The request\'s data is null.");  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
            }
            o0.start();
            if(v == 0) {
                j0.b0 = m1;
                j0.c0 = o0;
                j0.d0 = i1;
                j0.e0 = c1;
                j0.i0 = 1;
                if(d.a(i1.w, j0) == object1) {
                    return object1;
                }
            }
            goto label_50;
        }
        catch(Throwable throwable0) {
            goto label_124;
        }
        try {
        label_43:
            c2 = j0.e0;
            i1 = j0.d0;
            o0 = j0.c0;
            m2 = j0.b0;
            f.b0(object0);
            c1 = c2;
            m1 = m2;
        }
        catch(Throwable throwable0) {
            c1 = c2;
            m1 = m2;
            goto label_124;
        }
        try {
        label_50:
            if(((g3.c)m1.c.getValue()) != null) {
                i1.getClass();
            }
            Drawable drawable0 = m3.e.b(i1, i1.A, i1.D.j);
            k3.b b1 = i1.c;
            if(b1 != null) {
                b1.a(drawable0);
            }
            c1.getClass();
            j0.b0 = m1;
            j0.c0 = o0;
            j0.d0 = i1;
            j0.e0 = c1;
            j0.f0 = null;
            j0.i0 = 2;
            object2 = i1.x.k(j0);
            if(object2 == object1) {
                return object1;
            }
            bitmap0 = null;
            goto label_77;
        }
        catch(Throwable throwable0) {
            goto label_124;
        }
        try {
        label_67:
            Bitmap bitmap1 = j0.f0;
            c2 = j0.e0;
            i1 = j0.d0;
            o0 = j0.c0;
            m2 = j0.b0;
            f.b0(object0);
            bitmap0 = bitmap1;
            object2 = object0;
            c1 = c2;
            m1 = m2;
        }
        catch(Throwable throwable0) {
            c1 = c2;
            m1 = m2;
            goto label_124;
        }
        try {
        label_77:
            c1.getClass();
            Y2.k k0 = new Y2.k(i1, m1, ((j3.h)object2), c1, bitmap0, null);
            j0.b0 = m1;
            j0.c0 = o0;
            j0.d0 = i1;
            j0.e0 = c1;
            j0.f0 = null;
            j0.i0 = 3;
            object3 = J.y(i1.s, k0, j0);
            if(object3 == object1) {
                return object1;
            }
            goto label_101;
        }
        catch(Throwable throwable0) {
            goto label_124;
        }
        try {
            return object1;
        }
        catch(Throwable throwable1) {
            o0.f();
            throw throwable1;
        }
        try {
        label_88:
            c2 = j0.e0;
            i1 = j0.d0;
            o0 = j0.c0;
            m2 = j0.b0;
            f.b0(object0);
            object3 = object0;
            c1 = c2;
            m1 = m2;
        }
        catch(Throwable throwable0) {
            c1 = c2;
            m1 = m2;
            goto label_124;
        }
        try {
        label_101:
            object1 = (i3.j)object3;
            if(object1 instanceof i3.p) {
                k3.b b2 = i1.c;
                m1.getClass();
                i3.i i2 = ((i3.p)object1).b;
                Drawable drawable1 = ((i3.p)object1).a;
                if(b2 instanceof k3.a) {
                    i2.i.getClass();
                    goto label_111;
                }
                else if(b2 != null) {
                label_111:
                    b2.c(drawable1);
                }
                c1.getClass();
                Q q1 = i2.d;
                if(q1 != null) {
                    hd.c.a.n("AssetLoader");
                    hd.c.a.a("preloaded " + ((String)q1.b0), new Object[0]);
                }
            }
            else {
                if(!(object1 instanceof i3.e)) {
                    throw new Ab.e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                }
                m1.getClass();
                m.d(((i3.e)object1), i1.c, c1);
            }
            goto label_135;
        }
        catch(Throwable throwable0) {
        }
        try {
        label_124:
            if(throwable0 instanceof CancellationException) {
                m1.getClass();
                c1.getClass();
                throw throwable0;
            }
            m1.f.getClass();
            object1 = Q.l(i1, throwable0);
            m.d(((i3.e)object1), i1.c, c1);
        }
        catch(Throwable throwable1) {
            o0.f();
            throw throwable1;
        }
    label_135:
        o0.f();
        return object1;
    }

    public final i3.k b(i3.i i0) {
        Y2.f f0 = new Y2.f(this, i0, null);
        J.d(this.e, null, f0, 3);
        return i0.c instanceof k3.a ? g.c(((k3.a)i0.c).Y).a() : new i3.k(1);
    }

    public final Object c(i3.i i0, Fb.c c0) {
        if(i0.c instanceof k3.a) {
            return H.c(new Y2.h(this, i0, null), c0);
        }
        Y2.i i1 = new Y2.i(this, i0, null);
        return J.y(dc.o.a.d0, i1, c0);
    }

    public static void d(i3.e e0, k3.b b0, Y2.c c0) {
        i3.i i0 = e0.b;
        Drawable drawable0 = e0.a;
        if(b0 instanceof k3.a) {
            i0.i.getClass();
            b0.d(drawable0);
        }
        else if(b0 != null) {
            b0.d(drawable0);
        }
        c0.getClass();
        Q q0 = i0.d;
        if(q0 != null) {
            ((n)q0.Y).getClass();
            n.i(((String)q0.Z), e0.c);
        }
    }
}

