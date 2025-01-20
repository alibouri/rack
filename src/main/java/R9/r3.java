package R9;

import Y8.N;
import f9.d;
import q9.r1;

public final class r3 extends d {
    public final String b;
    public final y3 c;

    public r3(y3 y30) {
        this.c = y30;
        this.b = r1.d(0x7F1201A3, new Object[0]);  // string:forgot_q "Forgot?"
    }

    @Override  // f9.d
    public final String a() {
        return this.b;
    }

    @Override  // f9.d
    public final void d() {
        this.c.d0.d("click forgot button", null);
        q3 q30 = new q3(this.c, null);
        N.k(this.c, this.c.g0, true, q30);
    }
}

