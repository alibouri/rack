package R9;

import Nb.e;
import Nb.j;
import X8.f;
import Y8.R6;
import Y8.o;
import android.os.Parcelable;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import com.sendwave.util.Country;
import com.wave.customer.BuyAirtimeSelectActivity;
import com.wave.customer.BuyAirtimeSelectParams;
import com.wave.customer.CustomerApp;
import java.util.Set;
import yc.d;

public final class y implements Factory {
    public final BuyAirtimeSelectActivity a;

    public y(BuyAirtimeSelectActivity buyAirtimeSelectActivity0) {
        this.a = buyAirtimeSelectActivity0;
    }

    @Override  // androidx.lifecycle.ViewModelProvider$Factory
    public final ViewModel a(Class class0) {
        j.f(class0, "modelClass");
        CustomerApp customerApp0 = Z0.a(this.a);
        R6 r60 = customerApp0.a();
        Country country0 = customerApp0.k();
        Set set0 = d.C(country0);
        customerApp0.q0.getClass();
        f f0 = new f(this.a, country0, set0, false);
        Parcelable parcelable0 = this.a.getIntent().getParcelableExtra("com.wave.typeSafeExtras");
        if(parcelable0 == null) {
            throw new Exception(BuyAirtimeSelectActivity.class.getName() + " invoked with no params");
        }
        return new M(r60, f0, ((BuyAirtimeSelectParams)parcelable0), customerApp0.e());
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

