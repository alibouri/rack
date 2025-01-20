package U8;

import I6.c;
import android.hardware.Camera;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.journeyapps.barcodescanner.camera.CameraSettings;
import java.util.ArrayList;

public final class b {
    public boolean a;
    public boolean b;
    public final boolean c;
    public final Camera d;
    public final Handler e;
    public final a f;
    public static final ArrayList g;

    static {
        ArrayList arrayList0 = new ArrayList(2);
        b.g = arrayList0;
        arrayList0.add("auto");
        arrayList0.add("macro");
    }

    public b(Camera camera0, CameraSettings cameraSettings0) {
        c c0 = new c(4, this);
        this.f = new a(0, this);
        this.e = new Handler(c0);
        this.d = camera0;
        String s = camera0.getParameters().getFocusMode();
        cameraSettings0.getClass();
        boolean z = b.g.contains(s);
        this.c = z;
        Log.i("b", "Current focus mode \'" + s + "\'; use auto focus? " + z);
        this.a = false;
        this.b();
    }

    public final void a() {
        synchronized(this) {
            if(!this.a && !this.e.hasMessages(1)) {
                Message message0 = this.e.obtainMessage(1);
                this.e.sendMessageDelayed(message0, 2000L);
            }
        }
    }

    public final void b() {
        if(this.c && !this.a && !this.b) {
            try {
                this.d.autoFocus(this.f);
                this.b = true;
            }
            catch(RuntimeException runtimeException0) {
                Log.w("b", "Unexpected exception while focusing", runtimeException0);
                this.a();
            }
        }
    }

    public final void c() {
        this.a = true;
        this.b = false;
        this.e.removeMessages(1);
        if(this.c) {
            try {
                this.d.cancelAutoFocus();
            }
            catch(RuntimeException runtimeException0) {
                Log.w("b", "Unexpected exception while cancelling focusing", runtimeException0);
            }
        }
    }
}

