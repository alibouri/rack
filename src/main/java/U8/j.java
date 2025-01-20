package U8;

import R2.h;
import com.google.android.gms.internal.measurement.k;
import com.google.android.gms.internal.measurement.o;
import com.google.android.gms.internal.measurement.u;
import com.google.android.gms.internal.measurement.x1;
import com.journeyapps.barcodescanner.Size;
import com.journeyapps.barcodescanner.camera.PreviewScalingStrategy;
import java.util.Arrays;
import java.util.Comparator;

public final class j implements Comparator {
    public final int X;
    public final Object Y;
    public final Object Z;

    public j(k k0, h h0) {
        this.X = 1;
        super();
        this.Y = k0;
        this.Z = h0;
    }

    public j(PreviewScalingStrategy previewScalingStrategy0, Size size0) {
        this.X = 0;
        super();
        this.Z = previewScalingStrategy0;
        this.Y = size0;
    }

    @Override
    public final int compare(Object object0, Object object1) {
        Object object2 = this.Z;
        Object object3 = this.Y;
        if(this.X != 0) {
            if(((o)object0) instanceof u) {
                return ((o)object1) instanceof u ? 0 : 1;
            }
            if(((o)object1) instanceof u) {
                return -1;
            }
            return ((k)object3) == null ? ((o)object0).i().compareTo(((o)object1).i()) : ((int)x1.a(((double)((k)object3).b(((h)object2), Arrays.asList(new o[]{((o)object0), ((o)object1)})).g())));
        }
        return Float.compare(((PreviewScalingStrategy)object2).a(((Size)object1), ((Size)object3)), ((PreviewScalingStrategy)object2).a(((Size)object0), ((Size)object3)));
    }
}

