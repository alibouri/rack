package com.apollographql.apollo.api;

import Ab.e;
import Ab.k;
import Bb.F;
import Bb.p;
import Bb.q;
import Bb.r;
import Bb.v;
import Bb.z;
import I2.J;
import Nb.j;
import Sb.c;
import Sb.d;
import com.apollographql.apollo.api.json.MapJsonReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

public final class FakeResolverKt {
    public static final Object buildData(Adapter adapter0, List list0, String s, Map map0, FakeResolver fakeResolver0, CustomScalarAdapters customScalarAdapters0) {
        j.f(adapter0, "adapter");
        j.f(list0, "selections");
        j.f(s, "typename");
        j.f(map0, "map");
        j.f(fakeResolver0, "resolver");
        j.f(customScalarAdapters0, "customScalarAdapters");
        return Adapters.-obj(adapter0, false).fromJson(new MapJsonReader(FakeResolverKt.buildFakeObject(list0, s, map0, fakeResolver0, customScalarAdapters0), null, 2, null), CustomScalarAdapters.PassThrough);
    }

    public static final Object buildData(BuilderFactory builderFactory0, Function1 function10, Adapter adapter0, List list0, String s, FakeResolver fakeResolver0, CustomScalarAdapters customScalarAdapters0) {
        j.f(builderFactory0, "builderFactory");
        j.f(function10, "block");
        j.f(adapter0, "adapter");
        j.f(list0, "selections");
        j.f(s, "typename");
        j.f(fakeResolver0, "resolver");
        j.f(customScalarAdapters0, "customScalarAdapters");
        Object object0 = builderFactory0.newBuilder(CustomScalarAdapters.PassThrough);
        function10.n(object0);
        return FakeResolverKt.buildData(adapter0, list0, s, ((ObjectBuilder)object0).build(), fakeResolver0, customScalarAdapters0);
    }

    private static final Map buildFakeObject(List list0, String s, Map map0, FakeResolver fakeResolver0, CustomScalarAdapters customScalarAdapters0) {
        CompiledField compiledField0 = new Builder("data", new CompiledNotNullType(b.l(s))).selections(list0).build();
        Present optional$Present0 = new Present(map0);
        CompiledNotNullType compiledNotNullType0 = new CompiledNotNullType(b.l(s));
        Object object0 = FakeResolverKt.buildFieldOfType(z.X, "", compiledField0, fakeResolver0, optional$Present0, compiledNotNullType0, customScalarAdapters0);
        j.d(object0, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
        return (Map)object0;
    }

    private static final Object buildFieldOfNonNullType(List list0, String s, CompiledField compiledField0, FakeResolver fakeResolver0, Optional optional0, CompiledType compiledType0, CustomScalarAdapters customScalarAdapters0) {
        Object object1;
        int v = 0;
        String s1 = s;
        Adapter adapter0 = null;
        if(compiledType0 instanceof CompiledListType) {
            if(optional0 instanceof Present) {
                Object object0 = ((Present)optional0).getValue();
                List list1 = object0 instanceof List ? ((List)object0) : null;
                if(list1 != null) {
                    object1 = new ArrayList(r.b0(list1));
                    Iterator iterator0 = list1.iterator();
                    while(true) {
                        if(!iterator0.hasNext()) {
                            return object1;
                        }
                        Object object2 = iterator0.next();
                        if(v >= 0) {
                            Present optional$Present0 = new Present(object2);
                            CompiledType compiledType1 = ((CompiledListType)compiledType0).getOfType();
                            ((ArrayList)object1).add(FakeResolverKt.buildFieldOfType(p.G0(list0, v), s, compiledField0, fakeResolver0, optional$Present0, compiledType1, customScalarAdapters0));
                            ++v;
                            continue;
                        }
                        q.Z();
                        throw null;
                    }
                }
                throw new IllegalStateException("");
            }
            d d0 = J.R(0, fakeResolver0.resolveListSize(new FakeResolverContext(list0, s1, compiledField0)));
            object1 = new ArrayList(r.b0(d0));
            c c0 = d0.a();
            while(c0.Z) {
                int v1 = c0.a();
                CompiledType compiledType2 = ((CompiledListType)compiledType0).getOfType();
                ((ArrayList)object1).add(FakeResolverKt.buildFieldOfType(p.G0(list0, v1), s1 + v1, compiledField0, fakeResolver0, Absent.INSTANCE, compiledType2, customScalarAdapters0));
            }
            return object1;
        }
        if(compiledType0 instanceof CompiledNamedType) {
            if(optional0 instanceof Present) {
                if(!compiledField0.getSelections().isEmpty()) {
                    Object object3 = ((Present)optional0).getValue();
                    Map map0 = object3 instanceof Map ? ((Map)object3) : null;
                    if(map0 == null) {
                        throw new IllegalStateException("");
                    }
                    Object object4 = map0.get("__typename");
                    String s2 = object4 instanceof String ? ((String)object4) : null;
                    if(s2 == null) {
                        throw new IllegalStateException("When building fallback types, you must specify \'__typename\'");
                    }
                    String s3 = fakeResolver0.stableIdForObject(map0, compiledField0);
                    if(s3 != null) {
                        s1 = s3;
                    }
                    ArrayList arrayList0 = new ArrayList();
                    for(Object object5: FakeResolverKt.collectAndMerge(compiledField0.getSelections(), s2)) {
                        CompiledField compiledField1 = (CompiledField)object5;
                        StringBuilder stringBuilder0 = M.J.i(s1);
                        stringBuilder0.append(compiledField1.getResponseName());
                        Object object6 = FakeResolverKt.buildFieldOfType(p.G0(list0, compiledField1.getResponseName()), stringBuilder0.toString(), compiledField1, fakeResolver0, FakeResolverKt.getOrAbsent(map0, compiledField1.getResponseName()), compiledField1.getType(), customScalarAdapters0);
                        k k0 = object6 instanceof Absent ? null : new k(compiledField1.getResponseName(), object6);
                        if(k0 != null) {
                            arrayList0.add(k0);
                        }
                    }
                    return F.W(arrayList0);
                }
                return ((Present)optional0).getValue();
            }
            if(!compiledField0.getSelections().isEmpty()) {
                String s4 = fakeResolver0.resolveTypename(new FakeResolverContext(list0, s1, compiledField0));
                Map map1 = b.t("__typename", s4);
                Iterable iterable0 = FakeResolverKt.collectAndMerge(compiledField0.getSelections(), s4);
                int v2 = F.I(r.b0(iterable0));
                if(v2 < 16) {
                    v2 = 16;
                }
                object1 = new LinkedHashMap(v2);
                for(Object object7: iterable0) {
                    ArrayList arrayList1 = p.G0(list0, ((CompiledField)object7).getResponseName());
                    ((Map)object1).put(((CompiledField)object7).getResponseName(), FakeResolverKt.buildFieldOfType(arrayList1, p.v0(arrayList1, null, null, null, null, 0x3F), ((CompiledField)object7), fakeResolver0, FakeResolverKt.getOrAbsent(map1, ((CompiledField)object7).getResponseName()), ((CompiledField)object7).getType(), customScalarAdapters0));
                }
                return object1;
            }
            object1 = fakeResolver0.resolveLeaf(new FakeResolverContext(list0, s1, compiledField0));
            if(compiledType0 instanceof CustomScalarType) {
                try {
                    adapter0 = customScalarAdapters0.responseAdapterFor(((CustomScalarType)compiledType0));
                }
                catch(Exception unused_ex) {
                }
                return adapter0 == null ? object1 : ObjectBuilderKt.adaptValue(adapter0, object1);
            }
            return object1;
        }
        if(!(compiledType0 instanceof CompiledNotNullType)) {
            throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
        }
        throw new IllegalStateException("");
    }

    private static final Object buildFieldOfType(List list0, String s, CompiledField compiledField0, FakeResolver fakeResolver0, Optional optional0, CompiledType compiledType0, CustomScalarAdapters customScalarAdapters0) {
        if(optional0 instanceof Present && ((Present)optional0).getValue() instanceof Absent) {
            return Absent.INSTANCE;
        }
        if(!(compiledType0 instanceof CompiledNotNullType)) {
            if(optional0 instanceof Present) {
                return ((Present)optional0).getValue() == null ? null : FakeResolverKt.buildFieldOfType(list0, s, compiledField0, fakeResolver0, optional0, new CompiledNotNullType(compiledType0), customScalarAdapters0);
            }
            return fakeResolver0.resolveMaybeNull(new FakeResolverContext(list0, s, compiledField0)) ? null : FakeResolverKt.buildFieldOfType(list0, s, compiledField0, fakeResolver0, optional0, new CompiledNotNullType(compiledType0), customScalarAdapters0);
        }
        return FakeResolverKt.buildFieldOfNonNullType(list0, s, compiledField0, fakeResolver0, optional0, ((CompiledNotNullType)compiledType0).getOfType(), customScalarAdapters0);
    }

    private static final List collect(List list0, String s) {
        List list2;
        List list1 = new ArrayList();
        for(Object object0: list0) {
            CompiledSelection compiledSelection0 = (CompiledSelection)object0;
            if(compiledSelection0 instanceof CompiledField) {
                list2 = q.K(compiledSelection0);
            }
            else {
                if(!(compiledSelection0 instanceof CompiledFragment)) {
                    throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                }
                list2 = ((CompiledFragment)compiledSelection0).getPossibleTypes().contains(s) ? FakeResolverKt.collect(((CompiledFragment)compiledSelection0).getSelections(), s) : z.X;
            }
            v.f0(list1, list2);
        }
        return list1;
    }

    private static final List collectAndMerge(List list0, String s) {
        Iterable iterable0 = FakeResolverKt.collect(list0, s);
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        for(Object object0: iterable0) {
            String s1 = ((CompiledField)object0).getResponseName();
            Object object1 = linkedHashMap0.get(s1);
            if(object1 == null) {
                object1 = new ArrayList();
                linkedHashMap0.put(s1, object1);
            }
            ((List)object1).add(object0);
        }
        Iterable iterable1 = linkedHashMap0.values();
        List list1 = new ArrayList(r.b0(iterable1));
        for(Object object2: iterable1) {
            CompiledField compiledField0 = (CompiledField)p.p0(((List)object2));
            Builder compiledField$Builder0 = new Builder(compiledField0.getName(), compiledField0.getType()).alias(compiledField0.getAlias());
            ArrayList arrayList0 = new ArrayList();
            for(Object object3: ((List)object2)) {
                v.f0(arrayList0, ((CompiledField)object3).getSelections());
            }
            ((ArrayList)list1).add(compiledField$Builder0.selections(arrayList0).build());
        }
        return list1;
    }

    private static final Optional getOrAbsent(Map map0, String s) {
        return map0.containsKey(s) ? new Present(map0.get(s)) : Absent.INSTANCE;
    }
}

