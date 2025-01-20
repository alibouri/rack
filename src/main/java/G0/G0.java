package G0;

import U0.H;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.input.TextInputService;

public final class g0 implements SoftwareKeyboardController {
    public final TextInputService a;

    public g0(TextInputService textInputService0) {
        this.a = textInputService0;
    }

    @Override  // androidx.compose.ui.platform.SoftwareKeyboardController
    public final void a() {
        TextInputService textInputService0 = this.a;
        if(((H)textInputService0.b.get()) != null) {
            textInputService0.a.d();
        }
    }

    @Override  // androidx.compose.ui.platform.SoftwareKeyboardController
    public final void b() {
        this.a.a.e();
    }
}

