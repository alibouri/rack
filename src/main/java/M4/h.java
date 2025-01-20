package M4;

import a5.j;
import java.util.Random;

public class h extends RuntimeException {
    public h(String s) {
        super(s);
        Random random0 = new Random();
        if(s != null && l.l.get() && random0.nextInt(100) > 50) {
            j.a(new g(s), a5.h.y0);
        }
    }

    @Override
    public String toString() {
        String s = this.getMessage();
        return s == null ? "" : s;
    }
}

