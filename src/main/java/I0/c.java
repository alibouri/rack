package i0;

import Zb.b;
import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;

public final class c extends Fb.c {
    public AndroidContentCaptureManager b0;
    public b c0;
    public Object d0;
    public final AndroidContentCaptureManager e0;
    public int f0;

    public c(AndroidContentCaptureManager androidContentCaptureManager0, Fb.c c0) {
        this.e0 = androidContentCaptureManager0;
        super(c0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.d0 = object0;
        this.f0 |= 0x80000000;
        return this.e0.a(this);
    }
}

