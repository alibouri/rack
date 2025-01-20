package G0;

import Nb.k;
import android.graphics.Matrix;
import kotlin.jvm.functions.Function2;
import n0.G;
import n0.M;

public final class t0 {
    public final k a;
    public Matrix b;
    public Matrix c;
    public float[] d;
    public float[] e;
    public boolean f;
    public boolean g;
    public boolean h;

    public t0(Function2 function20) {
        this.a = (k)function20;
        this.f = true;
        this.g = true;
        this.h = true;
    }

    public final float[] a(Object object0) {
        float[] arr_f = this.e;
        if(arr_f == null) {
            arr_f = G.a();
            this.e = arr_f;
        }
        if(this.g) {
            this.h = G0.G.i(this.b(object0), arr_f);
            this.g = false;
        }
        return this.h ? arr_f : null;
    }

    public final float[] b(Object object0) {
        float[] arr_f = this.d;
        if(arr_f == null) {
            arr_f = G.a();
            this.d = arr_f;
        }
        if(!this.f) {
            return arr_f;
        }
        Matrix matrix0 = this.b;
        if(matrix0 == null) {
            matrix0 = new Matrix();
            this.b = matrix0;
        }
        ((Function2)this.a).j(object0, matrix0);
        Matrix matrix1 = this.c;
        if(matrix1 == null || !matrix0.equals(matrix1)) {
            M.A(matrix0, arr_f);
            this.b = matrix1;
            this.c = matrix0;
        }
        this.f = false;
        return arr_f;
    }

    public final void c() {
        this.f = true;
        this.g = true;
    }
}

