package q9;

import Nb.j;
import V8.c;
import Y8.N;
import ac.B0;
import ac.d0;
import ac.j0;
import ac.o0;
import android.media.MediaPlayer;
import androidx.lifecycle.SubViewModel;
import androidx.lifecycle.ViewModel;
import bc.n;

public final class w extends SubViewModel {
    public final P2 Y;
    public final B0 Z;
    public final j0 b0;
    public final n c0;
    public final h d0;
    public final h e0;
    public final n f0;
    public final ac.h g0;
    public final n h0;

    public w(c c0, ViewModel viewModel0) {
        super(viewModel0);
        Boolean boolean0 = Boolean.FALSE;
        B0 b00 = o0.c(boolean0);
        this.Z = o0.c("");
        this.b0 = q9.o0.b0(this, o0.F(b00, new t(null, this, 0)), boolean0);
        n n0 = o0.F(b00, new t(null, this, 1));
        this.c0 = n0;
        this.d0 = new h(n0, 1);
        this.e0 = new h(n0, 2);
        this.f0 = o0.F(b00, new t(null, this, 2));
        this.g0 = o0.n(o0.F(b00, new t(null, this, 3)));
        this.h0 = o0.F(b00, new t(null, this, 4));
        this.Y = new P2(c0, viewModel0);
        b00.l(null, Boolean.TRUE);
    }

    public final ac.h c() {
        p p0 = new p(null);
        return new d0(new ac.h[]{this.b0, this.c0, this.f0, this.h0, this.Z}, p0, 1);
    }

    public final void d(String s, String s1) {
        j.f(s, "announcementId");
        j.f(s1, "voiceMessageUri");
        P2 p20 = this.Y;
        if(p20 == null) {
            return;
        }
        p20.c(s1);
        this.Z.getClass();
        this.Z.l(null, s);
    }

    public final void e() {
        P2 p20 = this.Y;
        if(p20 == null) {
            return;
        }
        if(p20 != null) {
            p20.d();
            return;
        }
        j.p("audioPlayer");
        throw null;
    }

    public final void g(String s, String s1) {
        j.f(s, "announcementId");
        j.f(s1, "voiceMessageUri");
        if(this.Y == null) {
            return;
        }
        this.Z.getClass();
        this.Z.l(null, s);
        P2 p20 = this.Y;
        if(p20 != null) {
            if(!j.a(p20.c0, s1)) {
                P2 p21 = this.Y;
                if(p21 != null) {
                    p21.Z.getClass();
                    p21.Z.l(null, g2.a);
                    MediaPlayer mediaPlayer0 = p21.b0;
                    if(mediaPlayer0 != null) {
                        mediaPlayer0.release();
                    }
                    p21.e0.getClass();
                    p21.e0.l(null, 0);
                    p21.c0 = "";
                    P2 p22 = this.Y;
                    if(p22 != null) {
                        p22.c(s1);
                        P2 p23 = this.Y;
                        if(p23 != null) {
                            p23.c0 = s1;
                            goto label_32;
                        }
                        j.p("audioPlayer");
                        throw null;
                    }
                    j.p("audioPlayer");
                    throw null;
                }
                j.p("audioPlayer");
                throw null;
            }
        label_32:
            P2 p24 = this.Y;
            if(p24 != null) {
                K2 k20 = new K2(p24, null);
                N.j(p24, p24.Y, true, k20);
                return;
            }
            j.p("audioPlayer");
            throw null;
        }
        j.p("audioPlayer");
        throw null;
    }

    public final void i() {
        P2 p20 = this.Y;
        if(p20 == null) {
            return;
        }
        p20.d();
        P2 p21 = this.Y;
        if(p21 != null) {
            h2 h20 = (h2)p21.Z.getValue();
            if(j.a(h20, d2.a) || j.a(h20, f2.a) || j.a(h20, b2.b) || j.a(h20, b2.c)) {
                MediaPlayer mediaPlayer0 = p21.b0;
                if(mediaPlayer0 != null) {
                    mediaPlayer0.seekTo(0);
                }
            }
            return;
        }
        j.p("audioPlayer");
        throw null;
    }
}

