package g9;

import java.math.BigDecimal;

public final class d extends i {
    public final BigDecimal c;
    public final int d;

    public d(BigDecimal bigDecimal0, int v) {
        this.d = v;
        super(1, 0);
        this.c = bigDecimal0;
    }

    @Override  // g9.i
    public final BigDecimal d(BigDecimal[] arr_bigDecimal) {
        BigDecimal bigDecimal0 = this.c;
        for(int v = 0; v < arr_bigDecimal.length; ++v) {
            BigDecimal bigDecimal1 = arr_bigDecimal[v];
            switch(this.d) {
                case 0: {
                    bigDecimal0 = bigDecimal0.add(bigDecimal1, h.b0);
                    break;
                }
                case 1: {
                    bigDecimal0 = bigDecimal0.multiply(bigDecimal1, h.b0);
                    break;
                }
                case 2: {
                    bigDecimal0 = bigDecimal0.min(bigDecimal1);
                    break;
                }
                default: {
                    bigDecimal0 = bigDecimal0.max(bigDecimal1);
                }
            }
        }
        return bigDecimal0;
    }
}

