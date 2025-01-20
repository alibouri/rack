package com.apollographql.apollo.api;

import Bb.q;
import Nb.j;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CustomScalarAdapters implements Element {
    public static final class Builder {
        private final Map adaptersMap;
        private Set deferredFragmentIdentifiers;
        private List errors;
        private Set falseVariables;
        private boolean unsafe;

        public Builder() {
            this.adaptersMap = new LinkedHashMap();
        }

        public final Builder add(CustomScalarType customScalarType0, Adapter adapter0) {
            j.f(customScalarType0, "customScalarType");
            j.f(adapter0, "customScalarAdapter");
            this.adaptersMap.put(customScalarType0.getName(), adapter0);
            return this;
        }

        public final Builder add(String s, Adapter adapter0) {
            j.f(s, "name");
            j.f(adapter0, "adapter");
            this.adaptersMap.put(s, adapter0);
            return this;
        }

        public final Builder addAll(CustomScalarAdapters customScalarAdapters0) {
            j.f(customScalarAdapters0, "customScalarAdapters");
            Map map0 = customScalarAdapters0.adaptersMap;
            this.adaptersMap.putAll(map0);
            return this;
        }

        public final CustomScalarAdapters build() {
            return new CustomScalarAdapters(this.adaptersMap, this.falseVariables, this.deferredFragmentIdentifiers, this.errors, this.unsafe, null);
        }

        public final void clear() {
            this.adaptersMap.clear();
        }

        public final Builder deferredFragmentIdentifiers(Set set0) {
            this.deferredFragmentIdentifiers = set0;
            return this;
        }

        public final Builder errors(List list0) {
            this.errors = list0;
            return this;
        }

        public final Builder falseVariables(Set set0) {
            this.falseVariables = set0;
            return this;
        }

        public final Builder unsafe(boolean z) {
            this.unsafe = z;
            return this;
        }
    }

    public static final class Key implements com.apollographql.apollo.api.ExecutionContext.Key {
        private Key() {
        }

        public Key(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public static void getPassThrough$annotations() {
        }
    }

    public static final CustomScalarAdapters Empty;
    public static final Key Key;
    public static final CustomScalarAdapters PassThrough;
    private final Map adaptersMap;
    public final Set deferredFragmentIdentifiers;
    public final List errors;
    public final Set falseVariables;
    private final boolean unsafe;

    static {
        CustomScalarAdapters.Key = new Key(null);
        CustomScalarAdapters.Empty = new Builder().build();
        CustomScalarAdapters.PassThrough = new Builder().unsafe(true).build();
    }

    private CustomScalarAdapters(Map map0, Set set0, Set set1, List list0, boolean z) {
        this.falseVariables = set0;
        this.deferredFragmentIdentifiers = set1;
        this.errors = list0;
        this.unsafe = z;
        this.adaptersMap = map0;
    }

    public CustomScalarAdapters(Map map0, Set set0, Set set1, List list0, boolean z, DefaultConstructorMarker defaultConstructorMarker0) {
        this(map0, set0, set1, list0, z);
    }

    public final Adapter adapterFor(String s) {
        j.f(s, "name");
        return (Adapter)this.adaptersMap.get(s);
    }

    public final Error firstErrorStartingWith(List list0) {
        j.f(list0, "path");
        List list1 = this.errors;
        if(list1 != null) {
            for(Object object0: list1) {
                List list2 = ((Error)object0).getPath();
                if(list2 != null && this.startsWith(list2, list0)) {
                    return object0;
                }
                if(false) {
                    break;
                }
            }
            return null;
        }
        return null;
    }

    @Override  // com.apollographql.apollo.api.ExecutionContext$Element
    public final Object fold(Object object0, Function2 function20) {
        return e.a(this, object0, function20);
    }

    @Override  // com.apollographql.apollo.api.ExecutionContext$Element
    public final Element get(com.apollographql.apollo.api.ExecutionContext.Key executionContext$Key0) {
        return e.b(this, executionContext$Key0);
    }

    @Override  // com.apollographql.apollo.api.ExecutionContext$Element
    public com.apollographql.apollo.api.ExecutionContext.Key getKey() {
        return CustomScalarAdapters.Key;
    }

    @Override  // com.apollographql.apollo.api.ExecutionContext$Element
    public final ExecutionContext minusKey(com.apollographql.apollo.api.ExecutionContext.Key executionContext$Key0) {
        return e.c(this, executionContext$Key0);
    }

    public final Builder newBuilder() {
        return new Builder().addAll(this).falseVariables(this.falseVariables).deferredFragmentIdentifiers(this.deferredFragmentIdentifiers);
    }

    @Override  // com.apollographql.apollo.api.ExecutionContext
    public final ExecutionContext plus(ExecutionContext executionContext0) {
        return d.a(this, executionContext0);
    }

    public final Adapter responseAdapterFor(CustomScalarType customScalarType0) {
        Adapter adapter0;
        j.f(customScalarType0, "customScalar");
        if(this.adaptersMap.get(customScalarType0.getName()) == null) {
            if(j.a(customScalarType0.getClassName(), "com.apollographql.apollo.api.Upload")) {
                adapter0 = Adapters.UploadAdapter;
                j.d(adapter0, "null cannot be cast to non-null type com.apollographql.apollo.api.Adapter<T of com.apollographql.apollo.api.CustomScalarAdapters.responseAdapterFor>");
                return adapter0;
            }
            if(q.L(new String[]{"kotlin.String", "java.lang.String"}).contains(customScalarType0.getClassName())) {
                adapter0 = Adapters.StringAdapter;
                j.d(adapter0, "null cannot be cast to non-null type com.apollographql.apollo.api.Adapter<T of com.apollographql.apollo.api.CustomScalarAdapters.responseAdapterFor>");
                return adapter0;
            }
            if(q.L(new String[]{"kotlin.Boolean", "java.lang.Boolean"}).contains(customScalarType0.getClassName())) {
                adapter0 = Adapters.BooleanAdapter;
                j.d(adapter0, "null cannot be cast to non-null type com.apollographql.apollo.api.Adapter<T of com.apollographql.apollo.api.CustomScalarAdapters.responseAdapterFor>");
                return adapter0;
            }
            if(q.L(new String[]{"kotlin.Int", "java.lang.Int"}).contains(customScalarType0.getClassName())) {
                adapter0 = Adapters.IntAdapter;
                j.d(adapter0, "null cannot be cast to non-null type com.apollographql.apollo.api.Adapter<T of com.apollographql.apollo.api.CustomScalarAdapters.responseAdapterFor>");
                return adapter0;
            }
            if(q.L(new String[]{"kotlin.Double", "java.lang.Double"}).contains(customScalarType0.getClassName())) {
                adapter0 = Adapters.DoubleAdapter;
                j.d(adapter0, "null cannot be cast to non-null type com.apollographql.apollo.api.Adapter<T of com.apollographql.apollo.api.CustomScalarAdapters.responseAdapterFor>");
                return adapter0;
            }
            if(q.L(new String[]{"kotlin.Long", "java.lang.Long"}).contains(customScalarType0.getClassName())) {
                adapter0 = Adapters.LongAdapter;
                j.d(adapter0, "null cannot be cast to non-null type com.apollographql.apollo.api.Adapter<T of com.apollographql.apollo.api.CustomScalarAdapters.responseAdapterFor>");
                return adapter0;
            }
            if(q.L(new String[]{"kotlin.Float", "java.lang.Float"}).contains(customScalarType0.getClassName())) {
                adapter0 = Adapters.FloatAdapter;
                j.d(adapter0, "null cannot be cast to non-null type com.apollographql.apollo.api.Adapter<T of com.apollographql.apollo.api.CustomScalarAdapters.responseAdapterFor>");
                return adapter0;
            }
            if(q.L(new String[]{"kotlin.Any", "java.lang.Object"}).contains(customScalarType0.getClassName())) {
                adapter0 = Adapters.AnyAdapter;
            }
            else if(this.unsafe) {
                adapter0 = new PassThroughAdapter();
            }
            else {
                throw new IllegalStateException(("Can\'t map GraphQL type: `" + customScalarType0.getName() + "` to: `" + customScalarType0.getClassName() + "`. Did you forget to add a scalar Adapter?").toString());
            }
        }
        else {
            adapter0 = (Adapter)this.adaptersMap.get(customScalarType0.getName());
        }
        j.d(adapter0, "null cannot be cast to non-null type com.apollographql.apollo.api.Adapter<T of com.apollographql.apollo.api.CustomScalarAdapters.responseAdapterFor>");
        return adapter0;
    }

    private final boolean startsWith(List list0, List list1) {
        int v = list1.size();
        for(int v1 = 1; v1 < v; ++v1) {
            if(v1 - 1 >= list0.size()) {
                return false;
            }
            if(!j.a(list1.get(v1), list0.get(v1 - 1))) {
                return false;
            }
        }
        return true;
    }
}

