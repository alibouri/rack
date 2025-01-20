package J1;

import android.os.Build.VERSION;
import android.view.View;
import androidx.core.view.WindowInsetsCompat;
import java.util.Objects;
import z1.b;

public class p0 {
    public final WindowInsetsCompat a;
    public static final WindowInsetsCompat b;

    static {
        h0 h00;
        int v = Build.VERSION.SDK_INT;
        if(v >= 30) {
            h00 = new i0();
        }
        else if(v >= 29) {
            h00 = new h0();
        }
        else {
            h00 = new f0();
        }
        p0.b = h00.b().a.a().a.b().a.c();
    }

    public p0(WindowInsetsCompat windowInsetsCompat0) {
        this.a = windowInsetsCompat0;
    }

    public WindowInsetsCompat a() {
        return this.a;
    }

    public WindowInsetsCompat b() {
        return this.a;
    }

    public WindowInsetsCompat c() {
        return this.a;
    }

    public void d(View view0) {
    }

    public h e() {
        return null;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof p0 ? this.o() == ((p0)object0).o() && this.n() == ((p0)object0).n() && Objects.equals(this.k(), ((p0)object0).k()) && Objects.equals(this.i(), ((p0)object0).i()) && Objects.equals(this.e(), ((p0)object0).e()) : false;
    }

    public b f(int v) {
        return b.e;
    }

    public b g(int v) {
        if((v & 8) != 0) {
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }
        return b.e;
    }

    public b h() {
        return this.k();
    }

    @Override
    public int hashCode() {
        b b0 = this.k();
        b b1 = this.i();
        return Objects.hash(new Object[]{Boolean.valueOf(this.o()), Boolean.valueOf(this.n()), b0, b1, this.e()});
    }

    public b i() {
        return b.e;
    }

    public b j() {
        return this.k();
    }

    public b k() {
        return b.e;
    }

    public b l() {
        return this.k();
    }

    public WindowInsetsCompat m(int v, int v1, int v2, int v3) {
        return p0.b;
    }

    public boolean n() {
        return false;
    }

    public boolean o() {
        return false;
    }

    public boolean p(int v) {
        return true;
    }

    public void q(b[] arr_b) {
    }

    public void r(WindowInsetsCompat windowInsetsCompat0) {
    }

    public void s(b b0) {
    }
}

