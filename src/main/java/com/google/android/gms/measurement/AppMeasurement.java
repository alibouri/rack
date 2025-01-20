package com.google.android.gms.measurement;

import N5.r;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.zzdw;
import com.google.firebase.analytics.FirebaseAnalytics;
import h6.a;
import h6.b;
import h6.c;
import j6.I0;
import j6.d0;
import j6.t0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Deprecated
public class AppMeasurement {
    public static class ConditionalUserProperty {
        @Keep
        public boolean mActive;
        @Keep
        public String mAppId;
        @Keep
        public long mCreationTimestamp;
        @Keep
        public String mExpiredEventName;
        @Keep
        public Bundle mExpiredEventParams;
        @Keep
        public String mName;
        @Keep
        public String mOrigin;
        @Keep
        public long mTimeToLive;
        @Keep
        public String mTimedOutEventName;
        @Keep
        public Bundle mTimedOutEventParams;
        @Keep
        public String mTriggerEventName;
        @Keep
        public long mTriggerTimeout;
        @Keep
        public String mTriggeredEventName;
        @Keep
        public Bundle mTriggeredEventParams;
        @Keep
        public long mTriggeredTimestamp;
        @Keep
        public Object mValue;

    }

    public final a a;
    public static volatile AppMeasurement b;

    public AppMeasurement(I0 i00) {
        this.a = new b(i00);
    }

    public AppMeasurement(d0 d00) {
        this.a = new c(d00);
    }

    @Keep
    public void beginAdUnitExposure(String s) {
        this.a.j(s);
    }

    @Keep
    public void clearConditionalUserProperty(String s, String s1, Bundle bundle0) {
        this.a.g(s, s1, bundle0);
    }

    @Keep
    public void endAdUnitExposure(String s) {
        this.a.d(s);
    }

    @Keep
    public long generateEventId() {
        return this.a.i();
    }

    @Keep
    public String getAppInstanceId() {
        return this.a.n();
    }

    @Keep
    public List getConditionalUserProperties(String s, String s1) {
        List list0 = this.a.h(s, s1);
        List list1 = new ArrayList((list0 == null ? 0 : list0.size()));
        for(Object object0: list0) {
            ConditionalUserProperty appMeasurement$ConditionalUserProperty0 = new ConditionalUserProperty();  // initializer: Ljava/lang/Object;-><init>()V
            r.j(((Bundle)object0));
            appMeasurement$ConditionalUserProperty0.mAppId = (String)t0.a(((Bundle)object0), "app_id", String.class, null);
            appMeasurement$ConditionalUserProperty0.mOrigin = (String)t0.a(((Bundle)object0), "origin", String.class, null);
            appMeasurement$ConditionalUserProperty0.mName = (String)t0.a(((Bundle)object0), "name", String.class, null);
            appMeasurement$ConditionalUserProperty0.mValue = t0.a(((Bundle)object0), "value", Object.class, null);
            appMeasurement$ConditionalUserProperty0.mTriggerEventName = (String)t0.a(((Bundle)object0), "trigger_event_name", String.class, null);
            Long long0 = 0L;
            appMeasurement$ConditionalUserProperty0.mTriggerTimeout = (long)(((Long)t0.a(((Bundle)object0), "trigger_timeout", Long.class, long0)));
            appMeasurement$ConditionalUserProperty0.mTimedOutEventName = (String)t0.a(((Bundle)object0), "timed_out_event_name", String.class, null);
            appMeasurement$ConditionalUserProperty0.mTimedOutEventParams = (Bundle)t0.a(((Bundle)object0), "timed_out_event_params", Bundle.class, null);
            appMeasurement$ConditionalUserProperty0.mTriggeredEventName = (String)t0.a(((Bundle)object0), "triggered_event_name", String.class, null);
            appMeasurement$ConditionalUserProperty0.mTriggeredEventParams = (Bundle)t0.a(((Bundle)object0), "triggered_event_params", Bundle.class, null);
            appMeasurement$ConditionalUserProperty0.mTimeToLive = (long)(((Long)t0.a(((Bundle)object0), "time_to_live", Long.class, long0)));
            appMeasurement$ConditionalUserProperty0.mExpiredEventName = (String)t0.a(((Bundle)object0), "expired_event_name", String.class, null);
            appMeasurement$ConditionalUserProperty0.mExpiredEventParams = (Bundle)t0.a(((Bundle)object0), "expired_event_params", Bundle.class, null);
            appMeasurement$ConditionalUserProperty0.mActive = ((Boolean)t0.a(((Bundle)object0), "active", Boolean.class, Boolean.FALSE)).booleanValue();
            appMeasurement$ConditionalUserProperty0.mCreationTimestamp = (long)(((Long)t0.a(((Bundle)object0), "creation_timestamp", Long.class, long0)));
            appMeasurement$ConditionalUserProperty0.mTriggeredTimestamp = (long)(((Long)t0.a(((Bundle)object0), "triggered_timestamp", Long.class, long0)));
            ((ArrayList)list1).add(appMeasurement$ConditionalUserProperty0);
        }
        return list1;
    }

    @Keep
    public String getCurrentScreenClass() {
        return this.a.e();
    }

    @Keep
    public String getCurrentScreenName() {
        return this.a.l();
    }

    @Keep
    public String getGmpAppId() {
        return this.a.b();
    }

    @Keep
    @Deprecated
    public static AppMeasurement getInstance(Context context0) {
        I0 i00;
        if(AppMeasurement.b == null) {
            Class class0 = AppMeasurement.class;
            __monitor_enter(class0);
            if(AppMeasurement.b == null) {
                try {
                    i00 = null;
                    i00 = FirebaseAnalytics.getScionFrontendApiImplementation(context0, null);
                }
                catch(Exception unused_ex) {
                }
                AppMeasurement.b = i00 == null ? new AppMeasurement(d0.d(context0, new zzdw(0L, 0L, true, null, null, null, null, null), null)) : new AppMeasurement(i00);
            }
            __monitor_exit(class0);
        }
        return AppMeasurement.b;
    }

    @Keep
    public int getMaxUserProperties(String s) {
        return this.a.c(s);
    }

    @Keep
    public Map getUserProperties(String s, String s1, boolean z) {
        return this.a.k(s, s1, z);
    }

    @Keep
    public void logEventInternal(String s, String s1, Bundle bundle0) {
        this.a.m(s, s1, bundle0);
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty appMeasurement$ConditionalUserProperty0) {
        r.j(appMeasurement$ConditionalUserProperty0);
        Bundle bundle0 = new Bundle();
        String s = appMeasurement$ConditionalUserProperty0.mAppId;
        if(s != null) {
            bundle0.putString("app_id", s);
        }
        String s1 = appMeasurement$ConditionalUserProperty0.mOrigin;
        if(s1 != null) {
            bundle0.putString("origin", s1);
        }
        String s2 = appMeasurement$ConditionalUserProperty0.mName;
        if(s2 != null) {
            bundle0.putString("name", s2);
        }
        Object object0 = appMeasurement$ConditionalUserProperty0.mValue;
        if(object0 != null) {
            t0.e(bundle0, object0);
        }
        String s3 = appMeasurement$ConditionalUserProperty0.mTriggerEventName;
        if(s3 != null) {
            bundle0.putString("trigger_event_name", s3);
        }
        bundle0.putLong("trigger_timeout", appMeasurement$ConditionalUserProperty0.mTriggerTimeout);
        String s4 = appMeasurement$ConditionalUserProperty0.mTimedOutEventName;
        if(s4 != null) {
            bundle0.putString("timed_out_event_name", s4);
        }
        Bundle bundle1 = appMeasurement$ConditionalUserProperty0.mTimedOutEventParams;
        if(bundle1 != null) {
            bundle0.putBundle("timed_out_event_params", bundle1);
        }
        String s5 = appMeasurement$ConditionalUserProperty0.mTriggeredEventName;
        if(s5 != null) {
            bundle0.putString("triggered_event_name", s5);
        }
        Bundle bundle2 = appMeasurement$ConditionalUserProperty0.mTriggeredEventParams;
        if(bundle2 != null) {
            bundle0.putBundle("triggered_event_params", bundle2);
        }
        bundle0.putLong("time_to_live", appMeasurement$ConditionalUserProperty0.mTimeToLive);
        String s6 = appMeasurement$ConditionalUserProperty0.mExpiredEventName;
        if(s6 != null) {
            bundle0.putString("expired_event_name", s6);
        }
        Bundle bundle3 = appMeasurement$ConditionalUserProperty0.mExpiredEventParams;
        if(bundle3 != null) {
            bundle0.putBundle("expired_event_params", bundle3);
        }
        bundle0.putLong("creation_timestamp", appMeasurement$ConditionalUserProperty0.mCreationTimestamp);
        bundle0.putBoolean("active", appMeasurement$ConditionalUserProperty0.mActive);
        bundle0.putLong("triggered_timestamp", appMeasurement$ConditionalUserProperty0.mTriggeredTimestamp);
        this.a.f(bundle0);
    }
}

