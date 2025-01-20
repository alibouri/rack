package com.apollographql.apollo.api;

import java.util.Map;

public interface FakeResolver {
    Object resolveLeaf(FakeResolverContext arg1);

    int resolveListSize(FakeResolverContext arg1);

    boolean resolveMaybeNull(FakeResolverContext arg1);

    String resolveTypename(FakeResolverContext arg1);

    String stableIdForObject(Map arg1, CompiledField arg2);
}

