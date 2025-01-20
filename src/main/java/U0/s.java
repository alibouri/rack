package U0;

import android.os.Bundle;
import android.view.inputmethod.InputContentInfo;

public class s extends r {
    @Override  // U0.q
    public final boolean commitContent(InputContentInfo inputContentInfo0, int v, Bundle bundle0) {
        return this.b == null ? false : this.b.commitContent(inputContentInfo0, v, bundle0);
    }
}

