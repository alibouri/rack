package B6;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipDrawable;
import yc.d;

public final class h extends d {
    public final int a;
    public final Object b;

    public h(int v, Object object0) {
        this.a = v;
        this.b = object0;
        super();
    }

    private final void J(int v) {
    }

    @Override  // yc.d
    public final void u(int v) {
        if(this.a != 0) {
            return;
        }
        ((j)this.b).d = true;
        i i0 = (i)((j)this.b).e.get();
        if(i0 != null) {
            i0.a();
        }
    }

    @Override  // yc.d
    public final void v(Typeface typeface0, boolean z) {
        if(this.a != 0) {
            ChipDrawable chipDrawable0 = ((Chip)this.b).f0;
            CharSequence charSequence0 = chipDrawable0.A1 ? chipDrawable0.C0 : ((Chip)this.b).getText();
            ((Chip)this.b).setText(charSequence0);
            ((Chip)this.b).requestLayout();
            ((Chip)this.b).invalidate();
            return;
        }
        if(!z) {
            ((j)this.b).d = true;
            i i0 = (i)((j)this.b).e.get();
            if(i0 != null) {
                i0.a();
            }
        }
    }
}

