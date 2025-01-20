package x6;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipDrawable;

public final class a extends ViewOutlineProvider {
    public final Chip a;

    public a(Chip chip0) {
        this.a = chip0;
        super();
    }

    @Override  // android.view.ViewOutlineProvider
    public final void getOutline(View view0, Outline outline0) {
        ChipDrawable chipDrawable0 = this.a.f0;
        if(chipDrawable0 != null) {
            chipDrawable0.getOutline(outline0);
            return;
        }
        outline0.setAlpha(0.0f);
    }
}

