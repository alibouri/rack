package M5;

import N5.r;
import com.google.android.gms.common.Feature;
import io.sentry.g1;
import java.util.Arrays;

public final class s {
    public final b a;
    public final Feature b;

    public s(b b0, Feature feature0) {
        this.a = b0;
        this.b = feature0;
    }

    // Deobfuscation rating: LOW(30)
    @Override
    public final boolean equals(Object object0) {
        return object0 != null && object0 instanceof s && r.m(this.a, ((s)object0).a) && r.m(this.b, ((s)object0).b);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override
    public final String toString() {
        g1 g10 = new g1(this);
        g10.b(this.a, "key");
        g10.b(this.b, "feature");
        return g10.toString();
    }
}

