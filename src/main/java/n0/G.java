package n0;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.os.Build.VERSION;

public final class g {
    public final Bitmap a;

    public g(Bitmap bitmap0) {
        this.a = bitmap0;
    }

    public final int a() {
        Bitmap.Config bitmap$Config0 = this.a.getConfig();
        if(bitmap$Config0 == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if(bitmap$Config0 == Bitmap.Config.RGB_565) {
            return 2;
        }
        if(bitmap$Config0 == Bitmap.Config.ARGB_4444) {
            return 0;
        }
        int v = Build.VERSION.SDK_INT;
        if(v >= 26 && bitmap$Config0 == Bitmap.Config.RGBA_F16) {
            return 3;
        }
        return v < 26 || bitmap$Config0 != Bitmap.Config.HARDWARE ? 0 : 4;
    }
}

