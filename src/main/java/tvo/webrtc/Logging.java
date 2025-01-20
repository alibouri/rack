package tvo.webrtc;

import java.util.EnumSet;
import java.util.logging.Logger;

public class Logging {
    // PARTIAL FAILURE: ENUM SUGARING
    // The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
    public static final class Severity extends Enum {
        private static final Severity[] $VALUES;
        public static final enum Severity LS_ERROR;
        public static final enum Severity LS_INFO;
        public static final enum Severity LS_NONE;
        public static final enum Severity LS_VERBOSE;
        public static final enum Severity LS_WARNING;

        static {
        }

        private Severity(String s, int v) {
        }

        public static Severity valueOf(String s) {
        }

        public static Severity[] values() {
        }
    }

    // PARTIAL FAILURE: ENUM SUGARING
    // The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
    public static final class TraceLevel extends Enum {
        private static final TraceLevel[] $VALUES;
        public static final enum TraceLevel TRACE_ALL;
        public static final enum TraceLevel TRACE_APICALL;
        public static final enum TraceLevel TRACE_CRITICAL;
        public static final enum TraceLevel TRACE_DEBUG;
        public static final enum TraceLevel TRACE_DEFAULT;
        public static final enum TraceLevel TRACE_ERROR;
        public static final enum TraceLevel TRACE_INFO;
        public static final enum TraceLevel TRACE_MEMORY;
        public static final enum TraceLevel TRACE_MODULECALL;
        public static final enum TraceLevel TRACE_NONE;
        public static final enum TraceLevel TRACE_STATEINFO;
        public static final enum TraceLevel TRACE_STREAM;
        public static final enum TraceLevel TRACE_TERSEINFO;
        public static final enum TraceLevel TRACE_TIMER;
        public static final enum TraceLevel TRACE_WARNING;
        public final int level;

        static {
        }

        private TraceLevel(String s, int v, int v1) {
        }

        public static TraceLevel valueOf(String s) {
        }

        public static TraceLevel[] values() {
        }
    }

    private static final Logger fallbackLogger;
    private static Loggable loggable;
    private static Severity loggableSeverity;
    private static volatile boolean loggingEnabled;

    static {
    }

    private static Logger createFallbackLogger() {
    }

    public static void d(String s, String s1) {
    }

    public static void deleteInjectedLoggable() {
    }

    public static void e(String s, String s1) {
    }

    public static void e(String s, String s1, Throwable throwable0) {
    }

    public static void enableLogThreads() {
    }

    public static void enableLogTimeStamps() {
    }

    public static void enableLogToDebugOutput(Severity logging$Severity0) {
    }

    public static void enableTracing(String s, EnumSet enumSet0) {
    }

    private static String getStackTraceString(Throwable throwable0) {
    }

    public static void injectLoggable(Loggable loggable0, Severity logging$Severity0) {
    }

    public static void log(Severity logging$Severity0, String s, String s1) {
    }

    private static native void nativeEnableLogThreads() {
    }

    private static native void nativeEnableLogTimeStamps() {
    }

    private static native void nativeEnableLogToDebugOutput(int arg0) {
    }

    private static native void nativeLog(int arg0, String arg1, String arg2) {
    }

    public static void v(String s, String s1) {
    }

    public static void w(String s, String s1) {
    }

    public static void w(String s, String s1, Throwable throwable0) {
    }

    class tvo.webrtc.Logging.1 {
        static final int[] $SwitchMap$org$webrtc$Logging$Severity;

        static {
        }
    }

}

