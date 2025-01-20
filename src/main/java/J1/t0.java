package J1;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.ext.SdkExtensions;
import android.telephony.CellInfo;
import android.telephony.CellSignalStrength;
import android.view.Display;
import android.view.WindowInsetsController;
import java.io.InputStream;
import java.util.List;

public abstract class t0 {
    public static void A(WindowInsetsController windowInsetsController0) {
        windowInsetsController0.setSystemBarsAppearance(0, 0);
    }

    public static int a() {
        return SdkExtensions.getExtensionVersion(30);
    }

    public static ApplicationExitInfo e(Object object0) {
        return (ApplicationExitInfo)object0;
    }

    public static CellSignalStrength g(CellInfo cellInfo0) {
        return cellInfo0.getCellSignalStrength();
    }

    public static Display h(Context context0) {
        return context0.getDisplay();
    }

    public static InputStream j(ApplicationExitInfo applicationExitInfo0) {
        return applicationExitInfo0.getTraceInputStream();
    }

    public static String k(ApplicationExitInfo applicationExitInfo0) {
        return applicationExitInfo0.toString();
    }

    public static List m(ActivityManager activityManager0) {
        return activityManager0.getHistoricalProcessExitReasons(null, 0, 0);
    }

    public static void p(WindowInsetsController windowInsetsController0) {
        windowInsetsController0.setSystemBarsAppearance(8, 8);
    }

    public static int u() {
        return SdkExtensions.getExtensionVersion(1000000);
    }

    public static int v(ApplicationExitInfo applicationExitInfo0) {
        return applicationExitInfo0.getImportance();
    }

    public static void x(WindowInsetsController windowInsetsController0) {
        windowInsetsController0.setSystemBarsAppearance(0, 8);
    }

    public static void y(WindowInsetsController windowInsetsController0) {
        windowInsetsController0.setSystemBarsAppearance(16, 16);
    }

    public static void z(WindowInsetsController windowInsetsController0) {
        windowInsetsController0.setSystemBarsAppearance(0, 16);
    }
}

