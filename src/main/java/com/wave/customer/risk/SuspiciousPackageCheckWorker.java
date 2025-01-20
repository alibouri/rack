package com.wave.customer.risk;

import Fb.c;
import Nb.j;
import R9.Z0;
import W5.f;
import Xb.J;
import Xb.V;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.wave.customer.CustomerApp;
import kotlin.coroutines.g;
import xa.a;
import xa.b;

public final class SuspiciousPackageCheckWorker extends CoroutineWorker {
    public final CustomerApp g;

    public SuspiciousPackageCheckWorker(Context context0, WorkerParameters workerParameters0) {
        j.f(context0, "context");
        j.f(workerParameters0, "params");
        super(context0, workerParameters0);
        this.g = Z0.a(context0);
    }

    @Override  // androidx.work.CoroutineWorker
    public final Object c(g g0) {
        a a0;
        if(g0 instanceof a) {
            a0 = (a)g0;
            int v = a0.d0;
            if((v & 0x80000000) == 0) {
                a0 = new a(this, ((c)g0));
            }
            else {
                a0.d0 = v ^ 0x80000000;
            }
        }
        else {
            a0 = new a(this, ((c)g0));
        }
        Object object0 = a0.b0;
        Object object1 = Eb.a.X;
        switch(a0.d0) {
            case 0: {
                f.b0(object0);
                b b0 = new b(this, null);
                a0.d0 = 1;
                object0 = J.y(V.c, b0, a0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        j.e(object0, "withContext(...)");
        return object0;
    }
}

