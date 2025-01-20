package n0;

import android.app.NotificationChannel;
import android.graphics.ColorSpace.Named;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout;

public abstract class y {
    public static NotificationChannel b(Object object0) [...] // Inlined contents

    public static NotificationChannel c(String s) {
        return new NotificationChannel("voip-call", s, 0);
    }

    public static ColorSpace.Named d() {
        return ColorSpace.Named.DCI_P3;
    }

    public static void l(NotificationChannel notificationChannel0) {
        notificationChannel0.setLockscreenVisibility(0);
    }

    public static void o(View view0) {
        view0.setImportantForAutofill(8);
    }

    public static void p(AppBarLayout appBarLayout0, boolean z) {
        appBarLayout0.setKeyboardNavigationCluster(z);
    }

    public static ColorSpace.Named q() {
        return ColorSpace.Named.DISPLAY_P3;
    }

    public static ColorSpace.Named r() {
        return ColorSpace.Named.EXTENDED_SRGB;
    }

    public static ColorSpace.Named s() {
        return ColorSpace.Named.LINEAR_EXTENDED_SRGB;
    }

    public static ColorSpace.Named t() {
        return ColorSpace.Named.LINEAR_SRGB;
    }
}

