package com.apollographql.apollo.api;

import Ab.a;
import Nb.j;
import Y8.o;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class Error {
    public static final class Builder {
        private final Map extensions;
        private List locations;
        private final String message;
        private List path;

        public Builder(String s) {
            j.f(s, "message");
            super();
            this.message = s;
            this.extensions = new LinkedHashMap();
        }

        public final Error build() {
            return new Error(this.message, this.locations, this.path, this.extensions, null);
        }

        public final Map getExtensions() {
            return this.extensions;
        }

        public final List getLocations() {
            return this.locations;
        }

        public final String getMessage() {
            return this.message;
        }

        public final List getPath() {
            return this.path;
        }

        public final Builder locations(List list0) {
            j.f(list0, "locations");
            this.locations = list0;
            return this;
        }

        public final Builder path(List list0) {
            j.f(list0, "path");
            this.path = list0;
            return this;
        }

        public final Builder putExtension(String s, Object object0) {
            j.f(s, "name");
            this.extensions.put(s, object0);
            return this;
        }

        public final void setLocations(List list0) {
            this.locations = list0;
        }

        public final void setPath(List list0) {
            this.path = list0;
        }
    }

    public static final class Location {
        private final int column;
        private final int line;

        public Location(int v, int v1) {
            this.line = v;
            this.column = v1;
        }

        public final int getColumn() {
            return this.column;
        }

        public final int getLine() {
            return this.line;
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("Location(line = ");
            stringBuilder0.append(this.line);
            stringBuilder0.append(", column = ");
            return o.z(stringBuilder0, this.column, ')');
        }
    }

    private final Map extensions;
    private final List locations;
    private final String message;
    private final Map nonStandardFields;
    private final List path;

    @a
    public Error(String s, List list0, List list1, Map map0, Map map1) {
        j.f(s, "message");
        super();
        this.message = s;
        this.locations = list0;
        this.path = list1;
        this.extensions = map0;
        this.nonStandardFields = map1;
    }

    public final Map getExtensions() {
        return this.extensions;
    }

    public final List getLocations() {
        return this.locations;
    }

    public final String getMessage() {
        return this.message;
    }

    public final Map getNonStandardFields() {
        return this.nonStandardFields;
    }

    public final List getPath() {
        return this.path;
    }

    @Override
    public String toString() {
        return "Error(message = " + this.message + ", locations = " + this.locations + ", path=" + this.path + ", extensions = " + this.extensions + ", nonStandardFields = " + this.nonStandardFields + ')';
    }
}

