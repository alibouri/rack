package r8;

public abstract class g {
    public final int a;
    public final int b;

    public g(int v, int v1) {
        this.a = v;
        this.b = v1;
    }

    public abstract byte[] a();

    public abstract byte[] b(int arg1, byte[] arg2);

    public boolean c() {
        return false;
    }

    public g d() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    @Override
    public final String toString() {
        int v5;
        int v = this.a;
        byte[] arr_b = new byte[v];
        int v1 = this.b;
        StringBuilder stringBuilder0 = new StringBuilder((v + 1) * v1);
        for(int v2 = 0; v2 < v1; ++v2) {
            arr_b = this.b(v2, arr_b);
            for(int v3 = 0; v3 < v; ++v3) {
                int v4 = arr_b[v3] & 0xFF;
                if(v4 < 0x40) {
                    v5 = 35;
                }
                else if(v4 < 0x80) {
                    v5 = 43;
                }
                else {
                    v5 = v4 >= 0xC0 ? 0x20 : 46;
                }
                stringBuilder0.append(((char)v5));
            }
            stringBuilder0.append('\n');
        }
        return stringBuilder0.toString();
    }
}

