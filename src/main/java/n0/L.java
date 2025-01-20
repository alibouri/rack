package n0;

import android.graphics.PathMeasure;
import androidx.compose.ui.graphics.Path;

public final class l {
    public final PathMeasure a;

    public l(PathMeasure pathMeasure0) {
        this.a = pathMeasure0;
    }

    public final void a(float f, float f1, Path path0) {
        if(!(path0 instanceof j)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        this.a.getSegment(f, f1, ((j)path0).a, true);
    }
}

