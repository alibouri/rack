package com.apollographql.apollo.api;

import Nb.j;
import java.util.List;

public final class FakeResolverContext {
    private final String id;
    private final CompiledField mergedField;
    private final List path;

    public FakeResolverContext(List list0, String s, CompiledField compiledField0) {
        j.f(list0, "path");
        j.f(s, "id");
        j.f(compiledField0, "mergedField");
        super();
        this.path = list0;
        this.id = s;
        this.mergedField = compiledField0;
    }

    public final String getId() {
        return this.id;
    }

    public final CompiledField getMergedField() {
        return this.mergedField;
    }

    public final List getPath() {
        return this.path;
    }
}

