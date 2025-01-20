package J8;

import r8.e;

public final class i extends j {
    public final int b;
    public final int c;

    public i(int v, int v1, int v2) {
        super(v);
        if(v1 < 0 || v1 > 10 || v2 < 0 || v2 > 10) {
            throw e.a();
        }
        this.b = v1;
        this.c = v2;
    }
}

