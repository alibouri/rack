package h4;

import java.io.IOException;
import l4.l;

public final class f {
    public final int a;
    public final int b;
    public final byte c;
    public final e d;
    public final byte e;
    public final byte f;
    public final byte g;

    public f(byte[] arr_b) {
        if(arr_b.length == 13) {
            l l0 = new l(0, arr_b);
            try {
                this.a = l0.i();
                this.b = l0.i();
                this.c = l0.a();
                this.d = e.a(l0.a());
                this.e = l0.a();
                this.f = l0.a();
                this.g = l0.a();
                return;
            }
            catch(IOException iOException0) {
                throw new h(null, iOException0);  // initializer: Ll4/e;-><init>(Ljava/lang/String;Ljava/io/IOException;)V
            }
        }
        throw new h("PNG header chunk must have 13 data bytes", null);  // initializer: Ll4/e;-><init>(Ljava/lang/String;Ljava/io/IOException;)V
    }
}

