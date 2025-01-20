package c0;

import Ab.c;
import Ab.t;
import N4.j;
import Nb.k;
import U.d;
import U.p;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import u.C;
import u.D;
import v.A;
import v.k0;
import x.h;
import x.o;

public final class a extends k implements Function2 {
    public final int X;
    public final int Y;
    public final Object Z;
    public final Object b0;
    public final Object c0;
    public final Object d0;
    public final Object e0;

    public a(c c0, Object object0, Object object1, Object object2, Object object3, int v, int v1) {
        this.X = v1;
        this.Z = c0;
        this.b0 = object0;
        this.c0 = object1;
        this.d0 = object2;
        this.e0 = object3;
        this.Y = v;
        super(2);
    }

    public a(Object object0, Modifier modifier0, Object object1, Object object2, b b0, int v, int v1) {
        this.X = v1;
        this.b0 = object0;
        this.c0 = modifier0;
        this.d0 = object1;
        this.e0 = object2;
        this.Z = b0;
        this.Y = v;
        super(2);
    }

    public a(h h0, Function0 function00, Modifier modifier0, x.c c0, Function1 function10, int v) {
        this.X = 5;
        this.Z = h0;
        this.b0 = function00;
        this.c0 = modifier0;
        this.d0 = c0;
        this.e0 = (k)function10;
        this.Y = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        switch(this.X) {
            case 0: {
                ((Number)object1).intValue();
                ((b)this.Z).g(this.b0, this.c0, this.d0, this.e0, ((p)object0), d.O(this.Y) | 1);
                return t.a;
            }
            case 1: {
                ((Number)object1).intValue();
                androidx.compose.ui.viewinterop.a.b(((Function1)this.Z), ((Modifier)this.b0), ((Function1)this.c0), ((Function1)this.d0), ((Function1)this.e0), ((p)object0), d.O(this.Y | 1));
                return t.a;
            }
            case 2: {
                ((Number)object1).intValue();
                androidx.compose.animation.a.c(((k0)this.b0), ((Modifier)this.c0), ((C)this.d0), ((D)this.e0), ((b)this.Z), ((p)object0), d.O(this.Y | 1));
                return t.a;
            }
            case 3: {
                ((Number)object1).intValue();
                j.a(((Boolean)this.b0), ((Modifier)this.c0), ((A)this.d0), ((String)this.e0), ((b)this.Z), ((p)object0), d.O(this.Y | 1));
                return t.a;
            }
            case 4: {
                ((Number)object1).intValue();
                j.b(((k0)this.b0), ((Modifier)this.c0), ((A)this.d0), ((Function1)this.e0), ((b)this.Z), ((p)object0), d.O(this.Y | 1));
                return t.a;
            }
            default: {
                ((Number)object1).intValue();
                o.d(((h)this.Z), ((Function0)this.b0), ((Modifier)this.c0), ((x.c)this.d0), ((Function1)(((k)this.e0))), ((p)object0), d.O(this.Y | 1));
                return t.a;
            }
        }
    }
}

