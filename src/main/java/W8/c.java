package W8;

import android.hardware.Camera.Size;
import java.util.Comparator;

public final class c implements Comparator {
    public final int X;
    public final float Y;

    public c(int v, float f) {
        this.X = v;
        this.Y = f;
    }

    @Override
    public final int compare(Object object0, Object object1) {
        int v = ((Camera.Size)object0).width;
        float f = ((float)Math.max(v, ((Camera.Size)object0).height)) / ((float)Math.min(v, ((Camera.Size)object0).height));
        int v1 = ((Camera.Size)object1).width;
        float f1 = ((float)Math.max(v1, ((Camera.Size)object1).height)) / ((float)Math.min(v1, ((Camera.Size)object1).height));
        return ((double)Math.abs(f - f1)) < 0.1 ? Math.abs(((Camera.Size)object0).width * ((Camera.Size)object0).height - this.X).compareTo(Math.abs(((Camera.Size)object1).width * ((Camera.Size)object1).height - this.X)) : Float.compare(Math.abs(f - this.Y), Math.abs(f1 - this.Y));
    }
}

