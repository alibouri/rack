package com.apollographql.apollo.api;

import Ab.a;
import Ab.k;
import Bb.F;
import Bb.p;
import Bb.r;
import Bb.z;
import Nb.j;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

public final class CompiledGraphQL {
    public static final ObjectType CompiledDirectiveType;
    public static final ObjectType CompiledEnumValueType;
    public static final ObjectType CompiledFieldType;
    public static final ObjectType CompiledInputValueType;
    public static final ObjectType CompiledSchemaType;
    public static final ObjectType CompiledTypeType;

    public static final CompiledListType -list(CompiledType compiledType0) {
        j.f(compiledType0, "<this>");
        return new CompiledListType(compiledType0);
    }

    public static final CompiledNotNullType -notNull(CompiledType compiledType0) {
        j.f(compiledType0, "<this>");
        return new CompiledNotNullType(compiledType0);
    }

    static {
        CompiledGraphQL.CompiledSchemaType = b.l("__Schema");
        CompiledGraphQL.CompiledTypeType = b.l("__Type");
        CompiledGraphQL.CompiledFieldType = b.l("__Field");
        CompiledGraphQL.CompiledInputValueType = b.l("__InputValue");
        CompiledGraphQL.CompiledEnumValueType = b.l("__EnumValue");
        CompiledGraphQL.CompiledDirectiveType = b.l("__Directive");
    }

    @a
    public static void getCompiledDirectiveType$annotations() {
    }

    @a
    public static void getCompiledEnumValueType$annotations() {
    }

    @a
    public static void getCompiledFieldType$annotations() {
    }

    @a
    public static void getCompiledInputValueType$annotations() {
    }

    @a
    public static void getCompiledSchemaType$annotations() {
    }

    @a
    public static void getCompiledTypeType$annotations() {
    }

    public static final boolean isComposite(CompiledNamedType compiledNamedType0) {
        j.f(compiledNamedType0, "<this>");
        return compiledNamedType0 instanceof UnionType || compiledNamedType0 instanceof InterfaceType || compiledNamedType0 instanceof ObjectType;
    }

    public static final List keyFields(CompiledNamedType compiledNamedType0) {
        j.f(compiledNamedType0, "<this>");
        if(compiledNamedType0 instanceof InterfaceType) {
            return ((InterfaceType)compiledNamedType0).getKeyFields();
        }
        return compiledNamedType0 instanceof ObjectType ? ((ObjectType)compiledNamedType0).getKeyFields() : z.X;
    }

    private static final Object resolveVariables(Object object0, Variables executable$Variables0) {
        Object object4;
        k k0;
        if(object0 == null) {
            return null;
        }
        if(object0 instanceof CompiledVariable) {
            throw new IllegalStateException("must be checked by the caller");
        }
        if(object0 instanceof Map) {
            ArrayList arrayList0 = new ArrayList();
            for(Object object1: ((Map)object0).entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object1;
                Object object2 = map$Entry0.getValue();
                if(!(object2 instanceof CompiledVariable)) {
                    k0 = new k(map$Entry0.getKey(), CompiledGraphQL.resolveVariables(object2, executable$Variables0));
                }
                else if(executable$Variables0.getValueMap().containsKey(((CompiledVariable)object2).getName())) {
                    k0 = new k(map$Entry0.getKey(), executable$Variables0.getValueMap().get(((CompiledVariable)object2).getName()));
                }
                else {
                    k0 = null;
                }
                if(k0 != null) {
                    arrayList0.add(k0);
                }
            }
            return F.W(p.K0(p.Q0(arrayList0), new Comparator() {
                @Override
                public final int compare(Object object0, Object object1) {
                    return a.a.j(((String)((k)object0).X), ((String)((k)object1).X));
                }
            }));
        }
        if(object0 instanceof List) {
            ArrayList arrayList1 = new ArrayList(r.b0(((Iterable)object0)));
            for(Object object3: ((Iterable)object0)) {
                if(!(object3 instanceof CompiledVariable)) {
                    object4 = CompiledGraphQL.resolveVariables(object3, executable$Variables0);
                }
                else if(executable$Variables0.getValueMap().containsKey(((CompiledVariable)object3).getName())) {
                    object4 = executable$Variables0.getValueMap().get(((CompiledVariable)object3).getName());
                }
                else {
                    object4 = null;
                }
                arrayList1.add(object4);
            }
            return arrayList1;
        }
        return object0;
    }
}

