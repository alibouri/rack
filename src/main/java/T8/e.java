package T8;

import android.util.Log;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceHolder;
import com.journeyapps.barcodescanner.BarcodeView;
import com.journeyapps.barcodescanner.Size;

public final class e implements SurfaceHolder.Callback {
    public final BarcodeView X;

    public e(BarcodeView barcodeView0) {
        this.X = barcodeView0;
    }

    @Override  // android.view.SurfaceHolder$Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder0, int v, int v1, int v2) {
        if(surfaceHolder0 == null) {
            Log.e("CameraPreview", "*** WARNING *** surfaceChanged() gave us a null surface!");
            return;
        }
        this.X.q0 = new Size(v1, v2);
        this.X.i();
    }

    @Override  // android.view.SurfaceHolder$Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder0) {
    }

    @Override  // android.view.SurfaceHolder$Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder0) {
        this.X.q0 = null;
    }
}

