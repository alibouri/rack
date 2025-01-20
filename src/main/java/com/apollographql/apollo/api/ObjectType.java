package com.apollographql.apollo.api;

import Bb.z;
import Nb.j;
import java.util.List;

public final class ObjectType extends CompiledNamedType {
    public static final class Builder {
        private List embeddedFields;
        private List implements;
        private List keyFields;
        private final String name;

        public Builder(ObjectType objectType0) {
            j.f(objectType0, "objectType");
            this(objectType0.getName());
            this.keyFields = objectType0.getKeyFields();
            this.implements = objectType0.getImplements();
            this.embeddedFields = objectType0.getEmbeddedFields();
        }

        public Builder(String s) {
            j.f(s, "name");
            super();
            this.name = s;
            this.keyFields = z.X;
            this.implements = z.X;
            this.embeddedFields = z.X;
        }

        public final ObjectType build() {
            return new ObjectType(this.name, this.keyFields, this.implements, this.embeddedFields);
        }

        public final Builder embeddedFields(List list0) {
            j.f(list0, "embeddedFields");
            this.embeddedFields = list0;
            return this;
        }

        public final String getName$apollo_api() {
            return this.name;
        }

        public final Builder interfaces(List list0) {
            j.f(list0, "implements");
            this.implements = list0;
            return this;
        }

        public final Builder keyFields(List list0) {
            j.f(list0, "keyFields");
            this.keyFields = list0;
            return this;
        }
    }

    private final List embeddedFields;
    private final List implements;
    private final List keyFields;

    public ObjectType(String s, List list0, List list1, List list2) {
        j.f(s, "name");
        j.f(list0, "keyFields");
        j.f(list1, "implements");
        j.f(list2, "embeddedFields");
        super(s, null);
        this.keyFields = list0;
        this.implements = list1;
        this.embeddedFields = list2;
    }

    public final List getEmbeddedFields() {
        return this.embeddedFields;
    }

    public final List getImplements() {
        return this.implements;
    }

    public final List getKeyFields() {
        return this.keyFields;
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }
}

