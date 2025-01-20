package K6;

import android.widget.AutoCompleteTextView.OnDismissListener;
import com.google.android.material.textfield.c;

public final class m implements AutoCompleteTextView.OnDismissListener {
    public final c a;

    public m(c c0) {
        this.a = c0;
    }

    @Override  // android.widget.AutoCompleteTextView$OnDismissListener
    public final void onDismiss() {
        this.a.i = true;
        this.a.k = System.currentTimeMillis();
        this.a.g(false);
    }
}

