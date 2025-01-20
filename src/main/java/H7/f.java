package H7;

import L7.a;
import M7.c;
import S7.d;
import android.app.Activity;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import java.util.HashMap;

public final class f {
    public final Activity a;
    public final FrameMetricsAggregator b;
    public final HashMap c;
    public boolean d;
    public static final a e;

    static {
        f.e = a.d();
    }

    public f(Activity activity0) {
        FrameMetricsAggregator frameMetricsAggregator0 = new FrameMetricsAggregator();
        HashMap hashMap0 = new HashMap();
        super();
        this.d = false;
        this.a = activity0;
        this.b = frameMetricsAggregator0;
        this.c = hashMap0;
    }

    public final d a() {
        a a0 = f.e;
        if(!this.d) {
            a0.a("No recording has been started.");
            return new d();
        }
        SparseIntArray[] arr_sparseIntArray = this.b.a.i();
        if(arr_sparseIntArray == null) {
            a0.a("FrameMetricsAggregator.mMetrics is uninitialized.");
            return new d();
        }
        SparseIntArray sparseIntArray0 = arr_sparseIntArray[0];
        if(sparseIntArray0 == null) {
            a0.a("FrameMetricsAggregator.mMetrics[TOTAL_INDEX] is uninitialized.");
            return new d();
        }
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        for(int v = 0; v < sparseIntArray0.size(); ++v) {
            int v4 = sparseIntArray0.keyAt(v);
            int v5 = sparseIntArray0.valueAt(v);
            v1 += v5;
            if(v4 > 700) {
                v3 += v5;
            }
            if(v4 > 16) {
                v2 += v5;
            }
        }
        return new d(new c(v1, v2, v3));
    }
}

