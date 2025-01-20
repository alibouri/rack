package R9;

import Ab.o;
import C3.i;
import Nb.e;
import Nb.j;
import W4.f;
import Y8.R6;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import com.wave.customer.QrScanOrCardActivity;
import com.wave.customer.QrScanOrCardParams;

public final class f2 implements Factory {
    public final QrScanOrCardActivity a;
    public final QrScanOrCardParams b;

    public f2(QrScanOrCardActivity qrScanOrCardActivity0, QrScanOrCardParams qrScanOrCardParams0) {
        this.a = qrScanOrCardActivity0;
        this.b = qrScanOrCardParams0;
    }

    @Override  // androidx.lifecycle.ViewModelProvider$Factory
    public final ViewModel a(Class class0) {
        j.f(class0, "modelClass");
        o o0 = f.A(new e2(this.a, 0));
        i i0 = new i(this.a);
        return new S(((R6)o0.getValue()), this.b, i0);
    }

    @Override  // androidx.lifecycle.ViewModelProvider$Factory
    public final ViewModel b(e e0, MutableCreationExtras mutableCreationExtras0) {
        return Y8.o.a(this, e0, mutableCreationExtras0);
    }

    @Override  // androidx.lifecycle.ViewModelProvider$Factory
    public final ViewModel c(Class class0, CreationExtras creationExtras0) {
        return Y8.o.b(this, class0, creationExtras0);
    }
}

