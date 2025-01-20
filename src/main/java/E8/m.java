package e8;

import java.io.IOException;
import java.io.StringWriter;
import l8.b;

public abstract class m {
    @Override
    public final String toString() {
        try {
            StringWriter stringWriter0 = new StringWriter();
            b b0 = new b(stringWriter0);
            b0.c0 = true;
            h.d(b0, this);
            return stringWriter0.toString();
        }
        catch(IOException iOException0) {
            throw new AssertionError(iOException0);
        }
    }
}

