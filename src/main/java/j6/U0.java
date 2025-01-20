package j6;

import N5.r;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdw;

public final class u0 {
    public final Context a;
    public final String b;
    public final String c;
    public final String d;
    public final Boolean e;
    public final long f;
    public final zzdw g;
    public final boolean h;
    public final Long i;
    public final String j;

    public u0(Context context0, zzdw zzdw0, Long long0) {
        this.h = true;
        r.j(context0);
        Context context1 = context0.getApplicationContext();
        r.j(context1);
        this.a = context1;
        this.i = long0;
        if(zzdw0 != null) {
            this.g = zzdw0;
            this.b = zzdw0.d0;
            this.c = zzdw0.c0;
            this.d = zzdw0.b0;
            this.h = zzdw0.Z;
            this.f = zzdw0.Y;
            this.j = zzdw0.f0;
            Bundle bundle0 = zzdw0.e0;
            if(bundle0 != null) {
                this.e = Boolean.valueOf(bundle0.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}

