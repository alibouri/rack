package K6;

import Y6.b;
import android.text.Editable;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import com.google.android.material.textfield.EndIconDelegate;
import com.google.android.material.textfield.c;

public final class k extends B6.k {
    public final int X;
    public final EndIconDelegate Y;

    public k(EndIconDelegate endIconDelegate0, int v) {
        this.X = v;
        this.Y = endIconDelegate0;
        super();
    }

    @Override  // B6.k
    public void afterTextChanged(Editable editable0) {
        if(this.X != 0) {
            return;
        }
        c c0 = (c)this.Y;
        EditText editText0 = c0.a.getEditText();
        if(!(editText0 instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        if(c0.n.isTouchExplorationEnabled() && c.f(((AutoCompleteTextView)editText0)) && !c0.c.hasFocus()) {
            ((AutoCompleteTextView)editText0).dismissDropDown();
        }
        ((AutoCompleteTextView)editText0).post(new b(8, this, ((AutoCompleteTextView)editText0), false));
    }

    @Override  // B6.k
    public void beforeTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
        if(this.X != 1) {
            return;
        }
        boolean z = r.d(((r)this.Y));
        ((r)this.Y).c.setChecked(!z);
    }
}

