package K6;

import com.google.android.material.textfield.TextInputLayout;

public final class s implements Runnable {
    public final int X;
    public final TextInputLayout Y;

    public s(TextInputLayout textInputLayout0, int v) {
        this.X = v;
        this.Y = textInputLayout0;
        super();
    }

    @Override
    public final void run() {
        if(this.X != 0) {
            this.Y.f0.requestLayout();
            return;
        }
        this.Y.f1.performClick();
        this.Y.f1.jumpDrawablesToCurrentState();
    }
}

