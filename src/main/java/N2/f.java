package n2;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.PackageInfoFlags;
import android.content.pm.PackageManager;

public abstract class f {
    public static PackageInfo a(PackageManager packageManager0, Context context0) {
        return packageManager0.getPackageInfo("com.wave.personal", PackageManager.PackageInfoFlags.of(0L));
    }
}

