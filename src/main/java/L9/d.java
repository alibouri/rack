package l9;

import Fb.c;
import com.sendwave.photo.UploadWorker;

public final class d extends c {
    public Object b0;
    public final UploadWorker c0;
    public int d0;

    public d(UploadWorker uploadWorker0, c c0) {
        this.c0 = uploadWorker0;
        super(c0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.b0 = object0;
        this.d0 |= 0x80000000;
        return this.c0.c(this);
    }
}

