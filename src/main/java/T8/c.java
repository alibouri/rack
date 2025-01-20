package T8;

import A7.b;
import android.graphics.Rect;
import android.os.Handler.Callback;
import android.os.Message;
import android.util.Log;
import com.journeyapps.barcodescanner.BarcodeView;
import com.journeyapps.barcodescanner.Size;
import com.journeyapps.barcodescanner.camera.PreviewScalingStrategy;
import java.util.List;

public final class c implements Handler.Callback {
    public final int a;
    public final BarcodeView b;

    public c(BarcodeView barcodeView0, int v) {
        this.a = v;
        this.b = barcodeView0;
        super();
    }

    @Override  // android.os.Handler$Callback
    public final boolean handleMessage(Message message0) {
        if(this.a != 0) {
            int v = message0.what;
            BarcodeView barcodeView0 = this.b;
            f f0 = barcodeView0.z0;
            if(v == 0x7F0A0342) {  // id:zxing_prewiew_size_ready
                Size size0 = (Size)message0.obj;
                barcodeView0.o0 = size0;
                Size size1 = barcodeView0.n0;
                if(size1 != null) {
                    if(size0 != null) {
                        b b0 = barcodeView0.l0;
                        if(b0 != null) {
                            Rect rect0 = ((PreviewScalingStrategy)b0.b0).b(size0, ((Size)b0.Z));
                            if(rect0.width() > 0 && rect0.height() > 0) {
                                barcodeView0.p0 = rect0;
                                barcodeView0.r0 = barcodeView0.b(new Rect(0, 0, size1.X, size1.Y), barcodeView0.p0);
                                Rect rect1 = new Rect(barcodeView0.r0);
                                rect1.offset(-barcodeView0.p0.left, -barcodeView0.p0.top);
                                Rect rect2 = new Rect(rect1.left * size0.X / barcodeView0.p0.width(), rect1.top * size0.Y / barcodeView0.p0.height(), rect1.right * size0.X / barcodeView0.p0.width(), rect1.bottom * size0.Y / barcodeView0.p0.height());
                                barcodeView0.s0 = rect2;
                                if(rect2.width() <= 0 || barcodeView0.s0.height() <= 0) {
                                    barcodeView0.s0 = null;
                                    barcodeView0.r0 = null;
                                    Log.w("CameraPreview", "Preview frame is too small");
                                }
                                else {
                                    f0.a();
                                }
                            }
                            barcodeView0.requestLayout();
                            barcodeView0.i();
                            return true;
                        }
                    }
                    barcodeView0.s0 = null;
                    barcodeView0.r0 = null;
                    barcodeView0.p0 = null;
                    throw new IllegalStateException("containerSize or previewSize is not set yet");
                }
                return true;
            }
            switch(v) {
                case 0x7F0A033B: {  // id:zxing_camera_closed
                    f0.e();
                    return false;
                }
                case 0x7F0A033C: {  // id:zxing_camera_error
                    Exception exception0 = (Exception)message0.obj;
                    if(barcodeView0.b0 != null) {
                        barcodeView0.d();
                        f0.b(exception0);
                        return false;
                    }
                    return false;
                }
                default: {
                    return false;
                }
            }
        }
        int v1 = message0.what;
        BarcodeView barcodeView1 = this.b;
        if(v1 == 0x7F0A033F) {  // id:zxing_decode_succeeded
            T8.b b1 = (T8.b)message0.obj;
            if(b1 != null) {
                a a0 = barcodeView1.C0;
                if(a0 != null && barcodeView1.B0 != 1) {
                    a0.d(b1);
                    if(barcodeView1.B0 == 2) {
                        barcodeView1.B0 = 1;
                        barcodeView1.C0 = null;
                        barcodeView1.l();
                        return true;
                    }
                }
            }
        }
        else if(v1 != 0x7F0A033E) {  // id:zxing_decode_failed
            if(v1 != 0x7F0A0340) {  // id:zxing_possible_result_points
                return false;
            }
            List list0 = (List)message0.obj;
            a a1 = barcodeView1.C0;
            if(a1 != null && barcodeView1.B0 != 1) {
                a1.e(list0);
                return true;
            }
        }
        return true;
    }
}

