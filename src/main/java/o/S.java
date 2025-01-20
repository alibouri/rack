package o;

import A1.e;
import Bb.F;
import I5.h;
import Z1.b;
import Z1.d;
import Z1.g;
import a8.Q;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import h.a;
import io.sentry.internal.debugmeta.c;

public class s {
    public final int a;
    public View b;
    public Object c;
    public static final int[] d;

    static {
        s.d = new int[]{0x101013B, 0x101013C};
    }

    public s() {
        this.a = 2;
        super();
    }

    public s(AbsSeekBar absSeekBar0) {
        this.a = 0;
        super();
        this.b = absSeekBar0;
    }

    public s(EditText editText0) {
        this.a = 1;
        super();
        this.b = editText0;
        this.c = new h(editText0);
    }

    public KeyListener a(KeyListener keyListener0) {
        if(!(keyListener0 instanceof NumberKeyListener)) {
            ((c)((h)this.c).Y).getClass();
            if(!(keyListener0 instanceof d)) {
                if(keyListener0 == null) {
                    return null;
                }
                if(!(keyListener0 instanceof NumberKeyListener)) {
                    return new d(keyListener0);
                }
            }
        }
        return keyListener0;
    }

    public void b(AttributeSet attributeSet0, int v) {
        if(this.a != 0) {
            boolean z = true;
            TypedArray typedArray0 = ((EditText)this.b).getContext().obtainStyledAttributes(attributeSet0, a.i, v, 0);
            try {
                if(typedArray0.hasValue(14)) {
                    z = typedArray0.getBoolean(14, true);
                }
            }
            finally {
                typedArray0.recycle();
            }
            this.d(z);
            return;
        }
        AbsSeekBar absSeekBar0 = (AbsSeekBar)this.b;
        Q q0 = Q.G(absSeekBar0.getContext(), attributeSet0, s.d, v);
        Drawable drawable0 = q0.u(0);
        if(drawable0 != null) {
            if(drawable0 instanceof AnimationDrawable) {
                int v2 = ((AnimationDrawable)drawable0).getNumberOfFrames();
                AnimationDrawable animationDrawable0 = new AnimationDrawable();
                animationDrawable0.setOneShot(((AnimationDrawable)drawable0).isOneShot());
                for(int v3 = 0; v3 < v2; ++v3) {
                    Drawable drawable1 = this.e(((AnimationDrawable)drawable0).getFrame(v3), true);
                    drawable1.setLevel(10000);
                    animationDrawable0.addFrame(drawable1, ((AnimationDrawable)drawable0).getDuration(v3));
                }
                animationDrawable0.setLevel(10000);
                drawable0 = animationDrawable0;
            }
            absSeekBar0.setIndeterminateDrawable(drawable0);
        }
        Drawable drawable2 = q0.u(1);
        if(drawable2 != null) {
            absSeekBar0.setProgressDrawable(this.e(drawable2, false));
        }
        q0.I();
    }

    public b c(InputConnection inputConnection0, EditorInfo editorInfo0) {
        h h0 = (h)this.c;
        if(inputConnection0 == null) {
            h0.getClass();
            return null;
        }
        c c0 = (c)h0.Y;
        c0.getClass();
        if(!(inputConnection0 instanceof b)) {
            inputConnection0 = new b(((EditText)c0.Y), inputConnection0, editorInfo0);
        }
        return (b)inputConnection0;
    }

    public void d(boolean z) {
        Z1.h h0 = (Z1.h)((c)((h)this.c).Y).Z;
        if(h0.Z != z) {
            if(h0.Y != null) {
                X1.h h1 = X1.h.a();
                g g0 = h0.Y;
                h1.getClass();
                F.n(g0, "initCallback cannot be null");
                h1.a.writeLock().lock();
                try {
                    h1.b.remove(g0);
                }
                finally {
                    h1.a.writeLock().unlock();
                }
            }
            h0.Z = z;
            if(z) {
                int v1 = X1.h.a().b();
                Z1.h.a(h0.X, v1);
            }
        }
    }

    public Drawable e(Drawable drawable0, boolean z) {
        if(drawable0 instanceof A1.d) {
            ((e)(((A1.d)drawable0))).getClass();
            return drawable0;
        }
        if(drawable0 instanceof LayerDrawable) {
            int v = ((LayerDrawable)drawable0).getNumberOfLayers();
            Drawable[] arr_drawable = new Drawable[v];
            for(int v2 = 0; v2 < v; ++v2) {
                int v3 = ((LayerDrawable)drawable0).getId(v2);
                arr_drawable[v2] = this.e(((LayerDrawable)drawable0).getDrawable(v2), v3 == 0x102000D || v3 == 0x102000F);
            }
            Drawable drawable1 = new LayerDrawable(arr_drawable);
            for(int v1 = 0; v1 < v; ++v1) {
                ((LayerDrawable)drawable1).setId(v1, ((LayerDrawable)drawable0).getId(v1));
                ((LayerDrawable)drawable1).setLayerGravity(v1, ((LayerDrawable)drawable0).getLayerGravity(v1));
                ((LayerDrawable)drawable1).setLayerWidth(v1, ((LayerDrawable)drawable0).getLayerWidth(v1));
                ((LayerDrawable)drawable1).setLayerHeight(v1, ((LayerDrawable)drawable0).getLayerHeight(v1));
                ((LayerDrawable)drawable1).setLayerInsetLeft(v1, ((LayerDrawable)drawable0).getLayerInsetLeft(v1));
                ((LayerDrawable)drawable1).setLayerInsetRight(v1, ((LayerDrawable)drawable0).getLayerInsetRight(v1));
                ((LayerDrawable)drawable1).setLayerInsetTop(v1, ((LayerDrawable)drawable0).getLayerInsetTop(v1));
                ((LayerDrawable)drawable1).setLayerInsetBottom(v1, ((LayerDrawable)drawable0).getLayerInsetBottom(v1));
                ((LayerDrawable)drawable1).setLayerInsetStart(v1, ((LayerDrawable)drawable0).getLayerInsetStart(v1));
                ((LayerDrawable)drawable1).setLayerInsetEnd(v1, ((LayerDrawable)drawable0).getLayerInsetEnd(v1));
            }
            return drawable1;
        }
        if(drawable0 instanceof BitmapDrawable) {
            Bitmap bitmap0 = ((BitmapDrawable)drawable0).getBitmap();
            if(((Bitmap)this.c) == null) {
                this.c = bitmap0;
            }
            Drawable drawable2 = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            BitmapShader bitmapShader0 = new BitmapShader(bitmap0, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP);
            ((ShapeDrawable)drawable2).getPaint().setShader(bitmapShader0);
            ((ShapeDrawable)drawable2).getPaint().setColorFilter(((BitmapDrawable)drawable0).getPaint().getColorFilter());
            return z ? new ClipDrawable(drawable2, 3, 1) : drawable2;
        }
        return drawable0;
    }
}

