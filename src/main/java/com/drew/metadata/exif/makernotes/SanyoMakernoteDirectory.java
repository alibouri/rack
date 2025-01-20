package com.drew.metadata.exif.makernotes;

import com.drew.metadata.b;
import java.util.HashMap;

public class SanyoMakernoteDirectory extends b {
    public static final int TAG_CAMERA_ID = 0x209;
    public static final int TAG_COLOR_ADJUSTMENT_MODE = 0x210;
    public static final int TAG_DATA_DUMP = 0xF00;
    public static final int TAG_DIGITAL_ZOOM = 0x204;
    public static final int TAG_DIGITAL_ZOOM_ON = 539;
    public static final int TAG_FLASH_MODE = 549;
    public static final int TAG_FLICKER_REDUCE = 536;
    public static final int TAG_LIGHT_SOURCE_SPECIAL = 541;
    public static final int TAG_MACRO = 0x202;
    public static final int TAG_MAKERNOTE_OFFSET = 0xFF;
    public static final int TAG_MANUAL_FOCUS_DISTANCE_OR_FACE_INFO = 547;
    public static final int TAG_OPTICAL_ZOOM_ON = 537;
    public static final int TAG_PICT_INFO = 520;
    public static final int TAG_PRINT_IMAGE_MATCHING_INFO = 0xE00;
    public static final int TAG_QUICK_SHOT = 531;
    public static final int TAG_RECORD_SHUTTER_RELEASE = 535;
    public static final int TAG_RESAVED = 542;
    public static final int TAG_SANYO_QUALITY = 0x201;
    public static final int TAG_SANYO_THUMBNAIL = 0x100;
    public static final int TAG_SCENE_SELECT = 0x21F;
    public static final int TAG_SELF_TIMER = 532;
    public static final int TAG_SEQUENCE_SHOT_INTERVAL = 548;
    public static final int TAG_SEQUENTIAL_SHOT = 0x20E;
    public static final int TAG_SOFTWARE_VERSION = 0x207;
    public static final int TAG_SPECIAL_MODE = 0x200;
    public static final int TAG_VOICE_MEMO = 534;
    public static final int TAG_WIDE_RANGE = 0x20F;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        SanyoMakernoteDirectory._tagNameMap = hashMap0;
        com.apollographql.apollo.api.b.z(0xFF, hashMap0, "Makernote Offset", 0x100, "Sanyo Thumbnail");
        com.apollographql.apollo.api.b.z(0x200, hashMap0, "Special Mode", 0x201, "Sanyo Quality");
        com.apollographql.apollo.api.b.z(0x202, hashMap0, "Macro", 0x204, "Digital Zoom");
        com.apollographql.apollo.api.b.z(0x207, hashMap0, "Software Version", 520, "Pict Info");
        com.apollographql.apollo.api.b.z(0x209, hashMap0, "Camera ID", 0x20E, "Sequential Shot");
        com.apollographql.apollo.api.b.z(0x20F, hashMap0, "Wide Range", 0x210, "Color Adjustment Node");
        com.apollographql.apollo.api.b.z(531, hashMap0, "Quick Shot", 532, "Self Timer");
        com.apollographql.apollo.api.b.z(534, hashMap0, "Voice Memo", 535, "Record Shutter Release");
        com.apollographql.apollo.api.b.z(536, hashMap0, "Flicker Reduce", 537, "Optical Zoom On");
        com.apollographql.apollo.api.b.z(539, hashMap0, "Digital Zoom On", 541, "Light Source Special");
        com.apollographql.apollo.api.b.z(542, hashMap0, "Resaved", 0x21F, "Scene Select");
        com.apollographql.apollo.api.b.z(547, hashMap0, "Manual Focus Distance or Face Info", 548, "Sequence Shot Interval");
        com.apollographql.apollo.api.b.z(549, hashMap0, "Flash Mode", 0xE00, "Print IM");
        hashMap0.put(0xF00, "Data Dump");
    }

    public SanyoMakernoteDirectory() {
        this.setDescriptor(new d(25, this));
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "Sanyo Makernote";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return SanyoMakernoteDirectory._tagNameMap;
    }
}

