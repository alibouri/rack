package m7;

import Q4.i;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public final class a {
    public String a;
    public int b;
    public int c;
    public final Object d;
    public final AbstractCollection e;
    public final Serializable f;
    public Object g;

    public a(Class class0, Class[] arr_class) {
        this.a = null;
        HashSet hashSet0 = new HashSet();
        this.d = hashSet0;
        this.e = new HashSet();
        this.b = 0;
        this.c = 0;
        this.f = new HashSet();
        hashSet0.add(r.a(class0));
        for(int v = 0; v < arr_class.length; ++v) {
            Class class1 = arr_class[v];
            i.o(class1, "Null interface");
            r r0 = r.a(class1);
            ((HashSet)this.d).add(r0);
        }
    }

    public a(r r0, r[] arr_r) {
        this.a = null;
        HashSet hashSet0 = new HashSet();
        this.d = hashSet0;
        this.e = new HashSet();
        this.b = 0;
        this.c = 0;
        this.f = new HashSet();
        hashSet0.add(r0);
        for(int v = 0; v < arr_r.length; ++v) {
            i.o(arr_r[v], "Null interface");
        }
        Collections.addAll(((HashSet)this.d), arr_r);
    }

    public a(byte[] arr_b, String s, ArrayList arrayList0, String s1) {
        this(arr_b, s, arrayList0, s1, -1, -1);
    }

    public a(byte[] arr_b, String s, ArrayList arrayList0, String s1, int v, int v1) {
        this.d = arr_b;
        this.a = s;
        this.e = arrayList0;
        this.f = s1;
        this.b = v1;
        this.c = v;
    }

    public void a(m7.i i0) {
        if(((HashSet)this.d).contains(i0.a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        ((HashSet)this.e).add(i0);
    }

    public b b() {
        if(((e)this.g) == null) {
            throw new IllegalStateException("Missing required property: factory.");
        }
        return new b(this.a, new HashSet(((HashSet)this.d)), new HashSet(((HashSet)this.e)), this.b, this.c, ((e)this.g), ((HashSet)this.f));
    }

    public void c(int v) {
        if(this.b != 0) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        this.b = v;
    }
}

