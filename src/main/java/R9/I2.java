package R9;

import Nb.e;
import Nb.j;
import Y8.R6;
import Y8.o;
import android.os.Parcelable;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import com.wave.customer.QrScanOrCardActivity;
import com.wave.customer.QrScanOrCardParams;
import q9.r1;

public final class i2 implements Factory {
    public final QrScanOrCardActivity a;

    public i2(QrScanOrCardActivity qrScanOrCardActivity0) {
        this.a = qrScanOrCardActivity0;
    }

    @Override  // androidx.lifecycle.ViewModelProvider$Factory
    public final ViewModel a(Class class0) {
        j.f(class0, "modelClass");
        QrScanOrCardActivity qrScanOrCardActivity0 = this.a;
        R6 r60 = r1.b(qrScanOrCardActivity0).a();
        Parcelable parcelable0 = qrScanOrCardActivity0.getIntent().getParcelableExtra("com.wave.typeSafeExtras");
        if(parcelable0 == null) {
            throw new Exception(QrScanOrCardActivity.class.getName() + " invoked with no params");
        }
        return new o2(r60, ((QrScanOrCardParams)parcelable0), r1.b(qrScanOrCardActivity0).e());
    }

    @Override  // androidx.lifecycle.ViewModelProvider$Factory
    public final ViewModel b(e e0, MutableCreationExtras mutableCreationExtras0) {
        return o.a(this, e0, mutableCreationExtras0);
    }

    @Override  // androidx.lifecycle.ViewModelProvider$Factory
    public final ViewModel c(Class class0, CreationExtras creationExtras0) {
        return o.b(this, class0, creationExtras0);
    }
}

