package R9;

import Bb.p;
import Nb.j;
import com.sendwave.util.WaveBarcodeView;
import com.wave.customer.QrScanFragment;
import com.wave.customer.QrScanOrCardActivity;
import java.util.ArrayList;
import java.util.List;
import q9.j3;

public final class d2 extends j3 implements b2 {
    public final QrScanOrCardActivity b;

    public d2(QrScanOrCardActivity qrScanOrCardActivity0) {
        this.b = qrScanOrCardActivity0;
        super(qrScanOrCardActivity0);
    }

    @Override  // R9.b2
    public final void W() {
        List list0 = this.b.w().c.k();
        j.e(list0, "getFragments(...)");
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            if(object0 instanceof QrScanFragment) {
                arrayList0.add(object0);
            }
        }
        QrScanFragment qrScanFragment0 = (QrScanFragment)p.q0(arrayList0);
        if(qrScanFragment0 != null) {
            WaveBarcodeView waveBarcodeView0 = qrScanFragment0.Z0 == null ? null : qrScanFragment0.Z0.q;
            if(waveBarcodeView0 != null) {
                waveBarcodeView0.g();
            }
            a2 a20 = qrScanFragment0.X0;
            if(a20 != null) {
                a20.b.B0 = 2;
                a20.b.C0 = a20.i;
                a20.b.k();
            }
        }
    }
}

