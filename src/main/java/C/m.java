package c;

import Nb.j;
import Q4.i;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.result.IntentSenderRequest;
import c2.x;
import f.h;
import g.a;
import v1.b;

public final class m extends h {
    public final x h;

    public m(x x0) {
        this.h = x0;
        super();
    }

    @Override  // f.h
    public final void b(int v, i i0, Object object0) {
        Bundle bundle2;
        x x0 = this.h;
        a a0 = i0.D(x0, object0);
        if(a0 != null) {
            new Handler(Looper.getMainLooper()).post(new l(v, 0, this, a0));
            return;
        }
        Intent intent0 = i0.t(x0, object0);
        if(intent0.getExtras() != null) {
            Bundle bundle0 = intent0.getExtras();
            j.c(bundle0);
            if(bundle0.getClassLoader() == null) {
                intent0.setExtrasClassLoader(x0.getClassLoader());
            }
        }
        if(intent0.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            Bundle bundle1 = intent0.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intent0.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            bundle2 = bundle1;
        }
        else {
            bundle2 = null;
        }
        if("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intent0.getAction())) {
            String[] arr_s = intent0.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if(arr_s == null) {
                arr_s = new String[0];
            }
            b.f(x0, arr_s, v);
            return;
        }
        if("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intent0.getAction())) {
            IntentSenderRequest intentSenderRequest0 = (IntentSenderRequest)intent0.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                j.c(intentSenderRequest0);
                x0.startIntentSenderForResult(intentSenderRequest0.X, v, intentSenderRequest0.Y, intentSenderRequest0.Z, intentSenderRequest0.b0, 0, bundle2);
            }
            catch(IntentSender.SendIntentException intentSender$SendIntentException0) {
                new Handler(Looper.getMainLooper()).post(new l(v, 1, this, intentSender$SendIntentException0));
            }
            return;
        }
        x0.startActivityForResult(intent0, v, bundle2);
    }
}

