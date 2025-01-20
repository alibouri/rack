package m9;

public final class j implements Comparable {
    public String X;
    public byte[] Y;
    public boolean Z;
    public long b0;
    public long c0;

    @Override
    public final int compareTo(Object object0) {
        byte[] arr_b1;
        byte[] arr_b = ((j)object0).Y;
        for(int v = 0; true; ++v) {
            arr_b1 = this.Y;
            if(v >= arr_b1.length || v >= arr_b.length) {
                break;
            }
            int v1 = arr_b1[v] & 0xFF;
            int v2 = arr_b[v] & 0xFF;
            if(v1 != v2) {
                return v1 - v2;
            }
        }
        return arr_b1.length - arr_b.length;
    }
}

