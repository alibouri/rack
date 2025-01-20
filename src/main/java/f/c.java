package f;

import Nb.j;
import Q4.i;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.LinkedHashMap;

public final class c implements LifecycleEventObserver {
    public final h X;
    public final String Y;
    public final a Z;
    public final i b0;

    public c(h h0, String s, a a0, i i0) {
        this.X = h0;
        this.Y = s;
        this.Z = a0;
        this.b0 = i0;
    }

    @Override  // androidx.lifecycle.LifecycleEventObserver
    public final void b(LifecycleOwner lifecycleOwner0, Event lifecycle$Event0) {
        h h0 = this.X;
        j.f(h0, "this$0");
        String s = this.Y;
        j.f(s, "$key");
        a a0 = this.Z;
        i i0 = this.b0;
        LinkedHashMap linkedHashMap0 = h0.e;
        if(Event.ON_START == lifecycle$Event0) {
            linkedHashMap0.put(s, new d(i0, a0));
            LinkedHashMap linkedHashMap1 = h0.f;
            if(linkedHashMap1.containsKey(s)) {
                Object object0 = linkedHashMap1.get(s);
                linkedHashMap1.remove(s);
                a0.b(object0);
            }
            Bundle bundle0 = h0.g;
            ActivityResult activityResult0 = (ActivityResult)P4.c.D(s, bundle0);
            if(activityResult0 != null) {
                bundle0.remove(s);
                a0.b(i0.G(activityResult0.Y, activityResult0.X));
            }
        }
        else {
            if(Event.ON_STOP == lifecycle$Event0) {
                linkedHashMap0.remove(s);
                return;
            }
            if(Event.ON_DESTROY == lifecycle$Event0) {
                h0.f(s);
            }
        }
    }
}

