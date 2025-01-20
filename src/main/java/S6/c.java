package S6;

import M.J;
import T6.e;
import T6.i;
import T6.j;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;

public final class c {
    public final i a;
    public final String b;
    public static final e c;

    static {
        c.c = new e("ReviewService", 0);
    }

    public c(Context context0) {
        String s;
        MessageDigest messageDigest0;
        Signature[] arr_signature;
        this.b = "com.wave.personal";
        e e0 = j.a;
        try {
            if(!context0.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                goto label_7;
            }
            goto label_9;
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            e0.c("Play Store package is not found.", new Object[0]);
            return;
        }
    label_7:
        e0.c("Play Store package is disabled.", new Object[0]);
        return;
        try {
        label_9:
            arr_signature = context0.getPackageManager().getPackageInfo("com.android.vending", 0x40).signatures;
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            e0.c("Play Store package is not found.", new Object[0]);
            return;
        }
        if(arr_signature != null && arr_signature.length != 0) {
            ArrayList arrayList0 = new ArrayList();
            int v = 0;
            while(v < arr_signature.length) {
                byte[] arr_b = arr_signature[v].toByteArray();
                try {
                    messageDigest0 = MessageDigest.getInstance("SHA-256");
                }
                catch(NoSuchAlgorithmException unused_ex) {
                    s = "";
                    goto label_24;
                }
                messageDigest0.update(arr_b);
                s = Base64.encodeToString(messageDigest0.digest(), 11);
            label_24:
                arrayList0.add(s);
                if(!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(s) && (!Build.TAGS.contains("dev-keys") && !Build.TAGS.contains("test-keys") || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(s))) {
                    ++v;
                    continue;
                }
                Intent intent0 = new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending");
                this.a = new i(context0, c.c, intent0);
                return;
            }
            StringBuilder stringBuilder0 = new StringBuilder();
            Iterator iterator0 = arrayList0.iterator();
            if(iterator0.hasNext()) {
                while(true) {
                    Object object0 = iterator0.next();
                    stringBuilder0.append(((CharSequence)object0));
                    if(!iterator0.hasNext()) {
                        break;
                    }
                    stringBuilder0.append(", ");
                }
            }
            e0.c(J.e("Play Store package certs are not valid. Found these sha256 certs: [", stringBuilder0.toString(), "]."), new Object[0]);
            return;
        }
        e0.c("Play Store package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
    }
}

