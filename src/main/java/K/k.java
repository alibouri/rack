package K;

import android.view.inputmethod.CursorAnchorInfo.Builder;
import m0.c;
import n0.M;

public abstract class k {
    public static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder cursorAnchorInfo$Builder0, c c0) {
        return cursorAnchorInfo$Builder0.setEditorBoundsInfo(i.m().setEditorBounds(M.E(c0)).setHandwritingBounds(M.E(c0)).build());
    }
}

