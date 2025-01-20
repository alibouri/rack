package V4;

import M4.B;
import M4.l;
import a5.m;
import a5.p;
import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.preference.PreferenceManager;
import java.util.concurrent.TimeUnit;

public final class b implements Runnable {
    public final int X;
    public final long Y;
    public final String Z;

    public b(int v, long v1, String s) {
        this.X = v;
        this.Y = v1;
        this.Z = s;
        super();
    }

    private final void a() {
        long v = this.Y;
        String s = this.Z;
        if(d.f == null) {
            d.f = new o(v, null);
        }
        o o0 = d.f;
        if(o0 != null) {
            o0.c = v;
        }
        if(d.e.get() <= 0) {
            b b0 = new b(1, v, s);
            synchronized(d.d) {
                m m0 = p.b(l.b());
                d.c = d.b.schedule(b0, ((long)(m0 == null ? 60 : m0.b)), TimeUnit.SECONDS);
            }
        }
        long v2 = d.i <= 0L ? 0L : (v - d.i) / 1000L;
        Context context0 = l.a();
        m m1 = p.h(l.b(), false);
        if(m1 != null && m1.c && v2 > 0L) {
            N4.m m2 = new N4.m(context0, null);
            Bundle bundle0 = new Bundle(1);
            bundle0.putCharSequence("fb_aa_time_spent_view_name", s);
            if(B.c()) {
                m2.d("fb_aa_time_spent_on_view", ((double)v2), bundle0);
            }
        }
        o o1 = d.f;
        if(o1 != null) {
            o1.w();
        }
    }

    @Override
    public final void run() {
        if(this.X != 0) {
            long v = this.Y;
            String s = this.Z;
            if(d.f == null) {
                d.f = new o(v, null);
            }
            if(d.e.get() <= 0) {
                V4.p.e(s, d.f, d.h);
                SharedPreferences.Editor sharedPreferences$Editor0 = PreferenceManager.getDefaultSharedPreferences(l.a()).edit();
                sharedPreferences$Editor0.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
                sharedPreferences$Editor0.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
                sharedPreferences$Editor0.remove("com.facebook.appevents.SessionInfo.interruptionCount");
                sharedPreferences$Editor0.remove("com.facebook.appevents.SessionInfo.sessionId");
                sharedPreferences$Editor0.apply();
                SharedPreferences.Editor sharedPreferences$Editor1 = PreferenceManager.getDefaultSharedPreferences(l.a()).edit();
                sharedPreferences$Editor1.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
                sharedPreferences$Editor1.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
                sharedPreferences$Editor1.apply();
                d.f = null;
            }
            synchronized(d.d) {
                d.c = null;
            }
            return;
        }
        this.a();
    }
}

