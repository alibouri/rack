package Q4;

import Nb.j;
import android.view.View;
import java.lang.ref.WeakReference;

public final class e {
    public final WeakReference a;
    public final String b;

    public e(View view0, String s) {
        j.f(view0, "view");
        j.f(s, "viewMapKey");
        super();
        this.a = new WeakReference(view0);
        this.b = s;
    }

    public final View a() {
        return this.a == null ? null : ((View)this.a.get());
    }
}

