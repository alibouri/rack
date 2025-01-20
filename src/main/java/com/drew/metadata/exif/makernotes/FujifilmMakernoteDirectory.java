package com.drew.metadata.exif.makernotes;

import com.drew.metadata.b;
import java.util.HashMap;

public class FujifilmMakernoteDirectory extends b {
    public static final int TAG_AUTO_BRACKETING = 0x1100;
    public static final int TAG_AUTO_DYNAMIC_RANGE = 0x140B;
    public static final int TAG_AUTO_EXPOSURE_WARNING = 0x1302;
    public static final int TAG_BLUR_WARNING = 0x1300;
    public static final int TAG_COLOR_SATURATION = 0x1003;
    public static final int TAG_COLOR_TEMPERATURE = 0x1005;
    public static final int TAG_CONTRAST = 0x1006;
    public static final int TAG_DEVELOPMENT_DYNAMIC_RANGE = 0x1403;
    public static final int TAG_DYNAMIC_RANGE = 0x1400;
    public static final int TAG_DYNAMIC_RANGE_SETTING = 0x1402;
    public static final int TAG_EXR_AUTO = 0x1033;
    public static final int TAG_EXR_MODE = 0x1034;
    public static final int TAG_FACES_DETECTED = 0x4100;
    public static final int TAG_FACE_POSITIONS = 0x4103;
    public static final int TAG_FACE_REC_INFO = 17026;
    public static final int TAG_FILE_SOURCE = 0x8000;
    public static final int TAG_FILM_MODE = 0x1401;
    public static final int TAG_FINE_PIX_COLOR = 0x1210;
    public static final int TAG_FLASH_EV = 0x1011;
    public static final int TAG_FLASH_MODE = 0x1010;
    public static final int TAG_FOCUS_MODE = 0x1021;
    public static final int TAG_FOCUS_PIXEL = 0x1023;
    public static final int TAG_FOCUS_WARNING = 0x1301;
    public static final int TAG_FRAME_NUMBER = 0x8003;
    public static final int TAG_GE_IMAGE_SIZE = 0x1304;
    public static final int TAG_HIGH_ISO_NOISE_REDUCTION = 0x100E;
    public static final int TAG_IMAGE_NUMBER = 5176;
    public static final int TAG_MACRO = 0x1020;
    public static final int TAG_MAKERNOTE_VERSION = 0;
    public static final int TAG_MAX_APERTURE_AT_MAX_FOCAL = 0x1407;
    public static final int TAG_MAX_APERTURE_AT_MIN_FOCAL = 0x1406;
    public static final int TAG_MAX_FOCAL_LENGTH = 0x1405;
    public static final int TAG_MIN_FOCAL_LENGTH = 0x1404;
    public static final int TAG_NOISE_REDUCTION = 0x100B;
    public static final int TAG_ORDER_NUMBER = 0x8002;
    public static final int TAG_PARALLAX = 0xB211;
    public static final int TAG_PICTURE_MODE = 0x1031;
    public static final int TAG_QUALITY = 0x1000;
    public static final int TAG_SEQUENCE_NUMBER = 0x1101;
    public static final int TAG_SERIAL_NUMBER = 16;
    public static final int TAG_SHARPNESS = 0x1001;
    public static final int TAG_SLOW_SYNC = 0x1030;
    public static final int TAG_TONE = 4100;
    public static final int TAG_WHITE_BALANCE = 0x1002;
    public static final int TAG_WHITE_BALANCE_FINE_TUNE = 0x100A;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        FujifilmMakernoteDirectory._tagNameMap = hashMap0;
        com.apollographql.apollo.api.b.z(0, hashMap0, "Makernote Version", 16, "Serial Number");
        com.apollographql.apollo.api.b.z(0x1000, hashMap0, "Quality", 0x1001, "Sharpness");
        com.apollographql.apollo.api.b.z(0x1002, hashMap0, "White Balance", 0x1003, "Color Saturation");
        com.apollographql.apollo.api.b.z(4100, hashMap0, "Tone (Contrast)", 0x1005, "Color Temperature");
        com.apollographql.apollo.api.b.z(0x1006, hashMap0, "Contrast", 0x100A, "White Balance Fine Tune");
        com.apollographql.apollo.api.b.z(0x100B, hashMap0, "Noise Reduction", 0x100E, "High ISO Noise Reduction");
        com.apollographql.apollo.api.b.z(0x1010, hashMap0, "Flash Mode", 0x1011, "Flash Strength");
        com.apollographql.apollo.api.b.z(0x1020, hashMap0, "Macro", 0x1021, "Focus Mode");
        com.apollographql.apollo.api.b.z(0x1023, hashMap0, "Focus Pixel", 0x1030, "Slow Sync");
        com.apollographql.apollo.api.b.z(0x1031, hashMap0, "Picture Mode", 0x1033, "EXR Auto");
        com.apollographql.apollo.api.b.z(0x1034, hashMap0, "EXR Mode", 0x1100, "Auto Bracketing");
        com.apollographql.apollo.api.b.z(0x1101, hashMap0, "Sequence Number", 0x1210, "FinePix Color Setting");
        com.apollographql.apollo.api.b.z(0x1300, hashMap0, "Blur Warning", 0x1301, "Focus Warning");
        com.apollographql.apollo.api.b.z(0x1302, hashMap0, "AE Warning", 0x1304, "GE Image Size");
        com.apollographql.apollo.api.b.z(0x1400, hashMap0, "Dynamic Range", 0x1401, "Film Mode");
        com.apollographql.apollo.api.b.z(0x1402, hashMap0, "Dynamic Range Setting", 0x1403, "Development Dynamic Range");
        com.apollographql.apollo.api.b.z(0x1404, hashMap0, "Minimum Focal Length", 0x1405, "Maximum Focal Length");
        com.apollographql.apollo.api.b.z(0x1406, hashMap0, "Maximum Aperture at Minimum Focal Length", 0x1407, "Maximum Aperture at Maximum Focal Length");
        com.apollographql.apollo.api.b.z(0x140B, hashMap0, "Auto Dynamic Range", 0x4100, "Faces Detected");
        com.apollographql.apollo.api.b.z(0x4103, hashMap0, "Face Positions", 17026, "Face Detection Data");
        com.apollographql.apollo.api.b.z(0x8000, hashMap0, "File Source", 0x8002, "Order Number");
        com.apollographql.apollo.api.b.z(0x8003, hashMap0, "Frame Number", 0xB211, "Parallax");
        hashMap0.put(5176, "Image Number");
    }

    public FujifilmMakernoteDirectory() {
        this.setDescriptor(new d(6, this));
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "Fujifilm Makernote";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return FujifilmMakernoteDirectory._tagNameMap;
    }
}

