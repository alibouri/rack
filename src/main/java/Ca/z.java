package ca;

import I5.h;
import N2.l;
import Nb.j;
import R1.g;
import R9.U1;
import Sb.d;
import W4.f;
import Y8.N;
import ac.B0;
import ac.j0;
import ac.z0;
import android.text.InputFilter.LengthFilter;
import android.text.InputFilter;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sendwave.components.CodeEntryEditText;
import com.sendwave.components.KeypadView;
import fa.c;
import fa.e;
import ma.E;
import ma.F;
import q9.P0;
import q9.U0;

public final class z extends y implements c, e {
    public final h u;
    public final M9.c v;
    public long w;
    public static final SparseIntArray x;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        z.x = sparseIntArray0;
        sparseIntArray0.put(0x7F0A0197, 4);  // id:keypad
    }

    public z(View view0) {
        Object[] arr_object = g.l(view0, 5, null, z.x);
        TextView textView0 = (TextView)arr_object[2];
        KeypadView keypadView0 = (KeypadView)arr_object[4];
        super(null, view0, textView0, ((CodeEntryEditText)arr_object[3]), ((Toolbar)arr_object[1]));
        this.w = -1L;
        this.q.setTag(null);
        ((ConstraintLayout)arr_object[0]).setTag(null);
        this.r.setTag(null);
        this.s.setTag(null);
        this.s(view0);
        this.u = new h(this, 2);
        this.v = new M9.c(1, 1, this);
        this.j();
    }

    @Override  // fa.c
    public final void a(View view0, int v) {
        F f0 = this.t;
        if(f0 != null) {
            ma.z z0 = new ma.z(f0, null);
            N.k(f0, f0.Z, true, z0);
        }
    }

    @Override  // fa.e
    public final void b(CharSequence charSequence0) {
        F f0 = this.t;
        if(f0 != null && charSequence0 != null) {
            String s = charSequence0.toString();
            j.f(s, "s");
            Integer integer0 = (Integer)f0.d0.a(F.i0[1], f0);
            if(integer0 != null && s.length() >= ((int)integer0)) {
                N.k(f0, f0.Z, true, new E(f0, Vb.j.n0(s, new d(0, ((int)integer0) - 1, 1)), null));  // initializer: LSb/b;-><init>(III)V
            }
        }
    }

    @Override  // R1.g
    public final void f() {
        long v;
        int v2;
        l l0;
        U1 u10;
        synchronized(this) {
            v = this.w;
            this.w = 0L;
        }
        F f0 = this.t;
        int v1 = Long.compare(7L & v, 0L);
        ac.h h0 = null;
        if(v1 == 0) {
            v2 = 0;
            u10 = null;
        }
        else {
            if((v & 6L) == 0L || f0 == null) {
                u10 = null;
                l0 = null;
            }
            else {
                u10 = f0.e0;
                l0 = f0.h0;
            }
            j0 j00 = f0 == null ? null : f0.c0;
            R1.j.e(this, 0, j00);
            if(j00 != null) {
                h0 = (Integer)((B0)j00.X).getValue();
            }
            v2 = g.p(((Integer)h0));
            h0 = l0;
        }
        if((6L & v) != 0L) {
            U0.e(this.q, h0);
            j.f(this.r, "<this>");
            P0 p00 = new P0(this.r, 2);
            U0.a(this.r, u10, p00);
        }
        if(v1 != 0) {
            CodeEntryEditText codeEntryEditText0 = this.r;
            InputFilter[] arr_inputFilter = codeEntryEditText0.getFilters();
            if(arr_inputFilter == null) {
                arr_inputFilter = new InputFilter[]{new InputFilter.LengthFilter(v2)};
            }
            else {
                for(int v3 = 0; true; ++v3) {
                    if(v3 >= arr_inputFilter.length) {
                        InputFilter[] arr_inputFilter1 = new InputFilter[arr_inputFilter.length + 1];
                        System.arraycopy(arr_inputFilter, 0, arr_inputFilter1, 0, arr_inputFilter.length);
                        arr_inputFilter1[arr_inputFilter.length] = new InputFilter.LengthFilter(v2);
                        arr_inputFilter = arr_inputFilter1;
                        break;
                    }
                    InputFilter inputFilter0 = arr_inputFilter[v3];
                    if(inputFilter0 instanceof InputFilter.LengthFilter) {
                        if(((InputFilter.LengthFilter)inputFilter0).getMax() == v2) {
                            break;
                        }
                        arr_inputFilter[v3] = new InputFilter.LengthFilter(v2);
                        break;
                    }
                }
            }
            codeEntryEditText0.setFilters(arr_inputFilter);
            this.r.setCodeLength(v2);
        }
        if((v & 4L) != 0L) {
            f.N(this.r, this.u);
            this.s.setOnClickListener(this.v);
        }
    }

    @Override  // R1.g
    public final boolean i() {
        synchronized(this) {
            if(this.w != 0L) {
                return true;
            }
        }
        return false;
    }

    @Override  // R1.g
    public final void j() {
        synchronized(this) {
            this.w = 4L;
        }
        this.o();
    }

    @Override  // R1.g
    public final boolean m(int v, int v1, Object object0) {
        if(v != 0) {
            return false;
        }
        z0 z00 = (z0)object0;
        if(v1 == 0) {
            synchronized(this) {
                this.w |= 1L;
            }
            return true;
        }
        return false;
    }

    @Override  // R1.g
    public final boolean t(int v, Object object0) {
        if(0x1F == v) {
            this.u(((F)object0));
            return true;
        }
        return false;
    }

    @Override  // ca.y
    public final void u(F f0) {
        this.t = f0;
        synchronized(this) {
            this.w |= 2L;
        }
        this.o();
    }
}

