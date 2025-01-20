package i9;

import android.util.SparseIntArray;
import com.sendwave.shared.QRScanActivity;

public final class h extends f {
    public g u;
    public g v;
    public long w;
    public static final SparseIntArray x;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        h.x = sparseIntArray0;
        sparseIntArray0.put(0x7F0A0089, 3);  // id:barcode_view
        sparseIntArray0.put(0x7F0A030A, 4);  // id:top_gray
        sparseIntArray0.put(0x7F0A009A, 5);  // id:bottom_gray
        sparseIntArray0.put(0x7F0A01A2, 6);  // id:left_gray
        sparseIntArray0.put(0x7F0A0274, 7);  // id:right_gray
        sparseIntArray0.put(0x7F0A0180, 8);  // id:id_frame
        sparseIntArray0.put(0x7F0A0088, 9);  // id:barcode_header
    }

    @Override  // R1.g
    public final void f() {
        long v;
        g g1;
        g g0;
        synchronized(this) {
            v = this.w;
            this.w = 0L;
        }
        QRScanActivity qRScanActivity0 = this.t;
        int v1 = Long.compare(v & 3L, 0L);
        if(v1 == 0 || qRScanActivity0 == null) {
            g0 = null;
            g1 = null;
        }
        else {
            g0 = this.u;
            if(g0 == null) {
                g0 = new g(1);
                this.u = g0;
            }
            g0.Y = qRScanActivity0;
            g1 = this.v;
            if(g1 == null) {
                g1 = new g(0);
                this.v = g1;
            }
            g1.Y = qRScanActivity0;
        }
        if(v1 != 0) {
            this.q.setOnClickListener(g1);
            this.r.setOnClickListener(g0);
        }
    }

    @Override  // R1.g
    public final boolean i() {
        synchronized(this) {
            if(this.w != 0L) {
                return true;
            }
        }
        return false;
    }

    @Override  // R1.g
    public final void j() {
        synchronized(this) {
            this.w = 2L;
        }
        this.o();
    }

    @Override  // R1.g
    public final boolean m(int v, int v1, Object object0) {
        return false;
    }

    @Override  // R1.g
    public final boolean t(int v, Object object0) {
        if(1 == v) {
            this.u(((QRScanActivity)object0));
            return true;
        }
        return false;
    }

    @Override  // i9.f
    public final void u(QRScanActivity qRScanActivity0) {
        this.t = qRScanActivity0;
        synchronized(this) {
            this.w |= 1L;
        }
        this.o();
    }
}

