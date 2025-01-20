package N5;

import android.content.Context;
import android.content.Intent;
import android.net.Uri.Builder;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.Arrays;

public final class x {
    public final String a;
    public final String b;
    public final boolean c;
    public static final Uri d;

    static {
        x.d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    }

    public x(String s, boolean z) {
        r.f(s);
        this.a = s;
        r.f("com.google.android.gms");
        this.b = "com.google.android.gms";
        this.c = z;
    }

    public final Intent a(Context context0) {
        Bundle bundle1;
        Intent intent0 = null;
        String s = this.a;
        if(s != null) {
            if(this.c) {
                Bundle bundle0 = new Bundle();
                bundle0.putString("serviceActionBundleKey", s);
                try {
                    bundle1 = context0.getContentResolver().call(x.d, "serviceIntentCall", null, bundle0);
                }
                catch(IllegalArgumentException illegalArgumentException0) {
                    Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: " + illegalArgumentException0.toString());
                    bundle1 = null;
                }
                if(bundle1 != null) {
                    intent0 = (Intent)bundle1.getParcelable("serviceResponseIntentKey");
                }
                if(intent0 == null) {
                    Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: " + s);
                }
            }
            return intent0 == null ? new Intent(s).setPackage(this.b) : intent0;
        }
        return new Intent().setComponent(null);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof x ? r.m(this.a, ((x)object0).a) && r.m(this.b, ((x)object0).b) && r.m(null, null) && this.c == ((x)object0).c : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, 0x1081, Boolean.valueOf(this.c)});
    }

    @Override
    public final String toString() {
        String s = this.a;
        if(s != null) {
            return s;
        }
        r.j(null);
        throw null;
    }
}

