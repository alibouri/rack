package B2;

import N4.j;
import z1.d;

public abstract class m extends l {
    public d[] a;
    public String b;
    public int c;

    public m() {
        this.a = null;
        this.c = 0;
    }

    public m(m m0) {
        this.a = null;
        this.c = 0;
        this.b = m0.b;
        this.a = j.m(m0.a);
    }

    public d[] getPathData() {
        return this.a;
    }

    public String getPathName() {
        return this.b;
    }

    public void setPathData(d[] arr_d) {
        if(!j.i(this.a, arr_d)) {
            this.a = j.m(arr_d);
            return;
        }
        d[] arr_d1 = this.a;
        for(int v = 0; v < arr_d.length; ++v) {
            arr_d1[v].a = arr_d[v].a;
            for(int v1 = 0; true; ++v1) {
                float[] arr_f = arr_d[v].b;
                if(v1 >= arr_f.length) {
                    break;
                }
                arr_d1[v].b[v1] = arr_f[v1];
            }
        }
    }
}

