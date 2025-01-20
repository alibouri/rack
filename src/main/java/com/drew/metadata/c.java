package com.drew.metadata;

public final class c {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final String e;
    public final a f;

    public c(int v, int v1, int v2, int v3, String s, a a0) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = s;
        this.f = a0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(c.class != class0 || this.d != ((c)object0).d) {
                return false;
            }
            if(this.c != ((c)object0).c) {
                return false;
            }
            if(this.a != ((c)object0).a) {
                return false;
            }
            if(this.b != ((c)object0).b) {
                return false;
            }
            a a0 = ((c)object0).f;
            a a1 = this.f;
            if(a1 != null) {
                if(!a1.equals(a0)) {
                    return false;
                }
            }
            else if(a0 != null) {
                return false;
            }
            String s = ((c)object0).e;
            return this.e == null ? s == null : this.e.equals(s);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = (((this.a * 0x1F + this.b) * 0x1F + this.c) * 0x1F + this.d) * 0x1F;
        int v1 = 0;
        int v2 = this.e == null ? 0 : this.e.hashCode();
        a a0 = this.f;
        if(a0 != null) {
            v1 = a0.hashCode();
        }
        return (v + v2) * 0x1F + v1;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("x: ");
        stringBuilder0.append(this.a);
        stringBuilder0.append(" y: ");
        stringBuilder0.append(this.b);
        stringBuilder0.append(" width: ");
        stringBuilder0.append(this.c);
        stringBuilder0.append(" height: ");
        stringBuilder0.append(this.d);
        String s = this.e;
        if(s != null) {
            stringBuilder0.append(" name: ");
            stringBuilder0.append(s);
        }
        a a0 = this.f;
        if(a0 != null) {
            stringBuilder0.append(" age: ");
            stringBuilder0.append(a0.c());
        }
        return stringBuilder0.toString();
    }
}

