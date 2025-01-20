package m7;

import E7.w;
import Q4.i;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class b {
    public final String a;
    public final Set b;
    public final Set c;
    public final int d;
    public final int e;
    public final e f;
    public final Set g;

    public b(String s, Set set0, Set set1, int v, int v1, e e0, Set set2) {
        this.a = s;
        this.b = Collections.unmodifiableSet(set0);
        this.c = Collections.unmodifiableSet(set1);
        this.d = v;
        this.e = v1;
        this.f = e0;
        this.g = Collections.unmodifiableSet(set2);
    }

    public static a a(Class class0) {
        return new a(class0, new Class[0]);
    }

    public static a b(r r0) {
        return new a(r0, new r[0]);
    }

    public static b c(Object object0, Class class0, Class[] arr_class) {
        HashSet hashSet0 = new HashSet();
        HashSet hashSet1 = new HashSet();
        HashSet hashSet2 = new HashSet();
        hashSet0.add(r.a(class0));
        for(int v = 0; v < arr_class.length; ++v) {
            Class class1 = arr_class[v];
            i.o(class1, "Null interface");
            hashSet0.add(r.a(class1));
        }
        w w0 = new w(23, object0);
        return new b(null, new HashSet(hashSet0), new HashSet(hashSet1), 0, 0, w0, hashSet2);
    }

    @Override
    public final String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }
}

