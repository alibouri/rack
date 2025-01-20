package J8;

import R2.w;
import x8.a;

public abstract class e extends d {
    public abstract void C(int arg1, StringBuilder arg2);

    public abstract int D(int arg1);

    public final void E(int v, int v1, StringBuilder stringBuilder0) {
        int v2 = w.o(v, v1, ((a)((w)this.b).Y));
        this.C(v2, stringBuilder0);
        int v3 = this.D(v2);
        int v4 = 100000;
        for(int v5 = 0; v5 < 5; ++v5) {
            if(v3 / v4 == 0) {
                stringBuilder0.append('0');
            }
            v4 /= 10;
        }
        stringBuilder0.append(v3);
    }
}

