package G0;

import android.os.Build.VERSION;
import androidx.compose.ui.input.pointer.PointerIconService;
import androidx.compose.ui.platform.AndroidComposeView;
import z0.k;
import z0.l;

public final class m implements PointerIconService {
    public final AndroidComposeView a;

    public m(AndroidComposeView androidComposeView0) {
        this.a = androidComposeView0;
        k.a.getClass();
    }

    @Override  // androidx.compose.ui.input.pointer.PointerIconService
    public final void a(k k0) {
        if(k0 == null) {
            k.a.getClass();
            k0 = l.a;
        }
        if(Build.VERSION.SDK_INT >= 24) {
            E.a.a(this.a, k0);
        }
    }
}

