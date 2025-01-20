package V4;

import M4.B;
import M4.l;
import R2.w;
import T4.h;
import U7.c;
import a5.m;
import a5.p;
import android.os.Bundle;
import android.util.Log;
import f5.a;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class j {
    public static final c a;

    static {
        j.a = new c(l.a(), 17);
    }

    public static final void a(String s, String s1, boolean z) {
        String s5;
        w w0;
        Nb.j.f(s1, "skuDetails");
        m m0 = p.b(l.b());
        if(m0 != null && B.c() && m0.e) {
            HashMap hashMap0 = new HashMap();
            try {
                JSONObject jSONObject0 = new JSONObject(s);
                JSONObject jSONObject1 = new JSONObject(s1);
                Bundle bundle0 = new Bundle(1);
                bundle0.putCharSequence("fb_iap_product_id", jSONObject0.getString("productId"));
                bundle0.putCharSequence("fb_iap_purchase_time", jSONObject0.getString("purchaseTime"));
                bundle0.putCharSequence("fb_iap_purchase_token", jSONObject0.getString("purchaseToken"));
                bundle0.putCharSequence("fb_iap_package_name", jSONObject0.optString("packageName"));
                bundle0.putCharSequence("fb_iap_product_title", jSONObject1.optString("title"));
                bundle0.putCharSequence("fb_iap_product_description", jSONObject1.optString("description"));
                String s2 = jSONObject1.optString("type");
                bundle0.putCharSequence("fb_iap_product_type", s2);
                if(Nb.j.a(s2, "subs")) {
                    bundle0.putCharSequence("fb_iap_subs_auto_renewing", Boolean.toString(jSONObject0.optBoolean("autoRenewing", false)));
                    bundle0.putCharSequence("fb_iap_subs_period", jSONObject1.optString("subscriptionPeriod"));
                    bundle0.putCharSequence("fb_free_trial_period", jSONObject1.optString("freeTrialPeriod"));
                    String s3 = jSONObject1.optString("introductoryPriceCycles");
                    Nb.j.e(s3, "introductoryPriceCycles");
                    if(s3.length() != 0) {
                        bundle0.putCharSequence("fb_intro_price_amount_micros", jSONObject1.optString("introductoryPriceAmountMicros"));
                        bundle0.putCharSequence("fb_intro_price_cycles", s3);
                    }
                }
                for(Object object0: hashMap0.entrySet()) {
                    bundle0.putCharSequence(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
                }
                BigDecimal bigDecimal0 = new BigDecimal(((double)jSONObject1.getLong("price_amount_micros")) / 1000000.0);
                Currency currency0 = Currency.getInstance(jSONObject1.getString("price_currency_code"));
                Nb.j.e(currency0, "getInstance(skuDetailsJSON.getString(\"price_currency_code\"))");
                w0 = new w('\u0000', 23);
                w0.Y = bigDecimal0;
                w0.Z = currency0;
                w0.b0 = bundle0;
            }
            catch(JSONException jSONException0) {
                Log.e("V4.j", "Error parsing in-app subscription data.", jSONException0);
                w0 = null;
            }
            if(w0 == null) {
                return;
            }
            Bundle bundle1 = (Bundle)w0.b0;
            Currency currency1 = (Currency)w0.Z;
            BigDecimal bigDecimal1 = (BigDecimal)w0.Y;
            c c0 = j.a;
            if(!z || !a5.l.b("app_events_if_auto_log_subs", l.b(), false)) {
                c0.getClass();
                if(B.c()) {
                    N4.m m2 = (N4.m)c0.Y;
                    m2.getClass();
                    if(!a.b(m2)) {
                        try {
                            m2.g(bigDecimal1, currency1, bundle1);
                        }
                        catch(Throwable throwable2) {
                            a.a(throwable2, m2);
                        }
                    }
                }
            }
            else {
                h h0 = h.a;
                if(a.b(h0)) {
                label_57:
                    s5 = "Subscribe";
                }
                else {
                    try {
                        String s4 = new JSONObject(s1).optString("freeTrialPeriod");
                        goto label_54;
                    }
                    catch(JSONException unused_ex) {
                        goto label_57;
                    }
                    catch(Throwable throwable0) {
                    }
                    a.a(throwable0, h0);
                    goto label_57;
                label_54:
                    if(s4 != null && s4.length() > 0) {
                        s5 = "StartTrial";
                        goto label_58;
                    }
                    goto label_57;
                }
            label_58:
                c0.getClass();
                if(B.c()) {
                    N4.m m1 = (N4.m)c0.Y;
                    m1.getClass();
                    if(!a.b(m1) && bigDecimal1 != null && currency1 != null) {
                        try {
                            if(bundle1 == null) {
                                bundle1 = new Bundle();
                            }
                            bundle1.putString("fb_currency", currency1.getCurrencyCode());
                            m1.f(s5, bigDecimal1.doubleValue(), bundle1, true, d.b());
                            return;
                        }
                        catch(Throwable throwable1) {
                        }
                        a.a(throwable1, m1);
                    }
                }
            }
        }
    }
}

