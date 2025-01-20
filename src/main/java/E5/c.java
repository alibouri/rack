package E5;

import N5.r;
import android.net.Uri.Builder;
import android.net.Uri;
import com.google.android.gms.internal.gtm.zzbq;
import com.google.android.gms.internal.gtm.zzbu;

public final class c extends zzbq implements l {
    public final Uri X;

    public c(zzbu zzbu0, String s) {
        super(zzbu0);
        r.f(s);
        r.f(s);
        Uri.Builder uri$Builder0 = new Uri.Builder();
        uri$Builder0.scheme("uri");
        uri$Builder0.authority("google-analytics.com");
        uri$Builder0.path(s);
        this.X = uri$Builder0.build();
    }

    @Override  // E5.l
    public final Uri f() {
        return this.X;
    }
}

