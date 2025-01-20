package M;

import B.L0;
import I.X;
import I2.J;
import Nb.j;
import Nb.k;
import O0.L;
import O0.c;
import O0.f;
import U.Z;
import U.d;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.TextToolbar;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import l0.m;
import m0.b;
import s.u;
import s.v;

public final class a0 {
    public final i0 a;
    public final ParcelableSnapshotMutableState b;
    public final ParcelableSnapshotMutableState c;
    public k d;
    public HapticFeedback e;
    public ClipboardManager f;
    public TextToolbar g;
    public final m h;
    public final ParcelableSnapshotMutableState i;
    public b j;
    public LayoutCoordinates k;
    public final ParcelableSnapshotMutableState l;
    public final ParcelableSnapshotMutableState m;
    public final ParcelableSnapshotMutableState n;
    public final ParcelableSnapshotMutableState o;
    public final ParcelableSnapshotMutableState p;
    public final ParcelableSnapshotMutableState q;
    public M r;
    public boolean s;

    public a0(i0 i00) {
        this.a = i00;
        this.b = d.D(null, Z.e);
        this.c = d.D(Boolean.TRUE, Z.e);
        this.d = new z(this, 8);
        this.h = new m();
        this.i = d.D(Boolean.FALSE, Z.e);
        this.l = d.D(new b(0L), Z.e);
        this.m = d.D(new b(0L), Z.e);
        this.n = d.D(null, Z.e);
        this.o = d.D(null, Z.e);
        this.p = d.D(null, Z.e);
        this.q = d.D(null, Z.e);
        i00.e = new z(this, 1);
        i00.f = new V(0, this);
        new L0(7, this);
        i00.g = new W(this);
        i00.h = new x(this, 2);
        i00.i = new z(this, 2);
        i00.j = new z(this, 3);
    }

    public static final long a(a0 a00, LayoutCoordinates layoutCoordinates0, long v) {
        return a00.k == null || !a00.k.r() ? 0x7FC000007FC00000L : a00.j().j(layoutCoordinates0, v);
    }

    public final void b() {
        f f2;
        f f0 = null;
        if(this.e() == null) {
            f2 = null;
        }
        else {
            i0 i00 = this.a;
            if(i00.a().e == 0) {
                f2 = null;
            }
            else {
                c c0 = new c();
                ArrayList arrayList0 = i00.c(this.j());
                int v = arrayList0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    M.m m0 = (M.m)arrayList0.get(v1);
                    q q0 = (q)i00.a().e(m0.a);
                    if(q0 != null) {
                        f f1 = m0.e();
                        c0.c((q0.c ? f1.d(q0.b.b, q0.a.b) : f1.d(q0.a.b, q0.b.b)));
                    }
                }
                f2 = c0.g();
            }
        }
        if(f2 != null) {
            if(f2.X.length() > 0) {
                f0 = f2;
            }
            if(f0 != null) {
                ClipboardManager clipboardManager0 = this.f;
                if(clipboardManager0 != null) {
                    clipboardManager0.b(f0);
                }
            }
        }
    }

    public final X c() {
        return (X)this.p.getValue();
    }

    public final boolean d() {
        return ((Boolean)this.i.getValue()).booleanValue();
    }

    public final q e() {
        return (q)this.b.getValue();
    }

    public final boolean f() {
        LayoutCoordinates layoutCoordinates0 = this.j();
        i0 i00 = this.a;
        ArrayList arrayList0 = i00.c(layoutCoordinates0);
        if(arrayList0.isEmpty()) {
            return true;
        }
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            M.m m0 = (M.m)arrayList0.get(v1);
            f f0 = m0.e();
            if(f0.X.length() != 0) {
                q q0 = (q)i00.a().e(m0.a);
                if(q0 == null || Math.abs(q0.a.b - q0.b.b) != f0.X.length()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean g() {
        return ((Boolean)this.c.getValue()).booleanValue();
    }

    public final boolean h() {
        q q0 = this.e();
        if(q0 == null) {
            return false;
        }
        p p0 = q0.a;
        p p1 = q0.b;
        if(j.a(p0, p1)) {
            return false;
        }
        if(Long.compare(p0.c, p1.c) == 0) {
            return true;
        }
        LayoutCoordinates layoutCoordinates0 = this.j();
        i0 i00 = this.a;
        ArrayList arrayList0 = i00.c(layoutCoordinates0);
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            M.m m0 = (M.m)arrayList0.get(v1);
            q q1 = (q)i00.a().e(m0.a);
            if(q1 != null && q1.a.b != q1.b.b) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        j.d(s.m.a, "null cannot be cast to non-null type androidx.collection.LongObjectMap<V of androidx.collection.LongObjectMapKt.emptyLongObjectMap>");
        this.a.k.setValue(s.m.a);
        this.n(false);
        if(this.e() != null) {
            ((Function1)this.d).n(null);
            if(this.g()) {
                HapticFeedback hapticFeedback0 = this.e;
                if(hapticFeedback0 != null) {
                    hapticFeedback0.a(9);
                }
            }
        }
    }

    public final LayoutCoordinates j() {
        LayoutCoordinates layoutCoordinates0 = this.k;
        if(layoutCoordinates0 == null) {
            throw new IllegalArgumentException("null coordinates");
        }
        if(!layoutCoordinates0.r()) {
            throw new IllegalArgumentException("unattached coordinates");
        }
        return layoutCoordinates0;
    }

    public final void k() {
        LayoutCoordinates layoutCoordinates0 = this.j();
        i0 i00 = this.a;
        ArrayList arrayList0 = i00.c(layoutCoordinates0);
        if(arrayList0.isEmpty()) {
            return;
        }
        v v0 = new v();
        int v1 = arrayList0.size();
        q q0 = null;
        q q1 = null;
        for(int v2 = 0; v2 < v1; ++v2) {
            M.m m0 = (M.m)arrayList0.get(v2);
            q q2 = m0.d();
            if(q2 != null) {
                if(q0 == null) {
                    q0 = q2;
                }
                int v3 = v0.c(m0.a);
                Object[] arr_object = v0.c;
                Object object0 = arr_object[v3];
                v0.b[v3] = m0.a;
                arr_object[v3] = q2;
                q1 = q2;
            }
        }
        if(v0.e == 0) {
            return;
        }
        if(q0 != q1) {
            j.c(q0);
            j.c(q1);
            q0 = new q(q0.a, q1.b, false);
        }
        i00.k.setValue(v0);
        ((Function1)this.d).n(q0);
        this.r = null;
    }

    public final void l(boolean z) {
        ParcelableSnapshotMutableState parcelableSnapshotMutableState0 = this.c;
        if(((Boolean)parcelableSnapshotMutableState0.getValue()).booleanValue() != z) {
            parcelableSnapshotMutableState0.setValue(Boolean.valueOf(z));
            this.q();
        }
    }

    public final void m(q q0) {
        this.b.setValue(q0);
        if(q0 != null) {
            this.o();
        }
    }

    public final void n(boolean z) {
        this.s = z;
        this.q();
    }

    public final void o() {
        b b0;
        M.m m1;
        M.m m0;
        q q0 = this.e();
        LayoutCoordinates layoutCoordinates0 = this.k;
        i0 i00 = this.a;
        Object object0 = null;
        if(q0 == null) {
            m0 = null;
        }
        else {
            p p0 = q0.a;
            m0 = p0 == null ? null : ((M.m)i00.c.e(p0.c));
        }
        if(q0 == null) {
            m1 = null;
        }
        else {
            p p1 = q0.b;
            m1 = p1 == null ? null : ((M.m)i00.c.e(p1.c));
        }
        LayoutCoordinates layoutCoordinates1 = m0 == null ? null : m0.c();
        LayoutCoordinates layoutCoordinates2 = m1 == null ? null : m1.c();
        ParcelableSnapshotMutableState parcelableSnapshotMutableState0 = this.o;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState1 = this.n;
        if(q0 != null && layoutCoordinates0 != null && layoutCoordinates0.r() && (layoutCoordinates1 != null || layoutCoordinates2 != null)) {
            m0.c c0 = c0.y(layoutCoordinates0);
            if(layoutCoordinates1 == null) {
                b0 = null;
            }
            else {
                long v = m0.a(q0, true);
                if(yc.d.q(v)) {
                    b0 = null;
                }
                else {
                    long v1 = layoutCoordinates0.j(layoutCoordinates1, v);
                    b0 = new b(v1);
                    if(this.c() != X.Y && !c0.p(c0, v1)) {
                        b0 = null;
                    }
                }
            }
            parcelableSnapshotMutableState1.setValue(b0);
            if(layoutCoordinates2 != null) {
                long v2 = m1.a(q0, false);
                if(!yc.d.q(v2)) {
                    long v3 = layoutCoordinates0.j(layoutCoordinates2, v2);
                    b b1 = new b(v3);
                    if(this.c() == X.Z || c0.p(c0, v3)) {
                        object0 = b1;
                    }
                }
            }
            parcelableSnapshotMutableState0.setValue(object0);
            return;
        }
        parcelableSnapshotMutableState1.setValue(null);
        parcelableSnapshotMutableState0.setValue(null);
    }

    public final boolean p(long v, long v1, boolean z, r r0) {
        i0 i02;
        l l1;
        int v24;
        int v23;
        int v18;
        int v17;
        int v16;
        ArrayList arrayList2;
        int v15;
        int v14;
        int v13;
        i0 i01;
        int v11;
        int v6;
        ArrayList arrayList1;
        this.p.setValue((z ? X.Y : X.Z));
        b b0 = new b(v);
        this.q.setValue(b0);
        LayoutCoordinates layoutCoordinates0 = this.j();
        i0 i00 = this.a;
        ArrayList arrayList0 = i00.c(layoutCoordinates0);
        u u0 = new u(6);
        int v2 = arrayList0.size();
        for(int v3 = 0; v3 < v2; ++v3) {
            u0.d(v3, ((M.m)arrayList0.get(v3)).a);
        }
        G0.x x0 = new G0.x(2, u0);
        N n0 = new N(v, v1, layoutCoordinates0, z, (yc.d.q(v1) ? null : this.e()), x0);
        int v4 = arrayList0.size();
        int v5 = 0;
        while(true) {
            arrayList1 = n0.h;
            if(v5 >= v4) {
                break;
            }
            M.m m0 = (M.m)arrayList0.get(v5);
            LayoutCoordinates layoutCoordinates1 = m0.c();
            if(layoutCoordinates1 == null) {
            label_105:
                v6 = v4;
                v15 = v5;
                i01 = i00;
                arrayList2 = arrayList0;
            }
            else {
                L l0 = (L)m0.c.invoke();
                if(l0 == null) {
                    goto label_105;
                }
                else {
                    v6 = v4;
                    long v7 = n0.c.j(layoutCoordinates1, 0L);
                    long v8 = b.h(n0.a, v7);
                    long v9 = yc.d.q(n0.b) ? 0x7FC000007FC00000L : b.h(n0.b, v7);
                    float f = (float)(((int)(l0.c >> 0x20)));
                    float f1 = (float)(((int)(0xFFFFFFFFL & l0.c)));
                    int v10 = 3;
                    if(Float.compare(b.d(v8), 0.0f) < 0) {
                        v11 = 1;
                    }
                    else {
                        v11 = b.d(v8) > f ? 3 : 2;
                    }
                    if(b.e(v8) < 0.0f) {
                        v10 = 1;
                    }
                    else if(b.e(v8) <= f1) {
                        v10 = 2;
                    }
                    boolean z1 = n0.d;
                    i01 = i00;
                    long v12 = m0.a;
                    q q0 = n0.e;
                    if(z1) {
                        v13 = c0.n(v11, v10, n0, v12, (q0 == null ? null : q0.b));
                        v14 = v11;
                        v15 = v5;
                        arrayList2 = arrayList0;
                        v16 = v10;
                        v17 = v13;
                        v18 = v17;
                    }
                    else {
                        v13 = c0.n(v11, v10, n0, v12, (q0 == null ? null : q0.a));
                        v17 = v11;
                        v15 = v5;
                        arrayList2 = arrayList0;
                        v18 = v10;
                        v16 = v13;
                        v14 = v16;
                    }
                    int v19 = c0.x(v11, v10);
                    if(v19 == 2 || v19 != v13) {
                        int v20 = l0.a.a.X.length();
                        G0.x x1 = n0.f;
                        if(z1) {
                            int v21 = c0.s(v8, l0);
                            if(q0 == null) {
                                v20 = v21;
                            }
                            else {
                                p p0 = q0.b;
                                if(p0 == null) {
                                    v20 = v21;
                                }
                                else {
                                    int v22 = x1.compare(((long)p0.c), v12);
                                    if(v22 < 0) {
                                        v20 = 0;
                                    }
                                    else if(v22 <= 0) {
                                        v20 = p0.b;
                                    }
                                }
                            }
                            v23 = v20;
                            v24 = v21;
                        }
                        else {
                            int v25 = c0.s(v8, l0);
                            if(q0 == null) {
                                v20 = v25;
                            }
                            else {
                                p p1 = q0.a;
                                if(p1 == null) {
                                    v20 = v25;
                                }
                                else {
                                    int v26 = x1.compare(((long)p1.c), v12);
                                    if(v26 < 0) {
                                        v20 = 0;
                                    }
                                    else if(v26 <= 0) {
                                        v20 = p1.b;
                                    }
                                }
                            }
                            v24 = v20;
                            v23 = v25;
                        }
                        int v27 = n0.k + 2;
                        n0.k = v27;
                        n0.i = n0.a(n0.i, v14, v16);
                        n0.j = n0.a(n0.j, v17, v18);
                        n0.g.d(arrayList1.size(), v12);
                        arrayList1.add(new o(v12, v27, v24, v23, (yc.d.q(v9) ? -1 : c0.s(v9, l0)), l0));
                    }
                }
            }
            v5 = v15 + 1;
            v4 = v6;
            arrayList0 = arrayList2;
            i00 = i01;
        }
        int v28 = n0.k + 1;
        switch(arrayList1.size()) {
            case 0: {
                throw new IllegalStateException("SelectionLayout must not be empty.");
            }
            case 1: {
                Object object0 = Bb.p.I0(arrayList1);
                l1 = new l0(n0.d, (n0.i == -1 ? v28 : n0.i), (n0.j == -1 ? v28 : n0.j), n0.e, ((o)object0));
                break;
            }
            default: {
                l1 = new l(n0.g, arrayList1, (n0.i == -1 ? v28 : n0.i), (n0.j == -1 ? v28 : n0.j), n0.d, n0.e);
                break;
            }
        }
        if(!l1.b(this.r)) {
            return false;
        }
        q q1 = r0.a(l1);
        if(!j.a(q1, this.e())) {
            if(this.g()) {
                i02 = i00;
                ArrayList arrayList3 = i02.b;
                int v29 = arrayList3.size();
                for(int v30 = 0; v30 < v29; ++v30) {
                    if(((M.m)arrayList3.get(v30)).e().X.length() > 0) {
                        HapticFeedback hapticFeedback0 = this.e;
                        if(hapticFeedback0 == null) {
                            break;
                        }
                        hapticFeedback0.a(9);
                        break;
                    }
                }
            }
            else {
                i02 = i00;
            }
            v v31 = l1.j(q1);
            i02.k.setValue(v31);
            ((Function1)this.d).n(q1);
        }
        this.r = l1;
        return true;
    }

    public final void q() {
        m0.c c9;
        m0.c c6;
        M.m m2;
        m0.c c5;
        int[] arr_v;
        TextToolbar textToolbar2;
        List list1;
        m0.c c3;
        int v6;
        TextToolbar textToolbar1;
        m0.c c2;
        m0.c c1;
        if(!this.d()) {
            return;
        }
        TextToolbar textToolbar0 = this.g;
        if(textToolbar0 == null) {
            return;
        }
        if(this.s && this.g()) {
            if(this.e() == null) {
                textToolbar1 = textToolbar0;
                c9 = null;
            }
            else {
                LayoutCoordinates layoutCoordinates0 = this.k;
                if(layoutCoordinates0 == null || !layoutCoordinates0.r()) {
                    textToolbar1 = textToolbar0;
                    c9 = null;
                }
                else {
                    LayoutCoordinates layoutCoordinates1 = this.j();
                    i0 i00 = this.a;
                    ArrayList arrayList0 = i00.c(layoutCoordinates1);
                    List list0 = new ArrayList(arrayList0.size());
                    int v = arrayList0.size();
                    for(int v1 = 0; v1 < v; ++v1) {
                        M.m m0 = (M.m)arrayList0.get(v1);
                        q q0 = (q)i00.a().e(m0.a);
                        Ab.k k0 = q0 == null ? null : new Ab.k(m0, q0);
                        if(k0 != null) {
                            ((ArrayList)list0).add(k0);
                        }
                    }
                    switch(((ArrayList)list0).size()) {
                        case 0: 
                        case 1: {
                            break;
                        }
                        default: {
                            list0 = Bb.q.L(new Object[]{Bb.p.p0(list0), Bb.p.w0(list0)});
                        }
                    }
                    if(list0.isEmpty()) {
                        textToolbar1 = textToolbar0;
                        c9 = null;
                    }
                    else {
                        m0.c c0 = c0.a;
                        if(list0.isEmpty()) {
                            c1 = c0;
                            c2 = c1;
                            textToolbar1 = textToolbar0;
                        }
                        else {
                            int v2 = list0.size();
                            int v3 = 0;
                            float f = -Infinityf;
                            float f1 = Infinityf;
                            float f2 = Infinityf;
                            float f3 = -Infinityf;
                            while(v3 < v2) {
                                Object object0 = list0.get(v3);
                                M.m m1 = (M.m)((Ab.k)object0).X;
                                int v4 = ((q)((Ab.k)object0).Y).a.b;
                                int v5 = ((q)((Ab.k)object0).Y).b.b;
                                if(v4 == v5) {
                                    v6 = v2;
                                    c3 = c0;
                                    list1 = list0;
                                    textToolbar2 = textToolbar0;
                                }
                                else {
                                    LayoutCoordinates layoutCoordinates2 = m1.c();
                                    if(layoutCoordinates2 == null) {
                                        v6 = v2;
                                        c3 = c0;
                                        list1 = list0;
                                        textToolbar2 = textToolbar0;
                                    }
                                    else {
                                        v6 = v2;
                                        int v7 = Math.min(v4, v5);
                                        int v8 = Math.max(v4, v5) - 1;
                                        if(v7 == v8) {
                                            arr_v = new int[]{v7};
                                            list1 = list0;
                                        }
                                        else {
                                            list1 = list0;
                                            arr_v = new int[]{v7, v8};
                                        }
                                        int v9 = arr_v.length;
                                        textToolbar2 = textToolbar0;
                                        float f4 = Infinityf;
                                        float f5 = Infinityf;
                                        float f6 = -Infinityf;
                                        float f7 = -Infinityf;
                                        int v10 = 0;
                                        while(v10 < v9) {
                                            int v11 = arr_v[v10];
                                            L l0 = (L)m1.c.invoke();
                                            m0.c c4 = m0.c.e;
                                            if(l0 == null) {
                                                c5 = c0;
                                                m2 = m1;
                                            }
                                            else {
                                                m2 = m1;
                                                int v12 = l0.a.a.X.length();
                                                c5 = c0;
                                                if(v12 >= 1) {
                                                    c6 = l0.b(J.r(v11, 0, v12 - 1));
                                                    goto label_82;
                                                }
                                            }
                                            c6 = c4;
                                        label_82:
                                            f5 = Math.min(f5, c6.a);
                                            f4 = Math.min(f4, c6.b);
                                            f6 = Math.max(f6, c6.c);
                                            f7 = Math.max(f7, c6.d);
                                            ++v10;
                                            v9 = v9;
                                            arr_v = arr_v;
                                            m1 = m2;
                                            c0 = c5;
                                        }
                                        c3 = c0;
                                        long v13 = layoutCoordinates0.j(layoutCoordinates2, yc.d.d(f5, f4));
                                        long v14 = layoutCoordinates0.j(layoutCoordinates2, yc.d.d(f6, f7));
                                        f1 = Math.min(f1, b.d(v13));
                                        f2 = Math.min(f2, b.e(v13));
                                        f3 = Math.max(f3, b.d(v14));
                                        f = Math.max(f, b.e(v14));
                                    }
                                }
                                ++v3;
                                list0 = list1;
                                v2 = v6;
                                textToolbar0 = textToolbar2;
                                c0 = c3;
                            }
                            textToolbar1 = textToolbar0;
                            c1 = new m0.c(f1, f2, f3, f);
                            c2 = c0;
                        }
                        if(c1.equals(c2)) {
                            c9 = null;
                        }
                        else {
                            m0.c c7 = c0.y(layoutCoordinates0).e(c1);
                            if(c7.d() < 0.0f || c7.c() < 0.0f) {
                                c9 = null;
                            }
                            else {
                                m0.c c8 = c7.i(layoutCoordinates0.F(0L));
                                c9 = m0.c.a(c8, 0.0f, 0.0f, M.L.b * 4.0f + c8.d, 7);
                            }
                        }
                    }
                }
            }
            if(c9 == null) {
                return;
            }
            textToolbar1.a(c9, (this.h() ? new Ha.f(0, this, a0.class, "toolbarCopy", "toolbarCopy()V", 0, 8) : null), null, null, (this.f() ? null : new Ha.f(0, this, a0.class, "selectAll", "selectAll$foundation_release()V", 0, 9)));
            return;
        }
        if(textToolbar0.c() == 1) {
            textToolbar0.b();
        }
    }
}

