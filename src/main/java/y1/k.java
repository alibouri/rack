package y1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import io.sentry.M1;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;
import p2.L;
import z1.e;

public abstract class k {
    public static final ThreadLocal a;
    public static final WeakHashMap b;
    public static final Object c;

    static {
        k.a = new ThreadLocal();
        k.b = new WeakHashMap(0);
        k.c = new Object();
    }

    public static void a(i i0, int v, ColorStateList colorStateList0, Resources.Theme resources$Theme0) {
        synchronized(k.c) {
            WeakHashMap weakHashMap0 = k.b;
            SparseArray sparseArray0 = (SparseArray)weakHashMap0.get(i0);
            if(sparseArray0 == null) {
                sparseArray0 = new SparseArray();
                weakHashMap0.put(i0, sparseArray0);
            }
            sparseArray0.append(v, new h(colorStateList0, i0.a.getConfiguration(), resources$Theme0));
        }
    }

    public static Typeface b(Context context0, int v, TypedValue typedValue0, int v1, b b0, boolean z, boolean z1) {
        Resources resources0 = context0.getResources();
        resources0.getValue(v, typedValue0, true);
        CharSequence charSequence0 = typedValue0.string;
        if(charSequence0 == null) {
            throw new Resources.NotFoundException("Resource \"" + resources0.getResourceName(v) + "\" (" + Integer.toHexString(v) + ") is not a Font: " + typedValue0);
        }
        String s = charSequence0.toString();
        Typeface typeface0 = null;
        if(s.startsWith("res/")) {
            L l0 = e.b;
            Typeface typeface1 = (Typeface)l0.h(e.b(resources0, v, s, typedValue0.assetCookie, v1));
            if(typeface1 == null) {
                goto label_17;
            label_43:
                Log.e("ResourcesCompat", "Failed to read xml resource " + s, iOException0);
            label_44:
                if(b0 != null) {
                    b0.a(-3);
                }
            }
            else {
                if(b0 != null) {
                    new Handler(Looper.getMainLooper()).post(new M1(b0, 21, typeface1));
                }
                try {
                    typeface0 = typeface1;
                    goto label_46;
                label_17:
                    if(!z1) {
                        if(s.toLowerCase().endsWith(".xml")) {
                            d d0 = b.l(resources0.getXml(v), resources0);
                            if(d0 == null) {
                                Log.e("ResourcesCompat", "Failed to find font-family tag");
                                if(b0 != null) {
                                    b0.a(-3);
                                }
                            }
                            else {
                                typeface0 = e.a(context0, d0, resources0, v, s, typedValue0.assetCookie, v1, b0, z);
                            }
                        }
                        else {
                            int v2 = typedValue0.assetCookie;
                            typeface1 = e.a.q(context0, resources0, v, s, v1);
                            if(typeface1 != null) {
                                l0.l(e.b(resources0, v, s, v2, v1), typeface1);
                            }
                            if(b0 != null) {
                                if(typeface1 == null) {
                                    b0.a(-3);
                                }
                                else {
                                    new Handler(Looper.getMainLooper()).post(new M1(b0, 21, typeface1));
                                }
                            }
                            typeface0 = typeface1;
                        }
                    }
                }
                catch(XmlPullParserException xmlPullParserException0) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource " + s, xmlPullParserException0);
                    goto label_44;
                }
                catch(IOException iOException0) {
                    goto label_43;
                }
            }
        }
        else if(b0 != null) {
            b0.a(-3);
        }
    label_46:
        if(typeface0 == null && b0 == null && !z1) {
            throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(v) + " could not be retrieved.");
        }
        return typeface0;
    }
}

