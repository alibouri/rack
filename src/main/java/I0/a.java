package i0;

import android.graphics.RenderNode;
import android.view.View;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationResponse;

public abstract class a {
    public static TranslationResponseValue b(ViewTranslationResponse viewTranslationResponse0) {
        return viewTranslationResponse0.getValue("android:text");
    }

    public static ViewTranslationResponse c(Object object0) {
        return (ViewTranslationResponse)object0;
    }

    public static void f() {
    }

    public static void g(RenderNode renderNode0) {
        renderNode0.setRenderEffect(null);
    }

    public static void h(View view0) {
        view0.setRenderEffect(null);
    }
}

