package g9;

import java.math.BigDecimal;
import java.math.RoundingMode;

public final class f extends i {
    public final RoundingMode c;

    public f(RoundingMode roundingMode0) {
        this.c = roundingMode0;
        super(2);
    }

    @Override  // g9.i
    public final BigDecimal d(BigDecimal[] arr_bigDecimal) {
        return arr_bigDecimal[0].divide(arr_bigDecimal[1], h.b0).setScale(0, this.c).multiply(arr_bigDecimal[1], h.b0);
    }
}

