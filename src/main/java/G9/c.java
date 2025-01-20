package g9;

import java.math.BigDecimal;

public final class c extends i {
    public final int c;

    public c(int v) {
        this.c = v;
        super(0, 0);
    }

    @Override  // g9.i
    public final boolean c(BigDecimal bigDecimal0, BigDecimal bigDecimal1) {
        switch(this.c) {
            case 0: {
                return bigDecimal0.compareTo(bigDecimal1) < 0;
            }
            case 1: {
                return bigDecimal0.compareTo(bigDecimal1) <= 0;
            }
            case 2: {
                return bigDecimal0.compareTo(bigDecimal1) > 0;
            }
            case 3: {
                return bigDecimal0.compareTo(bigDecimal1) >= 0;
            }
            default: {
                return bigDecimal0.compareTo(bigDecimal1) == 0;
            }
        }
    }
}

