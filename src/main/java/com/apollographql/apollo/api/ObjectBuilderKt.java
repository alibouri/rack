package com.apollographql.apollo.api;

import Nb.j;
import com.apollographql.apollo.api.json.MapJsonWriter;

public final class ObjectBuilderKt {
    private static final BuilderScope GlobalBuilder;

    static {
        ObjectBuilderKt.GlobalBuilder = new ObjectBuilderKt.GlobalBuilder.1();
    }

    public static final BuilderScope Builder(CustomScalarAdapters customScalarAdapters0) {
        j.f(customScalarAdapters0, "customScalarAdapters");
        return new BuilderScope() {
            @Override  // com.apollographql.apollo.api.BuilderScope
            public CustomScalarAdapters getCustomScalarAdapters() {
                return customScalarAdapters0;
            }
        };
    }

    public static final Object adaptValue(Adapter adapter0, Object object0) {
        j.f(adapter0, "adapter");
        MapJsonWriter mapJsonWriter0 = new MapJsonWriter();
        adapter0.toJson(mapJsonWriter0, CustomScalarAdapters.Empty, object0);
        return mapJsonWriter0.root();
    }

    public static final BuilderScope getGlobalBuilder() {
        return ObjectBuilderKt.GlobalBuilder;
    }
}

