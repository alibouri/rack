package l1;

import java.util.HashMap;

public enum i {
    SPREAD,
    SPREAD_INSIDE,
    PACKED;

    public static final HashMap b0;

    static {
        HashMap hashMap0 = new HashMap();
        HashMap hashMap1 = new HashMap();
        i.b0 = hashMap1;
        hashMap0.put("packed", i.Z);
        hashMap0.put("spread_inside", i.Y);
        hashMap0.put("spread", i.X);
        hashMap1.put("packed", 2);
        hashMap1.put("spread_inside", 1);
        hashMap1.put("spread", 0);
    }

    // Deobfuscation rating: LOW(20)
    public static int a(String s) {
        return i.b0.containsKey(s) ? ((int)(((Integer)i.b0.get(s)))) : -1;
    }
}

