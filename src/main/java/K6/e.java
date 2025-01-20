package K6;

import Bb.z;
import android.content.res.TypedArray;
import android.os.Message;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import androidx.appcompat.view.a;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.widget.Toolbar;
import androidx.preference.Preference;
import com.apollographql.apollo.api.b;
import com.google.android.material.datepicker.j;
import com.google.android.material.datepicker.k;
import com.google.android.material.textfield.c;
import java.util.Map;
import o.G0;
import o9.J1;
import p9.m;
import p9.u;

public final class e implements View.OnClickListener {
    public final int X;
    public Object Y;

    public e(int v) {
        this.X = v;
        super();
    }

    public e(int v, Object object0) {
        this.X = v;
        this.Y = object0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        MenuItemImpl menuItemImpl0 = null;
        switch(this.X) {
            case 0: {
                h h0 = (h)this.Y;
                Editable editable0 = h0.a.getEditText().getText();
                if(editable0 != null) {
                    editable0.clear();
                }
                h0.a.k(h0.a.f1, h0.a.h1);
                return;
            }
            case 1: {
                c c0 = (c)this.Y;
                c.d(c0, ((AutoCompleteTextView)c0.a.getEditText()));
                return;
            }
            case 2: {
                r r0 = (r)this.Y;
                EditText editText0 = r0.a.getEditText();
                if(editText0 != null) {
                    int v = editText0.getSelectionEnd();
                    if(r.d(r0)) {
                        editText0.setTransformationMethod(null);
                    }
                    else {
                        editText0.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    }
                    if(v >= 0) {
                        editText0.setSelection(v);
                    }
                    r0.a.k(r0.a.f1, r0.a.h1);
                }
                return;
            }
            case 3: {
                j j0 = (j)this.Y;
                int v1 = j0.b1;
                if(v1 == 2) {
                    j0.V(1);
                    return;
                }
                if(v1 == 1) {
                    j0.V(2);
                }
                return;
            }
            case 4: {
                ((k)this.Y).getClass();
                throw null;
            }
            case 5: {
                i.e e1 = (i.e)this.Y;
                if(view0 == e1.i) {
                    Message message0 = e1.k;
                    if(message0 != null) {
                        menuItemImpl0 = Message.obtain(message0);
                        goto label_58;
                    }
                    goto label_49;
                }
                else {
                label_49:
                    if(view0 == e1.l) {
                        Message message1 = e1.n;
                        if(message1 != null) {
                            menuItemImpl0 = Message.obtain(message1);
                            goto label_58;
                        }
                        goto label_54;
                    }
                    else {
                    label_54:
                        if(view0 == e1.o) {
                            Message message2 = e1.q;
                            if(message2 != null) {
                                menuItemImpl0 = Message.obtain(message2);
                            }
                        }
                    }
                }
            label_58:
                if(menuItemImpl0 != null) {
                    ((Message)menuItemImpl0).sendToTarget();
                }
                e1.F.obtainMessage(1, e1.b).sendToTarget();
                return;
            }
            case 6: {
                u u0 = (u)this.Y;
                u0.getClass();
                Nb.j.f(view0, "anchor");
                m m0 = new m(u0, null);
                u0.e0.d(view0, z.X, m0);
                return;
            }
            case 7: {
                o9.m m1 = (o9.m)this.Y;
                m1.getClass();
                Nb.j.f(view0, "expected");
                m1.g0.invoke();
                return;
            }
            case 8: {
                J1 j10 = (J1)this.Y;
                j10.getClass();
                Nb.j.f(view0, "expected");
                Map map0 = b.t("question_label", j10.Z.c);
                j10.c0.d("selected security question dropdown", map0);
                return;
            }
            case 9: {
                ((Preference)this.Y).g(view0);
                return;
            }
            case 10: {
                ((a)this.Y).a();
                return;
            }
            case 11: {
                G0 g00 = ((Toolbar)this.Y).N0;
                if(g00 != null) {
                    menuItemImpl0 = g00.Y;
                }
                if(menuItemImpl0 != null) {
                    menuItemImpl0.collapseActionView();
                }
                return;
            }
            default: {
                u6.e e0 = (u6.e)this.Y;
                if(e0.h0 && e0.isShowing()) {
                    if(!e0.j0) {
                        TypedArray typedArray0 = e0.getContext().obtainStyledAttributes(new int[]{0x101035B});
                        e0.i0 = typedArray0.getBoolean(0, true);
                        typedArray0.recycle();
                        e0.j0 = true;
                    }
                    if(e0.i0) {
                        e0.cancel();
                    }
                }
            }
        }
    }
}

