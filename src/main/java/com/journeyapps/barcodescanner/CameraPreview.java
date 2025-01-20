package com.journeyapps.barcodescanner;

import A7.b;
import J5.k;
import T8.d;
import T8.e;
import T8.f;
import T8.q;
import U7.c;
import U8.i;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.google.android.gms.internal.measurement.E1;
import com.journeyapps.barcodescanner.camera.CameraInstance;
import com.journeyapps.barcodescanner.camera.CameraSettings;
import com.journeyapps.barcodescanner.camera.PreviewScalingStrategy;
import java.util.ArrayList;
import v8.h;

public class CameraPreview extends ViewGroup {
    public static final int A0;
    public CameraInstance b0;
    public final WindowManager c0;
    public final Handler d0;
    public boolean e0;
    public SurfaceView f0;
    public TextureView g0;
    public boolean h0;
    public final k i0;
    public int j0;
    public final ArrayList k0;
    public b l0;
    public CameraSettings m0;
    public Size n0;
    public Size o0;
    public Rect p0;
    public Size q0;
    public Rect r0;
    public Rect s0;
    public Size t0;
    public double u0;
    public PreviewScalingStrategy v0;
    public boolean w0;
    public final e x0;
    public final c y0;
    public final f z0;

    public CameraPreview(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.e0 = false;
        this.h0 = false;
        this.j0 = -1;
        this.k0 = new ArrayList();
        this.m0 = new CameraSettings();
        this.r0 = null;
        this.s0 = null;
        this.t0 = null;
        this.u0 = 0.1;
        this.v0 = null;
        this.w0 = false;
        this.x0 = new e(((BarcodeView)this));
        T8.c c0 = new T8.c(((BarcodeView)this), 1);
        this.y0 = new c(21, ((BarcodeView)this));
        this.z0 = new f(0, ((BarcodeView)this));
        if(this.getBackground() == null) {
            this.setBackgroundColor(0xFF000000);
        }
        this.c(attributeSet0);
        this.c0 = (WindowManager)context0.getSystemService("window");
        this.d0 = new Handler(c0);
        this.i0 = new k(4);
    }

    public static void a(BarcodeView barcodeView0) {
        if(barcodeView0.b0 != null && barcodeView0.getDisplayRotation() != barcodeView0.j0) {
            barcodeView0.d();
            barcodeView0.g();
        }
    }

    public Rect b(Rect rect0, Rect rect1) {
        Rect rect2 = new Rect(rect0);
        rect2.intersect(rect1);
        if(this.t0 != null) {
            rect2.inset(Math.max(0, (rect2.width() - this.t0.X) / 2), Math.max(0, (rect2.height() - this.t0.Y) / 2));
            return rect2;
        }
        int v = (int)Math.min(((double)rect2.width()) * this.u0, ((double)rect2.height()) * this.u0);
        rect2.inset(v, v);
        if(rect2.height() > rect2.width()) {
            rect2.inset(0, (rect2.height() - rect2.width()) / 2);
        }
        return rect2;
    }

    public final void c(AttributeSet attributeSet0) {
        TypedArray typedArray0 = this.getContext().obtainStyledAttributes(attributeSet0, h.a);
        int v = (int)typedArray0.getDimension(1, -1.0f);
        int v1 = (int)typedArray0.getDimension(0, -1.0f);
        if(v > 0 && v1 > 0) {
            this.t0 = new Size(v, v1);
        }
        this.e0 = typedArray0.getBoolean(3, true);
        int v2 = typedArray0.getInteger(2, -1);
        if(v2 == 1) {
            this.v0 = new i(0);
        }
        else if(v2 == 2) {
            this.v0 = new i(1);
        }
        else if(v2 == 3) {
            this.v0 = new i(2);
        }
        typedArray0.recycle();
    }

    public void d() {
        Q4.i.Q();
        Log.d("CameraPreview", "pause()");
        this.j0 = -1;
        CameraInstance cameraInstance0 = this.b0;
        if(cameraInstance0 == null) {
            this.d0.sendEmptyMessage(0x7F0A033B);  // id:zxing_camera_closed
        }
        else {
            Q4.i.Q();
            if(cameraInstance0.f) {
                cameraInstance0.a.d(cameraInstance0.l);
            }
            else {
                cameraInstance0.g = true;
            }
            cameraInstance0.f = false;
            this.b0 = null;
            this.h0 = false;
        }
        if(this.q0 == null) {
            SurfaceView surfaceView0 = this.f0;
            if(surfaceView0 != null) {
                surfaceView0.getHolder().removeCallback(this.x0);
            }
        }
        if(this.q0 == null) {
            TextureView textureView0 = this.g0;
            if(textureView0 != null) {
                textureView0.setSurfaceTextureListener(null);
            }
        }
        this.n0 = null;
        this.o0 = null;
        this.s0 = null;
        k k0 = this.i0;
        q q0 = (q)k0.d;
        if(q0 != null) {
            q0.disable();
        }
        k0.d = null;
        k0.c = null;
        k0.e = null;
        this.z0.d();
    }

    public final void e() {
        CameraInstance cameraInstance0 = this.getCameraInstance();
        this.d();
        long v = System.nanoTime();
        while(cameraInstance0 != null && !cameraInstance0.g && System.nanoTime() - v <= 2000000000L) {
            try {
                Thread.sleep(1L);
                continue;
            }
            catch(InterruptedException unused_ex) {
            }
            break;
        }
    }

    public void f() {
    }

    public final void g() {
        Q4.i.Q();
        Log.d("CameraPreview", "resume()");
        if(this.b0 == null) {
            Context context0 = this.getContext();
            CameraInstance cameraInstance0 = new CameraInstance();  // initializer: Ljava/lang/Object;-><init>()V
            cameraInstance0.f = false;
            cameraInstance0.g = true;
            cameraInstance0.i = new CameraSettings();
            U8.f f0 = new U8.f(cameraInstance0, 0);
            cameraInstance0.j = new U8.f(cameraInstance0, 1);
            cameraInstance0.k = new U8.f(cameraInstance0, 2);
            cameraInstance0.l = new U8.f(cameraInstance0, 3);
            Q4.i.Q();
            if(k.g == null) {
                k.g = new k();
            }
            k k0 = k.g;
            cameraInstance0.a = k0;
            U8.h h0 = new U8.h(context0);
            cameraInstance0.c = h0;
            h0.g = cameraInstance0.i;
            cameraInstance0.h = new Handler();
            CameraSettings cameraSettings0 = this.m0;
            if(!cameraInstance0.f) {
                cameraInstance0.i = cameraSettings0;
                h0.g = cameraSettings0;
            }
            this.b0 = cameraInstance0;
            cameraInstance0.d = this.d0;
            Q4.i.Q();
            cameraInstance0.f = true;
            cameraInstance0.g = false;
            synchronized(k0.e) {
                ++k0.b;
                k0.d(f0);
            }
            this.j0 = this.getDisplayRotation();
        }
        else {
            Log.w("CameraPreview", "initCamera called twice");
        }
        if(this.q0 == null) {
            SurfaceView surfaceView0 = this.f0;
            if(surfaceView0 == null) {
                TextureView textureView0 = this.g0;
                if(textureView0 != null) {
                    if(textureView0.isAvailable()) {
                        this.g0.getSurfaceTexture();
                        this.q0 = new Size(this.g0.getWidth(), this.g0.getHeight());
                        this.i();
                    }
                    else {
                        this.g0.setSurfaceTextureListener(new d(this));
                    }
                }
            }
            else {
                surfaceView0.getHolder().addCallback(this.x0);
            }
        }
        else {
            this.i();
        }
        this.requestLayout();
        k k1 = this.i0;
        Context context1 = this.getContext();
        c c0 = this.y0;
        q q0 = (q)k1.d;
        if(q0 != null) {
            q0.disable();
        }
        k1.d = null;
        k1.c = null;
        k1.e = null;
        Context context2 = context1.getApplicationContext();
        k1.e = c0;
        k1.c = (WindowManager)context2.getSystemService("window");
        q q1 = new q(k1, context2);
        k1.d = q1;
        q1.enable();
        k1.b = ((WindowManager)k1.c).getDefaultDisplay().getRotation();
    }

    public CameraInstance getCameraInstance() {
        return this.b0;
    }

    public CameraSettings getCameraSettings() {
        return this.m0;
    }

    private int getDisplayRotation() {
        return this.c0.getDefaultDisplay().getRotation();
    }

    public Rect getFramingRect() {
        return this.r0;
    }

    public Size getFramingRectSize() {
        return this.t0;
    }

    public double getMarginFraction() {
        return this.u0;
    }

    public Rect getPreviewFramingRect() {
        return this.s0;
    }

    public PreviewScalingStrategy getPreviewScalingStrategy() {
        PreviewScalingStrategy previewScalingStrategy0 = this.v0;
        if(previewScalingStrategy0 != null) {
            return previewScalingStrategy0;
        }
        return this.g0 == null ? new i(1) : new i(0);
    }

    public Size getPreviewSize() {
        return this.o0;
    }

    public final void h(E1 e10) {
        if(!this.h0 && this.b0 != null) {
            Log.i("CameraPreview", "Starting preview");
            CameraInstance cameraInstance0 = this.b0;
            cameraInstance0.b = e10;
            Q4.i.Q();
            if(!cameraInstance0.f) {
                throw new IllegalStateException("CameraInstance is not open");
            }
            cameraInstance0.a.d(cameraInstance0.k);
            this.h0 = true;
            this.f();
            this.z0.c();
        }
    }

    public final void i() {
        float f3;
        Size size0 = this.q0;
        if(size0 != null && this.o0 != null) {
            Rect rect0 = this.p0;
            if(rect0 != null) {
                if(this.f0 != null && size0.equals(new Size(rect0.width(), this.p0.height()))) {
                    SurfaceHolder surfaceHolder0 = this.f0.getHolder();
                    E1 e10 = new E1(7, false);
                    if(surfaceHolder0 == null) {
                        throw new IllegalArgumentException("surfaceHolder may not be null");
                    }
                    e10.Y = surfaceHolder0;
                    this.h(e10);
                    return;
                }
                if(this.g0 != null && this.g0.getSurfaceTexture() != null) {
                    if(this.o0 != null) {
                        int v = this.g0.getWidth();
                        int v1 = this.g0.getHeight();
                        Size size1 = this.o0;
                        float f = ((float)v) / ((float)v1);
                        float f1 = ((float)size1.X) / ((float)size1.Y);
                        float f2 = 1.0f;
                        if(Float.compare(f, f1) < 0) {
                            f3 = 1.0f;
                            f2 = f1 / f;
                        }
                        else {
                            f3 = f / f1;
                        }
                        Matrix matrix0 = new Matrix();
                        matrix0.setScale(f2, f3);
                        matrix0.postTranslate((((float)v) - f2 * ((float)v)) / 2.0f, (((float)v1) - f3 * ((float)v1)) / 2.0f);
                        this.g0.setTransform(matrix0);
                    }
                    SurfaceTexture surfaceTexture0 = this.g0.getSurfaceTexture();
                    E1 e11 = new E1(7, false);
                    if(surfaceTexture0 == null) {
                        throw new IllegalArgumentException("surfaceTexture may not be null");
                    }
                    e11.Z = surfaceTexture0;
                    this.h(e11);
                }
            }
        }
    }

    @Override  // android.view.ViewGroup
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if(this.e0) {
            TextureView textureView0 = new TextureView(this.getContext());
            this.g0 = textureView0;
            textureView0.setSurfaceTextureListener(new d(this));
            this.addView(this.g0);
            return;
        }
        SurfaceView surfaceView0 = new SurfaceView(this.getContext());
        this.f0 = surfaceView0;
        surfaceView0.getHolder().addCallback(this.x0);
        this.addView(this.f0);
    }

    @Override  // android.view.ViewGroup
    public final void onLayout(boolean z, int v, int v1, int v2, int v3) {
        Size size0 = new Size(v2 - v, v3 - v1);
        this.n0 = size0;
        if(this.b0 != null && this.b0.e == null) {
            int v4 = this.getDisplayRotation();
            b b0 = new b(5, false);
            b0.b0 = new i(1);
            b0.Y = v4;
            b0.Z = size0;
            this.l0 = b0;
            b0.b0 = this.getPreviewScalingStrategy();
            CameraInstance cameraInstance0 = this.b0;
            cameraInstance0.e = this.l0;
            cameraInstance0.c.h = this.l0;
            Q4.i.Q();
            if(!cameraInstance0.f) {
                throw new IllegalStateException("CameraInstance is not open");
            }
            cameraInstance0.a.d(cameraInstance0.j);
            boolean z1 = this.w0;
            if(z1) {
                CameraInstance cameraInstance1 = this.b0;
                cameraInstance1.getClass();
                Q4.i.Q();
                if(cameraInstance1.f) {
                    U8.e e0 = new U8.e(0, cameraInstance1, z1);
                    cameraInstance1.a.d(e0);
                }
            }
        }
        SurfaceView surfaceView0 = this.f0;
        if(surfaceView0 != null) {
            Rect rect0 = this.p0;
            if(rect0 == null) {
                surfaceView0.layout(0, 0, this.getWidth(), this.getHeight());
                return;
            }
            surfaceView0.layout(rect0.left, rect0.top, rect0.right, rect0.bottom);
            return;
        }
        TextureView textureView0 = this.g0;
        if(textureView0 != null) {
            textureView0.layout(0, 0, this.getWidth(), this.getHeight());
        }
    }

    @Override  // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable0) {
        if(!(parcelable0 instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((Bundle)parcelable0).getParcelable("super"));
        this.setTorch(((Bundle)parcelable0).getBoolean("torch"));
    }

    @Override  // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = super.onSaveInstanceState();
        Parcelable parcelable1 = new Bundle();
        ((Bundle)parcelable1).putParcelable("super", parcelable0);
        ((BaseBundle)parcelable1).putBoolean("torch", this.w0);
        return parcelable1;
    }

    public void setCameraSettings(CameraSettings cameraSettings0) {
        this.m0 = cameraSettings0;
    }

    public void setFramingRectSize(Size size0) {
        this.t0 = size0;
    }

    public void setMarginFraction(double f) {
        if(f >= 0.5) {
            throw new IllegalArgumentException("The margin fraction must be less than 0.5");
        }
        this.u0 = f;
    }

    public void setPreviewScalingStrategy(PreviewScalingStrategy previewScalingStrategy0) {
        this.v0 = previewScalingStrategy0;
    }

    public void setTorch(boolean z) {
        this.w0 = z;
        CameraInstance cameraInstance0 = this.b0;
        if(cameraInstance0 != null) {
            Q4.i.Q();
            if(cameraInstance0.f) {
                U8.e e0 = new U8.e(0, cameraInstance0, z);
                cameraInstance0.a.d(e0);
            }
        }
    }

    public void setUseTextureView(boolean z) {
        this.e0 = z;
    }
}

