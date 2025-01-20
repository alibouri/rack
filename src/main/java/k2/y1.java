package k2;

import Fb.c;
import Nb.j;
import Q.C;
import android.os.Build;
import android.util.Log;

public abstract class y1 {
    public final C a;

    public y1() {
        this.a = new C(null, v.d0);
    }

    public boolean a() {
        return false;
    }

    public abstract Object b(z1 arg1);

    public final void c() {
        if(this.a.i() && (Build.ID != null && Log.isLoggable("Paging", 3))) {
            j.f(("Invalidated PagingSource " + this), "message");
            Log.d("Paging", "Invalidated PagingSource " + this, null);
        }
    }

    public abstract Object d(t1 arg1, c arg2);
}

