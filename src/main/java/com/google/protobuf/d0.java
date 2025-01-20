package com.google.protobuf;

import java.util.Map.Entry;

public final class d0 implements Comparable, Map.Entry {
    public final Comparable X;
    public Object Y;
    public final Z Z;

    public d0(Z z0, Comparable comparable0, Object object0) {
        this.Z = z0;
        this.X = comparable0;
        this.Y = object0;
    }

    @Override
    public final int compareTo(Object object0) {
        return this.X.compareTo(((d0)object0).X);
    }

    @Override
    public final boolean equals(Object object0) {
        boolean z;
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof Map.Entry)) {
            return false;
        }
        Object object1 = ((Map.Entry)object0).getKey();
        Comparable comparable0 = this.X;
        if(comparable0 != null) {
            z = comparable0.equals(object1);
        }
        else if(object1 == null) {
            z = true;
        }
        else {
            z = false;
        }
        if(z) {
            Object object2 = this.Y;
            Object object3 = ((Map.Entry)object0).getValue();
            return object2 == null ? object3 == null : object2.equals(object3);
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.X;
    }

    @Override
    public final Object getValue() {
        return this.Y;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.X == null ? 0 : this.X.hashCode();
        Object object0 = this.Y;
        if(object0 != null) {
            v = object0.hashCode();
        }
        return v ^ v1;
    }

    @Override
    public final Object setValue(Object object0) {
        this.Z.b();
        Object object1 = this.Y;
        this.Y = object0;
        return object1;
    }

    @Override
    public final String toString() {
        return this.X + "=" + this.Y;
    }
}

