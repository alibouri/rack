package Qa;

import Ab.t;
import U.d;
import U.p;
import android.support.v4.media.session.a;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;

public final class o implements Function2 {
    public final int X;
    public final int Y;
    public final Modifier Z;
    public final int b0;

    public o(int v, int v1, Modifier modifier0) {
        this.X = 1;
        super();
        this.Y = v;
        this.Z = modifier0;
        this.b0 = v1;
    }

    public o(Modifier modifier0, int v, int v1, int v2) {
        this.X = v2;
        this.Z = modifier0;
        this.Y = v;
        this.b0 = v1;
        super();
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((Integer)object1).getClass();
        switch(this.X) {
            case 0: {
                z.a(d.O(this.Y | 1), this.b0, ((p)object0), this.Z);
                return t.a;
            }
            case 1: {
                N4.o.f(this.Y, d.O(this.b0 | 1), ((p)object0), this.Z);
                return t.a;
            }
            default: {
                a.j(d.O(this.Y | 1), this.b0, ((p)object0), this.Z);
                return t.a;
            }
        }
    }
}

