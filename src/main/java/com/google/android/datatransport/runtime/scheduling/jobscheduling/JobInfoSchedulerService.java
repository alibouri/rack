package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import B5.a;
import a8.Q;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import io.sentry.M1;
import r5.i;
import r5.o;
import x5.e;

public class JobInfoSchedulerService extends JobService {
    public static final int X;

    @Override  // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters0) {
        String s = jobParameters0.getExtras().getString("backendName");
        String s1 = jobParameters0.getExtras().getString("extras");
        int v = jobParameters0.getExtras().getInt("priority");
        int v1 = jobParameters0.getExtras().getInt("attemptNumber");
        o.b(this.getApplicationContext());
        Q q0 = i.a();
        q0.O(s);
        q0.b0 = a.b(v);
        if(s1 != null) {
            q0.Z = Base64.decode(s1, 0);
        }
        o o0 = o.a();
        i i0 = q0.f();
        M1 m10 = new M1(this, 20, jobParameters0);
        o0.d.getClass();
        e e0 = new e(o0.d, i0, v1, m10);
        o0.d.e.execute(e0);
        return true;
    }

    @Override  // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters0) {
        return true;
    }
}

