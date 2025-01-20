package G0;

import Aa.v;
import F0.p0;
import M.O;
import Nb.s;
import S2.i;
import android.view.DragEvent;
import android.view.View.OnDragListener;
import android.view.View;
import androidx.compose.ui.draganddrop.DragAndDropManager;
import androidx.compose.ui.platform.DragAndDropModifierOnDragListener.modifier.1;
import g.a;
import j0.c;
import s.f;

public final class l0 implements View.OnDragListener, DragAndDropManager {
    public final c a;
    public final f b;
    public final DragAndDropModifierOnDragListener.modifier.1 c;

    public l0(v v0) {
        this.a = new c();  // initializer: Lg0/n;-><init>()V
        this.b = new f(0);
        this.c = new DragAndDropModifierOnDragListener.modifier.1(this);
    }

    @Override  // androidx.compose.ui.draganddrop.DragAndDropManager
    public final boolean a(c c0) {
        return this.b.contains(c0);
    }

    @Override  // android.view.View$OnDragListener
    public final boolean onDrag(View view0, DragEvent dragEvent0) {
        a a0 = new a(9, dragEvent0);
        int v = dragEvent0.getAction();
        c c0 = this.a;
        p0 p00 = p0.X;
        switch(v) {
            case 1: {
                s s0 = new s();  // initializer: Ljava/lang/Object;-><init>()V
                O o0 = new O(a0, c0, s0);
                if(o0.n(c0) == p00) {
                    F0.f.z(c0, o0);
                }
                boolean z = s0.X;
                this.b.getClass();
                s.a a1 = new s.a(this.b);
                while(a1.hasNext()) {
                    ((c)a1.next()).B0(a0);
                }
                return z;
            }
            case 2: {
                c0.A0(a0);
                return false;
            }
            case 3: {
                return c0.x0(a0);
            }
            case 4: {
                i i0 = new i(2, a0);
                if(i0.n(c0) == p00) {
                    F0.f.z(c0, i0);
                    return false;
                }
                return false;
            }
            case 5: {
                c0.y0(a0);
                return false;
            }
            case 6: {
                c0.z0(a0);
                return false;
            }
            default: {
                return false;
            }
        }
    }
}

