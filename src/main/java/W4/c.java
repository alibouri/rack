package W4;

import Ab.e;

public enum c {
    MTML_INTEGRITY_DETECT,
    MTML_APP_EVENT_PREDICTION;

    public final String a() {
        switch(this.ordinal()) {
            case 0: {
                return "integrity_detect";
            }
            case 1: {
                return "app_event_pred";
            }
            default: {
                throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
            }
        }
    }

    public final String b() {
        switch(this.ordinal()) {
            case 0: {
                return "MTML_INTEGRITY_DETECT";
            }
            case 1: {
                return "MTML_APP_EVENT_PRED";
            }
            default: {
                throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
            }
        }
    }
}

