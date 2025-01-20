package i;

import Nb.j;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import q9.z3;
import v2.c;
import v2.d;

public final class h implements c {
    public final int a;
    public final Object b;

    public h(z3 z30) {
        this.a = 0;
        super();
        this.b = z30;
    }

    public h(d d0) {
        this.a = 1;
        j.f(d0, "registry");
        super();
        this.b = new LinkedHashSet();
        d0.c("androidx.savedstate.Restarter", this);
    }

    @Override  // v2.c
    public final Bundle a() {
        if(this.a != 0) {
            Bundle bundle0 = new Bundle();
            bundle0.putStringArrayList("classes_to_restore", new ArrayList(((LinkedHashSet)this.b)));
            return bundle0;
        }
        Bundle bundle1 = new Bundle();
        ((z3)this.b).y().getClass();
        return bundle1;
    }
}

