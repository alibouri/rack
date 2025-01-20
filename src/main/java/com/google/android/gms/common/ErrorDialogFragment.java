package com.google.android.gms.common;

import N5.r;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface;
import android.os.Bundle;

public class ErrorDialogFragment extends DialogFragment {
    public AlertDialog X;
    public DialogInterface.OnCancelListener Y;
    public AlertDialog Z;

    @Override  // android.app.DialogFragment
    public final void onCancel(DialogInterface dialogInterface0) {
        DialogInterface.OnCancelListener dialogInterface$OnCancelListener0 = this.Y;
        if(dialogInterface$OnCancelListener0 != null) {
            dialogInterface$OnCancelListener0.onCancel(dialogInterface0);
        }
    }

    @Override  // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle0) {
        Dialog dialog0 = this.X;
        if(dialog0 == null) {
            this.setShowsDialog(false);
            if(this.Z == null) {
                Activity activity0 = this.getActivity();
                r.j(activity0);
                this.Z = new AlertDialog.Builder(activity0).create();
            }
            return this.Z;
        }
        return dialog0;
    }
}

