package B;

import A3.e;
import a1.d;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;

public final class h implements g, i {
    public final float X;
    public final float Y;

    public h(float f) {
        this.X = f;
        this.Y = f;
    }

    @Override  // B.g, B.i
    public final float a() {
        return this.Y;
    }

    @Override  // B.i
    public final void b(Density density0, int v, int[] arr_v, int[] arr_v1) {
        this.c(density0, v, arr_v, LayoutDirection.X, arr_v1);
    }

    @Override  // B.g
    public final void c(Density density0, int v, int[] arr_v, LayoutDirection layoutDirection0, int[] arr_v1) {
        int v5;
        int v4;
        if(arr_v.length == 0) {
            return;
        }
        int v1 = density0.I(this.X);
        if(layoutDirection0 == LayoutDirection.Y) {
            int v11 = arr_v.length - 1;
            v4 = 0;
            v5 = 0;
            while(-1 < v11) {
                int v12 = arr_v[v11];
                int v13 = Math.min(v4, v - v12);
                arr_v1[v11] = v13;
                v5 = Math.min(v1, v - v13 - v12);
                v4 = arr_v1[v11] + v12 + v5;
                --v11;
            }
        }
        else {
            int v3 = 0;
            v4 = 0;
            v5 = 0;
            int v6 = 0;
            while(v3 < arr_v.length) {
                int v7 = arr_v[v3];
                int v8 = Math.min(v4, v - v7);
                arr_v1[v6] = v8;
                int v9 = Math.min(v1, v - v8 - v7);
                int v10 = arr_v1[v6] + v7 + v9;
                ++v3;
                ++v6;
                v5 = v9;
                v4 = v10;
            }
        }
        float f = -1.0f;
        int v14 = v4 - v5;
        if(v14 < v) {
            if(layoutDirection0 != LayoutDirection.X) {
                f = 1.0f;
            }
            int v15 = Math.round((1.0f + f) * (((float)(v - v14)) / 2.0f));
            for(int v2 = 0; v2 < arr_v1.length; ++v2) {
                arr_v1[v2] += v15;
            }
        }
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof h)) {
            return false;
        }
        return d.a(this.X, ((h)object0).X) ? j.X.equals(j.X) : false;
    }

    @Override
    public final int hashCode() {
        return j.X.hashCode() + (Float.floatToIntBits(this.X) * 0x1F + 0x4CF) * 0x1F;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = e.w("", "Arrangement#spacedAligned(");
        stringBuilder0.append(d.b(this.X));
        stringBuilder0.append(", ");
        stringBuilder0.append(j.X);
        stringBuilder0.append(')');
        return stringBuilder0.toString();
    }
}

