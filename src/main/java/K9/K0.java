package K9;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.G;
import Xb.Q;
import android.text.Editable;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.AppCompatEditText;
import com.sendwave.remit.util.CountryPhoneInputView;
import com.wave.components.sendmoney.SendMoneyEnterContactActivity;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class k0 extends j implements Function2 {
    public int c0;
    public final i d0;
    public final SendMoneyEnterContactActivity e0;

    public k0(i i0, SendMoneyEnterContactActivity sendMoneyEnterContactActivity0, g g0) {
        this.d0 = i0;
        this.e0 = sendMoneyEnterContactActivity0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((k0)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new k0(this.d0, this.e0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                this.c0 = 1;
                if(Q.b(200L, this) == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Class class0 = InputMethodManager.class;
        SendMoneyEnterContactActivity sendMoneyEnterContactActivity0 = this.e0;
        if(this.d0.g0) {
            L9.a a0 = sendMoneyEnterContactActivity0.G0;
            if(a0 != null) {
                CountryPhoneInputView countryPhoneInputView0 = a0.u;
                AppCompatEditText appCompatEditText0 = countryPhoneInputView0.h0;
                appCompatEditText0.requestFocus();
                Editable editable0 = appCompatEditText0.getText();
                if(editable0 != null) {
                    appCompatEditText0.setSelection(editable0.length());
                }
                InputMethodManager inputMethodManager0 = (InputMethodManager)countryPhoneInputView0.getContext().getSystemService(class0);
                if(inputMethodManager0 == null) {
                    return t.a;
                }
                inputMethodManager0.showSoftInput(appCompatEditText0, 1);
                return t.a;
            }
            Nb.j.p("binding");
            throw null;
        }
        L9.a a1 = sendMoneyEnterContactActivity0.G0;
        if(a1 != null) {
            a1.r.requestFocus();
            InputMethodManager inputMethodManager1 = (InputMethodManager)sendMoneyEnterContactActivity0.getSystemService(class0);
            if(inputMethodManager1 != null) {
                L9.a a2 = sendMoneyEnterContactActivity0.G0;
                if(a2 != null) {
                    inputMethodManager1.showSoftInput(a2.r, 1);
                    return t.a;
                }
                Nb.j.p("binding");
                throw null;
            }
            return t.a;
        }
        Nb.j.p("binding");
        throw null;
    }
}

