package o;

import B2.q;
import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import k.e;
import l.a;

public final class u0 {
    public final int a;

    public u0(int v) {
        this.a = v;
        super();
    }

    public final Drawable a(Context context0, XmlResourceParser xmlResourceParser0, AttributeSet attributeSet0, Resources.Theme resources$Theme0) {
        switch(this.a) {
            case 0: {
                String s = attributeSet0.getClassAttribute();
                if(s != null) {
                    try {
                        Drawable drawable1 = (Drawable)u0.class.getClassLoader().loadClass(s).asSubclass(Drawable.class).getDeclaredConstructor(null).newInstance(null);
                        a.c(drawable1, context0.getResources(), xmlResourceParser0, attributeSet0, resources$Theme0);
                        return drawable1;
                    }
                    catch(Exception exception1) {
                        Log.e("DrawableDelegate", "Exception while inflating <drawable>", exception1);
                    }
                }
                return null;
            }
            case 1: {
                try {
                    return e.c(context0, context0.getResources(), xmlResourceParser0, attributeSet0, resources$Theme0);
                }
                catch(Exception exception2) {
                    Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", exception2);
                    return null;
                }
            }
            case 2: {
                try {
                    Resources resources1 = context0.getResources();
                    Drawable drawable2 = new B2.e(context0);
                    ((B2.e)drawable2).inflate(resources1, xmlResourceParser0, attributeSet0, resources$Theme0);
                    return drawable2;
                }
                catch(Exception exception3) {
                    Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", exception3);
                    return null;
                }
            }
            default: {
                try {
                    Resources resources0 = context0.getResources();
                    Drawable drawable0 = new q();
                    ((q)drawable0).inflate(resources0, xmlResourceParser0, attributeSet0, resources$Theme0);
                    return drawable0;
                }
                catch(Exception exception0) {
                    Log.e("VdcInflateDelegate", "Exception while inflating <vector>", exception0);
                    return null;
                }
            }
        }
    }
}

