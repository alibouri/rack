package R9;

import Nb.j;
import T8.b;
import Y8.N;
import c2.x;
import com.sendwave.util.WaveBarcodeView;
import com.wave.customer.QrScanFragment;
import com.wave.customer.QrScanOrCardActivity;
import com.wave.customer.m;
import q9.F3;

public final class a2 extends F3 {
    public final QrScanFragment k;

    public a2(QrScanFragment qrScanFragment0, x x0, WaveBarcodeView waveBarcodeView0) {
        this.k = qrScanFragment0;
        super(x0, waveBarcodeView0);
    }

    @Override  // q9.F3
    public final void e(b b0) {
        x x0 = this.k.j();
        j.d(x0, "null cannot be cast to non-null type com.wave.customer.QrScanOrCardActivity");
        o2 o20 = ((QrScanOrCardActivity)x0).J();
        String s = b0.a.a;
        j.e(s, "getText(...)");
        o20.getClass();
        m m0 = new m(o20, s, null);
        N.k(o20, o20.c0, true, m0);
    }
}

