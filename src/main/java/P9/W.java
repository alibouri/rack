package p9;

import Nb.e;
import Nb.j;
import Y8.o;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import com.sendwave.shared.paybill.AddOnsFieldSelectWithToggleActivity;
import com.sendwave.shared.paybill.AddOnsFieldSelectWithToggleParams;
import ha.a0;

public final class w implements Factory {
    public final AddOnsFieldSelectWithToggleParams a;
    public final AddOnsFieldSelectWithToggleActivity b;

    public w(AddOnsFieldSelectWithToggleParams addOnsFieldSelectWithToggleParams0, AddOnsFieldSelectWithToggleActivity addOnsFieldSelectWithToggleActivity0) {
        this.a = addOnsFieldSelectWithToggleParams0;
        this.b = addOnsFieldSelectWithToggleActivity0;
    }

    @Override  // androidx.lifecycle.ViewModelProvider$Factory
    public final ViewModel a(Class class0) {
        j.f(class0, "modelClass");
        a0 a00 = new a0(0, this.b, AddOnsFieldSelectWithToggleActivity.class, "refreshAddOnView", "refreshAddOnView()V", 0, 25);
        return new U(this.a, this.b.G0, a00);
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

