package p2;

import android.view.View;
import androidx.recyclerview.widget.B;
import androidx.recyclerview.widget.I;
import java.util.List;

public final class y {
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public List k;
    public boolean l;

    public final void a(View view0) {
        int v = this.k.size();
        View view1 = null;
        int v1 = 0x7FFFFFFF;
        for(int v2 = 0; v2 < v; ++v2) {
            View view2 = ((I)this.k.get(v2)).a;
            E e0 = (E)view2.getLayoutParams();
            if(view2 != view0 && !e0.a.j()) {
                int v3 = (e0.a.c() - this.d) * this.e;
                if(v3 >= 0 && v3 < v1) {
                    view1 = view2;
                    if(v3 == 0) {
                        break;
                    }
                    v1 = v3;
                }
            }
        }
        if(view1 == null) {
            this.d = -1;
            return;
        }
        this.d = ((E)view1.getLayoutParams()).a.c();
    }

    public final View b(B b0) {
        List list0 = this.k;
        if(list0 != null) {
            int v = list0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                View view0 = ((I)this.k.get(v1)).a;
                E e0 = (E)view0.getLayoutParams();
                if(!e0.a.j() && this.d == e0.a.c()) {
                    this.a(view0);
                    return view0;
                }
            }
            return null;
        }
        I i0 = b0.k(this.d, 0x7FFFFFFFFFFFFFFFL);
        this.d += this.e;
        return i0.a;
    }
}

