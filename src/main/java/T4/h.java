package T4;

import M4.l;
import Nb.j;
import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import f5.a;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

public final class h {
    public static final h a;
    public static final HashMap b;
    public static final HashMap c;
    public static final String d;
    public static final SharedPreferences e;
    public static final SharedPreferences f;

    static {
        h.a = new h();  // initializer: Ljava/lang/Object;-><init>()V
        h.b = new HashMap();
        h.c = new HashMap();
        h.d = "com.wave.personal";
        h.e = l.a().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
        h.f = l.a().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
    }

    public final ArrayList a(ArrayList arrayList0) {
        SharedPreferences sharedPreferences0 = h.f;
        if(a.b(this)) {
            return null;
        }
        try {
            ArrayList arrayList1 = new ArrayList();
            SharedPreferences.Editor sharedPreferences$Editor0 = sharedPreferences0.edit();
            long v = System.currentTimeMillis();
            Iterator iterator0 = arrayList0.iterator();
            while(true) {
                if(!iterator0.hasNext()) {
                    sharedPreferences$Editor0.apply();
                    return arrayList1;
                }
                Object object0 = iterator0.next();
                String s = (String)object0;
                try {
                    JSONObject jSONObject0 = new JSONObject(s);
                    String s1 = jSONObject0.getString("productId");
                    long v1 = jSONObject0.getLong("purchaseTime");
                    String s2 = jSONObject0.getString("purchaseToken");
                    if(v / 1000L - v1 / 1000L > 86400L || j.a(sharedPreferences0.getString(s1, ""), s2)) {
                        continue;
                    }
                    sharedPreferences$Editor0.putString(s1, s2);
                    arrayList1.add(s);
                }
                catch(JSONException unused_ex) {
                }
            }
        }
        catch(Throwable throwable0) {
            a.a(throwable0, this);
            return null;
        }
    }

    public final Class b(Context context0, String s) {
        Class class2;
        if(a.b(this)) {
            return null;
        }
        try {
            HashMap hashMap0 = h.c;
            Class class0 = (Class)hashMap0.get(s);
            if(class0 != null) {
                return class0;
            }
            Class class1 = T4.l.class;
            if(a.b(class1)) {
            label_12:
                class2 = null;
            }
            else {
                try {
                    class2 = context0.getClassLoader().loadClass(s);
                    goto label_13;
                }
                catch(ClassNotFoundException throwable1) {
                }
                catch(Throwable unused_ex) {
                    goto label_12;
                }
                a.a(throwable1, class1);
                goto label_12;
            }
        label_13:
            if(class2 != null) {
                hashMap0.put(s, class2);
                return class2;
            }
        }
        catch(Throwable throwable0) {
            a.a(throwable0, this);
        }
        return null;
    }

    public final Method c(Class class0, String s) {
        Class[] arr_class;
        if(a.b(this)) {
            return null;
        }
        try {
            HashMap hashMap0 = h.b;
            Method method0 = (Method)hashMap0.get(s);
            if(method0 != null) {
                return method0;
            }
            Class class1 = Bundle.class;
            Class class2 = String.class;
            switch(s.hashCode()) {
                case 0x94A50CDC: {
                    if(s.equals("getPurchases")) {
                        Class class3 = Integer.TYPE;
                        j.e(class3, "TYPE");
                        arr_class = new Class[]{class3, class2, class2, class2};
                    }
                    else {
                        arr_class = null;
                    }
                    break;
                }
                case -1450694211: {
                    if(s.equals("isBillingSupported")) {
                        Class class4 = Integer.TYPE;
                        j.e(class4, "TYPE");
                        arr_class = new Class[]{class4, class2, class2};
                    }
                    else {
                        arr_class = null;
                    }
                    break;
                }
                case 0xBD0D1927: {
                    arr_class = s.equals("asInterface") ? new Class[]{IBinder.class} : null;
                    break;
                }
                case -594356707: {
                    if(s.equals("getPurchaseHistory")) {
                        Class class5 = Integer.TYPE;
                        j.e(class5, "TYPE");
                        arr_class = new Class[]{class5, class2, class2, class2, class1};
                    }
                    else {
                        arr_class = null;
                    }
                    break;
                }
                case 0xDDD3FA5B: {
                    if(s.equals("getSkuDetails")) {
                        Class class6 = Integer.TYPE;
                        j.e(class6, "TYPE");
                        arr_class = new Class[]{class6, class2, class2, class1};
                    }
                    else {
                        arr_class = null;
                    }
                    break;
                }
                default: {
                    arr_class = null;
                }
            }
            Method method1 = arr_class == null ? T4.l.J(class0, s, new Class[]{null}) : T4.l.J(class0, s, ((Class[])Arrays.copyOf(arr_class, arr_class.length)));
            if(method1 != null) {
                hashMap0.put(s, method1);
            }
            return method1;
        }
        catch(Throwable throwable0) {
        }
        a.a(throwable0, this);
        return null;
    }

    public final ArrayList d(Object object0, Context context0) {
        String s;
        int v;
        if(a.b(this)) {
            return null;
        }
        try {
            ArrayList arrayList0 = new ArrayList();
            if(this.i(context0, object0, "inapp")) {
                v = 0;
                boolean z = false;
                Object object1 = null;
                while(true) {
                    Bundle bundle0 = new Bundle();
                    Object object2 = this.h(context0, "com.android.vending.billing.IInAppBillingService", "getPurchaseHistory", object0, new Object[]{6, h.d, "inapp", object1, bundle0});
                    if(object2 == null) {
                        object1 = null;
                    }
                    else {
                        long v1 = System.currentTimeMillis() / 1000L;
                        if(((Bundle)object2).getInt("RESPONSE_CODE") == 0) {
                            ArrayList arrayList1 = ((Bundle)object2).getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                            if(arrayList1 == null) {
                                object1 = null;
                            }
                            else {
                                Iterator iterator0 = arrayList1.iterator();
                            label_21:
                                if(iterator0.hasNext()) {
                                    Object object3 = iterator0.next();
                                    s = (String)object3;
                                    try {
                                        JSONObject jSONObject0 = new JSONObject(s);
                                    }
                                    catch(JSONException unused_ex) {
                                        goto label_21;
                                    }
                                    try {
                                        if(v1 - jSONObject0.getLong("purchaseTime") / 1000L > 1200L) {
                                            z = true;
                                        }
                                        else {
                                            goto label_32;
                                        }
                                    }
                                    catch(JSONException unused_ex) {
                                        goto label_21;
                                    }
                                }
                                object1 = ((Bundle)object2).getString("INAPP_CONTINUATION_TOKEN");
                            }
                        }
                        else {
                            object1 = null;
                        }
                    }
                    if(v >= 30 || object1 == null || z) {
                        break;
                    }
                }
            }
            return arrayList0;
            try {
            label_32:
                arrayList0.add(s);
                ++v;
            }
            catch(JSONException unused_ex) {
            }
            goto label_21;
        }
        catch(Throwable throwable0) {
            a.a(throwable0, this);
            return null;
        }
    }

    public final ArrayList e(Context context0, Object object0, String s) {
        if(a.b(this)) {
            return null;
        }
        try {
            ArrayList arrayList0 = new ArrayList();
            if(object0 == null) {
                return arrayList0;
            }
            if(this.i(context0, object0, s)) {
                int v = 0;
                Object object1 = null;
                while(true) {
                    Object object2 = this.h(context0, "com.android.vending.billing.IInAppBillingService", "getPurchases", object0, new Object[]{3, h.d, s, object1});
                    if(object2 == null || ((Bundle)object2).getInt("RESPONSE_CODE") != 0) {
                        object1 = null;
                    }
                    else {
                        ArrayList arrayList1 = ((Bundle)object2).getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                        if(arrayList1 == null) {
                            break;
                        }
                        v += arrayList1.size();
                        arrayList0.addAll(arrayList1);
                        object1 = ((Bundle)object2).getString("INAPP_CONTINUATION_TOKEN");
                    }
                    if(v >= 30 || object1 == null) {
                        break;
                    }
                }
            }
            return arrayList0;
        }
        catch(Throwable throwable0) {
            a.a(throwable0, this);
            return null;
        }
    }

    public static final ArrayList f(Object object0, Context context0) {
        Class class0 = h.class;
        if(a.b(class0)) {
            return null;
        }
        try {
            ArrayList arrayList0 = h.a.e(context0, object0, "inapp");
            return h.a.a(arrayList0);
        }
        catch(Throwable throwable0) {
            a.a(throwable0, class0);
            return null;
        }
    }

    public final LinkedHashMap g(Context context0, ArrayList arrayList0, Object object0, boolean z) {
        if(a.b(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap0 = new LinkedHashMap();
            if(object0 != null && !arrayList0.isEmpty()) {
                Bundle bundle0 = new Bundle();
                bundle0.putStringArrayList("ITEM_ID_LIST", arrayList0);
                Object object1 = this.h(context0, "com.android.vending.billing.IInAppBillingService", "getSkuDetails", object0, new Object[]{3, h.d, (z ? "subs" : "inapp"), bundle0});
                if(object1 != null && ((Bundle)object1).getInt("RESPONSE_CODE") == 0) {
                    ArrayList arrayList1 = ((Bundle)object1).getStringArrayList("DETAILS_LIST");
                    if(arrayList1 != null && arrayList0.size() == arrayList1.size()) {
                        int v1 = arrayList0.size();
                        if(v1 - 1 >= 0) {
                            for(int v = 0; true; ++v) {
                                Object object2 = arrayList0.get(v);
                                j.e(object2, "skuList[i]");
                                Object object3 = arrayList1.get(v);
                                j.e(object3, "skuDetailsList[i]");
                                linkedHashMap0.put(object2, object3);
                                if(v + 1 > v1 - 1) {
                                    break;
                                }
                            }
                        }
                    }
                    this.k(linkedHashMap0);
                }
            }
            return linkedHashMap0;
        }
        catch(Throwable throwable0) {
        }
        a.a(throwable0, this);
        return null;
    }

    public final Object h(Context context0, String s, String s1, Object object0, Object[] arr_object) {
        if(a.b(this)) {
            return null;
        }
        try {
            Class class0 = this.b(context0, s);
            if(class0 == null) {
                return null;
            }
            Method method0 = this.c(class0, s1);
            return method0 == null ? null : T4.l.O(class0, method0, object0, Arrays.copyOf(arr_object, arr_object.length));
        }
        catch(Throwable throwable0) {
            a.a(throwable0, this);
            return null;
        }
    }

    public final boolean i(Context context0, Object object0, String s) {
        if(a.b(this)) {
            return false;
        }
        if(object0 == null) {
            return false;
        }
        try {
            Object object1 = this.h(context0, "com.android.vending.billing.IInAppBillingService", "isBillingSupported", object0, new Object[]{3, h.d, s});
            if(object1 != null && ((int)(((Integer)object1))) == 0) {
                return true;
            }
        }
        catch(Throwable throwable0) {
            a.a(throwable0, this);
        }
        return false;
    }

    public final LinkedHashMap j(ArrayList arrayList0) {
        if(a.b(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap0 = new LinkedHashMap();
            long v = System.currentTimeMillis();
            for(Object object0: arrayList0) {
                String s = (String)object0;
                String s1 = h.e.getString(s, null);
                if(s1 != null) {
                    List list0 = Vb.j.p0(s1, new String[]{";"}, 2, 2);
                    if(v / 1000L - Long.parseLong(((String)list0.get(0))) < 43200L) {
                        j.e(s, "sku");
                        linkedHashMap0.put(s, list0.get(1));
                    }
                }
            }
            return linkedHashMap0;
        }
        catch(Throwable throwable0) {
            a.a(throwable0, this);
            return null;
        }
    }

    public final void k(LinkedHashMap linkedHashMap0) {
        if(a.b(this)) {
            return;
        }
        try {
            long v = System.currentTimeMillis();
            SharedPreferences.Editor sharedPreferences$Editor0 = h.e.edit();
            for(Object object0: linkedHashMap0.entrySet()) {
                sharedPreferences$Editor0.putString(((String)((Map.Entry)object0).getKey()), v / 1000L + ';' + ((String)((Map.Entry)object0).getValue()));
            }
            sharedPreferences$Editor0.apply();
            return;
        }
        catch(Throwable throwable0) {
        }
        a.a(throwable0, this);
    }
}

