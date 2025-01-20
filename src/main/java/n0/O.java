package n0;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Paint;
import android.graphics.RenderNode;

public abstract class o {
    public static void B(RenderNode renderNode0) {
        renderNode0.setClipToBounds(false);
    }

    public static BlendModeColorFilter d(int v, BlendMode blendMode0) {
        return new BlendModeColorFilter(v, blendMode0);
    }

    public static void f() {
    }

    public static void h(Paint paint0, BlendMode blendMode0) {
        paint0.setBlendMode(blendMode0);
    }

    public static void p(RenderNode renderNode0) {
        renderNode0.setUseCompositingLayer(true, null);
    }

    public static void s(RenderNode renderNode0) {
        renderNode0.setHasOverlappingRendering(true);
    }

    public static void v(RenderNode renderNode0) {
        renderNode0.setUseCompositingLayer(false, null);
    }

    public static void x(RenderNode renderNode0) {
        renderNode0.setHasOverlappingRendering(false);
    }
}

