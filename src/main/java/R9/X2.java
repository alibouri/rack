package R9;

import Nb.e;
import Nb.j;
import Y8.R6;
import Y8.o;
import android.content.Context;
import android.os.Parcelable;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import com.wave.customer.CustomerApp;
import com.wave.customer.ResetPinActivity;
import com.wave.customer.ResetPinParams;
import q9.v2;

public final class x2 implements Factory {
    public final ResetPinActivity a;

    public x2(ResetPinActivity resetPinActivity0) {
        this.a = resetPinActivity0;
    }

    @Override  // androidx.lifecycle.ViewModelProvider$Factory
    public final ViewModel a(Class class0) {
        j.f(class0, "modelClass");
        CustomerApp customerApp0 = Z0.a(this.a);
        R6 r60 = customerApp0.a();
        Context context0 = this.a.getApplicationContext();
        j.e(context0, "getApplicationContext(...)");
        v2 v20 = new v2(context0);
        Parcelable parcelable0 = this.a.getIntent().getParcelableExtra("com.wave.typeSafeExtras");
        if(parcelable0 == null) {
            throw new Exception(ResetPinActivity.class.getName() + " invoked with no params");
        }
        return new E2(r60, v20, ((ResetPinParams)parcelable0), customerApp0.e());
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

