package R9;

import Bb.q;
import K9.i;
import Nb.e;
import Nb.j;
import Y8.R6;
import Y8.o;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import com.sendwave.util.Country;
import com.wave.customer.BuyAirtimeEnterContactActivity;
import com.wave.customer.BuyAirtimeEnterContactParams;
import java.util.List;
import q9.r1;

public final class s implements Factory {
    public final BuyAirtimeEnterContactActivity a;
    public final Country b;
    public final BuyAirtimeEnterContactParams c;

    public s(BuyAirtimeEnterContactActivity buyAirtimeEnterContactActivity0, Country country0, BuyAirtimeEnterContactParams buyAirtimeEnterContactParams0) {
        this.a = buyAirtimeEnterContactActivity0;
        this.b = country0;
        this.c = buyAirtimeEnterContactParams0;
    }

    @Override  // androidx.lifecycle.ViewModelProvider$Factory
    public final ViewModel a(Class class0) {
        j.f(class0, "modelClass");
        R6 r60 = r1.b(this.a).a();
        j.e("Buy Airtime", "getString(...)");
        List list0 = q.K(this.b);
        return new i(r60, this.b, this.c.X, this.c.Y, "Buy Airtime", list0, this.c.c0);
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

