package r3;

import A3.c;
import C3.i;
import E3.e;
import E3.l;
import J1.T;
import android.animation.Animator.AnimatorListener;
import android.animation.Animator.AnimatorPauseListener;
import android.content.Context;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings.Global;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import i.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import v.h;
import y3.d;

public final class j extends Drawable implements Animatable, Drawable.Callback {
    public Matrix A0;
    public final float[] B0;
    public Matrix C0;
    public boolean D0;
    public final Semaphore E0;
    public Handler F0;
    public f G0;
    public final f H0;
    public float I0;
    public int J0;
    public int K0;
    public int L0;
    public static final boolean M0;
    public static final List N0;
    public static final ThreadPoolExecutor O0;
    public a X;
    public final E3.f Y;
    public final boolean Z;
    public boolean b0;
    public final ArrayList c0;
    public w3.a d0;
    public i e0;
    public Map f0;
    public final s g0;
    public boolean h0;
    public boolean i0;
    public c j0;
    public int k0;
    public boolean l0;
    public boolean m0;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public final Matrix q0;
    public Bitmap r0;
    public Canvas s0;
    public Rect t0;
    public RectF u0;
    public A3.j v0;
    public Rect w0;
    public Rect x0;
    public RectF y0;
    public RectF z0;

    static {
        j.M0 = Build.VERSION.SDK_INT <= 25;
        j.N0 = Arrays.asList(new String[]{"reduced motion", "reduced_motion", "reduced-motion", "reducedmotion"});
        j.O0 = new ThreadPoolExecutor(0, 2, 35L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new e());
    }

    public j() {
        E3.f f0 = new E3.f();
        this.Y = f0;
        this.Z = true;
        this.b0 = false;
        this.J0 = 1;
        this.c0 = new ArrayList();
        this.g0 = new s(16);
        this.h0 = false;
        this.i0 = true;
        this.k0 = 0xFF;
        this.o0 = false;
        this.K0 = 1;
        this.p0 = false;
        this.q0 = new Matrix();
        this.B0 = new float[9];
        this.D0 = false;
        T t0 = new T(this);
        this.E0 = new Semaphore(1);
        this.H0 = new f(this, 0);
        this.I0 = -3.402823E+38f;
        f0.addUpdateListener(t0);
    }

    // Deobfuscation rating: LOW(20)
    public final boolean a(Context context0) {
        return this.Z && (context0 == null || Settings.Global.getFloat(context0.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f);
    }

    public final void b() {
        a a0 = this.X;
        if(a0 == null) {
            return;
        }
        Rect rect0 = a0.k;
        List list0 = Collections.emptyList();
        List list1 = Collections.emptyList();
        new d();
        c c0 = new c(this, new A3.f(list0, a0, "__container", -1L, 1, -1L, null, list1, null, 0, 0, 0, 0.0f, 0.0f, ((float)rect0.width()), ((float)rect0.height()), null, null, Collections.emptyList(), 1, null, false, null, null, 1), a0.j, a0);
        this.j0 = c0;
        if(this.l0) {
            c0.l(true);
        }
        this.j0.L = this.i0;
    }

    public final void c() {
        a a0 = this.X;
        if(a0 == null) {
            return;
        }
        int v = Build.VERSION.SDK_INT;
        boolean z = a0.o;
        int v1 = a0.p;
        int v2 = h.d(this.K0);
        boolean z1 = false;
        if(v2 != 1) {
            if(v2 == 2 || z && v < 28) {
                z1 = true;
            }
            else if(v1 > 4 || v <= 25) {
                z1 = true;
            }
        }
        this.p0 = z1;
    }

    public static void d(Rect rect0, RectF rectF0) {
        rect0.set(((int)Math.floor(rectF0.left)), ((int)Math.floor(rectF0.top)), ((int)Math.ceil(rectF0.right)), ((int)Math.ceil(rectF0.bottom)));
    }

    @Override  // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas0) {
        E3.f f1;
        f f0;
        Semaphore semaphore0;
        ThreadPoolExecutor threadPoolExecutor0;
        c c0 = this.j0;
        if(c0 == null) {
            return;
        }
        int v = this.L0;
        boolean z = true;
        if(v == 0) {
            v = 1;
        }
        if(v != 2) {
            z = false;
        }
        try {
            threadPoolExecutor0 = j.O0;
            semaphore0 = this.E0;
            f0 = this.H0;
            f1 = this.Y;
            if(z) {
                semaphore0.acquire();
            }
            if(z && this.m()) {
                this.l(f1.b());
            }
            if(this.b0) {
                goto label_23;
            }
            else if(this.p0) {
                this.i(canvas0, c0);
                goto label_43;
            }
            else {
                this.e(canvas0);
                goto label_43;
            }
            return;
        }
        catch(InterruptedException unused_ex) {
            goto label_32;
        }
        catch(Throwable throwable0) {
            goto label_37;
        }
        try {
        label_23:
            if(this.p0) {
                this.i(canvas0, c0);
            }
            else {
                this.e(canvas0);
            }
            goto label_43;
        }
        catch(Throwable unused_ex) {
            try {
                E3.d.a.getClass();
                goto label_43;
            }
            catch(InterruptedException unused_ex) {
            }
            catch(Throwable throwable0) {
                goto label_37;
            }
        }
    label_32:
        if(z) {
            semaphore0.release();
            float f2 = f1.b();
            if(c0.K != f2) {
                threadPoolExecutor0.execute(f0);
                return;
            }
            return;
        label_37:
            if(z) {
                semaphore0.release();
                float f3 = f1.b();
                if(c0.K != f3) {
                    threadPoolExecutor0.execute(f0);
                }
            }
            throw throwable0;
        label_43:
            this.D0 = false;
            if(z) {
                semaphore0.release();
                float f4 = f1.b();
                if(c0.K != f4) {
                    threadPoolExecutor0.execute(f0);
                }
            }
        }
    }

    public final void e(Canvas canvas0) {
        c c0 = this.j0;
        a a0 = this.X;
        if(c0 != null && a0 != null) {
            Matrix matrix0 = this.q0;
            matrix0.reset();
            Rect rect0 = this.getBounds();
            if(!rect0.isEmpty()) {
                float f = ((float)rect0.width()) / ((float)a0.k.width());
                float f1 = ((float)rect0.height()) / ((float)a0.k.height());
                matrix0.preTranslate(((float)rect0.left), ((float)rect0.top));
                matrix0.preScale(f, f1);
            }
            c0.e(canvas0, matrix0, this.k0, null);
        }
    }

    public final Context f() {
        Drawable.Callback drawable$Callback0 = this.getCallback();
        if(drawable$Callback0 == null) {
            return null;
        }
        return drawable$Callback0 instanceof View ? ((View)drawable$Callback0).getContext() : null;
    }

    public final x3.f g() {
        x3.f f0 = null;
        for(Object object0: j.N0) {
            String s = (String)object0;
            a a0 = this.X;
            int v = a0.g.size();
            int v1 = 0;
            while(true) {
                f0 = null;
                if(v1 < v) {
                    x3.f f1 = (x3.f)a0.g.get(v1);
                    if(!f1.a.equalsIgnoreCase(s) && (!f1.a.endsWith("\r") || !f1.a.substring(0, f1.a.length() - 1).equalsIgnoreCase(s))) {
                        ++v1;
                        continue;
                    }
                    else {
                        f0 = f1;
                    }
                }
                break;
            }
            if(f0 != null) {
                break;
            }
        }
        return f0;
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.k0;
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.X == null ? -1 : this.X.k.height();
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.X == null ? -1 : this.X.k.width();
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h() {
        if(this.j0 == null) {
            r3.e e0 = new r3.e(this, 1);
            this.c0.add(e0);
            return;
        }
        this.c();
        boolean z = this.a(this.f());
        E3.f f0 = this.Y;
        if(z || f0.getRepeatCount() == 0) {
            if(this.isVisible()) {
                f0.k0 = true;
                boolean z1 = f0.e();
                for(Object object0: f0.Y) {
                    Animator.AnimatorListener animator$AnimatorListener0 = (Animator.AnimatorListener)object0;
                    if(Build.VERSION.SDK_INT >= 26) {
                        animator$AnimatorListener0.onAnimationStart(f0, z1);
                    }
                    else {
                        animator$AnimatorListener0.onAnimationStart(f0);
                    }
                }
                f0.i(((float)(((int)(f0.e() ? f0.c() : f0.d())))));
                f0.d0 = 0L;
                f0.g0 = 0;
                if(f0.k0) {
                    f0.h(false);
                    Choreographer.getInstance().postFrameCallback(f0);
                }
                this.J0 = 1;
            }
            else {
                this.J0 = 2;
            }
        }
        if(!this.a(this.f())) {
            x3.f f1 = this.g();
            if(f1 == null) {
                this.k(((int)(f0.b0 < 0.0f ? f0.d() : f0.c())));
            }
            else {
                this.k(((int)f1.b));
            }
            f0.h(true);
            f0.f(f0.e());
            if(!this.isVisible()) {
                this.J0 = 1;
            }
        }
    }

    public final void i(Canvas canvas0, c c0) {
        int v;
        if(this.X != null && c0 != null) {
            if(this.s0 == null) {
                this.s0 = new Canvas();
                this.z0 = new RectF();
                this.A0 = new Matrix();
                this.C0 = new Matrix();
                this.t0 = new Rect();
                this.u0 = new RectF();
                this.v0 = new A3.j();
                this.w0 = new Rect();
                this.x0 = new Rect();
                this.y0 = new RectF();
            }
            canvas0.getMatrix(this.A0);
            canvas0.getClipBounds(this.t0);
            this.u0.set(((float)this.t0.left), ((float)this.t0.top), ((float)this.t0.right), ((float)this.t0.bottom));
            this.A0.mapRect(this.u0);
            j.d(this.t0, this.u0);
            if(this.i0) {
                this.z0.set(0.0f, 0.0f, ((float)this.getIntrinsicWidth()), ((float)this.getIntrinsicHeight()));
            }
            else {
                c0.a(this.z0, null, false);
            }
            this.A0.mapRect(this.z0);
            Rect rect0 = this.getBounds();
            float f = ((float)rect0.width()) / ((float)this.getIntrinsicWidth());
            float f1 = ((float)rect0.height()) / ((float)this.getIntrinsicHeight());
            this.z0.set(this.z0.left * f, this.z0.top * f1, this.z0.right * f, this.z0.bottom * f1);
            Drawable.Callback drawable$Callback0 = this.getCallback();
            if(drawable$Callback0 instanceof View) {
                ViewParent viewParent0 = ((View)drawable$Callback0).getParent();
                v = viewParent0 instanceof ViewGroup ? !((ViewGroup)viewParent0).getClipChildren() : 0;
            }
            else {
                v = 0;
            }
            if(v == 0) {
                this.z0.intersect(((float)this.t0.left), ((float)this.t0.top), ((float)this.t0.right), ((float)this.t0.bottom));
            }
            int v1 = (int)Math.ceil(this.z0.width());
            int v2 = (int)Math.ceil(this.z0.height());
            if(v1 > 0 && v2 > 0) {
                if(this.r0 == null || this.r0.getWidth() < v1 || this.r0.getHeight() < v2) {
                    Bitmap bitmap1 = Bitmap.createBitmap(v1, v2, Bitmap.Config.ARGB_8888);
                    this.r0 = bitmap1;
                    this.s0.setBitmap(bitmap1);
                    this.D0 = true;
                }
                else if(this.r0.getWidth() > v1 || this.r0.getHeight() > v2) {
                    Bitmap bitmap0 = Bitmap.createBitmap(this.r0, 0, 0, v1, v2);
                    this.r0 = bitmap0;
                    this.s0.setBitmap(bitmap0);
                    this.D0 = true;
                }
                if(this.D0) {
                    this.A0.getValues(this.B0);
                    float f2 = this.B0[0];
                    float f3 = this.B0[4];
                    this.q0.set(this.A0);
                    this.q0.preScale(f, f1);
                    this.q0.postTranslate(-this.z0.left, -this.z0.top);
                    this.q0.postScale(1.0f / f2, 1.0f / f3);
                    this.r0.eraseColor(0);
                    this.s0.setMatrix(l.a);
                    this.s0.scale(f2, f3);
                    c0.e(this.s0, this.q0, this.k0, null);
                    this.A0.invert(this.C0);
                    this.C0.mapRect(this.y0, this.z0);
                    j.d(this.x0, this.y0);
                }
                this.w0.set(0, 0, v1, v2);
                canvas0.drawBitmap(this.r0, this.w0, this.x0, this.v0);
            }
        }
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public final void invalidateDrawable(Drawable drawable0) {
        Drawable.Callback drawable$Callback0 = this.getCallback();
        if(drawable$Callback0 == null) {
            return;
        }
        drawable$Callback0.invalidateDrawable(this);
    }

    @Override  // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if(this.D0) {
            return;
        }
        this.D0 = true;
        if(j.M0 && Looper.getMainLooper() != Looper.myLooper()) {
            return;
        }
        Drawable.Callback drawable$Callback0 = this.getCallback();
        if(drawable$Callback0 != null) {
            drawable$Callback0.invalidateDrawable(this);
        }
    }

    @Override  // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.Y == null ? false : this.Y.k0;
    }

    public final void j() {
        if(this.j0 == null) {
            r3.e e0 = new r3.e(this, 0);
            this.c0.add(e0);
            return;
        }
        this.c();
        boolean z = this.a(this.f());
        E3.f f0 = this.Y;
        if(z || f0.getRepeatCount() == 0) {
            if(this.isVisible()) {
                f0.k0 = true;
                f0.h(false);
                Choreographer.getInstance().postFrameCallback(f0);
                f0.d0 = 0L;
                if(f0.e()) {
                    float f1 = f0.d();
                    if(f0.f0 == f1) {
                        f0.i(f0.c());
                        goto label_22;
                    }
                    goto label_18;
                }
                else {
                label_18:
                    if(!f0.e()) {
                        float f2 = f0.c();
                        if(f0.f0 == f2) {
                            f0.i(f0.d());
                        }
                    }
                }
            label_22:
                for(Object object0: f0.Z) {
                    ((Animator.AnimatorPauseListener)object0).onAnimationResume(f0);
                }
                this.J0 = 1;
            }
            else {
                this.J0 = 3;
            }
        }
        if(!this.a(this.f())) {
            this.k(((int)(f0.b0 < 0.0f ? f0.d() : f0.c())));
            f0.h(true);
            f0.f(f0.e());
            if(!this.isVisible()) {
                this.J0 = 1;
            }
        }
    }

    // Detected as a lambda impl.
    public final void k(int v) {
        if(this.X == null) {
            r3.h h0 = new r3.h(this, v);
            this.c0.add(h0);
            return;
        }
        this.Y.i(((float)v));
    }

    // Detected as a lambda impl.
    public final void l(float f) {
        a a0 = this.X;
        if(a0 == null) {
            g g0 = new g(this, f);
            this.c0.add(g0);
            return;
        }
        this.Y.i(E3.g.e(a0.l, a0.m, f));
    }

    public final boolean m() {
        a a0 = this.X;
        if(a0 == null) {
            return false;
        }
        float f = this.I0;
        float f1 = this.Y.b();
        this.I0 = f1;
        return Math.abs(f1 - f) * a0.b() >= 50.0f;
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public final void scheduleDrawable(Drawable drawable0, Runnable runnable0, long v) {
        Drawable.Callback drawable$Callback0 = this.getCallback();
        if(drawable$Callback0 == null) {
            return;
        }
        drawable$Callback0.scheduleDrawable(this, runnable0, v);
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setAlpha(int v) {
        this.k0 = v;
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter0) {
        E3.d.b("Use addColorFilter instead.");
    }

    @Override  // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z1) {
        boolean z2 = this.isVisible();
        boolean z3 = super.setVisible(z, z1);
        if(z) {
            int v = this.J0;
            if(v == 2) {
                this.h();
                return z3;
            }
            if(v == 3) {
                this.j();
                return z3;
            }
        }
        else {
            E3.f f0 = this.Y;
            if(f0.k0) {
                this.c0.clear();
                f0.h(true);
                for(Object object0: f0.Z) {
                    ((Animator.AnimatorPauseListener)object0).onAnimationPause(f0);
                }
                if(!this.isVisible()) {
                    this.J0 = 1;
                }
                this.J0 = 3;
                return z3;
            }
            if(z2) {
                this.J0 = 1;
            }
        }
        return z3;
    }

    @Override  // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback drawable$Callback0 = this.getCallback();
        if(drawable$Callback0 instanceof View && ((View)drawable$Callback0).isInEditMode()) {
            return;
        }
        this.h();
    }

    @Override  // android.graphics.drawable.Animatable
    public final void stop() {
        this.c0.clear();
        this.Y.h(true);
        this.Y.f(this.Y.e());
        if(!this.isVisible()) {
            this.J0 = 1;
        }
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public final void unscheduleDrawable(Drawable drawable0, Runnable runnable0) {
        Drawable.Callback drawable$Callback0 = this.getCallback();
        if(drawable$Callback0 == null) {
            return;
        }
        drawable$Callback0.unscheduleDrawable(this, runnable0);
    }
}

