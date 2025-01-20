package K;

import Aa.P;
import G0.Y;
import I.P0;
import I.j0;
import M.o0;
import Nb.j;
import O0.J;
import O0.K;
import O0.L;
import O0.N;
import O0.f;
import O0.n;
import U0.A;
import U0.g;
import U0.i;
import Vb.h;
import android.graphics.PointF;
import android.os.CancellationSignal;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.ViewConfiguration;
import io.sentry.config.a;
import kotlin.jvm.functions.Function1;
import m0.b;
import m0.c;
import n0.M;
import yc.d;

public final class t {
    public static final t a;

    static {
        t.a = new t();  // initializer: Ljava/lang/Object;-><init>()V
    }

    public final boolean A(j0 j00, PreviewableHandwritingGesture previewableHandwritingGesture0, o0 o00, CancellationSignal cancellationSignal0) {
        f f1;
        f f0 = j00.j;
        if(f0 == null) {
            return false;
        }
        P0 p00 = j00.d();
        if(p00 == null) {
            f1 = null;
        }
        else {
            K k0 = p00.a.a;
            f1 = k0 == null ? null : k0.a;
        }
        if(!f0.equals(f1)) {
            return false;
        }
        if(q.o(previewableHandwritingGesture0)) {
            this.C(j00, ((SelectGesture)previewableHandwritingGesture0), o00);
        }
        else {
            if(Y.q(previewableHandwritingGesture0)) {
                this.w(j00, ((DeleteGesture)previewableHandwritingGesture0), o00);
                goto label_25;
            }
            if(Y.u(previewableHandwritingGesture0)) {
                this.E(j00, ((SelectRangeGesture)previewableHandwritingGesture0), o00);
            }
            else if(Y.w(previewableHandwritingGesture0)) {
                this.y(j00, ((DeleteRangeGesture)previewableHandwritingGesture0), o00);
            }
            else {
                return false;
            }
        }
    label_25:
        if(cancellationSignal0 != null) {
            cancellationSignal0.setOnCancelListener(new r(0, o00));
        }
        return true;
    }

    public final boolean B(F f0, PreviewableHandwritingGesture previewableHandwritingGesture0, E e0, CancellationSignal cancellationSignal0) {
        if(q.o(previewableHandwritingGesture0)) {
            this.D(f0, ((SelectGesture)previewableHandwritingGesture0), e0);
        }
        else {
            if(Y.q(previewableHandwritingGesture0)) {
                this.x(f0, ((DeleteGesture)previewableHandwritingGesture0), e0);
                goto label_11;
            }
            if(Y.u(previewableHandwritingGesture0)) {
                this.F(f0, ((SelectRangeGesture)previewableHandwritingGesture0), e0);
            }
            else if(Y.w(previewableHandwritingGesture0)) {
                this.z(f0, ((DeleteRangeGesture)previewableHandwritingGesture0), e0);
            }
            else {
                return false;
            }
        }
    label_11:
        if(cancellationSignal0 != null) {
            cancellationSignal0.setOnCancelListener(new s());  // initializer: Ljava/lang/Object;-><init>()V
        }
        return true;
    }

    private final void C(j0 j00, SelectGesture selectGesture0, o0 o00) {
        if(o00 != null) {
            long v = a.N(j00, M.I(selectGesture0.getSelectionArea()), this.G(selectGesture0.getGranularity()));
            j0 j01 = o00.d;
            if(j01 != null) {
                j01.f(v);
            }
            j0 j02 = o00.d;
            if(j02 != null) {
                j02.e(N.b);
            }
            if(!N.b(v)) {
                o00.p(false);
                o00.n(I.Y.X);
            }
        }
    }

    private final void D(F f0, SelectGesture selectGesture0, E e0) {
        M.I(selectGesture0.getSelectionArea());
        selectGesture0.getGranularity();
        throw null;
    }

    private final void E(j0 j00, SelectRangeGesture selectRangeGesture0, o0 o00) {
        if(o00 != null) {
            long v = a.m(j00, M.I(selectRangeGesture0.getSelectionStartArea()), M.I(selectRangeGesture0.getSelectionEndArea()), this.G(selectRangeGesture0.getGranularity()));
            j0 j01 = o00.d;
            if(j01 != null) {
                j01.f(v);
            }
            j0 j02 = o00.d;
            if(j02 != null) {
                j02.e(N.b);
            }
            if(!N.b(v)) {
                o00.p(false);
                o00.n(I.Y.X);
            }
        }
    }

    private final void F(F f0, SelectRangeGesture selectRangeGesture0, E e0) {
        M.I(selectRangeGesture0.getSelectionStartArea());
        M.I(selectRangeGesture0.getSelectionEndArea());
        selectRangeGesture0.getGranularity();
        throw null;
    }

    private final int G(int v) {
        return v == 1 ? 1 : 0;
    }

    private final int a(F f0, HandwritingGesture handwritingGesture0) {
        throw null;
    }

    private final int b(HandwritingGesture handwritingGesture0, Function1 function10) {
        String s = handwritingGesture0.getFallbackText();
        if(s == null) {
            return 3;
        }
        function10.n(new U0.a(s, 1));
        return 5;
    }

    private final int c(j0 j00, DeleteGesture deleteGesture0, f f0, Function1 function10) {
        int v = this.G(deleteGesture0.getGranularity());
        long v1 = a.N(j00, M.I(deleteGesture0.getDeletionArea()), v);
        if(N.b(v1)) {
            return t.a.b(deleteGesture0, function10);
        }
        this.h(v1, f0, v == 1, function10);
        return 1;
    }

    private final int d(F f0, DeleteGesture deleteGesture0, E e0) {
        deleteGesture0.getGranularity();
        M.I(deleteGesture0.getDeletionArea());
        throw null;
    }

    private final int e(j0 j00, DeleteRangeGesture deleteRangeGesture0, f f0, Function1 function10) {
        int v = this.G(deleteRangeGesture0.getGranularity());
        long v1 = a.m(j00, M.I(deleteRangeGesture0.getDeletionStartArea()), M.I(deleteRangeGesture0.getDeletionEndArea()), v);
        if(N.b(v1)) {
            return t.a.b(deleteRangeGesture0, function10);
        }
        this.h(v1, f0, v == 1, function10);
        return 1;
    }

    private final int f(F f0, DeleteRangeGesture deleteRangeGesture0, E e0) {
        deleteRangeGesture0.getGranularity();
        M.I(deleteRangeGesture0.getDeletionStartArea());
        M.I(deleteRangeGesture0.getDeletionEndArea());
        throw null;
    }

    private final void g(F f0, long v, boolean z) {
        throw null;
    }

    private final void h(long v, f f0, boolean z, Function1 function10) {
        if(z) {
            int v1 = (int)(v >> 0x20);
            int v2 = (int)(v & 0xFFFFFFFFL);
            int v3 = 10;
            int v4 = v1 <= 0 ? 10 : Character.codePointBefore(f0, v1);
            if(v2 < f0.X.length()) {
                v3 = Character.codePointAt(f0, v2);
            }
            if(a.U(v4) && (a.T(v3) || a.S(v3))) {
                do {
                    v1 -= Character.charCount(v4);
                    if(v1 == 0) {
                        break;
                    }
                    v4 = Character.codePointBefore(f0, v1);
                }
                while(a.U(v4));
                v = n.b(v1, v2);
            }
            else if(a.U(v3) && (a.T(v4) || a.S(v4))) {
                do {
                    v2 += Character.charCount(v3);
                    if(v2 == f0.X.length()) {
                        break;
                    }
                    v3 = Character.codePointAt(f0, v2);
                }
                while(a.U(v3));
                v = n.b(v1, v2);
            }
        }
        int v5 = (int)(0xFFFFFFFFL & v);
        function10.n(new u(new i[]{new A(v5, v5), new g(N.c(v), 0)}));
    }

    public final int i(j0 j00, HandwritingGesture handwritingGesture0, o0 o00, ViewConfiguration viewConfiguration0, Function1 function10) {
        f f1;
        f f0 = j00.j;
        if(f0 == null) {
            return 3;
        }
        P0 p00 = j00.d();
        if(p00 == null) {
            f1 = null;
        }
        else {
            K k0 = p00.a.a;
            f1 = k0 == null ? null : k0.a;
        }
        if(!f0.equals(f1)) {
            return 3;
        }
        if(q.o(handwritingGesture0)) {
            return this.r(j00, ((SelectGesture)handwritingGesture0), o00, function10);
        }
        if(Y.q(handwritingGesture0)) {
            return this.c(j00, ((DeleteGesture)handwritingGesture0), f0, function10);
        }
        if(Y.u(handwritingGesture0)) {
            return this.t(j00, ((SelectRangeGesture)handwritingGesture0), o00, function10);
        }
        if(Y.w(handwritingGesture0)) {
            return this.e(j00, ((DeleteRangeGesture)handwritingGesture0), f0, function10);
        }
        if(Y.C(handwritingGesture0)) {
            return this.n(j00, ((JoinOrSplitGesture)handwritingGesture0), f0, viewConfiguration0, function10);
        }
        if(Y.y(handwritingGesture0)) {
            return this.k(j00, ((InsertGesture)handwritingGesture0), viewConfiguration0, function10);
        }
        return Y.A(handwritingGesture0) ? this.p(j00, ((RemoveSpaceGesture)handwritingGesture0), f0, viewConfiguration0, function10) : 2;
    }

    public final int j(F f0, HandwritingGesture handwritingGesture0, E e0, ViewConfiguration viewConfiguration0) {
        if(q.o(handwritingGesture0)) {
            return this.s(f0, ((SelectGesture)handwritingGesture0), e0);
        }
        if(Y.q(handwritingGesture0)) {
            return this.d(f0, ((DeleteGesture)handwritingGesture0), e0);
        }
        if(Y.u(handwritingGesture0)) {
            return this.u(f0, ((SelectRangeGesture)handwritingGesture0), e0);
        }
        if(Y.w(handwritingGesture0)) {
            return this.f(f0, ((DeleteRangeGesture)handwritingGesture0), e0);
        }
        if(Y.C(handwritingGesture0)) {
            return this.o(f0, ((JoinOrSplitGesture)handwritingGesture0), e0, viewConfiguration0);
        }
        if(Y.y(handwritingGesture0)) {
            return this.l(f0, ((InsertGesture)handwritingGesture0), e0, viewConfiguration0);
        }
        return Y.A(handwritingGesture0) ? this.q(f0, ((RemoveSpaceGesture)handwritingGesture0), e0, viewConfiguration0) : 2;
    }

    private final int k(j0 j00, InsertGesture insertGesture0, ViewConfiguration viewConfiguration0, Function1 function10) {
        int v3;
        if(viewConfiguration0 == null) {
            return this.b(insertGesture0, function10);
        }
        PointF pointF0 = insertGesture0.getInsertionPoint();
        long v = d.d(pointF0.x, pointF0.y);
        P0 p00 = j00.d();
        if(p00 == null) {
            v3 = -1;
        }
        else {
            O0.s s0 = p00.a.b;
            LayoutCoordinates layoutCoordinates0 = j00.c();
            if(layoutCoordinates0 == null) {
                v3 = -1;
            }
            else {
                long v1 = layoutCoordinates0.p(v);
                int v2 = a.K(s0, v1, viewConfiguration0);
                if(v2 == -1) {
                    v3 = -1;
                }
                else {
                    float f = s0.d(v2);
                    v3 = s0.e(b.a(v1, (s0.b(v2) + f) / 2.0f, 1));
                }
            }
        }
        if(v3 != -1) {
            P0 p01 = j00.d();
            if(p01 == null || !a.n(p01.a, v3)) {
                this.m(v3, insertGesture0.getTextToInsert(), function10);
                return 1;
            }
        }
        return this.b(insertGesture0, function10);
    }

    private final int l(F f0, InsertGesture insertGesture0, E e0, ViewConfiguration viewConfiguration0) {
        insertGesture0.getInsertionPoint();
        throw null;
    }

    private final void m(int v, String s, Function1 function10) {
        function10.n(new u(new i[]{new A(v, v), new U0.a(s, 1)}));
    }

    private final int n(j0 j00, JoinOrSplitGesture joinOrSplitGesture0, f f0, ViewConfiguration viewConfiguration0, Function1 function10) {
        int v3;
        if(viewConfiguration0 == null) {
            return this.b(joinOrSplitGesture0, function10);
        }
        PointF pointF0 = joinOrSplitGesture0.getJoinOrSplitPoint();
        long v = d.d(pointF0.x, pointF0.y);
        P0 p00 = j00.d();
        if(p00 == null) {
            v3 = -1;
        }
        else {
            O0.s s0 = p00.a.b;
            LayoutCoordinates layoutCoordinates0 = j00.c();
            if(layoutCoordinates0 == null) {
                v3 = -1;
            }
            else {
                long v1 = layoutCoordinates0.p(v);
                int v2 = a.K(s0, v1, viewConfiguration0);
                if(v2 == -1) {
                    v3 = -1;
                }
                else {
                    float f1 = s0.d(v2);
                    v3 = s0.e(b.a(v1, (s0.b(v2) + f1) / 2.0f, 1));
                }
            }
        }
        if(v3 != -1) {
            P0 p01 = j00.d();
            if(p01 == null || !a.n(p01.a, v3)) {
                int v4;
                for(v4 = v3; v4 > 0; v4 -= Character.charCount(v5)) {
                    int v5 = Character.codePointBefore(f0, v4);
                    if(!a.T(v5)) {
                        break;
                    }
                }
                while(v3 < f0.X.length()) {
                    int v6 = Character.codePointAt(f0, v3);
                    if(!a.T(v6)) {
                        break;
                    }
                    v3 += Character.charCount(v6);
                }
                long v7 = n.b(v4, v3);
                if(N.b(v7)) {
                    this.m(((int)(v7 >> 0x20)), " ", function10);
                    return 1;
                }
                this.h(v7, f0, false, function10);
                return 1;
            }
        }
        return this.b(joinOrSplitGesture0, function10);
    }

    private final int o(F f0, JoinOrSplitGesture joinOrSplitGesture0, E e0, ViewConfiguration viewConfiguration0) {
        throw null;
    }

    private final int p(j0 j00, RemoveSpaceGesture removeSpaceGesture0, f f0, ViewConfiguration viewConfiguration0, Function1 function10) {
        long v6;
        P0 p00 = j00.d();
        L l0 = p00 == null ? null : p00.a;
        PointF pointF0 = removeSpaceGesture0.getStartPoint();
        long v = d.d(pointF0.x, pointF0.y);
        PointF pointF1 = removeSpaceGesture0.getEndPoint();
        long v1 = d.d(pointF1.x, pointF1.y);
        LayoutCoordinates layoutCoordinates0 = j00.c();
        if(l0 == null || layoutCoordinates0 == null) {
            v6 = N.b;
        }
        else {
            long v2 = layoutCoordinates0.p(v);
            long v3 = layoutCoordinates0.p(v1);
            O0.s s0 = l0.b;
            int v4 = a.K(s0, v2, viewConfiguration0);
            int v5 = a.K(s0, v3, viewConfiguration0);
            if(v4 != -1) {
                if(v5 != -1) {
                    v4 = Math.min(v4, v5);
                }
                v5 = v4;
            label_20:
                float f1 = s0.d(v5);
                float f2 = (s0.b(v5) + f1) / 2.0f;
                v6 = s0.f(new c(Math.min(b.d(v2), b.d(v3)), f2 - 0.1f, Math.max(b.d(v2), b.d(v3)), f2 + 0.1f), 0, J.a);
            }
            else if(v5 == -1) {
                v6 = N.b;
            }
            else {
                goto label_20;
            }
        }
        if(N.b(v6)) {
            return t.a.b(removeSpaceGesture0, function10);
        }
        Nb.u u0 = new Nb.u();  // initializer: Ljava/lang/Object;-><init>()V
        u0.X = -1;
        Nb.u u1 = new Nb.u();  // initializer: Ljava/lang/Object;-><init>()V
        u1.X = -1;
        h h0 = new h("\\s+");
        P p0 = new P(u0, 20, u1);
        String s1 = h0.d(f0.d(N.e(v6), N.d(v6)).X, p0);
        int v7 = u0.X;
        if(v7 != -1) {
            int v8 = u1.X;
            if(v8 != -1) {
                String s2 = s1.substring(v7, s1.length() - (N.c(v6) - u1.X));
                j.e(s2, "this as java.lang.String…ing(startIndex, endIndex)");
                function10.n(new u(new i[]{new A(((int)(v6 >> 0x20)) + v7, ((int)(v6 >> 0x20)) + v8), new U0.a(s2, 1)}));
                return 1;
            }
        }
        return this.b(removeSpaceGesture0, function10);
    }

    private final int q(F f0, RemoveSpaceGesture removeSpaceGesture0, E e0, ViewConfiguration viewConfiguration0) {
        throw null;
    }

    private final int r(j0 j00, SelectGesture selectGesture0, o0 o00, Function1 function10) {
        long v = a.N(j00, M.I(selectGesture0.getSelectionArea()), this.G(selectGesture0.getGranularity()));
        if(N.b(v)) {
            return t.a.b(selectGesture0, function10);
        }
        this.v(v, o00, function10);
        return 1;
    }

    private final int s(F f0, SelectGesture selectGesture0, E e0) {
        M.I(selectGesture0.getSelectionArea());
        selectGesture0.getGranularity();
        throw null;
    }

    private final int t(j0 j00, SelectRangeGesture selectRangeGesture0, o0 o00, Function1 function10) {
        long v = a.m(j00, M.I(selectRangeGesture0.getSelectionStartArea()), M.I(selectRangeGesture0.getSelectionEndArea()), this.G(selectRangeGesture0.getGranularity()));
        if(N.b(v)) {
            return t.a.b(selectRangeGesture0, function10);
        }
        this.v(v, o00, function10);
        return 1;
    }

    private final int u(F f0, SelectRangeGesture selectRangeGesture0, E e0) {
        M.I(selectRangeGesture0.getSelectionStartArea());
        M.I(selectRangeGesture0.getSelectionEndArea());
        selectRangeGesture0.getGranularity();
        throw null;
    }

    private final void v(long v, o0 o00, Function1 function10) {
        function10.n(new A(((int)(v >> 0x20)), ((int)(v & 0xFFFFFFFFL))));
        if(o00 != null) {
            o00.f(true);
        }
    }

    private final void w(j0 j00, DeleteGesture deleteGesture0, o0 o00) {
        if(o00 != null) {
            long v = a.N(j00, M.I(deleteGesture0.getDeletionArea()), this.G(deleteGesture0.getGranularity()));
            j0 j01 = o00.d;
            if(j01 != null) {
                j01.e(v);
            }
            j0 j02 = o00.d;
            if(j02 != null) {
                j02.f(N.b);
            }
            if(!N.b(v)) {
                o00.p(false);
                o00.n(I.Y.X);
            }
        }
    }

    private final void x(F f0, DeleteGesture deleteGesture0, E e0) {
        M.I(deleteGesture0.getDeletionArea());
        deleteGesture0.getGranularity();
        throw null;
    }

    private final void y(j0 j00, DeleteRangeGesture deleteRangeGesture0, o0 o00) {
        if(o00 != null) {
            long v = a.m(j00, M.I(deleteRangeGesture0.getDeletionStartArea()), M.I(deleteRangeGesture0.getDeletionEndArea()), this.G(deleteRangeGesture0.getGranularity()));
            j0 j01 = o00.d;
            if(j01 != null) {
                j01.e(v);
            }
            j0 j02 = o00.d;
            if(j02 != null) {
                j02.f(N.b);
            }
            if(!N.b(v)) {
                o00.p(false);
                o00.n(I.Y.X);
            }
        }
    }

    private final void z(F f0, DeleteRangeGesture deleteRangeGesture0, E e0) {
        M.I(deleteRangeGesture0.getDeletionStartArea());
        M.I(deleteRangeGesture0.getDeletionEndArea());
        deleteRangeGesture0.getGranularity();
        throw null;
    }
}

