package com.apollographql.apollo.api;

import Nb.c;
import Nb.j;
import Tb.e;
import com.apollographql.apollo.api.json.MapJsonReader;
import com.apollographql.apollo.api.json.MapJsonWriter;
import java.util.Map;

public final class BuilderProperty {
    private final Adapter adapter;

    public BuilderProperty(Adapter adapter0) {
        j.f(adapter0, "adapter");
        super();
        this.adapter = adapter0;
    }

    public final Adapter getAdapter() {
        return this.adapter;
    }

    public final Object getValue(ObjectBuilder objectBuilder0, e e0) {
        j.f(objectBuilder0, "thisRef");
        j.f(e0, "property");
        Object object0 = objectBuilder0.get__fields().get(((c)e0).b0);
        j.d(object0, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
        MapJsonReader mapJsonReader0 = new MapJsonReader(((Map)object0), null, 2, null);
        return this.adapter.fromJson(mapJsonReader0, CustomScalarAdapters.Empty);
    }

    public final void setValue(ObjectBuilder objectBuilder0, e e0, Object object0) {
        j.f(objectBuilder0, "thisRef");
        j.f(e0, "property");
        Map map0 = objectBuilder0.get__fields();
        MapJsonWriter mapJsonWriter0 = new MapJsonWriter();
        this.adapter.toJson(mapJsonWriter0, CustomScalarAdapters.Empty, object0);
        Object object1 = mapJsonWriter0.root();
        map0.put(((c)e0).b0, object1);
    }
}

