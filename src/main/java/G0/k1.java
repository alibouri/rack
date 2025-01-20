package G0;

import Bb.a;
import Bb.p;
import Nb.j;
import R2.w;
import T4.l;
import U.s;
import Xb.H;
import Xb.J;
import Zb.i;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.AndroidComposeView;
import c0.b;
import e0.m;
import java.util.Collection;
import kotlin.coroutines.CoroutineContext;

public abstract class k1 {
    public static final ViewGroup.LayoutParams a;

    static {
        k1.a = new ViewGroup.LayoutParams(-2, -2);
    }

    public static final i1 a(AbstractComposeView abstractComposeView0, CompositionContext compositionContext0, b b0) {
        AndroidComposeView androidComposeView0;
        i1 i10 = null;
        if(n0.a.compareAndSet(false, true)) {
            i i0 = l.i(1, 6, null);
            J.q(H.a(((CoroutineContext)T.k0.getValue())), null, null, new m0(i0, null), 3);
            a a0 = new a(10, i0);
            synchronized(m.b) {
                m.h = p.G0(((Collection)m.h), a0);
            }
            m.a();
        }
        if(abstractComposeView0.getChildCount() > 0) {
            View view0 = abstractComposeView0.getChildAt(0);
            androidComposeView0 = view0 instanceof AndroidComposeView ? ((AndroidComposeView)view0) : null;
        }
        else {
            abstractComposeView0.removeAllViews();
            androidComposeView0 = null;
        }
        if(androidComposeView0 == null) {
            androidComposeView0 = new AndroidComposeView(abstractComposeView0.getContext(), compositionContext0.h());
            abstractComposeView0.addView(androidComposeView0, k1.a);
        }
        s s0 = new s(compositionContext0, new w(androidComposeView0.getRoot()));
        Object object0 = androidComposeView0.getTag(0x7F0A0332);  // id:wrapped_composition_tag
        if(object0 instanceof i1) {
            i10 = (i1)object0;
        }
        if(i10 == null) {
            i10 = new i1(androidComposeView0, s0);
            androidComposeView0.setTag(0x7F0A0332, i10);  // id:wrapped_composition_tag
        }
        i10.c(b0);
        if(!j.a(androidComposeView0.getCoroutineContext(), compositionContext0.h())) {
            androidComposeView0.setCoroutineContext(compositionContext0.h());
        }
        return i10;
    }
}

