package T8;

import android.graphics.Rect;
import android.util.Log;
import com.journeyapps.barcodescanner.BarcodeView;
import com.journeyapps.barcodescanner.CameraPreview;
import com.journeyapps.barcodescanner.Size;
import com.journeyapps.barcodescanner.ViewfinderView;

public final class f implements g {
    public final int a;
    public final Object b;

    public f(int v, Object object0) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // T8.g
    public final void a() {
        switch(this.a) {
            case 0: {
                for(Object object0: ((BarcodeView)this.b).k0) {
                    ((g)object0).a();
                }
                return;
            label_8:
                ViewfinderView viewfinderView0 = (ViewfinderView)this.b;
                CameraPreview cameraPreview0 = viewfinderView0.j0;
                if(cameraPreview0 != null) {
                    Rect rect0 = cameraPreview0.getFramingRect();
                    Size size0 = viewfinderView0.j0.getPreviewSize();
                    if(rect0 != null && size0 != null) {
                        viewfinderView0.k0 = rect0;
                        viewfinderView0.l0 = size0;
                    }
                }
                viewfinderView0.invalidate();
                break;
            }
            case 1: {
                break;
            }
            default: {
                goto label_8;
            }
        }
    }

    @Override  // T8.g
    public final void b(Exception exception0) {
        switch(this.a) {
            case 0: {
                for(Object object0: ((BarcodeView)this.b).k0) {
                    ((g)object0).b(exception0);
                }
                return;
            }
            case 1: {
                ((j)this.b).b("Sorry, the Android camera encountered a problem. You may need to restart the device.");
            }
        }
    }

    @Override  // T8.g
    public final void c() {
        if(this.a != 0) {
            return;
        }
        for(Object object0: ((BarcodeView)this.b).k0) {
            ((g)object0).c();
        }
    }

    @Override  // T8.g
    public final void d() {
        if(this.a != 0) {
            return;
        }
        for(Object object0: ((BarcodeView)this.b).k0) {
            ((g)object0).d();
        }
    }

    @Override  // T8.g
    public final void e() {
        Object object0 = this.b;
        switch(this.a) {
            case 0: {
                for(Object object1: ((BarcodeView)object0).k0) {
                    ((g)object1).e();
                }
                return;
            }
            case 1: {
                if(((j)object0).k) {
                    Log.d("j", "Camera closed; finishing activity");
                    ((j)object0).a.finish();
                }
            }
        }
    }

    private final void f() {
    }

    private final void g(Exception exception0) {
    }

    private final void h() {
    }

    private final void i() {
    }

    private final void j() {
    }

    private final void k() {
    }

    private final void l() {
    }
}

