package com.google.android.gms.common;

import N5.r;
import android.app.AlertDialog.Builder;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface;
import androidx.fragment.app.DialogFragment;

public class SupportErrorDialogFragment extends DialogFragment {
    public AlertDialog n1;
    public DialogInterface.OnCancelListener o1;
    public AlertDialog p1;

    @Override  // androidx.fragment.app.DialogFragment
    public final Dialog V() {
        Dialog dialog0 = this.n1;
        if(dialog0 == null) {
            this.e1 = false;
            if(this.p1 == null) {
                Context context0 = this.n();
                r.j(context0);
                this.p1 = new AlertDialog.Builder(context0).create();
            }
            return this.p1;
        }
        return dialog0;
    }

    @Override  // androidx.fragment.app.DialogFragment
    public final void onCancel(DialogInterface dialogInterface0) {
        DialogInterface.OnCancelListener dialogInterface$OnCancelListener0 = this.o1;
        if(dialogInterface$OnCancelListener0 != null) {
            dialogInterface$OnCancelListener0.onCancel(dialogInterface0);
        }
    }
}

