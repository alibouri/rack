package J1;

import android.view.WindowInsetsAnimation;

public final class c0 extends d0 {
    public final WindowInsetsAnimation d;

    public c0(WindowInsetsAnimation windowInsetsAnimation0) {
        super(null, 0L);
        this.d = windowInsetsAnimation0;
    }

    @Override  // J1.d0
    public final long a() {
        return this.d.getDurationMillis();
    }

    @Override  // J1.d0
    public final float b() {
        return this.d.getInterpolatedFraction();
    }

    @Override  // J1.d0
    public final void c(float f) {
        this.d.setFraction(f);
    }
}

