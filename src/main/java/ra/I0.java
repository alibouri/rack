package ra;

import com.sendwave.backend.type.Currency.CFA;
import com.sendwave.models.CurrencyAmount;
import java.math.BigDecimal;

public final class i0 {
    public static final i0 a;
    public static final CurrencyAmount b;

    static {
        i0.a = new i0();  // initializer: Ljava/lang/Object;-><init>()V
        i0.b = new CurrencyAmount(CFA.X, BigDecimal.ZERO);
    }
}

