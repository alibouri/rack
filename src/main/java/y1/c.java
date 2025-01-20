package y1;

import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import hb.h;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParserException;
import u1.a;

public abstract class c {
    public static final ThreadLocal a;

    static {
        c.a = new ThreadLocal();
    }

    public static ColorStateList a(Resources resources0, XmlResourceParser xmlResourceParser0, Resources.Theme resources$Theme0) {
        AttributeSet attributeSet0 = Xml.asAttributeSet(xmlResourceParser0);
        do {
            int v = xmlResourceParser0.next();
        }
        while(v != 1 && v != 2);
        if(v != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        return c.b(resources0, xmlResourceParser0, attributeSet0, resources$Theme0);
    }

    public static ColorStateList b(Resources resources0, XmlResourceParser xmlResourceParser0, AttributeSet attributeSet0, Resources.Theme resources$Theme0) {
        int v10;
        int[] arr_v3;
        int v13;
        float f19;
        float f17;
        float f15;
        float f;
        int v5;
        TypedValue typedValue1;
        Resources resources1 = resources0;
        AttributeSet attributeSet1 = attributeSet0;
        Resources.Theme resources$Theme1 = resources$Theme0;
        String s = xmlResourceParser0.getName();
        if(!s.equals("selector")) {
            throw new XmlPullParserException(xmlResourceParser0.getPositionDescription() + ": invalid color state list tag " + s);
        }
        int v = xmlResourceParser0.getDepth() + 1;
        int[][] arr2_v = new int[20][];
        int[] arr_v = new int[20];
        int v1 = 0;
        int v2;
        while((v2 = xmlResourceParser0.next()) != 1) {
            int v3 = xmlResourceParser0.getDepth();
            if(v3 < v && v2 == 3) {
                break;
            }
            if(v2 == 2 && v3 <= v && xmlResourceParser0.getName().equals("item")) {
                TypedArray typedArray0 = resources$Theme1 == null ? resources1.obtainAttributes(attributeSet1, a.a) : resources$Theme1.obtainStyledAttributes(attributeSet1, a.a, 0, 0);
                int v4 = typedArray0.getResourceId(0, -1);
                if(v4 == -1) {
                    v5 = typedArray0.getColor(0, 0xFFFF00FF);
                }
                else {
                    ThreadLocal threadLocal0 = c.a;
                    TypedValue typedValue0 = (TypedValue)threadLocal0.get();
                    if(typedValue0 == null) {
                        typedValue1 = new TypedValue();
                        threadLocal0.set(typedValue1);
                    }
                    else {
                        typedValue1 = typedValue0;
                    }
                    resources1.getValue(v4, typedValue1, ((boolean)1));
                    if(typedValue1.type < 28 || typedValue1.type > 0x1F) {
                        try {
                            v5 = c.a(resources1, resources1.getXml(v4), resources$Theme1).getDefaultColor();
                        }
                        catch(Exception unused_ex) {
                            v5 = typedArray0.getColor(0, 0xFFFF00FF);
                        }
                    }
                }
                if(typedArray0.hasValue(1)) {
                    f = typedArray0.getFloat(1, 1.0f);
                }
                else {
                    f = typedArray0.hasValue(3) ? typedArray0.getFloat(3, 1.0f) : 1.0f;
                }
                float f1 = Build.VERSION.SDK_INT < 0x1F || !typedArray0.hasValue(2) ? typedArray0.getFloat(4, -1.0f) : typedArray0.getFloat(2, -1.0f);
                typedArray0.recycle();
                int v6 = attributeSet0.getAttributeCount();
                int[] arr_v1 = new int[v6];
                int v7 = 0;
                for(int v8 = 0; v8 < v6; ++v8) {
                    int v9 = attributeSet1.getAttributeNameResource(v8);
                    if(v9 != 0x10101A5 && v9 != 0x101031F && v9 != 0x7F040032 && v9 != 0x7F040233) {  // attr:alpha
                        if(!attributeSet1.getAttributeBooleanValue(v8, false)) {
                            v9 = -v9;
                        }
                        arr_v1[v7] = v9;
                        ++v7;
                    }
                }
                int[] arr_v2 = StateSet.trimStateSet(arr_v1, v7);
                boolean z = Float.compare(f1, 0.0f) >= 0 && f1 > 100.0f;
                if(f != 1.0f || z) {
                    int v11 = h.F(((int)(((float)Color.alpha(v5)) * f + 0.5f)), 0, 0xFF);
                    if(z) {
                        y1.a a0 = y1.a.a(v5);
                        l l0 = l.k;
                        float f2 = a0.b;
                        if(((double)f2) >= 1.0 && ((double)Math.round(f1)) > 0.0 && ((double)Math.round(f1)) < 100.0) {
                            float f3 = a0.a < 0.0f ? 0.0f : Math.min(360.0f, a0.a);
                            float f4 = 0.0f;
                            float f5 = f2;
                            y1.a a1 = null;
                            boolean z1 = true;
                            while(true) {
                                if(Math.abs(f4 - f2) >= 0.4f) {
                                    float f6 = 1000.0f;
                                    float f7 = 0.0f;
                                    float f8 = 100.0f;
                                    float f9 = 1000.0f;
                                    y1.a a2 = null;
                                    while(true) {
                                        if(Float.compare(Math.abs(f7 - f8), 0.01f) > 0) {
                                            float f10 = (f8 - f7) / 2.0f + f7;
                                            int v12 = y1.a.b(f10, f5, f3).c(l.k);
                                            float f11 = b.h(Color.red(v12));
                                            float f12 = b.h(Color.green(v12));
                                            float f13 = b.h(Color.blue(v12));
                                            float[] arr_f = b.d[1];
                                            float f14 = (f13 * arr_f[2] + (f12 * arr_f[1] + f11 * arr_f[0])) / 100.0f;
                                            if(f14 <= 0.008856f) {
                                                f15 = f14 * 903.296326f;
                                                v10 = v;
                                            }
                                            else {
                                                v10 = v;
                                                f15 = ((float)Math.cbrt(f14)) * 116.0f - 16.0f;
                                            }
                                            float f16 = Math.abs(f1 - f15);
                                            if(f16 < 0.2f) {
                                                y1.a a3 = y1.a.a(v12);
                                                y1.a a4 = y1.a.b(a3.c, a3.b, f3);
                                                f17 = f10;
                                                float f18 = a3.d - a4.d;
                                                f19 = f3;
                                                float f20 = a3.e - a4.e;
                                                float f21 = a3.f - a4.f;
                                                arr_v3 = arr_v2;
                                                y1.a a5 = a3;
                                                float f22 = (float)(Math.pow(Math.sqrt(f21 * f21 + (f20 * f20 + f18 * f18)), 0.63) * 1.41);
                                                if(f22 <= 1.0f) {
                                                    f9 = f22;
                                                    a2 = a5;
                                                    f6 = f16;
                                                }
                                            }
                                            else {
                                                f17 = f10;
                                                f19 = f3;
                                                arr_v3 = arr_v2;
                                            }
                                            if(f6 == 0.0f && f9 == 0.0f) {
                                                break;
                                            }
                                            else {
                                                if(f15 < f1) {
                                                    f7 = f17;
                                                }
                                                else {
                                                    f8 = f17;
                                                }
                                                v = v10;
                                                f3 = f19;
                                                arr_v2 = arr_v3;
                                                continue;
                                            }
                                        }
                                        v10 = v;
                                        f19 = f3;
                                        arr_v3 = arr_v2;
                                        break;
                                    }
                                    if(z1) {
                                        if(a2 == null) {
                                            f5 = (f2 - f4) / 2.0f + f4;
                                            v = v10;
                                            f3 = f19;
                                            z1 = false;
                                            goto label_141;
                                        }
                                        else {
                                            v5 = a2.c(l0);
                                            goto label_154;
                                        }
                                        goto label_133;
                                    }
                                    else {
                                    label_133:
                                        if(a2 == null) {
                                            f2 = f5;
                                        }
                                        else {
                                            a1 = a2;
                                            f4 = f5;
                                        }
                                        f5 = (f2 - f4) / 2.0f + f4;
                                        v = v10;
                                        f3 = f19;
                                    }
                                label_141:
                                    arr_v2 = arr_v3;
                                    continue;
                                }
                                arr_v3 = arr_v2;
                                v10 = v;
                                if(a1 == null) {
                                    v5 = b.g(f1);
                                    goto label_154;
                                }
                                else {
                                    v13 = a1.c(l0);
                                    break;
                                }
                                goto label_152;
                            }
                            v5 = v13;
                        }
                        else {
                            arr_v3 = arr_v2;
                            v10 = v;
                            v5 = b.g(f1);
                        }
                    }
                    else {
                    label_152:
                        arr_v3 = arr_v2;
                        v10 = v;
                    }
                label_154:
                    v5 = 0xFFFFFF & v5 | v11 << 24;
                }
                else {
                    arr_v3 = arr_v2;
                    v10 = v;
                }
                int v14 = 8;
                if(v1 + 1 > arr_v.length) {
                    int[] arr_v4 = new int[(v1 > 4 ? v1 * 2 : 8)];
                    System.arraycopy(arr_v, 0, arr_v4, 0, v1);
                    arr_v = arr_v4;
                }
                arr_v[v1] = v5;
                if(v1 + 1 > arr2_v.length) {
                    Class class0 = arr2_v.getClass().getComponentType();
                    if(v1 > 4) {
                        v14 = v1 * 2;
                    }
                    Object[] arr_object = (Object[])Array.newInstance(class0, v14);
                    System.arraycopy(arr2_v, 0, arr_object, 0, v1);
                    arr2_v = arr_object;
                }
                arr2_v[v1] = arr_v3;
                arr2_v = arr2_v;
                attributeSet1 = attributeSet0;
                resources$Theme1 = resources$Theme0;
                ++v1;
                v = v10;
                resources1 = resources0;
            }
            else {
                resources1 = resources0;
                attributeSet1 = attributeSet0;
                resources$Theme1 = resources$Theme0;
                v = v;
            }
        }
        int[] arr_v5 = new int[v1];
        int[][] arr2_v1 = new int[v1][];
        System.arraycopy(arr_v, 0, arr_v5, 0, v1);
        System.arraycopy(arr2_v, 0, arr2_v1, 0, v1);
        return new ColorStateList(arr2_v1, arr_v5);
    }
}

