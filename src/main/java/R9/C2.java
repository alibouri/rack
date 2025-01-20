package R9;

import android.os.Parcelable;
import androidx.lifecycle.ViewModelProvider;
import com.wave.customer.QrScanOrCardActivity;
import com.wave.customer.QrScanOrCardParams;
import kotlin.jvm.functions.Function0;

public final class c2 implements Function0 {
    public final int X;
    public final QrScanOrCardActivity Y;

    public c2(QrScanOrCardActivity qrScanOrCardActivity0, int v) {
        this.X = v;
        this.Y = qrScanOrCardActivity0;
        super();
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        QrScanOrCardActivity qrScanOrCardActivity0 = this.Y;
        if(this.X != 0) {
            Parcelable parcelable0 = qrScanOrCardActivity0.getIntent().getParcelableExtra("com.wave.typeSafeExtras");
            if(parcelable0 == null) {
                throw new Exception(QrScanOrCardActivity.class.getName() + " invoked with no params");
            }
            return (S)new ViewModelProvider(qrScanOrCardActivity0, new f2(qrScanOrCardActivity0, ((QrScanOrCardParams)parcelable0))).a(S.class);
        }
        Object object0 = (o2)new ViewModelProvider(qrScanOrCardActivity0, new i2(qrScanOrCardActivity0)).a(o2.class);
        d2 d20 = new d2(qrScanOrCardActivity0);
        object0.c0.c(qrScanOrCardActivity0, d20);
        return object0;
    }
}

