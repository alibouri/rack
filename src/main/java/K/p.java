package K;

import Bb.n;
import Bb.q;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;

public final class p {
    public static final p a;

    static {
        p.a = new p();  // initializer: Ljava/lang/Object;-><init>()V
    }

    public final void a(EditorInfo editorInfo0) {
        editorInfo0.setSupportedHandwritingGestures(q.L(new Class[]{SelectGesture.class, DeleteGesture.class, SelectRangeGesture.class, DeleteRangeGesture.class, JoinOrSplitGesture.class, InsertGesture.class, RemoveSpaceGesture.class}));
        editorInfo0.setSupportedHandwritingGesturePreviews(n.z0(new Class[]{SelectGesture.class, DeleteGesture.class, SelectRangeGesture.class, DeleteRangeGesture.class}));
    }
}

