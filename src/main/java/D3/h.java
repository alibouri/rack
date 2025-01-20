package d3;

import Ab.k;
import Bb.p;
import Eb.a;
import Nb.j;
import Nb.w;
import W5.f;
import Xb.J;
import Y2.c;
import Y2.m;
import a3.g;
import a3.o;
import a3.t;
import a8.Q;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import c3.e;
import coil.memory.MemoryCache.Key;
import g3.b;
import i3.i;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import m3.l;

public final class h {
    public final m a;
    public final l b;
    public final Q c;
    public final b d;

    public h(m m0, l l0, Q q0) {
        this.a = m0;
        this.b = l0;
        this.c = q0;
        this.d = new b(m0, q0);
    }

    public static final Object a(h h0, c3.m m0, Y2.b b0, i i0, Object object0, i3.m m1, c c0, Fb.c c1) {
        k k0;
        d3.b b5;
        c3.m m5;
        Y2.b b3;
        c3.m m3;
        d3.b b2;
        int v1;
        c c2;
        i3.m m2;
        Object object3;
        i i1;
        h h1;
        d3.b b1;
        h0.getClass();
        if(c1 instanceof d3.b) {
            b1 = (d3.b)c1;
            int v = b1.l0;
            if((v & 0x80000000) == 0) {
                h1 = h0;
                b1 = new d3.b(h1, c1);
            }
            else {
                b1.l0 = v ^ 0x80000000;
                h1 = h0;
            }
        }
        else {
            h1 = h0;
            b1 = new d3.b(h1, c1);
        }
        Object object1 = b1.j0;
        Object object2 = a.X;
        String s = null;
        switch(b1.l0) {
            case 0: {
                f.b0(object1);
                i1 = i0;
                object3 = object0;
                m2 = m1;
                c2 = c0;
                v1 = 0;
                b2 = b1;
                m3 = m0;
                b3 = b0;
                goto label_54;
            }
            case 1: {
                int v2 = b1.i0;
                c c3 = b1.h0;
                i3.m m4 = b1.g0;
                Object object4 = b1.f0;
                i i2 = b1.e0;
                Y2.b b4 = b1.d0;
                m5 = b1.c0;
                h h2 = b1.b0;
                f.b0(object1);
                b5 = b1;
                b3 = b4;
                v1 = v2;
                h1 = h2;
                c2 = c3;
                i1 = i2;
                m2 = m4;
                object3 = object4;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            c2.getClass();
            if(((g)object1) != null) {
                a3.f f0 = m5.c;
                o o0 = m5.a instanceof o ? ((o)m5.a) : null;
                if(o0 != null) {
                    s = o0.Z;
                }
                return new d3.a(((g)object1).a, ((g)object1).b, f0, s);
            }
            m3 = m5;
            b2 = b5;
        label_54:
            List list0 = b3.e;
            int v3 = list0.size();
            while(true) {
                k0 = null;
                if(v1 < v3) {
                    a3.i i3 = ((a3.h)list0.get(v1)).a(m3, m2);
                    if(i3 == null) {
                        ++v1;
                        continue;
                    }
                    else {
                        k0 = new k(i3, v1);
                    }
                }
                break;
            }
            if(k0 != null) {
                int v4 = ((Number)k0.Y).intValue();
                c2.getClass();
                b2.b0 = h1;
                b2.c0 = m3;
                b2.d0 = b3;
                b2.e0 = i1;
                b2.f0 = object3;
                b2.g0 = m2;
                b2.h0 = c2;
                b2.i0 = v4 + 1;
                b2.l0 = 1;
                Object object5 = ((a3.i)k0.X).a(b2);
                if(object5 != object2) {
                    m5 = m3;
                    object1 = object5;
                    v1 = v4 + 1;
                    b5 = b2;
                    continue;
                }
                return object2;
            }
            break;
        }
        throw new IllegalStateException(("Unable to create a decoder that supports: " + object3).toString());
    }

    public static final Object b(h h0, i i0, Object object0, i3.m m0, c c0, Fb.c c1) {
        w w11;
        i i2;
        h h3;
        w w7;
        w w6;
        w w5;
        Object object5;
        i i1;
        Object object4;
        Object object3;
        w w4;
        c c3;
        i3.m m1;
        Y2.b b1;
        w w3;
        t t0;
        w w0;
        d3.c c2;
        h h1 = h0;
        h0.getClass();
        if(c1 instanceof d3.c) {
            c2 = (d3.c)c1;
            int v = c2.l0;
            if((v & 0x80000000) == 0) {
                c2 = new d3.c(h1, c1);
            }
            else {
                c2.l0 = v ^ 0x80000000;
            }
        }
        else {
            c2 = new d3.c(h1, c1);
        }
        Object object1 = c2.j0;
        Object object2 = a.X;
        BitmapDrawable bitmapDrawable0 = null;
        switch(c2.l0) {
            case 0: {
                f.b0(object1);
                w0 = new w();  // initializer: Ljava/lang/Object;-><init>()V
                w0.X = m0;
                w w1 = new w();  // initializer: Ljava/lang/Object;-><init>()V
                w1.X = h1.a.g;
                w w2 = new w();  // initializer: Ljava/lang/Object;-><init>()V
                try {
                    w0.X = h1.c.Y(((i3.m)w0.X));
                    i0.getClass();
                    t0 = i0.g;
                    if(t0 != null) {
                        goto label_26;
                    }
                    goto label_40;
                }
                catch(Throwable throwable0) {
                    w4 = w2;
                    w3 = w4;
                    goto label_128;
                }
                try {
                label_26:
                    Y2.b b0 = (Y2.b)w1.X;
                    b0.getClass();
                    ArrayList arrayList0 = p.R0(b0.a);
                    ArrayList arrayList1 = p.R0(b0.b);
                    ArrayList arrayList2 = p.R0(b0.c);
                    ArrayList arrayList3 = p.R0(b0.d);
                    ArrayList arrayList4 = p.R0(b0.e);
                    if(t0 != null) {
                        arrayList4.add(0, t0);
                    }
                    w1.X = new Y2.b(N4.h.N(arrayList0), N4.h.N(arrayList1), N4.h.N(arrayList2), N4.h.N(arrayList3), N4.h.N(arrayList4));
                }
                catch(Throwable throwable0) {
                    w3 = w2;
                    goto label_128;
                }
                try {
                label_40:
                    b1 = (Y2.b)w1.X;
                    m1 = (i3.m)w0.X;
                    c2.b0 = h1;
                    c2.c0 = i0;
                    c2.d0 = object0;
                    c3 = c0;
                    c2.e0 = c3;
                    c2.f0 = w0;
                    c2.g0 = w1;
                    c2.h0 = w2;
                    c2.i0 = w2;
                    c2.l0 = 1;
                    w4 = w2;
                }
                catch(Throwable throwable0) {
                    w4 = w2;
                    w3 = w4;
                    goto label_128;
                }
                try {
                    object3 = h0.c(b1, i0, object0, m1, c0, c2);
                }
                catch(Throwable throwable0) {
                    w3 = w4;
                    goto label_128;
                }
                if(object3 != object2) {
                    object4 = object3;
                    i1 = i0;
                    object5 = object0;
                    w5 = w1;
                    w6 = w4;
                    w7 = w6;
                    goto label_87;
                }
                break;
            }
            case 1: {
                w w8 = c2.i0;
                w3 = c2.h0;
                w w9 = c2.g0;
                w w10 = c2.f0;
                c c4 = (c)c2.e0;
                Object object6 = c2.d0;
                i1 = c2.c0;
                h h2 = c2.b0;
                try {
                    f.b0(object1);
                    w5 = w9;
                    w0 = w10;
                    c3 = c4;
                    object5 = object6;
                    w7 = w3;
                    object4 = object1;
                    w6 = w8;
                    h1 = h2;
                }
                catch(Throwable throwable0) {
                    goto label_128;
                }
                try {
                label_87:
                    w6.X = object4;
                    Object object7 = w7.X;
                    if(((e)object7) instanceof c3.m) {
                        d d0 = new d(h1, w7, w5, i1, object5, w0, c3, null);
                        c2.b0 = h1;
                        c2.c0 = i1;
                        c2.d0 = c3;
                        c2.e0 = w0;
                        c2.f0 = w7;
                        c2.g0 = null;
                        c2.h0 = null;
                        c2.i0 = null;
                        c2.l0 = 2;
                        object1 = J.y(i1.u, d0, c2);
                        goto label_109;
                    }
                    else {
                        if(!(((e)object7) instanceof c3.d)) {
                            throw new Ab.e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                        }
                        object1 = new d3.a(((c3.d)object7).a, ((c3.d)object7).b, ((c3.d)object7).c, null);
                        goto label_134;
                    }
                    break;
                }
                catch(Throwable throwable0) {
                    w3 = w7;
                    goto label_128;
                }
            label_109:
                if(object1 != object2) {
                    h3 = h1;
                    w3 = w7;
                    i2 = i1;
                    w11 = w0;
                    goto label_121;
                }
                break;
            }
            case 2: {
                w3 = c2.f0;
                w11 = (w)c2.e0;
                c c5 = (c)c2.d0;
                i2 = c2.c0;
                h3 = c2.b0;
                try {
                    f.b0(object1);
                label_121:
                    object1 = (d3.a)object1;
                    w0 = w11;
                    i1 = i2;
                    h1 = h3;
                    w7 = w3;
                    goto label_134;
                }
                catch(Throwable throwable0) {
                }
            label_128:
                Object object8 = w3.X;
                if(object8 instanceof c3.m) {
                    bitmapDrawable0 = (c3.m)object8;
                }
                if(bitmapDrawable0 != null) {
                    m3.g.a(bitmapDrawable0.a);
                }
                throw throwable0;
            label_134:
                c3.m m2 = w7.X instanceof c3.m ? ((c3.m)w7.X) : null;
                if(m2 != null) {
                    m3.g.a(m2.a);
                }
                i3.m m3 = (i3.m)w0.X;
                c2.b0 = null;
                c2.c0 = null;
                c2.d0 = null;
                c2.e0 = null;
                c2.f0 = null;
                c2.g0 = null;
                c2.h0 = null;
                c2.i0 = null;
                c2.l0 = 3;
                h1.getClass();
                i1.h.getClass();
                if(object1 != object2) {
                    goto label_152;
                }
                break;
            }
            case 3: {
                f.b0(object1);
            label_152:
                object2 = (d3.a)object1;
                Drawable drawable0 = object2.a;
                if(drawable0 instanceof BitmapDrawable) {
                    bitmapDrawable0 = (BitmapDrawable)drawable0;
                }
                if(bitmapDrawable0 != null) {
                    Bitmap bitmap0 = bitmapDrawable0.getBitmap();
                    if(bitmap0 != null) {
                        bitmap0.prepareToDraw();
                    }
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return object2;
    }

    public final Object c(Y2.b b0, i i0, Object object0, i3.m m0, c c0, Fb.c c1) {
        k k0;
        Y2.b b2;
        i i1;
        Y2.b b1;
        h h1;
        d3.e e1;
        int v1;
        c c2;
        i3.m m1;
        Object object3;
        h h0;
        d3.e e0;
        if(c1 instanceof d3.e) {
            e0 = (d3.e)c1;
            int v = e0.k0;
            if((v & 0x80000000) == 0) {
                h0 = this;
                e0 = new d3.e(h0, c1);
            }
            else {
                e0.k0 = v ^ 0x80000000;
                h0 = this;
            }
        }
        else {
            h0 = this;
            e0 = new d3.e(h0, c1);
        }
        Object object1 = e0.i0;
        Object object2 = a.X;
        switch(e0.k0) {
            case 0: {
                f.b0(object1);
                object3 = object0;
                m1 = m0;
                c2 = c0;
                v1 = 0;
                e1 = e0;
                h1 = h0;
                b1 = b0;
                i1 = i0;
                goto label_50;
            }
            case 1: {
                int v2 = e0.h0;
                c c3 = e0.g0;
                i3.m m2 = e0.f0;
                Object object4 = e0.e0;
                i i2 = e0.d0;
                b2 = e0.c0;
                h1 = e0.b0;
                f.b0(object1);
                e1 = e0;
                i1 = i2;
                v1 = v2;
                object3 = object4;
                c2 = c3;
                m1 = m2;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            try {
                c2.getClass();
            }
            catch(Throwable throwable0) {
                c3.m m3 = ((e)object1) instanceof c3.m ? ((c3.m)(((e)object1))) : null;
                if(m3 != null) {
                    m3.g.a(m3.a);
                }
                throw throwable0;
            }
            if(((e)object1) != null) {
                return (e)object1;
            }
            b1 = b2;
        label_50:
            List list0 = b1.d;
            int v3 = list0.size();
            while(true) {
                k0 = null;
                if(v1 >= v3) {
                    break;
                }
                k k1 = (k)list0.get(v1);
                c3.f f0 = (c3.f)k1.X;
                Class class0 = object3.getClass();
                if(((Class)k1.Y).isAssignableFrom(class0)) {
                    j.d(f0, "null cannot be cast to non-null type coil.fetch.Fetcher.Factory<kotlin.Any>");
                    c3.g g0 = f0.a(object3, m1);
                    if(g0 != null) {
                        k0 = new k(g0, v1);
                        break;
                    }
                }
                ++v1;
            }
            if(k0 == null) {
                break;
            }
            v1 = ((Number)k0.Y).intValue() + 1;
            c2.getClass();
            e1.b0 = h1;
            e1.c0 = b1;
            e1.d0 = i1;
            e1.e0 = object3;
            e1.f0 = m1;
            e1.g0 = c2;
            e1.h0 = v1;
            e1.k0 = 1;
            Object object5 = ((c3.g)k0.X).a(e1);
            if(object5 == object2) {
                return object2;
            }
            b2 = b1;
            object1 = object5;
        }
        throw new IllegalStateException(("Unable to create a fetcher that supports: " + object3).toString());
    }

    public final Object d(d3.j j0, Fb.c c0) {
        d3.j j2;
        d3.f f0;
        d3.j j1 = j0;
        b b0 = this.d;
        if(c0 instanceof d3.f) {
            f0 = (d3.f)c0;
            int v = f0.f0;
            if((v & 0x80000000) == 0) {
                f0 = new d3.f(this, c0);
            }
            else {
                f0.f0 = v ^ 0x80000000;
            }
        }
        else {
            f0 = new d3.f(this, c0);
        }
        Object object0 = f0.d0;
        Object object1 = a.X;
        switch(f0.f0) {
            case 0: {
                f.b0(object0);
                try {
                    i i0 = j1.d;
                    j3.h h0 = j1.e;
                    c c1 = j1.f;
                    i3.m m0 = this.c.H(i0, h0);
                    j3.g g0 = m0.e;
                    List list0 = this.a.g.b;
                    int v1 = list0.size();
                    Object object2 = i0.b;
                    int v2 = 0;
                    while(v2 < v1) {
                        k k0 = (k)list0.get(v2);
                        f3.a a0 = (f3.a)k0.X;
                        Class class0 = object2.getClass();
                        if(((Class)k0.Y).isAssignableFrom(class0)) {
                            j.d(a0, "null cannot be cast to non-null type coil.map.Mapper<kotlin.Any, *>");
                            Object object3 = a0.a(object2, m0);
                            if(object3 != null) {
                                object2 = object3;
                            }
                        }
                        ++v2;
                        list0 = list0;
                    }
                    MemoryCache.Key memoryCache$Key0 = b0.l(i0, object2, m0, c1);
                    g3.a a1 = memoryCache$Key0 == null ? null : b0.h(i0, memoryCache$Key0, h0, g0);
                    if(a1 != null) {
                        return b.o(j1, i0, memoryCache$Key0, a1);
                    }
                    d3.g g1 = new d3.g(this, i0, object2, m0, c1, memoryCache$Key0, j0, null);
                    f0.b0 = this;
                    f0.c0 = j1;
                    f0.f0 = 1;
                    object0 = J.y(i0.t, g1, f0);
                    return object0 == object1 ? object1 : object0;
                }
                catch(Throwable throwable0) {
                }
                goto label_54;
            }
            case 1: {
                try {
                    j2 = f0.c0;
                    f.b0(object0);
                    return object0;
                }
                catch(Throwable throwable0) {
                    j1 = j2;
                }
            label_54:
                if(throwable0 instanceof CancellationException) {
                    throw throwable0;
                }
                return Q.l(j1.d, throwable0);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

