package W5;

import V5.b;
import Y5.a;
import android.os.Parcel;

public final class i extends a {
    public final V5.a N(b b0, String s, int v) {
        Parcel parcel0 = this.J();
        c6.a.c(parcel0, b0);
        parcel0.writeString(s);
        parcel0.writeInt(v);
        Parcel parcel1 = this.e(2, parcel0);
        V5.a a0 = b.N(parcel1.readStrongBinder());
        parcel1.recycle();
        return a0;
    }

    public final V5.a O(b b0, String s, int v, b b1) {
        Parcel parcel0 = this.J();
        c6.a.c(parcel0, b0);
        parcel0.writeString(s);
        parcel0.writeInt(v);
        c6.a.c(parcel0, b1);
        Parcel parcel1 = this.e(8, parcel0);
        V5.a a0 = b.N(parcel1.readStrongBinder());
        parcel1.recycle();
        return a0;
    }

    public final V5.a P(b b0, String s, int v) {
        Parcel parcel0 = this.J();
        c6.a.c(parcel0, b0);
        parcel0.writeString(s);
        parcel0.writeInt(v);
        Parcel parcel1 = this.e(4, parcel0);
        V5.a a0 = b.N(parcel1.readStrongBinder());
        parcel1.recycle();
        return a0;
    }

    public final V5.a Q(b b0, String s, boolean z, long v) {
        Parcel parcel0 = this.J();
        c6.a.c(parcel0, b0);
        parcel0.writeString(s);
        parcel0.writeInt(((int)z));
        parcel0.writeLong(v);
        Parcel parcel1 = this.e(7, parcel0);
        V5.a a0 = b.N(parcel1.readStrongBinder());
        parcel1.recycle();
        return a0;
    }
}

