package U8;

import android.hardware.Camera;
import android.util.Log;
import com.journeyapps.barcodescanner.camera.CameraInstance;

public final class d implements Runnable {
    public final int X;
    public final CameraInstance Y;
    public final B3.d Z;

    public d(CameraInstance cameraInstance0, B3.d d0, int v) {
        this.X = v;
        this.Y = cameraInstance0;
        this.Z = d0;
        super();
    }

    @Override
    public final void run() {
        if(this.X != 0) {
            h h0 = this.Y.c;
            Camera camera0 = h0.a;
            if(camera0 != null && h0.e) {
                h0.l.a = this.Z;
                camera0.setOneShotPreviewCallback(h0.l);
            }
            return;
        }
        CameraInstance cameraInstance0 = this.Y;
        if(!cameraInstance0.f) {
            Log.d("CameraInstance", "Camera is closed, not requesting preview");
            return;
        }
        d d0 = new d(cameraInstance0, this.Z, 1);
        cameraInstance0.a.d(d0);
    }
}

