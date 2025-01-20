package com.drew.metadata.exif.makernotes;

import com.drew.metadata.b;
import java.util.HashMap;

public class OlympusEquipmentMakernoteDirectory extends b {
    public static final int TAG_BODY_FIRMWARE_VERSION = 260;
    public static final int TAG_CAMERA_TYPE_2 = 0x100;
    public static final int TAG_CONVERSION_LENS = 0x403;
    public static final int TAG_EQUIPMENT_VERSION = 0;
    public static final int TAG_EXTENDER = 0x301;
    public static final int TAG_EXTENDER_FIRMWARE_VERSION = 0x304;
    public static final int TAG_EXTENDER_MODEL = 0x303;
    public static final int TAG_EXTENDER_SERIAL_NUMBER = 770;
    public static final int TAG_FLASH_FIRMWARE_VERSION = 0x1002;
    public static final int TAG_FLASH_MODEL = 0x1001;
    public static final int TAG_FLASH_SERIAL_NUMBER = 0x1003;
    public static final int TAG_FLASH_TYPE = 0x1000;
    public static final int TAG_FOCAL_PLANE_DIAGONAL = 0x103;
    public static final int TAG_INTERNAL_SERIAL_NUMBER = 0x102;
    public static final int TAG_LENS_FIRMWARE_VERSION = 0x204;
    public static final int TAG_LENS_MODEL = 0x203;
    public static final int TAG_LENS_PROPERTIES = 0x20B;
    public static final int TAG_LENS_SERIAL_NUMBER = 0x202;
    public static final int TAG_LENS_TYPE = 0x201;
    public static final int TAG_MAX_APERTURE = 0x20A;
    public static final int TAG_MAX_APERTURE_AT_MAX_FOCAL = 0x206;
    public static final int TAG_MAX_APERTURE_AT_MIN_FOCAL = 0x205;
    public static final int TAG_MAX_FOCAL_LENGTH = 520;
    public static final int TAG_MIN_FOCAL_LENGTH = 0x207;
    public static final int TAG_SERIAL_NUMBER = 0x101;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        OlympusEquipmentMakernoteDirectory._tagNameMap = hashMap0;
        com.apollographql.apollo.api.b.z(0, hashMap0, "Equipment Version", 0x100, "Camera Type 2");
        com.apollographql.apollo.api.b.z(0x101, hashMap0, "Serial Number", 0x102, "Internal Serial Number");
        com.apollographql.apollo.api.b.z(0x103, hashMap0, "Focal Plane Diagonal", 260, "Body Firmware Version");
        com.apollographql.apollo.api.b.z(0x201, hashMap0, "Lens Type", 0x202, "Lens Serial Number");
        com.apollographql.apollo.api.b.z(0x203, hashMap0, "Lens Model", 0x204, "Lens Firmware Version");
        com.apollographql.apollo.api.b.z(0x205, hashMap0, "Max Aperture At Min Focal", 0x206, "Max Aperture At Max Focal");
        com.apollographql.apollo.api.b.z(0x207, hashMap0, "Min Focal Length", 520, "Max Focal Length");
        com.apollographql.apollo.api.b.z(0x20A, hashMap0, "Max Aperture", 0x20B, "Lens Properties");
        com.apollographql.apollo.api.b.z(0x301, hashMap0, "Extender", 770, "Extender Serial Number");
        com.apollographql.apollo.api.b.z(0x303, hashMap0, "Extender Model", 0x304, "Extender Firmware Version");
        com.apollographql.apollo.api.b.z(0x403, hashMap0, "Conversion Lens", 0x1000, "Flash Type");
        com.apollographql.apollo.api.b.z(0x1001, hashMap0, "Flash Model", 0x1002, "Flash Firmware Version");
        hashMap0.put(0x1003, "Flash Serial Number");
    }

    public OlympusEquipmentMakernoteDirectory() {
        this.setDescriptor(new c(this));  // initializer: Lcom/drew/metadata/g;-><init>(Lcom/drew/metadata/b;)V
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "Olympus Equipment";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return OlympusEquipmentMakernoteDirectory._tagNameMap;
    }
}

