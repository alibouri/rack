package m2;

import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.content.DialogInterface;
import androidx.preference.MultiSelectListPreferenceDialogFragment;

public final class d implements DialogInterface.OnMultiChoiceClickListener {
    public final MultiSelectListPreferenceDialogFragment a;

    public d(MultiSelectListPreferenceDialogFragment multiSelectListPreferenceDialogFragment0) {
        this.a = multiSelectListPreferenceDialogFragment0;
    }

    @Override  // android.content.DialogInterface$OnMultiChoiceClickListener
    public final void onClick(DialogInterface dialogInterface0, int v, boolean z) {
        MultiSelectListPreferenceDialogFragment multiSelectListPreferenceDialogFragment0 = this.a;
        if(z) {
            boolean z1 = multiSelectListPreferenceDialogFragment0.h0;
            multiSelectListPreferenceDialogFragment0.h0 = multiSelectListPreferenceDialogFragment0.g0.add(multiSelectListPreferenceDialogFragment0.j0[v].toString()) | z1;
            return;
        }
        boolean z2 = multiSelectListPreferenceDialogFragment0.h0;
        multiSelectListPreferenceDialogFragment0.h0 = multiSelectListPreferenceDialogFragment0.g0.remove(multiSelectListPreferenceDialogFragment0.j0[v].toString()) | z2;
    }
}

