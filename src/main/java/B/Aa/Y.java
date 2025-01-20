package Aa;

import E9.a;
import Nb.e;
import Nb.j;
import Y8.R6;
import Y8.o;
import android.os.Parcelable;
import android.text.format.DateFormat;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import com.sendwave.util.Country;
import com.wave.customer.savings.SavingsActivity;
import com.wave.customer.savings.SavingsParams;
import q9.C3;
import q9.n;
import q9.r1;

public final class y implements Factory {
    public final SavingsActivity a;

    public y(SavingsActivity savingsActivity0) {
        this.a = savingsActivity0;
    }

    @Override  // androidx.lifecycle.ViewModelProvider$Factory
    public final ViewModel a(Class class0) {
        j.f(class0, "modelClass");
        SavingsActivity savingsActivity0 = this.a;
        x x0 = new x(0, savingsActivity0);
        Parcelable parcelable0 = savingsActivity0.getIntent().getParcelableExtra("com.wave.typeSafeExtras");
        if(parcelable0 == null) {
            throw new Exception(SavingsActivity.class.getName() + " invoked with no params");
        }
        R6 r60 = r1.b(savingsActivity0).a();
        a a0 = r1.b(savingsActivity0).e();
        n n0 = r1.b(savingsActivity0).j();
        boolean z = DateFormat.is24HourFormat(savingsActivity0);
        Country country0 = r1.b(savingsActivity0).k();
        v v0 = new v(3, r1.b(savingsActivity0), C3.class, "supportCallerProvider", "supportCallerProvider(Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/sendwave/util/supportChannels/ContactSupportFlowName;Lkotlinx/coroutines/CoroutineScope;)Lcom/wave/voip/SupportCaller;", 0, 0);
        return new u0(((SavingsParams)parcelable0), r60, a0, n0, x0, z, country0, new w(2, r1.b(savingsActivity0), C3.class, "canOpenDeepLink", "canOpenDeepLink(Ljava/lang/String;Ljava/lang/String;)Z", 0, 0), v0);
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

