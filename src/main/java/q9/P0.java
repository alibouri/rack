package q9;

import Nb.j;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Base64;

public final class p0 implements CharSequence {
    public final Bundle X;

    public p0(Bundle bundle0) {
        this.X = bundle0;
    }

    @Override
    public final char charAt(int v) {
        return '\u0000';
    }

    @Override
    public final int length() {
        return 0;
    }

    @Override
    public final CharSequence subSequence(int v, int v1) {
        return this;
    }

    @Override
    public final String toString() {
        Parcel parcel0 = Parcel.obtain();
        j.e(parcel0, "obtain(...)");
        parcel0.writeBundle(this.X);
        byte[] arr_b = parcel0.marshall();
        parcel0.recycle();
        j.c(arr_b);
        String s = Base64.encodeToString(arr_b, 0);
        j.e(s, "encodeToString(...)");
        return s;
    }
}

