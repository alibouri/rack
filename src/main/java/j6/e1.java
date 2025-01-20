package j6;

import android.text.TextUtils;
import java.util.HashMap;

public final class e1 {
    public final HashMap a;
    public static final String[] b;

    static {
        e1.b = new String[]{"GoogleConsent", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "CmpSdkID"};
    }

    public e1(HashMap hashMap0) {
        HashMap hashMap1 = new HashMap();
        this.a = hashMap1;
        hashMap1.putAll(hashMap0);
    }

    public final String a() {
        StringBuilder stringBuilder0 = new StringBuilder();
        String[] arr_s = e1.b;
        for(int v = 0; v < 6; ++v) {
            String s = arr_s[v];
            HashMap hashMap0 = this.a;
            if(hashMap0.containsKey(s)) {
                if(stringBuilder0.length() > 0) {
                    stringBuilder0.append(";");
                }
                stringBuilder0.append(s);
                stringBuilder0.append("=");
                stringBuilder0.append(((String)hashMap0.get(s)));
            }
        }
        return stringBuilder0.toString();
    }

    public final int b() {
        try {
            String s = (String)this.a.get("PolicyVersion");
            return TextUtils.isEmpty(s) ? -1 : Integer.parseInt(s);
        }
        catch(NumberFormatException unused_ex) {
        }
        return -1;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof e1 ? this.a().equalsIgnoreCase(((e1)object0).a()) : false;
    }

    @Override
    public final int hashCode() {
        return this.a().hashCode();
    }

    @Override
    public final String toString() {
        return this.a();
    }
}

