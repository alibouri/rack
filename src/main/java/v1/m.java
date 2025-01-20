package v1;

import android.app.Notification.BigPictureStyle;
import android.graphics.drawable.Icon;

public abstract class m {
    public static void a(Notification.BigPictureStyle notification$BigPictureStyle0, Icon icon0) {
        notification$BigPictureStyle0.bigPicture(icon0);
    }

    public static void b(Notification.BigPictureStyle notification$BigPictureStyle0, CharSequence charSequence0) {
        notification$BigPictureStyle0.setContentDescription(charSequence0);
    }

    public static void c(Notification.BigPictureStyle notification$BigPictureStyle0, boolean z) {
        notification$BigPictureStyle0.showBigPictureWhenCollapsed(z);
    }
}

