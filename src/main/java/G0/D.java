package g0;

import androidx.compose.ui.unit.LayoutDirection;
import io.sentry.config.a;

public final class d implements c {
    public final float a;

    public d(float f) {
        this.a = f;
    }

    @Override  // g0.c
    public final long a(long v, long v1, LayoutDirection layoutDirection0) {
        long v2 = a.d(((int)(v1 >> 0x20)) - ((int)(v >> 0x20)), ((int)(v1 & 0xFFFFFFFFL)) - ((int)(v & 0xFFFFFFFFL)));
        return android.support.v4.media.session.a.i(Math.round((this.a + 1.0f) * (((float)(((int)(v2 >> 0x20)))) / 2.0f)), Math.round(0.0f * (((float)(((int)(v2 & 0xFFFFFFFFL)))) / 2.0f)));
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof d)) {
            return false;
        }
        return Float.compare(this.a, ((d)object0).a) == 0 ? Float.compare(-1.0f, -1.0f) == 0 : false;
    }

    @Override
    public final int hashCode() {
        return Float.floatToIntBits(-1.0f) + Float.floatToIntBits(this.a) * 0x1F;
    }

    @Override
    public final String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.a + ", verticalBias=-1.0)";
    }
}

