package v1;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

public final class k {
    public final Bundle a;
    public IconCompat b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final CharSequence f;
    public final PendingIntent g;

    public k(int v, String s, PendingIntent pendingIntent0) {
        IconCompat iconCompat0 = v == 0 ? null : IconCompat.b(v);
        Bundle bundle0 = new Bundle();
        super();
        this.d = true;
        this.b = iconCompat0;
        if(iconCompat0 != null && iconCompat0.d() == 2) {
            this.e = iconCompat0.c();
        }
        this.f = q.b(s);
        this.g = pendingIntent0;
        this.a = bundle0;
        this.c = true;
        this.d = true;
    }
}

