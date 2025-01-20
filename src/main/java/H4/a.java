package h4;

import java.io.IOException;
import l4.l;

public final class a {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    public a(byte[] arr_b) {
        if(arr_b.length == 0x20) {
            l l0 = new l(0, arr_b);
            try {
                this.a = l0.i();
                this.b = l0.i();
                this.c = l0.i();
                this.d = l0.i();
                this.e = l0.i();
                this.f = l0.i();
                this.g = l0.i();
                this.h = l0.i();
                return;
            }
            catch(IOException iOException0) {
                throw new h(null, iOException0);  // initializer: Ll4/e;-><init>(Ljava/lang/String;Ljava/io/IOException;)V
            }
        }
        throw new h("Invalid number of bytes", null);  // initializer: Ll4/e;-><init>(Ljava/lang/String;Ljava/io/IOException;)V
    }
}

