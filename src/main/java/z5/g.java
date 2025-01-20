package Z5;

import N5.f;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.Feature;

public final class g extends f {
    @Override  // N5.e, L5.c
    public final int f() {
        return 12451000;
    }

    @Override  // N5.e
    public final IInterface o(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        return iInterface0 instanceof e ? ((e)iInterface0) : new e(iBinder0);
    }

    @Override  // N5.e
    public final Feature[] q() {
        return c.c;
    }

    @Override  // N5.e
    public final String u() {
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }

    @Override  // N5.e
    public final String v() {
        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
    }
}

