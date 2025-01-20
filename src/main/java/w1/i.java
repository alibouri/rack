package W1;

import Bb.F;
import Bb.p;
import Nb.j;
import T1.a;
import T1.o;
import V1.c;
import V1.e;
import V1.g;
import androidx.datastore.preferences.protobuf.A;
import androidx.datastore.preferences.protobuf.x;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class i {
    public static final i a;

    static {
        i.a = new i();  // initializer: Ljava/lang/Object;-><init>()V
    }

    public final b a(FileInputStream fileInputStream0) {
        e e0;
        try {
            e0 = e.l(fileInputStream0);
        }
        catch(A a0) {
            throw new a("Unable to parse preferences proto.", a0);  // initializer: Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
        }
        b b0 = new b(false);
        f[] arr_f = (f[])Arrays.copyOf(new f[0], 0);
        j.f(arr_f, "pairs");
        if(b0.b.get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
        if(arr_f.length <= 0) {
            Map map0 = e0.j();
            j.e(map0, "preferencesProto.preferencesMap");
            for(Object object0: map0.entrySet()) {
                String s = (String)((Map.Entry)object0).getKey();
                V1.i i0 = (V1.i)((Map.Entry)object0).getValue();
                j.e(s, "name");
                j.e(i0, "value");
                int v = i0.x();
                switch((v == 0 ? -1 : h.a[v.h.d(v)])) {
                    case -1: {
                        throw new a("Value case is null.", null);  // initializer: Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
                    }
                    case 1: {
                        b0.b(new W1.e(s), Boolean.valueOf(i0.p()));
                        break;
                    }
                    case 2: {
                        b0.b(new W1.e(s), i0.s());
                        break;
                    }
                    case 3: {
                        b0.b(new W1.e(s), i0.r());
                        break;
                    }
                    case 4: {
                        b0.b(new W1.e(s), i0.t());
                        break;
                    }
                    case 5: {
                        b0.b(new W1.e(s), i0.u());
                        break;
                    }
                    case 6: {
                        W1.e e1 = new W1.e(s);
                        String s1 = i0.v();
                        j.e(s1, "value.string");
                        b0.b(e1, s1);
                        break;
                    }
                    case 7: {
                        W1.e e2 = new W1.e(s);
                        x x0 = i0.w().k();
                        j.e(x0, "value.stringSet.stringsList");
                        b0.b(e2, p.U0(x0));
                        break;
                    }
                    case 8: {
                        throw new a("Value not set.", null);  // initializer: Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
                    }
                    default: {
                        throw new Ab.e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                    }
                }
            }
            Map map1 = Collections.unmodifiableMap(b0.a);
            j.e(map1, "unmodifiableMap(preferencesMap)");
            return new b(F.a0(map1), true);
        }
        f f0 = arr_f[0];
        throw null;
    }

    public final void b(Object object0, o o0) {
        V1.i i0;
        Map map0 = Collections.unmodifiableMap(((b)object0).a);
        j.e(map0, "unmodifiableMap(preferencesMap)");
        c c0 = e.k();
        for(Object object1: map0.entrySet()) {
            W1.e e0 = (W1.e)((Map.Entry)object1).getKey();
            Object object2 = ((Map.Entry)object1).getValue();
            String s = e0.a;
            if(object2 instanceof Boolean) {
                V1.h h0 = V1.i.y();
                h0.d();
                V1.i.m(((V1.i)h0.Y), ((Boolean)object2).booleanValue());
                i0 = (V1.i)h0.b();
            }
            else if(object2 instanceof Float) {
                V1.h h1 = V1.i.y();
                float f = ((Number)object2).floatValue();
                h1.d();
                V1.i.n(((V1.i)h1.Y), f);
                i0 = (V1.i)h1.b();
            }
            else if(object2 instanceof Double) {
                V1.h h2 = V1.i.y();
                double f1 = ((Number)object2).doubleValue();
                h2.d();
                V1.i.l(((V1.i)h2.Y), f1);
                i0 = (V1.i)h2.b();
            }
            else if(object2 instanceof Integer) {
                V1.h h3 = V1.i.y();
                int v = ((Number)object2).intValue();
                h3.d();
                V1.i.o(((V1.i)h3.Y), v);
                i0 = (V1.i)h3.b();
            }
            else if(object2 instanceof Long) {
                V1.h h4 = V1.i.y();
                long v1 = ((Number)object2).longValue();
                h4.d();
                V1.i.i(((V1.i)h4.Y), v1);
                i0 = (V1.i)h4.b();
            }
            else if(object2 instanceof String) {
                V1.h h5 = V1.i.y();
                h5.d();
                V1.i.j(((V1.i)h5.Y), ((String)object2));
                i0 = (V1.i)h5.b();
            }
            else {
                if(!(object2 instanceof Set)) {
                    throw new IllegalStateException(j.m(object2.getClass().getName(), "PreferencesSerializer does not support type: "));
                }
                V1.h h6 = V1.i.y();
                V1.f f2 = g.l();
                f2.d();
                g.i(((g)f2.Y), ((Set)object2));
                h6.d();
                V1.i.k(((V1.i)h6.Y), f2);
                i0 = (V1.i)h6.b();
            }
            c0.getClass();
            c0.d();
            e.i(((e)c0.Y)).put(s, i0);
        }
        e e1 = (e)c0.b();
        int v2 = e1.a();
        if(v2 > 0x1000) {
            v2 = 0x1000;
        }
        androidx.datastore.preferences.protobuf.j j0 = new androidx.datastore.preferences.protobuf.j(o0, v2);
        e1.c(j0);
        if(j0.f > 0) {
            j0.P();
        }
    }
}

