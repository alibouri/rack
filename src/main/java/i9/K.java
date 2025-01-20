package i9;

import M9.c;
import R1.g;
import Vb.q;
import W4.f;
import Y8.N;
import ac.B0;
import ac.h0;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import com.sendwave.components.SimpleRecyclerView;
import j9.a;
import j9.b;
import java.util.regex.Pattern;
import q9.i;

public final class k extends j implements a, b {
    public final g.a x;
    public final c y;
    public long z;

    public k(View view0) {
        Object[] arr_object = g.l(view0, 5, null, null);
        super(null, view0, ((ConstraintLayout)arr_object[0]), ((SimpleRecyclerView)arr_object[4]), ((ImageView)arr_object[2]), ((ProgressBar)arr_object[3]), ((EditText)arr_object[1]));
        this.z = -1L;
        this.q.setTag(null);
        this.r.setTag(null);
        this.s.setTag(null);
        this.t.setTag(null);
        this.u.setTag(null);
        this.s(view0);
        this.x = new g.a(this);
        this.y = new c(2, 2, this);
        this.j();
    }

    @Override  // j9.a
    public final void a(View view0, int v) {
        i i0 = this.v;
        if(i0 != null) {
            q9.c c0 = new q9.c(i0, null);
            N.k(i0, i0.c0, true, c0);
        }
    }

    @Override  // j9.b
    public final void b(CharSequence charSequence0) {
        i i0 = this.v;
        if(i0 != null && charSequence0 != null) {
            String s = charSequence0.toString();
            Nb.j.f(s, "s");
            Pattern pattern0 = Pattern.compile("[^a-zA-Z0-9., ]+");
            Nb.j.e(pattern0, "compile(...)");
            String s1 = pattern0.matcher(s).replaceAll("");
            Nb.j.e(s1, "replaceAll(...)");
            q.M(s1, " ", "%");
            i0.d0.getClass();
            i0.d0.l(null, s1);
        }
    }

    @Override  // R1.g
    public final void f() {
        long v;
        synchronized(this) {
            v = this.z;
            this.z = 0L;
        }
        Boolean boolean0 = null;
        Adapter recyclerView$Adapter0 = this.w;
        i i0 = this.v;
        int v1 = 0;
        if(Long.compare(v & 13L, 0L) != 0) {
            B0 b00 = i0 == null ? null : i0.e0;
            R1.j.e(this, 0, b00);
            if(b00 != null) {
                boolean0 = (Boolean)b00.getValue();
            }
            boolean z = g.q(boolean0);
            v |= (z ? 0x20L : 16L);
            if(!z) {
                v1 = 8;
            }
        }
        if((10L & v) != 0L) {
            this.r.setAdapter(recyclerView$Adapter0);
        }
        if((8L & v) != 0L) {
            this.s.setOnClickListener(this.y);
            f.N(this.u, this.x);
        }
        if((v & 13L) != 0L) {
            this.t.setVisibility(v1);
        }
    }

    @Override  // R1.g
    public final boolean i() {
        synchronized(this) {
            if(this.z != 0L) {
                return true;
            }
        }
        return false;
    }

    @Override  // R1.g
    public final void j() {
        synchronized(this) {
            this.z = 8L;
        }
        this.o();
    }

    @Override  // R1.g
    public final boolean m(int v, int v1, Object object0) {
        if(v != 0) {
            return false;
        }
        h0 h00 = (h0)object0;
        if(v1 == 0) {
            synchronized(this) {
                this.z |= 1L;
            }
            return true;
        }
        return false;
    }

    @Override  // R1.g
    public final boolean t(int v, Object object0) {
        if(2 == v) {
            this.u(((Adapter)object0));
            return true;
        }
        if(30 == v) {
            this.v(((i)object0));
            return true;
        }
        return false;
    }

    @Override  // i9.j
    public final void u(Adapter recyclerView$Adapter0) {
        this.w = recyclerView$Adapter0;
        synchronized(this) {
            this.z |= 2L;
        }
        this.o();
    }

    @Override  // i9.j
    public final void v(i i0) {
        this.v = i0;
        synchronized(this) {
            this.z |= 4L;
        }
        this.o();
    }
}

