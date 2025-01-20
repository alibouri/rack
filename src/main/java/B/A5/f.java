package a5;

import Bb.K;
import Bb.p;
import Nb.j;
import Vb.q;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.os.Build;
import java.util.HashSet;

public abstract class f {
    public static final HashSet a;

    static {
        f.a = K.J(new String[]{"8a3c4b262d721acd49a4bf97d5213199c86fa2b9", "cc2751449a350f668590264ed76692694a80308a", "a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc", "df6b721c8b4d3b6eb44c861d4415007e5a35fc95", "9b8f518b086098de3d77736f9458a3d2f6f95a37", "2438bce1ddb7bd026d5ff89f598b3b5e5bb824b3", "c56fb7d591ba6704df047fd98f535372fea00211"});
    }

    public static final boolean a(Context context0, String s) {
        String s1 = Build.BRAND;
        int v = context0.getApplicationInfo().flags;
        j.e(s1, "brand");
        if(q.O(s1, "generic", false) && (v & 2) != 0) {
            return true;
        }
        try {
            Signature[] arr_signature = context0.getPackageManager().getPackageInfo(s, 0x40).signatures;
            if(arr_signature != null && arr_signature.length != 0) {
                j.e(arr_signature, "packageInfo.signatures");
                for(int v1 = 0; v1 < arr_signature.length; ++v1) {
                    byte[] arr_b = arr_signature[v1].toByteArray();
                    j.e(arr_b, "it.toByteArray()");
                    String s2 = w.K("SHA-1", arr_b);
                    if(!p.k0(f.a, s2)) {
                        return false;
                    }
                }
                return true;
            }
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
        return false;
    }
}

