package j0;

import Y8.o;
import a1.b;
import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View.DragShadowBuilder;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function1;
import m0.e;
import n0.c;
import n0.t;

public final class a extends View.DragShadowBuilder {
    public final b a;
    public final long b;
    public final Function1 c;

    public a(b b0, long v, Function1 function10) {
        this.a = b0;
        this.b = v;
        this.c = function10;
    }

    @Override  // android.view.View$DragShadowBuilder
    public final void onDrawShadow(Canvas canvas0) {
        p0.b b0 = new p0.b();
        c c0 = new c();
        c0.a = canvas0;
        Density density0 = b0.X.a;
        LayoutDirection layoutDirection0 = b0.X.b;
        t t0 = b0.X.c;
        long v = b0.X.d;
        b0.X.a = this.a;
        b0.X.b = LayoutDirection.X;
        b0.X.c = c0;
        b0.X.d = this.b;
        c0.n();
        this.c.n(b0);
        c0.l();
        b0.X.a = density0;
        b0.X.b = layoutDirection0;
        b0.X.c = t0;
        b0.X.d = v;
    }

    @Override  // android.view.View$DragShadowBuilder
    public final void onProvideShadowMetrics(Point point0, Point point1) {
        float f = e.d(this.b);
        float f1 = e.b(this.b);
        point0.set(o.e(f / this.a.getDensity(), this.a), o.e(f1 / this.a.getDensity(), this.a));
        point1.set(point0.x / 2, point0.y / 2);
    }
}

