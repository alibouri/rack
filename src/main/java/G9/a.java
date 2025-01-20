package g9;

import W4.f;
import java.math.BigDecimal;
import java.util.Map;

public final class a extends f {
    public final int X;
    public Object Y;

    public a(int v) {
        this.X = v;
        super();
    }

    @Override  // W4.f
    public final BigDecimal v(Map map0) {
        if(this.X != 0) {
            String s = (String)this.Y;
            BigDecimal bigDecimal0 = (BigDecimal)map0.get(s);
            if(bigDecimal0 == null) {
                throw new g(s);  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
            }
            return BigDecimal.ZERO.add(bigDecimal0, h.b0);
        }
        return (BigDecimal)this.Y;
    }
}

