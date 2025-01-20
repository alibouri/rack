package R9;

import Nb.e;
import Nb.j;
import Y8.R6;
import Y8.o;
import android.os.Parcelable;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import com.wave.customer.RecoverPinActivity;
import com.wave.customer.RecoverPinParams;

public final class p2 implements Factory {
    public final RecoverPinActivity a;

    public p2(RecoverPinActivity recoverPinActivity0) {
        this.a = recoverPinActivity0;
    }

    @Override  // androidx.lifecycle.ViewModelProvider$Factory
    public final ViewModel a(Class class0) {
        j.f(class0, "modelClass");
        R6 r60 = Z0.a(this.a).a();
        Parcelable parcelable0 = this.a.getIntent().getParcelableExtra("com.wave.typeSafeExtras");
        if(parcelable0 == null) {
            throw new Exception(RecoverPinActivity.class.getName() + " invoked with no params");
        }
        return new u2(r60, ((RecoverPinParams)parcelable0));
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

