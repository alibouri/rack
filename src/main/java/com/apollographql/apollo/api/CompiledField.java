package com.apollographql.apollo.api;

import Ab.a;
import Bb.A;
import Bb.F;
import Bb.r;
import Bb.z;
import Nb.j;
import T3.d;
import com.apollographql.apollo.api.json.-JsonWriters;
import com.apollographql.apollo.api.json.BufferedSinkJsonWriter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

public final class CompiledField extends CompiledSelection {
    public static final class Builder {
        private String alias;
        private List arguments;
        private List condition;
        private final String name;
        private List selections;
        private final CompiledType type;

        public Builder(CompiledField compiledField0) {
            j.f(compiledField0, "compiledField");
            this(compiledField0.getName(), compiledField0.getType());
            this.alias = compiledField0.getAlias();
            this.condition = compiledField0.getCondition();
            this.arguments = compiledField0.getArguments();
            this.selections = compiledField0.getSelections();
        }

        public Builder(String s, CompiledType compiledType0) {
            j.f(s, "name");
            j.f(compiledType0, "type");
            super();
            this.name = s;
            this.type = compiledType0;
            this.condition = z.X;
            this.arguments = z.X;
            this.selections = z.X;
        }

        public final Builder alias(String s) {
            this.alias = s;
            return this;
        }

        public final Builder arguments(List list0) {
            j.f(list0, "arguments");
            this.arguments = list0;
            return this;
        }

        public final CompiledField build() {
            return new CompiledField(this.name, this.type, this.alias, this.condition, this.arguments, this.selections);
        }

        public final Builder condition(List list0) {
            j.f(list0, "condition");
            this.condition = list0;
            return this;
        }

        public final String getName() {
            return this.name;
        }

        public final CompiledType getType() {
            return this.type;
        }

        public final Builder selections(List list0) {
            j.f(list0, "selections");
            this.selections = list0;
            return this;
        }
    }

    private final String alias;
    private final List arguments;
    private final List condition;
    private final String name;
    private final List selections;
    private final CompiledType type;

    public CompiledField(String s, CompiledType compiledType0, String s1, List list0, List list1, List list2) {
        j.f(s, "name");
        j.f(compiledType0, "type");
        j.f(list0, "condition");
        j.f(list1, "arguments");
        j.f(list2, "selections");
        super(null);
        this.name = s;
        this.type = compiledType0;
        this.alias = s1;
        this.condition = list0;
        this.arguments = list1;
        this.selections = list2;
    }

    public final Optional argumentValue(String s, Variables executable$Variables0) {
        Object object0 = null;
        j.f(s, "name");
        j.f(executable$Variables0, "variables");
        for(Object object1: this.arguments) {
            if(j.a(((CompiledArgument)object1).getDefinition().getName(), s)) {
                object0 = object1;
                break;
            }
        }
        if(((CompiledArgument)object0) == null) {
            return Absent.INSTANCE;
        }
        if(((CompiledArgument)object0).getValue() instanceof Absent) {
            return Absent.INSTANCE;
        }
        Object object2 = ((CompiledArgument)object0).getValue().getOrThrow();
        if(object2 instanceof CompiledVariable) {
            return executable$Variables0.getValueMap().containsKey(((CompiledVariable)object2).getName()) ? Optional.Companion.present(executable$Variables0.getValueMap().get(((CompiledVariable)object2).getName())) : Absent.INSTANCE;
        }
        Object object3 = CompiledGraphQL.resolveVariables(object2, executable$Variables0);
        return Optional.Companion.present(object3);
    }

    public final Map argumentValues(Variables executable$Variables0, Function1 function10) {
        j.f(executable$Variables0, "variables");
        j.f(function10, "filter");
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this.arguments) {
            if(((Boolean)function10.n(object0)).booleanValue()) {
                arrayList0.add(object0);
            }
        }
        ArrayList arrayList1 = new ArrayList();
        for(Object object1: arrayList0) {
            if(((CompiledArgument)object1).getValue() instanceof Present) {
                arrayList1.add(object1);
            }
        }
        if(arrayList1.isEmpty()) {
            return A.X;
        }
        int v = F.I(r.b0(arrayList1));
        if(v < 16) {
            v = 16;
        }
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(v);
        for(Object object2: arrayList1) {
            linkedHashMap0.put(((CompiledArgument)object2).getDefinition().getName(), ((CompiledArgument)object2).getValue().getOrThrow());
        }
        Object object3 = CompiledGraphQL.resolveVariables(linkedHashMap0, executable$Variables0);
        j.d(object3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
        return (Map)object3;
    }

    public static Map argumentValues$default(CompiledField compiledField0, Variables executable$Variables0, Function1 function10, int v, Object object0) {
        if((v & 2) != 0) {
            function10 = new d(14);
        }
        return compiledField0.argumentValues(executable$Variables0, function10);
    }

    private static final boolean argumentValues$lambda$1(CompiledArgument compiledArgument0) {
        j.f(compiledArgument0, "it");
        return true;
    }

    public final String getAlias() {
        return this.alias;
    }

    public final List getArguments() {
        return this.arguments;
    }

    public final List getCondition() {
        return this.condition;
    }

    public final String getName() {
        return this.name;
    }

    public final String getResponseName() {
        return this.alias == null ? this.name : this.alias;
    }

    public final List getSelections() {
        return this.selections;
    }

    public final CompiledType getType() {
        return this.type;
    }

    public final String nameWithArguments(Variables executable$Variables0) {
        j.f(executable$Variables0, "variables");
        Map map0 = this.argumentValues(executable$Variables0, new d(15));
        if(map0.isEmpty()) {
            return this.name;
        }
        try {
            Ec.j j0 = new Ec.j();  // initializer: Ljava/lang/Object;-><init>()V
            BufferedSinkJsonWriter bufferedSinkJsonWriter0 = new BufferedSinkJsonWriter(j0, null, 2, null);
            -JsonWriters.writeAny(bufferedSinkJsonWriter0, map0);
            bufferedSinkJsonWriter0.close();
            return this.name + '(' + j0.B() + ')';
        }
        catch(Exception exception0) {
            throw new RuntimeException(exception0);
        }
    }

    private static final boolean nameWithArguments$lambda$4(CompiledArgument compiledArgument0) {
        j.f(compiledArgument0, "it");
        return !compiledArgument0.getDefinition().isPagination();
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }

    @a
    public final Object resolveArgument(String s, Variables executable$Variables0) {
        j.f(s, "name");
        j.f(executable$Variables0, "variables");
        return this.argumentValue(s, executable$Variables0).getOrNull();
    }
}

