package i9;

import M9.c;
import R1.g;
import R1.j;
import W4.f;
import ac.B0;
import ac.h0;
import ac.j0;
import ac.z0;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import ca.a;
import com.sendwave.components.CustomKeyboardRequesterEditText;
import com.sendwave.components.KeypadView;
import f9.A;
import f9.d;
import q9.U0;

public final class n0 extends a implements j9.a {
    public I A;
    public long B;
    public static final SparseIntArray C;
    public final c x;
    public K y;
    public J z;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        n0.C = sparseIntArray0;
        sparseIntArray0.put(0x7F0A0186, 5);  // id:img_logo
    }

    public n0(View view0) {
        Object[] arr_object = g.l(view0, 6, null, n0.C);
        ImageView imageView0 = (ImageView)arr_object[5];
        super(null, view0, ((CustomKeyboardRequesterEditText)arr_object[4]), ((KeypadView)arr_object[3]), ((ProgressBar)arr_object[2]), ((ConstraintLayout)arr_object[0]), ((Toolbar)arr_object[1]));
        this.B = -1L;
        ((CustomKeyboardRequesterEditText)this.r).setTag(null);
        ((KeypadView)this.t).setTag(null);
        ((ProgressBar)this.q).setTag(null);
        ((ConstraintLayout)this.s).setTag(null);
        ((Toolbar)this.u).setTag(null);
        this.s(view0);
        this.x = new c(1, 2, this);
        this.j();
    }

    @Override  // j9.a
    public final void a(View view0, int v) {
    }

    @Override  // R1.g
    public final void f() {
        long v;
        K k0;
        CharSequence charSequence0;
        I i0;
        String s;
        boolean z;
        J j0;
        B0 b00;
        int v3;
        synchronized(this) {
            v = this.B;
            this.B = 0L;
        }
        d d0 = (d)this.w;
        A a0 = (A)this.v;
        int v1 = Long.compare(76L & v, 0L);
        int v2 = 0;
        if(v1 == 0) {
            z = false;
            v3 = 0;
            i0 = null;
            s = null;
            j0 = null;
        }
        else {
            if(d0 == null) {
                v3 = 0;
                b00 = null;
                j0 = null;
            }
            else {
                v3 = d0.b();
                b00 = d0.c();
                j0 = this.z;
                if(j0 == null) {
                    j0 = new J(1);
                    this.z = j0;
                }
                j0.Y = d0;
            }
            j.e(this, 2, b00);
            z = g.q((b00 == null ? null : ((Boolean)b00.getValue())));
            if((v & 72L) == 0L || d0 == null) {
                i0 = null;
                s = null;
            }
            else {
                s = "";
                i0 = this.A;
                if(i0 == null) {
                    i0 = new I(1);
                    this.A = i0;
                }
                i0.Y = d0;
            }
        }
        if(Long.compare(v & 83L, 0L) == 0) {
            charSequence0 = null;
            k0 = null;
        }
        else {
            if((v & 81L) == 0L) {
                charSequence0 = null;
            }
            else {
                j0 j00 = a0 == null ? null : a0.i;
                j.e(this, 0, j00);
                charSequence0 = j00 == null ? null : ((String)((B0)j00.X).getValue());
            }
            if((v & 82L) != 0L) {
                j0 j01 = a0 == null ? null : a0.j;
                j.e(this, 1, j01);
                v2 = g.p((j01 == null ? null : ((Integer)((B0)j01.X).getValue())));
            }
            if((v & 80L) == 0L || a0 == null) {
                k0 = null;
            }
            else {
                k0 = this.y;
                if(k0 == null) {
                    k0 = new K(1);
                    this.y = k0;
                }
                k0.Y = a0;
            }
        }
        if((v & 81L) != 0L) {
            f.M(((CustomKeyboardRequesterEditText)this.r), charSequence0);
        }
        if((v & 80L) != 0L) {
            ((CustomKeyboardRequesterEditText)this.r).setOnRequest(k0);
        }
        if((v & 82L) != 0L) {
            ((CustomKeyboardRequesterEditText)this.r).setSelection(v2);
            ((ProgressBar)this.q).setProgress(v2);
        }
        if(v1 != 0) {
            KeypadView keypadView0 = (KeypadView)this.t;
            Nb.j.f(keypadView0, "<this>");
            Nb.j.f(j0, "clickHandler");
            if(z) {
                keypadView0.d(v3, j0);
            }
            else {
                keypadView0.d(0x7F0801D9, keypadView0.j0);  // drawable:ic_backspace_white
            }
        }
        if((72L & v) != 0L) {
            U0.l(((KeypadView)this.t), s, i0);
        }
        if((v & 0x40L) != 0L) {
            ((Toolbar)this.u).setOnClickListener(this.x);
        }
    }

    @Override  // R1.g
    public final boolean i() {
        synchronized(this) {
            if(this.B != 0L) {
                return true;
            }
        }
        return false;
    }

    @Override  // R1.g
    public final void j() {
        synchronized(this) {
            this.B = 0x40L;
        }
        this.o();
    }

    @Override  // R1.g
    public final boolean m(int v, int v1, Object object0) {
        switch(v) {
            case 0: {
                z0 z00 = (z0)object0;
                return this.v(v1);
            }
            case 1: {
                z0 z01 = (z0)object0;
                return this.u(v1);
            }
            case 2: {
                h0 h00 = (h0)object0;
                if(v1 == 0) {
                    synchronized(this) {
                        this.B |= 4L;
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
        if(5 == v) {
            this.w = (d)object0;
            synchronized(this) {
                this.B |= 8L;
            }
            this.o();
            return true;
        }
        if(23 == v) {
            this.w(((A)object0));
            return true;
        }
        if(30 == v) {
            if(object0 != null) {
                throw new ClassCastException();
            }
            this.x();
            return true;
        }
        return false;
    }

    public final boolean u(int v) {
        if(v == 0) {
            synchronized(this) {
                this.B |= 2L;
            }
            return true;
        }
        return false;
    }

    public final boolean v(int v) {
        if(v == 0) {
            synchronized(this) {
                this.B |= 1L;
            }
            return true;
        }
        return false;
    }

    public final void w(A a0) {
        this.v = a0;
        synchronized(this) {
            this.B |= 16L;
        }
        this.o();
    }

    public final void x() {
        synchronized(this) {
            this.B |= 0x20L;
        }
        this.o();
    }
}

