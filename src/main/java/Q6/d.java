package Q6;

import V6.m;
import o6.i;

public final class d extends N6.d {
    public final m e;
    public final i f;
    public final e g;

    public d(e e0, i i0) {
        this.g = e0;
        super(2);
        this.attachInterface(this, "com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
        this.e = new m("OnRequestIntegrityTokenCallback");
        this.f = i0;
    }
}

