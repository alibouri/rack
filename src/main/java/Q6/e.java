package Q6;

import V6.a;
import V6.c;
import V6.i;
import V6.m;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

public final class e {
    public final m a;
    public final String b;
    public final a c;

    public e(Context context0, m m0) {
        String s;
        MessageDigest messageDigest0;
        Signature[] arr_signature;
        this.b = "com.wave.personal";
        this.a = m0;
        try {
            if(context0.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                arr_signature = context0.getPackageManager().getPackageInfo("com.android.vending", 0x40).signatures;
                if(arr_signature == null || arr_signature.length == 0) {
                    goto label_20;
                }
                else {
                    goto label_6;
                }
            }
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
        goto label_24;
    label_6:
        int v = 0;
        while(v < arr_signature.length) {
            byte[] arr_b = arr_signature[v].toByteArray();
            try {
                messageDigest0 = MessageDigest.getInstance("SHA-256");
            }
            catch(NoSuchAlgorithmException unused_ex) {
                s = "";
                goto label_15;
            }
            messageDigest0.update(arr_b);
            s = Base64.encodeToString(messageDigest0.digest(), 11);
        label_15:
            if("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(s) || (Build.TAGS.contains("dev-keys") || Build.TAGS.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(s)) {
                this.c = new a(context0, m0, f.a);
                return;
            label_20:
                m m1 = c.a;
                m1.getClass();
                if(!Log.isLoggable("PlayCore", 5)) {
                    break;
                }
                Log.w("PlayCore", m.b(m1.a, "Phonesky package is not signed -- possibly self-built package. Could not verify.", new Object[0]));
                break;
            }
            ++v;
        }
    label_24:
        m0.getClass();
        if(Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", m.b(m0.a, "Phonesky is not installed.", new Object[0]));
        }
        this.c = null;
    }

    public static Bundle a(e e0, byte[] arr_b, Long long0) {
        Bundle bundle0 = new Bundle();
        bundle0.putString("package.name", e0.b);
        bundle0.putByteArray("nonce", arr_b);
        bundle0.putInt("playcore.integrity.version.major", 1);
        bundle0.putInt("playcore.integrity.version.minor", 2);
        bundle0.putInt("playcore.integrity.version.patch", 0);
        bundle0.putLong("cloud.prj", ((long)long0));
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(new i(System.currentTimeMillis()));
        ArrayList arrayList1 = new ArrayList();
        for(Object object0: arrayList0) {
            Bundle bundle1 = new Bundle();
            ((i)object0).getClass();
            bundle1.putInt("event_type", 3);
            bundle1.putLong("event_timestamp", ((i)object0).a);
            arrayList1.add(bundle1);
        }
        bundle0.putParcelableArrayList("event_timestamps", new ArrayList(arrayList1));
        return bundle0;
    }
}

