package com.google.android.play.core.review;

import N6.d;
import T6.e;
import T6.h;
import android.app.PendingIntent;
import android.os.Bundle;
import o6.i;

public final class c extends d {
    public final e e;
    public final i f;
    public final S6.c g;

    public c(S6.c c0, i i0) {
        e e0 = new e("OnRequestInstallCallback", 0);
        this.g = c0;
        super(1);
        this.attachInterface(this, "com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
        this.e = e0;
        this.f = i0;
    }

    public final void o(Bundle bundle0) {
        T6.i i0 = this.g.a;
        if(i0 != null) {
            synchronized(i0.f) {
                i0.e.remove(this.f);
            }
            h h0 = new h(0, i0);
            i0.a().post(h0);
        }
        this.e.b("onGetLaunchReviewFlowInfo", new Object[0]);
        zza zza0 = new zza(((PendingIntent)bundle0.get("confirmation_intent")), bundle0.getBoolean("is_review_no_op"));
        this.f.d(zza0);
    }
}

