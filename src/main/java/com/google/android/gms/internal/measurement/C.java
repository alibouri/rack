package com.google.android.gms.internal.measurement;

import X6.g;
import com.apollographql.apollo.api.b;
import java.util.HashMap;

public final class c {
    public String a;
    public final long b;
    public final HashMap c;
    public static final g d;

    static {
        c.d = g.i(3, new Object[]{"_syn", "_err", "_el"});
    }

    public c(String s, long v, HashMap hashMap0) {
        this.a = s;
        this.b = v;
        HashMap hashMap1 = new HashMap();
        this.c = hashMap1;
        if(hashMap0 != null) {
            hashMap1.putAll(hashMap0);
        }
    }

    public static Object a(Object object0, String s, Object object1) {
        if(c.d.contains(s) && object1 instanceof Double) {
            return Math.round(((double)(((Double)object1))));
        }
        if(s.startsWith("_")) {
            if(object0 instanceof String) {
                return object1;
            }
            return object0 == null ? object1 : object0;
        }
        if(object0 instanceof Double) {
            return object1;
        }
        if(object0 instanceof Long) {
            return Math.round(((double)(((Double)object1))));
        }
        return object0 instanceof String ? object1.toString() : object1;
    }

    @Override
    public final Object clone() {
        String s = this.a;
        HashMap hashMap0 = new HashMap(this.c);
        return new c(s, this.b, hashMap0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof c)) {
            return false;
        }
        if(this.b != ((c)object0).b) {
            return false;
        }
        return this.a.equals(((c)object0).a) ? this.c.equals(((c)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return this.c.hashCode() + (this.a.hashCode() * 0x1F + ((int)(this.b ^ this.b >>> 0x20))) * 0x1F;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = b.s("Event{name=\'", this.a, "\', timestamp=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", params=");
        stringBuilder0.append(String.valueOf(this.c));
        stringBuilder0.append("}");
        return stringBuilder0.toString();
    }
}

