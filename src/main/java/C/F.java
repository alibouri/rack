package c;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle.Event;
import c2.x;
import java.util.ArrayList;
import v2.c;

public final class f implements c {
    public final int a;
    public final x b;

    public f(x x0, int v) {
        this.a = v;
        this.b = x0;
        super();
    }

    @Override  // v2.c
    public final Bundle a() {
        x x0 = this.b;
        if(this.a != 0) {
            while(x.x(x0.w())) {
            }
            x0.t0.f(Event.ON_STOP);
            return new Bundle();
        }
        Bundle bundle0 = new Bundle();
        x0.g0.getClass();
        bundle0.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(x0.g0.b.values()));
        bundle0.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(x0.g0.b.keySet()));
        bundle0.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(x0.g0.d));
        bundle0.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(x0.g0.g));
        return bundle0;
    }
}

