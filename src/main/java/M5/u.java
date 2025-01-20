package M5;

import L5.f;
import L5.i;
import android.os.Message;

public final class u extends i {
    public final f b;

    public u(f f0) {
        this.b = f0;
    }

    public final I5.f b(I5.f f0) {
        this.b.getClass();
        f0.zak();
        this.b.j.getClass();
        y y0 = new y(new C(f0), this.b.j.i.get(), this.b);
        Message message0 = this.b.j.n.obtainMessage(4, y0);
        this.b.j.n.sendMessage(message0);
        return f0;
    }
}

