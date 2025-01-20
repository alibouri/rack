package M5;

import Y6.b;
import a6.d;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Map.Entry;
import java.util.Map;
import java.util.WeakHashMap;
import s.e;

public final class I extends Fragment implements LifecycleFragment {
    public final Map X0;
    public int Y0;
    public Bundle Z0;
    public static final WeakHashMap a1;

    static {
        I.a1 = new WeakHashMap();
    }

    public I() {
        this.X0 = Collections.synchronizedMap(new e(0));  // initializer: Ls/J;-><init>(I)V
        this.Y0 = 0;
    }

    @Override  // androidx.fragment.app.Fragment
    public final void A(Bundle bundle0) {
        super.A(bundle0);
        this.Y0 = 1;
        this.Z0 = bundle0;
        for(Object object0: this.X0.entrySet()) {
            ((LifecycleCallback)((Map.Entry)object0).getValue()).c((bundle0 == null ? null : bundle0.getBundle(((String)((Map.Entry)object0).getKey()))));
        }
    }

    @Override  // androidx.fragment.app.Fragment
    public final void C() {
        this.D0 = true;
        this.Y0 = 5;
        for(Object object0: this.X0.values()) {
            ((LifecycleCallback)object0).getClass();
        }
    }

    @Override  // androidx.fragment.app.Fragment
    public final void H() {
        this.D0 = true;
        this.Y0 = 3;
        for(Object object0: this.X0.values()) {
            ((LifecycleCallback)object0).d();
        }
    }

    @Override  // androidx.fragment.app.Fragment
    public final void I(Bundle bundle0) {
        for(Object object0: this.X0.entrySet()) {
            Bundle bundle1 = new Bundle();
            ((LifecycleCallback)((Map.Entry)object0).getValue()).e(bundle1);
            bundle0.putBundle(((String)((Map.Entry)object0).getKey()), bundle1);
        }
    }

    @Override  // androidx.fragment.app.Fragment
    public final void J() {
        this.D0 = true;
        this.Y0 = 2;
        for(Object object0: this.X0.values()) {
            ((LifecycleCallback)object0).f();
        }
    }

    @Override  // androidx.fragment.app.Fragment
    public final void K() {
        this.D0 = true;
        this.Y0 = 4;
        for(Object object0: this.X0.values()) {
            ((LifecycleCallback)object0).g();
        }
    }

    @Override  // com.google.android.gms.common.api.internal.LifecycleFragment
    public final void b(o o0) {
        Map map0 = this.X0;
        if(map0.containsKey("ConnectionlessLifecycleHelper")) {
            throw new IllegalArgumentException("LifecycleCallback with tag ConnectionlessLifecycleHelper already added to this fragment.");
        }
        map0.put("ConnectionlessLifecycleHelper", o0);
        if(this.Y0 > 0) {
            new d(Looper.getMainLooper(), 2).post(new b(16, this, o0, false));
        }
    }

    @Override  // com.google.android.gms.common.api.internal.LifecycleFragment
    public final LifecycleCallback e() {
        Object object0 = this.X0.get("ConnectionlessLifecycleHelper");
        return (LifecycleCallback)o.class.cast(object0);
    }

    @Override  // androidx.fragment.app.Fragment
    public final void h(String s, FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        super.h(s, fileDescriptor0, printWriter0, arr_s);
        for(Object object0: this.X0.values()) {
            ((LifecycleCallback)object0).getClass();
        }
    }

    @Override  // androidx.fragment.app.Fragment
    public final void y(int v, int v1, Intent intent0) {
        super.y(v, v1, intent0);
        for(Object object0: this.X0.values()) {
            ((LifecycleCallback)object0).b(v, v1, intent0);
        }
    }
}

