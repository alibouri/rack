package q0;

import android.view.RenderNode;

public final class n {
    public static final n a;

    static {
        n.a = new n();  // initializer: Ljava/lang/Object;-><init>()V
    }

    public final int a(RenderNode renderNode0) {
        return renderNode0.getAmbientShadowColor();
    }

    public final int b(RenderNode renderNode0) {
        return renderNode0.getSpotShadowColor();
    }

    public final void c(RenderNode renderNode0, int v) {
        renderNode0.setAmbientShadowColor(v);
    }

    public final void d(RenderNode renderNode0, int v) {
        renderNode0.setSpotShadowColor(v);
    }
}

