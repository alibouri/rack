package ca;

import Nb.j;
import R1.g;
import R9.c3;
import R9.e3;
import W4.f;
import Y8.N;
import ac.d0;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import bc.n;
import com.sendwave.components.KeypadView;
import com.sendwave.remit.util.CountryPhoneInputView;
import com.sendwave.util.Country;
import fa.a;
import fa.b;
import fa.c;
import o9.m0;
import q9.U0;

public final class b0 extends a0 implements c {
    public long A;
    public static final SparseIntArray B;
    public final M9.c x;
    public final a y;
    public final b z;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        b0.B = sparseIntArray0;
        sparseIntArray0.put(0x7F0A02B9, 6);  // id:spacer1
        sparseIntArray0.put(0x7F0A02BA, 7);  // id:spacer2
        sparseIntArray0.put(0x7F0A02BB, 8);  // id:spacer3
        sparseIntArray0.put(0x7F0A02BC, 9);  // id:spacer4
        sparseIntArray0.put(0x7F0A0197, 10);  // id:keypad
    }

    public b0(View view0) {
        Object[] arr_object = g.l(view0, 11, null, b0.B);
        ImageView imageView0 = (ImageView)arr_object[2];
        CountryPhoneInputView countryPhoneInputView0 = (CountryPhoneInputView)arr_object[4];
        KeypadView keypadView0 = (KeypadView)arr_object[10];
        Button button0 = (Button)arr_object[5];
        ConstraintLayout constraintLayout0 = (ConstraintLayout)arr_object[0];
        View view1 = (View)arr_object[6];
        View view2 = (View)arr_object[7];
        View view3 = (View)arr_object[8];
        View view4 = (View)arr_object[9];
        super(null, view0, imageView0, countryPhoneInputView0, button0, constraintLayout0, ((Toolbar)arr_object[1]), ((TextView)arr_object[3]));
        this.A = -1L;
        this.q.setTag(null);
        this.r.setTag(null);
        this.s.setTag(null);
        this.t.setTag(null);
        this.u.setTag(null);
        this.v.setTag(null);
        this.s(view0);
        this.x = new M9.c(3, 1, this);
        this.y = new a(this);
        this.z = new b(this);
        this.j();
    }

    @Override  // fa.c
    public final void a(View view0, int v) {
        e3 e30 = this.w;
        if(e30 != null) {
            c3 c30 = new c3(e30, null);
            N.k(e30, e30.i0, true, c30);
        }
    }

    @Override  // R1.g
    public final void f() {
        long v;
        boolean z;
        n n0;
        Country country0;
        d0 d00;
        String s1;
        synchronized(this) {
            v = this.A;
            this.A = 0L;
        }
        e3 e30 = this.w;
        int v1 = Long.compare(3L & v, 0L);
        String s = null;
        if(v1 == 0) {
            d00 = null;
            n0 = null;
            z = false;
            s1 = null;
        }
        else {
            if(e30 == null) {
                d00 = null;
                country0 = null;
                n0 = null;
                z = false;
                s1 = null;
            }
            else {
                s1 = e30.l0;
                d00 = e30.n0;
                country0 = e30.Z;
                n0 = e30.o0;
                z = e30.k0;
            }
            if(country0 != null) {
                s = country0.Y;
            }
        }
        if(v1 != 0) {
            U0.o(this.q, z);
            U0.h(this.r, s);
            j.f(this.r, "<this>");
            m0 m00 = new m0(6, this.r);
            U0.a(this.r, n0, m00);
            U0.b(this.s, d00);
            U0.o(this.u, z);
            f.M(this.v, s1);
        }
        if((v & 2L) != 0L) {
            j.f(this.r, "<this>");
            this.r.setCountryChangedListener(this.y);
            j.f(this.r, "<this>");
            this.r.setMobileChangedListener(this.z);
            this.s.setOnClickListener(this.x);
        }
    }

    @Override  // R1.g
    public final boolean i() {
        synchronized(this) {
            if(this.A != 0L) {
                return true;
            }
        }
        return false;
    }

    @Override  // R1.g
    public final void j() {
        synchronized(this) {
            this.A = 2L;
        }
        this.o();
    }

    @Override  // R1.g
    public final boolean m(int v, int v1, Object object0) {
        return false;
    }

    @Override  // R1.g
    public final boolean t(int v, Object object0) {
        if(30 == v) {
            this.u(((e3)object0));
            return true;
        }
        return false;
    }

    @Override  // ca.a0
    public final void u(e3 e30) {
        this.w = e30;
        synchronized(this) {
            this.A |= 1L;
        }
        this.o();
    }
}

