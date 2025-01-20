package l4;

import java.util.Date;

public abstract class f {
    public static final int[] a;

    static {
        f.a = new int[]{0x1F, 28, 0x1F, 30, 0x1F, 30, 0x1F, 0x1F, 30, 0x1F, 30, 0x1F};
    }

    public static Date a(long v) {
        return new Date(v * 1000L - 2082844800000L);
    }

    public static int b(byte[] arr_b) {
        return arr_b[3] & 0xFF | ((arr_b[0] & 0xFF) << 24 | (arr_b[1] & 0xFF) << 16 | (arr_b[2] & 0xFF) << 8);
    }

    public static boolean c(int v, int v1, int v2) {
        if(v >= 1 && v <= 0x270F && v1 >= 0 && v1 <= 11) {
            int v3 = f.a[v1];
            if(v1 == 1 && v % 4 == 0 && (v % 100 != 0 || v % 400 == 0)) {
                ++v3;
            }
            return v2 >= 1 && v2 <= v3;
        }
        return false;
    }

    public static boolean d(int v, int v1, int v2) {
        return v >= 0 && v < 24 && v1 >= 0 && v1 < 60 && v2 >= 0 && v2 < 60;
    }
}

