package v;

public abstract class h {
    public static final int[] a;

    static {
        h.a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 0x1F, 0x20, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 0x2F, 0x30};
    }

    public static boolean a(g g0, long v) {
        return v >= g0.d();
    }

    public static boolean b(int v, int v1) {
        if(v == 0) {
            throw null;
        }
        return v == v1;
    }

    public static ClassCastException c(Object object0) {
        object0.getClass();
        return new ClassCastException();
    }

    public static int d(int v) [...] // Inlined contents

    public static int[] e(int v) {
        int[] arr_v = new int[v];
        System.arraycopy(h.a, 0, arr_v, 0, v);
        return arr_v;
    }
}

