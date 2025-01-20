package O6;

import L5.d;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.Locale;

public final class a extends d {
    public a(int v) {
        String s;
        Locale locale0 = Locale.getDefault();
        Integer integer0 = v;
        HashMap hashMap0 = P6.a.a;
        Integer integer1 = v;
        if(hashMap0.containsKey(integer1)) {
            HashMap hashMap1 = P6.a.b;
            s = hashMap1.containsKey(integer1) ? ((String)hashMap0.get(integer1)) + " (https://developer.android.com/reference/com/google/android/play/core/install/model/InstallErrorCode#" + ((String)hashMap1.get(integer1)) + ")" : "";
        }
        else {
            s = "";
        }
        super(new Status(v, String.format(locale0, "Install Error(%d): %s", integer0, s), null, null));
        if(v == 0) {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
    }
}

