package e3;

import i3.m;
import java.io.File;

public final class a implements b {
    public final boolean a;

    public a(boolean z) {
        this.a = z;
    }

    // Deobfuscation rating: LOW(20)
    @Override  // e3.b
    public final String a(Object object0, m m0) {
        return this.a ? ((File)object0).getPath() + ':' + ((File)object0).lastModified() : ((File)object0).getPath();
    }
}

