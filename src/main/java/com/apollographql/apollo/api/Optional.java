package com.apollographql.apollo.api;

import Nb.j;
import U3.g;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class Optional {
    public static final class Absent extends Optional {
        public static final Absent INSTANCE;

        static {
            Absent.INSTANCE = new Absent();
        }

        private Absent() {
            super(null);
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final Absent absent() {
            return Absent.INSTANCE;
        }

        public final Present present(Object object0) {
            return new Present(object0);
        }

        public final Optional presentIfNotNull(Object object0) {
            return object0 == null ? Absent.INSTANCE : new Present(object0);
        }
    }

    public static final class Present extends Optional {
        private final Object value;

        public Present(Object object0) {
            super(null);
            this.value = object0;
        }

        public final Object component1() {
            return this.value;
        }

        public final Present copy(Object object0) {
            return new Present(object0);
        }

        public static Present copy$default(Present optional$Present0, Object object0, int v, Object object1) {
            if((v & 1) != 0) {
                object0 = optional$Present0.value;
            }
            return optional$Present0.copy(object0);
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof Present ? j.a(this.value, ((Present)object0).value) : false;
        }

        public final Object getValue() {
            return this.value;
        }

        @Override
        public int hashCode() {
            return this.value == null ? 0 : this.value.hashCode();
        }

        @Override
        public String toString() {
            return "Present(value=" + this.value + ')';
        }
    }

    public static final Companion Companion;

    static {
        Optional.Companion = new Companion(null);
    }

    private Optional() {
    }

    public Optional(DefaultConstructorMarker defaultConstructorMarker0) {
    }

    public static final Absent absent() {
        return Optional.Companion.absent();
    }

    public final Object getOrNull() {
        Present optional$Present0 = this instanceof Present ? ((Present)this) : null;
        return optional$Present0 == null ? null : optional$Present0.getValue();
    }

    public final Object getOrThrow() {
        if(!(this instanceof Present)) {
            throw new g("The optional doesn\'t have a value", null);  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
        }
        return ((Present)this).getValue();
    }

    public static final Present present(Object object0) {
        return Optional.Companion.present(object0);
    }

    public static final Optional presentIfNotNull(Object object0) {
        return Optional.Companion.presentIfNotNull(object0);
    }
}

