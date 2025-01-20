package l4;

import java.io.IOException;

public final class a extends IOException {
    public a(int v, long v1, int v2) {
        String s;
        if(v < 0) {
            s = String.format("Attempt to read from buffer using a negative index (%d)", v);
        }
        else if(v2 < 0) {
            s = String.format("Number of requested bytes cannot be negative (%d)", v2);
        }
        else {
            s = ((long)v) + ((long)v2) - 1L <= 0x7FFFFFFFL ? String.format("Attempt to read from beyond end of underlying data source (requested index: %d, requested count: %d, max index: %d)", v, v2, ((long)(v1 - 1L))) : String.format("Number of requested bytes summed with starting index exceed maximum range of signed 32 bit integers (requested index: %d, requested count: %d)", v, v2);
        }
        super(s);
    }
}

