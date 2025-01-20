package J1;

import android.graphics.Rect;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;

public abstract class w {
    public static AccessibilityNodeInfo.AccessibilityAction a() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    public static float b(VelocityTracker velocityTracker0, int v) {
        return velocityTracker0.getAxisVelocity(v);
    }

    public static void c(AccessibilityNodeInfo accessibilityNodeInfo0, Rect rect0) {
        accessibilityNodeInfo0.getBoundsInWindow(rect0);
    }

    public static CharSequence d(AccessibilityNodeInfo accessibilityNodeInfo0) {
        return accessibilityNodeInfo0.getContainerTitle();
    }

    public static int e(ViewConfiguration viewConfiguration0, int v, int v1, int v2) {
        return viewConfiguration0.getScaledMaximumFlingVelocity(v, v1, v2);
    }

    public static int f(ViewConfiguration viewConfiguration0, int v, int v1, int v2) {
        return viewConfiguration0.getScaledMinimumFlingVelocity(v, v1, v2);
    }

    public static boolean g(AccessibilityNodeInfo accessibilityNodeInfo0) {
        return accessibilityNodeInfo0.isAccessibilityDataSensitive();
    }

    public static void h(TextView textView0, int v, float f) {
        textView0.setLineHeight(v, f);
    }
}

