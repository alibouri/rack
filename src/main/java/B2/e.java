package B2;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import jeb.synthetic.TWR;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class e extends h implements Animatable {
    public final c Y;
    public final Context Z;
    public final b b0;

    public e(Context context0) {
        this.b0 = new b(0, this);
        this.Z = context0;
        this.Y = new c();  // initializer: Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V
    }

    @Override  // B2.h
    public final void applyTheme(Resources.Theme resources$Theme0) {
        Drawable drawable0 = this.X;
        if(drawable0 != null) {
            drawable0.applyTheme(resources$Theme0);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.X == null ? false : this.X.canApplyTheme();
    }

    @Override  // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas0) {
        Drawable drawable0 = this.X;
        if(drawable0 != null) {
            drawable0.draw(canvas0);
            return;
        }
        this.Y.a.draw(canvas0);
        if(this.Y.b.isStarted()) {
            this.invalidateSelf();
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable0 = this.X;
        return drawable0 == null ? this.Y.a.getAlpha() : drawable0.getAlpha();
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable0 = this.X;
        if(drawable0 != null) {
            return drawable0.getChangingConfigurations();
        }
        int v = super.getChangingConfigurations();
        this.Y.getClass();
        return v;
    }

    @Override  // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable0 = this.X;
        return drawable0 == null ? this.Y.a.getColorFilter() : drawable0.getColorFilter();
    }

    @Override  // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.X != null && Build.VERSION.SDK_INT >= 24 ? new d(this.X.getConstantState()) : null;
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable0 = this.X;
        return drawable0 == null ? this.Y.a.getIntrinsicHeight() : drawable0.getIntrinsicHeight();
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable0 = this.X;
        return drawable0 == null ? this.Y.a.getIntrinsicWidth() : drawable0.getIntrinsicWidth();
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable0 = this.X;
        return drawable0 == null ? this.Y.a.getOpacity() : drawable0.getOpacity();
    }

    @Override  // android.graphics.drawable.Drawable
    public final void inflate(Resources resources0, XmlPullParser xmlPullParser0, AttributeSet attributeSet0) {
        this.inflate(resources0, xmlPullParser0, attributeSet0, null);
    }

    @Override  // android.graphics.drawable.Drawable
    public final void inflate(Resources resources0, XmlPullParser xmlPullParser0, AttributeSet attributeSet0, Resources.Theme resources$Theme0) {
        Animator animator0;
        q q0;
        c c0;
        Drawable drawable0 = this.X;
        if(drawable0 != null) {
            drawable0.inflate(resources0, xmlPullParser0, attributeSet0, resources$Theme0);
            return;
        }
        int v = xmlPullParser0.getEventType();
        int v1 = xmlPullParser0.getDepth();
        while(true) {
            c0 = this.Y;
            if(v == 1 || xmlPullParser0.getDepth() < v1 + 1 && v == 3) {
                break;
            }
            if(v == 2) {
                XmlResourceParser xmlResourceParser0 = null;
                String s = xmlPullParser0.getName();
                if("animated-vector".equals(s)) {
                    TypedArray typedArray0 = y1.b.i(resources0, resources$Theme0, attributeSet0, a.e);
                    int v2 = typedArray0.getResourceId(0, 0);
                    if(v2 != 0) {
                        if(Build.VERSION.SDK_INT >= 24) {
                            q0 = new q();
                            q0.X = resources0.getDrawable(v2, resources$Theme0);
                            new p(q0.X.getConstantState());
                        }
                        else {
                            try {
                                XmlResourceParser xmlResourceParser1 = resources0.getXml(v2);
                                AttributeSet attributeSet1 = Xml.asAttributeSet(xmlResourceParser1);
                                do {
                                    int v3 = xmlResourceParser1.next();
                                }
                                while(v3 != 1 && v3 != 2);
                                if(v3 != 2) {
                                    throw new XmlPullParserException("No start tag found");
                                }
                                q0 = new q();
                                q0.inflate(resources0, xmlResourceParser1, attributeSet1, resources$Theme0);
                                goto label_35;
                            }
                            catch(XmlPullParserException xmlPullParserException0) {
                                Log.e("VectorDrawableCompat", "parser error", xmlPullParserException0);
                            }
                            catch(IOException iOException0) {
                                Log.e("VectorDrawableCompat", "parser error", iOException0);
                            }
                            q0 = null;
                        }
                    label_35:
                        q0.d0 = false;
                        q0.setCallback(this.b0);
                        q q1 = c0.a;
                        if(q1 != null) {
                            q1.setCallback(null);
                        }
                        c0.a = q0;
                    }
                    typedArray0.recycle();
                }
                else if("target".equals(s)) {
                    TypedArray typedArray1 = resources0.obtainAttributes(attributeSet0, a.f);
                    String s1 = typedArray1.getString(0);
                    int v4 = typedArray1.getResourceId(1, 0);
                    if(v4 != 0) {
                        Context context0 = this.Z;
                        if(context0 != null) {
                            if(Build.VERSION.SDK_INT >= 24) {
                                animator0 = AnimatorInflater.loadAnimator(context0, v4);
                            }
                            else {
                                Resources resources1 = context0.getResources();
                                Resources.Theme resources$Theme1 = context0.getTheme();
                                try {
                                    try {
                                        xmlResourceParser0 = resources1.getAnimation(v4);
                                        animator0 = a.a(context0, resources1, resources$Theme1, xmlResourceParser0, Xml.asAttributeSet(xmlResourceParser0), null, 0);
                                    }
                                    catch(XmlPullParserException xmlPullParserException1) {
                                        Resources.NotFoundException resources$NotFoundException0 = new Resources.NotFoundException("Can\'t load animation resource ID #0x" + Integer.toHexString(v4));
                                        resources$NotFoundException0.initCause(xmlPullParserException1);
                                        throw resources$NotFoundException0;
                                    }
                                    catch(IOException iOException1) {
                                        Resources.NotFoundException resources$NotFoundException1 = new Resources.NotFoundException("Can\'t load animation resource ID #0x" + Integer.toHexString(v4));
                                        resources$NotFoundException1.initCause(iOException1);
                                        throw resources$NotFoundException1;
                                    }
                                }
                                catch(Throwable throwable0) {
                                    TWR.safeClose$NT(xmlResourceParser0, throwable0);
                                    throw throwable0;
                                }
                                xmlResourceParser0.close();
                            }
                            animator0.setTarget(c0.a.Y.b.o.get(s1));
                            if(c0.c == null) {
                                c0.c = new ArrayList();
                                c0.d = new s.e(0);  // initializer: Ls/J;-><init>(I)V
                            }
                            c0.c.add(animator0);
                            c0.d.put(animator0, s1);
                            goto label_79;
                        }
                        typedArray1.recycle();
                        throw new IllegalStateException("Context can\'t be null when inflating animators");
                    }
                label_79:
                    typedArray1.recycle();
                }
            }
            v = xmlPullParser0.next();
        }
        if(c0.b == null) {
            c0.b = new AnimatorSet();
        }
        c0.b.playTogether(c0.c);
    }

    @Override  // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable0 = this.X;
        return drawable0 == null ? this.Y.a.isAutoMirrored() : drawable0.isAutoMirrored();
    }

    @Override  // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable0 = this.X;
        return drawable0 == null ? this.Y.b.isRunning() : ((AnimatedVectorDrawable)drawable0).isRunning();
    }

    @Override  // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable0 = this.X;
        return drawable0 == null ? this.Y.a.isStateful() : drawable0.isStateful();
    }

    @Override  // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable0 = this.X;
        if(drawable0 != null) {
            drawable0.mutate();
        }
        return this;
    }

    @Override  // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect0) {
        Drawable drawable0 = this.X;
        if(drawable0 != null) {
            drawable0.setBounds(rect0);
            return;
        }
        this.Y.a.setBounds(rect0);
    }

    @Override  // B2.h
    public final boolean onLevelChange(int v) {
        Drawable drawable0 = this.X;
        return drawable0 == null ? this.Y.a.setLevel(v) : drawable0.setLevel(v);
    }

    @Override  // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] arr_v) {
        Drawable drawable0 = this.X;
        return drawable0 == null ? this.Y.a.setState(arr_v) : drawable0.setState(arr_v);
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setAlpha(int v) {
        Drawable drawable0 = this.X;
        if(drawable0 != null) {
            drawable0.setAlpha(v);
            return;
        }
        this.Y.a.setAlpha(v);
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable0 = this.X;
        if(drawable0 != null) {
            drawable0.setAutoMirrored(z);
            return;
        }
        this.Y.a.setAutoMirrored(z);
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter0) {
        Drawable drawable0 = this.X;
        if(drawable0 != null) {
            drawable0.setColorFilter(colorFilter0);
            return;
        }
        this.Y.a.setColorFilter(colorFilter0);
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setTint(int v) {
        Drawable drawable0 = this.X;
        if(drawable0 != null) {
            N4.h.K(drawable0, v);
            return;
        }
        this.Y.a.setTint(v);
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList0) {
        Drawable drawable0 = this.X;
        if(drawable0 != null) {
            drawable0.setTintList(colorStateList0);
            return;
        }
        this.Y.a.setTintList(colorStateList0);
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode porterDuff$Mode0) {
        Drawable drawable0 = this.X;
        if(drawable0 != null) {
            drawable0.setTintMode(porterDuff$Mode0);
            return;
        }
        this.Y.a.setTintMode(porterDuff$Mode0);
    }

    @Override  // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z1) {
        Drawable drawable0 = this.X;
        if(drawable0 != null) {
            return drawable0.setVisible(z, z1);
        }
        this.Y.a.setVisible(z, z1);
        return super.setVisible(z, z1);
    }

    @Override  // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable0 = this.X;
        if(drawable0 != null) {
            ((AnimatedVectorDrawable)drawable0).start();
            return;
        }
        c c0 = this.Y;
        if(c0.b.isStarted()) {
            return;
        }
        c0.b.start();
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable0 = this.X;
        if(drawable0 != null) {
            ((AnimatedVectorDrawable)drawable0).stop();
            return;
        }
        this.Y.b.end();
    }
}

