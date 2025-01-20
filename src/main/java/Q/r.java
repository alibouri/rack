package Q;

import Bb.q;
import Nb.j;
import R2.e;
import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.material.ripple.RippleHostView;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public final class r extends ViewGroup {
    public final int b0;
    public final ArrayList c0;
    public final ArrayList d0;
    public final e e0;
    public int f0;

    public r(Context context0) {
        super(context0);
        this.b0 = 5;
        ArrayList arrayList0 = new ArrayList();
        this.c0 = arrayList0;
        ArrayList arrayList1 = new ArrayList();
        this.d0 = arrayList1;
        e e0 = new e();  // initializer: Ljava/lang/Object;-><init>()V
        e0.X = new LinkedHashMap();
        e0.Y = new LinkedHashMap();
        this.e0 = e0;
        this.setClipChildren(false);
        RippleHostView rippleHostView0 = new RippleHostView(context0);  // initializer: Landroid/view/View;-><init>(Landroid/content/Context;)V
        this.addView(rippleHostView0);
        arrayList0.add(rippleHostView0);
        arrayList1.add(rippleHostView0);
        this.f0 = 1;
        this.setTag(0x7F0A0171, Boolean.TRUE);  // id:hide_in_inspector_tag
    }

    public final RippleHostView a(s s0) {
        e e0 = this.e0;
        RippleHostView rippleHostView0 = (RippleHostView)((LinkedHashMap)e0.X).get(s0);
        if(rippleHostView0 != null) {
            return rippleHostView0;
        }
        j.f(this.d0, "<this>");
        RippleHostView rippleHostView1 = (RippleHostView)(this.d0.isEmpty() ? null : this.d0.remove(0));
        LinkedHashMap linkedHashMap0 = (LinkedHashMap)e0.X;
        LinkedHashMap linkedHashMap1 = (LinkedHashMap)e0.Y;
        if(rippleHostView1 == null) {
            ArrayList arrayList0 = this.c0;
            if(this.f0 > q.y(arrayList0)) {
                rippleHostView1 = new RippleHostView(this.getContext());  // initializer: Landroid/view/View;-><init>(Landroid/content/Context;)V
                this.addView(rippleHostView1);
                arrayList0.add(rippleHostView1);
            }
            else {
                rippleHostView1 = (RippleHostView)arrayList0.get(this.f0);
                s s1 = (s)linkedHashMap1.get(rippleHostView1);
                if(s1 != null) {
                    s1.b0();
                    RippleHostView rippleHostView2 = (RippleHostView)linkedHashMap0.get(s1);
                    if(rippleHostView2 != null) {
                        s s2 = (s)linkedHashMap1.remove(rippleHostView2);
                    }
                    linkedHashMap0.remove(s1);
                    rippleHostView1.c();
                }
            }
            int v = this.f0;
            this.f0 = v < this.b0 - 1 ? v + 1 : 0;
        }
        linkedHashMap0.put(s0, rippleHostView1);
        linkedHashMap1.put(rippleHostView1, s0);
        return rippleHostView1;
    }

    @Override  // android.view.ViewGroup
    public final void onLayout(boolean z, int v, int v1, int v2, int v3) {
    }

    @Override  // android.view.View
    public final void onMeasure(int v, int v1) {
        this.setMeasuredDimension(0, 0);
    }

    @Override  // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }
}

