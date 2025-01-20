package U8;

import B3.d;
import T8.m;
import T8.r;
import android.hardware.Camera.PreviewCallback;
import android.hardware.Camera;
import android.os.Handler;
import android.util.Log;
import com.journeyapps.barcodescanner.Size;

public final class g implements Camera.PreviewCallback {
    public d a;
    public Size b;
    public final h c;

    public g(h h0) {
        this.c = h0;
    }

    @Override  // android.hardware.Camera$PreviewCallback
    public final void onPreviewFrame(byte[] arr_b, Camera camera0) {
        Size size0 = this.b;
        d d0 = this.a;
        if(size0 != null && d0 != null) {
            try {
                if(arr_b == null) {
                    throw new NullPointerException("No preview data received");
                }
                int v = camera0.getParameters().getPreviewFormat();
                r r0 = new r(arr_b, size0.X, size0.Y, v, this.c.k);
                if(this.c.b.facing == 1) {
                    r0.e = true;
                }
                Object object0 = ((m)d0.Y).a;
                synchronized(object0) {
                    m m0 = (m)d0.Y;
                    if(m0.b) {
                        ((Handler)m0.e).obtainMessage(0x7F0A033D, r0).sendToTarget();  // id:zxing_decode
                    }
                }
                return;
            }
            catch(RuntimeException runtimeException0) {
            }
            Log.e("h", "Camera preview failed", runtimeException0);
            d0.C();
            return;
        }
        Log.d("h", "Got preview callback, but no handler or resolution available");
        if(d0 != null) {
            new Exception("No resolution available");
            d0.C();
        }
    }
}

