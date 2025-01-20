package J5;

import android.os.Build.VERSION;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzd;
import java.util.Objects;

public final class e extends ClassLoader {
    @Override
    public final Class loadClass(String s, boolean z) {
        if(Objects.equals(s, "com.google.android.gms.iid.MessengerCompat")) {
            if(Log.isLoggable("CloudMessengerCompat", 3) || Build.VERSION.SDK_INT == 23 && Log.isLoggable("CloudMessengerCompat", 3)) {
                Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
            }
            return zzd.class;
        }
        return super.loadClass(s, z);
    }
}

