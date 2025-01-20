package com.wave.components;

import Ea.e0;
import J9.g;
import J9.h;
import J9.i;
import M6.a;
import M6.e;
import N4.o;
import Nb.l;
import Nb.x;
import O6.b;
import Wc.j;
import Xb.J;
import a8.Q;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import hb.n;
import hd.c;
import io.sentry.i1;
import q9.I0;
import q9.m;
import q9.o0;
import q9.x1;
import v7.d;

public final class PlayStoreUpdaterFragment extends Fragment implements b {
    public e X0;
    public m Y0;
    public final Q Z0;
    public final Q a1;
    public final Q b1;
    public static final d c1;
    public static final Tb.e[] d1;
    public static final x1 e1;
    public static final x1 f1;
    public static final x1 g1;
    public static final j h1;
    public static final j i1;

    static {
        l l0 = new l(PlayStoreUpdaterFragment.class, "whenLastUpdateAttempted", "getWhenLastUpdateAttempted()Lorg/joda/time/DateTime;", 0);
        x.a.getClass();
        PlayStoreUpdaterFragment.d1 = new Tb.e[]{l0, new l(PlayStoreUpdaterFragment.class, "whenLastUpdateRequested", "getWhenLastUpdateRequested()Lorg/joda/time/DateTime;", 0), new l(PlayStoreUpdaterFragment.class, "whenLastReportedToSentry", "getWhenLastReportedToSentry()Lorg/joda/time/DateTime;", 0)};
        PlayStoreUpdaterFragment.c1 = new d(5);
        PlayStoreUpdaterFragment.e1 = new x1("UpdateLastAttempted");  // initializer: LB4/e;-><init>(Ljava/lang/String;)V
        PlayStoreUpdaterFragment.f1 = new x1("UpdateLastRequested");  // initializer: LB4/e;-><init>(Ljava/lang/String;)V
        PlayStoreUpdaterFragment.g1 = new x1("UpdateFailureReportedToSentry");  // initializer: LB4/e;-><init>(Ljava/lang/String;)V
        PlayStoreUpdaterFragment.h1 = j.c0;
        PlayStoreUpdaterFragment.i1 = j.Z;
    }

    public PlayStoreUpdaterFragment() {
        g g0 = new g(this, 0);
        e0 e00 = new e0(3);
        this.Z0 = o0.H(g0, PlayStoreUpdaterFragment.e1, e00);
        g g1 = new g(this, 1);
        e0 e01 = new e0(4);
        this.a1 = o0.H(g1, PlayStoreUpdaterFragment.f1, e01);
        g g2 = new g(this, 2);
        e0 e02 = new e0(5);
        this.b1 = o0.H(g2, PlayStoreUpdaterFragment.g1, e02);
    }

    @Override  // androidx.fragment.app.Fragment
    public final void A(Bundle bundle0) {
        super.A(bundle0);
        Context context0 = this.n();
        if(context0 != null) {
            this.Y0 = new m(context0, "Announcements");
            e e0 = o.l(context0);
            this.X0 = e0;
            if(e0 != null) {
                synchronized(e0) {
                    e0.b.a(this);
                }
                goto label_16;
            }
            Nb.j.p("appUpdateManager");
            throw null;
        }
    label_16:
        J9.j j0 = new J9.j(this, null);
        J.q(LifecycleOwnerKt.a(this), null, null, new I0(this, j0, null), 3);
    }

    @Override  // androidx.fragment.app.Fragment
    public final void C() {
        this.D0 = true;
        e e0 = this.X0;
        if(e0 != null) {
            synchronized(e0) {
                e0.b.b(this);
            }
            return;
        }
        Nb.j.p("appUpdateManager");
        throw null;
    }

    public static final void U(PlayStoreUpdaterFragment playStoreUpdaterFragment0, a a0) {
        playStoreUpdaterFragment0.getClass();
        Tb.e[] arr_e = PlayStoreUpdaterFragment.d1;
        if(j.e(((Wc.b)playStoreUpdaterFragment0.a1.B(arr_e[1], playStoreUpdaterFragment0)), new Wc.b()).a(j.d((playStoreUpdaterFragment0.d0 == null ? PlayStoreUpdaterFragment.h1.X : playStoreUpdaterFragment0.d0.getInt("EXTRA_MIN_DAYS_BETWEEN_UPDATE_REQUESTS", PlayStoreUpdaterFragment.h1.X)))) < 0) {  // initializer: LXc/d;-><init>()V
            c.a.n("PlayStoreUpdater");
            Wc.b b0 = (Wc.b)playStoreUpdaterFragment0.a1.B(arr_e[1], playStoreUpdaterFragment0);
            c.a.a("Update is available, but user was asked to update recently: " + b0 + ". Waiting until asking again", new Object[0]);
            return;
        }
        if(playStoreUpdaterFragment0.j() == null || !playStoreUpdaterFragment0.u()) {
            n.d("PlayStoreUpdater requestUpdate failed - fragment not attached to activity.", i1.WARNING, null, false, 12);
        }
        else {
            c.a.n("PlayStoreUpdater");
            c.a.a("update is available, prompting to download", new Object[0]);
            Wc.b b1 = new Wc.b();  // initializer: LXc/d;-><init>()V
            playStoreUpdaterFragment0.a1.U(arr_e[1], b1);
            if(playStoreUpdaterFragment0.X0 == null) {
                Nb.j.p("appUpdateManager");
                throw null;
            }
            M6.l l0 = M6.l.a(0);
            if(a0.a(l0) != null && !a0.f) {
                a0.f = true;
                playStoreUpdaterFragment0.T(a0.a(l0).getIntentSender(), 1, null, 0, 0, 0, null);
            }
        }
    }

    public final void V() {
        Tb.e[] arr_e = PlayStoreUpdaterFragment.d1;
        if(j.e(((Wc.b)this.Z0.B(arr_e[0], this)), new Wc.b()).a(j.d((this.d0 == null ? PlayStoreUpdaterFragment.i1.X : this.d0.getInt("EXTRA_MIN_DAYS_BETWEEN_UPDATE_ATTEMPTS", PlayStoreUpdaterFragment.i1.X)))) < 0) {  // initializer: LXc/d;-><init>()V
            c.a.n("PlayStoreUpdater");
            Wc.b b0 = (Wc.b)this.Z0.B(arr_e[0], this);
            c.a.a("Update has been downloaded, but user was asked to install recently: " + b0 + ". Waiting until asking again", new Object[0]);
            return;
        }
        Wc.b b1 = new Wc.b();  // initializer: LXc/d;-><init>()V
        this.Z0.U(arr_e[0], b1);
        c.a.n("PlayStoreUpdater");
        c.a.a("prompting update-ready!", new Object[0]);
        new AlertDialog.Builder(this.n()).setTitle(0x7F120463).setMessage(0x7F120462).setPositiveButton(0x7F1202DC, new h(0, this)).setNegativeButton(0x7F120091, new i(0)).show();  // string:update_alert_title "Update available"
    }

    @Override  // androidx.fragment.app.Fragment
    public final void y(int v, int v1, Intent intent0) {
        super.y(v, v1, intent0);
        if(v == 1) {
            switch(v1) {
                case 0: {
                    c.a.n("PlayStoreUpdater");
                    c.a.a("download declined", new Object[0]);
                    break;
                }
                case 1: {
                    c.a.n("PlayStoreUpdater");
                    c.a.a("download failed", new Object[0]);
                }
            }
        }
    }
}

