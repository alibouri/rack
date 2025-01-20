package t2;

import Ab.e;
import M6.b;
import Nb.j;
import android.database.Cursor;
import java.util.List;
import k2.q1;
import k2.r1;
import k2.s1;
import k2.t1;
import k2.v1;
import k2.w1;
import kotlin.jvm.functions.Function1;
import q2.C;
import q2.v;

public abstract class a {
    public static final v1 a;

    static {
        a.a = new v1();  // initializer: Ljava/lang/Object;-><init>()V
    }

    public static w1 a(t1 t10, C c0, v v0, int v1, Function1 function10) {
        List list0;
        int v5;
        j.f(c0, "sourceQuery");
        j.f(v0, "db");
        Integer integer0 = (Integer)t10.a();
        int v2 = integer0 == null ? 0 : ((int)integer0);
        int v3 = t10.a;
        int v4 = !(t10 instanceof r1) || v2 >= v3 ? v3 : v2;
        if(!(t10 instanceof r1)) {
            if(!(t10 instanceof q1)) {
                if(!(t10 instanceof s1)) {
                    throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                }
                if(v2 >= v1) {
                    v2 = Math.max(0, v1 - v3);
                }
            }
            v5 = v2;
        }
        else if(v2 < v3) {
            v5 = 0;
        }
        else {
            v5 = v2 - v3;
        }
        C c1 = b.o(c0.f0, "SELECT * FROM ( " + c0.b() + " ) LIMIT " + v4 + " OFFSET " + v5);
        c1.a(c0);
        Integer integer1 = null;
        Cursor cursor0 = v0.n(c1, null);
        try {
            list0 = (List)function10.n(cursor0);
        }
        finally {
            cursor0.close();
            c1.f();
        }
        int v7 = list0.size() + v5;
        Integer integer2 = list0.isEmpty() || list0.size() < v4 || v7 >= v1 ? null : v7;
        if(v5 > 0 && !list0.isEmpty()) {
            integer1 = v5;
        }
        return new w1(list0, integer1, integer2, v5, Math.max(0, v1 - v7));
    }
}

