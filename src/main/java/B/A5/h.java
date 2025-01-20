package a5;

import Nb.j;
import java.util.Arrays;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class h extends Enum {
    public static final enum h A0;
    public static final enum h B0;
    public static final enum h C0;
    public static final enum h D0;
    public static final enum h E0;
    public static final h[] F0;
    public final int X;
    public static final enum h Y;
    public static final enum h Z;
    public static final enum h b0;
    public static final enum h c0;
    public static final enum h d0;
    public static final enum h e0;
    public static final enum h f0;
    public static final enum h g0;
    public static final enum h h0;
    public static final enum h i0;
    public static final enum h j0;
    public static final enum h k0;
    public static final enum h l0;
    public static final enum h m0;
    public static final enum h n0;
    public static final enum h o0;
    public static final enum h p0;
    public static final enum h q0;
    public static final enum h r0;
    public static final enum h s0;
    public static final enum h t0;
    public static final enum h u0;
    public static final enum h v0;
    public static final enum h w0;
    public static final enum h x0;
    public static final enum h y0;
    public static final enum h z0;

    static {
        h.Y = new h("Unknown", 0, -1);
        h.Z = new h("Core", 1, 0);
        h.b0 = new h("AppEvents", 2, 0x10000);
        h.c0 = new h("CodelessEvents", 3, 0x10100);
        h.d0 = new h("CloudBridge", 4, 0x10800);
        h.e0 = new h("RestrictiveDataFiltering", 5, 0x10200);
        h.f0 = new h("AAM", 6, 0x10300);
        h.g0 = new h("PrivacyProtection", 7, 0x10400);
        h.h0 = new h("SuggestedEvents", 8, 0x10401);
        h.i0 = new h("IntelligentIntegrity", 9, 0x10402);
        h.j0 = new h("ModelRequest", 10, 0x10403);
        h.k0 = new h("ProtectedMode", 11, 0x10404);
        h.l0 = new h("MACARuleMatching", 12, 0x10405);
        h.m0 = new h("BlocklistEvents", 13, 0x10406);
        h.n0 = new h("FilterRedactedEvents", 14, 0x10407);
        h.o0 = new h("FilterSensitiveParams", 15, 0x10408);
        h.p0 = new h("EventDeactivation", 16, 0x10500);
        h.q0 = new h("OnDeviceEventProcessing", 17, 0x10600);
        h.r0 = new h("OnDevicePostInstallEventProcessing", 18, 0x10601);
        h.s0 = new h("IapLogging", 19, 0x10700);
        h.t0 = new h("IapLoggingLib2", 20, 0x10701);
        h.u0 = new h("Instrument", 21, 0x20000);
        h.v0 = new h("CrashReport", 22, 0x20100);
        h.w0 = new h("CrashShield", 23, 0x20101);
        h.x0 = new h("ThreadCheck", 24, 0x20102);
        h.y0 = new h("ErrorReport", 25, 0x20200);
        h.z0 = new h("AnrReport", 26, 0x20300);
        h.A0 = new h("Monitoring", 27, 0x30000);
        h.B0 = new h("ServiceUpdateCompliance", 28, 0x30100);
        h h0 = new h("Megatron", 29, 0x40000);
        h h1 = new h("Elora", 30, 0x50000);
        h h2 = new h("Login", 0x1F, 0x1000000);
        h.C0 = new h("ChromeCustomTabsPrefetching", 0x20, 0x1010000);
        h.D0 = new h("IgnoreAppSwitchToLoggedOut", 33, 0x1020000);
        h.E0 = new h("BypassAppSwitch", 34, 0x1030000);
        h.F0 = new h[]{h.Y, h.Z, h.b0, h.c0, h.d0, h.e0, h.f0, h.g0, h.h0, h.i0, h.j0, h.k0, h.l0, h.m0, h.n0, h.o0, h.p0, h.q0, h.r0, h.s0, h.t0, h.u0, h.v0, h.w0, h.x0, h.y0, h.z0, h.A0, h.B0, h0, h1, h2, h.C0, h.D0, h.E0, new h("Share", 35, 0x2000000)};
    }

    public h(String s, int v, int v1) {
        super(s, v);
        this.X = v1;
    }

    @Override
    public final String toString() {
        switch(this.ordinal()) {
            case 1: {
                return "CoreKit";
            }
            case 2: {
                return "AppEvents";
            }
            case 3: {
                return "CodelessEvents";
            }
            case 4: {
                return "AppEventsCloudbridge";
            }
            case 5: {
                return "RestrictiveDataFiltering";
            }
            case 6: {
                return "AAM";
            }
            case 7: {
                return "PrivacyProtection";
            }
            case 8: {
                return "SuggestedEvents";
            }
            case 9: {
                return "IntelligentIntegrity";
            }
            case 10: {
                return "ModelRequest";
            }
            case 11: {
                return "ProtectedMode";
            }
            case 12: {
                return "MACARuleMatching";
            }
            case 13: {
                return "BlocklistEvents";
            }
            case 14: {
                return "FilterRedactedEvents";
            }
            case 15: {
                return "FilterSensitiveParams";
            }
            case 16: {
                return "EventDeactivation";
            }
            case 17: {
                return "OnDeviceEventProcessing";
            }
            case 18: {
                return "OnDevicePostInstallEventProcessing";
            }
            case 19: {
                return "IAPLogging";
            }
            case 20: {
                return "IAPLoggingLib2";
            }
            case 21: {
                return "Instrument";
            }
            case 22: {
                return "CrashReport";
            }
            case 23: {
                return "CrashShield";
            }
            case 24: {
                return "ThreadCheck";
            }
            case 25: {
                return "ErrorReport";
            }
            case 26: {
                return "AnrReport";
            }
            case 27: {
                return "Monitoring";
            }
            case 28: {
                return "ServiceUpdateCompliance";
            }
            case 29: {
                return "Megatron";
            }
            case 30: {
                return "Elora";
            }
            case 0x1F: {
                return "LoginKit";
            }
            case 0x20: {
                return "ChromeCustomTabsPrefetching";
            }
            case 33: {
                return "IgnoreAppSwitchToLoggedOut";
            }
            case 34: {
                return "BypassAppSwitch";
            }
            case 35: {
                return "ShareKit";
            }
            default: {
                return "unknown";
            }
        }
    }

    public static h valueOf(String s) {
        j.f(s, "value");
        return (h)Enum.valueOf(h.class, s);
    }

    public static h[] values() {
        return (h[])Arrays.copyOf(h.F0, 36);
    }
}

