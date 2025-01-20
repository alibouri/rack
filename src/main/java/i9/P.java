package i9;

import E7.u;
import M9.c;
import R1.g;
import R2.w;
import W4.f;
import Y8.N;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.lifecycle.LifecycleOwner;
import j9.a;
import q9.A;
import q9.B;
import q9.C;
import q9.U0;

public final class p extends o implements a {
    public final c A;
    public final c B;
    public long C;
    public static final w D;
    public static final SparseIntArray E;
    public final TextView y;
    public final c z;

    static {
        w w0 = new w(12);
        p.D = w0;
        w0.G(0, new int[]{7}, new String[]{"announcement_audio_player"}, new int[]{0x7F0D0025});  // layout:announcement_audio_player
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        p.E = sparseIntArray0;
        sparseIntArray0.put(0x7F0A0307, 8);  // id:toolbar
        sparseIntArray0.put(0x7F0A0114, 9);  // id:detailScroll
        sparseIntArray0.put(0x7F0A00AF, 10);  // id:buttons
        sparseIntArray0.put(0x7F0A0167, 11);  // id:guideline
    }

    public p(View view0) {
        Object[] arr_object = g.l(view0, 12, p.D, p.E);
        l l0 = (l)arr_object[7];
        Button button0 = (Button)arr_object[5];
        Button button1 = (Button)arr_object[6];
        LinearLayout linearLayout0 = (LinearLayout)arr_object[10];
        ImageButton imageButton0 = (ImageButton)arr_object[1];
        ScrollView scrollView0 = (ScrollView)arr_object[9];
        TextView textView0 = (TextView)arr_object[3];
        Guideline guideline0 = (Guideline)arr_object[11];
        super(null, view0, l0, button0, button1, imageButton0, textView0, ((ImageView)arr_object[2]), ((Toolbar)arr_object[8]));
        this.C = -1L;
        l l1 = this.q;
        if(l1 != null) {
            l1.i = this;
        }
        this.r.setTag(null);
        this.s.setTag(null);
        this.t.setTag(null);
        this.u.setTag(null);
        this.v.setTag(null);
        ((ConstraintLayout)arr_object[0]).setTag(null);
        this.y = (TextView)arr_object[4];
        ((TextView)arr_object[4]).setTag(null);
        this.s(view0);
        this.z = new c(2, 2, this);
        this.A = new c(3, 2, this);
        this.B = new c(1, 2, this);
        this.j();
    }

    @Override  // j9.a
    public final void a(View view0, int v) {
        switch(v) {
            case 1: {
                C c0 = this.x;
                if(c0 != null) {
                    B b0 = new B(c0, null);
                    N.k(c0, c0.Y, true, b0);
                    return;
                }
                break;
            }
            case 2: {
                C c1 = this.x;
                if(c1 != null) {
                    u u0 = c1.f0;
                    if(u0 != null) {
                        C c2 = (C)u0.d;
                        A a0 = new A(u0, c2, null);
                        N.k(c2, c2.Y, true, a0);
                        return;
                    }
                }
                break;
            }
            case 3: {
                C c3 = this.x;
                if(c3 != null) {
                    u u1 = c3.g0;
                    if(u1 != null) {
                        C c4 = (C)u1.d;
                        A a1 = new A(u1, c4, null);
                        N.k(c4, c4.Y, true, a1);
                        return;
                    }
                }
                break;
            }
        }
    }

    @Override  // R1.g
    public final void f() {
        long v;
        CharSequence charSequence1;
        boolean z1;
        CharSequence charSequence0;
        boolean z;
        q9.w w1;
        u u1;
        u u0;
        String s4;
        String s3;
        String s2;
        String s1;
        String s;
        synchronized(this) {
            v = this.C;
            this.C = 0L;
        }
        C c0 = this.x;
        int v1 = Long.compare(6L & v, 0L);
        q9.w w0 = null;
        if(v1 == 0) {
            charSequence1 = null;
            s = null;
            s1 = null;
            s2 = null;
            s3 = null;
            s4 = null;
            charSequence0 = null;
            z = false;
            z1 = false;
        }
        else {
            if(c0 == null) {
                w1 = null;
                s = null;
                s1 = null;
                s2 = null;
                s3 = null;
                s4 = null;
                u0 = null;
                u1 = null;
            }
            else {
                s = c0.d0;
                s1 = c0.Z;
                s2 = c0.e0;
                s3 = c0.b0;
                s4 = c0.c0;
                u0 = c0.f0;
                u1 = c0.g0;
                w1 = c0.h0;
            }
            if(u0 == null) {
                charSequence0 = null;
                z = false;
            }
            else {
                z = u0.a;
                charSequence0 = (String)u0.c;
            }
            if(u1 == null) {
                z1 = false;
            }
            else {
                w0 = (String)u1.c;
                z1 = u1.a;
            }
            q9.w w2 = w0;
            w0 = w1;
            charSequence1 = w2;
        }
        if(v1 != 0) {
            this.q.w(w0);
            this.q.x(s4);
            this.q.y(s);
            f.M(this.r, charSequence0);
            U0.o(this.r, z);
            f.M(this.s, charSequence1);
            U0.o(this.s, z1);
            f.M(this.u, s1);
            U0.f(this.v, s2);
            f.M(this.y, s3);
        }
        if((v & 4L) != 0L) {
            this.r.setOnClickListener(this.z);
            this.s.setOnClickListener(this.A);
            this.t.setOnClickListener(this.B);
        }
        this.q.g();
    }

    @Override  // R1.g
    public final boolean i() {
        synchronized(this) {
            if(Long.compare(this.C, 0L) != 0) {
                return true;
            }
        }
        return this.q.i();
    }

    @Override  // R1.g
    public final void j() {
        synchronized(this) {
            this.C = 4L;
        }
        this.q.j();
        this.o();
    }

    @Override  // R1.g
    public final boolean m(int v, int v1, Object object0) {
        if(v != 0) {
            return false;
        }
        l l0 = (l)object0;
        if(v1 == 0) {
            synchronized(this) {
                this.C |= 1L;
            }
            return true;
        }
        return false;
    }

    @Override  // R1.g
    public final void r(LifecycleOwner lifecycleOwner0) {
        super.r(lifecycleOwner0);
        this.q.r(lifecycleOwner0);
    }

    @Override  // R1.g
    public final boolean t(int v, Object object0) {
        if(30 == v) {
            this.u(((C)object0));
            return true;
        }
        return false;
    }

    @Override  // i9.o
    public final void u(C c0) {
        this.x = c0;
        synchronized(this) {
            this.C |= 2L;
        }
        this.o();
    }
}

