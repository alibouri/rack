package g8;

import java.util.Map.Entry;

public final class k implements Map.Entry {
    public k X;
    public k Y;
    public k Z;
    public k b0;
    public k c0;
    public final Object d0;
    public Object e0;
    public int f0;

    public k() {
        this.d0 = null;
        this.c0 = this;
        this.b0 = this;
    }

    public k(k k0, Object object0, k k1, k k2) {
        this.X = k0;
        this.d0 = object0;
        this.f0 = 1;
        this.b0 = k1;
        this.c0 = k2;
        k2.b0 = this;
        k1.c0 = this;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 instanceof Map.Entry) {
            Object object1 = this.d0;
            if(object1 == null) {
                if(((Map.Entry)object0).getKey() == null) {
                    return this.e0 == null ? ((Map.Entry)object0).getValue() == null : this.e0.equals(((Map.Entry)object0).getValue());
                }
            }
            else if(object1.equals(((Map.Entry)object0).getKey())) {
                return this.e0 == null ? ((Map.Entry)object0).getValue() == null : this.e0.equals(((Map.Entry)object0).getValue());
            }
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.d0;
    }

    @Override
    public final Object getValue() {
        return this.e0;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.d0 == null ? 0 : this.d0.hashCode();
        Object object0 = this.e0;
        if(object0 != null) {
            v = object0.hashCode();
        }
        return v ^ v1;
    }

    @Override
    public final Object setValue(Object object0) {
        Object object1 = this.e0;
        this.e0 = object0;
        return object1;
    }

    @Override
    public final String toString() {
        return this.d0 + "=" + this.e0;
    }
}

