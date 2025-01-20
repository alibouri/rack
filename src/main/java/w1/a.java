package w1;

import android.content.Context;
import java.io.File;

public abstract class a {
    public static Context a(Context context0) {
        return context0.createDeviceProtectedStorageContext();
    }

    public static File b(Context context0) {
        return context0.getDataDir();
    }
}

