package I2;

import Nb.j;
import android.net.Uri;

public final class f {
    public final Uri a;
    public final boolean b;

    public f(boolean z, Uri uri0) {
        this.a = uri0;
        this.b = z;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        Class class0 = object0 == null ? null : object0.getClass();
        if(!f.class.equals(class0)) {
            return false;
        }
        j.d(object0, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
        return j.a(this.a, ((f)object0).a) ? this.b == ((f)object0).b : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        return this.b ? v * 0x1F + 0x4CF : v * 0x1F + 0x4D5;
    }
}

