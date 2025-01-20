package com.apollographql.apollo.api;

import Bb.F;
import Nb.c;
import Nb.j;
import Nb.l;
import Nb.x;
import Tb.e;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class ObjectBuilder implements BuilderScope {
    static final e[] $$delegatedProperties;
    private final Map __fields;
    private final CustomScalarAdapters customScalarAdapters;

    static {
        l l0 = new l(ObjectBuilder.class, "__typename", "get__typename()Ljava/lang/String;", 0);
        x.a.getClass();
        ObjectBuilder.$$delegatedProperties = new e[]{l0};
    }

    public ObjectBuilder(CustomScalarAdapters customScalarAdapters0) {
        j.f(customScalarAdapters0, "customScalarAdapters");
        super();
        this.customScalarAdapters = customScalarAdapters0;
        this.__fields = new LinkedHashMap();
    }

    public abstract Map build();

    @Override  // com.apollographql.apollo.api.BuilderScope
    public CustomScalarAdapters getCustomScalarAdapters() {
        return this.customScalarAdapters;
    }

    public final Map get__fields() {
        return this.__fields;
    }

    public final String get__typename() {
        return (String)F.B(((c)ObjectBuilder.$$delegatedProperties[0]).b0, this.__fields);
    }

    private static Object get__typename$delegate(ObjectBuilder objectBuilder0) {
        return objectBuilder0.__fields;
    }

    public final void set(String s, Object object0) {
        j.f(s, "key");
        this.__fields.put(s, object0);
    }

    public final void set__typename(String s) {
        j.f(s, "<set-?>");
        this.__fields.put(((c)ObjectBuilder.$$delegatedProperties[0]).b0, s);
    }
}

