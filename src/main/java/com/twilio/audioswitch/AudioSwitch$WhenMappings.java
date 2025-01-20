package com.twilio.audioswitch;

public final class AudioSwitch.WhenMappings {
    public static final int[] $EnumSwitchMapping$0;
    public static final int[] $EnumSwitchMapping$1;
    public static final int[] $EnumSwitchMapping$2;
    public static final int[] $EnumSwitchMapping$3;

    static {
        int[] arr_v = new int[State.values().length];
        AudioSwitch.WhenMappings.$EnumSwitchMapping$0 = arr_v;
        arr_v[State.STOPPED.ordinal()] = 1;
        int[] arr_v1 = new int[State.values().length];
        AudioSwitch.WhenMappings.$EnumSwitchMapping$1 = arr_v1;
        arr_v1[State.ACTIVATED.ordinal()] = 1;
        arr_v1[State.STARTED.ordinal()] = 2;
        arr_v1[State.STOPPED.ordinal()] = 3;
        int[] arr_v2 = new int[State.values().length];
        AudioSwitch.WhenMappings.$EnumSwitchMapping$2 = arr_v2;
        arr_v2[State.STARTED.ordinal()] = 1;
        arr_v2[State.ACTIVATED.ordinal()] = 2;
        arr_v2[State.STOPPED.ordinal()] = 3;
        int[] arr_v3 = new int[State.values().length];
        AudioSwitch.WhenMappings.$EnumSwitchMapping$3 = arr_v3;
        arr_v3[State.ACTIVATED.ordinal()] = 1;
        arr_v3[State.STARTED.ordinal()] = 2;
        arr_v3[State.STOPPED.ordinal()] = 3;
    }
}

