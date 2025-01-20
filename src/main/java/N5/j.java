package N5;

import F1.d;
import F1.f;
import S5.c;
import T0.b;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;
import s.J;

public abstract class j {
    public static final J a;
    public static Locale b;

    static {
        j.a = new J(0);
    }

    public static String a(Context context0) {
        try {
            b b0 = U5.b.a(context0);
            return b0.a.getPackageManager().getApplicationLabel(b0.a.getPackageManager().getApplicationInfo("com.wave.personal", 0)).toString();
        }
        catch(PackageManager.NameNotFoundException | NullPointerException unused_ex) {
            String s = context0.getApplicationInfo().name;
            return TextUtils.isEmpty(s) ? "com.wave.personal" : s;
        }
    }

    public static String b(Context context0, int v) {
        Resources resources0 = context0.getResources();
        String s = j.a(context0);
        switch(v) {
            case 1: {
                return resources0.getString(0x7F1200CB, new Object[]{s});  // string:common_google_play_services_install_text "%1$s won\'t run without Google 
                                                                           // Play services, which are missing from your device."
            }
            case 2: {
                return c.f(context0) ? "New version of Google Play services needed. It will update itself shortly." : resources0.getString(0x7F1200D2, new Object[]{s});  // string:common_google_play_services_update_text "%1$s won\'t run unless you update 
                                                                                                                                                                          // Google Play services."
            }
            case 3: {
                return resources0.getString(0x7F1200C8, new Object[]{s});  // string:common_google_play_services_enable_text "%1$s won\'t work unless you enable 
                                                                           // Google Play services."
            }
            case 5: {
                return j.d(context0, "common_google_play_services_invalid_account_text", s);
            }
            case 7: {
                return j.d(context0, "common_google_play_services_network_error_text", s);
            }
            case 9: {
                return resources0.getString(0x7F1200D0, new Object[]{s});  // string:common_google_play_services_unsupported_text "%1$s won\'t run without Google 
                                                                           // Play services, which are not supported by your device."
            }
            case 16: {
                return j.d(context0, "common_google_play_services_api_unavailable_text", s);
            }
            case 17: {
                return j.d(context0, "common_google_play_services_sign_in_failed_text", s);
            }
            case 18: {
                return resources0.getString(0x7F1200D4, new Object[]{s});  // string:common_google_play_services_updating_text "%1$s won\'t run without Google 
                                                                           // Play services, which are currently updating."
            }
            case 20: {
                return j.d(context0, "common_google_play_services_restricted_profile_text", s);
            }
            default: {
                return resources0.getString(0x7F1200CF, new Object[]{s});  // string:common_google_play_services_unknown_issue "%1$s is having trouble with Google 
                                                                           // Play services. Please try again."
            }
        }
    }

    public static String c(Context context0, int v) {
        context0.getResources();
        switch(v) {
            case 1: {
                return "Get Google Play services";
            }
            case 2: {
                return "Update Google Play services";
            }
            case 3: {
                return "Enable Google Play services";
            }
            case 5: {
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return j.e(context0, "common_google_play_services_invalid_account_title");
            }
            case 7: {
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return j.e(context0, "common_google_play_services_network_error_title");
            }
            case 8: {
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            }
            case 9: {
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            }
            case 10: {
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            }
            case 11: {
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            }
            case 16: {
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            }
            case 17: {
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return j.e(context0, "common_google_play_services_sign_in_failed_title");
            }
            case 4: 
            case 6: 
            case 18: {
                return null;
            }
            case 20: {
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return j.e(context0, "common_google_play_services_restricted_profile_title");
            }
            default: {
                Log.e("GoogleApiAvailability", "Unexpected error code " + v);
                return null;
            }
        }
    }

    public static String d(Context context0, String s, String s1) {
        Resources resources0 = context0.getResources();
        String s2 = j.e(context0, s);
        if(s2 == null) {
            s2 = "%1$s is having trouble with Google Play services. Please try again.";
        }
        return String.format(resources0.getConfiguration().locale, s2, s1);
    }

    public static String e(Context context0, String s) {
        Resources resources0;
        J j0 = j.a;
        synchronized(j0) {
            Configuration configuration0 = context0.getResources().getConfiguration();
            Locale locale0 = (Build.VERSION.SDK_INT < 24 ? f.a(new Locale[]{configuration0.locale}) : new f(new F1.j(d.f(configuration0)))).a.get(0);
            if(!locale0.equals(j.b)) {
                j0.clear();
                j.b = locale0;
            }
            String s1 = (String)j0.get(s);
            if(s1 != null) {
                return s1;
            }
            try {
                resources0 = null;
                resources0 = context0.getPackageManager().getResourcesForApplication("com.google.android.gms");
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
            }
            if(resources0 == null) {
                return null;
            }
            int v1 = resources0.getIdentifier(s, "string", "com.google.android.gms");
            if(v1 == 0) {
                Log.w("GoogleApiAvailability", "Missing resource: " + s);
                return null;
            }
            String s2 = resources0.getString(v1);
            if(TextUtils.isEmpty(s2)) {
                Log.w("GoogleApiAvailability", "Got empty resource: " + s);
                return null;
            }
            j.a.put(s, s2);
            return s2;
        }
    }
}

