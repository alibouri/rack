package p2;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.I;
import java.util.ArrayList;
import java.util.Iterator;

public final class e implements Runnable {
    public final int X;
    public final ArrayList Y;
    public final k Z;

    public e(k k0, ArrayList arrayList0, int v) {
        this.X = v;
        this.Z = k0;
        this.Y = arrayList0;
        super();
    }

    @Override
    public final void run() {
        k k0;
        Iterator iterator3;
        k k2;
        k k1;
        switch(this.X) {
            case 0: {
                ArrayList arrayList1 = this.Y;
                Iterator iterator1 = arrayList1.iterator();
                while(true) {
                    boolean z1 = iterator1.hasNext();
                    k1 = this.Z;
                    if(!z1) {
                        break;
                    }
                    Object object1 = iterator1.next();
                    I i0 = ((j)object1).a;
                    k1.getClass();
                    View view0 = i0.a;
                    int v = ((j)object1).d - ((j)object1).b;
                    int v1 = ((j)object1).e - ((j)object1).c;
                    if(v != 0) {
                        view0.animate().translationX(0.0f);
                    }
                    if(v1 != 0) {
                        view0.animate().translationY(0.0f);
                    }
                    ViewPropertyAnimator viewPropertyAnimator1 = view0.animate();
                    k1.p.add(i0);
                    viewPropertyAnimator1.setDuration(k1.e).setListener(new g(k1, i0, v, view0, v1, viewPropertyAnimator1)).start();
                }
                arrayList1.clear();
                k1.m.remove(arrayList1);
                return;
            }
            case 1: {
                ArrayList arrayList2 = this.Y;
                for(Iterator iterator2 = arrayList2.iterator(); true; iterator2 = iterator3) {
                    boolean z2 = iterator2.hasNext();
                    k2 = this.Z;
                    if(!z2) {
                        break;
                    }
                    Object object2 = iterator2.next();
                    i i1 = (i)object2;
                    k2.getClass();
                    View view1 = i1.a == null ? null : i1.a.a;
                    View view2 = i1.b == null ? null : i1.b.a;
                    ArrayList arrayList3 = k2.r;
                    long v2 = k2.f;
                    if(view1 == null) {
                        iterator3 = iterator2;
                    }
                    else {
                        ViewPropertyAnimator viewPropertyAnimator2 = view1.animate().setDuration(v2);
                        arrayList3.add(i1.a);
                        viewPropertyAnimator2.translationX(((float)(i1.e - i1.c)));
                        viewPropertyAnimator2.translationY(((float)(i1.f - i1.d)));
                        iterator3 = iterator2;
                        viewPropertyAnimator2.alpha(0.0f).setListener(new h(k2, i1, viewPropertyAnimator2, view1, 0)).start();
                    }
                    if(view2 != null) {
                        ViewPropertyAnimator viewPropertyAnimator3 = view2.animate();
                        arrayList3.add(i1.b);
                        viewPropertyAnimator3.translationX(0.0f).translationY(0.0f).setDuration(v2).alpha(1.0f).setListener(new h(k2, i1, viewPropertyAnimator3, view2, 1)).start();
                    }
                }
                arrayList2.clear();
                k2.n.remove(arrayList2);
                return;
            }
            default: {
                ArrayList arrayList0 = this.Y;
                Iterator iterator0 = arrayList0.iterator();
                while(true) {
                    boolean z = iterator0.hasNext();
                    k0 = this.Z;
                    if(!z) {
                        break;
                    }
                    Object object0 = iterator0.next();
                    k0.getClass();
                    ViewPropertyAnimator viewPropertyAnimator0 = ((I)object0).a.animate();
                    k0.o.add(((I)object0));
                    viewPropertyAnimator0.alpha(1.0f).setDuration(k0.c).setListener(new f(k0, ((I)object0), ((I)object0).a, viewPropertyAnimator0)).start();
                }
                arrayList0.clear();
                k0.l.remove(arrayList0);
            }
        }
    }
}

