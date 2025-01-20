package B6;

import M.J;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.appbar.MaterialToolbar;
import p6.a;

public abstract class l {
    public static final int[] a;
    public static final int[] b;

    static {
        l.a = new int[]{0x7F0400FA};  // attr:colorPrimary
        l.b = new int[]{0x7F0400FD};  // attr:colorPrimaryVariant
    }

    public static void a(Context context0, AttributeSet attributeSet0, int v, int v1) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, a.G, v, v1);
        boolean z = typedArray0.getBoolean(1, false);
        typedArray0.recycle();
        if(z) {
            TypedValue typedValue0 = new TypedValue();
            if(!context0.getTheme().resolveAttribute(0x7F040210, typedValue0, true) || typedValue0.type == 18 && typedValue0.data == 0) {  // attr:isMaterialTheme
                l.c(context0, l.b, "Theme.MaterialComponents");
            }
        }
        l.c(context0, l.a, "Theme.AppCompat");
    }

    public static void b(Context context0, AttributeSet attributeSet0, int[] arr_v, int v, int v1, int[] arr_v1) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, a.G, v, v1);
        boolean z = false;
        if(!typedArray0.getBoolean(2, false)) {
            typedArray0.recycle();
            return;
        }
        if(arr_v1.length != 0) {
            TypedArray typedArray1 = context0.obtainStyledAttributes(attributeSet0, arr_v, v, v1);
            int v2 = 0;
            while(v2 < arr_v1.length) {
                if(typedArray1.getResourceId(arr_v1[v2], -1) == -1) {
                    typedArray1.recycle();
                    goto label_19;
                }
                ++v2;
            }
            typedArray1.recycle();
            z = true;
        }
        else if(typedArray0.getResourceId(0, -1) != -1) {
            z = true;
        }
    label_19:
        typedArray0.recycle();
        if(!z) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    public static void c(Context context0, int[] arr_v, String s) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(arr_v);
        int v = 0;
        while(v < arr_v.length) {
            if(typedArray0.hasValue(v)) {
                ++v;
                continue;
            }
            typedArray0.recycle();
            throw new IllegalArgumentException(J.e("The style on this component requires your app theme to be ", s, " (or a descendant)."));
        }
        typedArray0.recycle();
    }

    public static float d(Context context0, int v) {
        return TypedValue.applyDimension(1, ((float)v), context0.getResources().getDisplayMetrics());
    }

    public static TextView e(MaterialToolbar materialToolbar0, CharSequence charSequence0) {
        for(int v = 0; v < materialToolbar0.getChildCount(); ++v) {
            View view0 = materialToolbar0.getChildAt(v);
            if(view0 instanceof TextView && TextUtils.equals(((TextView)view0).getText(), charSequence0)) {
                return (TextView)view0;
            }
        }
        return null;
    }

    public static TypedArray f(Context context0, AttributeSet attributeSet0, int[] arr_v, int v, int v1, int[] arr_v1) {
        l.a(context0, attributeSet0, v, v1);
        l.b(context0, attributeSet0, arr_v, v, v1, arr_v1);
        return context0.obtainStyledAttributes(attributeSet0, arr_v, v, v1);
    }

    public static PorterDuff.Mode g(int v, PorterDuff.Mode porterDuff$Mode0) {
        switch(v) {
            case 3: {
                return PorterDuff.Mode.SRC_OVER;
            }
            case 5: {
                return PorterDuff.Mode.SRC_IN;
            }
            case 9: {
                return PorterDuff.Mode.SRC_ATOP;
            }
            case 14: {
                return PorterDuff.Mode.MULTIPLY;
            }
            case 15: {
                return PorterDuff.Mode.SCREEN;
            }
            case 16: {
                return PorterDuff.Mode.ADD;
            }
            default: {
                return porterDuff$Mode0;
            }
        }
    }
}

