package u9;

import android.os.Handler;
import android.os.Looper;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

public final class i implements Function0 {
    public final int X;

    public i(int v) {
        this.X = v;
        super();
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.X != 0 ? UUID.randomUUID() : new Handler(Looper.getMainLooper());
    }
}

