package Fa;

import Gb.b;

public enum t {
    UNLOCKED(0x7F06018F, 0x7F06001C),  // color:white
    LOCKED(0x7F06018F, 0x7F06001C),  // color:white
    CLAIMED_ACTIVE(0x7F060029, 0x7F06002F);  // color:Orange300

    public final int X;
    public final int Y;

    static {
        t.d0 = arr_t;
        new b(arr_t);
    }

    public t(int v1, int v2) {
        this.X = v1;
        this.Y = v2;
    }
}

