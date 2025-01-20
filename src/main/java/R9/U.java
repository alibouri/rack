package R9;

import K9.q;
import androidx.lifecycle.ViewModelProvider;
import com.wave.customer.BuyAirtimeSelectActivity;
import kotlin.jvm.functions.Function0;

public final class u implements Function0 {
    public final int X;
    public final BuyAirtimeSelectActivity Y;

    public u(BuyAirtimeSelectActivity buyAirtimeSelectActivity0, int v) {
        this.X = v;
        this.Y = buyAirtimeSelectActivity0;
        super();
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BuyAirtimeSelectActivity buyAirtimeSelectActivity0 = this.Y;
        if(this.X != 0) {
            return new q(((M)buyAirtimeSelectActivity0.G0.getValue()).d0, buyAirtimeSelectActivity0);
        }
        Object object0 = (M)new ViewModelProvider(buyAirtimeSelectActivity0, new y(buyAirtimeSelectActivity0)).a(M.class);
        object0.b0.c(buyAirtimeSelectActivity0, buyAirtimeSelectActivity0.J0);
        return object0;
    }
}

