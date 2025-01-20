package q9;

import Ab.t;
import Fb.j;
import W5.f;
import android.content.pm.PackageInfo;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;

public final class w0 extends j implements Function1 {
    public final int c0;
    public final PackageInfo d0;

    public w0(PackageInfo packageInfo0, g g0, int v) {
        this.c0 = v;
        this.d0 = packageInfo0;
        super(1, g0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        return this.c0 == 0 ? new w0(this.d0, ((g)object0), 0).v(t.a) : new w0(this.d0, ((g)object0), 1).v(t.a);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        PackageInfo packageInfo0 = this.d0;
        if(this.c0 != 0) {
            f.b0(object0);
            return packageInfo0.versionName;
        }
        f.b0(object0);
        return new Integer(packageInfo0.versionCode);
    }
}

