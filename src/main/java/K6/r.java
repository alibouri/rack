package K6;

import Bb.q;
import android.graphics.drawable.Drawable;
import android.text.method.PasswordTransformationMethod;
import android.widget.EditText;
import com.google.android.material.textfield.EndIconDelegate;
import com.google.android.material.textfield.TextInputLayout;

public final class r extends EndIconDelegate {
    public final k d;
    public final c e;
    public final d f;

    public r(TextInputLayout textInputLayout0) {
        super(textInputLayout0);
        this.d = new k(this, 1);
        this.e = new c(this, 1);
        this.f = new d(this, 2);
    }

    @Override  // com.google.android.material.textfield.EndIconDelegate
    public final void a() {
        Drawable drawable0 = q.v(this.b, 0x7F0800E4);  // drawable:design_password_eye
        TextInputLayout textInputLayout0 = this.a;
        textInputLayout0.setEndIconDrawable(drawable0);
        textInputLayout0.setEndIconContentDescription(textInputLayout0.getResources().getText(0x7F1202F3));  // string:password_toggle_content_description "Show password"
        textInputLayout0.setEndIconOnClickListener(new e(2, this));
        c c0 = this.e;
        textInputLayout0.c1.add(c0);
        if(textInputLayout0.f0 != null) {
            c0.a(textInputLayout0);
        }
        textInputLayout0.g1.add(this.f);
        EditText editText0 = textInputLayout0.getEditText();
        if(editText0 != null) {
            switch(editText0.getInputType()) {
                case 16: 
                case 0x80: 
                case 0x90: 
                case 0xE0: {
                    editText0.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    break;
                }
            }
        }
    }

    public static boolean d(r r0) {
        EditText editText0 = r0.a.getEditText();
        return editText0 != null && editText0.getTransformationMethod() instanceof PasswordTransformationMethod;
    }
}

