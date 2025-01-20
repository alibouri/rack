package H6;

import android.graphics.RectF;
import java.util.Arrays;

public final class g implements c {
    public final float a;

    public g(float f) {
        this.a = f;
    }

    @Override  // H6.c
    public final float a(RectF rectF0) {
        return rectF0.height() * this.a;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof g ? this.a == ((g)object0).a : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((float)this.a)});
    }
}

