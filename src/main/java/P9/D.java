package p9;

import Ab.k;
import Ea.r;
import Fb.c;
import Nb.w;
import R2.h;
import W5.f;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import com.google.android.material.textfield.TextInputEditText;
import java.util.ArrayList;
import kotlin.coroutines.g;
import n.j;
import n.s;
import q9.K0;
import q9.V0;
import q9.j3;
import q9.o0;
import q9.r1;
import z6.b;

public final class d extends j3 implements P {
    public final e b;

    public d(e e0) {
        this.b = e0;
        super(e0);
    }

    @Override  // p9.P
    public final Object G(g g0) {
        TextInputEditText textInputEditText1;
        a a0;
        if(g0 instanceof a) {
            a0 = (a)g0;
            int v = a0.e0;
            if((v & 0x80000000) == 0) {
                a0 = new a(this, ((c)g0));
            }
            else {
                a0.e0 = v ^ 0x80000000;
            }
        }
        else {
            a0 = new a(this, ((c)g0));
        }
        Object object0 = a0.c0;
        Object object1 = Eb.a.X;
        switch(a0.e0) {
            case 0: {
                f.b0(object0);
                View view0 = LayoutInflater.from(this.b).inflate(0x7F0D004E, null);  // layout:dialog_bill_favorite_custom_label
                b b0 = new b(this.b);
                b0.a.s = view0;
                TextInputEditText textInputEditText0 = (TextInputEditText)view0.findViewById(0x7F0A018B);  // id:input
                w w0 = new w();  // initializer: Ljava/lang/Object;-><init>()V
                textInputEditText0.addTextChangedListener(new K6.a(w0));
                String s = r1.d(0x7F1202DC, new Object[0]);  // string:ok "OK"
                String s1 = r1.d(0x7F120091, new Object[0]);  // string:cancel "Cancel"
                r r0 = new r(w0, textInputEditText0);
                a0.b0 = textInputEditText0;
                a0.e0 = 1;
                Object object2 = o0.Y(b0, s, s1, null, r0, a0, 4);
                if(object2 == object1) {
                    return object1;
                }
                textInputEditText1 = textInputEditText0;
                object0 = object2;
                break;
            }
            case 1: {
                textInputEditText1 = a0.b0;
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        String s2 = String.valueOf(textInputEditText1.getText());
        return new k(((Integer)((k)object0).Y), s2);
    }

    @Override  // p9.P
    public final Object z(View view0, ArrayList arrayList0, g g0) {
        p9.c c0;
        if(g0 instanceof p9.c) {
            c0 = (p9.c)g0;
            int v = c0.d0;
            if((v & 0x80000000) == 0) {
                c0 = new p9.c(this, ((c)g0));
            }
            else {
                c0.d0 = v ^ 0x80000000;
            }
        }
        else {
            c0 = new p9.c(this, ((c)g0));
        }
        Object object0 = c0.b0;
        Object object1 = Eb.a.X;
        switch(c0.d0) {
            case 0: {
                f.b0(object0);
                Context context0 = view0.getContext();
                h h0 = new h();  // initializer: Ljava/lang/Object;-><init>()V
                j j0 = new j(context0);
                h0.a = j0;
                j0.e = new g3.b(11, h0);
                s s0 = new s(0x7F040342, context0, view0, j0, false);  // attr:popupMenuStyle
                h0.b = s0;
                s0.f = 0x30;
                s0.j = new n.r(1, h0);
                for(Object object2: arrayList0) {
                    ((j)h0.a).a(0, 0, 0, ((String)object2));
                }
                c0.d0 = 1;
                kotlin.coroutines.k k0 = new kotlin.coroutines.k(N4.j.w(c0));
                V0 v00 = new V0(k0);
                h0.c = new K0(v00);
                h0.d = new K0(v00);
                s s1 = (s)h0.b;
                if(!s1.b()) {
                    if(s1.e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    s1.d(0, 0, false, false);
                }
                object0 = k0.c();
                if(object0 == object1) {
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
        if(((MenuItem)object0) != null) {
            CharSequence charSequence0 = ((MenuItem)object0).getTitle();
            if(charSequence0 != null) {
                return charSequence0.toString();
            }
        }
        return null;
    }
}

