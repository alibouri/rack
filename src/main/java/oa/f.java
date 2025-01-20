package oa;

import E9.a;
import Nb.e;
import Nb.j;
import Y8.R6;
import Y8.o;
import android.os.Parcelable;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import com.wave.customer.linkedaccounts.typeselect.LinkedAccountTypeSelectActivity;
import com.wave.customer.linkedaccounts.typeselect.LinkedAccountTypeSelectParams;
import q9.n;
import q9.r1;

public final class f implements Factory {
    public final R6 a;
    public final n b;
    public final LinkedAccountTypeSelectActivity c;

    public f(R6 r60, n n0, LinkedAccountTypeSelectActivity linkedAccountTypeSelectActivity0) {
        this.a = r60;
        this.b = n0;
        this.c = linkedAccountTypeSelectActivity0;
    }

    @Override  // androidx.lifecycle.ViewModelProvider$Factory
    public final ViewModel a(Class class0) {
        j.f(class0, "modelClass");
        LinkedAccountTypeSelectActivity linkedAccountTypeSelectActivity0 = this.c;
        Parcelable parcelable0 = linkedAccountTypeSelectActivity0.getIntent().getParcelableExtra("com.wave.typeSafeExtras");
        if(parcelable0 == null) {
            throw new Exception(LinkedAccountTypeSelectActivity.class.getName() + " invoked with no params");
        }
        a a0 = r1.b(linkedAccountTypeSelectActivity0).e();
        return new t(this.a, this.b, ((LinkedAccountTypeSelectParams)parcelable0), a0);
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

