package T8;

import B3.d;
import I6.c;
import Q4.i;
import android.os.Handler;
import com.google.android.gms.internal.measurement.d2;
import com.journeyapps.barcodescanner.camera.CameraInstance;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public final class m {
    public Object a;
    public boolean b;
    public final Object c;
    public Object d;
    public Object e;
    public final Object f;
    public Object g;
    public Object h;
    public final Object i;
    public final Object j;

    public m() {
        this.c = new AtomicBoolean();
        this.d = null;
        this.e = new HashMap(16, 1.0f);
        this.f = new HashMap(16, 1.0f);
        this.g = new HashMap(16, 1.0f);
        this.h = new HashMap(16, 1.0f);
        this.a = null;
        this.b = false;
        this.i = new String[0];
        this.j = new d2(3);
    }

    public m(CameraInstance cameraInstance0, k k0, Handler handler0) {
        this.b = false;
        this.a = new Object();
        this.i = new c(3, this);
        this.j = new d(17, this);
        i.Q();
        this.c = cameraInstance0;
        this.g = k0;
        this.f = handler0;
    }
}

