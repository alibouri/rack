package i9;

import M9.c;
import R1.g;
import R1.j;
import ac.B0;
import ac.j0;
import ac.z0;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sendwave.components.CustomKeyboardRequesterEditText;
import com.sendwave.components.KeypadView;
import com.sendwave.components.SimpleRecyclerView;
import f9.A;
import f9.d;
import f9.f;
import i.J;
import j9.a;
import kotlin.jvm.functions.Function0;
import q9.U0;

public final class m0 extends l0 implements a {
    public final c A;
    public J B;
    public g.a C;
    public long D;

    public m0(View view0) {
        Object[] arr_object = g.l(view0, 7, null, null);
        super(null, view0, ((CustomKeyboardRequesterEditText)arr_object[6]), ((KeypadView)arr_object[5]), ((TextView)arr_object[2]), ((SimpleRecyclerView)arr_object[4]), ((ProgressBar)arr_object[3]), ((ConstraintLayout)arr_object[0]), ((Toolbar)arr_object[1]));
        this.D = -1L;
        this.q.setTag(null);
        this.r.setTag(null);
        this.s.setTag(null);
        this.t.setTag(null);
        this.u.setTag(null);
        this.v.setTag(null);
        this.w.setTag(null);
        this.s(view0);
        this.A = new c(1, 2, this);
        this.j();
    }

    @Override  // j9.a
    public final void a(View view0, int v) {
        A a0 = this.x;
        if(a0 != null) {
            ((Function0)a0.c).invoke();
        }
    }

    @Override  // R1.g
    public final void f() {
        long v;
        CharSequence charSequence0;
        int v3;
        J j0;
        String s1;
        String s;
        g.a a1;
        synchronized(this) {
            v = this.D;
            this.D = 0L;
        }
        d d0 = this.y;
        f f0 = this.z;
        A a0 = this.x;
        int v1 = Long.compare(36L & v, 0L);
        if(v1 == 0 || d0 == null) {
            s = null;
            a1 = null;
        }
        else {
            a1 = this.C;
            if(a1 == null) {
                a1 = new g.a('\u0000', 5);
                this.C = a1;
            }
            a1.Y = d0;
            s = "";
        }
        int v2 = Long.compare(40L & v, 0L);
        if(Long.compare(51L & v, 0L) == 0) {
            v3 = 0;
            charSequence0 = null;
            s1 = null;
            j0 = null;
        }
        else {
            if((v & 0x30L) == 0L || a0 == null) {
                s1 = null;
                j0 = null;
            }
            else {
                s1 = a0.a;
                j0 = this.B;
                if(j0 == null) {
                    j0 = new J(2, false);
                    this.B = j0;
                }
                j0.Y = a0;
            }
            if((v & 49L) == 0L) {
                v3 = 0;
                charSequence0 = null;
            }
            else {
                j0 j00 = a0 == null ? null : a0.i;
                v3 = 0;
                j.e(this, 0, j00);
                charSequence0 = j00 == null ? null : ((String)((B0)j00.X).getValue());
            }
            if((v & 50L) != 0L) {
                j0 j01 = a0 == null ? null : a0.j;
                j.e(this, 1, j01);
                v3 = g.p((j01 == null ? null : ((Integer)((B0)j01.X).getValue())));
            }
        }
        if((49L & v) != 0L) {
            W4.f.M(this.q, charSequence0);
        }
        if((50L & v) != 0L) {
            this.q.setSelection(v3);
            this.u.setProgress(v3);
        }
        if((v & 0x30L) != 0L) {
            this.q.setOnRequest(j0);
            W4.f.M(this.s, s1);
        }
        if(v1 != 0) {
            U0.l(this.r, s, a1);
        }
        if(v2 != 0) {
            this.t.setAdapter(f0);
        }
        if((v & 0x20L) != 0L) {
            this.w.setOnClickListener(this.A);
        }
    }

    @Override  // R1.g
    public final boolean i() {
        synchronized(this) {
            if(this.D != 0L) {
                return true;
            }
        }
        return false;
    }

    @Override  // R1.g
    public final void j() {
        synchronized(this) {
            this.D = 0x20L;
        }
        this.o();
    }

    @Override  // R1.g
    public final boolean m(int v, int v1, Object object0) {
        switch(v) {
            case 0: {
                z0 z00 = (z0)object0;
                return this.u(v1);
            }
            case 1: {
                z0 z01 = (z0)object0;
                if(v1 == 0) {
                    synchronized(this) {
                        this.D |= 2L;
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
            this.y = (d)object0;
            synchronized(this) {
                this.D |= 4L;
            }
            this.o();
            return true;
        }
        if(19 == v) {
            this.v(((f)object0));
            return true;
        }
        if(23 == v) {
            this.w(((A)object0));
            return true;
        }
        return false;
    }

    public final boolean u(int v) {
        if(v == 0) {
            synchronized(this) {
                this.D |= 1L;
            }
            return true;
        }
        return false;
    }

    public final void v(f f0) {
        this.z = f0;
        synchronized(this) {
            this.D |= 8L;
        }
        this.o();
    }

    public final void w(A a0) {
        this.x = a0;
        synchronized(this) {
            this.D |= 16L;
        }
        this.o();
    }
}

