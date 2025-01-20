package R0;

import Nb.j;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import yc.l;

public final class c implements LeadingMarginSpan {
    @Override  // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas0, Paint paint0, int v, int v1, int v2, int v3, int v4, CharSequence charSequence0, int v5, int v6, boolean z, Layout layout0) {
        if(layout0 != null && paint0 != null) {
            int v7 = layout0.getLineForOffset(v5);
            if(v7 == layout0.getLineCount() - 1 && layout0.getEllipsisCount(v7) > 0) {
                float f = l.s(layout0, v7, paint0);
                float f1 = l.t(layout0, v7, paint0) + f;
                if(f1 != 0.0f) {
                    j.c(canvas0);
                    canvas0.translate(f1, 0.0f);
                }
            }
        }
    }

    @Override  // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return 0;
    }
}

