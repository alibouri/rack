package xa;

import Ca.v;
import Nb.j;
import Y8.R6;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.a;
import com.wave.customer.home.PersonalHomeActivity;
import com.wave.customer.risk.PackageInstallReceiver;
import ha.S2;
import q9.o0;

public final class d implements DefaultLifecycleObserver {
    public final PersonalHomeActivity X;
    public final R6 Y;
    public final S2 Z;
    public PackageInstallReceiver b0;

    public d(PersonalHomeActivity personalHomeActivity0, R6 r60, S2 s20) {
        j.f(r60, "repo");
        j.f(s20, "viewmodel");
        super();
        this.X = personalHomeActivity0;
        this.Y = r60;
        this.Z = s20;
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner0) {
        j.f(lifecycleOwner0, "owner");
        a.a(this, lifecycleOwner0);
        if(Build.VERSION.SDK_INT >= 26) {
            IntentFilter intentFilter0 = new IntentFilter();
            intentFilter0.addAction("android.intent.action.PACKAGE_ADDED");
            intentFilter0.addAction("android.intent.action.PACKAGE_REPLACED");
            intentFilter0.addDataScheme("package");
            PackageInstallReceiver packageInstallReceiver0 = new PackageInstallReceiver();
            this.b0 = packageInstallReceiver0;
            this.X.registerReceiver(packageInstallReceiver0, intentFilter0);
        }
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner0) {
        j.f(lifecycleOwner0, "owner");
        PackageInstallReceiver packageInstallReceiver0 = this.b0;
        if(packageInstallReceiver0 != null) {
            try {
                this.X.unregisterReceiver(packageInstallReceiver0);
            }
            catch(IllegalArgumentException unused_ex) {
            }
        }
        a.b(this, lifecycleOwner0);
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner0) {
        a.c(this, lifecycleOwner0);
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner0) {
        a.d(this, lifecycleOwner0);
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner0) {
        j.f(lifecycleOwner0, "lifecycleOwner");
        v v0 = new v(22, this);
        o0.e(this.Z.B0, lifecycleOwner0, v0);
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner0) {
        a.f(this, lifecycleOwner0);
    }
}

