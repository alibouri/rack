package v2;

import Nb.j;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.Lifecycle;
import androidx.savedstate.SavedStateRegistryOwner;
import java.util.Map.Entry;

public final class e {
    public final SavedStateRegistryOwner a;
    public final d b;
    public boolean c;

    public e(SavedStateRegistryOwner savedStateRegistryOwner0) {
        this.a = savedStateRegistryOwner0;
        this.b = new d();
    }

    public final void a() {
        SavedStateRegistryOwner savedStateRegistryOwner0 = this.a;
        Lifecycle lifecycle0 = savedStateRegistryOwner0.a();
        if(lifecycle0.b() != State.Y) {
            throw new IllegalStateException("Restarter must be created only during owner\'s initialization stage");
        }
        lifecycle0.a(new a(savedStateRegistryOwner0));
        d d0 = this.b;
        d0.getClass();
        if(d0.b) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        lifecycle0.a(new c.e(2, d0));
        d0.b = true;
        this.c = true;
    }

    public final void b(Bundle bundle0) {
        if(!this.c) {
            this.a();
        }
        Lifecycle lifecycle0 = this.a.a();
        if(lifecycle0.b().a(State.b0)) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle0.b()).toString());
        }
        d d0 = this.b;
        if(!d0.b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if(d0.d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        d0.c = bundle0 == null ? null : bundle0.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
        d0.d = true;
    }

    public final void c(Bundle bundle0) {
        j.f(bundle0, "outBundle");
        d d0 = this.b;
        d0.getClass();
        Bundle bundle1 = new Bundle();
        Bundle bundle2 = d0.c;
        if(bundle2 != null) {
            bundle1.putAll(bundle2);
        }
        d0.a.getClass();
        q.d d1 = new q.d(d0.a);
        d0.a.Z.put(d1, Boolean.FALSE);
        while(d1.hasNext()) {
            Map.Entry map$Entry0 = (Map.Entry)d1.next();
            bundle1.putBundle(((String)map$Entry0.getKey()), ((c)map$Entry0.getValue()).a());
        }
        if(!bundle1.isEmpty()) {
            bundle0.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle1);
        }
    }
}

