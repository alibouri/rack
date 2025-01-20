package com.wave.components.sendmoney;

import Aa.t0;
import Ab.k;
import Ab.t;
import Bb.F;
import D9.a;
import E9.b;
import G9.c;
import Ha.S;
import K9.E;
import K9.G;
import K9.H;
import K9.I;
import K9.K0;
import K9.K;
import K9.M;
import K9.N;
import K9.Q;
import K9.U;
import K9.W;
import K9.Y;
import K9.e0;
import N2.l;
import Nb.j;
import Nb.p;
import Nb.x;
import Tb.e;
import X8.f;
import Xb.J;
import Y8.E3;
import Y8.G6;
import Y8.H6;
import Y8.R6;
import Y8.S6;
import Y8.X5;
import Y8.Y5;
import Y8.j4;
import Y8.k1;
import Y8.l1;
import Y8.n1;
import Y8.o1;
import Y8.p1;
import Y8.p8;
import Y8.u9;
import Y8.y6;
import ac.B0;
import ac.d0;
import ac.h0;
import ac.i0;
import ac.j0;
import ac.r0;
import android.text.Spanned;
import androidx.lifecycle.FlowWatcherKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.WatchedProperty;
import androidx.lifecycle.viewmodel.internal.CloseableCoroutineScope;
import com.apollographql.apollo.api.Optional.Present;
import com.apollographql.apollo.api.Optional;
import com.sendwave.androidApi.Contact;
import com.sendwave.backend.fragment.SendMoneyDialogFragment;
import com.sendwave.backend.type.PartnerOrg;
import com.sendwave.util.Country;
import com.wave.models.ProposedTransfer;
import d9.J4;
import d9.p2;
import d9.s0;
import f9.o0;
import hb.n;
import io.sentry.i1;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import o9.N1;
import q9.r1;
import q9.t1;
import q9.u1;
import q9.z1;

public final class d extends ViewModel {
    public final j0 A0;
    public final j0 B0;
    public final B0 C0;
    public final j0 D0;
    public final Y E0;
    public static final e[] F0;
    public static final u1 G0;
    public final R6 Y;
    public final SendMoneyDialogParams Z;
    public final Country b0;
    public final b c0;
    public final a d0;
    public final f e0;
    public final B9.f f0;
    public final c g0;
    public final B0 h0;
    public final V8.c i0;
    public final t0 j0;
    public final String k0;
    public final String l0;
    public final t0 m0;
    public final B0 n0;
    public final l o0;
    public final o0 p0;
    public final Q q0;
    public final WatchedProperty r0;
    public final WatchedProperty s0;
    public final WatchedProperty t0;
    public final WatchedProperty u0;
    public final S v0;
    public final WatchedProperty w0;
    public final j0 x0;
    public final B0 y0;
    public final WatchedProperty z0;

    static {
        p p0 = new p(d.class, "wFeeDescription", "getWFeeDescription()Ljava/lang/String;", 0);
        x.a.getClass();
        d.F0 = new e[]{p0, new p(d.class, "wFxRateLabel", "getWFxRateLabel()Ljava/lang/String;", 0), new p(d.class, "wFxRate", "getWFxRate()Ljava/math/BigDecimal;", 0), new p(d.class, "wFxRateDescription", "getWFxRateDescription()Ljava/lang/String;", 0), new p(d.class, "wRequiredPartnerOrg", "getWRequiredPartnerOrg()Lcom/sendwave/backend/type/PartnerOrg;", 0), new p(d.class, "wProposedTransfer", "getWProposedTransfer()Lcom/wave/models/ProposedTransfer;", 0)};
        d.G0 = new u1("ShowReverseTxAnnouncement", false);
    }

    public d(R6 r60, SendMoneyDialogParams sendMoneyDialogParams0, Country country0, b b0, a a0, f f0, B9.f f1, c c0) {
        j.f(r60, "repo");
        j.f(a0, "adTracking");
        j.f(f1, "accountManager");
        j.f(c0, "announcementsFragmentSource");
        super();
        this.Y = r60;
        this.Z = sendMoneyDialogParams0;
        this.b0 = country0;
        this.c0 = b0;
        this.d0 = a0;
        this.e0 = f0;
        this.f0 = f1;
        this.g0 = c0;
        B0 b00 = ac.o0.c(UUID.randomUUID());
        this.h0 = b00;
        this.i0 = new V8.c(new V8.e());  // initializer: Ljava/lang/Object;-><init>()V
        CloseableCoroutineScope closeableCoroutineScope0 = ViewModelKt.a(this);
        i0 i00 = ac.o0.B(r60.h(sendMoneyDialogParams0.X, SendMoneyDialogFragment.class), closeableCoroutineScope0, r0.a(2, 5000L), 1);
        Contact contact0 = sendMoneyDialogParams0.Y;
        Country country1 = contact0.g0;
        if(country1 == null) {
            Map map0 = F.J(new k("recipientMobile", contact0.X));
            n.d("Unable to determine recipient country while sending money", i1.ERROR, map0, false, 8);
            country1 = country0;
        }
        this.j0 = new t0(i00, 3);
        this.k0 = j.a(country0.i0, country1.i0) ? r1.d(0x7F1203DD, new Object[0]) : r1.d(0x7F1203DE, new Object[]{country0.i0.a()});  // string:send_field "Send Amount"
        this.l0 = j.a(country0.i0, country1.i0) ? r1.d(0x7F12036B, new Object[0]) : r1.d(0x7F12036C, new Object[]{country1.i0.a()});  // string:receive_field "Receive Amount"
        t0 t00 = new t0(i00, 4);
        country0.equals(country1);
        t0 t01 = new t0(i00, 5);
        this.m0 = t01;
        e0 e00 = new e0(t00, 0);
        t0 t02 = new t0(i00, 6);
        B0 b01 = ac.o0.c(-1);
        this.n0 = b01;
        l l0 = R6.g(r60, new j4(), H6.Y);  // initializer: Ljava/lang/Object;-><init>()V
        this.o0 = l0;
        Ba.n n0 = new Ba.n(l0, 2);
        o0 o00 = new o0(this, t00, b01, country0, q9.o0.a(country1), n0);
        this.p0 = o00;
        this.q0 = new Q(o00.e0, 2);
        this.r0 = FlowWatcherKt.b(new Q(o00.e0, 3)).b(this, d.F0[0]);
        this.s0 = FlowWatcherKt.b(new Q(o00.e0, 4)).b(this, d.F0[1]);
        this.t0 = FlowWatcherKt.b(new Q(o00.e0, 0)).b(this, d.F0[2]);
        this.u0 = FlowWatcherKt.b(new Q(o00.e0, 1)).b(this, d.F0[3]);
        N n1 = new N(5, null, 0);
        S s0 = ac.o0.i(t01, o00.e0, e00, t02, n1);
        this.v0 = s0;
        this.w0 = FlowWatcherKt.b(s0).b(this, d.F0[4]);
        U u0 = new U(s0, 0);
        Boolean boolean0 = Boolean.FALSE;
        this.x0 = q9.o0.d0(this, u0, boolean0);
        B0 b02 = ac.o0.c(new K0(null, null, null));
        this.y0 = b02;
        M m0 = new M(this, null, 0);
        d0 d00 = ac.o0.j(o00.o0, b00, b02, m0);
        this.z0 = FlowWatcherKt.b(d00).b(this, d.F0[5]);
        this.A0 = q9.o0.d0(this, new W(o00.o0, 0), null);
        K k0 = new K(3, null, 0);
        this.B0 = q9.o0.d0(this, new ac.e0(o00.o0, o00.h0, k0, 0), null);
        B0 b03 = ac.o0.c(boolean0);
        this.C0 = b03;
        this.D0 = new j0(b03);
        this.E0 = new Y(d00, 0);
        t0 t03 = new t0(i00, 2);
        W w0 = new W(o00.o0, 1);
        J.q(ViewModelKt.a(this), null, null, new E(t03, this, w0, null), 3);
    }

    public static final Object o(d d0, ProposedTransfer proposedTransfer0, LinkedHashMap linkedHashMap0, Fb.c c0) {
        Map map0;
        d d1;
        G g0;
        d0.getClass();
        if(c0 instanceof G) {
            g0 = (G)c0;
            int v = g0.g0;
            if((v & 0x80000000) == 0) {
                g0 = new G(d0, c0);
            }
            else {
                g0.g0 = v ^ 0x80000000;
            }
        }
        else {
            g0 = new G(d0, c0);
        }
        Object object0 = g0.e0;
        Object object1 = Eb.a.X;
        switch(g0.g0) {
            case 0: {
                W5.f.b0(object0);
                d0.c0.d("view send confirmation bottom sheet", linkedHashMap0);
                g0.b0 = d0;
                g0.c0 = proposedTransfer0;
                g0.d0 = linkedHashMap0;
                g0.g0 = 1;
                object0 = d0.i0.e(g0);
                if(object0 != object1) {
                    goto label_27;
                }
                return object1;
            }
            case 1: {
                linkedHashMap0 = g0.d0;
                proposedTransfer0 = (ProposedTransfer)g0.c0;
                d0 = g0.b0;
                W5.f.b0(object0);
            label_27:
                g0.b0 = d0;
                g0.c0 = linkedHashMap0;
                g0.d0 = null;
                g0.g0 = 2;
                object0 = Pb.a.N(((V8.d)object0), 0x7F0D0038, null, proposedTransfer0, g0, 2);  // layout:confirm_p2p_transfer_bottom_sheet
                if(object0 != object1) {
                    d1 = d0;
                    map0 = linkedHashMap0;
                    break;
                }
                return object1;
            }
            case 2: {
                map0 = (Map)g0.c0;
                d1 = g0.b0;
                W5.f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((Integer)object0) == null || ((int)(((Integer)object0))) != -1) {
            throw new N1();  // initializer: Ljava/lang/Exception;-><init>()V
        }
        d1.c0.d("click confirm send transaction button", map0);
        return t.a;
    }

    public final Object p(ProposedTransfer proposedTransfer0, String s, Fb.c c0) {
        d d0;
        Object object2;
        String s2;
        d d2;
        K9.F f0;
        ProposedTransfer proposedTransfer1 = proposedTransfer0;
        if(c0 instanceof K9.F) {
            f0 = (K9.F)c0;
            int v = f0.g0;
            if((v & 0x80000000) == 0) {
                f0 = new K9.F(this, c0);
            }
            else {
                f0.g0 = v ^ 0x80000000;
            }
        }
        else {
            f0 = new K9.F(this, c0);
        }
        Object object0 = f0.e0;
        Object object1 = Eb.a.X;
        switch(f0.g0) {
            case 0: {
                W5.f.b0(object0);
                Map map0 = com.apollographql.apollo.api.b.t("client_id", proposedTransfer1.h0);
                this.c0.d("view possibly mistaken transfer warning popup", map0);
                f0.b0 = this;
                f0.c0 = proposedTransfer1;
                s2 = s;
                f0.d0 = s2;
                f0.g0 = 1;
                object2 = this.i0.e(f0);
                if(object2 == object1) {
                    return object1;
                }
                d2 = this;
                break;
            }
            case 1: {
                String s1 = f0.d0;
                ProposedTransfer proposedTransfer2 = f0.c0;
                d d1 = f0.b0;
                W5.f.b0(object0);
                d2 = d1;
                s2 = s1;
                proposedTransfer1 = proposedTransfer2;
                object2 = object0;
                break;
            }
            case 2: {
                proposedTransfer1 = f0.c0;
                d0 = f0.b0;
                W5.f.b0(object0);
                goto label_56;
            }
            case 3: {
                W5.f.b0(object0);
                return t.a;
            }
            case 4: {
                W5.f.b0(object0);
                ((V8.d)object0).Y(EditRecipient.X);
                throw new N1();  // initializer: Ljava/lang/Exception;-><init>()V
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        String s3 = r1.d(0x7F120351, new Object[0]);  // string:possibly_mistaken_transfer_title "⚠️ Warning"
        Spanned spanned0 = a.a.n(0, s2);
        String s4 = r1.d(0x7F12034F, new Object[0]);  // string:possibly_mistaken_transfer_confirm "Confirm Transfer"
        String s5 = r1.d(0x7F120350, new Object[0]);  // string:possibly_mistaken_transfer_edit "Edit"
        f0.b0 = d2;
        f0.c0 = proposedTransfer1;
        f0.d0 = null;
        f0.g0 = 2;
        Object object3 = Pb.a.O(((V8.d)object2), s3, spanned0, s4, s5, false, null, null, f0, 456);
        if(object3 == object1) {
            return object1;
        }
        d0 = d2;
        object0 = object3;
    label_56:
        if(((Integer)object0) != null && ((int)(((Integer)object0))) == -1) {
            Map map1 = F.J(new k("client_id", proposedTransfer1.h0));
            d0.c0.d("click confirm on possibly mistaken transfer warning popup", map1);
            f0.b0 = null;
            f0.c0 = null;
            f0.g0 = 3;
            return d0.q(proposedTransfer1, Boolean.TRUE, f0) == object1 ? object1 : t.a;
        }
        Map map2 = F.J(new k("client_id", proposedTransfer1.h0));
        d0.c0.d("click edit on possibly mistaken transfer warning popup", map2);
        f0.b0 = null;
        f0.c0 = null;
        f0.g0 = 4;
        object0 = d0.i0.e(f0);
        if(object0 == object1) {
            return object1;
        }
        ((V8.d)object0).Y(EditRecipient.X);
        throw new N1();  // initializer: Ljava/lang/Exception;-><init>()V
    }

    public final Object q(ProposedTransfer proposedTransfer0, Boolean boolean0, Fb.c c0) {
        Object object5;
        AtomicInteger atomicInteger1;
        B0 b00;
        d d0;
        Y8.W w0;
        h0 h01;
        d d1;
        ProposedTransfer proposedTransfer1;
        AtomicInteger atomicInteger0;
        d d3;
        p2 p21;
        Optional optional1;
        ProposedTransfer proposedTransfer2;
        Boolean boolean1;
        H h0;
        if(c0 instanceof H) {
            h0 = (H)c0;
            int v = h0.i0;
            if((v & 0x80000000) == 0) {
                h0 = new H(this, c0);
            }
            else {
                h0.i0 = v ^ 0x80000000;
            }
        }
        else {
            h0 = new H(this, c0);
        }
        Object object0 = h0.g0;
        Object object1 = Eb.a.X;
        switch(h0.i0) {
            case 0: {
                W5.f.b0(object0);
                j.f(proposedTransfer0, "<this>");
                Optional optional2 = Optional.Companion.presentIfNotNull(proposedTransfer0.l0);
                Optional optional3 = Optional.Companion.presentIfNotNull(proposedTransfer0.k0);
                Optional optional4 = Optional.Companion.presentIfNotNull(proposedTransfer0.i0);
                Present optional$Present0 = S6.a(proposedTransfer0.c0);
                Optional optional5 = Optional.Companion.presentIfNotNull(proposedTransfer0.e0);
                Present optional$Present1 = S6.a(proposedTransfer0.h0);
                s0 s00 = proposedTransfer0.j0 == null ? null : new s0(proposedTransfer0.j0.X, proposedTransfer0.j0.Y);
                Optional optional6 = Optional.Companion.presentIfNotNull(s00);
                p2 p22 = new p2(proposedTransfer0.X, optional4, proposedTransfer0.Y, proposedTransfer0.Z, optional$Present0, optional5, optional3, optional2, optional6, optional$Present1);
                Optional optional7 = Optional.Companion.presentIfNotNull(((PartnerOrg)this.w0.a(d.F0[4], this)));
                h0.b0 = this;
                h0.c0 = proposedTransfer0;
                h0.d0 = boolean0;
                h0.e0 = p22;
                h0.f0 = optional7;
                h0.i0 = 1;
                Object object2 = this.e0.d(h0);
                if(object2 == object1) {
                    return object1;
                }
                proposedTransfer2 = proposedTransfer0;
                optional1 = optional7;
                p21 = p22;
                boolean1 = boolean0;
                object0 = object2;
                d3 = this;
                break;
            }
            case 1: {
                Optional optional0 = h0.f0;
                p2 p20 = (p2)h0.e0;
                boolean1 = (Boolean)h0.d0;
                proposedTransfer2 = (ProposedTransfer)h0.c0;
                d d2 = h0.b0;
                W5.f.b0(object0);
                optional1 = optional0;
                p21 = p20;
                d3 = d2;
                break;
            }
            case 2: {
                atomicInteger0 = (AtomicInteger)h0.e0;
                h0 h00 = (h0)h0.d0;
                proposedTransfer1 = (ProposedTransfer)h0.c0;
                d1 = h0.b0;
                try {
                    h01 = h00;
                    W5.f.b0(object0);
                    h01 = h00;
                    goto label_105;
                }
                catch(Throwable throwable0) {
                    goto label_122;
                }
            }
            case 3: {
                W5.f.b0(object0);
                return t.a;
            }
            case 4: {
                w0 = (Y8.W)h0.c0;
                d0 = h0.b0;
                W5.f.b0(object0);
                goto label_155;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Optional optional8 = Optional.Companion.presentIfNotNull(object0);
        Optional optional9 = Optional.Companion.presentIfNotNull(boolean1);
        J4 j40 = ((K0)d3.y0.getValue()).k;
        p1 p10 = new p1(p21, optional1, optional8, optional9, Optional.Companion.presentIfNotNull(j40));
        try {
            b00 = d3.C0;
            Map map0 = Y8.N.a;
            Object object3 = map0.get(b00);
            if(object3 == null) {
                object3 = new AtomicInteger(0);
                map0.put(b00, object3);
            }
            atomicInteger1 = (AtomicInteger)object3;
            do {
                Object object4 = b00.getValue();
                ((Boolean)object4).getClass();
            }
            while(!b00.j(object4, Boolean.valueOf(atomicInteger1.incrementAndGet() > 0)));
        }
        catch(X5 x50) {
            goto label_135;
        }
        catch(Y8.W w0) {
            d1 = d3;
            goto label_144;
        }
        try {
            h0.b0 = d3;
            h0.c0 = proposedTransfer2;
            h0.d0 = b00;
            h0.e0 = atomicInteger1;
            h0.f0 = null;
            h0.i0 = 2;
            object5 = d3.Y.f(p10, G6.X, h0);
        }
        catch(Throwable throwable0) {
            try {
                proposedTransfer1 = proposedTransfer2;
                d1 = d3;
                atomicInteger0 = atomicInteger1;
                h01 = b00;
                goto label_122;
            }
            catch(X5 x50) {
                goto label_133;
            }
            catch(Y8.W w0) {
                goto label_144;
            }
        }
        if(object5 == object1) {
            return object1;
        }
        proposedTransfer1 = proposedTransfer2;
        d1 = d3;
        atomicInteger0 = atomicInteger1;
        h01 = b00;
        object0 = object5;
        try {
        label_105:
            l1 l10 = ((k1)((y6)object0).b).a;
            boolean z = l10 == null ? false : l10.b;
            B9.b b0 = d1.f0.c();
            if(b0 != null) {
                z1 z10 = b0.d(t1.j0);
                if(z10 != null) {
                    z10.d().b(d.G0, Boolean.valueOf(z)).apply();
                    l1 l11 = ((k1)((y6)object0).b).a;
                    if(l11 != null) {
                        n1 n10 = l11.a;
                        if(n10 != null) {
                            o1 o10 = n10.c;
                            if(o10 != null) {
                                d1.g0.a(o10.c.b);
                            }
                        }
                    }
                    d1.d0.a(proposedTransfer1.Y);
                }
            }
            goto label_126;
        }
        catch(Throwable throwable0) {
        }
        try {
            do {
            label_122:
                Object object6 = ((B0)h01).getValue();
                ((Boolean)object6).getClass();
            }
            while(!((B0)h01).j(object6, Boolean.valueOf(atomicInteger0.decrementAndGet() > 0)));
            throw throwable0;
            do {
            label_126:
                Object object7 = ((B0)h01).getValue();
                ((Boolean)object7).getClass();
            }
            while(!((B0)h01).j(object7, Boolean.valueOf(atomicInteger0.decrementAndGet() > 0)));
            return t.a;
        label_133:
            d3 = d1;
            proposedTransfer2 = proposedTransfer1;
        }
        catch(X5 x50) {
            goto label_133;
        }
        catch(Y8.W w0) {
            goto label_144;
        }
    label_135:
        h0.b0 = null;
        h0.c0 = null;
        h0.d0 = null;
        h0.e0 = null;
        h0.f0 = null;
        h0.i0 = 3;
        return d3.p(proposedTransfer2, x50.X, h0) == object1 ? object1 : t.a;
    label_144:
        if(w0 instanceof p8 || w0 instanceof u9 || w0 instanceof E3) {
            mb.a.a(null, null, new I(d1, null), 3);
        }
        else {
            h0.b0 = d1;
            h0.c0 = w0;
            h0.d0 = null;
            h0.e0 = null;
            h0.f0 = null;
            h0.i0 = 4;
            object0 = ac.o0.v(d1.j0, h0);
            if(object0 == object1) {
                return object1;
            }
            d0 = d1;
        label_155:
            if(j.a(object0, Boolean.TRUE) && w0 instanceof Y5) {
                mb.a.a(null, null, new I(d0, null), 3);
            }
        }
        throw w0;
    }
}

