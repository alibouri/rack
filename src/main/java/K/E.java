package k;

import B2.q;
import E5.d;
import N4.h;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.StateSet;
import l.a;
import o.v0;
import org.xmlpull.v1.XmlPullParserException;

public final class e extends Drawable implements Drawable.Callback {
    public b X;
    public Rect Y;
    public Drawable Z;
    public Drawable b0;
    public int c0;
    public boolean d0;
    public int e0;
    public boolean f0;
    public d g0;
    public long h0;
    public long i0;
    public B2.b j0;
    public b k0;
    public boolean l0;
    public b m0;
    public h n0;
    public int o0;
    public int p0;
    public boolean q0;
    public static final int r0;

    public e(b b0, Resources resources0) {
        this.c0 = 0xFF;
        this.e0 = -1;
        this.o0 = -1;
        this.p0 = -1;
        this.i(new b(b0, this, resources0));
        this.onStateChange(this.getState());
        this.jumpToCurrentState();
    }

    public final void a(boolean z) {
        int v3;
        int v = 1;
        this.d0 = true;
        long v1 = SystemClock.uptimeMillis();
        Drawable drawable0 = this.Z;
        if(drawable0 == null) {
            this.h0 = 0L;
            v3 = 0;
        }
        else {
            long v2 = this.h0;
            if(v2 == 0L) {
                v3 = 0;
            }
            else if(v2 <= v1) {
                drawable0.setAlpha(this.c0);
                this.h0 = 0L;
                v3 = 0;
            }
            else {
                drawable0.setAlpha((0xFF - ((int)((v2 - v1) * 0xFFL)) / this.X.y) * this.c0 / 0xFF);
                v3 = 1;
            }
        }
        Drawable drawable1 = this.b0;
        if(drawable1 == null) {
            this.i0 = 0L;
            v = v3;
        }
        else {
            long v4 = this.i0;
            if(v4 == 0L) {
                v = v3;
            }
            else if(v4 <= v1) {
                drawable1.setVisible(false, false);
                this.b0 = null;
                this.i0 = 0L;
                v = v3;
            }
            else {
                drawable1.setAlpha(((int)((v4 - v1) * 0xFFL)) / this.X.z * this.c0 / 0xFF);
            }
        }
        if(z && v != 0) {
            this.scheduleSelf(this.g0, v1 + 16L);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme resources$Theme0) {
        this.b(resources$Theme0);
        this.onStateChange(this.getState());
    }

    public final void b(Resources.Theme resources$Theme0) {
        b b0 = this.X;
        if(resources$Theme0 == null) {
            b0.getClass();
        }
        else {
            b0.c();
            int v = b0.h;
            Drawable[] arr_drawable = b0.g;
            for(int v1 = 0; v1 < v; ++v1) {
                Drawable drawable0 = arr_drawable[v1];
                if(drawable0 != null && drawable0.canApplyTheme()) {
                    arr_drawable[v1].applyTheme(resources$Theme0);
                    b0.e |= arr_drawable[v1].getChangingConfigurations();
                }
            }
            Resources resources0 = resources$Theme0.getResources();
            if(resources0 != null) {
                b0.b = resources0;
                int v2 = resources0.getDisplayMetrics().densityDpi;
                if(v2 == 0) {
                    v2 = 0xA0;
                }
                int v3 = b0.c;
                b0.c = v2;
                if(v3 != v2) {
                    b0.m = false;
                    b0.j = false;
                }
            }
        }
    }

    public static e c(Context context0, Resources resources0, XmlResourceParser xmlResourceParser0, AttributeSet attributeSet0, Resources.Theme resources$Theme0) {
        Context context1 = context0;
        Resources resources1 = resources0;
        XmlResourceParser xmlResourceParser1 = xmlResourceParser0;
        String s = xmlResourceParser0.getName();
        if(!s.equals("animated-selector")) {
            throw new XmlPullParserException(xmlResourceParser0.getPositionDescription() + ": invalid animated-selector tag " + s);
        }
        e e0 = new e(null, null);
        TypedArray typedArray0 = y1.b.i(resources1, resources$Theme0, attributeSet0, l.b.a);
        e0.setVisible(typedArray0.getBoolean(1, true), true);
        b b0 = e0.m0;
        b0.d |= a.b(typedArray0);
        b0.i = typedArray0.getBoolean(2, b0.i);
        b0.l = typedArray0.getBoolean(3, b0.l);
        b0.y = typedArray0.getInt(4, b0.y);
        b0.z = typedArray0.getInt(5, b0.z);
        e0.setDither(typedArray0.getBoolean(0, b0.w));
        b b1 = e0.X;
        if(resources1 == null) {
            b1.getClass();
        }
        else {
            b1.b = resources1;
            int v = resources0.getDisplayMetrics().densityDpi;
            if(v == 0) {
                v = 0xA0;
            }
            int v1 = b1.c;
            b1.c = v;
            if(v1 != v) {
                b1.m = false;
                b1.j = false;
            }
        }
        typedArray0.recycle();
        int v2 = xmlResourceParser0.getDepth();
        int v3;
        while((v3 = xmlResourceParser0.next()) != 1) {
            int v4 = xmlResourceParser0.getDepth();
            if(v4 < v2 + 1 && v3 == 3) {
                break;
            }
            if(v3 == 2 && v4 <= v2 + 1) {
                if(xmlResourceParser0.getName().equals("item")) {
                    TypedArray typedArray1 = y1.b.i(resources1, resources$Theme0, attributeSet0, l.b.b);
                    int v5 = typedArray1.getResourceId(0, 0);
                    int v6 = typedArray1.getResourceId(1, -1);
                    Drawable drawable0 = v6 <= 0 ? null : v0.d().f(context1, v6);
                    typedArray1.recycle();
                    int v7 = attributeSet0.getAttributeCount();
                    int[] arr_v = new int[v7];
                    int v8 = 0;
                    for(int v9 = 0; v9 < v7; ++v9) {
                        int v10 = attributeSet0.getAttributeNameResource(v9);
                        if(v10 != 0 && v10 != 0x10100D0 && v10 != 0x1010199) {
                            if(!attributeSet0.getAttributeBooleanValue(v9, false)) {
                                v10 = -v10;
                            }
                            arr_v[v8] = v10;
                            ++v8;
                        }
                    }
                    int[] arr_v1 = StateSet.trimStateSet(arr_v, v8);
                    if(drawable0 == null) {
                    alab1:
                        while(true) {
                            switch(xmlResourceParser0.next()) {
                                case 2: {
                                    if(xmlResourceParser0.getName().equals("vector")) {
                                        drawable0 = new q();
                                        ((q)drawable0).inflate(resources1, xmlResourceParser1, attributeSet0, resources$Theme0);
                                    }
                                    else {
                                        drawable0 = a.a(resources0, xmlResourceParser0, attributeSet0, resources$Theme0);
                                    }
                                    break alab1;
                                }
                                case 4: {
                                    break;
                                }
                                default: {
                                    throw new XmlPullParserException(xmlResourceParser0.getPositionDescription() + ": <item> tag requires a \'drawable\' attribute or child tag defining a drawable");
                                }
                            }
                        }
                    }
                    if(drawable0 == null) {
                        throw new XmlPullParserException(xmlResourceParser0.getPositionDescription() + ": <item> tag requires a \'drawable\' attribute or child tag defining a drawable");
                    }
                    b b2 = e0.m0;
                    int v11 = b2.a(drawable0);
                    b2.H[v11] = arr_v1;
                    b2.J.e(v11, v5);
                    continue;
                }
                if(xmlResourceParser0.getName().equals("transition")) {
                    TypedArray typedArray2 = y1.b.i(resources1, resources$Theme0, attributeSet0, l.b.c);
                    int v12 = typedArray2.getResourceId(2, -1);
                    int v13 = typedArray2.getResourceId(1, -1);
                    int v14 = typedArray2.getResourceId(0, -1);
                    Drawable drawable1 = v14 <= 0 ? null : v0.d().f(context1, v14);
                    boolean z = typedArray2.getBoolean(3, false);
                    typedArray2.recycle();
                    if(drawable1 == null) {
                    alab2:
                        while(true) {
                            switch(xmlResourceParser0.next()) {
                                case 2: {
                                    if(xmlResourceParser0.getName().equals("animated-vector")) {
                                        drawable1 = new B2.e(context1);
                                        ((B2.e)drawable1).inflate(resources1, xmlResourceParser1, attributeSet0, resources$Theme0);
                                    }
                                    else {
                                        drawable1 = a.a(resources0, xmlResourceParser0, attributeSet0, resources$Theme0);
                                    }
                                    break alab2;
                                }
                                case 4: {
                                    break;
                                }
                                default: {
                                    throw new XmlPullParserException(xmlResourceParser0.getPositionDescription() + ": <transition> tag requires a \'drawable\' attribute or child tag defining a drawable");
                                }
                            }
                        }
                    }
                    if(drawable1 == null) {
                        throw new XmlPullParserException(xmlResourceParser0.getPositionDescription() + ": <transition> tag requires a \'drawable\' attribute or child tag defining a drawable");
                    }
                    if(v12 == -1 || v13 == -1) {
                        throw new XmlPullParserException(xmlResourceParser0.getPositionDescription() + ": <transition> tag requires \'fromId\' & \'toId\' attributes");
                    }
                    b b3 = e0.m0;
                    int v15 = b3.a(drawable1);
                    b3.I.b(((long)v12) << 0x20 | ((long)v13), ((long)(((long)v15) | (z ? 0x200000000L : 0L))));
                    if(z) {
                        b3.I.b(((long)v13) << 0x20 | ((long)v12), ((long)(((long)v15) | 0x100000000L | (z ? 0x200000000L : 0L))));
                    }
                    context1 = context0;
                    resources1 = resources0;
                    xmlResourceParser1 = xmlResourceParser0;
                    continue;
                }
                context1 = context0;
                resources1 = resources0;
                xmlResourceParser1 = xmlResourceParser0;
            }
        }
        e0.onStateChange(e0.getState());
        return e0;
    }

    @Override  // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.X.canApplyTheme();
    }

    public final void d(Drawable drawable0) {
        if(this.j0 == null) {
            this.j0 = new B2.b();
        }
        B2.b b0 = this.j0;
        b0.Y = drawable0.getCallback();
        drawable0.setCallback(b0);
        try {
            if(this.X.y <= 0 && this.d0) {
                drawable0.setAlpha(this.c0);
            }
            b b1 = this.X;
            if(b1.C) {
                drawable0.setColorFilter(b1.B);
            }
            else {
                if(b1.F) {
                    drawable0.setTintList(b1.D);
                }
                b b2 = this.X;
                if(b2.G) {
                    drawable0.setTintMode(b2.E);
                }
            }
            drawable0.setVisible(this.isVisible(), true);
            drawable0.setDither(this.X.w);
            drawable0.setState(this.getState());
            drawable0.setLevel(this.getLevel());
            drawable0.setBounds(this.getBounds());
            drawable0.setLayoutDirection(this.getLayoutDirection());
            drawable0.setAutoMirrored(this.X.A);
            Rect rect0 = this.Y;
            if(rect0 != null) {
                drawable0.setHotspotBounds(rect0.left, rect0.top, rect0.right, rect0.bottom);
            }
        }
        finally {
            B2.b b3 = this.j0;
            Drawable.Callback drawable$Callback0 = (Drawable.Callback)b3.Y;
            b3.Y = null;
            drawable0.setCallback(drawable$Callback0);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas0) {
        Drawable drawable0 = this.Z;
        if(drawable0 != null) {
            drawable0.draw(canvas0);
        }
        Drawable drawable1 = this.b0;
        if(drawable1 != null) {
            drawable1.draw(canvas0);
        }
    }

    public final void e() {
        int v1;
        Drawable drawable0 = this.b0;
        int v = 1;
        if(drawable0 == null) {
            v1 = 0;
        }
        else {
            drawable0.jumpToCurrentState();
            this.b0 = null;
            v1 = 1;
        }
        Drawable drawable1 = this.Z;
        if(drawable1 != null) {
            drawable1.jumpToCurrentState();
            if(this.d0) {
                this.Z.setAlpha(this.c0);
            }
        }
        if(this.i0 != 0L) {
            this.i0 = 0L;
            v1 = 1;
        }
        if(this.h0 == 0L) {
            v = v1;
        }
        else {
            this.h0 = 0L;
        }
        if(v != 0) {
            this.invalidateSelf();
        }
    }

    public final Drawable f() {
        if(!this.f0 && super.mutate() == this) {
            b b0 = new b(this.m0, this, null);
            b0.I = b0.I.d();
            b0.J = b0.J.c();
            this.i(b0);
            this.f0 = true;
        }
        return this;
    }

    public final Drawable g() {
        if(!this.l0) {
            this.f();
            b b0 = this.k0;
            b0.I = b0.I.d();
            b0.J = b0.J.c();
            this.l0 = true;
        }
        return this;
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.c0;
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.X.getChangingConfigurations();
    }

    @Override  // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        boolean z;
        b b0 = this.X;
        if(b0.u) {
            z = b0.v;
        }
        else {
            b0.c();
            b0.u = true;
            int v = b0.h;
            Drawable[] arr_drawable = b0.g;
            for(int v1 = 0; true; ++v1) {
                if(v1 >= v) {
                    b0.v = true;
                    z = true;
                    break;
                }
                if(arr_drawable[v1].getConstantState() == null) {
                    b0.v = false;
                    z = false;
                    break;
                }
            }
        }
        if(z) {
            b b1 = this.X;
            b1.d = this.getChangingConfigurations();
            return this.X;
        }
        return null;
    }

    @Override  // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.Z;
    }

    @Override  // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect0) {
        Rect rect1 = this.Y;
        if(rect1 != null) {
            rect0.set(rect1);
            return;
        }
        super.getHotspotBounds(rect0);
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        b b0 = this.X;
        if(b0.l) {
            if(!b0.m) {
                b0.b();
            }
            return b0.o;
        }
        return this.Z == null ? -1 : this.Z.getIntrinsicHeight();
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        b b0 = this.X;
        if(b0.l) {
            if(!b0.m) {
                b0.b();
            }
            return b0.n;
        }
        return this.Z == null ? -1 : this.Z.getIntrinsicWidth();
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        b b0 = this.X;
        if(b0.l) {
            if(!b0.m) {
                b0.b();
            }
            return b0.q;
        }
        return this.Z == null ? 0 : this.Z.getMinimumHeight();
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        b b0 = this.X;
        if(b0.l) {
            if(!b0.m) {
                b0.b();
            }
            return b0.p;
        }
        return this.Z == null ? 0 : this.Z.getMinimumWidth();
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getOpacity() {
        int v = -2;
        if(this.Z != null && this.Z.isVisible()) {
            b b0 = this.X;
            if(b0.r) {
                return b0.s;
            }
            b0.c();
            int v1 = b0.h;
            Drawable[] arr_drawable = b0.g;
            if(v1 > 0) {
                v = arr_drawable[0].getOpacity();
            }
            for(int v2 = 1; v2 < v1; ++v2) {
                v = Drawable.resolveOpacity(v, arr_drawable[v2].getOpacity());
            }
            b0.s = v;
            b0.r = true;
        }
        return v;
    }

    @Override  // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline0) {
        Drawable drawable0 = this.Z;
        if(drawable0 != null) {
            drawable0.getOutline(outline0);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect0) {
        b b0 = this.X;
        boolean z = false;
        Rect rect1 = null;
        if(!b0.i) {
            Rect rect2 = b0.k;
            if(rect2 != null || b0.j) {
                rect1 = rect2;
            }
            else {
                b0.c();
                Rect rect3 = new Rect();
                int v = b0.h;
                Drawable[] arr_drawable = b0.g;
                for(int v1 = 0; v1 < v; ++v1) {
                    if(arr_drawable[v1].getPadding(rect3)) {
                        if(rect1 == null) {
                            rect1 = new Rect(0, 0, 0, 0);
                        }
                        int v2 = rect3.left;
                        if(v2 > rect1.left) {
                            rect1.left = v2;
                        }
                        int v3 = rect3.top;
                        if(v3 > rect1.top) {
                            rect1.top = v3;
                        }
                        int v4 = rect3.right;
                        if(v4 > rect1.right) {
                            rect1.right = v4;
                        }
                        int v5 = rect3.bottom;
                        if(v5 > rect1.bottom) {
                            rect1.bottom = v5;
                        }
                    }
                }
                b0.j = true;
                b0.k = rect1;
            }
        }
        if(rect1 == null) {
            Drawable drawable0 = this.Z;
            z = drawable0 == null ? super.getPadding(rect0) : drawable0.getPadding(rect0);
        }
        else {
            rect0.set(rect1);
            if((rect1.left | rect1.top | rect1.bottom | rect1.right) != 0) {
                z = true;
            }
        }
        if(this.X.A && this.getLayoutDirection() == 1) {
            int v6 = rect0.left;
            rect0.left = rect0.right;
            rect0.right = v6;
        }
        return z;
    }

    public final boolean h(int v) {
        if(v == this.e0) {
            return false;
        }
        long v1 = SystemClock.uptimeMillis();
        if(this.X.z > 0) {
            Drawable drawable0 = this.b0;
            if(drawable0 != null) {
                drawable0.setVisible(false, false);
            }
            Drawable drawable1 = this.Z;
            if(drawable1 == null) {
                this.b0 = null;
                this.i0 = 0L;
            }
            else {
                this.b0 = drawable1;
                this.i0 = ((long)this.X.z) + v1;
            }
        }
        else {
            Drawable drawable2 = this.Z;
            if(drawable2 != null) {
                drawable2.setVisible(false, false);
            }
        }
        if(v >= 0) {
            b b0 = this.X;
            if(v < b0.h) {
                Drawable drawable3 = b0.d(v);
                this.Z = drawable3;
                this.e0 = v;
                if(drawable3 != null) {
                    int v2 = this.X.y;
                    if(v2 > 0) {
                        this.h0 = v1 + ((long)v2);
                    }
                    this.d(drawable3);
                }
            }
            else {
                this.Z = null;
                this.e0 = -1;
            }
        }
        else {
            this.Z = null;
            this.e0 = -1;
        }
        if(Long.compare(this.h0, 0L) != 0 || this.i0 != 0L) {
            d d0 = this.g0;
            if(d0 == null) {
                this.g0 = new d(27, this);
            }
            else {
                this.unscheduleSelf(d0);
            }
            this.a(true);
        }
        this.invalidateSelf();
        return true;
    }

    public final void i(b b0) {
        this.X = b0;
        int v = this.e0;
        if(v >= 0) {
            Drawable drawable0 = b0.d(v);
            this.Z = drawable0;
            if(drawable0 != null) {
                this.d(drawable0);
            }
        }
        this.b0 = null;
        this.k0 = b0;
        this.m0 = b0;
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public final void invalidateDrawable(Drawable drawable0) {
        b b0 = this.X;
        if(b0 != null) {
            b0.r = false;
            b0.t = false;
        }
        if(drawable0 == this.Z && this.getCallback() != null) {
            this.getCallback().invalidateDrawable(this);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.X.A;
    }

    @Override  // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    public final boolean j(boolean z, boolean z1) {
        boolean z2 = super.setVisible(z, z1);
        Drawable drawable0 = this.b0;
        if(drawable0 != null) {
            drawable0.setVisible(z, z1);
        }
        Drawable drawable1 = this.Z;
        if(drawable1 != null) {
            drawable1.setVisible(z, z1);
        }
        return z2;
    }

    @Override  // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.e();
        h h0 = this.n0;
        if(h0 != null) {
            h0.M();
            this.n0 = null;
            this.h(this.o0);
            this.o0 = -1;
            this.p0 = -1;
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if(!this.q0) {
            this.g();
            b b0 = this.m0;
            b0.I = b0.I.d();
            b0.J = b0.J.c();
            this.q0 = true;
        }
        return this;
    }

    @Override  // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect0) {
        Drawable drawable0 = this.b0;
        if(drawable0 != null) {
            drawable0.setBounds(rect0);
        }
        Drawable drawable1 = this.Z;
        if(drawable1 != null) {
            drawable1.setBounds(rect0);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int v) {
        b b0 = this.X;
        int v1 = this.e0;
        int v2 = b0.h;
        Drawable[] arr_drawable = b0.g;
        boolean z = false;
        for(int v3 = 0; v3 < v2; ++v3) {
            Drawable drawable0 = arr_drawable[v3];
            if(drawable0 != null) {
                boolean z1 = drawable0.setLayoutDirection(v);
                if(v3 == v1) {
                    z = z1;
                }
            }
        }
        b0.x = v;
        return z;
    }

    @Override  // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int v) {
        Drawable drawable0 = this.b0;
        if(drawable0 != null) {
            return drawable0.setLevel(v);
        }
        return this.Z == null ? false : this.Z.setLevel(v);
    }

    @Override  // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] arr_v) {
        c c0;
        b b0 = this.m0;
        int v = b0.f(arr_v);
        if(v < 0) {
            v = b0.f(StateSet.WILD_CARD);
        }
        int v1 = this.e0;
        boolean z = false;
        if(v != v1) {
            h h0 = this.n0;
            if(h0 == null) {
            label_21:
                this.n0 = null;
                this.p0 = -1;
                this.o0 = -1;
                b b1 = this.m0;
                int v2 = b1.e(v1);
                int v3 = b1.e(v);
                if(v3 == 0 || v2 == 0) {
                label_50:
                    if(this.h(v)) {
                        z = true;
                    }
                }
                else {
                    long v4 = ((long)v3) | ((long)v2) << 0x20;
                    int v5 = (int)(((long)(((Long)b1.I.f(v4)))));
                    if(v5 >= 0) {
                        boolean z1 = (((long)(((Long)b1.I.f(v4)))) & 0x200000000L) != 0L;
                        this.h(v5);
                        Drawable drawable0 = this.Z;
                        if(drawable0 instanceof AnimationDrawable) {
                            if((((long)(((Long)b1.I.f(v4)))) & 0x100000000L) != 0L) {
                                z = true;
                            }
                            c0 = new c(((AnimationDrawable)drawable0), z, z1);
                            goto label_44;
                        }
                        else if(drawable0 instanceof B2.e) {
                            c0 = new k.a(((B2.e)drawable0), 1);
                            goto label_44;
                        }
                        else {
                            if(drawable0 instanceof Animatable) {
                                c0 = new k.a(((Animatable)drawable0), 0);
                            label_44:
                                c0.L();
                                this.n0 = c0;
                                this.p0 = v1;
                                this.o0 = v;
                                z = true;
                                goto label_52;
                            }
                            goto label_50;
                        }
                    }
                    else {
                        goto label_50;
                    }
                }
            }
            else if(v == this.o0) {
                z = true;
            }
            else if(v == this.p0 && h0.l()) {
                h0.I();
                this.o0 = this.p0;
                this.p0 = v;
                z = true;
            }
            else {
                v1 = this.o0;
                h0.M();
                goto label_21;
            }
        }
    label_52:
        Drawable drawable1 = this.Z;
        return drawable1 != null ? z | drawable1.setState(arr_v) : z;
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public final void scheduleDrawable(Drawable drawable0, Runnable runnable0, long v) {
        if(drawable0 == this.Z && this.getCallback() != null) {
            this.getCallback().scheduleDrawable(this, runnable0, v);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setAlpha(int v) {
        if(!this.d0 || this.c0 != v) {
            this.d0 = true;
            this.c0 = v;
            Drawable drawable0 = this.Z;
            if(drawable0 != null) {
                if(this.h0 == 0L) {
                    drawable0.setAlpha(v);
                    return;
                }
                this.a(false);
            }
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        b b0 = this.X;
        if(b0.A != z) {
            b0.A = z;
            Drawable drawable0 = this.Z;
            if(drawable0 != null) {
                drawable0.setAutoMirrored(z);
            }
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter0) {
        b b0 = this.X;
        b0.C = true;
        if(b0.B != colorFilter0) {
            b0.B = colorFilter0;
            Drawable drawable0 = this.Z;
            if(drawable0 != null) {
                drawable0.setColorFilter(colorFilter0);
            }
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        b b0 = this.X;
        if(b0.w != z) {
            b0.w = z;
            Drawable drawable0 = this.Z;
            if(drawable0 != null) {
                drawable0.setDither(z);
            }
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f1) {
        Drawable drawable0 = this.Z;
        if(drawable0 != null) {
            drawable0.setHotspot(f, f1);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int v, int v1, int v2, int v3) {
        Rect rect0 = this.Y;
        if(rect0 == null) {
            this.Y = new Rect(v, v1, v2, v3);
        }
        else {
            rect0.set(v, v1, v2, v3);
        }
        Drawable drawable0 = this.Z;
        if(drawable0 != null) {
            drawable0.setHotspotBounds(v, v1, v2, v3);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setTint(int v) {
        this.setTintList(ColorStateList.valueOf(v));
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList0) {
        b b0 = this.X;
        b0.F = true;
        if(b0.D != colorStateList0) {
            b0.D = colorStateList0;
            this.Z.setTintList(colorStateList0);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode porterDuff$Mode0) {
        b b0 = this.X;
        b0.G = true;
        if(b0.E != porterDuff$Mode0) {
            b0.E = porterDuff$Mode0;
            this.Z.setTintMode(porterDuff$Mode0);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z1) {
        boolean z2 = this.j(z, z1);
        h h0 = this.n0;
        if(h0 != null && (z2 || z1)) {
            if(z) {
                h0.L();
                return z2;
            }
            this.jumpToCurrentState();
        }
        return z2;
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public final void unscheduleDrawable(Drawable drawable0, Runnable runnable0) {
        if(drawable0 == this.Z && this.getCallback() != null) {
            this.getCallback().unscheduleDrawable(this, runnable0);
        }
    }
}

