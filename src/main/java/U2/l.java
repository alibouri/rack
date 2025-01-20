package U2;

import Ea.N0;
import Eb.a;
import Fb.c;
import I2.A;
import N2.b;
import N2.m;
import Nb.j;
import R2.p;
import W5.f;
import ac.o0;
import ac.w;

public abstract class l {
    public static final String a;

    static {
        String s = A.g("ConstraintTrkngWrkr");
        j.e(s, "tagWithPrefix(\"ConstraintTrkngWrkr\")");
        l.a = s;
    }

    public static final Object a(m m0, p p0, c c0) {
        U2.j j0;
        if(c0 instanceof U2.j) {
            j0 = (U2.j)c0;
            int v = j0.c0;
            if((v & 0x80000000) == 0) {
                j0 = new U2.j(c0);  // initializer: LFb/c;-><init>(Lkotlin/coroutines/g;)V
            }
            else {
                j0.c0 = v ^ 0x80000000;
            }
        }
        else {
            j0 = new U2.j(c0);  // initializer: LFb/c;-><init>(Lkotlin/coroutines/g;)V
        }
        Object object0 = j0.b0;
        Object object1 = a.X;
        switch(j0.c0) {
            case 0: {
                f.b0(object0);
                N0 n00 = new N0(new w(m0.e(p0), new k(p0, null), 4), 1);
                j0.c0 = 1;
                object0 = o0.s(n00, j0);
                return object0 != object1 ? new Integer(((b)object0).a) : object1;
            }
            case 1: {
                f.b0(object0);
                return new Integer(((b)object0).a);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

