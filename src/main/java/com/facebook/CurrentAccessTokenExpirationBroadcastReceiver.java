package com.facebook;

import M4.e;
import M4.l;
import Nb.j;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class CurrentAccessTokenExpirationBroadcastReceiver extends BroadcastReceiver {
    @Override  // android.content.BroadcastReceiver
    public final void onReceive(Context context0, Intent intent0) {
        j.f(context0, "context");
        j.f(intent0, "intent");
        if("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED".equals(intent0.getAction()) && l.l.get()) {
            e e0 = e.f.w();
            e0.b(e0.c, e0.c);
        }
    }
}

