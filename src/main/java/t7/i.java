package T7;

public enum i {
    APPLICATION_PROCESS_STATE_UNKNOWN(0),
    FOREGROUND(1),
    BACKGROUND(2),
    FOREGROUND_BACKGROUND(3);

    public final int X;

    public i(int v1) {
        this.X = v1;
    }
}

