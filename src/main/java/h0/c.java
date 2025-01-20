package h0;

import android.app.NotificationChannel;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Handler;
import android.view.PixelCopy;
import android.view.ViewStructure;
import android.view.Window.Callback;
import android.view.Window;
import android.view.autofill.AutofillManager.AutofillCallback;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import io.sentry.android.core.internal.util.f;
import java.time.Duration;
import java.time.Instant;

public abstract class c {
    public static int b(Instant instant0) {
        return instant0.getNano();
    }

    public static long d(Instant instant0) {
        return instant0.getEpochSecond();
    }

    public static NotificationChannel e(String s) {
        return new NotificationChannel("photo-upload", s, 0);
    }

    public static Intent f(Context context0, BroadcastReceiver broadcastReceiver0, IntentFilter intentFilter0) {
        return context0.registerReceiver(broadcastReceiver0, intentFilter0, 2);
    }

    public static Bitmap h(int v, int v1, Bitmap.Config bitmap$Config0, boolean z, ColorSpace colorSpace0) {
        return Bitmap.createBitmap(null, v, v1, bitmap$Config0, z, colorSpace0);
    }

    public static ColorSpace k(Object object0) [...] // Inlined contents

    public static Duration m() {
        return Duration.ofMinutes(30L);
    }

    public static Instant n() {
        return Instant.now();
    }

    public static void o() {
    }

    public static void q(ViewStructure viewStructure0, String[] arr_s) {
        viewStructure0.setAutofillHints(arr_s);
    }

    public static void r(Window.Callback window$Callback0, boolean z) {
        window$Callback0.onPointerCaptureChanged(z);
    }

    public static void s(Window window0, Bitmap bitmap0, f f0, Handler handler0) {
        PixelCopy.request(window0, bitmap0, f0, handler0);
    }

    public static void t(AutofillManager autofillManager0, AutofillManager.AutofillCallback autofillManager$AutofillCallback0) {
        autofillManager0.unregisterCallback(autofillManager$AutofillCallback0);
    }

    public static boolean u(AutofillValue autofillValue0) {
        return autofillValue0.isDate();
    }

    public static void x(AutofillManager autofillManager0, AutofillManager.AutofillCallback autofillManager$AutofillCallback0) {
        autofillManager0.registerCallback(autofillManager$AutofillCallback0);
    }
}

