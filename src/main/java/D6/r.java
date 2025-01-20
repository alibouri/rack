package d6;

import N6.d;
import android.os.Parcel;
import com.google.android.gms.internal.location.zzl;

public abstract class r extends d implements s {
    public r() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback", 6);
    }

    @Override  // N6.d
    public final boolean L(int v, Parcel parcel0) {
        switch(v) {
            case 1: {
                zzl zzl0 = (zzl)c.a(parcel0, zzl.CREATOR);
                c.c(parcel0);
                this.H(zzl0);
                return true;
            }
            case 2: {
                this.g();
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

