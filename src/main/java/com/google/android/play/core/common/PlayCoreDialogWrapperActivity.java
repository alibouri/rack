package com.google.android.play.core.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import android.os.ResultReceiver;

public class PlayCoreDialogWrapperActivity extends Activity {
    public ResultReceiver X;

    @Override  // android.app.Activity
    public final void onActivityResult(int v, int v1, Intent intent0) {
        super.onActivityResult(v, v1, intent0);
        if(v == 0) {
            ResultReceiver resultReceiver0 = this.X;
            if(resultReceiver0 != null) {
                switch(v1) {
                    case -1: {
                        resultReceiver0.send(1, new Bundle());
                        break;
                    }
                    case 0: {
                        resultReceiver0.send(2, new Bundle());
                    }
                }
            }
        }
        this.finish();
    }

    @Override  // android.app.Activity
    public final void onCreate(Bundle bundle0) {
        Intent intent1;
        int v = this.getIntent().getIntExtra("window_flags", 0);
        PendingIntent pendingIntent0 = null;
        if(v == 0) {
            intent1 = null;
        }
        else {
            this.getWindow().getDecorView().setSystemUiVisibility(v);
            Intent intent0 = new Intent();
            intent0.putExtra("window_flags", v);
            intent1 = intent0;
        }
        super.onCreate(bundle0);
        if(bundle0 == null) {
            this.X = (ResultReceiver)this.getIntent().getParcelableExtra("result_receiver");
            Bundle bundle1 = this.getIntent().getExtras();
            if(bundle1 != null) {
                pendingIntent0 = (PendingIntent)bundle1.get("confirmation_intent");
            }
            if(bundle1 != null && pendingIntent0 != null) {
                try {
                    this.startIntentSenderForResult(pendingIntent0.getIntentSender(), 0, intent1, 0, 0, 0);
                }
                catch(IntentSender.SendIntentException unused_ex) {
                    ResultReceiver resultReceiver0 = this.X;
                    if(resultReceiver0 != null) {
                        resultReceiver0.send(3, new Bundle());
                    }
                    this.finish();
                }
                return;
            }
            ResultReceiver resultReceiver1 = this.X;
            if(resultReceiver1 != null) {
                resultReceiver1.send(3, new Bundle());
            }
            this.finish();
            return;
        }
        this.X = (ResultReceiver)bundle0.getParcelable("result_receiver");
    }

    @Override  // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle0) {
        bundle0.putParcelable("result_receiver", this.X);
    }
}

