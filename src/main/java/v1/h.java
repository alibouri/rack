package v1;

import android.view.FrameMetrics;
import android.view.Window.OnFrameMetricsAvailableListener;
import android.view.Window;

public final class h implements Window.OnFrameMetricsAvailableListener {
    public final i a;

    public h(i i0) {
        this.a = i0;
    }

    @Override  // android.view.Window$OnFrameMetricsAvailableListener
    public final void onFrameMetricsAvailable(Window window0, FrameMetrics frameMetrics0, int v) {
        i i0 = this.a;
        if((i0.a & 1) != 0) {
            i.n(i0.b[0], frameMetrics0.getMetric(8));
        }
        i i1 = this.a;
        if((i1.a & 2) != 0) {
            i.n(i1.b[1], frameMetrics0.getMetric(1));
        }
        i i2 = this.a;
        if((i2.a & 4) != 0) {
            i.n(i2.b[2], frameMetrics0.getMetric(3));
        }
        i i3 = this.a;
        if((i3.a & 8) != 0) {
            i.n(i3.b[3], frameMetrics0.getMetric(4));
        }
        i i4 = this.a;
        if((i4.a & 16) != 0) {
            i.n(i4.b[4], frameMetrics0.getMetric(5));
        }
        i i5 = this.a;
        if((i5.a & 0x40) != 0) {
            i.n(i5.b[6], frameMetrics0.getMetric(7));
        }
        i i6 = this.a;
        if((i6.a & 0x20) != 0) {
            i.n(i6.b[5], frameMetrics0.getMetric(6));
        }
        i i7 = this.a;
        if((i7.a & 0x80) != 0) {
            i.n(i7.b[7], frameMetrics0.getMetric(0));
        }
        i i8 = this.a;
        if((i8.a & 0x100) != 0) {
            i.n(i8.b[8], frameMetrics0.getMetric(2));
        }
    }
}

