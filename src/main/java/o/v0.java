package o;

import B2.q;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import b4.A0;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;
import s.J;
import s.K;
import s.o;

public final class v0 {
    public WeakHashMap a;
    public J b;
    public K c;
    public final WeakHashMap d;
    public TypedValue e;
    public boolean f;
    public A0 g;
    public static final PorterDuff.Mode h;
    public static v0 i;
    public static final t0 j;

    static {
        v0.h = PorterDuff.Mode.SRC_IN;
        v0.j = new t0(6);  // initializer: Lp2/L;-><init>(I)V
    }

    public v0() {
        this.d = new WeakHashMap(0);
    }

    public final void a(String s, u0 u00) {
        if(this.b == null) {
            this.b = new J(0);
        }
        this.b.put(s, u00);
    }

    public final void b(Context context0, long v, Drawable drawable0) {
        synchronized(this) {
            Drawable.ConstantState drawable$ConstantState0 = drawable0.getConstantState();
            if(drawable$ConstantState0 != null) {
                o o0 = (o)this.d.get(context0);
                if(o0 == null) {
                    o0 = new o(null);
                    this.d.put(context0, o0);
                }
                o0.j(v, new WeakReference(drawable$ConstantState0));
            }
        }
    }

    public final Drawable c(Context context0, int v) {
        if(this.e == null) {
            this.e = new TypedValue();
        }
        Drawable drawable0 = null;
        TypedValue typedValue0 = this.e;
        context0.getResources().getValue(v, typedValue0, true);
        long v1 = ((long)typedValue0.assetCookie) << 0x20 | ((long)typedValue0.data);
        Drawable drawable1 = this.e(context0, v1);
        if(drawable1 != null) {
            return drawable1;
        }
        if(this.g != null) {
            switch(v) {
                case 0x7F080035: {  // drawable:abc_cab_background_top_material
                    drawable0 = new LayerDrawable(new Drawable[]{this.f(context0, 0x7F080034), this.f(context0, 0x7F080036)});  // drawable:abc_cab_background_internal_bg
                    break;
                }
                case 0x7F080057: {  // drawable:abc_ratingbar_indicator_material
                    drawable0 = A0.F(this, context0, 0x7F07003C);  // dimen:abc_star_medium
                    break;
                }
                case 0x7F080058: {  // drawable:abc_ratingbar_material
                    drawable0 = A0.F(this, context0, 0x7F07003B);  // dimen:abc_star_big
                    break;
                }
                case 0x7F080059: {  // drawable:abc_ratingbar_small_material
                    drawable0 = A0.F(this, context0, 0x7F07003D);  // dimen:abc_star_small
                }
            }
        }
        if(drawable0 != null) {
            drawable0.setChangingConfigurations(typedValue0.changingConfigurations);
            this.b(context0, v1, drawable0);
        }
        return drawable0;
    }

    public static v0 d() {
        synchronized(v0.class) {
            if(v0.i == null) {
                v0 v00 = new v0();
                v0.i = v00;
                v0.j(v00);
            }
            return v0.i;
        }
    }

    public final Drawable e(Context context0, long v) {
        synchronized(this) {
            o o0 = (o)this.d.get(context0);
            if(o0 == null) {
                return null;
            }
            WeakReference weakReference0 = (WeakReference)o0.e(v);
            if(weakReference0 != null) {
                Drawable.ConstantState drawable$ConstantState0 = (Drawable.ConstantState)weakReference0.get();
                if(drawable$ConstantState0 != null) {
                    return drawable$ConstantState0.newDrawable(context0.getResources());
                }
                o0.k(v);
            }
            return null;
        }
    }

    public final Drawable f(Context context0, int v) {
        synchronized(this) {
            return this.g(context0, v, false);
        }
    }

    public final Drawable g(Context context0, int v, boolean z) {
        synchronized(this) {
            if(!this.f) {
                this.f = true;
                Drawable drawable0 = this.f(context0, 0x7F080073);  // drawable:abc_vector_test
                if(drawable0 == null || !(drawable0 instanceof q) && !"android.graphics.drawable.VectorDrawable".equals(drawable0.getClass().getName())) {
                    this.f = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            Drawable drawable1 = this.k(context0, v);
            if(drawable1 == null) {
                drawable1 = this.c(context0, v);
            }
            if(drawable1 == null) {
                drawable1 = context0.getDrawable(v);
            }
            if(drawable1 != null) {
                drawable1 = this.n(context0, v, z, drawable1);
            }
            if(drawable1 != null) {
                Y.a(drawable1);
            }
            return drawable1;
        }
    }

    public static PorterDuffColorFilter h(int v, PorterDuff.Mode porterDuff$Mode0) {
        synchronized(v0.class) {
            t0 t00 = v0.j;
            t00.getClass();
            int v2 = (0x1F + v) * 0x1F;
            PorterDuffColorFilter porterDuffColorFilter0 = (PorterDuffColorFilter)t00.h(((int)(porterDuff$Mode0.hashCode() + v2)));
            if(porterDuffColorFilter0 == null) {
                porterDuffColorFilter0 = new PorterDuffColorFilter(v, porterDuff$Mode0);
                PorterDuffColorFilter porterDuffColorFilter1 = (PorterDuffColorFilter)t00.l(((int)(porterDuff$Mode0.hashCode() + v2)), porterDuffColorFilter0);
            }
            return porterDuffColorFilter0;
        }
    }

    public final ColorStateList i(Context context0, int v) {
        ColorStateList colorStateList1;
        synchronized(this) {
            WeakHashMap weakHashMap0 = this.a;
            ColorStateList colorStateList0 = null;
            if(weakHashMap0 == null) {
                colorStateList1 = null;
            }
            else {
                K k0 = (K)weakHashMap0.get(context0);
                colorStateList1 = k0 == null ? null : ((ColorStateList)k0.d(v));
            }
            if(colorStateList1 == null) {
                A0 a00 = this.g;
                if(a00 != null) {
                    colorStateList0 = a00.G(context0, v);
                }
                if(colorStateList0 != null) {
                    if(this.a == null) {
                        this.a = new WeakHashMap();
                    }
                    K k1 = (K)this.a.get(context0);
                    if(k1 == null) {
                        k1 = new K(0);
                        this.a.put(context0, k1);
                    }
                    k1.b(v, colorStateList0);
                }
                colorStateList1 = colorStateList0;
            }
            return colorStateList1;
        }
    }

    public static void j(v0 v00) {
        if(Build.VERSION.SDK_INT < 24) {
            v00.a("vector", new u0(3));
            v00.a("animated-vector", new u0(2));
            v00.a("animated-selector", new u0(1));
            v00.a("drawable", new u0(0));
        }
    }

    public final Drawable k(Context context0, int v) {
        if(this.b != null && !this.b.isEmpty()) {
            K k0 = this.c;
            if(k0 == null) {
                this.c = new K(0);
            }
            else {
                String s = (String)k0.d(v);
                if("appcompat_skip_skip".equals(s) || s != null && this.b.get(s) == null) {
                    return null;
                }
            }
            if(this.e == null) {
                this.e = new TypedValue();
            }
            TypedValue typedValue0 = this.e;
            Resources resources0 = context0.getResources();
            resources0.getValue(v, typedValue0, true);
            long v1 = ((long)typedValue0.assetCookie) << 0x20 | ((long)typedValue0.data);
            Drawable drawable0 = this.e(context0, v1);
            if(drawable0 != null) {
                return drawable0;
            }
            if(typedValue0.string != null && typedValue0.string.toString().endsWith(".xml")) {
                try {
                    XmlResourceParser xmlResourceParser0 = resources0.getXml(v);
                    AttributeSet attributeSet0 = Xml.asAttributeSet(xmlResourceParser0);
                    do {
                        int v2 = xmlResourceParser0.next();
                    }
                    while(v2 != 1 && v2 != 2);
                    if(v2 != 2) {
                        throw new XmlPullParserException("No start tag found");
                    }
                    String s1 = xmlResourceParser0.getName();
                    this.c.b(v, s1);
                    u0 u00 = (u0)this.b.get(s1);
                    if(u00 != null) {
                        drawable0 = u00.a(context0, xmlResourceParser0, attributeSet0, context0.getTheme());
                    }
                    if(drawable0 != null) {
                        drawable0.setChangingConfigurations(typedValue0.changingConfigurations);
                        this.b(context0, v1, drawable0);
                    }
                    goto label_34;
                }
                catch(Exception exception0) {
                }
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", exception0);
            }
        label_34:
            if(drawable0 == null) {
                this.c.b(v, "appcompat_skip_skip");
            }
            return drawable0;
        }
        return null;
    }

    public final void l(Context context0) {
        synchronized(this) {
            o o0 = (o)this.d.get(context0);
            if(o0 != null) {
                o0.c();
            }
        }
    }

    public final void m(A0 a00) {
        synchronized(this) {
            this.g = a00;
        }
    }

    public final Drawable n(Context context0, int v, boolean z, Drawable drawable0) {
        int v2;
        boolean z2;
        int v1;
        ColorStateList colorStateList0 = this.i(context0, v);
        PorterDuff.Mode porterDuff$Mode0 = null;
        if(colorStateList0 != null) {
            drawable0 = drawable0.mutate();
            drawable0.setTintList(colorStateList0);
            if(this.g != null && v == 0x7F080066) {  // drawable:abc_switch_thumb_material
                porterDuff$Mode0 = PorterDuff.Mode.MULTIPLY;
            }
            if(porterDuff$Mode0 != null) {
                drawable0.setTintMode(porterDuff$Mode0);
                return drawable0;
            }
            return drawable0;
        }
        if(this.g != null) {
            switch(v) {
                case 0x7F080057:   // drawable:abc_ratingbar_indicator_material
                case 0x7F080058:   // drawable:abc_ratingbar_material
                case 0x7F080059: {  // drawable:abc_ratingbar_small_material
                    A0.a0(((LayerDrawable)drawable0).findDrawableByLayerId(0x1020000), B0.b(context0, 0x7F0400F2), p.b);  // attr:colorControlNormal
                    A0.a0(((LayerDrawable)drawable0).findDrawableByLayerId(0x102000F), B0.c(context0, 0x7F0400F0), p.b);  // attr:colorControlActivated
                    A0.a0(((LayerDrawable)drawable0).findDrawableByLayerId(0x102000D), B0.c(context0, 0x7F0400F0), p.b);  // attr:colorControlActivated
                    return drawable0;
                }
                case 0x7F080061: {  // drawable:abc_seekbar_track_material
                    A0.a0(((LayerDrawable)drawable0).findDrawableByLayerId(0x1020000), B0.c(context0, 0x7F0400F2), p.b);  // attr:colorControlNormal
                    A0.a0(((LayerDrawable)drawable0).findDrawableByLayerId(0x102000F), B0.c(context0, 0x7F0400F2), p.b);  // attr:colorControlNormal
                    A0.a0(((LayerDrawable)drawable0).findDrawableByLayerId(0x102000D), B0.c(context0, 0x7F0400F0), p.b);  // attr:colorControlActivated
                    return drawable0;
                }
            }
        }
        A0 a00 = this.g;
        boolean z1 = false;
        if(a00 != null) {
            PorterDuff.Mode porterDuff$Mode1 = p.b;
            if(A0.e(((int[])a00.b), v)) {
                v1 = 0x7F0400F2;  // attr:colorControlNormal
                z2 = true;
                v2 = -1;
            }
            else if(A0.e(((int[])a00.d), v)) {
                v1 = 0x7F0400F0;  // attr:colorControlActivated
                z2 = true;
                v2 = -1;
            }
            else if(A0.e(((int[])a00.e), v)) {
                porterDuff$Mode1 = PorterDuff.Mode.MULTIPLY;
                v1 = 0x1010031;
                z2 = true;
                v2 = -1;
            }
            else {
                switch(v) {
                    case 0x7F080038: {  // drawable:abc_dialog_material_background
                        v1 = 0x1010031;
                        z2 = true;
                        v2 = -1;
                        break;
                    }
                    case 0x7F08004A: {  // drawable:abc_list_divider_mtrl_alpha
                        v2 = Math.round(40.799999f);
                        v1 = 0x1010030;
                        z2 = true;
                        break;
                    }
                    default: {
                        v1 = 0;
                        z2 = false;
                        v2 = -1;
                    }
                }
            }
            if(z2) {
                Drawable drawable1 = drawable0.mutate();
                drawable1.setColorFilter(p.c(B0.c(context0, v1), porterDuff$Mode1));
                if(v2 != -1) {
                    drawable1.setAlpha(v2);
                }
                z1 = true;
            }
        }
        return z1 || !z ? drawable0 : null;
    }
}

