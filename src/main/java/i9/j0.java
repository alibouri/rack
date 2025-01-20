package i9;

import R1.g;
import W4.f;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.google.android.material.textfield.TextInputLayout;
import o9.q;
import q9.U0;

public final class j0 extends i0 {
    public final EditText r;
    public long s;
    public static final SparseIntArray t;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        j0.t = sparseIntArray0;
        sparseIntArray0.put(0x7F0A0066, 2);  // id:amount_layout
    }

    public j0(View view0) {
        Object[] arr_object = g.l(view0, 3, null, j0.t);
        TextInputLayout textInputLayout0 = (TextInputLayout)arr_object[2];
        super(null, view0, 0);
        this.s = -1L;
        ((FrameLayout)arr_object[0]).setTag(null);
        this.r = (EditText)arr_object[1];
        ((EditText)arr_object[1]).setTag(null);
        this.s(view0);
        this.j();
    }

    @Override  // R1.g
    public final void f() {
        long v;
        String s;
        int v2;
        synchronized(this) {
            v = this.s;
            this.s = 0L;
        }
        q q0 = this.q;
        int v1 = Long.compare(v & 3L, 0L);
        if(v1 == 0 || q0 == null) {
            v2 = 0;
            s = null;
        }
        else {
            v2 = q0.c0;
            s = q0.c();
        }
        if(v1 != 0) {
            f.M(this.r, s);
            U0.m(this.r, v2);
        }
    }

    @Override  // R1.g
    public final boolean i() {
        synchronized(this) {
            if(this.s != 0L) {
                return true;
            }
        }
        return false;
    }

    @Override  // R1.g
    public final void j() {
        synchronized(this) {
            this.s = 2L;
        }
        this.o();
    }

    @Override  // R1.g
    public final boolean m(int v, int v1, Object object0) {
        return false;
    }

    @Override  // R1.g
    public final boolean t(int v, Object object0) {
        if(16 == v) {
            this.q = (q)object0;
            synchronized(this) {
                this.s |= 1L;
            }
            this.o();
            return true;
        }
        return false;
    }
}

