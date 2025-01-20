package u9;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.util.TypedValue;
import androidx.lifecycle.LifecycleOwner;
import z9.a;

public final class j {
    public q A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public boolean E;
    public final long F;
    public LifecycleOwner G;
    public final int H;
    public final int I;
    public m J;
    public a K;
    public final long L;
    public final o M;
    public final int N;
    public String O;
    public int P;
    public final boolean Q;
    public final int R;
    public boolean S;
    public final boolean T;
    public final boolean U;
    public final Context a;
    public final int b;
    public final int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final boolean h;
    public final int i;
    public final int j;
    public final float k;
    public c l;
    public final b m;
    public u9.a n;
    public final float o;
    public int p;
    public final float q;
    public final String r;
    public final int s;
    public final float t;
    public final int u;
    public final w v;
    public final float w;
    public final float x;
    public v9.a y;
    public p z;

    public j(Context context0) {
        Nb.j.f(context0, "context");
        super();
        this.a = context0;
        this.b = new Point(Resources.getSystem().getDisplayMetrics().widthPixels, Resources.getSystem().getDisplayMetrics().heightPixels).x;
        this.c = 0x80000000;
        this.h = true;
        this.i = 0x80000000;
        this.j = Pb.a.H(TypedValue.applyDimension(1, 12.0f, Resources.getSystem().getDisplayMetrics()));
        this.k = 0.5f;
        this.l = c.X;
        this.m = b.X;
        this.n = u9.a.Y;
        this.o = 2.5f;
        this.p = 0xFF000000;
        this.q = TypedValue.applyDimension(1, 5.0f, Resources.getSystem().getDisplayMetrics());
        this.r = "";
        int v = -1;
        this.s = -1;
        this.t = 12.0f;
        this.u = 17;
        this.v = w.X;
        Pb.a.H(TypedValue.applyDimension(1, 28.0f, Resources.getSystem().getDisplayMetrics()));
        Pb.a.H(TypedValue.applyDimension(1, 28.0f, Resources.getSystem().getDisplayMetrics()));
        Pb.a.H(TypedValue.applyDimension(1, 8.0f, Resources.getSystem().getDisplayMetrics()));
        this.w = 1.0f;
        this.x = TypedValue.applyDimension(1, 2.0f, Resources.getSystem().getDisplayMetrics());
        this.B = true;
        this.C = true;
        this.D = true;
        this.F = -1L;
        this.H = 0x80000000;
        this.I = 0x80000000;
        this.J = m.Y;
        this.K = a.Y;
        this.L = 500L;
        this.M = o.X;
        this.N = 0x80000000;
        this.P = 1;
        boolean z = context0.getResources().getConfiguration().getLayoutDirection() == 1;
        this.Q = z;
        if(!z) {
            v = 1;
        }
        this.R = v;
        this.S = true;
        this.T = true;
        this.U = true;
    }
}

