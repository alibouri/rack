package u6;

import J1.E;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.shape.MaterialShapeDrawable;
import z1.a;

public final class d extends b {
    public final boolean a;
    public final boolean b;
    public final WindowInsetsCompat c;

    public d(View view0, WindowInsetsCompat windowInsetsCompat0) {
        this.c = windowInsetsCompat0;
        boolean z = false;
        boolean z1 = (view0.getSystemUiVisibility() & 0x2000) != 0;
        this.b = z1;
        MaterialShapeDrawable materialShapeDrawable0 = BottomSheetBehavior.x(view0).i;
        ColorStateList colorStateList0 = materialShapeDrawable0 == null ? E.c(view0) : materialShapeDrawable0.X.c;
        if(colorStateList0 != null) {
            int v = colorStateList0.getDefaultColor();
            if(v != 0 && a.b(v) <= 0.5) {
                z = true;
            }
            this.a = z;
            return;
        }
        if(view0.getBackground() instanceof ColorDrawable) {
            int v1 = ((ColorDrawable)view0.getBackground()).getColor();
            if(v1 != 0 && a.b(v1) <= 0.5) {
                z = true;
            }
            this.a = z;
            return;
        }
        this.a = z1;
    }

    @Override  // u6.b
    public final void a(View view0) {
        this.c(view0);
    }

    @Override  // u6.b
    public final void b(View view0, int v) {
        this.c(view0);
    }

    public final void c(View view0) {
        int v = view0.getTop();
        WindowInsetsCompat windowInsetsCompat0 = this.c;
        if(v < windowInsetsCompat0.d()) {
            int v1 = view0.getSystemUiVisibility();
            view0.setSystemUiVisibility((this.a ? v1 | 0x2000 : v1 & 0xFFFFDFFF));
            view0.setPadding(view0.getPaddingLeft(), windowInsetsCompat0.d() - view0.getTop(), view0.getPaddingRight(), view0.getPaddingBottom());
            return;
        }
        if(view0.getTop() != 0) {
            int v2 = view0.getSystemUiVisibility();
            view0.setSystemUiVisibility((this.b ? v2 | 0x2000 : v2 & 0xFFFFDFFF));
            view0.setPadding(view0.getPaddingLeft(), 0, view0.getPaddingRight(), view0.getPaddingBottom());
        }
    }
}

