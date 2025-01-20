package N5;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.LifecycleFragment;

public final class k implements DialogInterface.OnClickListener {
    public final int X;
    public final Intent Y;
    public final Object Z;

    public k(Intent intent0, Object object0, int v) {
        this.X = v;
        this.Y = intent0;
        this.Z = object0;
        super();
    }

    public final void a() {
        if(this.X != 0) {
            Intent intent0 = this.Y;
            if(intent0 != null) {
                ((LifecycleFragment)this.Z).startActivityForResult(intent0, 2);
            }
            return;
        }
        Intent intent1 = this.Y;
        if(intent1 != null) {
            ((GoogleApiActivity)this.Z).startActivityForResult(intent1, 2);
        }
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        try {
            this.a();
        }
        catch(ActivityNotFoundException unused_ex) {
            String s = "Failed to start resolution intent.";
            if(Build.FINGERPRINT.contains("generic")) {
                s = "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.";
            }
            Log.e("DialogRedirect", s, activityNotFoundException0);
        }
        finally {
            dialogInterface0.dismiss();
        }
    }
}

