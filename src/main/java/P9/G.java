package p9;

import Nb.e;
import Nb.j;
import Y8.R6;
import Y8.o;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import com.sendwave.shared.paybill.AddFavoriteParams;

public final class g implements Factory {
    public final R6 a;
    public final AddFavoriteParams b;

    public g(R6 r60, AddFavoriteParams addFavoriteParams0) {
        this.a = r60;
        this.b = addFavoriteParams0;
    }

    @Override  // androidx.lifecycle.ViewModelProvider$Factory
    public final ViewModel a(Class class0) {
        j.f(class0, "modelClass");
        return new u(this.a, this.b);
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

