package r;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.biometric.FingerprintDialogFragment;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import o.e0;

public final class y implements Observer {
    public final int X;
    public final DialogFragment Y;

    public y(DialogFragment dialogFragment0, int v) {
        this.X = v;
        this.Y = dialogFragment0;
        super();
    }

    @Override  // androidx.lifecycle.Observer
    public final void b(Object object0) {
        switch(this.X) {
            case 0: {
                FingerprintDialogFragment fingerprintDialogFragment0 = (FingerprintDialogFragment)this.Y;
                e0 e00 = fingerprintDialogFragment0.o1;
                fingerprintDialogFragment0.n1.removeCallbacks(e00);
                int v = (int)(((Integer)object0));
                if(fingerprintDialogFragment0.s1 != null) {
                    int v1 = fingerprintDialogFragment0.p1.u0;
                    Context context0 = fingerprintDialogFragment0.n();
                    Drawable drawable0 = null;
                    if(context0 == null) {
                        Log.w("FingerprintFragment", "Unable to get asset. Context is null.");
                    }
                    else if(v1 == 0 && v == 1) {
                        drawable0 = context0.getDrawable(0x7F0800E8);  // drawable:fingerprint_dialog_fp_icon
                    }
                    else if(v1 == 1 && v == 2) {
                        drawable0 = context0.getDrawable(0x7F0800E7);  // drawable:fingerprint_dialog_error
                    }
                    else if(v1 == 2 && v == 1 || v1 == 1 && v == 3) {
                        drawable0 = context0.getDrawable(0x7F0800E8);  // drawable:fingerprint_dialog_fp_icon
                    }
                    if(drawable0 != null) {
                        fingerprintDialogFragment0.s1.setImageDrawable(drawable0);
                        if((v1 != 0 || v != 1) && (v1 == 1 && v == 2 || v1 == 2 && v == 1)) {
                            z.a(drawable0);
                        }
                        fingerprintDialogFragment0.p1.u0 = v;
                    }
                }
                int v2 = (int)(((Integer)object0));
                TextView textView0 = fingerprintDialogFragment0.t1;
                if(textView0 != null) {
                    textView0.setTextColor((v2 == 2 ? fingerprintDialogFragment0.q1 : fingerprintDialogFragment0.r1));
                }
                fingerprintDialogFragment0.n1.postDelayed(e00, 2000L);
                return;
            }
            case 1: {
                FingerprintDialogFragment fingerprintDialogFragment1 = (FingerprintDialogFragment)this.Y;
                e0 e01 = fingerprintDialogFragment1.o1;
                fingerprintDialogFragment1.n1.removeCallbacks(e01);
                TextView textView1 = fingerprintDialogFragment1.t1;
                if(textView1 != null) {
                    textView1.setText(((CharSequence)object0));
                }
                fingerprintDialogFragment1.n1.postDelayed(e01, 2000L);
                return;
            }
            default: {
                if(((LifecycleOwner)object0) != null) {
                    DialogFragment dialogFragment0 = this.Y;
                    if(dialogFragment0.e1) {
                        View view0 = dialogFragment0.Q();
                        if(view0.getParent() != null) {
                            throw new IllegalStateException("DialogFragment can not be attached to a container view");
                        }
                        if(dialogFragment0.i1 != null) {
                            if(Log.isLoggable("FragmentManager", 3)) {
                                Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + dialogFragment0.i1);
                            }
                            dialogFragment0.i1.setContentView(view0);
                        }
                    }
                }
            }
        }
    }
}

