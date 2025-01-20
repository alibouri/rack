package W0;

import X1.f;
import Z1.c;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.lang.ref.WeakReference;

public final class e extends f {
    public final int a;
    public final Object b;
    public final Object c;

    public e(TextView textView0, c c0) {
        this.a = 1;
        super();
        this.b = new WeakReference(textView0);
        this.c = new WeakReference(c0);
    }

    public e(ParcelableSnapshotMutableState parcelableSnapshotMutableState0, B3.c c0) {
        this.a = 0;
        super();
        this.b = parcelableSnapshotMutableState0;
        this.c = c0;
    }

    @Override  // X1.f
    public void a() {
        if(this.a != 0) {
            return;
        }
        ((B3.c)this.c).Y = h.a;
    }

    @Override  // X1.f
    public final void b() {
        int v1;
        if(this.a != 0) {
            TextView textView0 = (TextView)((WeakReference)this.b).get();
            InputFilter inputFilter0 = (InputFilter)((WeakReference)this.c).get();
            if(inputFilter0 != null && textView0 != null) {
                InputFilter[] arr_inputFilter = textView0.getFilters();
                if(arr_inputFilter != null) {
                    for(int v = 0; v < arr_inputFilter.length; ++v) {
                        if(arr_inputFilter[v] == inputFilter0) {
                            if(!textView0.isAttachedToWindow()) {
                                break;
                            }
                            CharSequence charSequence0 = textView0.getText();
                            X1.h h0 = X1.h.a();
                            if(charSequence0 == null) {
                                v1 = 0;
                            }
                            else {
                                h0.getClass();
                                v1 = charSequence0.length();
                            }
                            CharSequence charSequence1 = h0.f(0, v1, 0, charSequence0);
                            if(charSequence0 == charSequence1) {
                                break;
                            }
                            int v2 = Selection.getSelectionStart(charSequence1);
                            int v3 = Selection.getSelectionEnd(charSequence1);
                            textView0.setText(charSequence1);
                            if(!(charSequence1 instanceof Spannable)) {
                                break;
                            }
                            if(v2 >= 0 && v3 >= 0) {
                                Selection.setSelection(((Spannable)charSequence1), v2, v3);
                                return;
                            }
                            if(v2 >= 0) {
                                Selection.setSelection(((Spannable)charSequence1), v2);
                                return;
                            }
                            if(v3 < 0) {
                                break;
                            }
                            Selection.setSelection(((Spannable)charSequence1), v3);
                            return;
                        }
                    }
                }
            }
            return;
        }
        ((ParcelableSnapshotMutableState)this.b).setValue(Boolean.TRUE);
        ((B3.c)this.c).Y = new i(true);
    }
}

