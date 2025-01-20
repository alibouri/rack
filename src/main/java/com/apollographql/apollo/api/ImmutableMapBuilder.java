package com.apollographql.apollo.api;

import java.util.LinkedHashMap;
import java.util.Map;

public final class ImmutableMapBuilder {
    private final Map map;

    public ImmutableMapBuilder() {
        this.map = new LinkedHashMap();
    }

    public final Map build() {
        return this.map;
    }

    public final ImmutableMapBuilder put(Object object0, Object object1) {
        this.map.put(object0, object1);
        return this;
    }
}

