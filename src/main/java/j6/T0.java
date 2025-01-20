package j6;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.text.TextUtils;
import io.sentry.hints.i;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import jeb.synthetic.TWR;
import m5.b;

public abstract class t0 {
    public static final String[] a;
    public static final String[] b;
    public static final String[] c;
    public static final String[] d;
    public static final String[] e;
    public static final String[] f;
    public static final String[] g;
    public static final String[] h;
    public static final String[] i;
    public static final String[] j;
    public static i k;

    static {
        t0.a = new String[]{"ad_activeview", "ad_click", "ad_exposure", "ad_query", "ad_reward", "adunit_exposure", "app_clear_data", "app_exception", "app_remove", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "app_upgrade", "app_update", "ga_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "session_start_with_rollout", "user_engagement", "ad_impression", "screen_view", "ga_extra_parameter", "app_background", "firebase_campaign"};
        t0.b = new String[]{"ad_impression"};
        t0.c = new String[]{"_aa", "_ac", "_xa", "_aq", "_ar", "_xu", "_cd", "_ae", "_ui", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "_ug", "_au", "_cmp", "_err", "_f", "_v", "_iap", "_nd", "_nf", "_no", "_nr", "_ou", "_s", "_ssr", "_e", "_ai", "_vs", "_ep", "_ab", "_cmp"};
        t0.d = new String[]{"purchase", "refund", "add_payment_info", "add_shipping_info", "add_to_cart", "add_to_wishlist", "begin_checkout", "remove_from_cart", "select_item", "select_promotion", "view_cart", "view_item", "view_item_list", "view_promotion", "ecommerce_purchase", "purchase_refund", "set_checkout_option", "checkout_progress", "select_content", "view_search_results"};
        t0.e = new String[]{"firebase_last_notification", "first_open_time", "first_visit_time", "last_deep_link_referrer", "user_id", "last_advertising_id_reset", "first_open_after_install", "lifetime_user_engagement", "session_user_engagement", "non_personalized_ads", "ga_session_number", "ga_session_id", "last_gclid", "session_number", "session_id"};
        t0.f = new String[]{"_ln", "_fot", "_fvt", "_ldl", "_id", "_lair", "_fi", "_lte", "_se", "_npa", "_sno", "_sid", "_lgclid", "_sno", "_sid"};
        t0.g = new String[]{"ga_conversion", "engagement_time_msec", "exposure_time", "ad_event_id", "ad_unit_id", "ga_error", "ga_error_value", "ga_error_length", "ga_event_origin", "ga_screen", "ga_screen_class", "ga_screen_id", "ga_previous_screen", "ga_previous_class", "ga_previous_id", "manual_tracking", "message_device_time", "message_id", "message_name", "message_time", "message_tracking_id", "message_type", "previous_app_version", "previous_os_version", "topic", "update_with_analytics", "previous_first_open_count", "system_app", "system_app_update", "previous_install_count", "ga_event_id", "ga_extra_params_ct", "ga_group_name", "ga_list_length", "ga_index", "ga_event_name", "campaign_info_source", "cached_campaign", "deferred_analytics_collection", "ga_session_number", "ga_session_id", "campaign_extra_referrer", "app_in_background", "firebase_feature_rollouts", "firebase_conversion", "firebase_error", "firebase_error_value", "firebase_error_length", "firebase_event_origin", "firebase_screen", "firebase_screen_class", "firebase_screen_id", "firebase_previous_screen", "firebase_previous_class", "firebase_previous_id", "session_number", "session_id"};
        t0.h = new String[]{"_c", "_et", "_xt", "_aeid", "_ai", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_mst", "_ndt", "_nmid", "_nmn", "_nmt", "_nmtid", "_nmc", "_pv", "_po", "_nt", "_uwa", "_pfo", "_sys", "_sysu", "_pin", "_eid", "_epc", "_gn", "_ll", "_i", "_en", "_cis", "_cc", "_dac", "_sno", "_sid", "_cer", "_aib", "_ffr", "_c", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_sno", "_sid"};
        t0.i = new String[]{"items"};
        t0.j = new String[]{"affiliation", "coupon", "creative_name", "creative_slot", "currency", "discount", "index", "item_id", "item_brand", "item_category", "item_category2", "item_category3", "item_category4", "item_category5", "item_list_name", "item_list_id", "item_name", "item_variant", "location_id", "payment_type", "price", "promotion_id", "promotion_name", "quantity", "shipping", "shipping_tier", "tax", "transaction_id", "value", "item_list", "checkout_step", "checkout_option", "item_location_id"};
    }

    public static Object a(Bundle bundle0, String s, Class class0, Object object0) {
        Object object1 = bundle0.get(s);
        if(object1 == null) {
            return object0;
        }
        if(class0.isAssignableFrom(object1.getClass())) {
            return object1;
        }
        String s1 = object1.getClass().getCanonicalName();
        StringBuilder stringBuilder0 = new StringBuilder("Invalid conditional user property field type. \'");
        stringBuilder0.append(s);
        stringBuilder0.append("\' expected [");
        stringBuilder0.append(class0.getCanonicalName());
        stringBuilder0.append("] but was [");
        throw new IllegalStateException(b.y(stringBuilder0, s1, "]"));
    }

    public static String b(Context context0) {
        try {
            return context0.getResources().getResourcePackageName(0x7F1200CF);  // string:common_google_play_services_unknown_issue "%1$s is having trouble with Google 
                                                                                // Play services. Please try again."
        }
        catch(Resources.NotFoundException unused_ex) {
            return "com.wave.personal";
        }
    }

    public static String c(String s, String[] arr_s, String[] arr_s1) {
        boolean z;
        int v = Math.min(arr_s.length, arr_s1.length);
        for(int v1 = 0; v1 < v; ++v1) {
            String s1 = arr_s[v1];
            if(s != null || s1 != null) {
                z = s == null ? false : s.equals(s1);
            }
            else {
                z = true;
            }
            if(z) {
                return arr_s1[v1];
            }
        }
        return null;
    }

    public static HashSet d(SQLiteDatabase sQLiteDatabase0, String s) {
        try {
            HashSet hashSet0 = new HashSet();
            try(Cursor cursor0 = sQLiteDatabase0.rawQuery("SELECT * FROM " + s + " LIMIT 0", null)) {
                Collections.addAll(hashSet0, cursor0.getColumnNames());
            }
            return hashSet0;
        }
        catch(Throwable throwable0) {
            throw throwable0;
        }
    }

    public static void e(Bundle bundle0, Object object0) {
        if(object0 instanceof Double) {
            bundle0.putDouble("value", ((double)(((Double)object0))));
            return;
        }
        if(object0 instanceof Long) {
            bundle0.putLong("value", ((long)(((Long)object0))));
            return;
        }
        bundle0.putString("value", object0.toString());
    }

    public static void f(L l0, SQLiteDatabase sQLiteDatabase0) {
        File file0 = new File(sQLiteDatabase0.getPath());
        boolean z = file0.setReadable(false, false);
        N n0 = l0.h0;
        if(!z) {
            n0.d("Failed to turn off database read permission");
        }
        if(!file0.setWritable(false, false)) {
            n0.d("Failed to turn off database write permission");
        }
        if(!file0.setReadable(true, true)) {
            n0.d("Failed to turn on database read permission for owner");
        }
        if(!file0.setWritable(true, true)) {
            n0.d("Failed to turn on database write permission for owner");
        }
    }

    public static void g(L l0, SQLiteDatabase sQLiteDatabase0, String s, String s1, String s2, String[] arr_s) {
        boolean z;
        Cursor cursor0;
        N n0;
        try {
            try {
                n0 = l0.h0;
                cursor0 = null;
                cursor0 = sQLiteDatabase0.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{s}, null, null, null);
                z = cursor0.moveToFirst();
                goto label_15;
            }
            catch(SQLiteException sQLiteException0) {
            }
            n0.c(s, "Error querying for table", sQLiteException0);
            if(cursor0 != null) {
                goto label_9;
            }
            goto label_10;
        }
        catch(Throwable throwable0) {
            goto label_13;
        }
    label_9:
        cursor0.close();
    label_10:
        z = false;
        goto label_16;
    label_13:
        TWR.safeClose$NT(cursor0, throwable0);
        throw throwable0;
    label_15:
        cursor0.close();
    label_16:
        if(!z) {
            sQLiteDatabase0.execSQL(s1);
        }
        try {
            HashSet hashSet0 = t0.d(sQLiteDatabase0, s);
            String[] arr_s1 = s2.split(",");
            for(int v1 = 0; v1 < arr_s1.length; ++v1) {
                String s3 = arr_s1[v1];
                if(!hashSet0.remove(s3)) {
                    throw new SQLiteException("Table " + s + " is missing required column: " + s3);
                }
            }
            if(arr_s != null) {
                for(int v = 0; v < arr_s.length; v += 2) {
                    if(!hashSet0.remove(arr_s[v])) {
                        sQLiteDatabase0.execSQL(arr_s[v + 1]);
                    }
                }
            }
            if(!hashSet0.isEmpty()) {
                n0.c(s, "Table has extra columns. table, columns", TextUtils.join(", ", hashSet0));
            }
            return;
        }
        catch(SQLiteException sQLiteException1) {
        }
        l0.e0.b(s, "Failed to verify columns on table that was just created");
        throw sQLiteException1;
    }
}

