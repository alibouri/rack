package G0;

import Ab.t;
import D.j;
import Nb.k;
import android.view.accessibility.AccessibilityEvent;
import androidx.compose.ui.platform.b;
import kotlin.jvm.functions.Function1;

public final class w extends k implements Function1 {
    public final int X;
    public final b Y;

    public w(b b0, int v) {
        this.X = v;
        this.Y = b0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        if(this.X != 0) {
            b b0 = this.Y;
            b0.getClass();
            if(((H0)object0).Y.contains(((H0)object0))) {
                j j0 = new j(((H0)object0), 8, b0);
                b0.d.getSnapshotObserver().a(((H0)object0), b0.M, j0);
            }
            return t.a;
        }
        return Boolean.valueOf(this.Y.d.getParent().requestSendAccessibilityEvent(this.Y.d, ((AccessibilityEvent)object0)));
    }
}

