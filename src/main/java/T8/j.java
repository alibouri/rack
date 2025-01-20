package T8;

import B3.c;
import android.app.AlertDialog.Builder;
import android.os.Handler;
import com.journeyapps.barcodescanner.CaptureActivity;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;
import com.journeyapps.barcodescanner.camera.CameraInstance;
import v8.d;
import v8.g;

public final class j {
    public final CaptureActivity a;
    public final DecoratedBarcodeView b;
    public int c;
    public boolean d;
    public boolean e;
    public String f;
    public boolean g;
    public final g h;
    public final d i;
    public final Handler j;
    public boolean k;
    public final c l;
    public boolean m;
    public static final int n;

    public j(CaptureActivity captureActivity0, DecoratedBarcodeView decoratedBarcodeView0) {
        this.c = -1;
        this.d = false;
        this.e = true;
        this.f = "";
        this.g = false;
        this.k = false;
        this.l = new c(18, this);
        f f0 = new f(1, this);
        this.m = false;
        this.a = captureActivity0;
        this.b = decoratedBarcodeView0;
        decoratedBarcodeView0.getBarcodeView().k0.add(f0);
        this.j = new Handler();
        this.h = new g(captureActivity0, new h(this, 0));
        this.i = new d(captureActivity0);
    }

    public final void a() {
        DecoratedBarcodeView decoratedBarcodeView0 = this.b;
        CameraInstance cameraInstance0 = decoratedBarcodeView0.getBarcodeView().b0;
        if(cameraInstance0 == null || cameraInstance0.g) {
            this.a.finish();
        }
        else {
            this.k = true;
        }
        decoratedBarcodeView0.b0.d();
        this.h.a();
    }

    public final void b(String s) {
        CaptureActivity captureActivity0 = this.a;
        if(!captureActivity0.isFinishing() && !this.g && !this.k) {
            if(s.isEmpty()) {
                s = "Sorry, the Android camera encountered a problem. You may need to restart the device.";
            }
            AlertDialog.Builder alertDialog$Builder0 = new AlertDialog.Builder(captureActivity0);
            alertDialog$Builder0.setTitle("Barcode Scanner");
            alertDialog$Builder0.setMessage(s);
            alertDialog$Builder0.setPositiveButton(0x7F1204B6, new J9.h(1, this));  // string:zxing_button_ok "OK"
            alertDialog$Builder0.setOnCancelListener(new i(this));
            alertDialog$Builder0.show();
        }
    }
}

