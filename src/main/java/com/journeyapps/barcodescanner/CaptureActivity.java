package com.journeyapps.barcodescanner;

import J5.k;
import T8.j;
import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.KeyEvent;
import com.journeyapps.barcodescanner.camera.CameraSettings;
import java.util.EnumMap;
import java.util.Set;
import r8.h;
import v1.b;
import v8.e;
import v8.f;
import v8.g;
import w1.c;

public class CaptureActivity extends Activity {
    public j X;
    public DecoratedBarcodeView Y;

    @Override  // android.app.Activity
    public final void onCreate(Bundle bundle0) {
        int v2;
        super.onCreate(bundle0);
        this.setContentView(0x7F0D0109);  // layout:zxing_capture
        this.Y = (DecoratedBarcodeView)this.findViewById(0x7F0A0339);  // id:zxing_barcode_scanner
        DecoratedBarcodeView decoratedBarcodeView0 = this.Y;
        j j0 = new j(this, decoratedBarcodeView0);
        this.X = j0;
        Intent intent0 = this.getIntent();
        this.getWindow().addFlags(0x80);
        if(bundle0 != null) {
            j0.c = bundle0.getInt("SAVED_ORIENTATION_LOCK", -1);
        }
        if(intent0 != null) {
            if(intent0.getBooleanExtra("SCAN_ORIENTATION_LOCKED", true)) {
                if(j0.c == -1) {
                    int v = this.getWindowManager().getDefaultDisplay().getRotation();
                    int v1 = this.getResources().getConfiguration().orientation;
                    if(v1 != 2) {
                        if(v1 == 1) {
                            v2 = v == 0 || v == 3 ? 1 : 9;
                        }
                        else {
                            v2 = 0;
                        }
                    }
                    else if(v != 0 && v != 1) {
                        v2 = 8;
                    }
                    else {
                        v2 = 0;
                    }
                    j0.c = v2;
                }
                this.setRequestedOrientation(j0.c);
            }
            if("com.google.zxing.client.android.SCAN".equals(intent0.getAction())) {
                Set set0 = e.a(intent0);
                EnumMap enumMap0 = f.a(intent0);
                CameraSettings cameraSettings0 = new CameraSettings();
                if(intent0.hasExtra("SCAN_CAMERA_ID")) {
                    int v3 = intent0.getIntExtra("SCAN_CAMERA_ID", -1);
                    if(v3 >= 0) {
                        cameraSettings0.a = v3;
                    }
                }
                if(intent0.hasExtra("TORCH_ENABLED") && intent0.getBooleanExtra("TORCH_ENABLED", false)) {
                    decoratedBarcodeView0.b0.setTorch(true);
                    TorchListener decoratedBarcodeView$TorchListener0 = decoratedBarcodeView0.e0;
                    if(decoratedBarcodeView$TorchListener0 != null) {
                        decoratedBarcodeView$TorchListener0.b();
                    }
                }
                String s = intent0.getStringExtra("PROMPT_MESSAGE");
                if(s != null) {
                    decoratedBarcodeView0.setStatusText(s);
                }
                int v4 = intent0.getIntExtra("SCAN_TYPE", 0);
                String s1 = intent0.getStringExtra("CHARACTER_SET");
                new h().c(enumMap0);  // initializer: Ljava/lang/Object;-><init>()V
                decoratedBarcodeView0.b0.setCameraSettings(cameraSettings0);
                k k0 = new k(set0, enumMap0, s1, v4);
                decoratedBarcodeView0.b0.setDecoderFactory(k0);
            }
            if(!intent0.getBooleanExtra("BEEP_ENABLED", true)) {
                j0.i.b = false;
            }
            if(intent0.hasExtra("SHOW_MISSING_CAMERA_PERMISSION_DIALOG")) {
                boolean z = intent0.getBooleanExtra("SHOW_MISSING_CAMERA_PERMISSION_DIALOG", true);
                String s2 = intent0.getStringExtra("MISSING_CAMERA_PERMISSION_DIALOG_MESSAGE");
                j0.e = z;
                if(s2 == null) {
                    s2 = "";
                }
                j0.f = s2;
            }
            if(intent0.hasExtra("TIMEOUT")) {
                T8.h h0 = new T8.h(j0, 1);
                long v5 = intent0.getLongExtra("TIMEOUT", 0L);
                j0.j.postDelayed(h0, v5);
            }
            if(intent0.getBooleanExtra("BARCODE_IMAGE_ENABLED", false)) {
                j0.d = true;
            }
        }
        BarcodeView barcodeView0 = this.X.b.b0;
        R2.e e0 = new R2.e(this.X.b, this.X.l, false);
        barcodeView0.B0 = 2;
        barcodeView0.C0 = e0;
        barcodeView0.k();
    }

    @Override  // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        j j0 = this.X;
        j0.g = true;
        j0.h.a();
        j0.j.removeCallbacksAndMessages(null);
    }

    // Deobfuscation rating: LOW(20)
    @Override  // android.app.Activity
    public final boolean onKeyDown(int v, KeyEvent keyEvent0) {
        return this.Y.onKeyDown(v, keyEvent0) || super.onKeyDown(v, keyEvent0);
    }

    @Override  // android.app.Activity
    public final void onPause() {
        super.onPause();
        j j0 = this.X;
        j0.h.a();
        j0.b.b0.e();
    }

    @Override  // android.app.Activity
    public final void onRequestPermissionsResult(int v, String[] arr_s, int[] arr_v) {
        j j0 = this.X;
        j0.getClass();
        if(v == 0xFA) {
            if(arr_v.length > 0 && arr_v[0] == 0) {
                j0.b.b0.g();
                return;
            }
            Intent intent0 = new Intent("com.google.zxing.client.android.SCAN");
            intent0.putExtra("MISSING_CAMERA_PERMISSION", true);
            j0.a.setResult(0, intent0);
            if(j0.e) {
                j0.b(j0.f);
                return;
            }
            j0.a();
        }
    }

    @Override  // android.app.Activity
    public final void onResume() {
        super.onResume();
        j j0 = this.X;
        CaptureActivity captureActivity0 = j0.a;
        if(c.a(captureActivity0, "android.permission.CAMERA") == 0) {
            j0.b.b0.g();
        }
        else if(!j0.m) {
            b.f(captureActivity0, new String[]{"android.permission.CAMERA"}, 0xFA);
            j0.m = true;
        }
        g g0 = j0.h;
        if(!g0.c) {
            IntentFilter intentFilter0 = new IntentFilter("android.intent.action.BATTERY_CHANGED");
            g0.a.registerReceiver(g0.b, intentFilter0);
            g0.c = true;
        }
        g0.d.removeCallbacksAndMessages(null);
        if(g0.f) {
            g0.d.postDelayed(g0.e, 300000L);
        }
    }

    @Override  // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        bundle0.putInt("SAVED_ORIENTATION_LOCK", this.X.c);
    }
}

