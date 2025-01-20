package i9;

import Bb.q;
import M9.c;
import Nb.j;
import R1.g;
import W4.f;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sendwave.components.CheckableImageView;
import j9.a;
import java.util.List;
import p9.H;
import p9.e0;
import p9.j0;

public final class b0 extends a0 implements a {
    public final c A;
    public long B;
    public static final SparseIntArray C;
    public final LinearLayout u;
    public final LinearLayout v;
    public final TextView w;
    public final TextView x;
    public final CheckableImageView y;
    public final c z;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        b0.C = sparseIntArray0;
        sparseIntArray0.put(0x7F0A0144, 7);  // id:favorite_item
    }

    public b0(View view0) {
        Object[] arr_object = g.l(view0, 8, null, b0.C);
        super(null, view0, ((TextView)arr_object[1]), ((FrameLayout)arr_object[7]));
        this.B = -1L;
        this.q.setTag(null);
        ((LinearLayout)arr_object[0]).setTag(null);
        this.u = (LinearLayout)arr_object[2];
        ((LinearLayout)arr_object[2]).setTag(null);
        this.v = (LinearLayout)arr_object[3];
        ((LinearLayout)arr_object[3]).setTag(null);
        this.w = (TextView)arr_object[4];
        ((TextView)arr_object[4]).setTag(null);
        this.x = (TextView)arr_object[5];
        ((TextView)arr_object[5]).setTag(null);
        this.y = (CheckableImageView)arr_object[6];
        ((CheckableImageView)arr_object[6]).setTag(null);
        this.s(view0);
        this.z = new c(2, 2, this);
        this.A = new c(1, 2, this);
        this.j();
    }

    @Override  // j9.a
    public final void a(View view0, int v) {
        switch(v) {
            case 1: {
                H h0 = this.t;
                j0 j00 = this.s;
                if(j00 != null && h0 != null) {
                    j.f(h0.a, "favoriteId");
                    j00.e0.getClass();
                    j00.e0.l(null, h0.a);
                    return;
                }
                break;
            }
            case 2: {
                H h1 = this.t;
                j0 j01 = this.s;
                if(j01 != null) {
                    j.f(view0, "view");
                    j.f(h1, "item");
                    List list0 = q.K(h1.b);
                    e0 e00 = new e0(h1, j01, null);
                    j01.g0.d(view0, list0, e00);
                    return;
                }
                break;
            }
        }
    }

    @Override  // R1.g
    public final void f() {
        long v;
        boolean z;
        String s2;
        String s1;
        String s;
        synchronized(this) {
            v = this.B;
            this.B = 0L;
        }
        H h0 = this.t;
        int v1 = Long.compare(5L & v, 0L);
        if(v1 == 0 || h0 == null) {
            s = null;
            z = false;
            s1 = null;
            s2 = null;
        }
        else {
            s = h0.c;
            s1 = h0.b;
            s2 = h0.a;
            z = h0.d;
        }
        if(v1 != 0) {
            f.M(this.q, s2);
            f.M(this.w, s1);
            f.M(this.x, s);
            this.y.setChecked(z);
        }
        if((v & 4L) != 0L) {
            this.u.setOnClickListener(this.A);
            this.v.setOnClickListener(this.z);
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
            this.B = 4L;
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
            this.t = (H)object0;
            synchronized(this) {
                this.B |= 1L;
            }
            this.o();
            return true;
        }
        if(30 == v) {
            this.u(((j0)object0));
            return true;
        }
        return false;
    }

    public final void u(j0 j00) {
        this.s = j00;
        synchronized(this) {
            this.B |= 2L;
        }
        this.o();
    }
}

