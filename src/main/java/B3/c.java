package b3;

import java.io.Closeable;

public final class c implements Closeable {
    public final b X;
    public boolean Y;
    public final f Z;

    public c(f f0, b b0) {
        this.Z = f0;
        this.X = b0;
    }

    @Override
    public final void close() {
        if(!this.Y) {
            this.Y = true;
            f f0 = this.Z;
            synchronized(f0) {
                b b0 = this.X;
                int v1 = b0.h - 1;
                b0.h = v1;
                if(v1 == 0 && b0.f) {
                    f0.F(b0);
                }
            }
        }
    }
}

