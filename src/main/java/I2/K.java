package I2;

import Bb.p;
import Nb.e;
import Nb.j;
import Nb.x;
import R2.i;
import android.util.Log;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;
import r2.a;
import yc.d;

public final class k {
    public final LinkedHashMap a;

    public k(int v) {
        switch(v) {
            case 1: {
                super();
                this.a = new LinkedHashMap();
                return;
            }
            case 2: {
                super();
                this.a = new LinkedHashMap();
                return;
            }
            case 3: {
                super();
                this.a = new LinkedHashMap();
                return;
            }
            default: {
                super();
                this.a = new LinkedHashMap();
            }
        }
    }

    public void a(a[] arr_a) {
        j.f(arr_a, "migrations");
        for(int v = 0; v < arr_a.length; ++v) {
            a a0 = arr_a[v];
            LinkedHashMap linkedHashMap0 = this.a;
            Integer integer0 = (int)a0.a;
            Object object0 = linkedHashMap0.get(integer0);
            if(object0 == null) {
                object0 = new TreeMap();
                linkedHashMap0.put(integer0, object0);
            }
            int v1 = a0.b;
            if(((TreeMap)object0).containsKey(v1)) {
                Log.w("ROOM", "Overriding migration " + ((TreeMap)object0).get(v1) + " with " + a0);
            }
            ((TreeMap)object0).put(v1, a0);
        }
    }

    public m b() {
        m m0 = new m(this.a);
        d.H(m0);
        return m0;
    }

    public void c(Object object0, String s) {
        Boolean[] arr_boolean;
        j.f(s, "key");
        LinkedHashMap linkedHashMap0 = this.a;
        if(object0 == null) {
            object0 = null;
        }
        else {
            e e0 = x.a(object0.getClass());
            int v = 0;
            if(!(((((((((((((e0.equals(x.a(Boolean.TYPE)) ? true : e0.equals(x.a(Byte.TYPE))) ? true : e0.equals(x.a(Integer.TYPE))) ? true : e0.equals(x.a(Long.TYPE))) ? true : e0.equals(x.a(Float.TYPE))) ? true : e0.equals(x.a(Double.TYPE))) ? true : e0.equals(x.a(String.class))) ? true : e0.equals(x.a(Boolean[].class))) ? true : e0.equals(x.a(Byte[].class))) ? true : e0.equals(x.a(Integer[].class))) ? true : e0.equals(x.a(Long[].class))) ? true : e0.equals(x.a(Float[].class))) ? true : e0.equals(x.a(Double[].class))) ? true : e0.equals(x.a(String[].class)))) {
                if(e0.equals(x.a(boolean[].class))) {
                    arr_boolean = new Boolean[((boolean[])object0).length];
                    while(v < ((boolean[])object0).length) {
                        arr_boolean[v] = Boolean.valueOf(((boolean[])object0)[v]);
                        ++v;
                    }
                }
                else if(e0.equals(x.a(byte[].class))) {
                    arr_boolean = new Byte[((byte[])object0).length];
                    while(v < ((byte[])object0).length) {
                        arr_boolean[v] = (byte)((byte[])object0)[v];
                        ++v;
                    }
                }
                else if(e0.equals(x.a(int[].class))) {
                    arr_boolean = new Integer[((int[])object0).length];
                    while(v < ((int[])object0).length) {
                        arr_boolean[v] = (int)((int[])object0)[v];
                        ++v;
                    }
                }
                else if(e0.equals(x.a(long[].class))) {
                    arr_boolean = new Long[((long[])object0).length];
                    while(v < ((long[])object0).length) {
                        arr_boolean[v] = (long)((long[])object0)[v];
                        ++v;
                    }
                }
                else if(e0.equals(x.a(float[].class))) {
                    arr_boolean = new Float[((float[])object0).length];
                    while(v < ((float[])object0).length) {
                        arr_boolean[v] = (float)((float[])object0)[v];
                        ++v;
                    }
                }
                else {
                    if(!e0.equals(x.a(double[].class))) {
                        throw new IllegalArgumentException("Key " + s + " has invalid type " + e0);
                    }
                    arr_boolean = new Double[((double[])object0).length];
                    while(v < ((double[])object0).length) {
                        arr_boolean[v] = (double)((double[])object0)[v];
                        ++v;
                    }
                }
                object0 = arr_boolean;
            }
        }
        linkedHashMap0.put(s, object0);
    }

    public void d(HashMap hashMap0) {
        j.f(hashMap0, "values");
        for(Object object0: hashMap0.entrySet()) {
            String s = (String)((Map.Entry)object0).getKey();
            this.c(((Map.Entry)object0).getValue(), s);
        }
    }

    public J2.k e(i i0) {
        j.f(i0, "id");
        return (J2.k)this.a.remove(i0);
    }

    public List f(String s) {
        j.f(s, "workSpecId");
        LinkedHashMap linkedHashMap0 = this.a;
        LinkedHashMap linkedHashMap1 = new LinkedHashMap();
        for(Object object0: linkedHashMap0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(j.a(((i)map$Entry0.getKey()).a, s)) {
                linkedHashMap1.put(map$Entry0.getKey(), map$Entry0.getValue());
            }
        }
        for(Object object1: linkedHashMap1.keySet()) {
            linkedHashMap0.remove(((i)object1));
        }
        return p.Q0(linkedHashMap1.values());
    }

    public J2.k g(i i0) {
        LinkedHashMap linkedHashMap0 = this.a;
        Object object0 = linkedHashMap0.get(i0);
        if(object0 == null) {
            object0 = new J2.k(i0);
            linkedHashMap0.put(i0, object0);
        }
        return (J2.k)object0;
    }
}

