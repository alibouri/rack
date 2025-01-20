package w6;

import Bb.F;
import android.content.res.ColorStateList;
import o.m;

public final class a extends m {
    public ColorStateList f0;
    public boolean g0;
    public static final int[][] h0;

    static {
        a.h0 = new int[][]{new int[]{0x101009E, 0x10100A0}, new int[]{0x101009E, 0xFEFEFF60}, new int[]{0xFEFEFF62, 0x10100A0}, new int[]{0xFEFEFF62, 0xFEFEFF60}};
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if(this.f0 == null) {
            int v = F.u(this, 0x7F0400F0);  // attr:colorControlActivated
            int v1 = F.u(this, 0x7F040101);  // attr:colorSurface
            int v2 = F.u(this, 0x7F0400F9);  // attr:colorOnSurface
            int[] arr_v = {F.F(v1, 1.0f, v), F.F(v1, 0.54f, v2), F.F(v1, 0.38f, v2), F.F(v1, 0.38f, v2)};
            this.f0 = new ColorStateList(a.h0, arr_v);
        }
        return this.f0;
    }

    @Override  // android.widget.TextView
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if(this.g0 && this.getButtonTintList() == null) {
            this.setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.g0 = z;
        if(z) {
            this.setButtonTintList(this.getMaterialThemeColorsTintList());
            return;
        }
        this.setButtonTintList(null);
    }
}

