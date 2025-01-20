package e4;

import com.drew.metadata.jpeg.b;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import l4.m;

public abstract class a {
    public static final List a;

    static {
        a.a = Arrays.asList(new c[]{new b(3), new b(0), new b(8), new b(9), new b(5), new L4.a(), new b(6), new com.drew.metadata.photoshop.b(0), new com.drew.metadata.photoshop.b(1), new b(7), new b(4), new b(1), new b(2)});  // initializer: Ljava/lang/Object;-><init>()V
    }

    public static U7.c a(InputStream inputStream0) {
        U7.c c0 = new U7.c(29);
        HashSet hashSet0 = new HashSet();
        List list0 = a.a;
        for(Object object0: list0) {
            for(Object object1: ((c)object0).b()) {
                hashSet0.add(((d)object1));
            }
        }
        B3.c c1 = android.support.v4.media.session.a.J(new m(inputStream0), hashSet0);
        for(Object object2: list0) {
            c c2 = (c)object2;
            for(Object object3: c2.b()) {
                List list1 = (List)((HashMap)c1.Y).get(((byte)((d)object3).X));
                if(list1 == null) {
                    list1 = new ArrayList();
                }
                c2.a(list1, c0, ((d)object3));
            }
        }
        return c0;
    }
}

