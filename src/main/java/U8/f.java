package U8;

import J5.k;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import android.util.Log;
import android.view.SurfaceHolder;
import com.google.android.gms.internal.measurement.E1;
import com.journeyapps.barcodescanner.Size;
import com.journeyapps.barcodescanner.camera.CameraInstance;

public final class f implements Runnable {
    public final int X;
    public final CameraInstance Y;

    public f(CameraInstance cameraInstance0, int v) {
        this.X = v;
        this.Y = cameraInstance0;
        super();
    }

    @Override
    public final void run() {
        CameraInstance cameraInstance2;
        CameraInstance cameraInstance1;
        CameraInstance cameraInstance0;
        switch(this.X) {
            case 0: {
                try {
                    cameraInstance0 = this.Y;
                    Log.d("CameraInstance", "Opening camera");
                    cameraInstance0.c.c();
                }
                catch(Exception exception1) {
                    Handler handler0 = cameraInstance0.d;
                    if(handler0 != null) {
                        handler0.obtainMessage(0x7F0A033C, exception1).sendToTarget();  // id:zxing_camera_error
                    }
                    Log.e("CameraInstance", "Failed to open camera", exception1);
                }
                return;
            }
            case 1: {
                try {
                    cameraInstance1 = this.Y;
                    Log.d("CameraInstance", "Configuring camera");
                    cameraInstance1.c.b();
                    Handler handler1 = cameraInstance1.d;
                    if(handler1 != null) {
                        h h2 = cameraInstance1.c;
                        Size size0 = h2.j;
                        if(size0 == null) {
                            size0 = null;
                        }
                        else {
                            int v2 = h2.k;
                            if(v2 == -1) {
                                throw new IllegalStateException("Rotation not calculated yet. Call configure() first.");
                            }
                            if(v2 % 180 != 0) {
                                size0 = new Size(size0.Y, size0.X);
                            }
                        }
                        handler1.obtainMessage(0x7F0A0342, size0).sendToTarget();  // id:zxing_prewiew_size_ready
                        return;
                    }
                }
                catch(Exception exception2) {
                    Handler handler2 = cameraInstance1.d;
                    if(handler2 != null) {
                        handler2.obtainMessage(0x7F0A033C, exception2).sendToTarget();  // id:zxing_camera_error
                    }
                    Log.e("CameraInstance", "Failed to configure camera", exception2);
                }
                return;
            }
            case 2: {
                try {
                    cameraInstance2 = this.Y;
                    Log.d("CameraInstance", "Starting preview");
                    E1 e10 = cameraInstance2.b;
                    Camera camera2 = cameraInstance2.c.a;
                    SurfaceHolder surfaceHolder0 = (SurfaceHolder)e10.Y;
                    if(surfaceHolder0 == null) {
                        camera2.setPreviewTexture(((SurfaceTexture)e10.Z));
                    }
                    else {
                        camera2.setPreviewDisplay(surfaceHolder0);
                    }
                    cameraInstance2.c.f();
                }
                catch(Exception exception3) {
                    Handler handler3 = cameraInstance2.d;
                    if(handler3 != null) {
                        handler3.obtainMessage(0x7F0A033C, exception3).sendToTarget();  // id:zxing_camera_error
                    }
                    Log.e("CameraInstance", "Failed to start preview", exception3);
                }
                return;
            }
            default: {
                try {
                    Log.d("CameraInstance", "Closing camera");
                    h h0 = this.Y.c;
                    b b0 = h0.c;
                    if(b0 != null) {
                        b0.c();
                        h0.c = null;
                    }
                    if(h0.d != null) {
                        h0.d = null;
                    }
                    Camera camera0 = h0.a;
                    if(camera0 != null && h0.e) {
                        camera0.stopPreview();
                        h0.l.a = null;
                        h0.e = false;
                    }
                    h h1 = this.Y.c;
                    Camera camera1 = h1.a;
                    if(camera1 != null) {
                        camera1.release();
                        h1.a = null;
                    }
                }
                catch(Exception exception0) {
                    Log.e("CameraInstance", "Failed to close camera", exception0);
                }
                this.Y.g = true;
                this.Y.d.sendEmptyMessage(0x7F0A033B);  // id:zxing_camera_closed
                k k0 = this.Y.a;
                synchronized(k0.e) {
                    int v1 = k0.b - 1;
                    k0.b = v1;
                    if(v1 == 0) {
                        k0.e();
                    }
                }
            }
        }
    }
}

