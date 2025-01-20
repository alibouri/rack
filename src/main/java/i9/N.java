package i9;

import M9.c;
import Nb.j;
import R1.g;
import R2.w;
import W4.f;
import Y8.N;
import ac.h;
import android.net.Uri;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.lifecycle.LifecycleOwner;
import j9.a;
import q9.E;
import q9.O0;
import q9.Q;
import q9.S;
import q9.U0;
import q9.d0;

public final class n extends m implements a {
    public long A;
    public static final w B;
    public static final SparseIntArray C;
    public final c y;
    public final c z;

    static {
        w w0 = new w(8);
        n.B = w0;
        w0.G(2, new int[]{6}, new String[]{"announcement_audio_player"}, new int[]{0x7F0D0025});  // layout:announcement_audio_player
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        n.C = sparseIntArray0;
        sparseIntArray0.put(0x7F0A0167, 7);  // id:guideline
    }

    public n(View view0) {
        Object[] arr_object = g.l(view0, 8, n.B, n.C);
        l l0 = (l)arr_object[6];
        ConstraintLayout constraintLayout0 = (ConstraintLayout)arr_object[0];
        AppCompatImageView appCompatImageView0 = (AppCompatImageView)arr_object[5];
        ConstraintLayout constraintLayout1 = (ConstraintLayout)arr_object[2];
        Guideline guideline0 = (Guideline)arr_object[7];
        super(null, view0, l0, constraintLayout0, appCompatImageView0, constraintLayout1, ((ImageView)arr_object[1]), ((TextView)arr_object[4]), ((TextView)arr_object[3]));
        this.A = -1L;
        l l1 = this.q;
        if(l1 != null) {
            l1.i = this;
        }
        this.r.setTag(null);
        this.s.setTag(null);
        this.t.setTag(null);
        this.u.setTag(null);
        this.v.setTag(null);
        this.w.setTag(null);
        this.s(view0);
        this.y = new c(1, 2, this);
        this.z = new c(2, 2, this);
        this.j();
    }

    @Override  // j9.a
    public final void a(View view0, int v) {
        switch(v) {
            case 1: {
                E e0 = this.x;
                if(e0 != null) {
                    String s = e0.b;
                    d0 d00 = e0.a;
                    R2.m m0 = e0.h;
                    if(m0 != null) {
                        d00.getClass();
                        j.f(s, "announcementId");
                        Q q0 = new Q(d00, m0, s, e0.g, null);
                        N.j(d00, d00.c0, true, q0);
                        return;
                    }
                    String s1 = e0.f;
                    if(s1 != null) {
                        d00.getClass();
                        j.f(s, "sourceAnnouncementId");
                        S s2 = new S(d00, s, Uri.parse(s1), s1, null);
                        N.j(d00, d00.c0, true, s2);
                        return;
                    }
                }
                break;
            }
            case 2: {
                E e1 = this.x;
                if(e1 != null) {
                    e1.a.c(e1.b);
                    e1.a.h0.i();
                    return;
                }
                break;
            }
        }
    }

    @Override  // R1.g
    public final void f() {
        long v;
        q9.w w0;
        d0 d00;
        CharSequence charSequence0;
        h h0;
        boolean z;
        String s3;
        String s2;
        String s1;
        synchronized(this) {
            v = this.A;
            this.A = 0L;
        }
        E e0 = this.x;
        int v1 = Long.compare(6L & v, 0L);
        String s = null;
        if(v1 == 0) {
            z = false;
            w0 = null;
            s1 = null;
            s2 = null;
            h0 = null;
            charSequence0 = null;
        }
        else {
            if(e0 == null) {
                z = false;
                d00 = null;
                s1 = null;
                s2 = null;
                s3 = null;
                h0 = null;
                charSequence0 = null;
            }
            else {
                s1 = e0.g;
                s2 = e0.c;
                s3 = e0.b;
                z = e0.h != null || e0.f != null;
                h0 = e0.e;
                charSequence0 = e0.d;
                d00 = e0.a;
            }
            if(d00 != null) {
                s = d00.h0;
            }
            w0 = s;
            s = s3;
        }
        if(v1 != 0) {
            this.q.x(s);
            this.q.w(w0);
            this.q.y(s1);
            this.r.setFocusable(z);
            this.r.setTag(s);
            this.r.setOnClickListener(this.y);
            this.r.setClickable(z);
            j.f(this.u, "<this>");
            O0 o00 = new O0(this.u, 0);
            U0.a(this.u, h0, o00);
            f.M(this.v, charSequence0);
            f.M(this.w, s2);
        }
        if((v & 4L) != 0L) {
            this.s.setOnClickListener(this.z);
        }
        this.q.g();
    }

    @Override  // R1.g
    public final boolean i() {
        synchronized(this) {
            if(Long.compare(this.A, 0L) != 0) {
                return true;
            }
        }
        return this.q.i();
    }

    @Override  // R1.g
    public final void j() {
        synchronized(this) {
            this.A = 4L;
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
                this.A |= 1L;
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
        if(16 == v) {
            this.x = (E)object0;
            synchronized(this) {
                this.A |= 2L;
            }
            this.o();
            return true;
        }
        return false;
    }
}

