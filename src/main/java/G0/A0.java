package G0;

import android.view.accessibility.AccessibilityManager;

public final class a0 {
    public static final a0 a;

    static {
        a0.a = new a0();  // initializer: Ljava/lang/Object;-><init>()V
    }

    public final int a(AccessibilityManager accessibilityManager0, int v, int v1) {
        return accessibilityManager0.getRecommendedTimeoutMillis(v, v1);
    }
}

