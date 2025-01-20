package b3;

import Ba.l;
import Ec.J;
import Ec.j;
import Ec.r;
import java.io.IOException;

public final class g extends r {
    public final l Y;
    public boolean Z;

    public g(J j0, l l0) {
        super(j0);
        this.Y = l0;
    }

    @Override  // Ec.r
    public final void close() {
        try {
            super.close();
        }
        catch(IOException iOException0) {
            this.Z = true;
            this.Y.n(iOException0);
        }
    }

    @Override  // Ec.r
    public final void flush() {
        try {
            super.flush();
        }
        catch(IOException iOException0) {
            this.Z = true;
            this.Y.n(iOException0);
        }
    }

    @Override  // Ec.r
    public final void write(j j0, long v) {
        if(this.Z) {
            j0.skip(v);
            return;
        }
        try {
            super.write(j0, v);
        }
        catch(IOException iOException0) {
            this.Z = true;
            this.Y.n(iOException0);
        }
    }
}

