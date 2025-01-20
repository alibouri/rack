package M4;

import E7.F;
import H6.e;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import com.facebook.Profile;
import i2.b;
import org.json.JSONException;
import org.json.JSONObject;

public final class z {
    public final b a;
    public final F b;
    public Profile c;
    public static final e d;
    public static volatile z e;

    static {
        z.d = new e(8);
    }

    public z(b b0, F f0) {
        this.a = b0;
        this.b = f0;
    }

    public final void a(Profile profile0, boolean z) {
        boolean z1;
        Profile profile1 = this.c;
        this.c = profile0;
        if(z) {
            SharedPreferences sharedPreferences0 = this.b.a;
            if(profile0 == null) {
                sharedPreferences0.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
            }
            else {
                JSONObject jSONObject0 = new JSONObject();
                try {
                    jSONObject0.put("id", profile0.X);
                    jSONObject0.put("first_name", profile0.Y);
                    jSONObject0.put("middle_name", profile0.Z);
                    jSONObject0.put("last_name", profile0.b0);
                    jSONObject0.put("name", profile0.c0);
                    Uri uri0 = profile0.d0;
                    if(uri0 != null) {
                        jSONObject0.put("link_uri", uri0.toString());
                    }
                    Uri uri1 = profile0.e0;
                    if(uri1 != null) {
                        jSONObject0.put("picture_uri", uri1.toString());
                    }
                }
                catch(JSONException unused_ex) {
                    jSONObject0 = null;
                }
                if(jSONObject0 != null) {
                    sharedPreferences0.edit().putString("com.facebook.ProfileManager.CachedProfile", jSONObject0.toString()).apply();
                }
            }
        }
        if(profile1 != null) {
            z1 = profile1.equals(profile0);
        }
        else if(profile0 == null) {
            z1 = true;
        }
        else {
            z1 = false;
        }
        if(!z1) {
            Intent intent0 = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
            intent0.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", profile1);
            intent0.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", profile0);
            this.a.c(intent0);
        }
    }
}

