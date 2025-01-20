package com.drew.metadata.exif.makernotes;

import com.drew.metadata.b;
import java.util.HashMap;

public class ReconyxHyperFireMakernoteDirectory extends b {
    public static final int MAKERNOTE_VERSION = 0xF101;
    public static final int TAG_AMBIENT_TEMPERATURE = 40;
    public static final int TAG_AMBIENT_TEMPERATURE_FAHRENHEIT = 38;
    public static final int TAG_BATTERY_VOLTAGE = 84;
    public static final int TAG_BRIGHTNESS = 74;
    public static final int TAG_CONTRAST = 72;
    public static final int TAG_DATE_TIME_ORIGINAL = 22;
    public static final int TAG_EVENT_NUMBER = 18;
    public static final int TAG_FIRMWARE_VERSION = 2;
    public static final int TAG_INFRARED_ILLUMINATOR = 80;
    public static final int TAG_MAKERNOTE_VERSION = 0;
    public static final int TAG_MOON_PHASE = 36;
    public static final int TAG_MOTION_SENSITIVITY = 82;
    public static final int TAG_SATURATION = 78;
    public static final int TAG_SEQUENCE = 14;
    public static final int TAG_SERIAL_NUMBER = 42;
    public static final int TAG_SHARPNESS = 76;
    public static final int TAG_TRIGGER_MODE = 12;
    public static final int TAG_USER_LABEL = 86;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        ReconyxHyperFireMakernoteDirectory._tagNameMap = hashMap0;
        com.apollographql.apollo.api.b.z(0, hashMap0, "Makernote Version", 2, "Firmware Version");
        com.apollographql.apollo.api.b.z(12, hashMap0, "Trigger Mode", 14, "Sequence");
        com.apollographql.apollo.api.b.z(18, hashMap0, "Event Number", 22, "Date/Time Original");
        com.apollographql.apollo.api.b.z(36, hashMap0, "Moon Phase", 38, "Ambient Temperature Fahrenheit");
        com.apollographql.apollo.api.b.z(40, hashMap0, "Ambient Temperature", 42, "Serial Number");
        com.apollographql.apollo.api.b.z(72, hashMap0, "Contrast", 74, "Brightness");
        com.apollographql.apollo.api.b.z(76, hashMap0, "Sharpness", 78, "Saturation");
        com.apollographql.apollo.api.b.z(80, hashMap0, "Infrared Illuminator", 82, "Motion Sensitivity");
        com.apollographql.apollo.api.b.z(84, hashMap0, "Battery Voltage", 86, "User Label");
    }

    public ReconyxHyperFireMakernoteDirectory() {
        this.setDescriptor(new d(21, this));
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "Reconyx HyperFire Makernote";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return ReconyxHyperFireMakernoteDirectory._tagNameMap;
    }
}

