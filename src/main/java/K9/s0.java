package K9;

import Aa.x;
import E9.b;
import Nb.e;
import Nb.j;
import X8.f;
import Y8.R6;
import Y8.o;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import com.sendwave.util.Country;
import com.wave.components.sendmoney.SendMoneySelectParams;
import q9.C3;
import q9.r1;

public final class s0 implements Factory {
    public final t0 a;
    public final SendMoneySelectParams b;

    public s0(t0 t00, SendMoneySelectParams sendMoneySelectParams0) {
        this.a = t00;
        this.b = sendMoneySelectParams0;
    }

    @Override  // androidx.lifecycle.ViewModelProvider$Factory
    public final ViewModel a(Class class0) {
        j.f(class0, "modelClass");
        R6 r60 = r1.b(this.a).a();
        C3 c30 = r1.b(this.a);
        Country country0 = r1.b(this.a).k();
        c30.q0.getClass();
        j.f(this.b.Y, "filterOnCountries");
        f f0 = new f(this.a, country0, this.b.Y, this.b.Z);
        x x0 = new x(6, this.a);
        b b0 = new b(r1.b(this.a).e(), "send", "send contact select");
        return new J0(r60, f0, this.b, x0, b0);
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

