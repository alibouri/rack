package K;

import Bb.q;
import I2.J;
import Nb.j;
import O0.L;
import O0.N;
import O0.n;
import U0.B;
import Z0.h;
import android.graphics.Matrix;
import android.os.Build.VERSION;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo.Builder;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.ui.layout.LayoutCoordinates;
import n0.G;
import n0.M;

public final class y {
    public final c a;
    public final v b;
    public final Object c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public B j;
    public L k;
    public U0.v l;
    public m0.c m;
    public m0.c n;
    public final CursorAnchorInfo.Builder o;
    public final float[] p;
    public final Matrix q;

    public y(c c0, v v0) {
        this.a = c0;
        this.b = v0;
        this.c = new Object();
        this.o = new CursorAnchorInfo.Builder();
        this.p = G.a();
        this.q = new Matrix();
    }

    public final void a() {
        boolean z7;
        CursorAnchorInfo.Builder cursorAnchorInfo$Builder1;
        L l1;
        U0.v v4;
        v v0 = this.b;
        InputMethodManager inputMethodManager0 = v0.t();
        View view0 = (View)v0.Y;
        if(inputMethodManager0.isActive(view0) && this.j != null && this.l != null && this.k != null && this.m != null && this.n != null) {
            float[] arr_f = this.p;
            G.d(arr_f);
            LayoutCoordinates layoutCoordinates0 = (LayoutCoordinates)this.a.g0.o0.getValue();
            if(layoutCoordinates0 != null) {
                if(!layoutCoordinates0.r()) {
                    layoutCoordinates0 = null;
                }
                if(layoutCoordinates0 != null) {
                    layoutCoordinates0.t(arr_f);
                }
            }
            m0.c c0 = this.n;
            j.c(c0);
            m0.c c1 = this.n;
            j.c(c1);
            G.h(arr_f, -c0.a, -c1.b, 0.0f);
            M.z(this.q, arr_f);
            B b0 = this.j;
            j.c(b0);
            U0.v v1 = this.l;
            j.c(v1);
            L l0 = this.k;
            j.c(l0);
            m0.c c2 = this.m;
            j.c(c2);
            m0.c c3 = this.n;
            j.c(c3);
            boolean z = this.f;
            boolean z1 = this.g;
            boolean z2 = this.h;
            boolean z3 = this.i;
            CursorAnchorInfo.Builder cursorAnchorInfo$Builder0 = this.o;
            cursorAnchorInfo$Builder0.reset();
            cursorAnchorInfo$Builder0.setMatrix(this.q);
            int v2 = N.e(b0.b);
            cursorAnchorInfo$Builder0.setSelectionRange(v2, N.d(b0.b));
            h h0 = h.Y;
            if(!z || v2 < 0) {
                v4 = v1;
                cursorAnchorInfo$Builder1 = cursorAnchorInfo$Builder0;
                l1 = l0;
            }
            else {
                int v3 = v1.l(v2);
                m0.c c4 = l0.c(v3);
                v4 = v1;
                float f = J.q(c4.a, 0.0f, ((int)(l0.c >> 0x20)));
                boolean z4 = q.j(c2, f, c4.b);
                boolean z5 = q.j(c2, f, c4.d);
                boolean z6 = l0.a(v3) == h0;
                int v5 = z4 || z5 ? 1 : 0;
                if(!z4 || !z5) {
                    v5 |= 2;
                }
                l1 = l0;
                cursorAnchorInfo$Builder1 = cursorAnchorInfo$Builder0;
                cursorAnchorInfo$Builder0.setInsertionMarkerLocation(f, c4.b, c4.d, c4.d, (z6 ? v5 | 4 : v5));
            }
            if(z1) {
                int v6 = -1;
                N n0 = b0.c;
                int v7 = n0 == null ? -1 : N.e(n0.a);
                if(n0 != null) {
                    v6 = N.d(n0.a);
                }
                if(v7 < 0 || v7 >= v6) {
                    z7 = z3;
                }
                else {
                    cursorAnchorInfo$Builder1.setComposingText(v7, b0.a.X.subSequence(v7, v6));
                    U0.v v8 = v4;
                    int v9 = v8.l(v7);
                    int v10 = v8.l(v6);
                    float[] arr_f1 = new float[(v10 - v9) * 4];
                    z7 = z3;
                    long v11 = n.b(v9, v10);
                    l1.b.a(v11, arr_f1);
                    while(v7 < v6) {
                        int v12 = v8.l(v7);
                        int v13 = (v12 - v9) * 4;
                        float f1 = arr_f1[v13];
                        float f2 = arr_f1[v13 + 1];
                        float f3 = arr_f1[v13 + 2];
                        float f4 = arr_f1[v13 + 3];
                        int v14 = c2.c <= f1 || f3 <= c2.a || c2.d <= f2 || f4 <= c2.b ? 0 : 1;
                        if(!q.j(c2, f1, f2) || !q.j(c2, f3, f4)) {
                            v14 |= 2;
                        }
                        if(l1.a(v12) == h0) {
                            v14 |= 4;
                        }
                        cursorAnchorInfo$Builder1.addCharacterBounds(v7, f1, f2, f3, f4, v14);
                        ++v7;
                        arr_f1 = arr_f1;
                        v6 = v6;
                        v8 = v8;
                        v9 = v9;
                    }
                }
            }
            else {
                z7 = z3;
            }
            int v15 = Build.VERSION.SDK_INT;
            if(v15 >= 33 && z2) {
                k.a(cursorAnchorInfo$Builder1, c3);
            }
            if(v15 >= 34 && z7) {
                l.a(cursorAnchorInfo$Builder1, l1, c2);
            }
            CursorAnchorInfo cursorAnchorInfo0 = cursorAnchorInfo$Builder1.build();
            v0.t().updateCursorAnchorInfo(view0, cursorAnchorInfo0);
            this.e = false;
        }
    }
}

