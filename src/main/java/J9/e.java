package J9;

import Ab.k;
import Bb.F;
import Bb.q;
import Nb.j;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public abstract class e {
    public static final HashMap a;

    static {
        e.a = F.D(new k[]{new k("01", q.L(new String[]{"01", "02", "03", "40", "41", "42", "43", "50", "51", "52", "53", "70", "71", "72", "73"})), new k("05", q.L(new String[]{"04", "05", "06", "44", "45", "46", "54", "55", "56", "64", "65", "66", "74", "75", "76", "84", "85", "86", "94", "95", "96"})), new k("07", q.L(new String[]{"07", "08", "09", "47", "48", "49", "57", "58", "59", "67", "68", "69", "77", "78", "79", "87", "88", "89", "97", "98"}))});
    }

    public static String a(String s) {
        String s1 = null;
        String s2 = s.substring(0, 2);
        j.e(s2, "substring(...)");
        for(Object object0: e.a.entrySet()) {
            String s3 = (String)((Map.Entry)object0).getKey();
            if(((List)((Map.Entry)object0).getValue()).contains(s2)) {
                s1 = s3;
                break;
            }
        }
        if(s1 == null) {
            s1 = "";
        }
        return s1 + s;
    }
}

