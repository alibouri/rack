package i9;

import L9.m;
import M9.c;
import Nb.j;
import R1.g;
import W4.f;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import j9.a;
import q9.U0;

public final class i extends m implements a {
    public final ImageView s;
    public final TextView t;
    public final c u;
    public long v;
    public static final SparseIntArray w;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        i.w = sparseIntArray0;
        sparseIntArray0.put(0x7F0A0186, 5);  // id:img_logo
        sparseIntArray0.put(0x7F0A0168, 6);  // id:guideline4
        sparseIntArray0.put(0x7F0A019C, 7);  // id:layout_agree
    }

    public i(View view0) {
        Object[] arr_object = g.l(view0, 8, null, i.w);
        Guideline guideline0 = (Guideline)arr_object[6];
        ImageView imageView0 = (ImageView)arr_object[5];
        LinearLayout linearLayout0 = (LinearLayout)arr_object[7];
        Button button0 = (Button)arr_object[4];
        TextView textView0 = (TextView)arr_object[2];
        super(null, view0, 0);
        this.r = button0;
        this.q = textView0;
        this.v = -1L;
        ((ConstraintLayout)arr_object[0]).setTag(null);
        this.s = (ImageView)arr_object[1];
        ((ImageView)arr_object[1]).setTag(null);
        this.t = (TextView)arr_object[3];
        ((TextView)arr_object[3]).setTag(null);
        ((Button)this.r).setTag(null);
        ((TextView)this.q).setTag(null);
        this.s(view0);
        this.u = new c(1, 2, this);
        this.j();
    }

    @Override  // j9.a
    public final void a(View view0, int v) {
    }

    @Override  // R1.g
    public final void f() {
        long v;
        ImageView.ScaleType imageView$ScaleType0;
        synchronized(this) {
            v = this.v;
            this.v = 0L;
        }
        if(Long.compare(v & 3L, 0L) == 0) {
            imageView$ScaleType0 = null;
        }
        else {
            v |= 4L;
            imageView$ScaleType0 = ImageView.ScaleType.FIT_END;
        }
        if((3L & v) != 0L) {
            this.s.setScaleType(imageView$ScaleType0);
            U0.j(this.s, 0);
            f.M(this.t, null);
            j.f(((TextView)this.q), "<this>");
        }
        if((v & 2L) != 0L) {
            ((Button)this.r).setOnClickListener(this.u);
        }
    }

    @Override  // R1.g
    public final boolean i() {
        synchronized(this) {
            if(this.v != 0L) {
                return true;
            }
        }
        return false;
    }

    @Override  // R1.g
    public final void j() {
        synchronized(this) {
            this.v = 2L;
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
            if(object0 != null) {
                throw new ClassCastException();
            }
            synchronized(this) {
                this.v |= 1L;
            }
            this.o();
            return true;
        }
        return false;
    }
}

