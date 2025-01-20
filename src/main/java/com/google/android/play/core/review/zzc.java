package com.google.android.play.core.review;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import o6.i;

final class zzc extends ResultReceiver {
    public final i X;

    public zzc(Handler handler0, i i0) {
        this.X = i0;
        super(handler0);
    }

    @Override  // android.os.ResultReceiver
    public final void onReceiveResult(int v, Bundle bundle0) {
        this.X.d(null);
    }
}

