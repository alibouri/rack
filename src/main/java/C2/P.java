package c2;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandleSupport;

public final class p extends u {
    public final Fragment a;

    public p(Fragment fragment0) {
        this.a = fragment0;
    }

    @Override  // c2.u
    public final void a() {
        this.a.S0.a();
        SavedStateHandleSupport.b(this.a);
        Bundle bundle0 = this.a.Y;
        Bundle bundle1 = bundle0 == null ? null : bundle0.getBundle("registryState");
        this.a.S0.b(bundle1);
    }
}

