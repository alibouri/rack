package i9;

import Bb.q;
import M9.c;
import R1.g;
import W4.f;
import Y8.N;
import ac.B0;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import com.sendwave.components.SimpleRecyclerView;
import f9.j;
import j9.a;
import p9.T;
import p9.U;

public final class h0 extends f0 implements a {
    public final SwitchCompat v;
    public final c w;
    public g0 x;
    public long y;

    public h0(View view0) {
        Object[] arr_object = g.l(view0, 5, null, null);
        super(null, view0, ((SimpleRecyclerView)arr_object[4]), ((TextView)arr_object[3]), ((Toolbar)arr_object[1]));
        this.y = -1L;
        this.q.setTag(null);
        this.r.setTag(null);
        ((LinearLayout)arr_object[0]).setTag(null);
        this.v = (SwitchCompat)arr_object[2];
        ((SwitchCompat)arr_object[2]).setTag(null);
        this.s.setTag(null);
        this.s(view0);
        this.w = new c(1, 2, this);
        this.j();
    }

    @Override  // j9.a
    public final void a(View view0, int v) {
        U u0 = this.u;
        if(u0 != null) {
            if(!((Boolean)u0.d0.getValue()).booleanValue()) {
                int v1 = 0;
                for(Object object0: ((Iterable)u0.Z.getValue())) {
                    if(v1 >= 0) {
                        j j0 = (j)object0;
                        u0.p(v1, false);
                        ++v1;
                        continue;
                    }
                    q.Z();
                    throw null;
                }
            }
            T t0 = new T(u0, null);
            N.k(u0, u0.c0, true, t0);
        }
    }

    @Override  // R1.g
    public final void f() {
        long v;
        int v1;
        g0 g01;
        CharSequence charSequence0;
        boolean z;
        String s2;
        String s1;
        g0 g00;
        String s;
        synchronized(this) {
            v = this.y;
            this.y = 0L;
        }
        U u0 = this.u;
        Adapter recyclerView$Adapter0 = this.t;
        if(Long.compare(23L & v, 0L) == 0) {
            z = false;
            g01 = null;
            s1 = null;
            s2 = null;
            v1 = 0;
            charSequence0 = null;
        }
        else {
            if((v & 21L) == 0L) {
                s = null;
            }
            else {
                B0 b00 = u0 == null ? null : u0.e0;
                R1.j.e(this, 0, b00);
                s = b00 == null ? null : ((String)b00.getValue());
            }
            if((v & 20L) == 0L || u0 == null) {
                s1 = null;
                s2 = null;
                g00 = null;
            }
            else {
                g00 = this.x;
                if(g00 == null) {
                    g00 = new g0(0);
                    this.x = g00;
                }
                g00.b = u0;
                s1 = u0.Y.X;
                s2 = u0.Y.Y;
            }
            if(Long.compare(v & 22L, 0L) == 0) {
                charSequence0 = s;
                g01 = g00;
                z = false;
                v1 = 0;
            }
            else {
                B0 b01 = u0 == null ? null : u0.d0;
                R1.j.e(this, 1, b01);
                z = g.q((b01 == null ? null : ((Boolean)b01.getValue())));
                v |= (z ? 0x40L : 0x20L);
                charSequence0 = s;
                g01 = g00;
                v1 = z ? 0 : 8;
            }
        }
        if((24L & v) != 0L) {
            this.q.setAdapter(recyclerView$Adapter0);
        }
        if((22L & v) != 0L) {
            this.q.setVisibility(v1);
            SwitchCompat switchCompat0 = this.v;
            if(switchCompat0.isChecked() != z) {
                switchCompat0.setChecked(z);
            }
        }
        if((21L & v) != 0L) {
            f.M(this.r, charSequence0);
        }
        if((20L & v) != 0L) {
            f.M(this.v, s2);
            this.v.setOnCheckedChangeListener(g01);
            this.s.setTitle(s1);
        }
        if((v & 16L) != 0L) {
            this.s.setOnClickListener(this.w);
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
            this.y = 16L;
        }
        this.o();
    }

    @Override  // R1.g
    public final boolean m(int v, int v1, Object object0) {
        switch(v) {
            case 0: {
                ac.h0 h00 = (ac.h0)object0;
                return this.w(v1);
            }
            case 1: {
                ac.h0 h01 = (ac.h0)object0;
                if(v1 == 0) {
                    synchronized(this) {
                        this.y |= 2L;
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
        if(0x1F == v) {
            this.v(((U)object0));
            return true;
        }
        if(17 == v) {
            this.u(((Adapter)object0));
            return true;
        }
        return false;
    }

    @Override  // i9.f0
    public final void u(Adapter recyclerView$Adapter0) {
        this.t = recyclerView$Adapter0;
        synchronized(this) {
            this.y |= 8L;
        }
        this.o();
    }

    @Override  // i9.f0
    public final void v(U u0) {
        this.u = u0;
        synchronized(this) {
            this.y |= 4L;
        }
        this.o();
    }

    public final boolean w(int v) {
        if(v == 0) {
            synchronized(this) {
                this.y |= 1L;
            }
            return true;
        }
        return false;
    }
}

