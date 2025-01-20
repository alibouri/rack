package R9;

import G9.c;
import Nb.e;
import Nb.j;
import Y8.R6;
import Y8.o;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import com.wave.customer.BuyAirtimeDialogActivity;
import com.wave.customer.BuyAirtimeDialogParams;
import com.wave.customer.CustomerApp;
import q9.r1;

public final class f implements Factory {
    public final R6 a;
    public final BuyAirtimeDialogParams b;
    public final X8.f c;
    public final BuyAirtimeDialogActivity d;

    public f(R6 r60, BuyAirtimeDialogParams buyAirtimeDialogParams0, X8.f f0, BuyAirtimeDialogActivity buyAirtimeDialogActivity0) {
        this.a = r60;
        this.b = buyAirtimeDialogParams0;
        this.c = f0;
        this.d = buyAirtimeDialogActivity0;
    }

    @Override  // androidx.lifecycle.ViewModelProvider$Factory
    public final ViewModel a(Class class0) {
        j.f(class0, "modelClass");
        this.d.getClass();
        CustomerApp customerApp0 = (CustomerApp)r1.b(this.d);
        c c0 = r1.b(this.d).f();
        return new q(this.a, this.b, this.c, customerApp0.C0, c0);
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

