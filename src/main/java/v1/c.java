package v1;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import android.util.Log;
import j6.z0;

public final class c implements Application.ActivityLifecycleCallbacks {
    public Object X;
    public Activity Y;
    public final int Z;
    public boolean b0;
    public boolean c0;
    public boolean d0;

    public c(Activity activity0) {
        this.b0 = false;
        this.c0 = false;
        this.d0 = false;
        this.Y = activity0;
        this.Z = activity0.hashCode();
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity0, Bundle bundle0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity0) {
        if(this.Y == activity0) {
            this.Y = null;
            this.c0 = true;
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity0) {
        if(this.c0 && !this.d0 && !this.b0) {
            try {
                Object object0 = this.X;
                Object object1 = d.c.get(activity0);
                if(object1 == object0 && activity0.hashCode() == this.Z) {
                    z0 z00 = new z0(d.b.get(activity0), 25, object1);
                    d.g.postAtFrontOfQueue(z00);
                    this.d0 = true;
                    this.X = null;
                }
            }
            catch(Throwable throwable0) {
                Log.e("ActivityRecreator", "Exception while fetching field values", throwable0);
            }
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity0, Bundle bundle0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity0) {
        if(this.Y == activity0) {
            this.b0 = true;
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity0) {
    }
}

