package Fa;

import Ab.t;
import B.q0;
import C3.i;
import Ea.O;
import Ea.Q;
import N4.o;
import U.d;
import U.p;
import android.support.v4.media.session.a;
import androidx.compose.ui.Modifier;
import c0.b;
import com.sendwave.backend.type.PartnerOrg;
import hb.h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final class f implements Function2 {
    public final int X;
    public final Object Y;
    public final Object Z;
    public final Object b0;
    public final int c0;
    public final int d0;
    public final Object e0;

    public f(Object object0, Object object1, Object object2, Object object3, int v, int v1, int v2) {
        this.X = v2;
        this.e0 = object0;
        this.Y = object1;
        this.Z = object2;
        this.b0 = object3;
        this.c0 = v;
        this.d0 = v1;
        super();
    }

    public f(String s, String s1, int v, String s2, Modifier modifier0, int v1) {
        this.X = 6;
        super();
        this.e0 = s;
        this.Y = s1;
        this.c0 = v;
        this.Z = s2;
        this.b0 = modifier0;
        this.d0 = v1;
    }

    public f(String s, String s1, String s2, Function0 function00, int v, int v1) {
        this.X = 2;
        super();
        this.e0 = s;
        this.Y = s1;
        this.b0 = s2;
        this.Z = function00;
        this.c0 = v;
        this.d0 = v1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        switch(this.X) {
            case 0: {
                ((Integer)object1).getClass();
                m.h(((Q)this.e0), ((e)this.Y), ((Function0)this.Z), ((i)this.b0), ((p)object0), d.O(this.c0 | 1), this.d0);
                return t.a;
            }
            case 1: {
                ((Integer)object1).getClass();
                m.c(((O)this.e0), ((e)this.Y), ((Function0)this.Z), ((i)this.b0), ((p)object0), d.O(this.c0 | 1), this.d0);
                return t.a;
            }
            case 2: {
                ((Integer)object1).getClass();
                a.d(((String)this.e0), ((String)this.Y), ((String)this.b0), ((Function0)this.Z), ((p)object0), d.O(this.c0 | 1), this.d0);
                return t.a;
            }
            case 3: {
                ((Integer)object1).getClass();
                h.p(((PartnerOrg)this.e0), ((PartnerOrg)this.Y), ((Function0)this.Z), ((Function0)this.b0), ((p)object0), d.O(this.c0 | 1), this.d0);
                return t.a;
            }
            case 4: {
                ((Integer)object1).getClass();
                Q4.i.j(((String)this.e0), ((Modifier)this.Y), ((q0)this.Z), ((b)this.b0), ((p)object0), d.O(this.c0 | 1), this.d0);
                return t.a;
            }
            case 5: {
                ((Integer)object1).getClass();
                o.h(this.e0, ((Modifier)this.Y), ((Function2)this.Z), ((b)this.b0), ((p)object0), d.O(this.c0 | 1), this.d0);
                return t.a;
            }
            default: {
                ((Integer)object1).getClass();
                h.u(((String)this.e0), ((String)this.Y), this.c0, ((String)this.Z), ((Modifier)this.b0), ((p)object0), d.O(this.d0 | 1));
                return t.a;
            }
        }
    }
}

