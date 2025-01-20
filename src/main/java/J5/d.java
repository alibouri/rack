package J5;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzd;
import java.util.Objects;
import java.util.regex.Matcher;
import s.J;

public final class d extends a6.d {
    public final a a;

    public d(a a0, Looper looper0) {
        this.a = a0;
        super(looper0);
        Looper.getMainLooper();
    }

    @Override  // android.os.Handler
    public final void handleMessage(Message message0) {
        a a0 = this.a;
        if(message0 == null) {
            Log.w("Rpc", "Dropping invalid message");
        }
        else {
            Object object0 = message0.obj;
            if(!(object0 instanceof Intent)) {
                Log.w("Rpc", "Dropping invalid message");
                return;
            }
            ((Intent)object0).setExtrasClassLoader(new e());
            if(((Intent)object0).hasExtra("google.messenger")) {
                Parcelable parcelable0 = ((Intent)object0).getParcelableExtra("google.messenger");
                if(parcelable0 instanceof zzd) {
                    a0.g = (zzd)parcelable0;
                }
                if(parcelable0 instanceof Messenger) {
                    a0.f = (Messenger)parcelable0;
                }
            }
            Intent intent0 = (Intent)message0.obj;
            String s = intent0.getAction();
            if(Objects.equals(s, "com.google.android.c2dm.intent.REGISTRATION")) {
                String s1 = intent0.getStringExtra("registration_id");
                if(s1 == null) {
                    s1 = intent0.getStringExtra("unregistered");
                }
                if(s1 == null) {
                    String s2 = intent0.getStringExtra("error");
                    if(s2 == null) {
                        Log.w("Rpc", "Unexpected response, no error or registration id " + intent0.getExtras());
                        return;
                    }
                    if(Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", "Received InstanceID error " + s2);
                    }
                    if(s2.startsWith("|")) {
                        String[] arr_s = s2.split("\\|");
                        if(arr_s.length > 2 && Objects.equals(arr_s[1], "ID")) {
                            String s3 = arr_s[2];
                            String s4 = arr_s[3];
                            if(s4.startsWith(":")) {
                                s4 = s4.substring(1);
                            }
                            a0.d(s3, intent0.putExtra("error", s4).getExtras());
                            return;
                        }
                        Log.w("Rpc", "Unexpected structured response " + s2);
                        return;
                    }
                    synchronized(a0.a) {
                        for(int v1 = 0; true; ++v1) {
                            J j1 = a0.a;
                            if(v1 >= j1.Z) {
                                break;
                            }
                            a0.d(((String)j1.e(v1)), intent0.getExtras());
                        }
                    }
                    return;
                }
                Matcher matcher0 = a.j.matcher(s1);
                if(matcher0.matches()) {
                    String s5 = matcher0.group(1);
                    String s6 = matcher0.group(2);
                    if(s5 != null) {
                        Bundle bundle0 = intent0.getExtras();
                        bundle0.putString("registration_id", s6);
                        a0.d(s5, bundle0);
                    }
                }
                else if(Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Unexpected response string: " + s1);
                }
            }
            else if(Log.isLoggable("Rpc", 3)) {
                Log.d("Rpc", "Unexpected response action: " + s);
            }
        }
    }
}

