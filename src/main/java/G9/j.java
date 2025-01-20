package g9;

import W4.f;
import java.math.BigDecimal;
import java.util.Map;

public abstract class j {
    public Integer a;

    public j() {
        this.a = null;
    }

    public j(int v) {
        this.a = null;
        this.a = v;
    }

    public final k a(f[] arr_f) {
        k k0 = new k();  // initializer: Ljava/lang/Object;-><init>()V
        k0.Y = this;
        if(this.a != null && arr_f.length != ((int)this.a)) {
            throw new g("Expected " + this.a + " args, got " + arr_f.length);  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
        }
        k0.X = arr_f;
        return k0;
    }

    public abstract BigDecimal b(f[] arg1, Map arg2);
}

