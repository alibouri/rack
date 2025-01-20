package oa;

import Aa.A;
import B.r0;
import Bb.q;
import C.E;
import Ca.k;
import Ea.r;
import Fa.T;
import Fa.y;
import G0.f0;
import H.f;
import I2.J;
import J2.w;
import N.m2;
import N4.o;
import Nb.j;
import O0.O;
import O3.b;
import U.H;
import U.N0;
import U.Z;
import U.l0;
import U.p;
import androidx.compose.ui.focus.FocusOwner;
import com.sendwave.backend.FragmentHandle;
import com.sendwave.backend.type.LinkedAccountKind.BANK;
import com.sendwave.backend.type.LinkedAccountKind.MFI;
import db.a;
import g0.l;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import n0.M;
import n0.v;

public abstract class h {
    public static final int a;

    static {
        c c0 = new c("Bank");
        FragmentHandle fragmentHandle0 = new FragmentHandle(new b("key"), FragmentHandle.Z);
        oa.b b0 = new oa.b("Bank 1", null, BANK.X, fragmentHandle0);
        c c1 = new c("MFI");
        FragmentHandle fragmentHandle1 = new FragmentHandle(new b("key2"), FragmentHandle.Z);
        q.L(new d[]{c0, b0, c1, new oa.b("MFI 1", null, MFI.X, fragmentHandle1)});
        c c2 = new c("Bank");
        FragmentHandle fragmentHandle2 = new FragmentHandle(new b("key"), FragmentHandle.Z);
        q.L(new d[]{c2, new oa.b("Bank 1", null, BANK.X, fragmentHandle2)});
    }

    public static final void a(c c0, int v, List list0, p p0, int v1) {
        p0.S(1310706320);
        int v2 = (v1 & 6) == 0 ? (p0.f(c0) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v2 |= (p0.d(v) ? 0x20 : 16);
        }
        if((v1 & 0x180) == 0) {
            v2 |= (p0.h(list0) ? 0x100 : 0x80);
        }
        if((v2 & 0x93) != 0x92 || !p0.x()) {
            boolean z = v == 0 || list0.get(v - 1) instanceof oa.b;
            O o0 = ((a)p0.k(db.b.d)).i;
            m2.b(c0.a, androidx.compose.foundation.layout.a.m(androidx.compose.foundation.a.b(o.j(androidx.compose.foundation.layout.a.n(androidx.compose.foundation.layout.c.d(l.X, 1.0f), 0.0f, (v == 0 ? 0.0f : 36.0f), 0.0f, 0.0f, 13), f.c((z ? 10.0f : 0.0f), (z ? 10.0f : 0.0f), 0.0f, 0.0f)), v.e, M.a), 16.0f, 12.0f, 16.0f, 8.0f), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, o0, p0, 0, 0, 0xFFFC);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new T(c0, v, list0, v1);
        }
    }

    public static final void b(i i0, Function0 function00, Function1 function10, Function1 function11, Function0 function01, Function1 function12, p p0, int v) {
        j.f(i0, "uiState");
        j.f(function00, "onNavigationUpClick");
        j.f(function10, "onItemClick");
        j.f(function11, "onSearchQueryChange");
        j.f(function01, "onSearchQueryClear");
        j.f(function12, "onSearchFilterClicked");
        p0.S(0xB61F244B);
        int v1 = (v & 6) == 0 ? (p0.h(i0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.h(function00) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (p0.h(function10) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (p0.h(function11) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v1 |= (p0.h(function01) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v) == 0) {
            v1 |= (p0.h(function12) ? 0x20000 : 0x10000);
        }
        if((74899 & v1) != 74898 || !p0.x()) {
            p0.Q(0x60BDAF0F);
            if(i0.d) {
                P4.c.i(function00, p0, v1 >> 3 & 14);
            }
            p0.p(false);
            N4.j.d(w.S(0x7F1203F1, p0), null, 0L, function00, null, 0L, 0L, null, c0.c.c(-1035805553, new y(i0, function10, function11, function01, function12), p0), p0, v1 << 6 & 0x1C00 | 0x6000000, 0xF6);  // string:settings_linked_accounts "Link your bank or MFI"
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new k(i0, function00, function10, function11, function01, function12, v, 4);
        }
    }

    public static final void c(List list0, E e0, Function1 function10, float f, p p0, int v) {
        p0.S(0x2FC54BDA);
        int v1 = (v & 6) == 0 ? (p0.h(list0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.f(e0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (p0.h(function10) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (p0.c(f) ? 0x800 : 0x400);
        }
        if((v1 & 0x493) != 1170 || !p0.x()) {
            p0.Q(0x54A28210);
            Object object0 = p0.G();
            Z z0 = U.l.a;
            if(object0 == z0) {
                object0 = U.d.w(new A(e0, 6));
                p0.a0(object0);
            }
            p0.p(false);
            FocusOwner focusOwner0 = (FocusOwner)p0.k(f0.g);
            Boolean boolean0 = (Boolean)((N0)object0).getValue();
            boolean0.getClass();
            p0.Q(1419940772);
            boolean z1 = p0.h(focusOwner0);
            Object object1 = p0.G();
            if(z1 || object1 == z0) {
                object1 = new g(focusOwner0, ((N0)object0), null);
                p0.a0(object1);
            }
            p0.p(false);
            H.d(p0, boolean0, ((Function2)object1));
            r0 r00 = new r0(16.0f, f, 16.0f, 12.0f);
            p0.Q(1419949800);
            boolean z2 = p0.h(list0);
            Object object2 = p0.G();
            if((z2 | (v1 & 0x380) == 0x100) != 0 || object2 == z0) {
                object2 = new r(list0, 13, function10);
                p0.a0(object2);
            }
            p0.p(false);
            J.c(null, e0, r00, false, null, null, null, false, ((Function1)object2), p0, v1 & 0x70, 0xF9);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new bb.b(list0, e0, function10, f, v);
        }
    }
}

