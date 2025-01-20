package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class s2 extends LinkedHashMap {
    public boolean X;
    public static final s2 Y;

    static {
        s2 s20 = new s2();
        s2.Y = s20;
        s20.X = false;
    }

    public s2() {
        this.X = true;
    }

    public static int b(Object object0) {
        if(object0 instanceof byte[]) {
            int v1 = ((byte[])object0).length;
            for(int v = 0; v < ((byte[])object0).length; ++v) {
                v1 = v1 * 0x1F + ((byte[])object0)[v];
            }
            return v1 == 0 ? 1 : v1;
        }
        return object0.hashCode();
    }

    public final void c() {
        if(!this.X) {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public final void clear() {
        this.c();
        super.clear();
    }

    // Deobfuscation rating: LOW(20)
    @Override
    public final Set entrySet() {
        return this.isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 instanceof Map) {
            if(this != ((Map)object0)) {
                if(this.size() == ((Map)object0).size()) {
                    Iterator iterator0 = this.entrySet().iterator();
                    while(true) {
                        if(!iterator0.hasNext()) {
                            return true;
                        }
                        Object object1 = iterator0.next();
                        if(!((Map)object0).containsKey(((Map.Entry)object1).getKey())) {
                            break;
                        }
                        Object object2 = ((Map.Entry)object1).getValue();
                        Object object3 = ((Map)object0).get(((Map.Entry)object1).getKey());
                        if((!(object2 instanceof byte[]) || !(object3 instanceof byte[]) ? object2.equals(object3) : Arrays.equals(((byte[])object2), ((byte[])object3)))) {
                            continue;
                        }
                        return false;
                    }
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        for(Object object0: this.entrySet()) {
            int v1 = s2.b(((Map.Entry)object0).getKey());
            v += s2.b(((Map.Entry)object0).getValue()) ^ v1;
        }
        return v;
    }

    @Override
    public final Object put(Object object0, Object object1) {
        this.c();
        object0.getClass();
        object1.getClass();
        return super.put(object0, object1);
    }

    @Override
    public final void putAll(Map map0) {
        this.c();
        for(Object object0: map0.keySet()) {
            object0.getClass();
            map0.get(object0).getClass();
        }
        super.putAll(map0);
    }

    @Override
    public final Object remove(Object object0) {
        this.c();
        return super.remove(object0);
    }
}

