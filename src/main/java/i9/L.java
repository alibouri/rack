package i9;

import M9.c;
import Nb.j;
import R1.g;
import ac.B0;
import ac.j0;
import ac.o0;
import ac.z0;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import bc.n;
import j9.a;
import q9.R0;
import q9.U0;
import q9.q;
import q9.r1;
import q9.w;

public final class l extends g implements a {
    public final LinearLayout q;
    public w r;
    public String s;
    public String t;
    public final ProgressBar u;
    public final ImageView v;
    public final ProgressBar w;
    public final c x;
    public long y;

    public l(View view0) {
        Object[] arr_object = g.l(view0, 4, null, null);
        LinearLayout linearLayout0 = (LinearLayout)arr_object[0];
        super(null, view0, 3);
        this.q = linearLayout0;
        this.y = -1L;
        this.u = (ProgressBar)arr_object[1];
        ((ProgressBar)arr_object[1]).setTag(null);
        this.v = (ImageView)arr_object[2];
        ((ImageView)arr_object[2]).setTag(null);
        this.w = (ProgressBar)arr_object[3];
        ((ProgressBar)arr_object[3]).setTag(null);
        this.q.setTag(null);
        this.s(view0);
        this.x = new c(1, 2, this);
        this.j();
    }

    @Override  // j9.a
    public final void a(View view0, int v) {
        String s = this.s;
        String s1 = this.t;
        w w0 = this.r;
        if(w0 != null) {
            w0.g(s, s1);
        }
    }

    @Override  // R1.g
    public final void f() {
        long v;
        boolean z2;
        int v1;
        j0 j02;
        String s2;
        j0 j01;
        boolean z1;
        boolean z;
        j0 j00;
        n n1;
        n n0;
        synchronized(this) {
            v = this.y;
            this.y = 0L;
        }
        String s = this.s;
        String s1 = this.t;
        w w0 = this.r;
        CharSequence charSequence0 = null;
        if(Long.compare(0x6FL & v, 0L) == 0) {
            n0 = null;
            n1 = null;
            v1 = 0;
            z2 = false;
            z1 = false;
        }
        else {
            if((v & 104L) == 0L || w0 == null) {
                n0 = null;
                n1 = null;
            }
            else {
                j.f(s, "announcementId");
                q q0 = new q(null, s, w0, 4);
                n0 = o0.F(w0.Z, q0);
                q q1 = new q(null, s, w0, 0);
                n1 = o0.F(w0.Z, q1);
            }
            if((v & 105L) == 0L) {
                z = false;
                z1 = false;
            }
            else {
                if(w0 == null) {
                    j00 = null;
                }
                else {
                    j.f(s, "announcementId");
                    q q2 = new q(null, s, w0, 3);
                    j00 = q9.o0.b0(w0, o0.F(w0.Z, q2), Boolean.FALSE);
                }
                R1.j.e(this, 0, j00);
                z = g.q((j00 == null ? null : ((Boolean)((B0)j00.X).getValue())));
                z1 = !z;
            }
            if((v & 106L) == 0L) {
                s2 = null;
            }
            else {
                if(w0 == null) {
                    j01 = null;
                }
                else {
                    j.f(s, "announcementId");
                    q q3 = new q(null, s, w0, 1);
                    j01 = q9.o0.b0(w0, o0.F(w0.Z, q3), r1.d(0x7F120490, new Object[0]));  // string:voice_announcement_play_caption "Play announcement"
                }
                R1.j.e(this, 1, j01);
                s2 = j01 == null ? null : ((String)((B0)j01.X).getValue());
            }
            if((v & 108L) == 0L) {
                charSequence0 = s2;
                z2 = z;
                v1 = 0;
            }
            else {
                if(w0 == null) {
                    j02 = null;
                }
                else {
                    j.f(s, "announcementId");
                    q q4 = new q(null, s, w0, 2);
                    j02 = q9.o0.b0(w0, o0.F(w0.Z, q4), 0x7F0801D5);  // drawable:ic_audio_play
                }
                R1.j.e(this, 2, j02);
                if(j02 != null) {
                    charSequence0 = (Integer)((B0)j02.X).getValue();
                }
                v1 = g.p(((Integer)charSequence0));
                charSequence0 = s2;
                z2 = z;
            }
        }
        int v2 = Long.compare(80L & v, 0L);
        if((v & 105L) != 0L) {
            U0.o(this.u, z2);
            U0.o(this.v, z1);
        }
        if((v & 106L) != 0L && g.m >= 4) {
            this.v.setContentDescription(charSequence0);
        }
        if((0x40L & v) != 0L) {
            this.v.setOnClickListener(this.x);
        }
        if((108L & v) != 0L) {
            U0.j(this.v, v1);
        }
        if((v & 104L) != 0L) {
            j.f(this.w, "<this>");
            R0 r00 = new R0(this.w, 1);
            U0.a(this.w, n0, r00);
            j.f(this.w, "<this>");
            R0 r01 = new R0(this.w, 0);
            U0.a(this.w, n1, r01);
        }
        if(v2 != 0) {
            U0.o(this.q, v2 != 0 && s1 != null);
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
            this.y = 0x40L;
        }
        this.o();
    }

    @Override  // R1.g
    public final boolean m(int v, int v1, Object object0) {
        switch(v) {
            case 0: {
                z0 z00 = (z0)object0;
                return this.v(v1);
            }
            case 1: {
                z0 z01 = (z0)object0;
                return this.u(v1);
            }
            case 2: {
                z0 z02 = (z0)object0;
                if(v1 == 0) {
                    synchronized(this) {
                        this.y |= 4L;
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
        if(4 == v) {
            this.x(((String)object0));
            return true;
        }
        if(0x20 == v) {
            this.y(((String)object0));
            return true;
        }
        if(3 == v) {
            this.w(((w)object0));
            return true;
        }
        return false;
    }

    public final boolean u(int v) {
        if(v == 0) {
            synchronized(this) {
                this.y |= 2L;
            }
            return true;
        }
        return false;
    }

    public final boolean v(int v) {
        if(v == 0) {
            synchronized(this) {
                this.y |= 1L;
            }
            return true;
        }
        return false;
    }

    public final void w(w w0) {
        this.r = w0;
        synchronized(this) {
            this.y |= 0x20L;
        }
        this.o();
    }

    public final void x(String s) {
        this.s = s;
        synchronized(this) {
            this.y |= 8L;
        }
        this.o();
    }

    public final void y(String s) {
        this.t = s;
        synchronized(this) {
            this.y |= 16L;
        }
        this.o();
    }
}

