package com.journeyapps.barcodescanner;

import J5.k;
import Q4.i;
import T8.a;
import T8.c;
import T8.l;
import T8.m;
import U8.d;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.AttributeSet;
import com.journeyapps.barcodescanner.camera.CameraInstance;
import java.util.HashMap;

public class BarcodeView extends CameraPreview {
    public int B0;
    public a C0;
    public m D0;
    public DecoderFactory E0;
    public final Handler F0;

    public BarcodeView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.B0 = 1;
        this.C0 = null;
        c c0 = new c(this, 0);
        this.E0 = new k(3);
        this.F0 = new Handler(c0);
    }

    @Override  // com.journeyapps.barcodescanner.CameraPreview
    public final void d() {
        this.l();
        super.d();
    }

    @Override  // com.journeyapps.barcodescanner.CameraPreview
    public final void f() {
        this.k();
    }

    public DecoderFactory getDecoderFactory() {
        return this.E0;
    }

    public final T8.k j() {
        if(this.E0 == null) {
            this.E0 = new k(3);
        }
        l l0 = new l();  // initializer: Ljava/lang/Object;-><init>()V
        HashMap hashMap0 = new HashMap();
        hashMap0.put(r8.c.h0, l0);
        T8.k k0 = this.E0.a(hashMap0);
        l0.a = k0;
        return k0;
    }

    public final void k() {
        this.l();
        if(this.B0 != 1 && this.h0) {
            m m0 = new m(this.getCameraInstance(), this.j(), this.F0);
            this.D0 = m0;
            m0.h = this.getPreviewFramingRect();
            m m1 = this.D0;
            m1.getClass();
            i.Q();
            HandlerThread handlerThread0 = new HandlerThread("m");
            m1.d = handlerThread0;
            handlerThread0.start();
            m1.e = new Handler(((HandlerThread)m1.d).getLooper(), ((I6.c)m1.i));
            m1.b = true;
            ((CameraInstance)m1.c).h.post(new d(((CameraInstance)m1.c), ((B3.d)m1.j), 0));
        }
    }

    public final void l() {
        m m0 = this.D0;
        if(m0 != null) {
            m0.getClass();
            i.Q();
            synchronized(m0.a) {
                m0.b = false;
                ((Handler)m0.e).removeCallbacksAndMessages(null);
                ((HandlerThread)m0.d).quit();
            }
            this.D0 = null;
        }
    }

    public void setDecoderFactory(DecoderFactory decoderFactory0) {
        i.Q();
        this.E0 = decoderFactory0;
        m m0 = this.D0;
        if(m0 != null) {
            m0.g = this.j();
        }
    }
}

