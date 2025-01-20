package X1;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import io.sentry.hints.i;

public final class c extends i {
    @Override  // io.sentry.hints.i
    public final Signature[] x(PackageManager packageManager0, String s) {
        return packageManager0.getPackageInfo(s, 0x40).signatures;
    }
}

