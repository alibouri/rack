package com.wave.customer.risk;

import Ab.k;
import Bb.p;
import Bb.q;
import E7.u;
import I2.B;
import I2.J;
import I2.e;
import I2.g;
import I2.m;
import Nb.j;
import R9.Z0;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.concurrent.TimeUnit;

public final class PackageInstallReceiver extends BroadcastReceiver {
    @Override  // android.content.BroadcastReceiver
    public final void onReceive(Context context0, Intent intent0) {
        j.f(context0, "context");
        if(!p.k0(q.L(new String[]{"android.intent.action.PACKAGE_REPLACED", "android.intent.action.PACKAGE_ADDED"}), (intent0 == null ? null : intent0.getAction()))) {
            return;
        }
        if(intent0 != null) {
            Uri uri0 = intent0.getData();
            if(uri0 != null) {
                String s = uri0.getSchemeSpecificPart();
                if(s != null && Z0.a(context0).d().h() != null) {
                    e e0 = new e();
                    J.O(e0);
                    g g0 = e0.a();
                    new k[]{new k("packageName", s)};
                    k k0 = new k("packageName", s);
                    I2.k k1 = new I2.k(0);
                    k1.c(k0.Y, ((String)k0.X));
                    m m0 = k1.b();
                    u u0 = new u(SuspiciousPackageCheckWorker.class);
                    ((R2.p)u0.c).j = g0;
                    ((R2.p)u0.c).e = m0;
                    u0.s(1, TimeUnit.MILLISECONDS);
                    B b0 = u0.a();
                    J2.u u1 = J2.u.V(context0);
                    j.e(u1, "getInstance(context)");
                    u1.y(b0);
                }
            }
        }
    }
}

