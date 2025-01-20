package x8;

import java.util.Arrays;

public final class a implements Cloneable {
    public int[] X;
    public int Y;

    public a() {
        this.Y = 0;
        this.X = new int[1];
    }

    public a(int v) {
        this.Y = v;
        this.X = new int[(v + 0x1F) / 0x20];
    }

    public final void b(boolean z) {
        this.d(this.Y + 1);
        if(z) {
            this.X[this.Y / 0x20] |= 1 << (this.Y & 0x1F);
        }
        ++this.Y;
    }

    public final void c(int v, int v1) {
        if(v1 < 0 || v1 > 0x20) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        this.d(this.Y + v1);
        while(true) {
            boolean z = true;
            if(v1 <= 0) {
                break;
            }
            if((v >> v1 - 1 & 1) != 1) {
                z = false;
            }
            this.b(z);
            --v1;
        }
    }

    @Override
    public final Object clone() {
        int[] arr_v = (int[])this.X.clone();
        int v = this.Y;
        Object object0 = new a();  // initializer: Ljava/lang/Object;-><init>()V
        object0.X = arr_v;
        object0.Y = v;
        return object0;
    }

    public final void d(int v) {
        int[] arr_v = this.X;
        if(v > arr_v.length << 5) {
            int[] arr_v1 = new int[(v + 0x1F) / 0x20];
            System.arraycopy(arr_v, 0, arr_v1, 0, arr_v.length);
            this.X = arr_v1;
        }
    }

    public final boolean e(int v) {
        return (1 << (v & 0x1F) & this.X[v / 0x20]) != 0;
    }

    // Deobfuscation rating: LOW(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof a ? this.Y == ((a)object0).Y && Arrays.equals(this.X, ((a)object0).X) : false;
    }

    public final int f(int v) {
        int v1 = this.Y;
        if(v >= v1) {
            return v1;
        }
        int v2 = v / 0x20;
        int v3;
        for(v3 = ~((1 << (v & 0x1F)) - 1) & this.X[v2]; v3 == 0; v3 = arr_v[v2]) {
            ++v2;
            int[] arr_v = this.X;
            if(v2 == arr_v.length) {
                return this.Y;
            }
        }
        int v4 = Integer.numberOfTrailingZeros(v3) + (v2 << 5);
        return v4 <= this.Y ? v4 : this.Y;
    }

    public final int g(int v) {
        int v1 = this.Y;
        if(v >= v1) {
            return v1;
        }
        int v2 = v / 0x20;
        int v3;
        for(v3 = ~((1 << (v & 0x1F)) - 1 | this.X[v2]); v3 == 0; v3 = ~arr_v[v2]) {
            ++v2;
            int[] arr_v = this.X;
            if(v2 == arr_v.length) {
                return this.Y;
            }
        }
        int v4 = Integer.numberOfTrailingZeros(v3) + (v2 << 5);
        return v4 <= this.Y ? v4 : this.Y;
    }

    public final int h() {
        return (this.Y + 7) / 8;
    }

    @Override
    public final int hashCode() {
        int v = this.Y * 0x1F;
        return Arrays.hashCode(this.X) + v;
    }

    public final boolean i(int v, int v1) {
        if(v1 < v || v < 0 || v1 > this.Y) {
            throw new IllegalArgumentException();
        }
        if(v1 == v) {
            return true;
        }
        int v2 = (v1 - 1) / 0x20;
        for(int v3 = v / 0x20; true; ++v3) {
            int v4 = 0x1F;
            if(v3 > v2) {
                break;
            }
            if(v3 >= v2) {
                v4 = 0x1F & v1 - 1;
            }
            if(((2 << v4) - (1 << (v3 <= v / 0x20 ? v & 0x1F : 0)) & this.X[v3]) != 0) {
                return false;
            }
        }
        return true;
    }

    public final void j() {
        int[] arr_v = new int[this.X.length];
        int v1 = (this.Y - 1) / 0x20;
        for(int v2 = 0; v2 < v1 + 1; ++v2) {
            long v3 = (long)this.X[v2];
            long v4 = (v3 & 0x55555555L) << 1 | v3 >> 1 & 0x55555555L;
            long v5 = (v4 & 0x33333333L) << 2 | v4 >> 2 & 0x33333333L;
            long v6 = (v5 & 0xF0F0F0FL) << 4 | v5 >> 4 & 0xF0F0F0FL;
            long v7 = (v6 & 0xFF00FFL) << 8 | v6 >> 8 & 0xFF00FFL;
            arr_v[v1 - v2] = (int)((v7 & 0xFFFFL) << 16 | v7 >> 16 & 0xFFFFL);
        }
        int v8 = this.Y;
        int v9 = v1 + 1 << 5;
        if(v8 != v9) {
            int v10 = v9 - v8;
            int v11 = arr_v[0] >>> v10;
            for(int v = 1; v < v1 + 1; ++v) {
                int v12 = arr_v[v];
                arr_v[v - 1] = v11 | v12 << 0x20 - v10;
                v11 = v12 >>> v10;
            }
            arr_v[v1] = v11;
        }
        this.X = arr_v;
    }

    public final void k(int v) {
        this.X[v / 0x20] |= 1 << (v & 0x1F);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder(this.Y / 8 + this.Y + 1);
        for(int v = 0; v < this.Y; ++v) {
            if((v & 7) == 0) {
                stringBuilder0.append(' ');
            }
            stringBuilder0.append(((char)(this.e(v) ? 88 : 46)));
        }
        return stringBuilder0.toString();
    }
}

