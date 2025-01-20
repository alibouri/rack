package da;

import E9.a;
import Nb.e;
import Nb.j;
import Y8.R6;
import Y8.o;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import com.wave.customer.deviceapproval.DeviceApprovalRequiredActivity;
import q9.o0;
import q9.r1;

public final class h implements Factory {
    public final DeviceApprovalRequiredActivity a;

    public h(DeviceApprovalRequiredActivity deviceApprovalRequiredActivity0) {
        this.a = deviceApprovalRequiredActivity0;
    }

    @Override  // androidx.lifecycle.ViewModelProvider$Factory
    public final ViewModel a(Class class0) {
        j.f(class0, "modelClass");
        this.a.getClass();
        R6 r60 = r1.b(this.a).q();
        a a0 = r1.b(this.a).e();
        String s = o0.u(this.a.getApplicationContext());
        j.e(s, "getID(...)");
        return new q(r60, a0, s, r1.b(this.a).k().j0);
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

