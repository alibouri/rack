package c;

import Nb.j;
import Nb.z;
import android.os.Bundle;
import c2.w;
import c2.x;
import e.a;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public final class g implements a {
    public final int a;
    public final x b;

    public g(x x0, int v) {
        this.a = v;
        this.b = x0;
        super();
    }

    @Override  // e.a
    public final void a(o o0) {
        if(this.a != 0) {
            w w0 = (w)this.b.s0.Y;
            w0.b0.b(w0, w0, null);
            return;
        }
        x x0 = this.b;
        j.f(o0, "it");
        Bundle bundle0 = x0.b0.b.a("android:support:activity-result");
        if(bundle0 != null) {
            m m0 = x0.g0;
            m0.getClass();
            ArrayList arrayList0 = bundle0.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList arrayList1 = bundle0.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if(arrayList1 != null && arrayList0 != null) {
                ArrayList arrayList2 = bundle0.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                if(arrayList2 != null) {
                    m0.d.addAll(arrayList2);
                }
                Bundle bundle1 = bundle0.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                Bundle bundle2 = m0.g;
                if(bundle1 != null) {
                    bundle2.putAll(bundle1);
                }
                int v = arrayList1.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    String s = (String)arrayList1.get(v1);
                    LinkedHashMap linkedHashMap0 = m0.b;
                    boolean z = linkedHashMap0.containsKey(s);
                    LinkedHashMap linkedHashMap1 = m0.a;
                    if(z) {
                        Integer integer0 = (Integer)linkedHashMap0.remove(s);
                        if(!bundle2.containsKey(s)) {
                            z.c(linkedHashMap1).remove(integer0);
                        }
                    }
                    Object object0 = arrayList0.get(v1);
                    j.e(object0, "rcs[i]");
                    int v2 = ((Number)object0).intValue();
                    Object object1 = arrayList1.get(v1);
                    j.e(object1, "keys[i]");
                    linkedHashMap1.put(v2, ((String)object1));
                    linkedHashMap0.put(((String)object1), v2);
                }
            }
        }
    }
}

