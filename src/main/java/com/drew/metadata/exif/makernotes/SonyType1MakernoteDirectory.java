package com.drew.metadata.exif.makernotes;

import com.drew.metadata.b;
import java.util.HashMap;

public class SonyType1MakernoteDirectory extends b {
    public static final int TAG_9050A = 0x30;
    public static final int TAG_9050B = 0x9050;
    public static final int TAG_9050C = 0x40;
    public static final int TAG_AF_ILLUMINATOR = 0xB044;
    public static final int TAG_AF_MODE = 0xB043;
    public static final int TAG_AF_POINT_SELECTED = 0x201E;
    public static final int TAG_ANTI_BLUR = 0xB04B;
    public static final int TAG_AUTO_PORTRAIT_FRAMED = 0x2016;
    public static final int TAG_BRIGHTNESS = 0x2007;
    public static final int TAG_CAMERA_INFO = 16;
    public static final int TAG_CAMERA_SETTINGS = 276;
    public static final int TAG_COLOR_COMPENSATION_FILTER = 45090;
    public static final int TAG_COLOR_MODE = 0xB029;
    public static final int TAG_COLOR_MODE_SETTING = 0xB020;
    public static final int TAG_COLOR_TEMPERATURE = 0xB021;
    public static final int TAG_CONTRAST = 0x2004;
    public static final int TAG_DISTORTION_CORRECTION = 0x2013;
    public static final int TAG_DYNAMIC_RANGE_OPTIMISER = 0xB025;
    public static final int TAG_DYNAMIC_RANGE_OPTIMIZER = 0xB04F;
    public static final int TAG_EXPOSURE_MODE = 0xB041;
    public static final int TAG_EXTRA_INFO = 278;
    public static final int TAG_FILE_FORMAT = 0xB000;
    public static final int TAG_FLASH_EXPOSURE_COMP = 260;
    public static final int TAG_FLASH_LEVEL = 0xB048;
    public static final int TAG_FOCUS_INFO = 0x20;
    public static final int TAG_FOCUS_MODE = 0x201B;
    public static final int TAG_FOCUS_MODE_2 = 0xB042;
    public static final int TAG_FULL_IMAGE_SIZE = 0xB02B;
    public static final int TAG_HDR = 0x200A;
    public static final int TAG_HIGH_ISO_NOISE_REDUCTION = 0x2009;
    public static final int TAG_HIGH_ISO_NOISE_REDUCTION_2 = 0xB050;
    public static final int TAG_IMAGE_QUALITY = 0x102;
    public static final int TAG_IMAGE_STABILISATION = 0xB026;
    public static final int TAG_INTELLIGENT_AUTO = 0xB052;
    public static final int TAG_JPEG_QUALITY = 0xB047;
    public static final int TAG_LATERAL_CHROMATIC_ABERRATION = 8210;
    public static final int TAG_LENS_ID = 0xB027;
    public static final int TAG_LENS_SPEC = 0xB02A;
    public static final int TAG_LONG_EXPOSURE_NOISE_REDUCTION = 8200;
    public static final int TAG_LONG_EXPOSURE_NOISE_REDUCTION_OR_FOCUS_MODE = 0xB04E;
    public static final int TAG_MACRO = 0xB040;
    public static final int TAG_MINOLTA_MAKERNOTE = 0xB028;
    public static final int TAG_MULTI_BURST_IMAGE_HEIGHT = 0x1002;
    public static final int TAG_MULTI_BURST_IMAGE_WIDTH = 0x1001;
    public static final int TAG_MULTI_BURST_MODE = 0x1000;
    public static final int TAG_MULTI_FRAME_NOISE_REDUCTION = 0x200B;
    public static final int TAG_NO_PRINT = 0xFFFF;
    public static final int TAG_PANORAMA = 0x1003;
    public static final int TAG_PICTURE_EFFECT = 0x200E;
    public static final int TAG_PREVIEW_IMAGE = 0x2001;
    public static final int TAG_PREVIEW_IMAGE_SIZE = 45100;
    public static final int TAG_PRINT_IMAGE_MATCHING_INFO = 0xE00;
    public static final int TAG_RATING = 0x2002;
    public static final int TAG_RELEASE_MODE = 0xB049;
    public static final int TAG_SATURATION = 0x2005;
    public static final int TAG_SCENE_MODE = 0xB023;
    public static final int TAG_SEQUENCE_NUMBER = 0xB04A;
    public static final int TAG_SHARPNESS = 0x2006;
    public static final int TAG_SHOT_INFO = 0x3000;
    public static final int TAG_SOFT_SKIN_EFFECT = 0x200F;
    public static final int TAG_SONY_MODEL_ID = 0xB001;
    public static final int TAG_TELECONVERTER = 0x105;
    public static final int TAG_VIGNETTING_CORRECTION = 8209;
    public static final int TAG_WB_SHIFT_AMBER_MAGENTA = 0x2014;
    public static final int TAG_WHITE_BALANCE = 277;
    public static final int TAG_WHITE_BALANCE_2 = 0xB054;
    public static final int TAG_WHITE_BALANCE_FINE_TUNE = 274;
    public static final int TAG_ZONE_MATCHING = 0xB024;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        SonyType1MakernoteDirectory._tagNameMap = hashMap0;
        com.apollographql.apollo.api.b.z(16, hashMap0, "Camera Info", 0x20, "Focus Info");
        com.apollographql.apollo.api.b.z(0x102, hashMap0, "Image Quality", 260, "Flash Exposure Compensation");
        com.apollographql.apollo.api.b.z(0x105, hashMap0, "Teleconverter Model", 274, "White Balance Fine Tune Value");
        com.apollographql.apollo.api.b.z(276, hashMap0, "Camera Settings", 277, "White Balance");
        com.apollographql.apollo.api.b.z(278, hashMap0, "Extra Info", 0xE00, "Print Image Matching (PIM) Info");
        com.apollographql.apollo.api.b.z(0x1000, hashMap0, "Multi Burst Mode", 0x1001, "Multi Burst Image Width");
        com.apollographql.apollo.api.b.z(0x1002, hashMap0, "Multi Burst Image Height", 0x1003, "Panorama");
        com.apollographql.apollo.api.b.z(0x2001, hashMap0, "Preview Image", 0x2002, "Rating");
        com.apollographql.apollo.api.b.z(0x2004, hashMap0, "Contrast", 0x2005, "Saturation");
        com.apollographql.apollo.api.b.z(0x2006, hashMap0, "Sharpness", 0x2007, "Brightness");
        com.apollographql.apollo.api.b.z(8200, hashMap0, "Long Exposure Noise Reduction", 0x2009, "High ISO Noise Reduction");
        com.apollographql.apollo.api.b.z(0x200A, hashMap0, "HDR", 0x200B, "Multi Frame Noise Reduction");
        com.apollographql.apollo.api.b.z(0x200E, hashMap0, "Picture Effect", 0x200F, "Soft Skin Effect");
        com.apollographql.apollo.api.b.z(8209, hashMap0, "Vignetting Correction", 8210, "Lateral Chromatic Aberration");
        com.apollographql.apollo.api.b.z(0x2013, hashMap0, "Distortion Correction", 0x2014, "WB Shift Amber/Magenta");
        com.apollographql.apollo.api.b.z(0x2016, hashMap0, "Auto Portrait Framing", 0x201B, "Focus Mode");
        com.apollographql.apollo.api.b.z(0x201E, hashMap0, "AF Point Selected", 0x3000, "Shot Info");
        com.apollographql.apollo.api.b.z(0xB000, hashMap0, "File Format", 0xB001, "Sony Model ID");
        com.apollographql.apollo.api.b.z(0xB020, hashMap0, "Color Mode Setting", 0xB021, "Color Temperature");
        com.apollographql.apollo.api.b.z(45090, hashMap0, "Color Compensation Filter", 0xB023, "Scene Mode");
        com.apollographql.apollo.api.b.z(0xB024, hashMap0, "Zone Matching", 0xB025, "Dynamic Range Optimizer");
        com.apollographql.apollo.api.b.z(0xB026, hashMap0, "Image Stabilisation", 0xB027, "Lens ID");
        com.apollographql.apollo.api.b.z(0xB028, hashMap0, "Minolta Makernote", 0xB029, "Color Mode");
        com.apollographql.apollo.api.b.z(0xB02A, hashMap0, "Lens Spec", 0xB02B, "Full Image Size");
        com.apollographql.apollo.api.b.z(45100, hashMap0, "Preview Image Size", 0xB040, "Macro");
        com.apollographql.apollo.api.b.z(0xB041, hashMap0, "Exposure Mode", 0xB042, "Focus Mode");
        com.apollographql.apollo.api.b.z(0xB043, hashMap0, "AF Mode", 0xB044, "AF Illuminator");
        com.apollographql.apollo.api.b.z(0xB047, hashMap0, "Quality", 0xB048, "Flash Level");
        com.apollographql.apollo.api.b.z(0xB049, hashMap0, "Release Mode", 0xB04A, "Sequence Number");
        com.apollographql.apollo.api.b.z(0xB04B, hashMap0, "Anti Blur", 0xB04E, "Long Exposure Noise Reduction");
        com.apollographql.apollo.api.b.z(0xB04F, hashMap0, "Dynamic Range Optimizer", 0xB050, "High ISO Noise Reduction");
        com.apollographql.apollo.api.b.z(0xB052, hashMap0, "Intelligent Auto", 0xB054, "White Balance 2");
        hashMap0.put(0xFFFF, "No Print");
    }

    public SonyType1MakernoteDirectory() {
        this.setDescriptor(new d(28, this));
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "Sony Makernote";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return SonyType1MakernoteDirectory._tagNameMap;
    }
}

