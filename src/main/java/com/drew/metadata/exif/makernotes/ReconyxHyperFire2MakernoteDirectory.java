package com.drew.metadata.exif.makernotes;

import com.drew.metadata.b;
import java.util.HashMap;

public class ReconyxHyperFire2MakernoteDirectory extends b {
    public static final int TAG_AMBIENT_INFRARED = 92;
    public static final int TAG_AMBIENT_LIGHT = 94;
    public static final int TAG_AMBIENT_TEMPERATURE = 80;
    public static final int TAG_AMBIENT_TEMPERATURE_FAHRENHEIT = 78;
    public static final int TAG_BATTERY_TYPE = 102;
    public static final int TAG_BATTERY_VOLTAGE = 98;
    public static final int TAG_BATTERY_VOLTAGE_AVG = 100;
    public static final int TAG_BRIGHTNESS = 84;
    public static final int TAG_CONTRAST = 82;
    public static final int TAG_DATE_TIME_ORIGINAL = 62;
    public static final int TAG_DAY_OF_WEEK = 74;
    public static final int TAG_DIRECTORY_NUMBER = 18;
    public static final int TAG_EVENT_NUMBER = 58;
    public static final int TAG_FILE_NUMBER = 16;
    public static final int TAG_FIRMWARE_DATE = 0x30;
    public static final int TAG_FIRMWARE_VERSION = 42;
    public static final int TAG_FLASH = 90;
    public static final int TAG_MOON_PHASE = 76;
    public static final int TAG_MOTION_SENSITIVITY = 0x60;
    public static final int TAG_SATURATION = 88;
    public static final int TAG_SEQUENCE = 54;
    public static final int TAG_SERIAL_NUMBER = 0x7E;
    public static final int TAG_SHARPNESS = 86;
    public static final int TAG_TRIGGER_MODE = 52;
    public static final int TAG_USER_LABEL = 104;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        ReconyxHyperFire2MakernoteDirectory._tagNameMap = hashMap0;
        com.apollographql.apollo.api.b.z(16, hashMap0, "File Number", 18, "Directory Number");
        com.apollographql.apollo.api.b.z(42, hashMap0, "Firmware Version", 0x30, "Firmware Date");
        com.apollographql.apollo.api.b.z(52, hashMap0, "Trigger Mode", 54, "Sequence");
        com.apollographql.apollo.api.b.z(58, hashMap0, "Event Number", 62, "Date/Time Original");
        com.apollographql.apollo.api.b.z(74, hashMap0, "DaY of Week", 76, "Moon Phase");
        com.apollographql.apollo.api.b.z(78, hashMap0, "Ambient Temperature Fahrenheit", 80, "Ambient Temperature");
        com.apollographql.apollo.api.b.z(82, hashMap0, "Contrast", 84, "Brightness");
        com.apollographql.apollo.api.b.z(86, hashMap0, "Sharpness", 88, "Saturation");
        com.apollographql.apollo.api.b.z(90, hashMap0, "Flash", 92, "Ambient Infrared");
        com.apollographql.apollo.api.b.z(94, hashMap0, "Ambient Light", 0x60, "Motion Sensitivity");
        com.apollographql.apollo.api.b.z(98, hashMap0, "Battery Voltage", 100, "Battery Voltage Average");
        com.apollographql.apollo.api.b.z(102, hashMap0, "Battery Type", 104, "User Label");
        hashMap0.put(0x7E, "Serial Number");
    }

    public ReconyxHyperFire2MakernoteDirectory() {
        this.setDescriptor(new d(20, this));
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "Reconyx HyperFire 2 Makernote";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return ReconyxHyperFire2MakernoteDirectory._tagNameMap;
    }
}

