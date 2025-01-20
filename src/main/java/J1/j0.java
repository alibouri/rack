package J1;

import T4.l;
import androidx.core.view.WindowInsetsCompat;
import z1.b;

public abstract class j0 {
    public final WindowInsetsCompat a;
    public b[] b;

    public j0() {
        this(new WindowInsetsCompat());
    }

    public j0(WindowInsetsCompat windowInsetsCompat0) {
        this.a = windowInsetsCompat0;
    }

    public final void a() {
        b[] arr_b = this.b;
        if(arr_b != null) {
            b b0 = arr_b[0];
            b b1 = arr_b[1];
            WindowInsetsCompat windowInsetsCompat0 = this.a;
            if(b1 == null) {
                b1 = windowInsetsCompat0.a.f(2);
            }
            if(b0 == null) {
                b0 = windowInsetsCompat0.a.f(1);
            }
            this.g(b.a(b0, b1));
            b[] arr_b1 = this.b;
            b b2 = arr_b1[l.N(16)];
            if(b2 != null) {
                this.f(b2);
            }
            b[] arr_b2 = this.b;
            b b3 = arr_b2[l.N(0x20)];
            if(b3 != null) {
                this.d(b3);
            }
            b[] arr_b3 = this.b;
            b b4 = arr_b3[l.N(0x40)];
            if(b4 != null) {
                this.h(b4);
            }
        }
    }

    public abstract WindowInsetsCompat b();

    public void c(int v, b b0) {
        if(this.b == null) {
            this.b = new b[9];
        }
        for(int v1 = 1; v1 <= 0x100; v1 <<= 1) {
            if((v & v1) != 0) {
                b[] arr_b = this.b;
                arr_b[l.N(v1)] = b0;
            }
        }
    }

    public void d(b b0) {
    }

    public abstract void e(b arg1);

    public void f(b b0) {
    }

    public abstract void g(b arg1);

    public void h(b b0) {
    }
}

