package j6;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import com.google.android.gms.internal.measurement.N;

public final class f1 extends g1 {
    public final AlarmManager c0;
    public d1 d0;
    public Integer e0;

    public f1(k1 k10) {
        super(k10);
        this.c0 = (AlarmManager)((d0)this.Y).X.getSystemService("alarm");
    }

    public final k A() {
        if(this.d0 == null) {
            this.d0 = new d1(this, this.Z.j0, 1);
        }
        return this.d0;
    }

    @Override  // j6.g1
    public final boolean w() {
        AlarmManager alarmManager0 = this.c0;
        if(alarmManager0 != null) {
            alarmManager0.cancel(this.z());
        }
        if(Build.VERSION.SDK_INT >= 24) {
            JobScheduler jobScheduler0 = (JobScheduler)((d0)this.Y).X.getSystemService("jobscheduler");
            if(jobScheduler0 != null) {
                jobScheduler0.cancel(this.y());
            }
        }
        return false;
    }

    public final void x() {
        this.u();
        this.b().m0.d("Unscheduling upload");
        AlarmManager alarmManager0 = this.c0;
        if(alarmManager0 != null) {
            alarmManager0.cancel(this.z());
        }
        this.A().a();
        if(Build.VERSION.SDK_INT >= 24) {
            JobScheduler jobScheduler0 = (JobScheduler)((d0)this.Y).X.getSystemService("jobscheduler");
            if(jobScheduler0 != null) {
                jobScheduler0.cancel(this.y());
            }
        }
    }

    public final int y() {
        if(this.e0 == null) {
            this.e0 = "measurementcom.wave.personal".hashCode();
        }
        return (int)this.e0;
    }

    public final PendingIntent z() {
        Context context0 = ((d0)this.Y).X;
        return PendingIntent.getBroadcast(context0, 0, new Intent().setClassName(context0, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), N.a);
    }
}

