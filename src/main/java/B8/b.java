package b8;

import Bb.F;
import Fb.c;
import Nb.j;
import W5.f;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;

public final class b {
    public static final b a;
    public static final Map b;

    static {
        b.a = new b();  // initializer: Ljava/lang/Object;-><init>()V
        b.b = Collections.synchronizedMap(new LinkedHashMap());
    }

    public final LinkedHashMap a(c c0) {
        a a0;
        if(c0 instanceof a) {
            a0 = (a)c0;
            int v = a0.d0;
            if((v & 0x80000000) == 0) {
                a0 = new a(this, c0);
            }
            else {
                a0.d0 = v ^ 0x80000000;
            }
        }
        else {
            a0 = new a(this, c0);
        }
        Object object0 = a0.b0;
        Map map0 = b.b;
        switch(a0.d0) {
            case 0: {
                f.b0(object0);
                j.e(map0, "dependencies");
                LinkedHashMap linkedHashMap0 = new LinkedHashMap(F.I(map0.size()));
                Iterator iterator0 = map0.entrySet().iterator();
                if(!iterator0.hasNext()) {
                    return linkedHashMap0;
                }
                Object object1 = iterator0.next();
                ((Map.Entry)object1).getKey();
                b8.c c1 = (b8.c)((Map.Entry)object1).getKey();
                ((Map.Entry)object1).getValue().getClass();
                throw new ClassCastException();
            }
            case 1: {
                f.b0(object0);
                try {
                    j.f(null, "subscriberName");
                    j.e(map0, "dependencies");
                    boolean z = map0.get(null) == null;
                }
                catch(Throwable unused_ex) {
                }
                throw null;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

