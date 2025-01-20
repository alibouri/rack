package w0;

import G0.h;
import U.Z;
import U.d;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.input.InputModeManager;

public final class b implements InputModeManager {
    public final ParcelableSnapshotMutableState a;

    public b(int v, h h0) {
        this.a = d.D(new a(v), Z.e);
    }

    @Override  // androidx.compose.ui.input.InputModeManager
    public final int a() {
        return ((a)this.a.getValue()).a;
    }
}

