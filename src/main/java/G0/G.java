package g0;

import android.support.v4.media.session.a;
import androidx.compose.ui.unit.LayoutDirection;
import m5.b;

public final class g implements c {
    public final float a;
    public final float b;

    public g(float f, float f1) {
        this.a = f;
        this.b = f1;
    }

    @Override  // g0.c
    public final long a(long v, long v1, LayoutDirection layoutDirection0) {
        return a.i(Math.round(((layoutDirection0 == LayoutDirection.X ? this.a : this.a * -1.0f) + 1.0f) * (((float)(((int)(v1 >> 0x20)) - ((int)(v >> 0x20)))) / 2.0f)), Math.round((1.0f + this.b) * (((float)(((int)(v1 & 0xFFFFFFFFL)) - ((int)(v & 0xFFFFFFFFL)))) / 2.0f)));
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof g)) {
            return false;
        }
        return Float.compare(this.a, ((g)object0).a) == 0 ? Float.compare(this.b, ((g)object0).b) == 0 : false;
    }

    @Override
    public final int hashCode() {
        return Float.floatToIntBits(this.b) + Float.floatToIntBits(this.a) * 0x1F;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("BiasAlignment(horizontalBias=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", verticalBias=");
        return b.x(stringBuilder0, this.b, ')');
    }
}

