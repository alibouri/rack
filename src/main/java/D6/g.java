package d6;

import N4.j;
import N6.d;
import a6.a;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import o6.i;

public final class g extends d {
    public final Boolean e;
    public final i f;

    public g(Boolean boolean0, i i0) {
        this.e = boolean0;
        this.f = i0;
        super("com.google.android.gms.common.api.internal.IStatusCallback", 4);
    }

    @Override  // N6.d
    public final boolean J(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)a.a(parcel0, Status.CREATOR);
            a.b(parcel0);
            j.N(status0, this.e, this.f);
            return true;
        }
        return false;
    }
}

