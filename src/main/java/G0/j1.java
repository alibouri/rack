package G0;

import android.view.ViewParent;
import androidx.compose.ui.platform.AndroidComposeView;

public final class j1 {
    public static final j1 a;

    static {
        j1.a = new j1();  // initializer: Ljava/lang/Object;-><init>()V
    }

    public final void a(AndroidComposeView androidComposeView0) {
        ViewParent viewParent0 = androidComposeView0.getParent();
        if(viewParent0 != null) {
            viewParent0.onDescendantInvalidated(androidComposeView0, androidComposeView0);
        }
    }
}

