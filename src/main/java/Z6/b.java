package z6;

import B6.l;
import Bb.q;
import H6.i;
import J1.E;
import L6.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.InsetDrawable;
import android.os.Build.VERSION;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.Window;
import androidx.appcompat.view.c;
import com.google.android.material.shape.MaterialShapeDrawable;
import i.f;
import i.g;
import o9.e;
import q9.G0;

public final class b extends f {
    public final MaterialShapeDrawable c;
    public final Rect d;

    public b(Context context0) {
        TypedValue typedValue0 = q.W(context0, 0x7F0402B1);  // attr:materialAlertDialogTheme
        int v = typedValue0 == null ? 0 : typedValue0.data;
        Context context1 = a.a(context0, null, 0x7F04002C, 0x7F130118);  // attr:alertDialogStyle
        if(v != 0) {
            context1 = new c(context1, v);
        }
        super(context1, 0x7F13023A);  // style:ThemeOverlay.App.MaterialAlertDialog
        ContextThemeWrapper contextThemeWrapper0 = this.a.a;
        Resources.Theme resources$Theme0 = contextThemeWrapper0.getTheme();
        l.a(contextThemeWrapper0, null, 0x7F04002C, 0x7F130118);  // attr:alertDialogStyle
        l.b(contextThemeWrapper0, null, p6.a.m, 0x7F04002C, 0x7F130118, new int[0]);  // attr:alertDialogStyle
        TypedArray typedArray0 = contextThemeWrapper0.obtainStyledAttributes(null, p6.a.m, 0x7F04002C, 0x7F130118);  // attr:alertDialogStyle
        int v1 = typedArray0.getDimensionPixelSize(2, contextThemeWrapper0.getResources().getDimensionPixelSize(0x7F070109));  // dimen:mtrl_alert_dialog_background_inset_start
        int v2 = typedArray0.getDimensionPixelSize(3, contextThemeWrapper0.getResources().getDimensionPixelSize(0x7F07010A));  // dimen:mtrl_alert_dialog_background_inset_top
        int v3 = typedArray0.getDimensionPixelSize(1, contextThemeWrapper0.getResources().getDimensionPixelSize(0x7F070108));  // dimen:mtrl_alert_dialog_background_inset_end
        int v4 = typedArray0.getDimensionPixelSize(0, contextThemeWrapper0.getResources().getDimensionPixelSize(0x7F070107));  // dimen:mtrl_alert_dialog_background_inset_bottom
        typedArray0.recycle();
        if(contextThemeWrapper0.getResources().getConfiguration().getLayoutDirection() == 1) {
            int v5 = v3;
            v3 = v1;
            v1 = v5;
        }
        this.d = new Rect(v1, v2, v3, v4);
        MaterialShapeDrawable materialShapeDrawable0 = new MaterialShapeDrawable(contextThemeWrapper0, null, 0x7F04002C, 0x7F130118);  // attr:alertDialogStyle
        materialShapeDrawable0.h(contextThemeWrapper0);
        materialShapeDrawable0.j(ColorStateList.valueOf(q.X(0x7F040101, contextThemeWrapper0, b.class.getCanonicalName())));  // attr:colorSurface
        if(Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue1 = new TypedValue();
            resources$Theme0.resolveAttribute(0x1010571, typedValue1, true);
            float f = typedValue1.getDimension(this.a.a.getResources().getDisplayMetrics());
            if(typedValue1.type == 5 && f < 0.0f) {
                i i0 = materialShapeDrawable0.X.a.e();
                i0.e = new H6.a(f);
                i0.f = new H6.a(f);
                i0.g = new H6.a(f);
                i0.h = new H6.a(f);
                materialShapeDrawable0.setShapeAppearanceModel(i0.a());
            }
        }
        this.c = materialShapeDrawable0;
    }

    @Override  // i.f
    public final g a() {
        g g0 = super.a();
        Window window0 = g0.getWindow();
        View view0 = window0.getDecorView();
        MaterialShapeDrawable materialShapeDrawable0 = this.c;
        if(materialShapeDrawable0 instanceof MaterialShapeDrawable) {
            materialShapeDrawable0.i(E.e(view0));
        }
        window0.setBackgroundDrawable(new InsetDrawable(materialShapeDrawable0, this.d.left, this.d.top, this.d.right, this.d.bottom));
        view0.setOnTouchListener(new z6.a(g0, this.d));
        return g0;
    }

    @Override  // i.f
    public final void c(G0 g00) {
        this.a.n = g00;
    }

    public final void e(e e0) {
        super.b("Cancel", e0);
    }

    public final void f(J9.i i0) {
        super.d("OK", i0);
    }
}

