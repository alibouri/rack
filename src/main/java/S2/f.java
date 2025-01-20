package S2;

import I2.A;
import android.content.ComponentName;
import android.content.Context;

public abstract class f {
    public static final String a;

    static {
        f.a = A.g("PackageManagerHelper");
    }

    public static void a(Context context0, Class class0, boolean z) {
        String s1;
        String s = "disabled";
        try {
            s1 = f.a;
            int v = context0.getPackageManager().getComponentEnabledSetting(new ComponentName(context0, class0.getName()));
            if(z == (v != 0 && v == 1)) {
                A.e().a(s1, "Skipping component enablement for " + class0.getName());
                return;
            }
            context0.getPackageManager().setComponentEnabledSetting(new ComponentName(context0, class0.getName()), (z ? 1 : 2), 1);
            A.e().a(s1, class0.getName() + " " + (z ? "enabled" : "disabled"));
            return;
        }
        catch(Exception exception0) {
        }
        A a0 = A.e();
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(class0.getName());
        stringBuilder0.append("could not be ");
        if(z) {
            s = "enabled";
        }
        stringBuilder0.append(s);
        a0.b(s1, stringBuilder0.toString(), exception0);
    }
}

