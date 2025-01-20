package H2;

import G2.e;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView.OnScrollListener;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Arrays;
import p2.E;

public final class c extends OnScrollListener {
    public e a;
    public final ViewPager2 b;
    public final l c;
    public final LinearLayoutManager d;
    public int e;
    public int f;
    public final b g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public boolean l;

    public c(ViewPager2 viewPager20) {
        this.b = viewPager20;
        this.c = viewPager20.k0;
        this.d = (LinearLayoutManager)viewPager20.k0.getLayoutManager();
        this.g = new b();  // initializer: Ljava/lang/Object;-><init>()V
        this.e();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$OnScrollListener
    public final void a(RecyclerView recyclerView0, int v) {
        int v1 = this.e;
        boolean z = true;
        if((v1 != 1 || this.f != 1) && v == 1) {
            this.e = 1;
            int v2 = this.i;
            if(v2 != -1) {
                this.h = v2;
                this.i = -1;
            }
            else if(this.h == -1) {
                this.h = this.d.J0();
            }
            this.d(1);
            return;
        }
        if((v1 == 1 || v1 == 4) && v == 2) {
            if(this.k) {
                this.d(2);
                this.j = true;
            }
            return;
        }
        if(v1 != 1 && v1 != 4) {
            z = false;
        }
        b b0 = this.g;
        if(z && v == 0) {
            this.f();
            if(!this.k) {
                int v3 = b0.a;
                if(v3 != -1) {
                    e e0 = this.a;
                    if(e0 != null) {
                        e0.b(v3, 0.0f, 0);
                    }
                }
                this.d(0);
                this.e();
            }
            else if(b0.c == 0) {
                int v4 = b0.a;
                if(this.h != v4) {
                    this.c(v4);
                }
                this.d(0);
                this.e();
            }
        }
        if(this.e == 2 && v == 0 && this.l) {
            this.f();
            if(b0.c == 0) {
                int v5 = b0.a;
                if(this.i != v5) {
                    if(v5 == -1) {
                        v5 = 0;
                    }
                    this.c(v5);
                }
                this.d(0);
                this.e();
            }
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$OnScrollListener
    public final void b(RecyclerView recyclerView0, int v, int v1) {
        this.k = true;
        this.f();
        b b0 = this.g;
        if(this.j) {
            this.j = false;
            int v2 = v1 <= 0 && (v1 != 0 || (v >= 0 ? 0 : 1) != (this.b.h0.z() == 1 ? 1 : 0)) || b0.c == 0 ? b0.a : b0.a + 1;
            this.i = v2;
            if(this.h != v2) {
                this.c(v2);
            }
        }
        else if(this.e == 0) {
            this.c((b0.a == -1 ? 0 : b0.a));
        }
        int v3 = b0.a == -1 ? 0 : b0.a;
        float f = b0.b;
        int v4 = b0.c;
        e e0 = this.a;
        if(e0 != null) {
            e0.b(v3, f, v4);
        }
        if((b0.a == this.i || this.i == -1) && b0.c == 0 && this.f != 1) {
            this.d(0);
            this.e();
        }
    }

    public final void c(int v) {
        e e0 = this.a;
        if(e0 != null) {
            e0.c(v);
        }
    }

    public final void d(int v) {
        if(this.e == 3 && this.f == 0) {
            return;
        }
        if(this.f == v) {
            return;
        }
        this.f = v;
        e e0 = this.a;
        if(e0 != null) {
            e0.a(v);
        }
    }

    public final void e() {
        this.e = 0;
        this.f = 0;
        this.g.a = -1;
        this.g.b = 0.0f;
        this.g.c = 0;
        this.h = -1;
        this.i = -1;
        this.j = false;
        this.k = false;
        this.l = false;
    }

    public final void f() {
        int v16;
        int v14;
        int v13;
        int v12;
        int v11;
        int v8;
        LinearLayoutManager linearLayoutManager0 = this.d;
        int v = linearLayoutManager0.J0();
        b b0 = this.g;
        b0.a = v;
        float f = 0.0f;
        if(v == -1) {
            b0.a = -1;
            b0.b = 0.0f;
            b0.c = 0;
            return;
        }
        View view0 = linearLayoutManager0.q(v);
        if(view0 == null) {
            b0.a = -1;
            b0.b = 0.0f;
            b0.c = 0;
            return;
        }
        int v2 = ((E)view0.getLayoutParams()).b.left;
        int v3 = ((E)view0.getLayoutParams()).b.right;
        int v4 = ((E)view0.getLayoutParams()).b.top;
        int v5 = ((E)view0.getLayoutParams()).b.bottom;
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        if(viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams) {
            v2 += ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).leftMargin;
            v3 += ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).rightMargin;
            v4 += ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).topMargin;
            v5 += ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).bottomMargin;
        }
        int v6 = view0.getHeight() + v4 + v5;
        int v7 = view0.getWidth();
        l l0 = this.c;
        if(linearLayoutManager0.p == 0) {
            v8 = view0.getLeft() - v2 - l0.getPaddingLeft();
            if(this.b.h0.z() == 1) {
                v8 = -v8;
            }
            v6 = v7 + v2 + v3;
        }
        else {
            v8 = view0.getTop() - v4 - l0.getPaddingTop();
        }
        b0.c = -v8;
        if(-v8 < 0) {
            int v9 = linearLayoutManager0.v();
            if(v9 == 0) {
            label_80:
                if(linearLayoutManager0.v() <= 1) {
                    v16 = linearLayoutManager0.v();
                label_82:
                    for(int v1 = 0; v1 < v16; ++v1) {
                        if(a.a(linearLayoutManager0.u(v1))) {
                            throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
                        }
                    }
                }
            }
            else {
                boolean z = linearLayoutManager0.p == 0;
                int[][] arr2_v = new int[v9][2];
                for(int v10 = 0; v10 < v9; ++v10) {
                    View view1 = linearLayoutManager0.u(v10);
                    if(view1 == null) {
                        throw new IllegalStateException("null view contained in the view hierarchy");
                    }
                    ViewGroup.LayoutParams viewGroup$LayoutParams1 = view1.getLayoutParams();
                    ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = viewGroup$LayoutParams1 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams1) : a.a;
                    int[] arr_v = arr2_v[v10];
                    if(z) {
                        v11 = view1.getLeft();
                        v12 = viewGroup$MarginLayoutParams0.leftMargin;
                    }
                    else {
                        v11 = view1.getTop();
                        v12 = viewGroup$MarginLayoutParams0.topMargin;
                    }
                    arr_v[0] = v11 - v12;
                    int[] arr_v1 = arr2_v[v10];
                    if(z) {
                        v13 = view1.getRight();
                        v14 = viewGroup$MarginLayoutParams0.rightMargin;
                    }
                    else {
                        v13 = view1.getBottom();
                        v14 = viewGroup$MarginLayoutParams0.bottomMargin;
                    }
                    arr_v1[1] = v13 + v14;
                }
                Arrays.sort(arr2_v, new E2.a(2));
                int v15 = 1;
                while(v15 < v9) {
                    if(arr2_v[v15 - 1][1] == arr2_v[v15][0]) {
                        ++v15;
                        continue;
                    }
                    v16 = linearLayoutManager0.v();
                    goto label_82;
                }
                int[] arr_v2 = arr2_v[0];
                if(arr_v2[0] > 0 || arr2_v[v9 - 1][1] < arr_v2[1] - arr_v2[0]) {
                    v16 = linearLayoutManager0.v();
                    goto label_82;
                }
                goto label_80;
            }
            throw new IllegalStateException("Page can only be offset by a positive amount, not by " + b0.c);
        }
        if(v6 != 0) {
            f = ((float)(-v8)) / ((float)v6);
        }
        b0.b = f;
    }
}

