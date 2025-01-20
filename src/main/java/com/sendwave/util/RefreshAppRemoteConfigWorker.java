package com.sendwave.util;

import Eb.a;
import Fb.c;
import Nb.j;
import W5.f;
import Xb.J;
import Xb.V;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import kotlin.coroutines.g;
import q9.B2;
import q9.C2;
import q9.C3;
import q9.r1;

public final class RefreshAppRemoteConfigWorker extends CoroutineWorker {
    public final C3 g;

    public RefreshAppRemoteConfigWorker(Context context0, WorkerParameters workerParameters0) {
        j.f(context0, "appContext");
        j.f(workerParameters0, "params");
        super(context0, workerParameters0);
        this.g = r1.b(context0);
    }

    @Override  // androidx.work.CoroutineWorker
    public final Object c(g g0) {
        B2 b20;
        if(g0 instanceof B2) {
            b20 = (B2)g0;
            int v = b20.d0;
            if((v & 0x80000000) == 0) {
                b20 = new B2(this, ((c)g0));
            }
            else {
                b20.d0 = v ^ 0x80000000;
            }
        }
        else {
            b20 = new B2(this, ((c)g0));
        }
        Object object0 = b20.b0;
        Object object1 = a.X;
        switch(b20.d0) {
            case 0: {
                f.b0(object0);
                C2 c20 = new C2(this, null);
                b20.d0 = 1;
                object0 = J.y(V.c, c20, b20);
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

