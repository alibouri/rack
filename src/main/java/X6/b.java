package x6;

import K1.c;
import K1.d;
import Q1.a;
import android.content.Context;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;

public final class b extends a {
    public final Chip q;

    public b(Chip chip0, Chip chip1) {
        this.q = chip0;
        super(chip1);
    }

    @Override  // Q1.a
    public final void m(ArrayList arrayList0) {
        boolean z = false;
        arrayList0.add(0);
        Chip chip0 = this.q;
        if(chip0.d()) {
            if(chip0.f0 != null && chip0.f0.I0) {
                z = true;
            }
            if(z && chip0.i0 != null) {
                arrayList0.add(1);
            }
        }
    }

    @Override  // Q1.a
    public final void p(int v, d d0) {
        AccessibilityNodeInfo accessibilityNodeInfo0 = d0.a;
        CharSequence charSequence0 = "";
        if(v == 1) {
            Chip chip0 = this.q;
            CharSequence charSequence1 = chip0.getCloseIconContentDescription();
            if(charSequence1 == null) {
                CharSequence charSequence2 = chip0.getText();
                Context context0 = chip0.getContext();
                if(!TextUtils.isEmpty(charSequence2)) {
                    charSequence0 = charSequence2;
                }
                accessibilityNodeInfo0.setContentDescription(context0.getString(0x7F120291, new Object[]{charSequence0}).trim());  // string:mtrl_chip_close_icon_content_description "Remove %1$s"
            }
            else {
                accessibilityNodeInfo0.setContentDescription(charSequence1);
            }
            accessibilityNodeInfo0.setBoundsInParent(chip0.getCloseIconTouchBoundsInt());
            d0.b(c.e);
            accessibilityNodeInfo0.setEnabled(chip0.isEnabled());
            return;
        }
        accessibilityNodeInfo0.setContentDescription("");
        accessibilityNodeInfo0.setBoundsInParent(Chip.v0);
    }
}

