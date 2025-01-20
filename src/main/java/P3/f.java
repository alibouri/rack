package P3;

import Ab.e;
import Ab.k;
import Bb.F;
import Bb.p;
import Bb.q;
import Bb.r;
import Bb.v;
import Bb.z;
import M4.s;
import Nb.j;
import O3.b;
import O3.l;
import Y8.W3;
import a.a;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledListType;
import com.apollographql.apollo.api.CompiledNamedType;
import com.apollographql.apollo.api.CompiledNotNullType;
import com.apollographql.apollo.api.CompiledSelection;
import com.apollographql.apollo.api.CompiledType;
import com.apollographql.apollo.api.Executable.Variables;
import hd.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

public final class f {
    public final Variables a;
    public final W3 b;
    public final LinkedHashMap c;

    public f(Variables executable$Variables0, String s, W3 w30) {
        j.f(executable$Variables0, "variables");
        j.f(s, "rootKey");
        super();
        this.a = executable$Variables0;
        this.b = w30;
        this.c = new LinkedHashMap();
    }

    public final b a(Map map0, String s, List list0, String s1) {
        Object object5;
        Variables executable$Variables0;
        Object object0 = map0.get("__typename");
        s s2 = new s(2, false);
        f.b(list0, s1, (object0 instanceof String ? ((String)object0) : null), s2);
        ArrayList arrayList0 = s2.X;
        Iterable iterable0 = map0.entrySet();
        ArrayList arrayList1 = new ArrayList();
        for(Object object1: iterable0) {
            Map.Entry map$Entry0 = (Map.Entry)object1;
            ArrayList arrayList2 = new ArrayList();
            for(Object object2: arrayList0) {
                if(j.a(((CompiledField)object2).getResponseName(), map$Entry0.getKey())) {
                    arrayList2.add(object2);
                }
            }
            if(arrayList2.isEmpty()) {
                object5 = null;
            }
            else {
                ArrayList arrayList3 = new ArrayList();
                Iterator iterator2 = arrayList2.iterator();
                while(true) {
                    boolean z = iterator2.hasNext();
                    executable$Variables0 = this.a;
                    if(!z) {
                        break;
                    }
                    Object object3 = iterator2.next();
                    if(!a.B(executable$Variables0.getValueMap(), ((CompiledField)object3))) {
                        arrayList3.add(object3);
                    }
                }
                if(!arrayList3.isEmpty()) {
                    Builder compiledField$Builder0 = ((CompiledField)p.p0(arrayList3)).newBuilder();
                    ArrayList arrayList4 = new ArrayList();
                    for(Object object4: arrayList3) {
                        v.f0(arrayList4, ((CompiledField)object4).getSelections());
                    }
                    CompiledField compiledField0 = compiledField$Builder0.selections(arrayList4).condition(z.X).build();
                    String s3 = compiledField0.nameWithArguments(executable$Variables0);
                    String s4 = j.a(s, b.c.a) ? null : s;
                    object5 = new k(s3, this.c(map$Entry0.getValue(), compiledField0, compiledField0.getType(), (s4 == null ? s3 : s4 + '.' + s3)));
                }
            }
            if(object5 != null) {
                arrayList1.add(object5);
            }
        }
        l l0 = new l(s, F.W(arrayList1), null);
        LinkedHashMap linkedHashMap0 = this.c;
        l l1 = (l)linkedHashMap0.get(s);
        if(l1 != null) {
            l0 = (l)l1.b(l0, null).X;
        }
        linkedHashMap0.put(s, l0);
        return new b(s);
    }

    public static void b(List list0, String s, String s1, s s2) {
        for(Object object0: list0) {
            CompiledSelection compiledSelection0 = (CompiledSelection)object0;
            if(compiledSelection0 instanceof CompiledField) {
                s2.X.add(compiledSelection0);
            }
            else {
                if(!(compiledSelection0 instanceof CompiledFragment)) {
                    throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                }
                if(p.k0(((CompiledFragment)compiledSelection0).getPossibleTypes(), s1) || j.a(((CompiledFragment)compiledSelection0).getTypeCondition(), s)) {
                    f.b(((CompiledFragment)compiledSelection0).getSelections(), s, s1, s2);
                }
            }
        }
    }

    public final Object c(Object object0, CompiledField compiledField0, CompiledType compiledType0, String s) {
        if(compiledType0 instanceof CompiledNotNullType) {
            if(object0 == null) {
                throw new IllegalStateException("Check failed.");
            }
            compiledType0 = ((CompiledNotNullType)compiledType0).getOfType();
        }
        else if(object0 == null) {
            return null;
        }
        if(compiledType0 instanceof CompiledListType) {
            if(!(object0 instanceof List)) {
                throw new IllegalStateException("Check failed.");
            }
            ArrayList arrayList0 = new ArrayList(r.b0(((Iterable)object0)));
            int v = 0;
            for(Object object1: ((Iterable)object0)) {
                if(v >= 0) {
                    arrayList0.add(this.c(object1, compiledField0, ((CompiledListType)compiledType0).getOfType(), (s == null ? String.valueOf(v) : s + '.' + v)));
                    ++v;
                    continue;
                }
                q.Z();
                throw null;
            }
            return arrayList0;
        }
        if(compiledType0 instanceof CompiledNamedType && CompiledGraphQL.isComposite(((CompiledNamedType)compiledType0))) {
            if(!(object0 instanceof Map)) {
                throw new IllegalStateException("Check failed.");
            }
            j.f(this.a, "variables");
            this.b.getClass();
            j.f(((Map)object0), "obj");
            Object object2 = ((Map)object0).get("id");
            b b0 = object2 == null ? null : new b(((String)object2));
            c.a.n("ApolloCache");
            c.a.a("cacheKeyForObject (" + ((Map)object0) + ") -> " + b0, new Object[0]);
            if(b0 != null) {
                String s1 = b0.a;
                if(s1 != null) {
                    s = s1;
                }
            }
            return this.a(((Map)object0), s, compiledField0.getSelections(), compiledField0.getType().rawType().getName());
        }
        return object0;
    }
}

