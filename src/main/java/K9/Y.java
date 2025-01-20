package K9;

import E9.b;
import G9.c;
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
import com.wave.components.sendmoney.SendMoneyDialogParams;
import com.wave.components.sendmoney.d;
import com.wave.customer.CustomerApp;
import q9.C3;

public final class y implements Factory {
    public final C3 a;
    public final SendMoneyDialogParams b;
    public final Country c;
    public final f d;

    public y(C3 c30, SendMoneyDialogParams sendMoneyDialogParams0, Country country0, f f0) {
        this.a = c30;
        this.b = sendMoneyDialogParams0;
        this.c = country0;
        this.d = f0;
    }

    @Override  // androidx.lifecycle.ViewModelProvider$Factory
    public final ViewModel a(Class class0) {
        j.f(class0, "modelClass");
        R6 r60 = this.a.a();
        b b0 = new b(this.a.e(), "send", "send amount");
        B9.f f0 = this.a.d();
        c c0 = this.a.f();
        return new d(r60, this.b, this.c, b0, ((CustomerApp)this.a).C0, this.d, f0, c0);
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

