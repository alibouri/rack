package c;

import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import android.view.WindowManager.LayoutParams;

public abstract class v {
    public static SignalStrength a(TelephonyManager telephonyManager0) {
        return telephonyManager0.getSignalStrength();
    }

    public static void d(WindowManager.LayoutParams windowManager$LayoutParams0) {
        windowManager$LayoutParams0.layoutInDisplayCutoutMode = 3;
    }
}

