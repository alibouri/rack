package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import B5.a;
import N4.c;
import a8.Q;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import r5.i;
import r5.o;
import x5.e;

public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static final int a;

    @Override  // android.content.BroadcastReceiver
    public final void onReceive(Context context0, Intent intent0) {
        String s = intent0.getData().getQueryParameter("backendName");
        String s1 = intent0.getData().getQueryParameter("extras");
        int v = (int)Integer.valueOf(intent0.getData().getQueryParameter("priority"));
        int v1 = intent0.getExtras().getInt("attemptNumber");
        o.b(context0);
        Q q0 = i.a();
        q0.O(s);
        q0.b0 = a.b(v);
        if(s1 != null) {
            q0.Z = Base64.decode(s1, 0);
        }
        o o0 = o.a();
        i i0 = q0.f();
        c c0 = new c(19);
        o0.d.getClass();
        e e0 = new e(o0.d, i0, v1, c0);
        o0.d.e.execute(e0);
    }
}

