package c6;

import M.J;

public final class b {
    public final char a;

    public b(char c) {
        this.a = c;
    }

    @Override
    public final String toString() {
        char[] arr_c = {'\\', 'u', '\u0000', '\u0000', '\u0000', '\u0000'};
        int v = this.a;
        for(int v1 = 0; v1 < 4; ++v1) {
            arr_c[5 - v1] = "0123456789ABCDEF".charAt(v & 15);
            v >>= 4;
        }
        return J.e("CharMatcher.is(\'", String.copyValueOf(arr_c), "\')");
    }
}

