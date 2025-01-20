package K6;

import android.widget.EditText;
import com.google.android.material.textfield.EndIconDelegate;
import com.google.android.material.textfield.TextInputLayout;

public final class c implements t {
    public final int a;
    public final EndIconDelegate b;

    public c(EndIconDelegate endIconDelegate0, int v) {
        this.a = v;
        this.b = endIconDelegate0;
        super();
    }

    @Override  // K6.t
    public final void a(TextInputLayout textInputLayout0) {
        if(this.a != 0) {
            EditText editText0 = textInputLayout0.getEditText();
            textInputLayout0.setEndIconVisible(true);
            textInputLayout0.setEndIconCheckable(true);
            boolean z = r.d(((r)this.b));
            ((r)this.b).c.setChecked(((boolean)(true ^ z)));
            editText0.removeTextChangedListener(((r)this.b).d);
            editText0.addTextChangedListener(((r)this.b).d);
            return;
        }
        EditText editText1 = textInputLayout0.getEditText();
        textInputLayout0.setEndIconVisible(editText1.hasFocus() && editText1.getText().length() > 0);
        textInputLayout0.setEndIconCheckable(false);
        editText1.setOnFocusChangeListener(((h)this.b).e);
        editText1.removeTextChangedListener(((h)this.b).d);
        editText1.addTextChangedListener(((h)this.b).d);
    }
}

