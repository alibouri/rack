package o9;

import Ab.t;
import Eb.a;
import Fb.j;
import Mb.h;
import W5.f;
import Y8.E9;
import Y8.F9;
import Y8.G6;
import Y8.G9;
import Y8.R6;
import Y8.y6;
import com.sendwave.shared.VerifyToken;
import java.io.Serializable;
import kotlin.coroutines.g;

public final class t2 extends j implements h {
    public int c0;
    public s2 d0;
    public String e0;
    public String f0;

    public t2(g g0) {
        super(7, g0);
    }

    @Override  // Mb.h
    public final Object e(s2 s20, String s, String s1, Boolean boolean0, Object object0, Object object1, Serializable serializable0) {
        String s2 = (String)object0;
        String s3 = (String)object1;
        t2 t20 = new t2(((g)serializable0));
        t20.d0 = s20;
        t20.e0 = s;
        t20.f0 = s1;
        return t20.v(t.a);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        Boolean boolean0 = null;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                R6 r60 = this.d0.Y;
                G9 g90 = new G9(this.e0, this.f0);
                this.d0 = null;
                this.e0 = null;
                this.c0 = 1;
                object0 = r60.f(g90, G6.X, this);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        F9 f90 = ((E9)((y6)object0).b).a;
        if(f90 != null) {
            boolean0 = Boolean.valueOf(f90.a);
        }
        Nb.j.c(boolean0);
        return new VerifyToken(boolean0.booleanValue());
    }
}

