package F0;

import Nb.j;
import java.util.Arrays;

public final class u {
    public int[] a;
    public int b;

    public u() {
        this.a = new int[10];
    }

    public u(int v) {
        this.a = new int[v];
    }

    public int a() {
        int v = this.b - 1;
        this.b = v;
        return this.a[v];
    }

    public void b(int v) {
        int[] arr_v = this.a;
        if(this.b >= arr_v.length) {
            int[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length * 2);
            j.e(arr_v1, "copyOf(this, newSize)");
            this.a = arr_v1;
        }
        int v1 = this.b;
        this.b = v1 + 1;
        this.a[v1] = v;
    }

    public void c(int v, int v1, int v2) {
        int v3 = this.b;
        int[] arr_v = this.a;
        if(v3 + 3 >= arr_v.length) {
            int[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length * 2);
            j.e(arr_v1, "copyOf(this, newSize)");
            this.a = arr_v1;
        }
        int[] arr_v2 = this.a;
        arr_v2[v3] = v + v2;
        arr_v2[v3 + 1] = v1 + v2;
        arr_v2[v3 + 2] = v2;
        this.b = v3 + 3;
    }

    public void d(int v, int v1, int v2, int v3) {
        int v4 = this.b;
        int[] arr_v = this.a;
        if(v4 + 4 >= arr_v.length) {
            int[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length * 2);
            j.e(arr_v1, "copyOf(this, newSize)");
            this.a = arr_v1;
        }
        int[] arr_v2 = this.a;
        arr_v2[v4] = v;
        arr_v2[v4 + 1] = v1;
        arr_v2[v4 + 2] = v2;
        arr_v2[v4 + 3] = v3;
        this.b = v4 + 4;
    }

    public void e(int v, int v1) {
        if(v < v1) {
            int v2 = v - 3;
            for(int v3 = v; v3 < v1; v3 += 3) {
                int[] arr_v = this.a;
                int v4 = arr_v[v3];
                int v5 = arr_v[v1];
                if(v4 < v5 || v4 == v5 && arr_v[v3 + 1] <= arr_v[v1 + 1]) {
                    v2 += 3;
                    this.f(v2, v3);
                }
            }
            this.f(v2 + 3, v1);
            this.e(v, v2);
            this.e(v2 + 6, v1);
        }
    }

    public void f(int v, int v1) {
        int[] arr_v = this.a;
        int v2 = arr_v[v];
        arr_v[v] = arr_v[v1];
        arr_v[v1] = v2;
        int v3 = arr_v[v + 1];
        arr_v[v + 1] = arr_v[v1 + 1];
        arr_v[v1 + 1] = v3;
        int v4 = arr_v[v + 2];
        arr_v[v + 2] = arr_v[v1 + 2];
        arr_v[v1 + 2] = v4;
    }
}

