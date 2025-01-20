package d3;

import Eb.a;
import W5.f;
import Y2.c;
import i3.i;
import i3.k;
import j3.h;
import java.util.ArrayList;

public final class j {
    public final i a;
    public final ArrayList b;
    public final int c;
    public final i d;
    public final h e;
    public final c f;
    public final boolean g;

    public j(i i0, ArrayList arrayList0, int v, i i1, h h0, c c0, boolean z) {
        this.a = i0;
        this.b = arrayList0;
        this.c = v;
        this.d = i1;
        this.e = h0;
        this.f = c0;
        this.g = z;
    }

    public final void a(i i0, d3.h h0) {
        i i1 = this.a;
        if(i0.a != i1.a) {
            throw new IllegalStateException(("Interceptor \'" + h0 + "\' cannot modify the request\'s context.").toString());
        }
        if(i0.b == k.b) {
            throw new IllegalStateException(("Interceptor \'" + h0 + "\' cannot set the request\'s data to null.").toString());
        }
        if(i0.c != i1.c) {
            throw new IllegalStateException(("Interceptor \'" + h0 + "\' cannot modify the request\'s target.").toString());
        }
        if(i0.w != i1.w) {
            throw new IllegalStateException(("Interceptor \'" + h0 + "\' cannot modify the request\'s lifecycle.").toString());
        }
        if(i0.x != i1.x) {
            throw new IllegalStateException(("Interceptor \'" + h0 + "\' cannot modify the request\'s size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
        }
    }

    public final Object b(i i0, Fb.c c0) {
        d3.h h1;
        j j1;
        d3.i i1;
        if(c0 instanceof d3.i) {
            i1 = (d3.i)c0;
            int v = i1.f0;
            if((v & 0x80000000) == 0) {
                i1 = new d3.i(this, c0);
            }
            else {
                i1.f0 = v ^ 0x80000000;
            }
        }
        else {
            i1 = new d3.i(this, c0);
        }
        Object object0 = i1.d0;
        Object object1 = a.X;
        switch(i1.f0) {
            case 0: {
                f.b0(object0);
                ArrayList arrayList0 = this.b;
                int v1 = this.c;
                if(v1 > 0) {
                    this.a(i0, ((d3.h)arrayList0.get(v1 - 1)));
                }
                d3.h h0 = (d3.h)arrayList0.get(v1);
                j j0 = new j(this.a, arrayList0, v1 + 1, i0, this.e, this.f, this.g);
                i1.b0 = this;
                i1.c0 = h0;
                i1.f0 = 1;
                object0 = h0.d(j0, i1);
                if(object0 == object1) {
                    return object1;
                }
                j1 = this;
                h1 = h0;
                break;
            }
            case 1: {
                h1 = i1.c0;
                j1 = i1.b0;
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        j1.a(((i3.j)object0).a(), h1);
        return (i3.j)object0;
    }
}

