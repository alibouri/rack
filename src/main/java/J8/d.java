package J8;

import G0.a;
import R2.w;

public abstract class d extends a {
    public final void A(int v, StringBuilder stringBuilder0) {
        stringBuilder0.append("(01)");
        stringBuilder0.append('9');
        this.B(v, stringBuilder0.length(), stringBuilder0);
    }

    public final void B(int v, int v1, StringBuilder stringBuilder0) {
        int v2 = 0;
        for(int v3 = 0; v3 < 4; ++v3) {
            int v4 = w.o(v3 * 10 + v, 10, ((x8.a)((w)this.b).Y));
            if(v4 / 100 == 0) {
                stringBuilder0.append('0');
            }
            if(v4 / 10 == 0) {
                stringBuilder0.append('0');
            }
            stringBuilder0.append(v4);
        }
        int v5 = 0;
        for(int v6 = 0; v6 < 13; ++v6) {
            int v7 = stringBuilder0.charAt(v6 + v1) - 0x30;
            if((v6 & 1) == 0) {
                v7 *= 3;
            }
            v5 += v7;
        }
        int v8 = 10 - v5 % 10;
        if(v8 != 10) {
            v2 = v8;
        }
        stringBuilder0.append(v2);
    }
}

