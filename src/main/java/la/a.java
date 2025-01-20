package la;

import Nb.e;
import Nb.j;
import Y8.R6;
import Y8.o;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import com.wave.customer.limits.AccountLimitsParams;
import q9.C3;

public final class a implements Factory {
    public final R6 a;
    public final AccountLimitsParams b;
    public final C3 c;

    public a(R6 r60, AccountLimitsParams accountLimitsParams0, C3 c30) {
        this.a = r60;
        this.b = accountLimitsParams0;
        this.c = c30;
    }

    @Override  // androidx.lifecycle.ViewModelProvider$Factory
    public final ViewModel a(Class class0) {
        j.f(class0, "modelClass");
        E9.a a0 = this.c.e();
        return new la.j(this.a, this.b, a0);
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

