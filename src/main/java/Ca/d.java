package ca;

import Nb.j;
import R1.g;
import R9.X1;
import R9.s1;
import W4.f;
import ac.h;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import fa.c;
import q9.O0;
import q9.U0;
import q9.n;

public final class d extends a implements c {
    public final M9.c x;
    public long y;
    public static final SparseIntArray z;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        d.z = sparseIntArray0;
        sparseIntArray0.put(0x7F0A02F7, 5);  // id:text_barrier
    }

    public d(View view0) {
        Object[] arr_object = g.l(view0, 6, null, d.z);
        ImageView imageView0 = (ImageView)arr_object[1];
        ConstraintLayout constraintLayout0 = (ConstraintLayout)arr_object[0];
        AppCompatImageView appCompatImageView0 = (AppCompatImageView)arr_object[3];
        TextView textView0 = (TextView)arr_object[4];
        Barrier barrier0 = (Barrier)arr_object[5];
        super(null, view0, imageView0, constraintLayout0, appCompatImageView0, textView0, ((TextView)arr_object[2]));
        this.y = -1L;
        ((ImageView)this.r).setTag(null);
        ((ConstraintLayout)this.s).setTag(null);
        ((AppCompatImageView)this.q).setTag(null);
        ((TextView)this.t).setTag(null);
        ((TextView)this.u).setTag(null);
        this.s(view0);
        this.x = new M9.c(1, 1, this);
        this.j();
    }

    @Override  // fa.c
    public final void a(View view0, int v) {
        s1 s10 = (s1)this.w;
        if(s10 != null) {
            s10.a();
        }
    }

    @Override  // R1.g
    public final void f() {
        long v;
        String s1;
        boolean z;
        String s;
        synchronized(this) {
            v = this.y;
            this.y = 0L;
        }
        s1 s10 = (s1)this.w;
        X1 x10 = (X1)this.v;
        int v1 = Long.compare(7L & v, 0L);
        h h0 = null;
        if(v1 == 0) {
            z = false;
            s = null;
            s1 = null;
        }
        else {
            if((v & 5L) == 0L || s10 == null) {
                z = false;
                s = null;
                s1 = null;
            }
            else {
                s = s10.getName();
                z = s10.c();
                s1 = s10.d();
            }
            n n0 = x10 == null ? null : x10.b0;
            if(s10 != null) {
                h0 = s10.b(n0);
            }
        }
        if(v1 != 0) {
            j.f(((ImageView)this.r), "<this>");
            O0 o00 = new O0(((ImageView)this.r), 0);
            U0.a(((ImageView)this.r), h0, o00);
        }
        if((4L & v) != 0L) {
            ((ConstraintLayout)this.s).setOnClickListener(this.x);
        }
        if((v & 5L) != 0L) {
            U0.o(((AppCompatImageView)this.q), z);
            f.M(((TextView)this.t), s1);
            U0.o(((TextView)this.t), z);
            f.M(((TextView)this.u), s);
        }
    }

    @Override  // R1.g
    public final boolean i() {
        synchronized(this) {
            if(this.y != 0L) {
                return true;
            }
        }
        return false;
    }

    @Override  // R1.g
    public final void j() {
        synchronized(this) {
            this.y = 4L;
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
            this.w = (s1)object0;
            synchronized(this) {
                this.y |= 1L;
            }
            this.o();
            return true;
        }
        if(30 == v) {
            this.u(((X1)object0));
            return true;
        }
        return false;
    }

    public final void u(X1 x10) {
        this.v = x10;
        synchronized(this) {
            this.y |= 2L;
        }
        this.o();
    }
}

