package K5;

import java.util.Arrays;

public final class l extends k {
    public final byte[] g;

    public l(byte[] arr_b) {
        super(Arrays.copyOfRange(arr_b, 0, 25));
        this.g = arr_b;
    }

    @Override  // K5.k
    public final byte[] O() {
        return this.g;
    }
}

