package i9;

import Nb.j;
import R1.g;
import android.text.Html;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import ca.o;
import q9.U0;
import q9.U2;

public final class z extends o {
    public final ImageView t;
    public long u;
    public static final SparseIntArray v;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        z.v = sparseIntArray0;
        sparseIntArray0.put(0x7F0A0168, 4);  // id:guideline4
    }

    public z(View view0) {
        Object[] arr_object = g.l(view0, 5, null, z.v);
        Guideline guideline0 = (Guideline)arr_object[4];
        super(null, view0, ((ImageView)arr_object[1]), ((TextView)arr_object[3]));
        this.u = -1L;
        ((ImageView)this.r).setTag(null);
        ((ScrollView)arr_object[0]).setTag(null);
        this.t = (ImageView)arr_object[2];
        ((ImageView)arr_object[2]).setTag(null);
        this.q.setTag(null);
        this.s(view0);
        this.j();
    }

    @Override  // R1.g
    public final void f() {
        long v;
        int v4;
        String s;
        boolean z1;
        int v3;
        int v2;
        boolean z;
        synchronized(this) {
            v = this.u;
            this.u = 0L;
        }
        U2 u20 = (U2)this.s;
        ImageView.ScaleType imageView$ScaleType0 = null;
        int v1 = 0;
        if(Long.compare(v & 3L, 0L) == 0) {
            s = null;
            v4 = 0;
            v2 = 0;
        }
        else {
            if(u20 == null) {
                s = null;
                z = false;
                v2 = 0;
                v3 = 0;
                z1 = false;
            }
            else {
                z = u20.f;
                v2 = u20.d;
                v3 = u20.c;
                z1 = u20.e;
                s = u20.b;
            }
            v |= (z ? 8L : 4L);
            v = (v & 3L) == 0L ? v | (z ? 8L : 4L) : v | (z1 ? 0x20L : 16L);
            imageView$ScaleType0 = z ? ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_END;
            if(!z1) {
                v1 = 8;
            }
            v4 = v1;
            v1 = v3;
        }
        if((v & 3L) != 0L) {
            U0.j(((ImageView)this.r), v1);
            U0.j(this.t, v2);
            this.t.setScaleType(imageView$ScaleType0);
            this.t.setVisibility(v4);
            TextView textView0 = this.q;
            j.f(textView0, "<this>");
            if(s != null) {
                textView0.setText(Html.fromHtml(s));
            }
        }
    }

    @Override  // R1.g
    public final boolean i() {
        synchronized(this) {
            if(this.u != 0L) {
                return true;
            }
        }
        return false;
    }

    @Override  // R1.g
    public final void j() {
        synchronized(this) {
            this.u = 2L;
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
            this.s = (U2)object0;
            synchronized(this) {
                this.u |= 1L;
            }
            this.o();
            return true;
        }
        return false;
    }
}

