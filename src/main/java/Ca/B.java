package ca;

import Ha.S;
import Nb.j;
import R1.g;
import W4.f;
import Y8.N;
import ac.B0;
import ac.h0;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.textfield.TextInputLayout;
import com.sendwave.components.CustomKeyboardRequesterEditText;
import com.sendwave.components.KeypadView;
import com.sendwave.models.CurrencyAmount;
import fa.c;
import q9.U0;
import q9.u0;

public final class b extends a implements c {
    public final TextView A;
    public final FrameLayout B;
    public final LinearLayout C;
    public final TextView D;
    public final LinearLayout E;
    public final TextView F;
    public final LinearLayout G;
    public final M9.c H;
    public final M9.c I;
    public final M9.c J;
    public B3.c K;
    public long L;
    public static final SparseIntArray M;
    public final LinearLayout x;
    public final LinearLayout y;
    public final LinearLayout z;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        b.M = sparseIntArray0;
        sparseIntArray0.put(0x7F0A0305, 16);  // id:title_text_no_amount
        sparseIntArray0.put(0x7F0A0065, 17);  // id:amount_input_layout
    }

    public b(View view0) {
        Object[] arr_object = g.l(view0, 18, null, b.M);
        CustomKeyboardRequesterEditText customKeyboardRequesterEditText0 = (CustomKeyboardRequesterEditText)arr_object[10];
        TextInputLayout textInputLayout0 = (TextInputLayout)arr_object[17];
        AppCompatImageView appCompatImageView0 = (AppCompatImageView)arr_object[2];
        AppCompatImageView appCompatImageView1 = (AppCompatImageView)arr_object[4];
        KeypadView keypadView0 = (KeypadView)arr_object[12];
        Button button0 = (Button)arr_object[15];
        TextView textView0 = (TextView)arr_object[16];
        super(null, view0, customKeyboardRequesterEditText0, appCompatImageView0, appCompatImageView1, keypadView0, button0);
        this.L = -1L;
        ((CustomKeyboardRequesterEditText)this.r).setTag(null);
        ((AppCompatImageView)this.q).setTag(null);
        ((AppCompatImageView)this.s).setTag(null);
        ((KeypadView)this.t).setTag(null);
        ((LinearLayout)arr_object[0]).setTag(null);
        this.x = (LinearLayout)arr_object[1];
        ((LinearLayout)arr_object[1]).setTag(null);
        this.y = (LinearLayout)arr_object[11];
        ((LinearLayout)arr_object[11]).setTag(null);
        this.z = (LinearLayout)arr_object[13];
        ((LinearLayout)arr_object[13]).setTag(null);
        this.A = (TextView)arr_object[14];
        ((TextView)arr_object[14]).setTag(null);
        this.B = (FrameLayout)arr_object[3];
        ((FrameLayout)arr_object[3]).setTag(null);
        this.C = (LinearLayout)arr_object[5];
        ((LinearLayout)arr_object[5]).setTag(null);
        this.D = (TextView)arr_object[6];
        ((TextView)arr_object[6]).setTag(null);
        this.E = (LinearLayout)arr_object[7];
        ((LinearLayout)arr_object[7]).setTag(null);
        this.F = (TextView)arr_object[8];
        ((TextView)arr_object[8]).setTag(null);
        this.G = (LinearLayout)arr_object[9];
        ((LinearLayout)arr_object[9]).setTag(null);
        ((Button)this.u).setTag(null);
        this.s(view0);
        this.H = new M9.c(3, 1, this);
        this.I = new M9.c(1, 1, this);
        this.J = new M9.c(2, 1, this);
        this.j();
    }

    @Override  // fa.c
    public final void a(View view0, int v) {
        switch(v) {
            case 1: {
                u0 u00 = (u0)this.w;
                ha.g g0 = (ha.g)this.v;
                if(g0 != null) {
                    j.f(u00, "controller");
                    ha.b b0 = new ha.b(g0, u00, null);
                    N.j(g0, g0.Y, true, b0);
                    return;
                }
                break;
            }
            case 2: {
                u0 u01 = (u0)this.w;
                ha.g g1 = (ha.g)this.v;
                if(g1 != null) {
                    j.f(u01, "controller");
                    ha.b b1 = new ha.b(g1, u01, null);
                    N.j(g1, g1.Y, true, b1);
                    return;
                }
                break;
            }
            case 3: {
                u0 u02 = (u0)this.w;
                ha.g g2 = (ha.g)this.v;
                if(g2 != null) {
                    j.f(u02, "controller");
                    ha.c c0 = new ha.c(g2, u02, null);
                    N.j(g2, g2.Y, true, c0);
                    return;
                }
                break;
            }
        }
    }

    @Override  // R1.g
    public final void f() {
        long v;
        int v3;
        CharSequence charSequence1;
        String s2;
        B3.c c0;
        CharSequence charSequence0;
        int v2;
        CurrencyAmount currencyAmount0;
        String s1;
        S s0;
        boolean z1;
        boolean z = false;
        synchronized(this) {
            v = this.L;
            this.L = 0L;
        }
        ha.g g0 = (ha.g)this.v;
        if(Long.compare(23L & v, 0L) == 0) {
            v3 = 0;
            v2 = 0;
            c0 = null;
            charSequence0 = null;
            s0 = null;
            s1 = null;
            charSequence1 = null;
        }
        else {
            int v1 = Long.compare(v & 20L, 0L);
            if(v1 == 0) {
                v2 = 0;
                z1 = false;
                charSequence0 = null;
                s0 = null;
                s1 = null;
            }
            else {
                if(g0 == null) {
                    z1 = false;
                    currencyAmount0 = null;
                    s0 = null;
                    s1 = null;
                }
                else {
                    z1 = g0.k0;
                    s0 = g0.l0;
                    s1 = g0.e0;
                    currencyAmount0 = g0.f0;
                }
                v2 = !z1;
                charSequence0 = currencyAmount0 == null ? null : currencyAmount0.k();
            }
            f9.a a0 = g0 == null ? null : g0.j0;
            if(v1 == 0 || a0 == null) {
                c0 = null;
            }
            else {
                c0 = this.K;
                if(c0 == null) {
                    c0 = new B3.c(23, false);
                    this.K = c0;
                }
                c0.Y = a0;
            }
            if((v & 21L) == 0L) {
                s2 = null;
            }
            else {
                B0 b00 = a0 == null ? null : a0.b0;
                R1.j.e(this, 0, b00);
                s2 = b00 == null ? null : ((String)b00.getValue());
            }
            if((v & 22L) != 0L) {
                B0 b01 = a0 == null ? null : a0.e0;
                R1.j.e(this, 1, b01);
                z = g.p((b01 == null ? null : ((Integer)b01.getValue())));
            }
            charSequence1 = s2;
            v3 = z;
            z = z1;
        }
        if((21L & v) != 0L) {
            f.M(((CustomKeyboardRequesterEditText)this.r), charSequence1);
        }
        if((20L & v) != 0L) {
            ((CustomKeyboardRequesterEditText)this.r).setOnRequest(c0);
            U0.o(this.x, z);
            U0.o(this.y, ((boolean)v2));
            U0.o(this.z, z);
            f.M(this.A, charSequence0);
            U0.o(this.B, ((boolean)v2));
            U0.o(this.C, z);
            f.M(this.D, s1);
            U0.o(this.E, ((boolean)v2));
            f.M(this.F, s1);
            U0.o(this.G, ((boolean)v2));
            U0.b(((Button)this.u), s0);
        }
        if((22L & v) != 0L) {
            ((CustomKeyboardRequesterEditText)this.r).setSelection(v3);
        }
        if((v & 16L) != 0L) {
            ((AppCompatImageView)this.q).setOnClickListener(this.I);
            ((AppCompatImageView)this.s).setOnClickListener(this.J);
            j.f(((KeypadView)this.t), "<this>");
            j.f(((CustomKeyboardRequesterEditText)this.r), "editTextId");
            ((KeypadView)this.t).setInputEditText(((CustomKeyboardRequesterEditText)this.r));
            ((Button)this.u).setOnClickListener(this.H);
        }
    }

    @Override  // R1.g
    public final boolean i() {
        synchronized(this) {
            if(this.L != 0L) {
                return true;
            }
        }
        return false;
    }

    @Override  // R1.g
    public final void j() {
        synchronized(this) {
            this.L = 16L;
        }
        this.o();
    }

    @Override  // R1.g
    public final boolean m(int v, int v1, Object object0) {
        switch(v) {
            case 0: {
                h0 h00 = (h0)object0;
                return this.u(v1);
            }
            case 1: {
                h0 h01 = (h0)object0;
                if(v1 == 0) {
                    synchronized(this) {
                        this.L |= 2L;
                    }
                    return true;
                }
                return false;
            }
            default: {
                return false;
            }
        }
    }

    @Override  // R1.g
    public final boolean t(int v, Object object0) {
        if(20 == v) {
            this.v = (ha.g)object0;
            synchronized(this) {
                this.L |= 4L;
            }
            this.o();
            return true;
        }
        if(10 == v) {
            this.v(((u0)object0));
            return true;
        }
        return false;
    }

    public final boolean u(int v) {
        if(v == 0) {
            synchronized(this) {
                this.L |= 1L;
            }
            return true;
        }
        return false;
    }

    public final void v(u0 u00) {
        this.w = u00;
        synchronized(this) {
            this.L |= 8L;
        }
        this.o();
    }
}

