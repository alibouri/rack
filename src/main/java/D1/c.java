package d1;

import Ab.t;
import D.j;
import F0.i0;
import Nb.k;
import W.d;
import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.functions.Function1;

public final class c extends k implements Function1 {
    public final int X;
    public final o Y;

    public c(o o0, int v) {
        this.X = v;
        this.Y = o0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        if(this.X != 0) {
            int v = ((MotionEvent)object0).getActionMasked();
            o o0 = this.Y;
            switch(v) {
                case 0: 
                case 1: 
                case 2: 
                case 3: 
                case 4: 
                case 5: 
                case 6: {
                    return Boolean.valueOf(o0.dispatchTouchEvent(((MotionEvent)object0)));
                }
                default: {
                    return Boolean.valueOf(o0.dispatchGenericMotionEvent(((MotionEvent)object0)));
                }
            }
        }
        AndroidComposeView androidComposeView0 = ((i0)object0) instanceof AndroidComposeView ? ((AndroidComposeView)(((i0)object0))) : null;
        o o1 = this.Y;
        if(androidComposeView0 != null) {
            j j0 = new j(androidComposeView0, 7, o1);
            d d0 = androidComposeView0.q1;
            if(!d0.j(j0)) {
                d0.c(j0);
            }
        }
        o1.removeAllViewsInLayout();
        return t.a;
    }
}

