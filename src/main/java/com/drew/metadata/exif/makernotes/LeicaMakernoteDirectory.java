package com.drew.metadata.exif.makernotes;

import com.drew.metadata.b;
import java.util.HashMap;

public class LeicaMakernoteDirectory extends b {
    public static final int TAG_APPROXIMATE_F_NUMBER = 787;
    public static final int TAG_CAMERA_TEMPERATURE = 800;
    public static final int TAG_CCD_BOARD_VERSION = 817;
    public static final int TAG_CCD_VERSION = 0x330;
    public static final int TAG_COLOR_TEMPERATURE = 801;
    public static final int TAG_CONTROLLER_BOARD_VERSION = 818;
    public static final int TAG_EXTERNAL_SENSOR_BRIGHTNESS_VALUE = 785;
    public static final int TAG_IMAGE_ID_NUMBER = 0x340;
    public static final int TAG_LENS_TYPE = 0x310;
    public static final int TAG_M16_C_VERSION = 819;
    public static final int TAG_MEASURED_LV = 786;
    public static final int TAG_QUALITY = 0x300;
    public static final int TAG_SERIAL_NUMBER = 0x303;
    public static final int TAG_USER_PROFILE = 770;
    public static final int TAG_WB_BLUE_LEVEL = 804;
    public static final int TAG_WB_GREEN_LEVEL = 803;
    public static final int TAG_WB_RED_LEVEL = 802;
    public static final int TAG_WHITE_BALANCE = 0x304;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        LeicaMakernoteDirectory._tagNameMap = hashMap0;
        com.apollographql.apollo.api.b.z(0x300, hashMap0, "Quality", 770, "User Profile");
        com.apollographql.apollo.api.b.z(0x303, hashMap0, "Serial Number", 0x304, "White Balance");
        com.apollographql.apollo.api.b.z(0x310, hashMap0, "Lens Type", 785, "External Sensor Brightness Value");
        com.apollographql.apollo.api.b.z(786, hashMap0, "Measured LV", 787, "Approximate F Number");
        com.apollographql.apollo.api.b.z(800, hashMap0, "Camera Temperature", 801, "Color Temperature");
        com.apollographql.apollo.api.b.z(802, hashMap0, "WB Red Level", 803, "WB Green Level");
        com.apollographql.apollo.api.b.z(804, hashMap0, "WB Blue Level", 0x330, "CCD Version");
        com.apollographql.apollo.api.b.z(817, hashMap0, "CCD Board Version", 818, "Controller Board Version");
        com.apollographql.apollo.api.b.z(819, hashMap0, "M16 C Version", 0x340, "Image ID Number");
    }

    public LeicaMakernoteDirectory() {
        this.setDescriptor(new d(9, this));
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "Leica Makernote";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return LeicaMakernoteDirectory._tagNameMap;
    }
}

