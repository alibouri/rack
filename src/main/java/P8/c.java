package P8;

import v.h;

public final class c {
    public final int a;
    public final byte b;
    public static final int[][] c;

    static {
        c.c = new int[][]{new int[]{0x5412, 0}, new int[]{20773, 1}, new int[]{0x5E7C, 2}, new int[]{0x5B4B, 3}, new int[]{0x45F9, 4}, new int[]{0x40CE, 5}, new int[]{0x4F97, 6}, new int[]{0x4AA0, 7}, new int[]{30660, 8}, new int[]{0x72F3, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{0x662F, 12}, new int[]{0x6318, 13}, new int[]{0x6C41, 14}, new int[]{0x6976, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{0xD0C, 22}, new int[]{2107, 23}, new int[]{0x355F, 24}, new int[]{0x3068, 25}, new int[]{0x3F31, 26}, new int[]{0x3A06, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{0x2EDA, 30}, new int[]{0x2BED, 0x1F}};
    }

    public c(int v) {
        this.a = b.a[v >> 3 & 3];
        this.b = (byte)(v & 7);
    }

    public static c a(int v, int v1) {
        int[][] arr2_v = c.c;
        int v2 = 0x7FFFFFFF;
        int v3 = 0;
        int v4 = 0;
        while(v4 < 0x20) {
            int[] arr_v = arr2_v[v4];
            int v5 = arr_v[0];
            if(v5 != v && v5 != v1) {
                int v6 = Integer.bitCount(v ^ v5);
                if(v6 < v2) {
                    v3 = arr_v[1];
                    v2 = v6;
                }
                if(v != v1) {
                    int v7 = Integer.bitCount(v5 ^ v1);
                    if(v7 < v2) {
                        v3 = arr_v[1];
                        v2 = v7;
                    }
                }
                ++v4;
                continue;
            }
            return new c(arr_v[1]);
        }
        return v2 > 3 ? null : new c(v3);
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof c ? this.a == ((c)object0).a && this.b == ((c)object0).b : false;
    }

    @Override
    public final int hashCode() {
        return h.d(this.a) << 3 | this.b;
    }
}

