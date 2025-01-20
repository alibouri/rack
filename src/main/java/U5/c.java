package u5;

public enum c implements t7.c {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);

    public final int X;

    public c(int v1) {
        this.X = v1;
    }

    @Override  // t7.c
    public final int a() {
        return this.X;
    }
}

