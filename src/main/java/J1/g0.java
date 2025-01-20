package J1;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.Window;
import android.view.WindowInsets.Builder;
import android.view.WindowInsets;

public abstract class g0 {
    public static void A(Window window0) {
        window0.setNavigationBarContrastEnforced(true);
    }

    public static int a(NetworkCapabilities networkCapabilities0) {
        return networkCapabilities0.getSignalStrength();
    }

    public static int b(TextPaint textPaint0, CharSequence charSequence0, int v, int v1) {
        return textPaint0.getTextRunCursor(charSequence0, 0, v, false, v1, 2);
    }

    public static AssetFileDescriptor c(ContentResolver contentResolver0, Uri uri0, Bundle bundle0) {
        return contentResolver0.openTypedAssetFile(uri0, "image/*", bundle0, null);
    }

    public static WindowInsets.Builder f() {
        return new WindowInsets.Builder();
    }

    public static WindowInsets.Builder g(WindowInsets windowInsets0) {
        return new WindowInsets.Builder(windowInsets0);
    }

    public static void n(Canvas canvas0, BlendMode blendMode0) {
        canvas0.drawColor(0, blendMode0);
    }

    public static void s(Window window0) {
        window0.setStatusBarContrastEnforced(false);
    }

    public static int w(TextPaint textPaint0, CharSequence charSequence0, int v, int v1) {
        return textPaint0.getTextRunCursor(charSequence0, 0, v, false, v1, 0);
    }
}

