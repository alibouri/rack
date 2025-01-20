package r8;

public final class j extends g {
    public final byte[] c;
    public final int d;
    public final int e;

    public j(byte[] arr_b, int v, int v1, int v2, int v3) {
        super(v2, v3);
        if(v2 > v || v3 > v1) {
            throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
        }
        this.c = arr_b;
        this.d = v;
        this.e = v1;
    }

    @Override  // r8.g
    public final byte[] a() {
        byte[] arr_b = this.c;
        int v = this.d;
        int v1 = this.a;
        int v2 = this.b;
        if(v1 == v && v2 == this.e) {
            return arr_b;
        }
        int v3 = v1 * v2;
        byte[] arr_b1 = new byte[v3];
        if(v1 == v) {
            System.arraycopy(arr_b, 0, arr_b1, 0, v3);
            return arr_b1;
        }
        int v5 = 0;
        for(int v4 = 0; v4 < v2; ++v4) {
            System.arraycopy(arr_b, v5, arr_b1, v4 * v1, v1);
            v5 += v;
        }
        return arr_b1;
    }

    @Override  // r8.g
    public final byte[] b(int v, byte[] arr_b) {
        if(v < 0 || v >= this.b) {
            throw new IllegalArgumentException("Requested row is outside the image: " + v);
        }
        int v1 = this.a;
        if(arr_b == null || arr_b.length < v1) {
            arr_b = new byte[v1];
        }
        System.arraycopy(this.c, v * this.d, arr_b, 0, v1);
        return arr_b;
    }
}

