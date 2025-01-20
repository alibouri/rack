package g9;

import W4.f;
import java.math.BigDecimal;
import java.util.Map;

public final class b extends j {
    public final int b;

    public b(int v) {
        this.b = 0;
        super(v);
    }

    public b(int v, byte b) {
        this.b = v;
        super();
    }

    @Override  // g9.j
    public final BigDecimal b(f[] arr_f, Map map0) {
        switch(this.b) {
            case 0: {
                return arr_f[0].v(map0).equals(BigDecimal.ZERO) ? arr_f[2].v(map0) : arr_f[1].v(map0);
            }
            case 1: {
                BigDecimal bigDecimal1 = BigDecimal.ONE;
                for(int v1 = 0; v1 < arr_f.length; ++v1) {
                    bigDecimal1 = arr_f[v1].v(map0);
                    BigDecimal bigDecimal2 = BigDecimal.ZERO;
                    if(bigDecimal1.compareTo(bigDecimal2) == 0) {
                        return bigDecimal2;
                    }
                }
                return bigDecimal1;
            }
            default: {
                int v = 0;
                while(v < arr_f.length) {
                    BigDecimal bigDecimal0 = arr_f[v].v(map0);
                    if(bigDecimal0.compareTo(BigDecimal.ZERO) == 0) {
                        ++v;
                        continue;
                    }
                    return bigDecimal0;
                }
                return BigDecimal.ZERO;
            }
        }
    }
}

