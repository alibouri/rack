package i9;

import Ab.k;
import M9.c;
import R1.g;
import W4.f;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ca.o;
import j9.a;
import q9.u0;

public final class t extends o implements a {
    public final ImageButton t;
    public final TextView u;
    public final Button v;
    public final c w;
    public final c x;
    public long y;
    public static final SparseIntArray z;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        t.z = sparseIntArray0;
        sparseIntArray0.put(0x7F0A022A, 5);  // id:overdraft_icon
    }

    public t(View view0) {
        Object[] arr_object = g.l(view0, 6, null, t.z);
        ImageView imageView0 = (ImageView)arr_object[5];
        super(null, view0, ((TextView)arr_object[2]));
        this.y = -1L;
        ((LinearLayout)arr_object[0]).setTag(null);
        this.t = (ImageButton)arr_object[1];
        ((ImageButton)arr_object[1]).setTag(null);
        this.u = (TextView)arr_object[3];
        ((TextView)arr_object[3]).setTag(null);
        this.v = (Button)arr_object[4];
        ((Button)arr_object[4]).setTag(null);
        this.q.setTag(null);
        this.s(view0);
        this.w = new c(2, 2, this);
        this.x = new c(1, 2, this);
        this.j();
    }

    @Override  // j9.a
    public final void a(View view0, int v) {
        switch(v) {
            case 1: {
                u0 u00 = (u0)this.s;
                if(u00 != null) {
                    u00.a();
                    return;
                }
                break;
            }
            case 2: {
                u0 u01 = (u0)this.s;
                if(u01 != null) {
                    u01.b.onClick(u01.a, -1);
                    return;
                }
                break;
            }
        }
    }

    @Override  // R1.g
    public final void f() {
        long v;
        String s1;
        String s;
        synchronized(this) {
            v = this.y;
            this.y = 0L;
        }
        k k0 = (k)this.r;
        int v1 = Long.compare(5L & v, 0L);
        if(v1 == 0 || k0 == null) {
            s = null;
            s1 = null;
        }
        else {
            s = (String)k0.X;
            s1 = (String)k0.Y;
        }
        if((v & 4L) != 0L) {
            this.t.setOnClickListener(this.x);
            this.v.setOnClickListener(this.w);
        }
        if(v1 != 0) {
            f.M(this.u, s1);
            f.M(this.q, s);
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
        if(20 == v) {
            this.r = (k)object0;
            synchronized(this) {
                this.y |= 1L;
            }
            this.o();
            return true;
        }
        if(10 == v) {
            this.u(((u0)object0));
            return true;
        }
        return false;
    }

    public final void u(u0 u00) {
        this.s = u00;
        synchronized(this) {
            this.y |= 2L;
        }
        this.o();
    }
}

