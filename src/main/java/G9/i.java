package g9;

import W4.f;
import java.math.BigDecimal;
import java.util.Map;

public abstract class i extends j {
    public final int b;

    public i(int v) {
        this.b = 1;
        super(v);
    }

    public i(int v, byte b) {
        this.b = v;
        super();
    }

    @Override  // g9.j
    public final BigDecimal b(f[] arr_f, Map map0) {
        if(this.b != 0) {
            BigDecimal[] arr_bigDecimal = new BigDecimal[arr_f.length];
            for(int v = 0; v < arr_f.length; ++v) {
                arr_bigDecimal[v] = arr_f[v].v(map0);
            }
            return this.d(arr_bigDecimal);
        }
        BigDecimal bigDecimal0 = arr_f[0].v(map0);
        int v1 = 1;
        while(v1 < arr_f.length) {
            BigDecimal bigDecimal1 = arr_f[v1].v(map0);
            if(!this.c(bigDecimal0, bigDecimal1)) {
                return BigDecimal.ZERO;
            }
            ++v1;
            bigDecimal0 = bigDecimal1;
        }
        return BigDecimal.ONE;
    }

    public abstract boolean c(BigDecimal arg1, BigDecimal arg2);

    public abstract BigDecimal d(BigDecimal[] arg1);
}

