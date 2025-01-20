package E5;

import android.net.Uri.Builder;
import android.net.Uri;

public final class e implements l {
    public static final Uri X;

    static {
        Uri.Builder uri$Builder0 = new Uri.Builder();
        uri$Builder0.scheme("uri");
        uri$Builder0.authority("local");
        e.X = uri$Builder0.build();
    }

    @Override  // E5.l
    public final Uri f() {
        return e.X;
    }
}

