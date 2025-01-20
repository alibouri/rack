package oa;

import Ab.k;
import Ab.t;
import Bb.F;
import Fb.j;
import W5.f;
import com.sendwave.backend.type.LinkedAccountKind.BANK;
import com.sendwave.backend.type.LinkedAccountKind.MFI;
import com.sendwave.backend.type.LinkedAccountKind;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function3;

public final class n extends j implements Function3 {
    public k c0;
    public Map d0;

    @Override  // kotlin.jvm.functions.Function3
    public final Object h(Object object0, Object object1, Object object2) {
        n n0 = new n(3, ((g)object2));  // initializer: LFb/j;-><init>(ILkotlin/coroutines/g;)V
        n0.c0 = (k)object0;
        n0.d0 = (Map)object1;
        return n0.v(t.a);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        f.b0(object0);
        k k0 = this.c0;
        Map map0 = this.d0;
        String s = (String)k0.X;
        a a0 = (a)k0.Y;
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        Iterator iterator0 = map0.entrySet().iterator();
        while(true) {
            boolean z = true;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object1 = iterator0.next();
            Map.Entry map$Entry0 = (Map.Entry)object1;
            LinkedAccountKind linkedAccountKind0 = (LinkedAccountKind)map$Entry0.getKey();
            switch((a0 == null ? -1 : m.a[a0.ordinal()])) {
                case 1: {
                    z = Nb.j.a(linkedAccountKind0, MFI.X);
                    break;
                }
                case 2: {
                    z = Nb.j.a(linkedAccountKind0, BANK.X);
                }
            }
            if(z) {
                linkedHashMap0.put(map$Entry0.getKey(), map$Entry0.getValue());
            }
        }
        Object object2 = new LinkedHashMap(F.I(linkedHashMap0.size()));
        for(Object object3: linkedHashMap0.entrySet()) {
            Object object4 = ((Map.Entry)object3).getKey();
            Iterable iterable0 = (List)((Map.Entry)object3).getValue();
            ArrayList arrayList0 = new ArrayList();
            for(Object object5: iterable0) {
                if(Vb.j.R(((b)object5).a, s, true)) {
                    arrayList0.add(object5);
                }
            }
            ((Map)object2).put(object4, arrayList0);
        }
        return object2;
    }
}

