package J1;

import android.view.View;

public final class s0 extends r0 {
    @Override  // U5.a
    public final boolean E() {
        return (this.c.getDecorView().getSystemUiVisibility() & 16) != 0;
    }

    @Override  // U5.a
    public final void R(boolean z) {
        if(z) {
            this.c.clearFlags(0x8000000);
            this.c.addFlags(0x80000000);
            View view0 = this.c.getDecorView();
            view0.setSystemUiVisibility(16 | view0.getSystemUiVisibility());
            return;
        }
        this.a0(16);
    }
}

