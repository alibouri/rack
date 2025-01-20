package K6;

import com.google.android.material.textfield.EndIconDelegate;
import com.google.android.material.textfield.TextInputLayout;

public final class i extends EndIconDelegate {
    public final int d;

    public i(TextInputLayout textInputLayout0, int v) {
        this.d = v;
        super(textInputLayout0);
    }

    @Override  // com.google.android.material.textfield.EndIconDelegate
    public final void a() {
        if(this.d != 0) {
            this.a.setEndIconOnClickListener(null);
            this.a.setEndIconDrawable(null);
            this.a.setEndIconContentDescription(null);
            return;
        }
        this.a.setEndIconOnClickListener(null);
        this.a.setEndIconOnLongClickListener(null);
    }
}

