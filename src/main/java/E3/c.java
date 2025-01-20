package e3;

import Nb.j;
import android.net.Uri;
import i3.m;

public final class c implements b {
    // Deobfuscation rating: LOW(20)
    @Override  // e3.b
    public final String a(Object object0, m m0) {
        return j.a(((Uri)object0).getScheme(), "android.resource") ? ((Uri)object0) + '-' + (m0.a.getResources().getConfiguration().uiMode & 0x30) : ((Uri)object0).toString();
    }
}

