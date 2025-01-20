package com.google.firebase.perf.session.gauges;

import E7.h;
import E7.p;
import I7.a;
import I7.n;
import I7.q;
import Q7.b;
import Q7.c;
import Q7.d;
import R7.f;
import T7.i;
import T7.k;
import T7.l;
import T7.o;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.util.Timer;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import m7.m;

@Keep
public class GaugeManager {
    private static final long APPROX_NUMBER_OF_DATA_POINTS_PER_GAUGE_METRIC = 20L;
    private static final long INVALID_GAUGE_COLLECTION_FREQUENCY = -1L;
    private static final long TIME_TO_WAIT_BEFORE_FLUSHING_GAUGES_QUEUE_MS = 20L;
    private i applicationProcessState;
    private final a configResolver;
    private final m cpuGaugeCollector;
    private ScheduledFuture gaugeManagerDataCollectionJob;
    private final m gaugeManagerExecutor;
    private d gaugeMetadataManager;
    private static final GaugeManager instance;
    private static final L7.a logger;
    private final m memoryGaugeCollector;
    private String sessionId;
    private final f transportManager;

    static {
        GaugeManager.logger = L7.a.d();
        GaugeManager.instance = new GaugeManager();
    }

    @SuppressLint({"ThreadPoolCreation"})
    private GaugeManager() {
        m m0 = new m(new p(1));
        a a0 = a.e();
        m m1 = new m(new p(2));
        m m2 = new m(new p(3));
        this(m0, f.q0, a0, null, m1, m2);
    }

    public GaugeManager(m m0, f f0, a a0, d d0, m m1, m m2) {
        this.gaugeManagerDataCollectionJob = null;
        this.sessionId = null;
        this.applicationProcessState = i.Y;
        this.gaugeManagerExecutor = m0;
        this.transportManager = f0;
        this.configResolver = a0;
        this.gaugeMetadataManager = d0;
        this.cpuGaugeCollector = m1;
        this.memoryGaugeCollector = m2;
    }

    private static void collectGaugeMetricOnce(b b0, Q7.f f0, Timer timer0) {
        synchronized(b0) {
            try {
                Q7.a a0 = new Q7.a(b0, timer0, 1);
                b0.b.schedule(a0, 0L, TimeUnit.MILLISECONDS);
            }
            catch(RejectedExecutionException rejectedExecutionException0) {
                b.g.f("Unable to collect Cpu Metric: " + rejectedExecutionException0.getMessage());
            }
        }
        f0.a(timer0);
    }

    public void collectGaugeMetricOnce(Timer timer0) {
        GaugeManager.collectGaugeMetricOnce(((b)this.cpuGaugeCollector.get()), ((Q7.f)this.memoryGaugeCollector.get()), timer0);
    }

    private long getCpuGaugeCollectionFrequencyMs(i i0) {
        n n0;
        long v1;
        switch(i0.ordinal()) {
            case 1: {
                a a0 = this.configResolver;
                a0.getClass();
                synchronized(n.class) {
                    if(n.b == null) {
                        n.b = new n();  // initializer: Ljava/lang/Object;-><init>()V
                    }
                    n0 = n.b;
                }
                S7.d d0 = a0.l(n0);
                if(d0.b() && a.t(((long)(((Long)d0.a()))))) {
                    v1 = (long)(((Long)d0.a()));
                    return v1 > 0L ? v1 : -1L;
                }
                S7.d d1 = a0.a.getLong("fpr_session_gauge_cpu_capture_frequency_fg_ms");
                if(d1.b() && a.t(((long)(((Long)d1.a()))))) {
                    long v2 = (long)(((Long)d1.a()));
                    a0.c.d(v2, "com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs");
                    v1 = (long)(((Long)d1.a()));
                    return v1 > 0L ? v1 : -1L;
                }
                S7.d d2 = a0.c(n0);
                if(d2.b() && a.t(((long)(((Long)d2.a()))))) {
                    v1 = (long)(((Long)d2.a()));
                    return v1 > 0L ? v1 : -1L;
                }
                v1 = a0.a.isLastFetchFailed() ? 300L : 100L;
                return v1 > 0L ? v1 : -1L;
            }
            case 2: {
                v1 = this.configResolver.p();
                return v1 > 0L ? v1 : -1L;
            }
            default: {
                return -1L;
            }
        }
    }

    private T7.m getGaugeMetadata() {
        l l0 = T7.m.z();
        int v = android.support.v4.media.session.a.M(this.gaugeMetadataManager.c.totalMem / 0x400L);
        l0.j();
        T7.m.w(((T7.m)l0.Y), v);
        int v1 = android.support.v4.media.session.a.M(this.gaugeMetadataManager.a.maxMemory() / 0x400L);
        l0.j();
        T7.m.u(((T7.m)l0.Y), v1);
        int v2 = android.support.v4.media.session.a.M(0x100000L * ((long)this.gaugeMetadataManager.b.getMemoryClass()) / 0x400L);
        l0.j();
        T7.m.v(((T7.m)l0.Y), v2);
        return (T7.m)l0.h();
    }

    public static GaugeManager getInstance() {
        synchronized(GaugeManager.class) {
        }
        return GaugeManager.instance;
    }

    private long getMemoryGaugeCollectionFrequencyMs(i i0) {
        q q0;
        long v1;
        switch(i0.ordinal()) {
            case 1: {
                a a0 = this.configResolver;
                a0.getClass();
                synchronized(q.class) {
                    if(q.b == null) {
                        q.b = new q();  // initializer: Ljava/lang/Object;-><init>()V
                    }
                    q0 = q.b;
                }
                S7.d d0 = a0.l(q0);
                if(d0.b() && a.t(((long)(((Long)d0.a()))))) {
                    v1 = (long)(((Long)d0.a()));
                    return v1 > 0L ? v1 : -1L;
                }
                S7.d d1 = a0.a.getLong("fpr_session_gauge_memory_capture_frequency_fg_ms");
                if(d1.b() && a.t(((long)(((Long)d1.a()))))) {
                    long v2 = (long)(((Long)d1.a()));
                    a0.c.d(v2, "com.google.firebase.perf.SessionsMemoryCaptureFrequencyForegroundMs");
                    v1 = (long)(((Long)d1.a()));
                    return v1 > 0L ? v1 : -1L;
                }
                S7.d d2 = a0.c(q0);
                if(d2.b() && a.t(((long)(((Long)d2.a()))))) {
                    v1 = (long)(((Long)d2.a()));
                    return v1 > 0L ? v1 : -1L;
                }
                v1 = a0.a.isLastFetchFailed() ? 300L : 100L;
                return v1 > 0L ? v1 : -1L;
            }
            case 2: {
                v1 = this.configResolver.q();
                return v1 > 0L ? v1 : -1L;
            }
            default: {
                return -1L;
            }
        }
    }

    public void initializeGaugeMetadataManager(Context context0) {
        this.gaugeMetadataManager = new d(context0);
    }

    private static b lambda$new$0() {
        return new b();
    }

    private static Q7.f lambda$new$1() {
        return new Q7.f();
    }

    private void lambda$startCollectingGauges$2(String s, i i0) {
        this.syncFlush(s, i0);
    }

    private void lambda$stopCollectingGauges$3(String s, i i0) {
        this.syncFlush(s, i0);
    }

    public boolean logGaugeMetadata(String s, i i0) {
        if(this.gaugeMetadataManager != null) {
            T7.n n0 = o.E();
            n0.j();
            o.u(((o)n0.Y), s);
            T7.m m0 = this.getGaugeMetadata();
            n0.j();
            o.w(((o)n0.Y), m0);
            o o0 = (o)n0.h();
            h h0 = new h(this.transportManager, o0, i0, 6);
            this.transportManager.g0.execute(h0);
            return true;
        }
        return false;
    }

    private boolean startCollectingCpuMetrics(long v, Timer timer0) {
        if(Long.compare(v, -1L) == 0) {
            GaugeManager.logger.a("Invalid Cpu Metrics collection frequency. Did not collect Cpu Metrics.");
            return false;
        }
        b b0 = (b)this.cpuGaugeCollector.get();
        if(b0.d != -1L && b0.d != 0L && v > 0L) {
            ScheduledFuture scheduledFuture0 = b0.e;
            if(scheduledFuture0 == null) {
                b0.a(v, timer0);
            }
            else if(b0.f != v) {
                if(scheduledFuture0 != null) {
                    scheduledFuture0.cancel(false);
                    b0.e = null;
                    b0.f = -1L;
                }
                b0.a(v, timer0);
                return true;
            }
        }
        return true;
    }

    private long startCollectingGauges(i i0, Timer timer0) {
        long v = this.getCpuGaugeCollectionFrequencyMs(i0);
        if(!this.startCollectingCpuMetrics(v, timer0)) {
            v = -1L;
        }
        long v1 = this.getMemoryGaugeCollectionFrequencyMs(i0);
        if(this.startCollectingMemoryMetrics(v1, timer0)) {
            return v == -1L ? v1 : Math.min(v, v1);
        }
        return v;
    }

    public void startCollectingGauges(PerfSession perfSession0, i i0) {
        if(this.sessionId != null) {
            this.stopCollectingGauges();
        }
        long v = this.startCollectingGauges(i0, perfSession0.Y);
        if(v == -1L) {
            GaugeManager.logger.f("Invalid gauge collection frequency. Unable to start collecting Gauges.");
            return;
        }
        try {
            this.sessionId = perfSession0.X;
            this.applicationProcessState = i0;
            this.gaugeManagerDataCollectionJob = ((ScheduledExecutorService)this.gaugeManagerExecutor.get()).scheduleAtFixedRate(new c(this, perfSession0.X, i0, 1), v * 20L, v * 20L, TimeUnit.MILLISECONDS);
        }
        catch(RejectedExecutionException rejectedExecutionException0) {
            GaugeManager.logger.f("Unable to start collecting Gauges: " + rejectedExecutionException0.getMessage());
        }
    }

    private boolean startCollectingMemoryMetrics(long v, Timer timer0) {
        if(Long.compare(v, -1L) == 0) {
            GaugeManager.logger.a("Invalid Memory Metrics collection frequency. Did not collect Memory Metrics.");
            return false;
        }
        Q7.f f0 = (Q7.f)this.memoryGaugeCollector.get();
        if(v <= 0L) {
            f0.getClass();
            return true;
        }
        ScheduledFuture scheduledFuture0 = f0.d;
        if(scheduledFuture0 == null) {
            f0.b(v, timer0);
        }
        else if(f0.e != v) {
            if(scheduledFuture0 != null) {
                scheduledFuture0.cancel(false);
                f0.d = null;
                f0.e = -1L;
            }
            f0.b(v, timer0);
            return true;
        }
        return true;
    }

    public void stopCollectingGauges() {
        String s = this.sessionId;
        if(s == null) {
            return;
        }
        i i0 = this.applicationProcessState;
        b b0 = (b)this.cpuGaugeCollector.get();
        ScheduledFuture scheduledFuture0 = b0.e;
        if(scheduledFuture0 != null) {
            scheduledFuture0.cancel(false);
            b0.e = null;
            b0.f = -1L;
        }
        Q7.f f0 = (Q7.f)this.memoryGaugeCollector.get();
        ScheduledFuture scheduledFuture1 = f0.d;
        if(scheduledFuture1 != null) {
            scheduledFuture1.cancel(false);
            f0.d = null;
            f0.e = -1L;
        }
        ScheduledFuture scheduledFuture2 = this.gaugeManagerDataCollectionJob;
        if(scheduledFuture2 != null) {
            scheduledFuture2.cancel(false);
        }
        ((ScheduledExecutorService)this.gaugeManagerExecutor.get()).schedule(new c(this, s, i0, 0), 20L, TimeUnit.MILLISECONDS);
        this.sessionId = null;
        this.applicationProcessState = i.Y;
    }

    private void syncFlush(String s, i i0) {
        T7.n n0 = o.E();
        while(!((b)this.cpuGaugeCollector.get()).a.isEmpty()) {
            k k0 = (k)((b)this.cpuGaugeCollector.get()).a.poll();
            n0.j();
            o.x(((o)n0.Y), k0);
        }
        while(!((Q7.f)this.memoryGaugeCollector.get()).b.isEmpty()) {
            T7.d d0 = (T7.d)((Q7.f)this.memoryGaugeCollector.get()).b.poll();
            n0.j();
            o.v(((o)n0.Y), d0);
        }
        n0.j();
        o.u(((o)n0.Y), s);
        o o0 = (o)n0.h();
        h h0 = new h(this.transportManager, o0, i0, 6);
        this.transportManager.g0.execute(h0);
    }
}

