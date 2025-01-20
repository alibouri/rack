package u;

import D0.T;
import U.Z;
import U.d;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.Modifier;
import com.apollographql.apollo.api.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class h implements T {
    public final ParcelableSnapshotMutableState X;

    public h(boolean z) {
        this.X = d.D(Boolean.valueOf(z), Z.e);
    }

    @Override  // androidx.compose.ui.Modifier
    public final Modifier d(Modifier modifier0) {
        return b.c(this, modifier0);
    }

    @Override  // D0.T
    public final Object h() {
        return this;
    }

    @Override  // androidx.compose.ui.Modifier
    public final boolean i(Function1 function10) {
        return ((Boolean)function10.n(this)).booleanValue();
    }

    @Override  // androidx.compose.ui.Modifier
    public final Object l(Object object0, Function2 function20) {
        return function20.j(object0, this);
    }
}

