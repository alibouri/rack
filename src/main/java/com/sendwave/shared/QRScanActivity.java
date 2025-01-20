package com.sendwave.shared;

import Ab.o;
import D8.a;
import Nb.j;
import R1.d;
import R9.F2;
import W4.f;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.journeyapps.barcodescanner.BarcodeView;
import java.util.Arrays;
import o9.G1;
import q9.k3;
import q9.l;
import q9.m;
import q9.o0;
import q9.r1;
import q9.u1;

public final class QRScanActivity extends k3 {
    public BarcodeView F0;
    public G1 G0;
    public final o H0;
    public m I0;
    public final u1 J0;
    public boolean K0;
    public static final int L0;

    public QRScanActivity() {
        this.H0 = f.A(new F2(29, this));
        this.J0 = new u1("preferredTorch", false);
    }

    public final void onBackButtonClicked(View view0) {
        j.f(view0, "expected");
        this.onBackPressed();
    }

    @Override  // q9.z3
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        i9.f f0 = (i9.f)d.a(this.getLayoutInflater(), 0x7F0D001E, null);  // layout:activity_scan_qr_code
        this.setContentView(f0.d);
        f0.u(this);
        TextView textView0 = (TextView)this.findViewById(0x7F0A0088);  // id:barcode_header
        if(textView0 != null) {
            textView0.setVisibility(0);
            textView0.setText(r1.d(0x7F1203A1, new Object[0]));  // string:scan_qr_card "Please scan the QR card that you used to sign up for Wave originally"
        }
        m m0 = new m(this, "qrScan");
        this.I0 = m0;
        this.K0 = m0.k(this.J0);
        BarcodeView barcodeView0 = (BarcodeView)this.findViewById(0x7F0A0089);  // id:barcode_view
        this.F0 = barcodeView0;
        if(barcodeView0 != null) {
            barcodeView0.setTorch(this.K0);
        }
        BarcodeView barcodeView1 = this.F0;
        B9.f f1 = (B9.f)this.H0.getValue();
        this.G0 = new G1(this, barcodeView1);
        a a0 = new a(this);
        a0.d = QRScanActivity.class;
        a0.b.put("SCAN_ORIENTATION_LOCKED", Boolean.FALSE);
        a0.c = Arrays.asList(new String[]{"QR_CODE"});
        G1 g10 = this.G0;
        if(g10 != null) {
            g10.c(a0.a(), bundle0);
        }
        G1 g11 = this.G0;
        if(g11 != null) {
            g11.b.B0 = 2;
            g11.b.C0 = g11.i;
            g11.b.k();
        }
    }

    @Override  // i.j
    public final void onDestroy() {
        super.onDestroy();
        G1 g10 = this.G0;
        if(g10 != null) {
            g10.d = true;
            g10.e.a();
            g10.g.removeCallbacksAndMessages(null);
        }
    }

    public final void onFlashlight(View view0) {
        j.f(view0, "expected");
        int v = !this.K0;
        this.K0 = v;
        BarcodeView barcodeView0 = this.F0;
        if(barcodeView0 != null) {
            barcodeView0.setTorch(((boolean)v));
        }
        m m0 = this.I0;
        if(m0 != null) {
            l l0 = new l(m0);
            o0.O(l0, this.J0, Boolean.valueOf(this.K0));
            l0.apply();
            return;
        }
        j.p("sharedPrefs");
        throw null;
    }

    // Deobfuscation rating: LOW(20)
    @Override  // i.j
    public final boolean onKeyDown(int v, KeyEvent keyEvent0) {
        return (this.F0 == null ? false : this.F0.onKeyDown(v, keyEvent0)) || super.onKeyDown(v, keyEvent0);
    }

    @Override  // c2.x
    public final void onPause() {
        super.onPause();
        G1 g10 = this.G0;
        if(g10 != null) {
            g10.e.a();
            g10.b.e();
        }
    }

    @Override  // c2.x
    public final void onRequestPermissionsResult(int v, String[] arr_s, int[] arr_v) {
        j.f(arr_s, "permissions");
        j.f(arr_v, "grantResults");
        super.onRequestPermissionsResult(v, arr_s, arr_v);
        G1 g10 = this.G0;
        if(g10 != null && v == 0xFA) {
            if(arr_v.length > 0 && arr_v[0] == 0) {
                g10.b.g();
                return;
            }
            g10.a();
        }
    }

    @Override  // q9.z3
    public final void onResume() {
        super.onResume();
        G1 g10 = this.G0;
        if(g10 != null) {
            g10.d();
        }
    }

    @Override  // c.o
    public final void onSaveInstanceState(Bundle bundle0) {
        j.f(bundle0, "outState");
        super.onSaveInstanceState(bundle0);
        G1 g10 = this.G0;
        if(g10 != null) {
            bundle0.putInt("SAVED_ORIENTATION_LOCK", g10.c);
        }
    }
}

