package j3;

import Nb.j;
import Xb.k;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.apollographql.apollo.api.b;

public final class f implements i {
    public final ImageView X;
    public final boolean Y;

    public f(ImageView imageView0, boolean z) {
        this.X = imageView0;
        this.Y = z;
    }

    // Deobfuscation rating: LOW(30)
    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 instanceof f && j.a(this.X, ((f)object0).X) && this.Y == ((f)object0).Y;
    }

    @Override
    public final int hashCode() {
        int v = this.X.hashCode();
        return this.Y ? v * 0x1F + 0x4CF : v * 0x1F + 0x4D5;
    }

    @Override  // j3.i
    public final Object k(Y2.j j0) {
        Object object0 = b.e(this);
        if(object0 == null) {
            k k0 = new k(1, N4.j.w(j0));
            k0.v();
            ViewTreeObserver viewTreeObserver0 = this.X.getViewTreeObserver();
            j3.k k1 = new j3.k(this, viewTreeObserver0, k0);
            viewTreeObserver0.addOnPreDrawListener(k1);
            k0.y(new j3.j(this, viewTreeObserver0, k1));
            return k0.u();
        }
        return object0;
    }
}

