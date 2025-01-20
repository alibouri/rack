package ea;

import E9.a;
import Nb.e;
import Nb.j;
import Y8.R6;
import Y8.o;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import com.wave.customer.devicemanagement.DeviceManagementActivity;
import q9.r1;

public final class c implements Factory {
    public final R6 a;
    public final DeviceManagementActivity b;

    public c(R6 r60, DeviceManagementActivity deviceManagementActivity0) {
        this.a = r60;
        this.b = deviceManagementActivity0;
    }

    @Override  // androidx.lifecycle.ViewModelProvider$Factory
    public final ViewModel a(Class class0) {
        j.f(class0, "modelClass");
        this.b.getClass();
        a a0 = r1.b(this.b).e();
        return new k(this.a, a0);
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

