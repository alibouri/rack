package q9;

import Ab.t;
import R1.d;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.Density;
import androidx.lifecycle.ViewModel;
import com.skydoves.balloon.Balloon;
import com.skydoves.balloon.radius.RadiusLayout;
import kotlin.jvm.functions.Function1;
import m0.b;
import o.N0;
import u9.j;
import v9.a;
import v9.g;

public final class e3 implements Function1 {
    public final int X;
    public final int Y;
    public final Object Z;
    public final Object b0;
    public final Object c0;

    public e3(int v, j j0, Density density0, a a0) {
        this.X = 1;
        super();
        this.Y = v;
        this.Z = j0;
        this.b0 = density0;
        this.c0 = a0;
    }

    public e3(k3 k30, int v, ViewModel viewModel0, Object object0) {
        this.X = 0;
        super();
        this.Z = k30;
        this.Y = v;
        this.b0 = viewModel0;
        this.c0 = object0;
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        if(this.X != 0) {
            Nb.j.f(((LayoutCoordinates)object0), "coordinates");
            long v = ((LayoutCoordinates)object0).C();
            int v1 = this.Y;
            ((j)this.Z).getClass();
            if(Float.compare(((float)v1) * 0.0f, 0.0f) != 0) {
                v1 = (int)(((float)v1) * 0.0f - ((Density)this.b0).w(0.0f) - ((Density)this.b0).w(0.0f));
            }
            else if(((int)(v >> 0x20)) <= v1) {
                v1 = (int)(v >> 0x20);
            }
            long v2 = io.sentry.config.a.d(v1, ((int)(((LayoutCoordinates)object0).C() & 0xFFFFFFFFL)));
            a a0 = (a)this.c0;
            Balloon balloon0 = a0.getBalloon();
            balloon0.Y.getClass();
            if(((int)(v2 >> 0x20)) <= 0 && ((int)(v2 >> 0x20)) != 0x80000000) {
                throw new IllegalArgumentException("The width of the balloon must bigger than zero.");
            }
            N0 n00 = balloon0.Z;
            if(((RadiusLayout)n00.c0).getChildCount() != 0) {
                View view0 = Pb.a.z(((RadiusLayout)n00.c0), 0);
                ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
                if(viewGroup$LayoutParams0 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                viewGroup$LayoutParams0.width = (int)(v2 >> 0x20);
                viewGroup$LayoutParams0.height = (int)(v2 & 0xFFFFFFFFL);
                view0.setLayoutParams(viewGroup$LayoutParams0);
            }
            ViewGroup.LayoutParams viewGroup$LayoutParams1 = a0.getLayoutParams();
            if(viewGroup$LayoutParams1 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            viewGroup$LayoutParams1.width = (int)(v2 >> 0x20);
            viewGroup$LayoutParams1.height = (int)(v2 & 0xFFFFFFFFL);
            a0.setLayoutParams(viewGroup$LayoutParams1);
            a0.getBalloonLayoutInfo$balloon_compose_release().setValue(new g(b.d(((LayoutCoordinates)object0).f(0L)), b.e(((LayoutCoordinates)object0).f(0L)), ((int)(v2 >> 0x20)), ((int)(v2 & 0xFFFFFFFFL))));
            return t.a;
        }
        Nb.j.f(((u0)object0), "controller");
        R1.g g0 = d.a(LayoutInflater.from(((k3)this.Z)), this.Y, null);
        g0.r(((k3)this.Z));
        ViewModel viewModel0 = (ViewModel)this.b0;
        if(viewModel0 != null) {
            g0.t(30, viewModel0);
        }
        Object object1 = this.c0;
        if(object1 != null) {
            g0.t(20, object1);
        }
        g0.t(10, ((u0)object0));
        Nb.j.e(g0.d, "getRoot(...)");
        ((u0)object0).a.setContentView(g0.d);
        return t.a;
    }
}

