package Q1;

import K1.d;
import android.graphics.Rect;
import io.sentry.hints.i;
import java.util.Comparator;

public final class b implements Comparator {
    public final Rect X;
    public final Rect Y;
    public final boolean Z;
    public final i b0;

    public b(boolean z, i i0) {
        this.X = new Rect();
        this.Y = new Rect();
        this.Z = z;
        this.b0 = i0;
    }

    @Override
    public final int compare(Object object0, Object object1) {
        this.b0.getClass();
        Rect rect0 = this.X;
        ((d)object0).f(rect0);
        Rect rect1 = this.Y;
        ((d)object1).f(rect1);
        int v = rect0.top;
        int v1 = rect1.top;
        if(v < v1) {
            return -1;
        }
        if(v > v1) {
            return 1;
        }
        int v2 = rect0.left;
        int v3 = rect1.left;
        boolean z = this.Z;
        if(v2 < v3) {
            return z ? 1 : -1;
        }
        if(v2 > v3) {
            return z ? -1 : 1;
        }
        int v4 = rect0.bottom;
        int v5 = rect1.bottom;
        if(v4 < v5) {
            return -1;
        }
        if(v4 > v5) {
            return 1;
        }
        int v6 = rect0.right;
        int v7 = rect1.right;
        if(v6 < v7) {
            return z ? 1 : -1;
        }
        if(v6 > v7) {
            return z ? -1 : 1;
        }
        return 0;
    }
}

