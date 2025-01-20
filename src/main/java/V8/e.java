package v8;

import android.content.Intent;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import r8.a;

public abstract class e {
    public static final Pattern a;
    public static final HashMap b;

    static {
        e.a = Pattern.compile(",");
        EnumSet enumSet0 = EnumSet.of(a.j0);
        EnumSet enumSet1 = EnumSet.of(a.d0);
        EnumSet enumSet2 = EnumSet.of(a.X);
        EnumSet enumSet3 = EnumSet.of(a.i0);
        EnumSet enumSet4 = EnumSet.of(a.m0, new a[]{a.n0, a.f0, a.e0, a.k0, a.l0});
        EnumSet enumSet5 = EnumSet.of(a.Z, a.b0, a.c0, a.g0, a.Y);
        EnumSet enumSet6 = EnumSet.copyOf(enumSet4);
        enumSet6.addAll(enumSet5);
        HashMap hashMap0 = new HashMap();
        e.b = hashMap0;
        hashMap0.put("ONE_D_MODE", enumSet6);
        hashMap0.put("PRODUCT_MODE", enumSet4);
        hashMap0.put("QR_CODE_MODE", enumSet0);
        hashMap0.put("DATA_MATRIX_MODE", enumSet1);
        hashMap0.put("AZTEC_MODE", enumSet2);
        hashMap0.put("PDF417_MODE", enumSet3);
    }

    public static Set a(Intent intent0) {
        String s = intent0.getStringExtra("SCAN_FORMATS");
        List list0 = s == null ? null : Arrays.asList(e.a.split(s));
        String s1 = intent0.getStringExtra("SCAN_MODE");
        if(list0 != null) {
            EnumSet enumSet0 = EnumSet.noneOf(a.class);
            try {
                for(Object object0: list0) {
                    enumSet0.add(a.valueOf(((String)object0)));
                }
                return enumSet0;
            }
            catch(IllegalArgumentException unused_ex) {
            }
        }
        return s1 == null ? null : ((Set)e.b.get(s1));
    }
}

