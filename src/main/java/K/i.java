package K;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.ApplicationInfoFlags;
import android.content.pm.PackageManager.PackageInfoFlags;
import android.content.pm.PackageManager;
import android.graphics.text.LineBreakConfig.Builder;
import android.os.Bundle;
import android.os.Messenger;
import android.text.BoringLayout.Metrics;
import android.text.BoringLayout;
import android.text.Layout.Alignment;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import android.view.inputmethod.EditorBoundsInfo.Builder;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import i.v;

public abstract class i {
    public static ApplicationInfo a(PackageManager packageManager0, String s, PackageManager.ApplicationInfoFlags packageManager$ApplicationInfoFlags0) {
        return packageManager0.getApplicationInfo(s, packageManager$ApplicationInfoFlags0);
    }

    public static PackageInfo b(PackageManager packageManager0, String s, PackageManager.PackageInfoFlags packageManager$PackageInfoFlags0) {
        return packageManager0.getPackageInfo(s, packageManager$PackageInfoFlags0);
    }

    public static PackageManager.ApplicationInfoFlags c() {
        return PackageManager.ApplicationInfoFlags.of(0x80L);
    }

    public static PackageManager.PackageInfoFlags d() {
        return PackageManager.PackageInfoFlags.of(0L);
    }

    public static PackageManager.PackageInfoFlags e(long v) {
        return PackageManager.PackageInfoFlags.of(v);
    }

    public static LineBreakConfig.Builder f() {
        return new LineBreakConfig.Builder();
    }

    public static BoringLayout.Metrics i(CharSequence charSequence0, TextPaint textPaint0, TextDirectionHeuristic textDirectionHeuristic0) {
        return BoringLayout.isBoring(charSequence0, textPaint0, textDirectionHeuristic0, true, null);
    }

    public static BoringLayout j(CharSequence charSequence0, TextPaint textPaint0, int v, Layout.Alignment layout$Alignment0, float f, float f1, BoringLayout.Metrics boringLayout$Metrics0, boolean z, boolean z1, TextUtils.TruncateAt textUtils$TruncateAt0, int v1) {
        return new BoringLayout(charSequence0, textPaint0, v, layout$Alignment0, f, f1, boringLayout$Metrics0, z, textUtils$TruncateAt0, v1, z1);
    }

    public static EditorBoundsInfo.Builder m() {
        return new EditorBoundsInfo.Builder();
    }

    public static OnBackInvokedCallback p(Object object0) [...] // Inlined contents

    public static OnBackInvokedDispatcher s(Object object0) [...] // Inlined contents

    public static Object t(Intent intent0) {
        return intent0.getParcelableExtra("ClientCallbackMessenger", Messenger.class);
    }

    public static Object u(Bundle bundle0) {
        return bundle0.getParcelable("dialog.intent", PendingIntent.class);
    }

    public static void z(OnBackInvokedDispatcher onBackInvokedDispatcher0, v v0) {
        onBackInvokedDispatcher0.registerOnBackInvokedCallback(1000000, v0);
    }
}

