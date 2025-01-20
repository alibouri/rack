package ca;

import K6.b;
import K6.e;
import R1.g;
import R1.j;
import W4.f;
import ac.B0;
import ac.h0;
import ac.h;
import android.content.Context;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.sendwave.components.DropdownTextView;
import com.sendwave.components.RequesterEditText;
import fa.d;
import i.J;
import java.util.List;
import ma.Q;
import o9.J1;
import q9.S0;
import q9.U0;

public final class s extends g implements d {
    public final int q;
    public final TextInputLayout r;
    public long s;
    public final View t;
    public Object u;
    public Object v;
    public Object w;
    public Object x;

    public s(View view0, int v) {
        this.q = v;
        if(v != 1) {
            Object[] arr_object = g.l(view0, 3, null, null);
            ConstraintLayout constraintLayout0 = (ConstraintLayout)arr_object[0];
            this.q = 0;
            super(null, view0, 2);
            this.t = constraintLayout0;
            this.s = -1L;
            ((ConstraintLayout)this.t).setTag(null);
            this.r = (TextInputLayout)arr_object[1];
            ((TextInputLayout)arr_object[1]).setTag(null);
            this.v = (RequesterEditText)arr_object[2];
            ((RequesterEditText)arr_object[2]).setTag(null);
            this.s(view0);
            this.w = new b(this, 1);
            this.j();
            return;
        }
        Object[] arr_object1 = g.l(view0, 3, null, null);
        DropdownTextView dropdownTextView0 = (DropdownTextView)arr_object1[2];
        FrameLayout frameLayout0 = (FrameLayout)arr_object1[0];
        this.q = 1;
        super(null, view0, 1);
        this.t = dropdownTextView0;
        this.u = frameLayout0;
        this.s = -1L;
        ((DropdownTextView)this.t).setTag(null);
        ((FrameLayout)this.u).setTag(null);
        this.r = (TextInputLayout)arr_object1[1];
        ((TextInputLayout)arr_object1[1]).setTag(null);
        this.s(view0);
        this.j();
    }

    @Override  // fa.d
    public void c(boolean z) {
        Q q0 = (Q)this.u;
        if(q0 != null && !z) {
            Boolean boolean0 = Boolean.TRUE;
            q0.i0.getClass();
            q0.i0.l(null, boolean0);
        }
    }

    @Override  // R1.g
    public final void f() {
        long v;
        List list0;
        String s;
        int v3;
        J j0;
        e e0;
        if(this.q != 0) {
            synchronized(this) {
                v = this.s;
                this.s = 0L;
            }
            J1 j10 = (J1)this.v;
            int v1 = Long.compare(7L & v, 0L);
            int v2 = 0;
            CharSequence charSequence0 = null;
            if(v1 == 0) {
                e0 = null;
                j0 = null;
                s = null;
                list0 = null;
            }
            else {
                if((v & 6L) == 0L || j10 == null) {
                    v3 = 0;
                    e0 = null;
                    j0 = null;
                    s = null;
                    list0 = null;
                }
                else {
                    e0 = (e)this.w;
                    if(e0 == null) {
                        e0 = new e(8);
                        this.w = e0;
                    }
                    e0.Y = j10;
                    j0 = (J)this.x;
                    if(j0 == null) {
                        j0 = new J(3, false);
                        this.x = j0;
                    }
                    j0.Y = j10;
                    v3 = j10.b0;
                    s = j10.Z.c;
                    list0 = j10.e0;
                }
                h0 h00 = j10 == null ? null : j10.d0;
                j.e(this, 0, h00);
                if(h00 != null) {
                    charSequence0 = (String)((B0)h00).getValue();
                }
                v2 = v3;
            }
            if(v1 != 0) {
                f.M(((DropdownTextView)this.t), charSequence0);
            }
            if((v & 6L) != 0L) {
                ((DropdownTextView)this.t).setOnClickListener(e0);
                U0.m(((DropdownTextView)this.t), v2);
                DropdownTextView dropdownTextView0 = (DropdownTextView)this.t;
                Nb.j.f(dropdownTextView0, "<this>");
                Context context0 = dropdownTextView0.getContext();
                if(list0 != null) {
                    dropdownTextView0.setAdapter(new ArrayAdapter(context0, 0x109000A, list0));
                    dropdownTextView0.setOnItemClickListener(new S0(j0));
                }
                this.r.setHint(s);
            }
            return;
        }
        this.u();
    }

    @Override  // R1.g
    public final boolean i() {
        if(this.q != 0) {
            synchronized(this) {
                if(this.s != 0L) {
                    return true;
                }
            }
            return false;
        }
        return this.v();
    }

    @Override  // R1.g
    public final void j() {
        if(this.q != 0) {
            synchronized(this) {
                this.s = 4L;
            }
            this.o();
            return;
        }
        this.w();
    }

    @Override  // R1.g
    public final boolean m(int v, int v1, Object object0) {
        if(this.q != 0) {
            if(v == 0) {
                h0 h00 = (h0)object0;
                if(v1 == 0) {
                    synchronized(this) {
                        this.s |= 1L;
                    }
                    return true;
                }
            }
            return false;
        }
        return this.y(v, v1, object0);
    }

    @Override  // R1.g
    public final boolean t(int v, Object object0) {
        if(this.q != 0) {
            if(16 == v) {
                this.v = (J1)object0;
                synchronized(this) {
                    this.s |= 2L;
                }
                this.o();
                return true;
            }
            return false;
        }
        return this.z(v, object0);
    }

    private final void u() {
        int v4;
        CharSequence charSequence1;
        h h0;
        CharSequence charSequence0;
        int v3;
        int v2;
        B3.d d0;
        synchronized(this) {
            long v = this.s;
            this.s = 0L;
        }
        Q q0 = (Q)this.u;
        int v1 = 0;
        if(Long.compare(15L & v, 0L) == 0) {
            v4 = 0;
            v2 = 0;
            d0 = null;
            charSequence1 = null;
            charSequence0 = null;
            h0 = null;
        }
        else {
            if((v & 12L) == 0L || q0 == null) {
                v2 = 0;
                v3 = 0;
                d0 = null;
                charSequence0 = null;
                h0 = null;
            }
            else {
                d0 = (B3.d)this.x;
                if(d0 == null) {
                    d0 = new B3.d(24, false);
                    this.x = d0;
                }
                d0.Y = q0;
                v2 = q0.d0;
                v3 = q0.c0;
                charSequence0 = q0.b0;
                h0 = q0.j0;
            }
            if((v & 13L) != 0L) {
                B0 b00 = q0 == null ? null : q0.h0;
                j.e(this, 0, b00);
                v1 = g.p((b00 == null ? null : ((Integer)b00.getValue())));
            }
            if((v & 14L) == 0L) {
            label_35:
                v4 = v1;
                v1 = v3;
                charSequence1 = null;
            }
            else {
                B0 b01 = q0 == null ? null : q0.g0;
                j.e(this, 1, b01);
                if(b01 != null) {
                    charSequence1 = (String)b01.getValue();
                    v4 = v1;
                    v1 = v3;
                    goto label_45;
                }
                goto label_35;
            }
        }
    label_45:
        if((12L & v) != 0L) {
            this.r.setHint(charSequence0);
            U0.c(this.r, h0);
            ((RequesterEditText)this.v).setOnRequest(d0);
            U0.m(((RequesterEditText)this.v), v1);
            if(g.m >= 3) {
                ((RequesterEditText)this.v).setRawInputType(v2);
            }
        }
        if((v & 14L) != 0L) {
            f.M(((RequesterEditText)this.v), charSequence1);
        }
        if((13L & v) != 0L) {
            ((RequesterEditText)this.v).setSelection(v4);
        }
        if((v & 8L) != 0L) {
            ((RequesterEditText)this.v).setOnFocusChangeListener(((b)this.w));
        }
    }

    private final boolean v() {
        synchronized(this) {
            if(this.s != 0L) {
                return true;
            }
        }
        return false;
    }

    private final void w() {
        synchronized(this) {
            this.s = 8L;
        }
        this.o();
    }

    public boolean x(int v) {
        if(v == 0) {
            synchronized(this) {
                this.s |= 1L;
            }
            return true;
        }
        return false;
    }

    private final boolean y(int v, int v1, Object object0) {
        switch(v) {
            case 0: {
                h0 h00 = (h0)object0;
                return this.x(v1);
            }
            case 1: {
                h0 h01 = (h0)object0;
                if(v1 == 0) {
                    synchronized(this) {
                        this.s |= 2L;
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

    private final boolean z(int v, Object object0) {
        if(16 == v) {
            this.u = (Q)object0;
            synchronized(this) {
                this.s |= 4L;
            }
            this.o();
            return true;
        }
        return false;
    }
}

