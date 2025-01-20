package com.apollographql.apollo.api;

import Ba.l;
import Bb.p;
import Nb.j;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class DefaultFakeResolver implements FakeResolver {
    private final List allTypes;
    private final List enumTypes;

    public DefaultFakeResolver(List list0) {
        j.f(list0, "types");
        super();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            if(object0 instanceof EnumType) {
                arrayList0.add(object0);
            }
        }
        this.enumTypes = arrayList0;
        this.allTypes = list0;
    }

    @Override  // com.apollographql.apollo.api.FakeResolver
    public Object resolveLeaf(FakeResolverContext fakeResolverContext0) {
        j.f(fakeResolverContext0, "context");
        String s = fakeResolverContext0.getMergedField().getType().rawType().getName();
        switch(s) {
            case "Boolean": {
                return fakeResolverContext0.getId().hashCode() % 2 == 0 ? Boolean.valueOf(true) : Boolean.valueOf(false);
            }
            case "Float": {
                return (double)(((double)(((float)(fakeResolverContext0.getId().hashCode() % 100000)))) / 100.0);
            }
            case "ID": {
                return String.valueOf(Math.abs(fakeResolverContext0.getId().hashCode()));
            }
            case "Int": {
                return (int)(fakeResolverContext0.getId().hashCode() % 100);
            }
            case "String": {
                List list1 = fakeResolverContext0.getPath();
                ListIterator listIterator0 = list1.listIterator(list1.size());
                while(listIterator0.hasPrevious()) {
                    if(listIterator0.previous() instanceof String) {
                        return p.v0(fakeResolverContext0.getPath().subList(listIterator0.nextIndex(), fakeResolverContext0.getPath().size()), "", null, null, new l(21, this), 30);
                    }
                    if(false) {
                        break;
                    }
                }
                return p.v0(fakeResolverContext0.getPath().subList(-1, fakeResolverContext0.getPath().size()), "", null, null, new l(21, this), 30);
            }
            default: {
                Object object0 = null;
                for(Object object1: this.enumTypes) {
                    if(j.a(((EnumType)object1).getName(), s)) {
                        object0 = object1;
                        break;
                    }
                }
                if(((EnumType)object0) == null) {
                    throw new IllegalStateException(("Don\'t know how to instantiate leaf " + s).toString());
                }
                List list0 = ((EnumType)object0).getValues();
                int v = ((EnumType)object0).getValues().size();
                int v1 = fakeResolverContext0.getId().hashCode() % v;
                return list0.get(v1 + (v & ((v1 ^ v) & (-v1 | v1)) >> 0x1F));
            }
        }
    }

    private static final CharSequence resolveLeaf$lambda$1(DefaultFakeResolver defaultFakeResolver0, Object object0) {
        j.f(object0, "it");
        return defaultFakeResolver0.toPathComponent(object0);
    }

    @Override  // com.apollographql.apollo.api.FakeResolver
    public int resolveListSize(FakeResolverContext fakeResolverContext0) {
        j.f(fakeResolverContext0, "context");
        return 3;
    }

    @Override  // com.apollographql.apollo.api.FakeResolver
    public boolean resolveMaybeNull(FakeResolverContext fakeResolverContext0) {
        j.f(fakeResolverContext0, "context");
        return false;
    }

    @Override  // com.apollographql.apollo.api.FakeResolver
    public String resolveTypename(FakeResolverContext fakeResolverContext0) {
        j.f(fakeResolverContext0, "context");
        CompiledNamedType compiledNamedType0 = fakeResolverContext0.getMergedField().getType().rawType();
        List list0 = PossibleTypes.possibleTypes(this.allTypes, compiledNamedType0);
        int v = list0.size();
        int v1 = fakeResolverContext0.getId().hashCode() % v;
        return ((ObjectType)list0.get(v1 + (v & ((v1 ^ v) & (-v1 | v1)) >> 0x1F))).getName();
    }

    @Override  // com.apollographql.apollo.api.FakeResolver
    public String stableIdForObject(Map map0, CompiledField compiledField0) {
        j.f(map0, "obj");
        j.f(compiledField0, "mergedField");
        List list0 = CompiledGraphQL.keyFields(compiledField0.getType().rawType());
        if(map0.containsKey("__stableId")) {
            return String.valueOf(map0.get("__stableId"));
        }
        if(!list0.isEmpty()) {
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append(String.valueOf(map0.get("__typename")));
            for(Object object0: list0) {
                stringBuilder0.append(String.valueOf(map0.get(((String)object0))));
            }
            String s = stringBuilder0.toString();
            j.e(s, "toString(...)");
            return s;
        }
        return null;
    }

    // Deobfuscation rating: LOW(20)
    private final String toPathComponent(Object object0) {
        return object0 instanceof Integer ? "[" + ((Number)object0).intValue() + ']' : object0.toString();
    }
}

