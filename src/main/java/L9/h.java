package L9;

import K9.j;
import K9.k;
import K9.p;
import M9.b;
import M9.c;
import W4.f;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import q9.U0;

public final class h extends g implements b {
    public final ImageView w;
    public final c x;
    public long y;
    public static final SparseIntArray z;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        h.z = sparseIntArray0;
        sparseIntArray0.put(0x7F0A01BD, 5);  // id:main_text
    }

    public h(View view0) {
        Object[] arr_object = R1.g.l(view0, 6, null, h.z);
        ImageView imageView0 = (ImageView)arr_object[1];
        ConstraintLayout constraintLayout0 = (ConstraintLayout)arr_object[5];
        super(null, view0, imageView0, ((TextView)arr_object[4]), ((ConstraintLayout)arr_object[0]), ((TextView)arr_object[3]));
        this.y = -1L;
        this.q.setTag(null);
        this.w = (ImageView)arr_object[2];
        ((ImageView)arr_object[2]).setTag(null);
        this.r.setTag(null);
        this.s.setTag(null);
        this.t.setTag(null);
        this.s(view0);
        this.x = new c(1, 0, this);
        this.j();
    }

    @Override  // M9.b
    public final void a(View view0, int v) {
        j j0 = this.v;
        p p0 = this.u;
        if(p0 != null) {
            k k0 = p0.d0;
            if(k0 != null && j0 != null) {
                k0.e(j0.a);
            }
        }
    }

    @Override  // R1.g
    public final void f() {
        long v;
        int v3;
        float f;
        boolean z1;
        String s2;
        Integer integer0;
        String s1;
        boolean z;
        synchronized(this) {
            v = this.y;
            this.y = 0L;
        }
        j j0 = this.v;
        CharSequence charSequence0 = null;
        int v1 = 0;
        if(Long.compare(v & 5L, 0L) == 0) {
            f = 0.0f;
            s1 = null;
            v3 = 0;
        }
        else {
            if(j0 == null) {
                s1 = null;
                integer0 = null;
                s2 = null;
                z1 = false;
                z = false;
            }
            else {
                z = j0.d;
                String s = j0.a.b();
                s1 = Vb.j.c0(s) ? j0.a.c() : s;
                integer0 = j0.b;
                s2 = Vb.j.c0(j0.a.b()) ? "" : j0.a.c();
                z1 = j0.c;
            }
            v |= (z ? 0x40L : 0x20L);
            v = (v & 5L) == 0L ? v | (z ? 0x40L : 0x20L) : v | (z1 ? 16L : 8L);
            if(!z) {
                v1 = 8;
            }
            f = z1 ? 0.3f : 1.0f;
            charSequence0 = s2;
            int v2 = v1;
            v1 = R1.g.p(integer0);
            v3 = v2;
        }
        if((5L & v) != 0L) {
            U0.j(this.q, v1);
            this.w.setVisibility(v3);
            f.M(this.r, charSequence0);
            f.M(this.t, s1);
            if(R1.g.m >= 11) {
                this.s.setAlpha(f);
            }
        }
        if((v & 4L) != 0L) {
            this.s.setOnClickListener(this.x);
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
            this.v = (j)object0;
            synchronized(this) {
                this.y |= 1L;
            }
            this.o();
            return true;
        }
        if(30 == v) {
            this.u(((p)object0));
            return true;
        }
        return false;
    }

    public final void u(p p0) {
        this.u = p0;
        synchronized(this) {
            this.y |= 2L;
        }
        this.o();
    }
}

