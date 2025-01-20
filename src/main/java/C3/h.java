package c3;

import Ec.q;
import H6.e;
import Kb.j;
import a3.f;
import a3.o;
import android.webkit.MimeTypeMap;
import java.io.File;

public final class h implements g {
    public final File a;

    public h(File file0) {
        this.a = file0;
    }

    @Override  // c3.g
    public final Object a(kotlin.coroutines.g g0) {
        return new m(new o(e.n(this.a), q.a, null, null), MimeTypeMap.getSingleton().getMimeTypeFromExtension(j.b0(this.a)), f.Z);
    }
}

