package g9;

import W4.f;
import cd.a;
import cd.b;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public final class h extends f implements b {
    public f X;
    public Object Y;
    public static final Pattern Z;
    public static final MathContext b0;
    public static final HashMap c0;

    static {
        h.Z = Pattern.compile("^[a-zA-Z_][a-zA-Z0-9_]*$");
        RoundingMode roundingMode0 = RoundingMode.HALF_EVEN;
        h.b0 = new MathContext(28, roundingMode0);
        HashMap hashMap0 = new HashMap();
        h.c0 = hashMap0;
        hashMap0.put("+", new d(BigDecimal.ZERO, 0));
        hashMap0.put("-", new e(2, 0));
        hashMap0.put("*", new d(BigDecimal.ONE, 1));
        hashMap0.put("/", new e(2, 1));
        hashMap0.put("%", new e(2, 2));
        e e0 = new e();
        e0.a = 2;
        hashMap0.put("^", e0);
        BigDecimal bigDecimal0 = BigDecimal.TEN;
        hashMap0.put("min", new d(bigDecimal0.pow(100), 2));
        hashMap0.put("max", new d(bigDecimal0.pow(100).negate(), 3));
        RoundingMode[] arr_roundingMode = {RoundingMode.CEILING, RoundingMode.FLOOR, roundingMode0};
        for(int v = 0; v < 3; ++v) {
            g9.f f0 = new g9.f(arr_roundingMode[v]);
            h.c0.put("round_" + new String[]{"up", "down", "even"}[v], f0);
        }
        g9.b b0 = new g9.b(3);
        h.c0.put("if", b0);
        g9.b b1 = new g9.b(1, 0);
        h.c0.put("and", b1);
        g9.b b2 = new g9.b(2, 0);
        h.c0.put("or", b2);
        c c0 = new c(0);
        h.c0.put("<", c0);
        c c1 = new c(1);
        h.c0.put("<=", c1);
        c c2 = new c(2);
        h.c0.put(">", c2);
        c c3 = new c(3);
        h.c0.put(">=", c3);
        c c4 = new c(4);
        h.c0.put("=", c4);
    }

    public static f S(Object object0) {
        if(object0 instanceof a) {
            a a0 = (a)object0;
            if(a0.size() >= 2) {
                try {
                    String s = (String)a0.get(0);
                    f[] arr_f = new f[a0.size() - 1];
                    for(int v = 1; v < a0.size(); ++v) {
                        arr_f[v - 1] = h.S(a0.get(v));
                    }
                    j j0 = (j)h.c0.get(s);
                    if(j0 == null) {
                        throw new g("Unknown function " + s);  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                    }
                    return j0.a(arr_f);
                }
                catch(ClassCastException unused_ex) {
                    throw new g("Expected string function name, got " + a0.get(0).toString());  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                }
            }
            throw new g("Function call " + a.d(a0) + " must take at least 1 argument");  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
        }
        if(object0 instanceof String) {
            String s1 = (String)object0;
            if(h.Z.matcher(s1).matches()) {
                f f0 = new g9.a(1);
                f0.Y = s1;
                return f0;
            }
            try {
                BigDecimal bigDecimal0 = new BigDecimal(s1, h.b0);
                f f1 = new g9.a(0);
                f1.Y = bigDecimal0;
                return f1;
            }
            catch(NumberFormatException numberFormatException0) {
                throw new g(numberFormatException0.getMessage());  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
            }
        }
        throw new g("Unexpected JSON object " + object0.toString());  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
    }

    @Override  // cd.b
    public final String c() {
        return P4.c.V(this.Y);
    }

    @Override  // W4.f
    public final BigDecimal v(Map map0) {
        return this.X.v(map0);
    }
}

