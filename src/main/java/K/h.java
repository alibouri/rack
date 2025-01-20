package K;

import I.j0;
import M.o0;
import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.compose.ui.platform.ViewConfiguration;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.jvm.functions.Function1;

public final class h {
    public static final h a;

    static {
        h.a = new h();  // initializer: Ljava/lang/Object;-><init>()V
    }

    public final void a(j0 j00, o0 o00, HandwritingGesture handwritingGesture0, ViewConfiguration viewConfiguration0, Executor executor0, IntConsumer intConsumer0, Function1 function10) {
        int v = j00 == null ? 3 : t.a.i(j00, handwritingGesture0, o00, viewConfiguration0, function10);
        if(intConsumer0 == null) {
            return;
        }
        if(executor0 != null) {
            executor0.execute(new g(v, 0, intConsumer0));
            return;
        }
        intConsumer0.accept(v);
    }

    public final boolean b(j0 j00, o0 o00, PreviewableHandwritingGesture previewableHandwritingGesture0, CancellationSignal cancellationSignal0) {
        return j00 == null ? false : t.a.A(j00, previewableHandwritingGesture0, o00, cancellationSignal0);
    }
}

