package d0;

import Bb.F;
import Bb.q;
import W5.f;
import a8.Q;
import androidx.compose.runtime.saveable.SaveableStateRegistry.Entry;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

public final class k implements j {
    public final Nb.k a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;

    public k(Map map0, Function1 function10) {
        this.a = (Nb.k)function10;
        this.b = map0 == null ? new LinkedHashMap() : F.a0(map0);
        this.c = new LinkedHashMap();
    }

    @Override  // d0.j
    public final boolean a(Object object0) {
        return ((Boolean)((Function1)this.a).n(object0)).booleanValue();
    }

    @Override  // d0.j
    public final Object b(String s) {
        LinkedHashMap linkedHashMap0 = this.b;
        List list0 = (List)linkedHashMap0.remove(s);
        if(list0 != null && !list0.isEmpty()) {
            if(list0.size() > 1) {
                linkedHashMap0.put(s, list0.subList(1, list0.size()));
            }
            return list0.get(0);
        }
        return null;
    }

    @Override  // d0.j
    public final SaveableStateRegistry.Entry c(String s, Function0 function00) {
        int v = s.length();
        for(int v1 = 0; v1 < v; ++v1) {
            if(!f.J(s.charAt(v1))) {
                LinkedHashMap linkedHashMap0 = this.c;
                Object object0 = linkedHashMap0.get(s);
                if(object0 == null) {
                    object0 = new ArrayList();
                    linkedHashMap0.put(s, object0);
                }
                ((List)object0).add(function00);
                return new Q(this, s, function00);
            }
        }
        throw new IllegalArgumentException("Registered key is empty or blank");
    }

    public final Map d() {
        Map map0 = F.a0(this.b);
        for(Object object0: this.c.entrySet()) {
            String s = (String)((Map.Entry)object0).getKey();
            List list0 = (List)((Map.Entry)object0).getValue();
            if(list0.size() == 1) {
                Object object1 = ((Function0)list0.get(0)).invoke();
                if(object1 == null) {
                    continue;
                }
                if(!this.a(object1)) {
                    throw new IllegalStateException((object1 + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().").toString());
                }
                map0.put(s, q.g(new Object[]{object1}));
            }
            else {
                int v = list0.size();
                ArrayList arrayList0 = new ArrayList(v);
                for(int v1 = 0; v1 < v; ++v1) {
                    Object object2 = ((Function0)list0.get(v1)).invoke();
                    if(object2 != null && !this.a(object2)) {
                        throw new IllegalStateException((object2 + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().").toString());
                    }
                    arrayList0.add(object2);
                }
                map0.put(s, arrayList0);
            }
        }
        return map0;
    }
}

