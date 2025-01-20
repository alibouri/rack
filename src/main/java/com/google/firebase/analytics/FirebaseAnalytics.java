package com.google.firebase.analytics;

import N5.r;
import Z6.g;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import c7.a;
import com.google.android.gms.internal.measurement.e0;
import com.google.android.gms.internal.measurement.i0;
import j6.I0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o6.k;
import y7.c;
import y7.d;

public final class FirebaseAnalytics {
    public final e0 a;
    public static volatile FirebaseAnalytics b;

    public FirebaseAnalytics(e0 e00) {
        r.j(e00);
        this.a = e00;
    }

    @Keep
    public final String getFirebaseInstanceId() {
        try {
            return (String)k.b(((c)g.c().b(d.class)).d(), 30000L, TimeUnit.MILLISECONDS);
        }
        catch(ExecutionException executionException0) {
            throw new IllegalStateException(executionException0.getCause());
        }
        catch(TimeoutException unused_ex) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
        catch(InterruptedException interruptedException0) {
            throw new IllegalStateException(interruptedException0);
        }
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context0) {
        if(FirebaseAnalytics.b == null) {
            Class class0 = FirebaseAnalytics.class;
            synchronized(class0) {
                if(FirebaseAnalytics.b == null) {
                    FirebaseAnalytics.b = new FirebaseAnalytics(e0.b(context0, null));
                }
            }
        }
        return FirebaseAnalytics.b;
    }

    @Keep
    public static I0 getScionFrontendApiImplementation(Context context0, Bundle bundle0) {
        e0 e00 = e0.b(context0, bundle0);
        return e00 == null ? null : new a(e00);
    }

    @Keep
    @Deprecated
    public final void setCurrentScreen(Activity activity0, String s, String s1) {
        this.a.getClass();
        i0 i00 = new i0(this.a, activity0, s, s1);
        this.a.e(i00);
    }
}

