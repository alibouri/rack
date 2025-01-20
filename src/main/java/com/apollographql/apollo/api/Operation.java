package com.apollographql.apollo.api;

public interface Operation extends Executable {
    public interface Data extends com.apollographql.apollo.api.Executable.Data {
    }

    String document();

    String id();

    String name();
}

