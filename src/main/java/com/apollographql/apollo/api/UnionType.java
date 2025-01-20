package com.apollographql.apollo.api;

import Nb.j;

public final class UnionType extends CompiledNamedType {
    private final ObjectType[] members;

    public UnionType(String s, ObjectType[] arr_objectType) {
        j.f(s, "name");
        j.f(arr_objectType, "members");
        super(s, null);
        this.members = arr_objectType;
    }

    public final ObjectType[] getMembers() {
        return this.members;
    }
}

