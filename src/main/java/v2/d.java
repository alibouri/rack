package v2;

import Nb.j;
import android.os.Bundle;
import androidx.lifecycle.LegacySavedStateHandleController.OnRecreation;
import i.h;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import q.b;
import q.f;

public final class d {
    public final f a;
    public boolean b;
    public Bundle c;
    public boolean d;
    public h e;
    public boolean f;

    public d() {
        this.a = new f();
        this.f = true;
    }

    public final Bundle a(String s) {
        j.f(s, "key");
        if(!this.d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle0 = this.c;
        if(bundle0 != null) {
            Bundle bundle1 = bundle0.getBundle(s);
            Bundle bundle2 = this.c;
            if(bundle2 != null) {
                bundle2.remove(s);
            }
            if(this.c == null || this.c.isEmpty()) {
                this.c = null;
            }
            return bundle1;
        }
        return null;
    }

    public final c b() {
        Iterator iterator0 = this.a.iterator();
        while(((b)iterator0).hasNext()) {
            Map.Entry map$Entry0 = (Map.Entry)((b)iterator0).next();
            j.e(map$Entry0, "components");
            String s = (String)map$Entry0.getKey();
            c c0 = (c)map$Entry0.getValue();
            if(j.a(s, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                return c0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    public final void c(String s, c c0) {
        j.f(c0, "provider");
        if(((c)this.a.c(s, c0)) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public final void d() {
        h h1;
        Class class0 = OnRecreation.class;
        if(!this.f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        h h0 = this.e == null ? new h(this) : this.e;
        try {
            this.e = h0;
            class0.getDeclaredConstructor(null);
            h1 = this.e;
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            throw new IllegalArgumentException("Class " + class0.getSimpleName() + " must have default constructor in order to be automatically recreated", noSuchMethodException0);
        }
        if(h1 != null) {
            ((LinkedHashSet)h1.b).add(class0.getName());
        }
    }
}

