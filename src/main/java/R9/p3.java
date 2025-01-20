package R9;

import Aa.w;
import Nb.e;
import Nb.j;
import Y8.R6;
import Y8.o;
import android.content.Context;
import android.os.Parcelable;
import android.text.format.DateFormat;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import com.wave.customer.VerifyPinActivity;
import com.wave.customer.VerifyPinParams;
import q9.C3;
import q9.r1;
import q9.v2;

public final class p3 implements Factory {
    public final VerifyPinActivity a;

    public p3(VerifyPinActivity verifyPinActivity0) {
        this.a = verifyPinActivity0;
    }

    @Override  // androidx.lifecycle.ViewModelProvider$Factory
    public final ViewModel a(Class class0) {
        j.f(class0, "modelClass");
        VerifyPinActivity verifyPinActivity0 = this.a;
        verifyPinActivity0.getClass();
        R6 r60 = r1.b(verifyPinActivity0).q();
        Context context0 = verifyPinActivity0.getApplicationContext();
        j.e(context0, "getApplicationContext(...)");
        v2 v20 = new v2(context0);
        Parcelable parcelable0 = verifyPinActivity0.getIntent().getParcelableExtra("com.wave.typeSafeExtras");
        if(parcelable0 == null) {
            throw new Exception(VerifyPinActivity.class.getName() + " invoked with no params");
        }
        return new y3(r60, v20, ((VerifyPinParams)parcelable0), r1.b(verifyPinActivity0).k(), r1.b(verifyPinActivity0).e(), new w(2, r1.b(verifyPinActivity0), C3.class, "canOpenDeepLink", "canOpenDeepLink(Ljava/lang/String;Ljava/lang/String;)Z", 0, 7), DateFormat.is24HourFormat(verifyPinActivity0));
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

