package ha;

import Ab.t;
import Bb.n;
import F0.f;
import N4.o;
import Nb.h;
import Nb.j;
import W.d;
import Wc.b;
import Xb.A0;
import Y8.N;
import a9.v0;
import ac.B0;
import android.content.Intent;
import android.net.Uri;
import com.sendwave.models.CurrencyAmount;
import com.sendwave.shared.PayBillDialogResult;
import com.sendwave.shared.paybill.AddOnsFieldSelectWithToggleActivity;
import com.wave.customer.nearbyagents.NearbyAgentsActivity;
import io.sentry.android.core.m;
import ja.i;
import ja.l;
import jb.k;
import k2.w0;
import kb.a;
import kb.c;
import kb.g;
import kb.q;
import kb.r;
import kb.s;
import kb.w;
import kotlin.jvm.functions.Function0;
import l0.e;
import l0.p;
import lb.A;
import lb.B;
import lb.H;
import lb.L;
import lb.y;
import lb.z;
import o9.E0;
import o9.Y0;
import pa.D;
import q9.N0;
import q9.j2;
import q9.r1;
import q9.t1;
import s.E;

public final class a0 extends h implements Function0 {
    public final int g0;

    public a0(int v, Object object0, Class class0, String s, String s1, int v1, int v2) {
        this.g0 = v2;
        super(v, v1, class0, object0, s, s1);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        E e15;
        e e14;
        E e13;
        E e8;
        e e7;
        E e6;
        p p1;
        d d12;
        d d11;
        e e12;
        E e11;
        d d8;
        int v14;
        E e10;
        E e9;
        long[] arr_v5;
        Object[] arr_object5;
        E e5;
        d d6;
        d d5;
        long[] arr_v2;
        Object[] arr_object2;
        int v6;
        long[] arr_v1;
        Object[] arr_object1;
        switch(this.g0) {
            case 0: {
                ((b0)this.Y).Z.getClass();
                k1 k10 = new k1(((b0)this.Y).Z, null);
                N.k(((b0)this.Y).Z, ((b0)this.Y).Z.r0, true, k10);
                return t.a;
            }
            case 1: {
                b0 b00 = (b0)this.Y;
                O o0 = b00.Y;
                o0.getClass();
                b b0 = new b();  // initializer: LXc/d;-><init>()V
                b b1 = b0.h(b0.Y.f().w(1, b0.X)).i();
                if(b1.d() < System.currentTimeMillis()) {
                    b1 = b1.h(b1.Y.E().a(1, b1.X));
                }
                o0.c.U(O.e[0], b1);
                b00.Z.getClass();
                a1 a10 = new a1(b00.Z, null);
                N.k(b00.Z, b00.Z.r0, true, a10);
                return t.a;
            }
            case 2: {
                ((b0)this.Y).Z.getClass();
                Z0 z00 = new Z0(((b0)this.Y).Z, null);
                N.k(((b0)this.Y).Z, ((b0)this.Y).Z.r0, true, z00);
                return t.a;
            }
            case 3: {
                ((b0)this.Y).Z.getClass();
                f1 f10 = new f1(((b0)this.Y).Z, null);
                N.k(((b0)this.Y).Z, ((b0)this.Y).Z.r0, true, f10);
                return t.a;
            }
            case 4: {
                l l0 = ((b0)this.Y).Z.A1;
                j.f(l0.Z, "<this>");
                l0.Z.d("click overdraft button", null);
                i i0 = new i(l0, null);
                N.j(l0, l0.c0, true, i0);
                return t.a;
            }
            case 5: {
                B9.b b2 = ((S2)this.Y).p0.c();
                if(b2 != null) {
                    Object object0 = b2.d(t1.f0);
                    if(object0 != null) {
                        return object0;
                    }
                }
                return new j2();  // initializer: Ljava/lang/Object;-><init>()V
            }
            case 6: {
                ((w0)this.Y).d.l(Boolean.TRUE);
                return t.a;
            }
            case 7: {
                ((w0)this.Y).d.l(Boolean.FALSE);
                return t.a;
            }
            case 8: {
                ((w0)this.Y).d.l(Boolean.FALSE);
                return t.a;
            }
            case 9: {
                w w0 = (w)this.Y;
                if(w0.f0 == null || !w0.f0.b()) {
                    g g0 = (g)w0.h0.a();
                    if(g0 != null) {
                        g0.g0();
                    }
                }
                else {
                    A0 a00 = w0.f0;
                    if(a00 != null) {
                        a00.f(null);
                        return t.a;
                    }
                }
                return t.a;
            }
            case 10: {
                B0 b01 = ((w)this.Y).e0;
                do {
                    Object object1 = b01.getValue();
                    r r0 = (r)object1;
                    if(r0 instanceof kb.p) {
                        kb.d d0 = ((kb.p)r0).d;
                        if(d0 instanceof kb.b) {
                            r0 = kb.p.a(((kb.p)r0), null, null, null, new a(((kb.b)d0).a), null, false, 0x77);
                        }
                        else {
                            if(!d0.equals(c.a) && !(d0 instanceof a)) {
                                throw new Ab.e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                            }
                            r0 = (kb.p)r0;
                        }
                    }
                    else if(!j.a(r0, q.b) && !j.a(r0, q.a)) {
                        throw new Ab.e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                    }
                }
                while(!b01.j(object1, r0));
                return t.a;
            }
            case 11: {
                B0 b02 = ((w)this.Y).e0;
                do {
                    Object object2 = b02.getValue();
                    r r1 = (r)object2;
                    if(r1 instanceof kb.p) {
                        kb.d d1 = ((kb.p)r1).d;
                        if(d1 instanceof a) {
                            r1 = kb.p.a(((kb.p)r1), null, null, null, new kb.b(((a)d1).a), null, false, 0x77);
                        }
                        else {
                            if(!d1.equals(c.a) && !(d1 instanceof kb.b)) {
                                throw new Ab.e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                            }
                            r1 = (kb.p)r1;
                        }
                    }
                    else if(!j.a(r1, q.b) && !j.a(r1, q.a)) {
                        throw new Ab.e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                    }
                }
                while(!b02.j(object2, r1));
                return t.a;
            }
            case 12: {
                w w1 = (w)this.Y;
                B0 b03 = w1.e0;
                r r2 = (r)b03.getValue();
                if(r2 instanceof kb.p) {
                    CurrencyAmount currencyAmount0 = ((kb.p)r2).i;
                    String s = String.valueOf((currencyAmount0 == null ? null : N0.a(currencyAmount0)));
                    jb.g g1 = new jb.g(r1.d(0x7F1202FB, new Object[0]), ((kb.p)r2).a.b);  // string:pay_bill_bill_type "Bill type"
                    jb.g g2 = new jb.g(o.y(((kb.p)r2).a, "invoice_reference").c, ((kb.p)r2).b.c);
                    jb.i i1 = new jb.i(r1.d(0x7F12030A, new Object[0]), s);  // string:pay_bill_total "Total"
                    b03.l(null, kb.p.a(((kb.p)r2), null, null, null, null, new k(n.r0(new jb.j[]{g1, (w1.g0 == null ? null : new jb.g(w1.g0.Y, w1.g0.b())), g2, jb.h.a, i1})), false, 0x5F));
                    return t.a;
                }
                if(!j.a(r2, q.b) && !j.a(r2, q.a)) {
                    throw new Ab.e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                }
                return t.a;
            }
            case 13: {
                ((w)this.Y).getClass();
                s s1 = new s(((w)this.Y), null);
                ((w)this.Y).f0 = N.k(((w)this.Y), ((w)this.Y).h0, true, s1);
                return t.a;
            }
            case 14: {
                B0 b04 = ((w)this.Y).e0;
                do {
                    Object object3 = b04.getValue();
                    r r3 = (r)object3;
                    if(r3 instanceof kb.p) {
                        r3 = kb.p.a(((kb.p)r3), null, null, null, null, null, false, 0x5F);
                    }
                    else if(!j.a(r3, q.b) && !j.a(r3, q.a)) {
                        throw new Ab.e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                    }
                }
                while(!b04.j(object3, r3));
                return t.a;
            }
            case 15: {
                E e0 = ((e)this.Y).e;
                Object[] arr_object = e0.b;
                long[] arr_v = e0.a;
                int v = arr_v.length - 2;
                E e1 = ((e)this.Y).c;
                e e2 = (e)this.Y;
                if(v >= 0) {
                    int v1 = 0;
                    while(true) {
                        long v2 = arr_v[v1];
                        if((~v2 << 7 & v2 & 0x8080808080808080L) == 0x8080808080808080L) {
                            goto label_246;
                        }
                        int v3 = 8 - (~(v1 - v) >>> 0x1F);
                        int v4 = 0;
                        while(v4 < v3) {
                            if((v2 & 0xFFL) < 0x80L) {
                                g0.n n0 = (g0.n)(((l0.k)arr_object[(v1 << 3) + v4]));
                                g0.n n1 = n0.X;
                                if(n1.k0) {
                                    d d2 = null;
                                    while(n1 != null) {
                                        if(n1 instanceof l0.q) {
                                            e1.a(((l0.q)n1));
                                            arr_object1 = arr_object;
                                            arr_v1 = arr_v;
                                        }
                                        else if((n1.Z & 0x400) == 0 || !(n1 instanceof F0.n)) {
                                            arr_object1 = arr_object;
                                            arr_v1 = arr_v;
                                        }
                                        else {
                                            g0.n n2 = ((F0.n)n1).m0;
                                            arr_object1 = arr_object;
                                            int v5 = 0;
                                            while(n2 != null) {
                                                if((n2.Z & 0x400) != 0) {
                                                    ++v5;
                                                    if(v5 == 1) {
                                                        n1 = n2;
                                                    }
                                                    else {
                                                        if(d2 == null) {
                                                            v6 = v5;
                                                            d2 = new d(new g0.n[16]);
                                                        }
                                                        else {
                                                            v6 = v5;
                                                        }
                                                        if(n1 != null) {
                                                            d2.c(n1);
                                                            n1 = null;
                                                        }
                                                        d2.c(n2);
                                                        v5 = v6;
                                                    }
                                                }
                                                n2 = n2.d0;
                                                arr_v = arr_v;
                                            }
                                            arr_v1 = arr_v;
                                            if(v5 == 1) {
                                                goto label_169;
                                            }
                                        }
                                        n1 = f.f(d2);
                                    label_169:
                                        arr_object = arr_object1;
                                        arr_v = arr_v1;
                                    }
                                    arr_object2 = arr_object;
                                    arr_v2 = arr_v;
                                    g0.n n3 = n0.X;
                                    if(n3.k0) {
                                        d d3 = new d(new g0.n[16]);
                                        g0.n n4 = n3.d0;
                                        if(n4 == null) {
                                            f.b(d3, n3);
                                        }
                                        else {
                                            d3.c(n4);
                                        }
                                        while(true) {
                                            if(!d3.n()) {
                                                goto label_237;
                                            }
                                            g0.n n5 = (g0.n)d3.p(d3.Z - 1);
                                            if((n5.b0 & 0x400) == 0) {
                                                f.b(d3, n5);
                                            }
                                            else {
                                                while(n5 != null) {
                                                    if((n5.Z & 0x400) != 0) {
                                                        d d4 = null;
                                                        while(n5 != null) {
                                                            if(n5 instanceof l0.q) {
                                                                e1.a(((l0.q)n5));
                                                                d5 = d3;
                                                            }
                                                            else if((n5.Z & 0x400) == 0 || !(n5 instanceof F0.n)) {
                                                                d5 = d3;
                                                            }
                                                            else {
                                                                g0.n n6 = ((F0.n)n5).m0;
                                                                int v7 = 0;
                                                                while(n6 != null) {
                                                                    if((n6.Z & 0x400) == 0) {
                                                                        d6 = d3;
                                                                    }
                                                                    else {
                                                                        ++v7;
                                                                        if(v7 == 1) {
                                                                            d6 = d3;
                                                                            n5 = n6;
                                                                        }
                                                                        else {
                                                                            if(d4 == null) {
                                                                                d6 = d3;
                                                                                d4 = new d(new g0.n[16]);
                                                                            }
                                                                            else {
                                                                                d6 = d3;
                                                                            }
                                                                            if(n5 != null) {
                                                                                d4.c(n5);
                                                                                n5 = null;
                                                                            }
                                                                            d4.c(n6);
                                                                        }
                                                                    }
                                                                    n6 = n6.d0;
                                                                    d3 = d6;
                                                                }
                                                                d5 = d3;
                                                                if(v7 == 1) {
                                                                    goto label_227;
                                                                }
                                                            }
                                                            n5 = f.f(d4);
                                                        label_227:
                                                            d3 = d5;
                                                        }
                                                        break;
                                                    }
                                                    n5 = n5.d0;
                                                    d3 = d3;
                                                }
                                            }
                                        }
                                    }
                                    throw new IllegalStateException("visitChildren called on an unattached node");
                                }
                                else {
                                    arr_object2 = arr_object;
                                    arr_v2 = arr_v;
                                    goto label_237;
                                }
                                goto label_235;
                            }
                            else {
                            label_235:
                                arr_object2 = arr_object;
                                arr_v2 = arr_v;
                            }
                        label_237:
                            v2 >>= 8;
                            ++v4;
                            arr_object = arr_object2;
                            arr_v = arr_v2;
                        }
                        Object[] arr_object3 = arr_object;
                        long[] arr_v3 = arr_v;
                        if(v3 == 8) {
                            goto label_248;
                        label_246:
                            arr_object3 = arr_object;
                            arr_v3 = arr_v;
                        label_248:
                            if(v1 != v) {
                                ++v1;
                                arr_object = arr_object3;
                                arr_v = arr_v3;
                                continue;
                            }
                        }
                        goto label_253;
                    }
                }
                else {
                label_253:
                    e0.b();
                    e e3 = e2;
                    E e4 = e3.d;
                    Object[] arr_object4 = e4.b;
                    long[] arr_v4 = e4.a;
                    int v8 = arr_v4.length - 2;
                    e5 = e3.f;
                    if(v8 >= 0) {
                        int v9 = 0;
                        while(true) {
                            long v10 = arr_v4[v9];
                            if((~v10 << 7 & v10 & 0x8080808080808080L) == 0x8080808080808080L) {
                                goto label_432;
                            }
                            int v11 = 8 - (~(v9 - v8) >>> 0x1F);
                            int v12 = 0;
                            while(v12 < v11) {
                                if((v10 & 0xFFL) < 0x80L) {
                                    l0.c c0 = (l0.c)arr_object4[(v9 << 3) + v12];
                                    arr_object5 = arr_object4;
                                    g0.n n7 = (g0.n)c0;
                                    arr_v5 = arr_v4;
                                    g0.n n8 = n7.X;
                                    p p0 = p.Z;
                                    if(n7.X.k0) {
                                        g0.n n9 = n8;
                                        boolean z = true;
                                        boolean z1 = false;
                                        l0.q q0 = null;
                                        d d7 = null;
                                        while(n9 != null) {
                                            if(n9 instanceof l0.q) {
                                                if(q0 != null) {
                                                    z1 = true;
                                                }
                                                if(e1.c(((l0.q)n9))) {
                                                    e5.a(((l0.q)n9));
                                                    z = false;
                                                }
                                                q0 = (l0.q)n9;
                                                goto label_329;
                                            }
                                            else if((n9.Z & 0x400) == 0 || !(n9 instanceof F0.n)) {
                                            label_329:
                                                e11 = e4;
                                                e12 = e3;
                                                e9 = e0;
                                            }
                                            else {
                                                g0.n n10 = ((F0.n)n9).m0;
                                                e9 = e0;
                                                int v13 = 0;
                                                while(n10 != null) {
                                                    if((n10.Z & 0x400) == 0) {
                                                        e10 = e4;
                                                    }
                                                    else {
                                                        ++v13;
                                                        if(v13 == 1) {
                                                            e10 = e4;
                                                            n9 = n10;
                                                        }
                                                        else {
                                                            if(d7 == null) {
                                                                e10 = e4;
                                                                v14 = v13;
                                                                d8 = new d(new g0.n[16]);
                                                            }
                                                            else {
                                                                e10 = e4;
                                                                v14 = v13;
                                                                d8 = d7;
                                                            }
                                                            if(n9 != null) {
                                                                d8.c(n9);
                                                                n9 = null;
                                                            }
                                                            d8.c(n10);
                                                            d7 = d8;
                                                            v13 = v14;
                                                        }
                                                    }
                                                    n10 = n10.d0;
                                                    e3 = e3;
                                                    e4 = e10;
                                                }
                                                e11 = e4;
                                                e12 = e3;
                                                if(v13 == 1) {
                                                    goto label_333;
                                                }
                                            }
                                            n9 = f.f(d7);
                                        label_333:
                                            p0 = p0;
                                            e0 = e9;
                                            e3 = e12;
                                            e4 = e11;
                                        }
                                        e6 = e4;
                                        e7 = e3;
                                        e8 = e0;
                                        g0.n n11 = n7.X;
                                        if(!n11.k0) {
                                            throw new IllegalStateException("visitChildren called on an unattached node");
                                        }
                                        d d9 = new d(new g0.n[16]);
                                        g0.n n12 = n11.d0;
                                        if(n12 == null) {
                                            f.b(d9, n11);
                                        }
                                        else {
                                            d9.c(n12);
                                        }
                                    label_349:
                                        while(d9.n()) {
                                            g0.n n13 = (g0.n)d9.p(d9.Z - 1);
                                            if((n13.b0 & 0x400) == 0) {
                                                f.b(d9, n13);
                                            }
                                            else {
                                                while(n13 != null) {
                                                    if((n13.Z & 0x400) != 0) {
                                                        d d10 = null;
                                                        while(n13 != null) {
                                                            if(n13 instanceof l0.q) {
                                                                if(q0 != null) {
                                                                    z1 = true;
                                                                }
                                                                if(e1.c(((l0.q)n13))) {
                                                                    e5.a(((l0.q)n13));
                                                                    z = false;
                                                                }
                                                                q0 = (l0.q)n13;
                                                                d11 = d9;
                                                            }
                                                            else if((n13.Z & 0x400) == 0 || !(n13 instanceof F0.n)) {
                                                                d11 = d9;
                                                            }
                                                            else {
                                                                g0.n n14 = ((F0.n)n13).m0;
                                                                int v15 = 0;
                                                                while(n14 != null) {
                                                                    if((n14.Z & 0x400) == 0) {
                                                                        d12 = d9;
                                                                    }
                                                                    else {
                                                                        ++v15;
                                                                        if(v15 == 1) {
                                                                            d12 = d9;
                                                                            n13 = n14;
                                                                        }
                                                                        else {
                                                                            if(d10 == null) {
                                                                                d12 = d9;
                                                                                d10 = new d(new g0.n[16]);
                                                                            }
                                                                            else {
                                                                                d12 = d9;
                                                                            }
                                                                            if(n13 != null) {
                                                                                d10.c(n13);
                                                                                n13 = null;
                                                                            }
                                                                            d10.c(n14);
                                                                        }
                                                                    }
                                                                    n14 = n14.d0;
                                                                    d9 = d12;
                                                                }
                                                                d11 = d9;
                                                                if(v15 == 1) {
                                                                    goto label_396;
                                                                }
                                                            }
                                                            n13 = f.f(d10);
                                                        label_396:
                                                            d9 = d11;
                                                        }
                                                        continue label_349;
                                                    }
                                                    n13 = n13.d0;
                                                    d9 = d9;
                                                }
                                            }
                                            d9 = d9;
                                        }
                                        if(z) {
                                            if(z1) {
                                                p1 = l0.d.o(c0);
                                            }
                                            else {
                                                p1 = q0 == null ? p0 : q0.y0();
                                            }
                                            c0.z(p1);
                                        }
                                    }
                                    else {
                                        c0.z(p0);
                                        e6 = e4;
                                        e7 = e3;
                                        e8 = e0;
                                    }
                                }
                                else {
                                    e6 = e4;
                                    arr_object5 = arr_object4;
                                    arr_v5 = arr_v4;
                                    e7 = e3;
                                    e8 = e0;
                                }
                                v10 >>= 8;
                                ++v12;
                                arr_object4 = arr_object5;
                                arr_v4 = arr_v5;
                                e0 = e8;
                                e3 = e7;
                                e4 = e6;
                            }
                            e13 = e4;
                            Object[] arr_object6 = arr_object4;
                            long[] arr_v6 = arr_v4;
                            e14 = e3;
                            e15 = e0;
                            if(v11 == 8) {
                                goto label_437;
                            label_432:
                                e13 = e4;
                                arr_object6 = arr_object4;
                                arr_v6 = arr_v4;
                                e14 = e3;
                                e15 = e0;
                            label_437:
                                if(v9 != v8) {
                                    ++v9;
                                    arr_object4 = arr_object6;
                                    arr_v4 = arr_v6;
                                    e0 = e15;
                                    e3 = e14;
                                    e4 = e13;
                                    continue;
                                }
                            }
                            break;
                        }
                    }
                    else {
                        e13 = e4;
                        e14 = e3;
                        e15 = e0;
                    }
                }
                e13.b();
                Object[] arr_object7 = e1.b;
                long[] arr_v7 = e1.a;
                int v16 = arr_v7.length - 2;
                if(v16 >= 0) {
                    int v17 = 0;
                    while(true) {
                        long v18 = arr_v7[v17];
                        if((~v18 << 7 & v18 & 0x8080808080808080L) == 0x8080808080808080L) {
                            goto label_470;
                        }
                        int v19 = 8 - (~(v17 - v16) >>> 0x1F);
                        for(int v20 = 0; v20 < v19; ++v20) {
                            if((v18 & 0xFFL) < 0x80L) {
                                l0.q q1 = (l0.q)arr_object7[(v17 << 3) + v20];
                                if(q1.k0) {
                                    p p2 = q1.y0();
                                    q1.B0();
                                    if(p2 != q1.y0() || e5.c(q1)) {
                                        l0.d.z(q1);
                                    }
                                }
                            }
                            v18 >>= 8;
                        }
                        if(v19 == 8) {
                        label_470:
                            if(v17 != v16) {
                                ++v17;
                                continue;
                            }
                        }
                        goto label_473;
                    }
                }
                else {
                label_473:
                    e1.b();
                    e5.b();
                    e14.b.invoke();
                    if(e15.g()) {
                        if(e13.g()) {
                            if(e1.g()) {
                                return t.a;
                            }
                            M6.b.T("Unprocessed FocusTarget nodes");
                            throw null;
                        }
                        M6.b.T("Unprocessed FocusEvent nodes");
                        throw null;
                    }
                }
                M6.b.T("Unprocessed FocusProperties nodes");
                throw null;
            }
            case 16: {
                androidx.compose.ui.focus.b b3 = (androidx.compose.ui.focus.b)this.Y;
                if(b3.f.y0() == p.Z) {
                    b3.c.invoke();
                }
                return t.a;
            }
            case 17: {
                L l1 = (L)this.Y;
                B b4 = (B)l1.d0.getValue();
                if(!(b4 instanceof z) && !(b4 instanceof y)) {
                    if(b4 instanceof lb.w) {
                        if(((lb.w)b4).d.p) {
                            l1.p(((lb.w)b4).g.c);
                            return t.a;
                        }
                        l1.o();
                        return t.a;
                    }
                    if(!(b4 instanceof A)) {
                        throw new Ab.e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                    }
                    switch(((A)b4).g.size()) {
                        case 0: {
                            break;
                        }
                        case 1: {
                            if(((A)b4).d.p) {
                                l1.p(((v0)Bb.p.o0(((A)b4).g)).c);
                                return t.a;
                            }
                            l1.o();
                            return t.a;
                        }
                        default: {
                            l1.o();
                            return t.a;
                        }
                    }
                }
                return t.a;
            }
            case 18: {
                ((L)this.Y).o();
                return t.a;
            }
            case 19: {
                ((L)this.Y).getClass();
                H h0 = new H(((L)this.Y), null);
                ((L)this.Y).e0 = N.k(((L)this.Y), ((L)this.Y).g0, true, h0);
                return t.a;
            }
            case 20: {
                L l2 = (L)this.Y;
                B0 b05 = l2.d0;
                B b5 = (B)b05.getValue();
                if(l2.e0 == null || !l2.e0.b()) {
                    if(b5.a() != null) {
                        b05.l(null, b5.c(null));
                        return t.a;
                    }
                    lb.c c1 = (lb.c)l2.g0.a();
                    if(c1 != null) {
                        c1.g0();
                    }
                }
                else {
                    A0 a01 = l2.e0;
                    if(a01 != null) {
                        a01.f(null);
                        return t.a;
                    }
                }
                return t.a;
            }
            case 21: {
                B0 b06 = ((L)this.Y).d0;
                do {
                    Object object4 = b06.getValue();
                }
                while(!b06.j(object4, ((B)object4).c(null)));
                return t.a;
            }
            case 22: {
                lb.c c2 = (lb.c)((L)this.Y).g0.a();
                if(c2 != null) {
                    c2.Y(new PayBillDialogResult(null));
                }
                return t.a;
            }
            case 23: {
                ((Y0)this.Y).getClass();
                E0 e00 = new E0(((Y0)this.Y), null);
                N.k(((Y0)this.Y), ((Y0)this.Y).l0, true, e00);
                return t.a;
            }
            case 24: {
                ((oa.t)this.Y).o("");
                ((oa.t)this.Y).c0.d("Clear search", null);
                return t.a;
            }
            case 25: {
                ((AddOnsFieldSelectWithToggleActivity)this.Y).getClass();
                m m0 = new m(3, ((AddOnsFieldSelectWithToggleActivity)this.Y));
                ((AddOnsFieldSelectWithToggleActivity)this.Y).runOnUiThread(m0);
                return t.a;
            }
            case 26: {
                ((D)this.Y).getClass();
                ((D)this.Y).q(false);
                return t.a;
            }
            case 27: {
                ((NearbyAgentsActivity)this.Y).getClass();
                ((NearbyAgentsActivity)this.Y).K0.a(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:com.wave.personal")));
                return t.a;
            }
            case 28: {
                ((D)this.Y).q(true);
                return t.a;
            }
            default: {
                ((D)this.Y).getClass();
                ((D)this.Y).q(false);
                return t.a;
            }
        }
    }
}

