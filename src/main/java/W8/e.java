package W8;

import E7.w;
import android.app.AlertDialog.Builder;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.hardware.Camera.CameraInfo;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.Size;
import android.hardware.Camera;
import android.os.Bundle;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import c2.I;
import com.sendwave.shared.PhotoActivity;
import f.g;
import hd.c;
import i9.a;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import l9.f;
import q9.r1;
import q9.t1;
import q9.u1;
import q9.z1;
import q9.z3;
import v1.b;

public abstract class e extends z3 implements SurfaceHolder.Callback {
    public Camera E0;
    public View F0;
    public Bitmap G0;
    public boolean H0;
    public int I0;
    public f J0;
    public z1 K0;
    public String L0;
    public boolean M0;
    public final u1 N0;
    public boolean O0;
    public boolean P0;
    public int Q0;
    public final g R0;
    public boolean S0;

    public e() {
        this.E0 = null;
        this.F0 = null;
        this.G0 = null;
        this.H0 = false;
        this.L0 = null;
        this.N0 = new u1("preferredTorch", false);
        this.O0 = false;
        this.P0 = false;
        this.Q0 = 1000000;
        this.R0 = (g)this.v(new I(1), new w(10, ((PhotoActivity)this)));
        this.S0 = false;
    }

    public final int I(BitmapFactory.Options bitmapFactory$Options0) {
        int v = (int)Math.sqrt(((float)this.Q0) / (((float)Math.max(bitmapFactory$Options0.outWidth, bitmapFactory$Options0.outHeight)) / ((float)Math.min(bitmapFactory$Options0.outWidth, bitmapFactory$Options0.outHeight))));
        int v1 = bitmapFactory$Options0.outHeight;
        int v2 = bitmapFactory$Options0.outWidth;
        int v3 = 1;
        if(v1 > v || v2 > v) {
            while(v1 / 2 / v3 > v && v2 / 2 / v3 > v) {
                v3 *= 2;
            }
        }
        c.a.n("LicensePhotoActivity");
        c.a.a("Subsampling the captured image (" + v3 + "x)", new Object[0]);
        return v3;
    }

    public final int J() {
        for(int v = 0; v < Camera.getNumberOfCameras(); ++v) {
            Camera.CameraInfo camera$CameraInfo0 = new Camera.CameraInfo();
            Camera.getCameraInfo(v, camera$CameraInfo0);
            if(camera$CameraInfo0.facing == this.I0) {
                return v;
            }
        }
        return 0;
    }

    public final void K() {
        if(!this.S0 && w1.c.a(this, "android.permission.CAMERA") != 0) {
            b.f(this, new String[]{"android.permission.CAMERA"}, 50);
            this.S0 = true;
            return;
        }
        try {
            if(this.E0 != null) {
                this.P();
                this.E0.release();
                this.E0 = null;
            }
            SurfaceView surfaceView0 = (SurfaceView)this.findViewById(0x7F0A02D8);  // id:surface_view
            ViewGroup viewGroup0 = (ViewGroup)surfaceView0.getParent();
            int v = viewGroup0.indexOfChild(surfaceView0);
            viewGroup0.removeView(surfaceView0);
            viewGroup0.addView(surfaceView0, v);
            int v1 = this.J();
            this.E0 = Camera.open(v1);
            this.N(v1);
        }
        catch(Exception exception0) {
            c.a.n("LicensePhotoActivity");
            c.a.d("Failed to open camera", new Object[0]);
            exception0.printStackTrace();
        }
    }

    public final void L(boolean z) {
        ViewGroup viewGroup0 = (ViewGroup)this.findViewById(0x7F0A02B4);  // id:snap_mode
        ViewGroup viewGroup1 = (ViewGroup)this.findViewById(0x7F0A0252);  // id:preview_mode
        int v = 0;
        viewGroup0.setVisibility((z ? 8 : 0));
        if(!z) {
            v = 8;
        }
        viewGroup1.setVisibility(v);
    }

    public final void M(SurfaceHolder surfaceHolder0) {
        Camera camera0 = this.E0;
        if(camera0 != null) {
            try {
                camera0.setPreviewDisplay(surfaceHolder0);
                this.E0.startPreview();
                this.F0.setEnabled(true);
                f f0 = new f(this.E0);
                this.J0 = f0;
                f0.a = false;
                f0.b();
            }
            catch(IOException iOException0) {
                c.a.n("LicensePhotoActivity");
                c.a.a("Error setting camera preview: %s", new Object[]{iOException0.getMessage()});
            }
            catch(RuntimeException runtimeException0) {
                if(!"startPreview failed".equals(runtimeException0.getMessage())) {
                    throw runtimeException0;
                }
                c.a.n("LicensePhotoActivity");
                c.a.e(runtimeException0, "Error", new Object[0]);
            }
        }
    }

    public final void N(int v) {
        int v3;
        SurfaceView surfaceView0 = (SurfaceView)this.findViewById(0x7F0A02D8);  // id:surface_view
        int v1 = surfaceView0.getWidth();
        int v2 = surfaceView0.getHeight();
        float f = ((float)Math.max(v1, v2)) / ((float)Math.min(v1, v2));
        c.a.n("LicensePhotoActivity");
        boolean z = false;
        c.a.a("Surface is " + v1 + "x" + v2 + " (aspect=" + f + ")", new Object[0]);
        Camera.Parameters camera$Parameters0 = this.E0.getParameters();
        Camera.Size camera$Size0 = (Camera.Size)Collections.min(camera$Parameters0.getSupportedPreviewSizes(), new W8.c(v1 * v2, f));
        c.a.n("LicensePhotoActivity");
        c.a.a("Chose preview size: " + e.O(camera$Size0), new Object[0]);
        camera$Parameters0.setPreviewSize(camera$Size0.width, camera$Size0.height);
        Camera.Size camera$Size1 = (Camera.Size)Collections.min(camera$Parameters0.getSupportedPictureSizes(), new W8.c(this.Q0, ((float)Math.max(camera$Size0.width, camera$Size0.height)) / ((float)Math.min(camera$Size0.width, camera$Size0.height))));
        c.a.n("LicensePhotoActivity");
        c.a.a("Chose picture size: " + e.O(camera$Size1), new Object[0]);
        camera$Parameters0.setPictureSize(camera$Size1.width, camera$Size1.height);
        surfaceView0.setOnTouchListener(new d(0, this));
        if(camera$Parameters0.getSupportedFocusModes().contains("continuous-picture")) {
            camera$Parameters0.setFocusMode("continuous-picture");
        }
        else if(camera$Parameters0.getSupportedFocusModes().contains("auto")) {
            camera$Parameters0.setFocusMode("auto");
        }
        List list0 = camera$Parameters0.getSupportedSceneModes();
        if(list0 != null && list0.contains("steadyphoto")) {
            camera$Parameters0.setSceneMode("steadyphoto");
        }
        List list1 = camera$Parameters0.getSupportedFlashModes();
        if(list1 != null && list1.contains("torch")) {
            if(this.P0) {
                camera$Parameters0.setFlashMode("torch");
            }
            else {
                camera$Parameters0.setFlashMode("off");
            }
        }
        Camera.CameraInfo camera$CameraInfo0 = new Camera.CameraInfo();
        Camera.getCameraInfo(v, camera$CameraInfo0);
        switch(this.getWindowManager().getDefaultDisplay().getRotation()) {
            case 1: {
                v3 = 90;
                break;
            }
            case 2: {
                v3 = 180;
                break;
            }
            case 3: {
                v3 = 270;
                break;
            }
            default: {
                v3 = 0;
            }
        }
        int v4 = camera$CameraInfo0.facing == 1 ? (360 - (camera$CameraInfo0.orientation + v3) % 360) % 360 : (camera$CameraInfo0.orientation - v3 + 360) % 360;
        camera$Parameters0.setRotation(v4);
        this.E0.setParameters(camera$Parameters0);
        this.E0.setDisplayOrientation(v4);
        Camera.CameraInfo camera$CameraInfo1 = new Camera.CameraInfo();
        Camera.getCameraInfo(v, camera$CameraInfo1);
        if(camera$CameraInfo1.facing == 1) {
            z = true;
        }
        this.H0 = z;
    }

    public static String O(Camera.Size camera$Size0) {
        return camera$Size0.width + "x" + camera$Size0.height + " (aspect=" + ((float)camera$Size0.width) / ((float)camera$Size0.height) + ")";
    }

    public final void P() {
        f f0 = this.J0;
        if(f0 != null) {
            f0.a = true;
            f0.b = false;
            f0.e.removeMessages(1);
            if(f0.c) {
                try {
                    f0.d.cancelAutoFocus();
                }
                catch(RuntimeException runtimeException0) {
                    c.a.n("f");
                    c.a.m(runtimeException0, "Unexpected exception while cancelling focusing", new Object[0]);
                }
            }
            this.J0 = null;
        }
        this.F0.setEnabled(false);
        this.E0.stopPreview();
    }

    public final void Q(String s, Map map0) {
        if(this.L0 != null) {
            r1.b(this).e().d(this.L0 + ": " + s, map0);
        }
    }

    @Override  // c.o
    public final void onBackPressed() {
        if(((ViewGroup)this.findViewById(0x7F0A0252)).getVisibility() != 0) {  // id:preview_mode
            super.onBackPressed();
            return;
        }
        this.L(false);
    }

    public void onCancel(View view0) {
        this.onBackPressed();
    }

    public void onContinue(View view0) {
        this.Q("click on skip", null);
        this.setResult(-1, null);
        this.finish();
    }

    @Override  // q9.z3
    public void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        boolean z = true;
        this.setRequestedOrientation(1);
        this.getWindow().addFlags(0x80);
        if(this.getIntent().getBooleanExtra("isPortrait", false)) {
            i9.d d0 = (i9.d)R1.d.a(this.getLayoutInflater(), 0x7F0D001D, null);  // layout:activity_license_photo_portrait
            d0.u(this);
            this.setContentView(d0.d);
        }
        else {
            a a0 = (a)R1.d.a(this.getLayoutInflater(), 0x7F0D001C, null);  // layout:activity_license_photo
            a0.u(this);
            this.setContentView(a0.d);
        }
        this.L0 = this.getIntent().getStringExtra("trackingCategory");
        this.Q("photo camera", null);
        if(this.getIntent().hasExtra("titleText")) {
            ((TextView)this.findViewById(0x7F0A016D)).setText(this.getIntent().getStringExtra("titleText"));  // id:header
        }
        int v = this.getIntent().getBooleanExtra("showBackBtn", false) ? 0 : 8;
        this.findViewById(0x7F0A009F).setVisibility(v);  // id:btn_back
        this.findViewById(0x7F0A00A0).setVisibility(v);  // id:btn_back_retake
        this.I0 = this.getIntent().getBooleanExtra("preferFrontCamera", false) ? 1 : 0;
        if(!this.getIntent().getBooleanExtra("isSkippable", false)) {
            this.findViewById(0x7F0A00A8).setVisibility(4);  // id:btn_skip_photo
        }
        if(this.getIntent().getBooleanExtra("allowPickFromGallery", false)) {
            this.findViewById(0x7F0A00A5).setVisibility(0);  // id:btn_pick_from_gallery
        }
        if(this.getIntent().getStringExtra("moreInfo") != null) {
            this.findViewById(0x7F0A00A4).setVisibility(0);  // id:btn_more_info
        }
        Button button0 = (Button)this.findViewById(0x7F0A02D3);  // id:submit
        if(this.getIntent().getStringExtra("confirmText") != null) {
            button0.setText(this.getIntent().getStringExtra("confirmText"));
        }
        if(r1.b(this).d().h() == null) {
            z = false;
        }
        this.O0 = z;
        z1 z10 = ((nb.a)r1.b(this).m0.getValue()).a(t1.e0);
        this.K0 = z10;
        if(this.O0) {
            this.P0 = z10.k(this.N0);
        }
        ((SurfaceView)this.findViewById(0x7F0A02D8)).getHolder().addCallback(this);  // id:surface_view
        View view0 = this.findViewById(0x7F0A02B1);  // id:snap
        this.F0 = view0;
        view0.setEnabled(false);
        this.L(false);
    }

    public void onFlashlight(View view0) {
        this.Q("click on flashlight", null);
        Camera camera0 = this.E0;
        if(camera0 == null) {
            return;
        }
        Camera.Parameters camera$Parameters0 = camera0.getParameters();
        List list0 = camera$Parameters0.getSupportedFlashModes();
        if(list0 != null && list0.contains("torch")) {
            boolean z = this.P0;
            this.P0 = !z;
            if(z) {
                camera$Parameters0.setFlashMode("off");
            }
            else {
                camera$Parameters0.setFlashMode("torch");
            }
            this.E0.setParameters(camera$Parameters0);
            if(this.O0) {
                this.K0.d().b(this.N0, Boolean.valueOf(this.P0)).apply();
            }
            this.E0.startPreview();
        }
    }

    public void onFlip(View view0) {
        this.I0 = this.I0 == 0 ? 1 : 0;
        this.K();
    }

    @Override  // c2.x
    public final void onPause() {
        super.onPause();
        if(this.E0 != null) {
            this.P();
            this.E0.release();
            this.E0 = null;
        }
    }

    @Override  // q9.z3
    public final void onResume() {
        super.onResume();
        this.K();
    }

    public void onRetake(View view0) {
        this.Q("click on retake", null);
        this.L(false);
    }

    public void onSnap(View view0) {
        this.Q("click on snap", null);
        this.F0.setEnabled(false);
        this.E0.takePicture(null, null, new W8.a(this, view0));
    }

    public void onSubmit(View view0) {
        this.setResult(-1, this.getIntent());
        this.finish();
    }

    public void pickFromGallery(View view0) {
        this.Q("click on photo library", null);
        this.R0.a("image/*");
    }

    public void showMoreInfo(View view0) {
        this.Q("click on more info", null);
        String s = this.getIntent().getStringExtra("moreInfo");
        if(s == null) {
            this.onContinue(view0);
        }
        new AlertDialog.Builder(this).setTitle(r1.d(0x7F12028C, new Object[0])).setMessage(s).show();  // string:more_information "More Information"
    }

    @Override  // android.view.SurfaceHolder$Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder0, int v, int v1, int v2) {
        if(surfaceHolder0.getSurface() == null) {
            return;
        }
        if(this.E0 == null) {
            return;
        }
        try {
            this.P();
        }
        catch(Exception unused_ex) {
        }
        this.N(this.J());
        this.M(surfaceHolder0);
    }

    @Override  // android.view.SurfaceHolder$Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder0) {
        if(this.E0 == null) {
            return;
        }
        this.N(this.J());
        this.M(surfaceHolder0);
    }

    @Override  // android.view.SurfaceHolder$Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder0) {
        this.F0.setEnabled(false);
    }

    public void warnThenContinue(View view0) {
        String s = this.getIntent().getStringExtra("warnForSkip");
        if(s == null) {
            this.onContinue(view0);
        }
        new AlertDialog.Builder(this).setTitle("Skip this photo?").setMessage(s).setPositiveButton("Skip anyway", new W8.b(this, view0)).setNegativeButton("Take photo", null).show();
    }
}

