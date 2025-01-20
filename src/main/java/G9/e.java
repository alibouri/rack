package g9;

import java.math.BigDecimal;

public final class e extends i {
    public final int c;

    public e() {
        this.c = 3;
        super(1, 0);
    }

    public e(int v, int v1) {
        this.c = v1;
        super(v);
    }

    @Override  // g9.i
    public final BigDecimal d(BigDecimal[] arr_bigDecimal) {
        switch(this.c) {
            case 0: {
                return arr_bigDecimal[0].subtract(arr_bigDecimal[1], h.b0);
            }
            case 1: {
                try {
                    return arr_bigDecimal[0].divide(arr_bigDecimal[1], h.b0);
                }
                catch(ArithmeticException unused_ex) {
                    throw new g("Divide by zero");  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                }
            }
            case 2: {
                try {
                    return arr_bigDecimal[0].divideAndRemainder(arr_bigDecimal[1], h.b0)[1];
                }
                catch(ArithmeticException unused_ex) {
                    throw new g("Divide by zero");  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                }
            }
            default: {
                if(!new BigDecimal(arr_bigDecimal[1].intValue()).equals(arr_bigDecimal[1])) {
                    throw new g("Non-integer exponent " + arr_bigDecimal[1].toString());  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                }
                if(arr_bigDecimal[1].intValue() == 0 && arr_bigDecimal[0].compareTo(BigDecimal.ZERO) == 0) {
                    throw new g("0 ^ 0");  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                }
                return arr_bigDecimal[0].pow(arr_bigDecimal[1].intValue(), h.b0);
            }
        }
    }
}

