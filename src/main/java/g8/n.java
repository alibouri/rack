package g8;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public abstract class n {
    public static final Map a;

    static {
        HashMap hashMap0 = new HashMap(16);
        HashMap hashMap1 = new HashMap(16);
        Class class0 = Boolean.TYPE;
        hashMap0.put(class0, Boolean.class);
        hashMap1.put(Boolean.class, class0);
        Class class1 = Byte.TYPE;
        hashMap0.put(class1, Byte.class);
        hashMap1.put(Byte.class, class1);
        Class class2 = Character.TYPE;
        hashMap0.put(class2, Character.class);
        hashMap1.put(Character.class, class2);
        Class class3 = Double.TYPE;
        hashMap0.put(class3, Double.class);
        hashMap1.put(Double.class, class3);
        Class class4 = Float.TYPE;
        hashMap0.put(class4, Float.class);
        hashMap1.put(Float.class, class4);
        Class class5 = Integer.TYPE;
        hashMap0.put(class5, Integer.class);
        hashMap1.put(Integer.class, class5);
        Class class6 = Long.TYPE;
        hashMap0.put(class6, Long.class);
        hashMap1.put(Long.class, class6);
        Class class7 = Short.TYPE;
        hashMap0.put(class7, Short.class);
        hashMap1.put(Short.class, class7);
        Class class8 = Void.TYPE;
        hashMap0.put(class8, Void.class);
        hashMap1.put(Void.class, class8);
        n.a = Collections.unmodifiableMap(hashMap0);
        Collections.unmodifiableMap(hashMap1);
    }
}

