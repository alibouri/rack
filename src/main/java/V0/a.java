package v0;

import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.platform.AndroidComposeView;

public final class a implements HapticFeedback {
    public final AndroidComposeView a;

    public a(AndroidComposeView androidComposeView0) {
        this.a = androidComposeView0;
    }

    @Override  // androidx.compose.ui.hapticfeedback.HapticFeedback
    public final void a(int v) {
        AndroidComposeView androidComposeView0 = this.a;
        if(v == 0) {
            androidComposeView0.performHapticFeedback(0);
            return;
        }
        if(v == 9) {
            androidComposeView0.performHapticFeedback(9);
        }
    }
}

