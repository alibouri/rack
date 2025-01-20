package U8;

import P4.c;
import android.content.Context;
import android.hardware.Camera.CameraInfo;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.Size;
import android.hardware.Camera;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import com.journeyapps.barcodescanner.Size;
import com.journeyapps.barcodescanner.camera.CameraSettings;
import com.journeyapps.barcodescanner.camera.PreviewScalingStrategy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import v8.a;

public final class h {
    public Camera a;
    public Camera.CameraInfo b;
    public b c;
    public a d;
    public boolean e;
    public String f;
    public CameraSettings g;
    public A7.b h;
    public Size i;
    public Size j;
    public int k;
    public final g l;
    public static final int m;

    public h(Context context0) {
        this.g = new CameraSettings();
        this.k = -1;
        this.l = new g(this);
    }

    public final int a() {
        int v = 0;
        switch(this.h.Y) {
            case 1: {
                v = 90;
                break;
            }
            case 2: {
                v = 180;
                break;
            }
            case 3: {
                v = 270;
            }
        }
        int v1 = this.b.facing == 1 ? (360 - (this.b.orientation + v) % 360) % 360 : (this.b.orientation - v + 360) % 360;
        Log.i("h", "Camera Display Orientation: " + v1);
        return v1;
    }

    public final void b() {
        if(this.a == null) {
            throw new RuntimeException("Camera not open");
        }
        try {
            int v = this.a();
            this.k = v;
            this.a.setDisplayOrientation(v);
        }
        catch(Exception unused_ex) {
            Log.w("h", "Failed to set rotation.");
        }
        try {
            this.d(false);
        }
        catch(Exception unused_ex) {
            try {
                this.d(true);
            }
            catch(Exception unused_ex) {
                Log.w("h", "Camera rejected even safe-mode parameters! No configuration");
            }
        }
        Camera.Size camera$Size0 = this.a.getParameters().getPreviewSize();
        this.j = camera$Size0 == null ? this.i : new Size(camera$Size0.width, camera$Size0.height);
        this.l.b = this.j;
    }

    public final void c() {
        int v = c.A(this.g.a);
        Camera camera0 = v == -1 ? null : Camera.open(v);
        this.a = camera0;
        if(camera0 == null) {
            throw new RuntimeException("Failed to open camera");
        }
        int v1 = c.A(this.g.a);
        Camera.CameraInfo camera$CameraInfo0 = new Camera.CameraInfo();
        this.b = camera$CameraInfo0;
        Camera.getCameraInfo(v1, camera$CameraInfo0);
    }

    public final void d(boolean z) {
        String s2;
        String s1;
        Camera.Parameters camera$Parameters0 = this.a.getParameters();
        String s = this.f;
        if(s == null) {
            this.f = camera$Parameters0.flatten();
        }
        else {
            camera$Parameters0.unflatten(s);
        }
        Log.i("h", "Initial camera parameters: " + camera$Parameters0.flatten());
        if(z) {
            Log.w("h", "In camera config safe mode -- most settings will not be honored");
        }
        int v = this.g.b;
        List list0 = camera$Parameters0.getSupportedFocusModes();
        int[] arr_v = null;
        if(z) {
            s1 = U8.c.a("focus mode", list0, new String[]{"auto"});
        }
        else {
            switch(v) {
                case 1: {
                    s1 = U8.c.a("focus mode", list0, new String[]{"auto"});
                    break;
                }
                case 2: {
                    s1 = U8.c.a("focus mode", list0, new String[]{"continuous-picture", "continuous-video", "auto"});
                    break;
                }
                case 3: {
                    s1 = U8.c.a("focus mode", list0, new String[]{"infinity"});
                    break;
                }
                case 4: {
                    s1 = U8.c.a("focus mode", list0, new String[]{"macro"});
                    break;
                }
                default: {
                    s1 = null;
                }
            }
        }
        if(!z && s1 == null) {
            s1 = U8.c.a("focus mode", list0, new String[]{"macro", "edof"});
        }
        if(s1 != null) {
            if(s1.equals(camera$Parameters0.getFocusMode())) {
                Log.i("CameraConfiguration", "Focus mode already set to " + s1);
            }
            else {
                camera$Parameters0.setFocusMode(s1);
            }
        }
        if(!z) {
            U8.c.b(camera$Parameters0, false);
            this.g.getClass();
            this.g.getClass();
            this.g.getClass();
        }
        List list1 = camera$Parameters0.getSupportedPreviewSizes();
        ArrayList arrayList0 = new ArrayList();
        if(list1 == null) {
            Camera.Size camera$Size0 = camera$Parameters0.getPreviewSize();
            if(camera$Size0 != null) {
                arrayList0.add(new Size(camera$Size0.width, camera$Size0.height));
            }
        }
        else {
            for(Object object0: list1) {
                arrayList0.add(new Size(((Camera.Size)object0).width, ((Camera.Size)object0).height));
            }
        }
        if(arrayList0.size() == 0) {
            this.i = null;
        }
        else {
            A7.b b0 = this.h;
            int v1 = this.k;
            if(v1 == -1) {
                throw new IllegalStateException("Rotation not calculated yet. Call configure() first.");
            }
            Size size0 = (Size)b0.Z;
            if(size0 == null) {
                size0 = null;
            }
            else if(v1 % 180 != 0) {
                size0 = new Size(size0.Y, size0.X);
            }
            PreviewScalingStrategy previewScalingStrategy0 = (PreviewScalingStrategy)b0.b0;
            previewScalingStrategy0.getClass();
            if(size0 != null) {
                Collections.sort(arrayList0, new j(previewScalingStrategy0, size0));
            }
            Log.i("PreviewScalingStrategy", "Viewfinder size: " + size0);
            Log.i("PreviewScalingStrategy", "Preview in order of preference: " + arrayList0);
            Size size1 = (Size)arrayList0.get(0);
            this.i = size1;
            camera$Parameters0.setPreviewSize(size1.X, size1.Y);
        }
        if(Build.DEVICE.equals("glass-1")) {
            List list2 = camera$Parameters0.getSupportedPreviewFpsRange();
            StringBuilder stringBuilder0 = new StringBuilder("Supported FPS ranges: ");
            if(list2 == null || list2.isEmpty()) {
                s2 = "[]";
            }
            else {
                StringBuilder stringBuilder1 = new StringBuilder("[");
                Iterator iterator1 = list2.iterator();
                while(iterator1.hasNext()) {
                    Object object1 = iterator1.next();
                    stringBuilder1.append(Arrays.toString(((int[])object1)));
                    if(iterator1.hasNext()) {
                        stringBuilder1.append(", ");
                    }
                }
                stringBuilder1.append(']');
                s2 = stringBuilder1.toString();
            }
            stringBuilder0.append(s2);
            Log.i("CameraConfiguration", stringBuilder0.toString());
            if(list2 != null && !list2.isEmpty()) {
                for(Object object2: list2) {
                    int[] arr_v1 = (int[])object2;
                    if(arr_v1[0] >= 10000 && arr_v1[1] <= 20000) {
                        arr_v = arr_v1;
                        break;
                    }
                    if(false) {
                        break;
                    }
                }
                if(arr_v == null) {
                    Log.i("CameraConfiguration", "No suitable FPS range?");
                }
                else {
                    int[] arr_v2 = new int[2];
                    camera$Parameters0.getPreviewFpsRange(arr_v2);
                    if(Arrays.equals(arr_v2, arr_v)) {
                        Log.i("CameraConfiguration", "FPS range already set to " + Arrays.toString(arr_v));
                    }
                    else {
                        Log.i("CameraConfiguration", "Setting FPS range to " + Arrays.toString(arr_v));
                        camera$Parameters0.setPreviewFpsRange(arr_v[0], arr_v[1]);
                    }
                }
            }
        }
        Log.i("h", "Final camera parameters: " + camera$Parameters0.flatten());
        this.a.setParameters(camera$Parameters0);
    }

    public final void e(boolean z) {
        boolean z1;
        Camera camera0 = this.a;
        if(camera0 != null) {
            try {
                Camera.Parameters camera$Parameters0 = camera0.getParameters();
                if(camera$Parameters0 == null) {
                    z1 = false;
                }
                else {
                    String s = camera$Parameters0.getFlashMode();
                    z1 = s == null || !"on".equals(s) && !"torch".equals(s) ? false : true;
                }
                if(z != z1) {
                    b b0 = this.c;
                    if(b0 != null) {
                        b0.c();
                    }
                    Camera.Parameters camera$Parameters1 = this.a.getParameters();
                    U8.c.b(camera$Parameters1, z);
                    this.g.getClass();
                    this.a.setParameters(camera$Parameters1);
                    b b1 = this.c;
                    if(b1 != null) {
                        b1.a = false;
                        b1.b();
                        return;
                    }
                }
                return;
            }
            catch(RuntimeException runtimeException0) {
            }
            Log.e("h", "Failed to set torch", runtimeException0);
        }
    }

    public final void f() {
        Camera camera0 = this.a;
        if(camera0 != null && !this.e) {
            camera0.startPreview();
            this.e = true;
            this.c = new b(this.a, this.g);
            CameraSettings cameraSettings0 = this.g;
            a a0 = new a();  // initializer: Ljava/lang/Object;-><init>()V
            a0.X = this;
            a0.Y = new Handler();
            this.d = a0;
            cameraSettings0.getClass();
        }
    }
}

