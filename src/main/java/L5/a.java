package l5;

import Ab.o;
import I2.J;
import J2.w;
import Nb.j;
import U.Z;
import U.d;
import U.t0;
import U0.D;
import W4.f;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.unit.LayoutDirection;
import m0.e;
import n0.n;
import n0.t;
import s0.b;

public final class a extends b implements t0 {
    public final Drawable d0;
    public final ParcelableSnapshotMutableState e0;
    public final ParcelableSnapshotMutableState f0;
    public final o g0;

    public a(Drawable drawable0) {
        j.f(drawable0, "drawable");
        super();
        this.d0 = drawable0;
        this.e0 = d.D(0, Z.e);
        this.f0 = d.D(new e((drawable0.getIntrinsicWidth() < 0 || drawable0.getIntrinsicHeight() < 0 ? 0x7FC000007FC00000L : w.m(drawable0.getIntrinsicWidth(), drawable0.getIntrinsicHeight()))), Z.e);
        this.g0 = f.A(new D(15, this));
        if(drawable0.getIntrinsicWidth() >= 0 && drawable0.getIntrinsicHeight() >= 0) {
            drawable0.setBounds(0, 0, drawable0.getIntrinsicWidth(), drawable0.getIntrinsicHeight());
        }
    }

    @Override  // U.t0
    public final void a() {
        Drawable.Callback drawable$Callback0 = (Drawable.Callback)this.g0.getValue();
        Drawable drawable0 = this.d0;
        drawable0.setCallback(drawable$Callback0);
        drawable0.setVisible(true, true);
        if(drawable0 instanceof Animatable) {
            ((Animatable)drawable0).start();
        }
    }

    @Override  // s0.b
    public final boolean b(float f) {
        int v = J.r(Pb.a.H(f * 255.0f), 0, 0xFF);
        this.d0.setAlpha(v);
        return true;
    }

    @Override  // U.t0
    public final void c() {
        this.d();
    }

    @Override  // U.t0
    public final void d() {
        Drawable drawable0 = this.d0;
        if(drawable0 instanceof Animatable) {
            ((Animatable)drawable0).stop();
        }
        drawable0.setVisible(false, false);
        drawable0.setCallback(null);
    }

    @Override  // s0.b
    public final boolean e(n n0) {
        this.d0.setColorFilter((n0 == null ? null : n0.a));
        return true;
    }

    @Override  // s0.b
    public final void f(LayoutDirection layoutDirection0) {
        int v = 1;
        j.f(layoutDirection0, "layoutDirection");
        int v1 = layoutDirection0.ordinal();
        if(v1 == 0) {
            v = 0;
        }
        else if(v1 != 1) {
            throw new Ab.e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
        }
        this.d0.setLayoutDirection(v);
    }

    @Override  // s0.b
    public final long h() {
        return ((e)this.f0.getValue()).a;
    }

    @Override  // s0.b
    public final void i(p0.d d0) {
        j.f(d0, "<this>");
        t t0 = d0.A().o();
        ((Number)this.e0.getValue()).intValue();
        int v = Pb.a.H(e.d(d0.d()));
        int v1 = Pb.a.H(e.b(d0.d()));
        this.d0.setBounds(0, 0, v, v1);
        try {
            t0.n();
            Canvas canvas0 = n0.d.a(t0);
            this.d0.draw(canvas0);
        }
        finally {
            t0.l();
        }
    }
}

