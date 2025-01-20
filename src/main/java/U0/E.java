package U0;

import I2.J;
import Nb.j;
import Nb.k;
import O0.L;
import O0.N;
import O0.n;
import R2.w;
import W4.f;
import Z0.h;
import android.graphics.Matrix;
import android.os.Build.VERSION;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo.Builder;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.functions.Function1;
import m0.b;
import m0.c;
import n0.G;
import n0.M;

public final class e {
    public final AndroidComposeView a;
    public final w b;
    public final Object c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public B j;
    public L k;
    public v l;
    public k m;
    public c n;
    public c o;
    public final CursorAnchorInfo.Builder p;
    public final float[] q;
    public final Matrix r;

    public e(AndroidComposeView androidComposeView0, w w0) {
        this.a = androidComposeView0;
        this.b = w0;
        this.c = new Object();
        this.m = d.Z;
        this.p = new CursorAnchorInfo.Builder();
        this.q = G.a();
        this.r = new Matrix();
    }

    public final void a() {
        CursorAnchorInfo.Builder cursorAnchorInfo$Builder1;
        Object object1;
        h h1;
        View view1;
        Object object0 = this.b.Z;
        InputMethodManager inputMethodManager0 = (InputMethodManager)((Ab.h)object0).getValue();
        View view0 = (View)this.b.Y;
        if(!inputMethodManager0.isActive(view0)) {
            return;
        }
        ((Function1)this.m).n(new G(this.q));
        this.a.D();
        G.g(this.q, this.a.P0);
        float f = b.d(this.a.T0);
        float f1 = b.e(this.a.T0);
        G.d(this.a.O0);
        G.i(this.a.O0, f, f1);
        G0.G.n(this.q, this.a.O0);
        M.z(this.r, this.q);
        B b0 = this.j;
        j.c(b0);
        v v0 = this.l;
        j.c(v0);
        L l0 = this.k;
        j.c(l0);
        c c0 = this.n;
        j.c(c0);
        c c1 = this.o;
        j.c(c1);
        boolean z = this.f;
        boolean z1 = this.g;
        boolean z2 = this.h;
        boolean z3 = this.i;
        CursorAnchorInfo.Builder cursorAnchorInfo$Builder0 = this.p;
        cursorAnchorInfo$Builder0.reset();
        cursorAnchorInfo$Builder0.setMatrix(this.r);
        int v1 = N.e(b0.b);
        cursorAnchorInfo$Builder0.setSelectionRange(v1, N.d(b0.b));
        h h0 = h.Y;
        if(!z || v1 < 0) {
            view1 = view0;
            object1 = object0;
            h1 = h0;
            cursorAnchorInfo$Builder1 = cursorAnchorInfo$Builder0;
        }
        else {
            int v2 = v0.l(v1);
            c c2 = l0.c(v2);
            float f2 = J.q(c2.a, 0.0f, ((int)(l0.c >> 0x20)));
            boolean z4 = f.o(c0, f2, c2.b);
            boolean z5 = f.o(c0, f2, c2.d);
            view1 = view0;
            boolean z6 = l0.a(v2) == h0;
            int v3 = z4 || z5 ? 1 : 0;
            if(!z4 || !z5) {
                v3 |= 2;
            }
            h1 = h0;
            object1 = object0;
            cursorAnchorInfo$Builder1 = cursorAnchorInfo$Builder0;
            cursorAnchorInfo$Builder0.setInsertionMarkerLocation(f2, c2.b, c2.d, c2.d, (z6 ? v3 | 4 : v3));
        }
        if(z1) {
            int v4 = -1;
            N n0 = b0.c;
            int v5 = n0 == null ? -1 : N.e(n0.a);
            if(n0 != null) {
                v4 = N.d(n0.a);
            }
            if(v5 >= 0 && v5 < v4) {
                cursorAnchorInfo$Builder1.setComposingText(v5, b0.a.X.subSequence(v5, v4));
                int v6 = v0.l(v5);
                int v7 = v0.l(v4);
                float[] arr_f = new float[(v7 - v6) * 4];
                long v8 = n.b(v6, v7);
                l0.b.a(v8, arr_f);
                while(v5 < v4) {
                    int v9 = v0.l(v5);
                    int v10 = (v9 - v6) * 4;
                    float f3 = arr_f[v10];
                    float f4 = arr_f[v10 + 1];
                    float f5 = arr_f[v10 + 2];
                    float f6 = arr_f[v10 + 3];
                    int v11 = c0.c <= f3 || f5 <= c0.a || c0.d <= f4 || f6 <= c0.b ? 0 : 1;
                    if(!f.o(c0, f3, f4) || !f.o(c0, f5, f6)) {
                        v11 |= 2;
                    }
                    if(l0.a(v9) == h1) {
                        v11 |= 4;
                    }
                    cursorAnchorInfo$Builder1.addCharacterBounds(v5, f3, f4, f5, f6, v11);
                    ++v5;
                    v4 = v4;
                    v6 = v6;
                }
            }
        }
        int v12 = Build.VERSION.SDK_INT;
        if(v12 >= 33 && z2) {
            U0.b.a(cursorAnchorInfo$Builder1, c1);
        }
        if(v12 >= 34 && z3) {
            U0.c.a(cursorAnchorInfo$Builder1, l0, c0);
        }
        CursorAnchorInfo cursorAnchorInfo0 = cursorAnchorInfo$Builder1.build();
        ((InputMethodManager)((Ab.h)object1).getValue()).updateCursorAnchorInfo(view1, cursorAnchorInfo0);
        this.e = false;
    }
}

