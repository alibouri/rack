package K9;

import Bb.z;
import Nb.e;
import Nb.j;
import Y8.R6;
import Y8.o;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import com.sendwave.util.Country;
import com.wave.components.sendmoney.SendMoneyEnterContactActivity;
import com.wave.components.sendmoney.SendMoneyEnterContactParams;
import q9.r1;

public final class l0 implements Factory {
    public final SendMoneyEnterContactActivity a;
    public final SendMoneyEnterContactParams b;

    public l0(SendMoneyEnterContactActivity sendMoneyEnterContactActivity0, SendMoneyEnterContactParams sendMoneyEnterContactParams0) {
        this.a = sendMoneyEnterContactActivity0;
        this.b = sendMoneyEnterContactParams0;
    }

    @Override  // androidx.lifecycle.ViewModelProvider$Factory
    public final ViewModel a(Class class0) {
        j.f(class0, "modelClass");
        R6 r60 = r1.b(this.a).a();
        Country country0 = r1.b(this.a).k();
        j.e("Send Money", "getString(...)");
        return new i(r60, country0, this.b.X, this.b.Y, "Send Money", this.b.b0, z.X);
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

