package Ea;

import C3.i;
import E9.a;
import Nb.e;
import Nb.j;
import Y8.R6;
import Y8.o;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import com.wave.customer.scratchCardRewards.ScratchCardRewardsActivity;
import q9.T2;
import q9.r1;

public final class a0 implements Factory {
    public final ScratchCardRewardsActivity a;
    public final i b;

    public a0(ScratchCardRewardsActivity scratchCardRewardsActivity0, i i0) {
        this.a = scratchCardRewardsActivity0;
        this.b = i0;
    }

    @Override  // androidx.lifecycle.ViewModelProvider$Factory
    public final ViewModel a(Class class0) {
        j.f(class0, "modelClass");
        this.a.getClass();
        R6 r60 = r1.b(this.a).a();
        a a0 = r1.b(this.a).e();
        T2 t20 = new T2();  // initializer: Ljava/lang/Object;-><init>()V
        return new O0(r60, a0, this.b, t20);
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

