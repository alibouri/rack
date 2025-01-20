package P3;

import Ab.e;
import Ab.k;
import Bb.F;
import Bb.p;
import Bb.q;
import Bb.r;
import Bb.v;
import Nb.j;
import O3.a;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledSelection;
import com.apollographql.apollo.api.Executable.Variables;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class d {
    public final h a;
    public final Variables b;
    public final O3.d c;
    public final a d;
    public final LinkedHashMap e;
    public final ArrayList f;

    public d(h h0, String s, Variables executable$Variables0, O3.d d0, a a0, List list0, String s1) {
        j.f(s, "rootKey");
        j.f(executable$Variables0, "variables");
        j.f(a0, "cacheHeaders");
        j.f(list0, "rootSelections");
        j.f(s1, "rootTypename");
        super();
        this.a = h0;
        this.b = executable$Variables0;
        this.c = d0;
        this.d = a0;
        this.e = new LinkedHashMap();
        this.f = new ArrayList();
    }

    public static void a(List list0, String s, String s1, b b0) {
        for(Object object0: list0) {
            CompiledSelection compiledSelection0 = (CompiledSelection)object0;
            if(compiledSelection0 instanceof CompiledField) {
                b0.b.add(compiledSelection0);
            }
            else {
                if(!(compiledSelection0 instanceof CompiledFragment)) {
                    throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                }
                if(p.k0(((CompiledFragment)compiledSelection0).getPossibleTypes(), s1) || j.a(((CompiledFragment)compiledSelection0).getTypeCondition(), s)) {
                    Map map0 = b0.a.getValueMap();
                    j.f(map0, "variableValues");
                    if(!a.a.A(((CompiledFragment)compiledSelection0).getCondition(), map0)) {
                        d.a(((CompiledFragment)compiledSelection0).getSelections(), s, s1, b0);
                    }
                }
            }
        }
    }

    public static ArrayList b(List list0, String s, Variables executable$Variables0, String s1) {
        b b0 = new b(executable$Variables0);
        d.a(list0, s, s1, b0);
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        for(Object object0: b0.b) {
            k k0 = new k(((CompiledField)object0).getResponseName(), ((CompiledField)object0).getCondition());
            Object object1 = linkedHashMap0.get(k0);
            if(object1 == null) {
                object1 = new ArrayList();
                linkedHashMap0.put(k0, object1);
            }
            ((List)object1).add(object0);
        }
        Iterable iterable0 = linkedHashMap0.values();
        ArrayList arrayList0 = new ArrayList(r.b0(iterable0));
        for(Object object2: iterable0) {
            Builder compiledField$Builder0 = ((CompiledField)p.p0(((List)object2))).newBuilder();
            ArrayList arrayList1 = new ArrayList();
            for(Object object3: ((List)object2)) {
                v.f0(arrayList1, ((CompiledField)object3).getSelections());
            }
            arrayList0.add(compiledField$Builder0.selections(arrayList1).build());
        }
        return arrayList0;
    }

    public final void c(Object object0, ArrayList arrayList0, List list0, String s) {
        k k0;
        if(object0 instanceof O3.b) {
            c c0 = new c(((O3.b)object0).a, arrayList0, list0, s);
            this.f.add(c0);
            return;
        }
        if(object0 instanceof List) {
            int v = 0;
            for(Object object1: ((Iterable)object0)) {
                if(v >= 0) {
                    this.c(object1, p.G0(arrayList0, v), list0, s);
                    ++v;
                    continue;
                }
                q.Z();
                throw null;
            }
        }
        else if(object0 instanceof Map) {
            j.d(object0, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, @[JvmSuppressWildcards(suppress = <null>)] kotlin.Any?>");
            Object object2 = ((Map)object0).get("__typename");
            Variables executable$Variables0 = this.b;
            ArrayList arrayList1 = d.b(list0, s, executable$Variables0, (object2 instanceof String ? ((String)object2) : null));
            ArrayList arrayList2 = new ArrayList();
            for(Object object3: arrayList1) {
                CompiledField compiledField0 = (CompiledField)object3;
                if(a.a.B(executable$Variables0.getValueMap(), compiledField0)) {
                    k0 = null;
                }
                else {
                    Object object4 = this.c.a(compiledField0, executable$Variables0, ((Map)object0), "");
                    this.c(object4, p.G0(arrayList0, compiledField0.getResponseName()), compiledField0.getSelections(), compiledField0.getType().rawType().getName());
                    k0 = new k(compiledField0.getResponseName(), object4);
                }
                if(k0 != null) {
                    arrayList2.add(k0);
                }
            }
            F.W(arrayList2);
        }
    }
}

