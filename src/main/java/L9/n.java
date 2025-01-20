package L9;

import K9.k;
import K9.p;
import M9.b;
import M9.c;
import Nb.j;
import Q4.i;
import R1.g;
import W4.f;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.regex.Pattern;

public final class n extends m implements b {
    public final LinearLayout s;
    public final c t;
    public long u;
    public static final SparseIntArray v;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        n.v = sparseIntArray0;
        sparseIntArray0.put(0x7F0A0051, 2);  // id:add_contact_icon
    }

    public n(View view0) {
        Object[] arr_object = g.l(view0, 3, null, n.v);
        ImageView imageView0 = (ImageView)arr_object[2];
        super(null, view0, ((TextView)arr_object[1]));
        this.u = -1L;
        ((TextView)this.q).setTag(null);
        this.s = (LinearLayout)arr_object[0];
        ((LinearLayout)arr_object[0]).setTag(null);
        this.s(view0);
        this.t = new c(1, 0, this);
        this.j();
    }

    @Override  // M9.b
    public final void a(View view0, int v) {
        p p0 = (p)this.r;
        if(p0 != null) {
            Pattern pattern0 = Pattern.compile("\\+?[\\d\\s-]+");
            j.e(pattern0, "compile(...)");
            String s = (String)p0.m0.a(p.o0[0], p0);
            if(s == null) {
                s = "";
            }
            boolean z = pattern0.matcher(s).matches();
            k k0 = p0.d0;
            if(z) {
                i.A(k0, null, s, 1);
                return;
            }
            i.A(k0, s, null, 2);
        }
    }

    @Override  // R1.g
    public final void f() {
        long v;
        synchronized(this) {
            v = this.u;
            this.u = 0L;
        }
        p p0 = (p)this.r;
        int v1 = Long.compare(3L & v, 0L);
        String s = v1 == 0 || p0 == null ? null : p0.b0;
        if(v1 != 0) {
            f.M(((TextView)this.q), s);
        }
        if((v & 2L) != 0L) {
            this.s.setOnClickListener(this.t);
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
        if(16 == v) {
            this.r = (p)object0;
            synchronized(this) {
                this.u |= 1L;
            }
            this.o();
            return true;
        }
        return false;
    }
}

