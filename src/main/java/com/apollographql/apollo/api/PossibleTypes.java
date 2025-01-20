package com.apollographql.apollo.api;

import Bb.n;
import Bb.p;
import Bb.q;
import Bb.v;
import Bb.z;
import Nb.j;
import a.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public final class PossibleTypes {
    public static final List possibleTypes(List list0, CompiledNamedType compiledNamedType0) {
        j.f(list0, "allTypes");
        j.f(compiledNamedType0, "type");
        Iterable iterable0 = PossibleTypes.possibleTypesInternal(list0, compiledNamedType0);
        HashSet hashSet0 = new HashSet();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: iterable0) {
            if(hashSet0.add(((ObjectType)object0).getName())) {
                arrayList0.add(object0);
            }
        }
        return p.K0(arrayList0, new Comparator() {
            @Override
            public final int compare(Object object0, Object object1) {
                return a.j(((ObjectType)object0).getName(), ((ObjectType)object1).getName());
            }
        });
    }

    private static final List possibleTypesInternal(List list0, CompiledNamedType compiledNamedType0) {
        if(compiledNamedType0 instanceof ObjectType) {
            return q.K(compiledNamedType0);
        }
        if(compiledNamedType0 instanceof UnionType) {
            return n.y0(((UnionType)compiledNamedType0).getMembers());
        }
        if(!(compiledNamedType0 instanceof InterfaceType)) {
            throw new IllegalStateException(("Type \'" + compiledNamedType0 + "\' can only have one possible type").toString());
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            CompiledType compiledType0 = (CompiledType)object0;
            List list1 = z.X;
            if(compiledType0 instanceof ObjectType) {
                Iterable iterable0 = ((ObjectType)compiledType0).getImplements();
                if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
                    for(Object object1: iterable0) {
                        if(j.a(((InterfaceType)object1).getName(), compiledNamedType0.getName())) {
                            list1 = PossibleTypes.possibleTypesInternal(list0, ((CompiledNamedType)compiledType0));
                            break;
                        }
                    }
                }
            }
            else if(compiledType0 instanceof InterfaceType) {
                Iterable iterable1 = ((InterfaceType)compiledType0).getImplements();
                if(!(iterable1 instanceof Collection) || !((Collection)iterable1).isEmpty()) {
                    for(Object object2: iterable1) {
                        if(j.a(((InterfaceType)object2).getName(), compiledNamedType0.getName())) {
                            list1 = PossibleTypes.possibleTypesInternal(list0, ((CompiledNamedType)compiledType0));
                            break;
                        }
                        if(false) {
                            break;
                        }
                    }
                }
            }
            v.f0(arrayList0, list1);
        }
        return arrayList0;
    }
}

