package d2;

import Nb.j;
import android.util.Log;
import androidx.fragment.app.Fragment;

public abstract class d {
    public static final c a;

    static {
        d.a = c.a;
    }

    public static c a(Fragment fragment0) {
        while(fragment0 != null) {
            if(fragment0.u()) {
                fragment0.p();
            }
            fragment0 = fragment0.u0;
        }
        return d.a;
    }

    public static void b(a a0) {
        if(Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "StrictMode violation in " + a0.X.getClass().getName(), a0);
        }
    }

    public static final void c(Fragment fragment0, String s) {
        j.f(fragment0, "fragment");
        j.f(s, "previousFragmentId");
        d.b(new a(fragment0, "Attempting to reuse fragment " + fragment0 + " with previous ID " + s));
        d.a(fragment0).getClass();
    }
}

