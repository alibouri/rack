package E3;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter.Blur;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader.TileMode;
import android.os.Build.VERSION;
import n0.o;
import q0.f;
import v.h;
import z1.c;

public final class j {
    public b A;
    public static final Matrix B;
    public Canvas a;
    public A0.b b;
    public int c;
    public RectF d;
    public RectF e;
    public Rect f;
    public RectF g;
    public RectF h;
    public Rect i;
    public RectF j;
    public A3.j k;
    public Bitmap l;
    public Canvas m;
    public Rect n;
    public A3.j o;
    public Matrix p;
    public float[] q;
    public Bitmap r;
    public Bitmap s;
    public Canvas t;
    public Canvas u;
    public A3.j v;
    public BlurMaskFilter w;
    public float x;
    public RenderNode y;
    public RenderNode z;

    static {
        j.B = new Matrix();
    }

    public j() {
        this.x = 0.0f;
    }

    public static Bitmap a(RectF rectF0, Bitmap.Config bitmap$Config0) {
        return Bitmap.createBitmap(((int)Math.ceil(((double)rectF0.width()) * 1.05)), ((int)Math.ceil(((double)rectF0.height()) * 1.05)), bitmap$Config0);
    }

    public final RectF b(RectF rectF0, b b0) {
        if(this.e == null) {
            this.e = new RectF();
        }
        if(this.g == null) {
            this.g = new RectF();
        }
        this.e.set(rectF0);
        this.e.offsetTo(rectF0.left + b0.b, rectF0.top + b0.c);
        this.e.inset(-b0.a, -b0.a);
        this.g.set(rectF0);
        this.e.union(this.g);
        return this.e;
    }

    public final void c() {
        if(this.a != null && this.b != null && this.q != null && this.d != null) {
            float f = 1.0f;
            switch(h.d(this.c)) {
                case 0: {
                    this.a.restore();
                    this.a = null;
                    return;
                }
                case 1: {
                    this.a.restore();
                    this.a = null;
                    return;
                }
                case 2: {
                    if(this.l == null) {
                        throw new IllegalStateException("Bitmap is not ready; should\'ve been initialized at start() time");
                    }
                    if(this.b.g()) {
                        Canvas canvas0 = this.a;
                        b b0 = (b)this.b.Y;
                        RectF rectF0 = this.d;
                        if(rectF0 == null || this.l == null) {
                            throw new IllegalStateException("Cannot render to bitmap outside a start()/finish() block");
                        }
                        RectF rectF1 = this.b(rectF0, b0);
                        if(this.f == null) {
                            this.f = new Rect();
                        }
                        this.f.set(((int)Math.floor(rectF1.left)), ((int)Math.floor(rectF1.top)), ((int)Math.ceil(rectF1.right)), ((int)Math.ceil(rectF1.bottom)));
                        float[] arr_f = this.q;
                        float f1 = arr_f == null ? 1.0f : arr_f[0];
                        if(arr_f != null) {
                            f = arr_f[4];
                        }
                        if(this.h == null) {
                            this.h = new RectF();
                        }
                        this.h.set(rectF1.left * f1, rectF1.top * f, rectF1.right * f1, rectF1.bottom * f);
                        if(this.i == null) {
                            this.i = new Rect();
                        }
                        this.i.set(0, 0, Math.round(this.h.width()), Math.round(this.h.height()));
                        if(j.d(this.r, this.h)) {
                            Bitmap bitmap0 = this.r;
                            if(bitmap0 != null) {
                                bitmap0.recycle();
                            }
                            Bitmap bitmap1 = this.s;
                            if(bitmap1 != null) {
                                bitmap1.recycle();
                            }
                            this.r = j.a(this.h, Bitmap.Config.ARGB_8888);
                            this.s = j.a(this.h, Bitmap.Config.ALPHA_8);
                            this.t = new Canvas(this.r);
                            this.u = new Canvas(this.s);
                            goto label_46;
                        }
                        else {
                            Canvas canvas1 = this.t;
                            if(canvas1 != null && this.u != null) {
                                A3.j j0 = this.o;
                                if(j0 != null) {
                                    canvas1.drawRect(this.i, j0);
                                    this.u.drawRect(this.i, this.o);
                                label_46:
                                    if(this.s == null) {
                                        throw new IllegalStateException("Expected to have allocated a shadow mask bitmap");
                                    }
                                    if(this.v == null) {
                                        this.v = new A3.j(1, 2);
                                    }
                                    this.u.drawBitmap(this.l, ((float)Math.round((this.d.left - rectF1.left) * f1)), ((float)Math.round((this.d.top - rectF1.top) * f)), null);
                                    if(this.w == null || this.x != b0.a) {
                                        float f2 = (f1 + f) * b0.a / 2.0f;
                                        this.w = f2 > 0.0f ? new BlurMaskFilter(f2, BlurMaskFilter.Blur.NORMAL) : null;
                                        this.x = b0.a;
                                    }
                                    this.v.setColor(b0.d);
                                    if(b0.a > 0.0f) {
                                        this.v.setMaskFilter(this.w);
                                    }
                                    else {
                                        this.v.setMaskFilter(null);
                                    }
                                    this.v.setFilterBitmap(true);
                                    this.t.drawBitmap(this.s, ((float)Math.round(b0.b * f1)), ((float)Math.round(b0.c * f)), this.v);
                                    canvas0.drawBitmap(this.r, this.i, this.f, this.k);
                                    goto label_69;
                                }
                            }
                            throw new IllegalStateException("If needNewBitmap() returns true, we should have a canvas and bitmap ready");
                        }
                    }
                label_69:
                    if(this.n == null) {
                        this.n = new Rect();
                    }
                    this.n.set(0, 0, ((int)(this.d.width() * this.q[0])), ((int)(this.d.height() * this.q[4])));
                    this.a.drawBitmap(this.l, this.n, this.d, this.k);
                    this.a = null;
                    return;
                }
                case 3: {
                    if(this.y == null) {
                        throw new IllegalStateException("RenderNode is not ready; should\'ve been initialized at start() time");
                    }
                    int v = Build.VERSION.SDK_INT;
                    if(v < 29) {
                        throw new IllegalStateException("RenderNode not supported but we chose it as render strategy");
                    }
                    this.a.save();
                    this.a.scale(1.0f / this.q[0], 1.0f / this.q[4]);
                    this.y.endRecording();
                    if(this.b.g()) {
                        Canvas canvas2 = this.a;
                        b b1 = (b)this.b.Y;
                        if(this.y == null || this.z == null) {
                            throw new IllegalStateException("Cannot render to render node outside a start()/finish() block");
                        }
                        if(v < 0x1F) {
                            throw new RuntimeException("RenderEffect is not supported on API level <31");
                        }
                        float[] arr_f1 = this.q;
                        float f3 = arr_f1 == null ? 1.0f : arr_f1[0];
                        if(arr_f1 != null) {
                            f = arr_f1[4];
                        }
                        if(this.A != null || b1.a == this.A.a || b1.b == this.A.b || b1.c == this.A.c || b1.d != this.A.d) {
                            RenderEffect renderEffect0 = RenderEffect.createColorFilterEffect(new PorterDuffColorFilter(b1.d, PorterDuff.Mode.SRC_IN));
                            float f4 = b1.a;
                            if(f4 > 0.0f) {
                                float f5 = (f3 + f) * f4 / 2.0f;
                                renderEffect0 = RenderEffect.createBlurEffect(f5, f5, renderEffect0, Shader.TileMode.CLAMP);
                            }
                            this.z.setRenderEffect(renderEffect0);
                            this.A = b1;
                        }
                        RectF rectF2 = this.b(this.d, b1);
                        RectF rectF3 = new RectF(rectF2.left * f3, rectF2.top * f, rectF2.right * f3, rectF2.bottom * f);
                        f.o(this.z, ((int)rectF3.width()), ((int)rectF3.height()));
                        RecordingCanvas recordingCanvas0 = this.z.beginRecording(((int)rectF3.width()), ((int)rectF3.height()));
                        recordingCanvas0.translate(b1.b * f3 + -rectF3.left, b1.c * f + -rectF3.top);
                        recordingCanvas0.drawRenderNode(this.y);
                        this.z.endRecording();
                        canvas2.save();
                        canvas2.translate(rectF3.left, rectF3.top);
                        canvas2.drawRenderNode(this.z);
                        canvas2.restore();
                    }
                    this.a.drawRenderNode(this.y);
                    this.a.restore();
                    this.a = null;
                    return;
                }
                default: {
                    this.a = null;
                    return;
                }
            }
        }
        throw new IllegalStateException("OffscreenBitmap: finish() call without matching start()");
    }

    public static boolean d(Bitmap bitmap0, RectF rectF0) {
        return bitmap0 == null ? true : rectF0.width() >= ((float)bitmap0.getWidth()) || rectF0.height() >= ((float)bitmap0.getHeight()) || rectF0.width() < ((float)bitmap0.getWidth()) * 0.75f || rectF0.height() < ((float)bitmap0.getHeight()) * 0.75f;
    }

    public final Canvas e(Canvas canvas0, RectF rectF0, A0.b b0) {
        if(this.a == null) {
            if(this.q == null) {
                this.q = new float[9];
            }
            if(this.p == null) {
                this.p = new Matrix();
            }
            canvas0.getMatrix(this.p);
            this.p.getValues(this.q);
            float[] arr_f = this.q;
            float f = arr_f[0];
            int v = 4;
            float f1 = arr_f[4];
            if(this.j == null) {
                this.j = new RectF();
            }
            this.j.set(rectF0.left * f, rectF0.top * f1, rectF0.right * f, rectF0.bottom * f1);
            this.a = canvas0;
            this.b = b0;
            if(b0.X >= 0xFF && !b0.g()) {
                v = 1;
            }
            else if(b0.g()) {
                int v1 = Build.VERSION.SDK_INT;
                if(v1 >= 29 || !canvas0.isHardwareAccelerated() || v1 <= 0x1F) {
                    v = 3;
                }
            }
            else {
                v = 2;
            }
            this.c = v;
            if(this.d == null) {
                this.d = new RectF();
            }
            this.d.set(((float)(((int)rectF0.left))), ((float)(((int)rectF0.top))), ((float)(((int)rectF0.right))), ((float)(((int)rectF0.bottom))));
            if(this.k == null) {
                this.k = new A3.j();
            }
            this.k.reset();
            int v2 = h.d(this.c);
            switch(v2) {
                case 0: {
                    canvas0.save();
                    return canvas0;
                }
                case 1: {
                    this.k.setAlpha(b0.X);
                    this.k.setColorFilter(null);
                    canvas0.saveLayer(rectF0, this.k);
                    return canvas0;
                }
                default: {
                    Matrix matrix0 = j.B;
                    switch(v2) {
                        case 2: {
                            if(this.o == null) {
                                A3.j j0 = new A3.j();
                                this.o = j0;
                                j0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                            }
                            if(j.d(this.l, this.j)) {
                                Bitmap bitmap0 = this.l;
                                if(bitmap0 != null) {
                                    bitmap0.recycle();
                                }
                                this.l = j.a(this.j, Bitmap.Config.ARGB_8888);
                                this.m = new Canvas(this.l);
                            }
                            else {
                                Canvas canvas1 = this.m;
                                if(canvas1 == null) {
                                    throw new IllegalStateException("If needNewBitmap() returns true, we should have a canvas ready");
                                }
                                canvas1.setMatrix(matrix0);
                                this.m.drawRect(-1.0f, -1.0f, this.j.width() + 1.0f, this.j.height() + 1.0f, this.o);
                            }
                            c.a(0, this.k);
                            this.k.setColorFilter(null);
                            this.k.setAlpha(b0.X);
                            canvas0 = this.m;
                            canvas0.scale(f, f1);
                            canvas0.translate(-rectF0.left, -rectF0.top);
                            return canvas0;
                        }
                        case 3: {
                            if(Build.VERSION.SDK_INT < 29) {
                                throw new IllegalStateException("RenderNode not supported but we chose it as render strategy");
                            }
                            if(this.y == null) {
                                this.y = E3.h.d();
                            }
                            if(b0.g() && this.z == null) {
                                this.z = E3.h.q();
                                this.A = null;
                            }
                            this.y.setAlpha(((float)b0.X) / 255.0f);
                            if(b0.g()) {
                                RenderNode renderNode0 = this.z;
                                if(renderNode0 == null) {
                                    throw new IllegalStateException("Must initialize shadowRenderNode when we have shadow");
                                }
                                renderNode0.setAlpha(((float)b0.X) / 255.0f);
                            }
                            o.s(this.y);
                            this.y.setPosition(((int)this.j.left), ((int)this.j.top), ((int)this.j.right), ((int)this.j.bottom));
                            RecordingCanvas recordingCanvas0 = this.y.beginRecording(((int)this.j.width()), ((int)this.j.height()));
                            recordingCanvas0.setMatrix(matrix0);
                            recordingCanvas0.scale(f, f1);
                            recordingCanvas0.translate(-rectF0.left, -rectF0.top);
                            return recordingCanvas0;
                        }
                        default: {
                            throw new RuntimeException("Invalid render strategy for OffscreenLayer");
                        }
                    }
                }
            }
        }
        throw new IllegalStateException("Cannot nest start() calls on a single OffscreenBitmap - call finish() first");
    }
}

