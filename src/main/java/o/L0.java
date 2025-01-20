package o;

import android.graphics.Rect;
import android.widget.PopupWindow;

public abstract class l0 {
    public static void a(PopupWindow popupWindow0, Rect rect0) {
        popupWindow0.setEpicenterBounds(rect0);
    }

    public static void b(PopupWindow popupWindow0, boolean z) {
        popupWindow0.setIsClippedToScreen(z);
    }
}

