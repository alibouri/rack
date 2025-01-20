package W3;

import Ab.k;
import Bb.F;
import Bb.v;
import Nb.j;
import Nb.z;
import Ob.a;
import Ob.e;
import com.apollographql.apollo.api.DeferredFragmentIdentifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

public final class c {
    public final LinkedHashMap a;
    public final LinkedHashMap b;
    public final LinkedHashSet c;
    public final LinkedHashSet d;
    public boolean e;
    public boolean f;

    public c() {
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        this.a = linkedHashMap0;
        this.b = linkedHashMap0;
        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
        this.c = linkedHashSet0;
        this.d = linkedHashSet0;
        this.e = true;
    }

    public static void a(Map map0, Map map1) {
        for(Object object0: map1.entrySet()) {
            String s = (String)((Map.Entry)object0).getKey();
            Object object1 = ((Map.Entry)object0).getValue();
            if(map0.containsKey(s)) {
                Object object2 = map0.get(s);
                if(object2 instanceof Map && (!(object2 instanceof a) || object2 instanceof e)) {
                    Object object3 = map0.get(s);
                    j.d(object3, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>");
                    Map map2 = z.c(object3);
                    Map map3 = object1 instanceof Map ? ((Map)object1) : null;
                    if(map3 == null) {
                        throw new IllegalStateException(("\'" + s + "\' is an object in destination but not in map").toString());
                    }
                    c.a(map2, map3);
                    continue;
                }
            }
            map0.put(s, object1);
        }
    }

    public final LinkedHashMap b(Map map0) {
        Iterator iterator2;
        Object object6;
        LinkedHashMap linkedHashMap0 = this.b;
        LinkedHashMap linkedHashMap1 = this.a;
        if(linkedHashMap0.isEmpty()) {
            linkedHashMap1.putAll(map0);
            return linkedHashMap0;
        }
        Object object0 = map0.get("incremental");
        List list0 = object0 instanceof List ? ((List)object0) : null;
        if(list0 == null) {
            this.f = true;
        }
        else {
            this.f = false;
            ArrayList arrayList0 = new ArrayList();
            ArrayList arrayList1 = new ArrayList();
            for(Iterator iterator0 = list0.iterator(); iterator0.hasNext(); iterator0 = iterator2) {
                Object object1 = iterator0.next();
                Map map1 = (Map)object1;
                Map map2 = (Map)map1.get("data");
                Object object2 = map1.get("path");
                j.d(object2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list1 = (List)object2;
                Object object3 = linkedHashMap0.get("data");
                j.d(object3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                Object object4 = (Map)object3;
                if(map2 == null) {
                    iterator2 = iterator0;
                }
                else {
                    for(Object object5: list1) {
                        if(object4 instanceof List) {
                            j.d(object5, "null cannot be cast to non-null type kotlin.Int");
                            object6 = ((List)object4).get(((int)(((Integer)object5))));
                        }
                        else {
                            j.d(object4, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                            object6 = ((Map)object4).get(object5);
                        }
                        object4 = object6;
                        iterator0 = iterator0;
                    }
                    iterator2 = iterator0;
                    j.d(object4, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>");
                    c.a(z.c(object4), map2);
                    DeferredFragmentIdentifier deferredFragmentIdentifier0 = new DeferredFragmentIdentifier(list1, ((String)map1.get("label")));
                    this.c.add(deferredFragmentIdentifier0);
                }
                Object object7 = map1.get("errors");
                List list2 = object7 instanceof List ? ((List)object7) : null;
                if(list2 != null) {
                    v.f0(arrayList0, list2);
                }
                Object object8 = map1.get("extensions");
                Map map3 = object8 instanceof Map ? ((Map)object8) : null;
                if(map3 != null) {
                    arrayList1.add(map3);
                }
            }
            if(arrayList0.isEmpty()) {
                linkedHashMap1.remove("errors");
            }
            else {
                linkedHashMap1.put("errors", arrayList0);
            }
            if(arrayList1.isEmpty()) {
                linkedHashMap1.remove("extensions");
            }
            else {
                linkedHashMap1.put("extensions", F.J(new k("incremental", arrayList1)));
            }
        }
        Boolean boolean0 = (Boolean)map0.get("hasNext");
        this.e = boolean0 == null ? false : boolean0.booleanValue();
        return linkedHashMap0;
    }
}

