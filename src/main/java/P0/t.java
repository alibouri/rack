package P0;

import B.L0;
import C3.i;
import Q0.e;
import Sb.b;
import Sb.d;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import java.text.Bidi;

public abstract class t {
    public static final p a;

    static {
        t.a = new p();  // initializer: Ljava/lang/Object;-><init>()V
    }

    public static final Rect a(TextPaint textPaint0, CharSequence charSequence0, int v, int v1) {
        int v2 = v;
        if(charSequence0 instanceof Spanned) {
            Class class0 = MetricAffectingSpan.class;
            if(((Spanned)charSequence0).nextSpanTransition(v2 - 1, v1, class0) != v1) {
                Rect rect0 = new Rect();
                Rect rect1 = new Rect();
                TextPaint textPaint1 = new TextPaint();
                while(v2 < v1) {
                    int v3 = ((Spanned)charSequence0).nextSpanTransition(v2, v1, class0);
                    MetricAffectingSpan[] arr_metricAffectingSpan = (MetricAffectingSpan[])((Spanned)charSequence0).getSpans(v2, v3, class0);
                    textPaint1.set(textPaint0);
                    for(int v4 = 0; v4 < arr_metricAffectingSpan.length; ++v4) {
                        MetricAffectingSpan metricAffectingSpan0 = arr_metricAffectingSpan[v4];
                        if(((Spanned)charSequence0).getSpanStart(metricAffectingSpan0) != ((Spanned)charSequence0).getSpanEnd(metricAffectingSpan0)) {
                            metricAffectingSpan0.updateMeasureState(textPaint1);
                        }
                    }
                    if(Build.VERSION.SDK_INT >= 29) {
                        o.a(textPaint1, charSequence0, v2, v3, rect1);
                    }
                    else {
                        textPaint1.getTextBounds(charSequence0.toString(), v2, v3, rect1);
                    }
                    int v5 = rect0.right;
                    rect0.right = rect1.width() + v5;
                    rect0.top = Math.min(rect0.top, rect1.top);
                    rect0.bottom = Math.max(rect0.bottom, rect1.bottom);
                    v2 = v3;
                }
                return rect0;
            }
        }
        Rect rect2 = new Rect();
        if(Build.VERSION.SDK_INT >= 29) {
            o.a(textPaint0, charSequence0, v2, v1, rect2);
            return rect2;
        }
        textPaint0.getTextBounds(charSequence0.toString(), v2, v1, rect2);
        return rect2;
    }

    public static final float b(int v, int v1, float[] arr_f) {
        return arr_f[(v - v1) * 2 + 1];
    }

    public static final int c(Layout layout0, int v, boolean z) {
        if(v <= 0) {
            return 0;
        }
        if(v >= layout0.getText().length()) {
            return layout0.getLineCount() - 1;
        }
        int v1 = layout0.getLineForOffset(v);
        int v2 = layout0.getLineStart(v1);
        if(v2 != v && layout0.getLineEnd(v1) != v) {
            return v1;
        }
        if(v2 == v) {
            return z ? v1 - 1 : v1;
        }
        return z ? v1 : v1 + 1;
    }

    public static final int d(y y0, Layout layout0, i i0, int v, RectF rectF0, e e0, L0 l00, boolean z) {
        int v39;
        int v33;
        int v24;
        int v23;
        m[] arr_m1;
        m[] arr_m;
        int v11;
        float f1;
        float f;
        int v10;
        int v1 = layout0.getLineTop(v);
        int v2 = layout0.getLineBottom(v);
        int v3 = layout0.getLineStart(v);
        int v4 = layout0.getLineEnd(v);
        if(v3 == v4) {
            return -1;
        }
        int v5 = (v4 - v3) * 2;
        float[] arr_f = new float[v5];
        Layout layout1 = y0.f;
        int v6 = layout1.getLineStart(v);
        int v7 = y0.f(v);
        if(v5 < (v7 - v6) * 2) {
            throw new IllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        L0.i i1 = new L0.i(y0);
        int v8 = layout1.getParagraphDirection(v) == 1 ? 1 : 0;
        int v9 = 0;
        while(v6 < v7) {
            boolean z1 = layout1.isRtlCharAt(v6);
            if(v8 == 0 || z1) {
                v10 = v7;
                if(v8 == 0 || !z1) {
                    v11 = v8;
                    if(z1) {
                        float f2 = i1.a(v6, false, false, true);
                        f = i1.a(v6 + 1, true, true, true);
                        f1 = f2;
                    }
                    else {
                        f = i1.a(v6, false, false, false);
                        f1 = i1.a(v6 + 1, true, true, false);
                    }
                }
                else {
                    v11 = v8;
                    f1 = i1.a(v6, false, false, false);
                    f = i1.a(v6 + 1, true, true, false);
                }
            }
            else {
                v10 = v7;
                f = i1.a(v6, false, false, true);
                f1 = i1.a(v6 + 1, true, true, true);
                v11 = v8;
            }
            arr_f[v9] = f;
            arr_f[v9 + 1] = f1;
            v9 += 2;
            ++v6;
            v8 = v11;
            v7 = v10;
        }
        Layout layout2 = (Layout)i0.X;
        int v12 = layout2.getLineStart(v);
        int v13 = layout2.getLineEnd(v);
        int v14 = i0.t(v12, false);
        int v15 = i0.u(v14);
        Bidi bidi0 = i0.i(v14);
        if(bidi0 == null) {
            arr_m = new m[]{new m(v12, v13, layout2.isRtlCharAt(v12))};
        }
        else {
            Bidi bidi1 = bidi0.createLineBidi(v12 - v15, v13 - v15);
            if(bidi1 == null) {
                arr_m = new m[]{new m(v12, v13, layout2.isRtlCharAt(v12))};
            }
            else {
                int v16 = bidi1.getRunCount();
                arr_m = new m[v16];
                int v17 = 0;
                while(v17 < v16) {
                    arr_m[v17] = new m(bidi1.getRunStart(v17) + v12, bidi1.getRunLimit(v17) + v12, bidi1.getRunLevel(v17) % 2 == 1);
                    ++v17;
                    v16 = v16;
                }
            }
        }
        b b0 = z ? new d(0, arr_m.length - 1, 1) : new b(arr_m.length - 1, 0, -1);  // initializer: LSb/b;-><init>(III)V
        int v18 = b0.X;
        int v19 = b0.Y;
        int v20 = b0.Z;
        if(v20 > 0 && v18 <= v19 || v20 < 0 && v19 <= v18) {
            while(true) {
                m m0 = arr_m[v18];
                int v21 = m0.a;
                int v22 = m0.b;
                float f3 = m0.c ? arr_f[(v22 - 1 - v3) * 2] : arr_f[(v21 - v3) * 2];
                float f4 = m0.c ? t.b(v21, v3, arr_f) : t.b(v22 - 1, v3, arr_f);
                boolean z2 = m0.c;
                if(z) {
                    float f5 = rectF0.left;
                    if(f4 >= f5) {
                        arr_m1 = arr_m;
                        float f6 = rectF0.right;
                        if(f3 <= f6) {
                            if((z2 || f5 > f3) && (!z2 || f6 < f4)) {
                                int v25 = v21;
                                v24 = v22;
                                while(true) {
                                    v23 = v20;
                                    if(v24 - v25 <= 1) {
                                        break;
                                    }
                                    int v26 = (v24 + v25) / 2;
                                    float f7 = arr_f[(v26 - v3) * 2];
                                    int v27 = v26;
                                    if((z2 || f7 <= rectF0.left) && (!z2 || f7 >= rectF0.right)) {
                                        v25 = v27;
                                    }
                                    else {
                                        v24 = v27;
                                    }
                                    v20 = v23;
                                }
                                if(!z2) {
                                    v24 = v25;
                                }
                            }
                            else {
                                v23 = v20;
                                v24 = v21;
                            }
                            int v28 = e0.c(v24);
                            if(v28 != -1) {
                                int v29 = e0.b(v28);
                                if(v29 < v22) {
                                    if(v29 >= v21) {
                                        v21 = v29;
                                    }
                                    if(v28 > v22) {
                                        v28 = v22;
                                    }
                                    RectF rectF1 = new RectF(0.0f, ((float)v1), 0.0f, ((float)v2));
                                    int v30 = v28;
                                    while(true) {
                                        rectF1.left = z2 ? arr_f[(v30 - 1 - v3) * 2] : arr_f[(v21 - v3) * 2];
                                        rectF1.right = z2 ? t.b(v21, v3, arr_f) : t.b(v30 - 1, v3, arr_f);
                                        if(((Boolean)l00.j(rectF1, rectF0)).booleanValue()) {
                                            goto label_180;
                                        }
                                        v21 = e0.e(v21);
                                        if(v21 == -1 || v21 >= v22) {
                                            break;
                                        }
                                        int v31 = e0.c(v21);
                                        v30 = v31 <= v22 ? v31 : v22;
                                    }
                                }
                            }
                        }
                        else {
                            v23 = v20;
                        }
                    }
                    else {
                        v23 = v20;
                        arr_m1 = arr_m;
                    }
                    v21 = -1;
                }
                else {
                    v23 = v20;
                    arr_m1 = arr_m;
                    float f8 = rectF0.left;
                    if(f4 >= f8) {
                        float f9 = rectF0.right;
                        if(f3 <= f9) {
                            if(!z2 && f9 < f4) {
                                v33 = v22 - 1;
                            }
                            else if(!z2 || f8 > f3) {
                                int v32 = v21;
                                v33 = v22;
                                while(v33 - v32 > 1) {
                                    int v34 = (v33 + v32) / 2;
                                    float f10 = arr_f[(v34 - v3) * 2];
                                    int v35 = v34;
                                    if(!z2 && f10 <= rectF0.right || z2 && f10 >= rectF0.left) {
                                        v33 = v35;
                                    }
                                    else {
                                        v32 = v35;
                                    }
                                }
                                if(!z2) {
                                    v33 = v32;
                                }
                            }
                            else {
                                v33 = v22 - 1;
                            }
                            int v36 = e0.b(v33 + 1);
                            if(v36 != -1) {
                                int v37 = e0.c(v36);
                                if(v37 > v21) {
                                    if(v36 < v21) {
                                        v36 = v21;
                                    }
                                    if(v37 <= v22) {
                                        v22 = v37;
                                    }
                                    RectF rectF2 = new RectF(0.0f, ((float)v1), 0.0f, ((float)v2));
                                    int v38 = v36;
                                    while(true) {
                                        rectF2.left = z2 ? arr_f[(v22 - 1 - v3) * 2] : arr_f[(v38 - v3) * 2];
                                        rectF2.right = z2 ? t.b(v38, v3, arr_f) : t.b(v22 - 1, v3, arr_f);
                                        if(((Boolean)l00.j(rectF2, rectF0)).booleanValue()) {
                                            v39 = v22;
                                            goto label_179;
                                        }
                                        v22 = e0.f(v22);
                                        if(v22 == -1 || v22 <= v21) {
                                            break;
                                        }
                                        int v40 = e0.b(v22);
                                        if(v40 < v21) {
                                            v40 = v21;
                                        }
                                        v38 = v40;
                                    }
                                }
                            }
                        }
                    }
                    v39 = -1;
                label_179:
                    v21 = v39;
                }
            label_180:
                if(v21 >= 0) {
                    return v21;
                }
                if(v18 == v19) {
                    break;
                }
                v18 += v23;
                arr_m = arr_m1;
                v20 = v23;
            }
        }
        return -1;
    }

    public static final boolean e(Spanned spanned0, Class class0) {
        return spanned0.nextSpanTransition(-1, spanned0.length(), class0) != spanned0.length();
    }
}

