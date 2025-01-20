package c5;

public enum a {
    Unknown,
    Analysis,
    AnrReport,
    CrashReport,
    CrashShield,
    ThreadCheck;

    @Override
    public final String toString() {
        switch(this.ordinal()) {
            case 1: {
                return "Analysis";
            }
            case 2: {
                return "AnrReport";
            }
            case 3: {
                return "CrashReport";
            }
            case 4: {
                return "CrashShield";
            }
            case 5: {
                return "ThreadCheck";
            }
            default: {
                return "Unknown";
            }
        }
    }
}

