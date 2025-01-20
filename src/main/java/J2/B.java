package j2;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import java.io.File;

public abstract class b extends Application {
    @Override  // android.content.ContextWrapper
    public final void attachBaseContext(Context context0) {
        ApplicationInfo applicationInfo0;
        super.attachBaseContext(context0);
        Log.i("MultiDex", "Installing application");
        if(a.b) {
            Log.i("MultiDex", "VM has multidex support, MultiDex support library is disabled.");
            return;
        }
        try {
            try {
                applicationInfo0 = this.getApplicationInfo();
            }
            catch(RuntimeException runtimeException0) {
                Log.w("MultiDex", "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", runtimeException0);
                applicationInfo0 = null;
            }
            if(applicationInfo0 == null) {
                Log.i("MultiDex", "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled.");
                return;
            }
            a.b(this, new File(applicationInfo0.sourceDir), new File(applicationInfo0.dataDir));
        }
        catch(Exception exception0) {
            Log.e("MultiDex", "MultiDex installation failure", exception0);
            throw new RuntimeException("MultiDex installation failed (" + exception0.getMessage() + ").");
        }
        Log.i("MultiDex", "install done");
    }
}

