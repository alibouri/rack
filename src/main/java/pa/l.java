package pa;

import E9.a;
import Nb.e;
import Nb.j;
import Y8.o;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import com.wave.customer.nearbyagents.NearbyAgentsActivity;
import g3.b;
import q9.r1;

public final class l implements Factory {
    public final b a;
    public final NearbyAgentsActivity b;

    public l(b b0, NearbyAgentsActivity nearbyAgentsActivity0) {
        this.a = b0;
        this.b = nearbyAgentsActivity0;
    }

    @Override  // androidx.lifecycle.ViewModelProvider$Factory
    public final ViewModel a(Class class0) {
        j.f(class0, "modelClass");
        this.b.getClass();
        a a0 = r1.b(this.b).e();
        return new D(this.a, a0);
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

