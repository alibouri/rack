package J1;

import B3.d;
import I5.h;
import U5.a;
import android.view.View;
import android.view.Window;

public class r0 extends a {
    public final Window c;
    public final h d;

    public r0(Window window0, h h0) {
        this.c = window0;
        this.d = h0;
    }

    @Override  // U5.a
    public final boolean F() {
        return (this.c.getDecorView().getSystemUiVisibility() & 0x2000) != 0;
    }

    @Override  // U5.a
    public final void S(boolean z) {
        if(z) {
            this.c.clearFlags(0x4000000);
            this.c.addFlags(0x80000000);
            View view0 = this.c.getDecorView();
            view0.setSystemUiVisibility(0x2000 | view0.getSystemUiVisibility());
            return;
        }
        this.a0(0x2000);
    }

    @Override  // U5.a
    public final void T() {
        int v = 8;
        ((d)this.d.Y).F();
        while(true) {
            v <<= 1;
            if(v > 0x100) {
                break;
            }
            if((8 & v) != 0) {
                if(v != 1) {
                    switch(v) {
                        case 2: {
                            this.a0(2);
                            continue;
                        }
                        case 8: {
                            ((d)this.d.Y).F();
                            continue;
                        }
                        default: {
                            continue;
                        }
                    }
                }
                this.a0(4);
                this.c.clearFlags(0x400);
            }
        }
    }

    public final void a0(int v) {
        View view0 = this.c.getDecorView();
        view0.setSystemUiVisibility(~v & view0.getSystemUiVisibility());
    }
}

