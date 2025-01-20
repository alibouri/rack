package g3;

import Nb.j;
import android.graphics.Bitmap;
import java.util.Map;

public final class a {
    public final Bitmap a;
    public final Map b;

    public a(Bitmap bitmap0, Map map0) {
        this.a = bitmap0;
        this.b = map0;
    }

    // Deobfuscation rating: LOW(40)
    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 instanceof a && j.a(this.a, ((a)object0).a) && j.a(this.b, ((a)object0).b);
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "Value(bitmap=" + this.a + ", extras=" + this.b + ')';
    }
}

