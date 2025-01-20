package com.drew.metadata.exif.makernotes;

import com.drew.metadata.b;
import java.util.HashMap;

public class ReconyxUltraFireMakernoteDirectory extends b {
    public static final int MAKERNOTE_ID = 0x10000;
    public static final int MAKERNOTE_PUBLIC_ID = 0x7F10001;
    public static final int TAG_AMBIENT_TEMPERATURE = 70;
    public static final int TAG_AMBIENT_TEMPERATURE_FAHRENHEIT = 68;
    public static final int TAG_BATTERY_VOLTAGE = 73;
    public static final int TAG_BTL_VERSION = 38;
    public static final int TAG_CAMERA_VERSION = 24;
    public static final int TAG_DATE_TIME_ORIGINAL = 59;
    public static final int TAG_DAY_OF_WEEK = 66;
    public static final int TAG_EVENT_NUMBER = 55;
    public static final int TAG_EVENT_TYPE = 52;
    public static final int TAG_FLASH = 72;
    public static final int TAG_LABEL = 0;
    public static final int TAG_MAKERNOTE_ID = 10;
    public static final int TAG_MAKERNOTE_PUBLIC_ID = 18;
    public static final int TAG_MAKERNOTE_PUBLIC_SIZE = 22;
    public static final int TAG_MAKERNOTE_SIZE = 14;
    public static final int TAG_MOON_PHASE = 67;
    public static final int TAG_PEX_VERSION = 45;
    public static final int TAG_SEQUENCE = 53;
    public static final int TAG_SERIAL_NUMBER = 75;
    public static final int TAG_UIB_VERSION = 0x1F;
    public static final int TAG_USER_LABEL = 80;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        ReconyxUltraFireMakernoteDirectory._tagNameMap = hashMap0;
        com.apollographql.apollo.api.b.z(0, hashMap0, "Makernote Label", 10, "Makernote ID");
        com.apollographql.apollo.api.b.z(14, hashMap0, "Makernote Size", 18, "Makernote Public ID");
        com.apollographql.apollo.api.b.z(22, hashMap0, "Makernote Public Size", 24, "Camera Version");
        com.apollographql.apollo.api.b.z(0x1F, hashMap0, "Uib Version", 38, "Btl Version");
        com.apollographql.apollo.api.b.z(45, hashMap0, "Pex Version", 52, "Event Type");
        com.apollographql.apollo.api.b.z(53, hashMap0, "Sequence", 55, "Event Number");
        com.apollographql.apollo.api.b.z(59, hashMap0, "Date/Time Original", 66, "Day of Week");
        com.apollographql.apollo.api.b.z(67, hashMap0, "Moon Phase", 68, "Ambient Temperature Fahrenheit");
        com.apollographql.apollo.api.b.z(70, hashMap0, "Ambient Temperature", 72, "Flash");
        com.apollographql.apollo.api.b.z(73, hashMap0, "Battery Voltage", 75, "Serial Number");
        hashMap0.put(80, "User Label");
    }

    public ReconyxUltraFireMakernoteDirectory() {
        this.setDescriptor(new d(22, this));
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "Reconyx UltraFire Makernote";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return ReconyxUltraFireMakernoteDirectory._tagNameMap;
    }
}

