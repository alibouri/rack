package p2;

import android.view.View;
import androidx.recyclerview.widget.p;
import m5.b;

public final class w {
    public p a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;

    public w() {
        this.d();
    }

    public final void a() {
        this.c = this.d ? this.a.g() : this.a.k();
    }

    public final void b(View view0, int v) {
        if(this.d) {
            int v1 = this.a.b(view0);
            this.c = this.a.m() + v1;
        }
        else {
            this.c = this.a.e(view0);
        }
        this.b = v;
    }

    public final void c(View view0, int v) {
        int v1 = this.a.m();
        if(v1 >= 0) {
            this.b(view0, v);
            return;
        }
        this.b = v;
        if(this.d) {
            int v2 = this.a.g() - v1 - this.a.b(view0);
            this.c = this.a.g() - v2;
            if(v2 > 0) {
                int v3 = this.a.c(view0);
                int v4 = this.c - v3;
                int v5 = this.a.k();
                int v6 = v4 - (Math.min(this.a.e(view0) - v5, 0) + v5);
                if(v6 < 0) {
                    this.c = Math.min(v2, -v6) + this.c;
                }
            }
        }
        else {
            int v7 = this.a.e(view0);
            int v8 = v7 - this.a.k();
            this.c = v7;
            if(v8 > 0) {
                int v9 = this.a.c(view0);
                int v10 = this.a.g();
                int v11 = this.a.b(view0);
                int v12 = this.a.g() - Math.min(0, v10 - v1 - v11) - (v9 + v7);
                if(v12 < 0) {
                    this.c -= Math.min(v8, -v12);
                }
            }
        }
    }

    public final void d() {
        this.b = -1;
        this.c = 0x80000000;
        this.d = false;
        this.e = false;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("AnchorInfo{mPosition=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", mCoordinate=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", mLayoutFromEnd=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", mValid=");
        return b.z(stringBuilder0, this.e, '}');
    }
}

