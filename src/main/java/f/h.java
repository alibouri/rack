package f;

import Nb.j;
import P4.c;
import Q4.i;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.apollographql.apollo.api.b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;

public abstract class h {
    public final LinkedHashMap a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final ArrayList d;
    public final transient LinkedHashMap e;
    public final LinkedHashMap f;
    public final Bundle g;

    public h() {
        this.a = new LinkedHashMap();
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new ArrayList();
        this.e = new LinkedHashMap();
        this.f = new LinkedHashMap();
        this.g = new Bundle();
    }

    public final boolean a(int v, int v1, Intent intent0) {
        String s = (String)this.a.get(v);
        if(s == null) {
            return false;
        }
        d d0 = (d)this.e.get(s);
        if((d0 == null ? null : d0.a) != null) {
            ArrayList arrayList0 = this.d;
            if(arrayList0.contains(s)) {
                Object object0 = d0.b.G(intent0, v1);
                d0.a.b(object0);
                arrayList0.remove(s);
                return true;
            }
        }
        this.f.remove(s);
        ActivityResult activityResult0 = new ActivityResult(intent0, v1);
        this.g.putParcelable(s, activityResult0);
        return true;
    }

    public abstract void b(int arg1, i arg2, Object arg3);

    public final g c(String s, i i0, a a0) {
        j.f(s, "key");
        this.e(s);
        d d0 = new d(i0, a0);
        this.e.put(s, d0);
        LinkedHashMap linkedHashMap0 = this.f;
        if(linkedHashMap0.containsKey(s)) {
            Object object0 = linkedHashMap0.get(s);
            linkedHashMap0.remove(s);
            a0.b(object0);
        }
        Bundle bundle0 = this.g;
        ActivityResult activityResult0 = (ActivityResult)c.D(s, bundle0);
        if(activityResult0 != null) {
            bundle0.remove(s);
            a0.b(i0.G(activityResult0.Y, activityResult0.X));
        }
        return new g(this, s, i0, 1);
    }

    public final g d(String s, LifecycleOwner lifecycleOwner0, i i0, a a0) {
        j.f(s, "key");
        Lifecycle lifecycle0 = lifecycleOwner0.a();
        if(lifecycle0.b().a(State.b0)) {
            throw new IllegalStateException(("LifecycleOwner " + lifecycleOwner0 + " is attempting to register while current state is " + lifecycle0.b() + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        this.e(s);
        LinkedHashMap linkedHashMap0 = this.c;
        e e0 = (e)linkedHashMap0.get(s);
        if(e0 == null) {
            e0 = new e(lifecycle0);
        }
        f.c c0 = new f.c(this, s, a0, i0);
        e0.a.a(c0);
        e0.b.add(c0);
        linkedHashMap0.put(s, e0);
        return new g(this, s, i0, 0);
    }

    public final void e(String s) {
        LinkedHashMap linkedHashMap0 = this.b;
        if(((Integer)linkedHashMap0.get(s)) != null) {
            return;
        }
        for(Object object0: ((Ub.a)Ub.i.V(f.X))) {
            Number number0 = (Number)object0;
            int v = number0.intValue();
            LinkedHashMap linkedHashMap1 = this.a;
            if(!linkedHashMap1.containsKey(v)) {
                int v1 = number0.intValue();
                linkedHashMap1.put(v1, s);
                linkedHashMap0.put(s, v1);
                return;
            }
            if(false) {
                break;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public final void f(String s) {
        j.f(s, "key");
        if(!this.d.contains(s)) {
            Integer integer0 = (Integer)this.b.remove(s);
            if(integer0 != null) {
                this.a.remove(integer0);
            }
        }
        this.e.remove(s);
        LinkedHashMap linkedHashMap0 = this.f;
        if(linkedHashMap0.containsKey(s)) {
            StringBuilder stringBuilder0 = b.s("Dropping pending result for request ", s, ": ");
            stringBuilder0.append(linkedHashMap0.get(s));
            Log.w("ActivityResultRegistry", stringBuilder0.toString());
            linkedHashMap0.remove(s);
        }
        Bundle bundle0 = this.g;
        if(bundle0.containsKey(s)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + s + ": " + ((ActivityResult)c.D(s, bundle0)));
            bundle0.remove(s);
        }
        LinkedHashMap linkedHashMap1 = this.c;
        e e0 = (e)linkedHashMap1.get(s);
        if(e0 != null) {
            ArrayList arrayList0 = e0.b;
            for(Object object0: arrayList0) {
                e0.a.c(((LifecycleEventObserver)object0));
            }
            arrayList0.clear();
            linkedHashMap1.remove(s);
        }
    }
}

