package K9;

import android.os.Parcelable;
import androidx.lifecycle.ViewModelProvider;
import com.wave.components.sendmoney.SendMoneySelectParams;
import kotlin.jvm.functions.Function0;

public final class n0 implements Function0 {
    public final int X;
    public final t0 Y;

    public n0(t0 t00, int v) {
        this.X = v;
        this.Y = t00;
        super();
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if(this.X != 0) {
            return new q(this.Y.I().j0, this.Y);
        }
        t0 t00 = this.Y;
        Parcelable parcelable0 = t00.getIntent().getParcelableExtra("com.wave.typeSafeExtras");
        if(parcelable0 == null) {
            throw new Exception(t00.getClass().getName() + " invoked with no params");
        }
        Object object0 = (J0)new ViewModelProvider(t00, new s0(t00, ((SendMoneySelectParams)parcelable0))).a(J0.class);
        object0.d0.c(t00, t00.J0);
        return object0;
    }
}

