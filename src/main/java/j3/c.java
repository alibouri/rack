package j3;

import Nb.j;
import android.content.Context;
import android.util.DisplayMetrics;

public final class c implements i {
    public final Context X;

    public c(Context context0) {
        this.X = context0;
    }

    // Deobfuscation rating: LOW(30)
    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 instanceof c && j.a(this.X, ((c)object0).X);
    }

    @Override
    public final int hashCode() {
        return this.X.hashCode();
    }

    @Override  // j3.i
    public final Object k(Y2.j j0) {
        DisplayMetrics displayMetrics0 = this.X.getResources().getDisplayMetrics();
        a a0 = new a(Math.max(displayMetrics0.widthPixels, displayMetrics0.heightPixels));
        return new h(a0, a0);
    }
}

