package sa;

import E9.b;
import Nb.e;
import Nb.j;
import R9.Z0;
import Y8.o;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import com.wave.customer.CustomerApp;
import com.wave.customer.paymentcards.recharge.RechargeCardActivity;
import q9.r1;

public final class f implements Factory {
    public final RechargeCardActivity a;

    public f(RechargeCardActivity rechargeCardActivity0) {
        this.a = rechargeCardActivity0;
    }

    @Override  // androidx.lifecycle.ViewModelProvider$Factory
    public final ViewModel a(Class class0) {
        j.f(class0, "modelClass");
        CustomerApp customerApp0 = Z0.a(this.a);
        b b0 = new b(r1.b(this.a).e(), "virtual card", "virtual card recharge");
        return new m(customerApp0.H0, b0);
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

