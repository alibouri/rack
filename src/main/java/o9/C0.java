package o9;

import G9.c;
import Nb.e;
import Nb.j;
import Y8.R6;
import Y8.o;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import com.sendwave.shared.PayBillDialogActivity;
import com.sendwave.shared.PayBillDialogParams;
import com.wave.customer.CustomerApp;
import q9.n;
import q9.r1;

public final class c0 implements Factory {
    public final R6 a;
    public final PayBillDialogParams b;
    public final n c;
    public final PayBillDialogActivity d;

    public c0(R6 r60, PayBillDialogParams payBillDialogParams0, n n0, PayBillDialogActivity payBillDialogActivity0) {
        this.a = r60;
        this.b = payBillDialogParams0;
        this.c = n0;
        this.d = payBillDialogActivity0;
    }

    @Override  // androidx.lifecycle.ViewModelProvider$Factory
    public final ViewModel a(Class class0) {
        j.f(class0, "modelClass");
        this.d.getClass();
        CustomerApp customerApp0 = (CustomerApp)r1.b(this.d);
        c c0 = r1.b(this.d).f();
        r1.b(this.d);
        CustomerApp customerApp1 = (CustomerApp)r1.b(this.d);
        return new l0(this.a, this.b, this.c, customerApp0.I0, c0, customerApp1.C0);
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

