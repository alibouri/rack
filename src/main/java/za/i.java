package za;

import B9.f;
import Nb.e;
import Nb.j;
import Y8.R6;
import Y8.o;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import com.wave.customer.risk.ussdsecuritychallenge.UssdSecurityChallengeActivity;
import q9.r1;

public final class i implements Factory {
    public final UssdSecurityChallengeActivity a;

    public i(UssdSecurityChallengeActivity ussdSecurityChallengeActivity0) {
        this.a = ussdSecurityChallengeActivity0;
    }

    @Override  // androidx.lifecycle.ViewModelProvider$Factory
    public final ViewModel a(Class class0) {
        j.f(class0, "modelClass");
        return new z(((R6)this.a.F0.getValue()), r1.b(this.a).e(), r1.b(this.a).k(), ((f)this.a.G0.getValue()).h());
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

