package com.google.android.play.core.review;

import S6.c;
import T6.e;
import T6.g;
import U6.a;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import java.util.Locale;
import o6.i;
import o6.k;
import o6.p;
import q9.z3;

public final class b {
    public final c a;
    public final Handler b;

    public b(c c0) {
        this.b = new Handler(Looper.getMainLooper());
        this.a = c0;
    }

    public final p a(z3 z30, ReviewInfo reviewInfo0) {
        if(((zza)reviewInfo0).Y) {
            return k.e(null);
        }
        Intent intent0 = new Intent(z30, PlayCoreDialogWrapperActivity.class);
        intent0.putExtra("confirmation_intent", ((zza)reviewInfo0).X);
        intent0.putExtra("window_flags", z30.getWindow().getDecorView().getWindowSystemUiVisibility());
        i i0 = new i();
        intent0.putExtra("result_receiver", new zzc(this.b, i0));
        z30.startActivity(intent0);
        return i0.a;
    }

    public final p b() {
        c c0 = this.a;
        e e0 = c.c;
        e0.b("requestInAppReview (%s)", new Object[]{c0.b});
        T6.i i0 = c0.a;
        if(i0 == null) {
            if(Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", e.d(e0.a, "Play Store app is either not installed or not the official version", new Object[0]));
            }
            Locale locale0 = Locale.getDefault();
            Integer integer0 = -1;
            Integer integer1 = -1;
            return a.a.containsKey(integer1) ? k.d(new S6.a(new Status(-1, String.format(locale0, "Review Error(%d): %s", integer0, ((String)a.a.get(integer1)) + " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#" + ((String)a.b.get(integer1)) + ")"), null, null))) : k.d(new S6.a(new Status(-1, String.format(locale0, "Review Error(%d): %s", integer0, ""), null, null)));  // initializer: LL5/d;-><init>(Lcom/google/android/gms/common/api/Status;)V / initializer: LL5/d;-><init>(Lcom/google/android/gms/common/api/Status;)V
        }
        i i1 = new i();
        g g0 = new g(i0, i1, i1, new S6.b(c0, i1, i1));
        i0.a().post(g0);
        return i1.a;
    }
}

