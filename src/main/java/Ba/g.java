package Ba;

import Nb.e;
import Nb.j;
import Y8.o;
import android.os.Parcelable;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import com.wave.customer.savings.deposit.DepositSavingsActivity;
import com.wave.customer.savings.deposit.DepositSavingsParams;
import q9.r1;

public final class g implements Factory {
    public final DepositSavingsActivity a;

    public g(DepositSavingsActivity depositSavingsActivity0) {
        this.a = depositSavingsActivity0;
    }

    @Override  // androidx.lifecycle.ViewModelProvider$Factory
    public final ViewModel a(Class class0) {
        j.f(class0, "modelClass");
        DepositSavingsActivity depositSavingsActivity0 = this.a;
        Parcelable parcelable0 = depositSavingsActivity0.getIntent().getParcelableExtra("com.wave.typeSafeExtras");
        if(parcelable0 == null) {
            throw new Exception(DepositSavingsActivity.class.getName() + " invoked with no params");
        }
        return new q(((DepositSavingsParams)parcelable0), r1.b(depositSavingsActivity0).a(), r1.b(depositSavingsActivity0).f());
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

