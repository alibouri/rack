package a2;

import android.media.MediaDataSource;
import java.io.IOException;

public final class a extends MediaDataSource {
    public long X;
    public final f Y;

    public a(f f0) {
        this.Y = f0;
        super();
    }

    @Override
    public final void close() {
    }

    @Override  // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override  // android.media.MediaDataSource
    public final int readAt(long v, byte[] arr_b, int v1, int v2) {
        if(v2 == 0) {
            return 0;
        }
        if(Long.compare(v, 0L) < 0) {
            return -1;
        }
        try {
            long v3 = this.X;
            f f0 = this.Y;
            if(Long.compare(v3, v) != 0) {
                if(v3 >= 0L && v >= v3 + ((long)f0.X.available())) {
                    return -1;
                }
                f0.b(v);
                this.X = v;
            }
            if(v2 > f0.X.available()) {
                v2 = f0.X.available();
            }
            int v4 = f0.read(arr_b, v1, v2);
            if(v4 >= 0) {
                this.X += (long)v4;
                return v4;
            }
        }
        catch(IOException unused_ex) {
        }
        this.X = -1L;
        return -1;
    }
}

