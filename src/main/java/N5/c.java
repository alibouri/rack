package N5;

import V5.b;
import Y5.a;
import android.os.Parcel;

public final class C extends a implements m {
    @Override  // N5.m
    public final V5.a a() {
        Parcel parcel0 = this.e(1, this.J());
        V5.a a0 = b.N(parcel0.readStrongBinder());
        parcel0.recycle();
        return a0;
    }

    @Override  // N5.m
    public final int l() {
        Parcel parcel0 = this.e(2, this.J());
        int v = parcel0.readInt();
        parcel0.recycle();
        return v;
    }
}

