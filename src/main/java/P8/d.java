package P8;

public enum d {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);

    public final int[] X;
    public final int Y;

    public d(int[] arr_v, int v1) {
        this.X = arr_v;
        this.Y = v1;
    }

    public final int a(f f0) {
        int v = f0.a;
        if(v <= 9) {
            return this.X[0];
        }
        return v > 26 ? this.X[2] : this.X[1];
    }
}

