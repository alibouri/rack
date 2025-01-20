package R9;

import E9.a;
import Nb.e;
import Nb.j;
import Y8.R6;
import Y8.o;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import com.wave.customer.CustomerApp;
import com.wave.customer.PaymentListParams;
import q9.n;

public final class p1 implements Factory {
    public final R6 a;
    public final PaymentListParams b;
    public final n c;
    public final CustomerApp d;

    public p1(R6 r60, PaymentListParams paymentListParams0, n n0, CustomerApp customerApp0) {
        this.a = r60;
        this.b = paymentListParams0;
        this.c = n0;
        this.d = customerApp0;
    }

    @Override  // androidx.lifecycle.ViewModelProvider$Factory
    public final ViewModel a(Class class0) {
        j.f(class0, "modelClass");
        a a0 = this.d.e();
        return new X1(this.a, this.b, this.c, a0);
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

