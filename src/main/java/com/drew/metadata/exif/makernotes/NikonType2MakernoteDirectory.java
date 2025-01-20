package com.drew.metadata.exif.makernotes;

import com.drew.metadata.b;
import java.util.HashMap;

public class NikonType2MakernoteDirectory extends b {
    public static final int TAG_ACTIVE_D_LIGHTING = 34;
    public static final int TAG_ADAPTER = 130;
    public static final int TAG_AE_BRACKET_COMPENSATION = 25;
    public static final int TAG_AF_FOCUS_POSITION = 0x88;
    public static final int TAG_AF_INFO_2 = 0xB7;
    public static final int TAG_AF_RESPONSE = 0xAD;
    public static final int TAG_AF_TUNE = 0xB9;
    public static final int TAG_AF_TYPE = 7;
    public static final int TAG_AUTO_FLASH_COMPENSATION = 18;
    public static final int TAG_AUTO_FLASH_MODE = 9;
    public static final int TAG_CAMERA_COLOR_MODE = 0x8D;
    public static final int TAG_CAMERA_HUE_ADJUSTMENT = 0x92;
    public static final int TAG_CAMERA_SERIAL_NUMBER = 29;
    public static final int TAG_CAMERA_SERIAL_NUMBER_2 = 0xA0;
    public static final int TAG_CAMERA_SHARPENING = 6;
    public static final int TAG_CAMERA_TONE_COMPENSATION = 0x81;
    public static final int TAG_CAMERA_WHITE_BALANCE = 5;
    public static final int TAG_CAMERA_WHITE_BALANCE_FINE = 11;
    public static final int TAG_CAMERA_WHITE_BALANCE_RB_COEFF = 12;
    public static final int TAG_COLOR_BALANCE = 0x97;
    public static final int TAG_COLOR_MODE = 3;
    public static final int TAG_COLOR_SPACE = 30;
    public static final int TAG_CONTRAST_CURVE = 140;
    public static final int TAG_CROP_HIGH_SPEED = 27;
    public static final int TAG_DATA_DUMP = 16;
    public static final int TAG_DATE_STAMP_MODE = 0x9D;
    public static final int TAG_DELETED_IMAGE_COUNT = 0xA6;
    public static final int TAG_DIGITAL_VARI_PROGRAM = 0xAB;
    public static final int TAG_DIGITAL_ZOOM = 0x86;
    public static final int TAG_DISTORT_INFO = 43;
    public static final int TAG_EXPOSURE_DIFFERENCE = 14;
    public static final int TAG_EXPOSURE_SEQUENCE_NUMBER = 0xA7;
    public static final int TAG_EXPOSURE_TUNING = 28;
    public static final int TAG_FACE_DETECT = 33;
    public static final int TAG_FILE_INFO = 0xB8;
    public static final int TAG_FIRMWARE_VERSION = 1;
    public static final int TAG_FLASH_BRACKET_COMPENSATION = 24;
    public static final int TAG_FLASH_EXPOSURE_COMPENSATION = 23;
    public static final int TAG_FLASH_INFO = 0xA8;
    public static final int TAG_FLASH_MODE = 26;
    public static final int TAG_FLASH_SYNC_MODE = 8;
    public static final int TAG_FLASH_USED = 0x87;
    public static final int TAG_HIGH_ISO_NOISE_REDUCTION = 0xB1;
    public static final int TAG_IMAGE_ADJUSTMENT = 0x80;
    public static final int TAG_IMAGE_AUTHENTICATION = 0x20;
    public static final int TAG_IMAGE_BOUNDARY = 22;
    public static final int TAG_IMAGE_COUNT = 0xA5;
    public static final int TAG_IMAGE_DATA_SIZE = 0xA2;
    public static final int TAG_IMAGE_OPTIMISATION = 0xA9;
    public static final int TAG_IMAGE_STABILISATION = 0xAC;
    public static final int TAG_ISO_1 = 2;
    public static final int TAG_ISO_INFO = 37;
    public static final int TAG_ISO_MODE = 15;
    public static final int TAG_ISO_REQUESTED = 19;
    public static final int TAG_LENS = 0x84;
    public static final int TAG_LENS_DATA = 0x98;
    public static final int TAG_LENS_STOPS = 0x8B;
    public static final int TAG_LENS_TYPE = 0x83;
    public static final int TAG_LIGHT_SOURCE = 0x90;
    public static final int TAG_LINEARIZATION_TABLE = 150;
    public static final int TAG_MANUAL_FOCUS_DISTANCE = 0x85;
    public static final int TAG_MULTI_EXPOSURE = 0xB0;
    public static final int TAG_NEF_BIT_DEPTH = 0xE22;
    public static final int TAG_NEF_COMPRESSION = 0x93;
    public static final int TAG_NEF_THUMBNAIL_SIZE = 0x99;
    public static final int TAG_NIKON_CAPTURE_DATA = 0xE01;
    public static final int TAG_NIKON_CAPTURE_OFFSETS = 0xE0E;
    public static final int TAG_NIKON_CAPTURE_VERSION = 0xE09;
    public static final int TAG_NIKON_SCAN = 3600;
    public static final int TAG_NOISE_REDUCTION = 0x95;
    public static final int TAG_PICTURE_CONTROL = 35;
    public static final int TAG_PICTURE_CONTROL_2 = 0xBD;
    public static final int TAG_POWER_UP_TIME = 0xB6;
    public static final int TAG_PREVIEW_IFD = 17;
    public static final int TAG_PRINT_IMAGE_MATCHING_INFO = 0xE00;
    public static final int TAG_PROGRAM_SHIFT = 13;
    public static final int TAG_QUALITY_AND_FILE_FORMAT = 4;
    public static final int TAG_RETOUCH_HISTORY = 0x9E;
    public static final int TAG_RETOUCH_INFO = 0xBB;
    public static final int TAG_SATURATION = 0x94;
    public static final int TAG_SATURATION_2 = 170;
    public static final int TAG_SCENE_ASSIST = 0x9C;
    public static final int TAG_SCENE_MODE = 0x8F;
    public static final int TAG_SENSOR_PIXEL_SIZE = 0x9A;
    public static final int TAG_SHOOTING_MODE = 0x89;
    public static final int TAG_SHOT_INFO = 0x91;
    public static final int TAG_TONING_EFFECT = 0xB3;
    public static final int TAG_UNKNOWN_10 = 0x9B;
    public static final int TAG_UNKNOWN_12 = 0x9F;
    public static final int TAG_UNKNOWN_20 = 0x8A;
    public static final int TAG_UNKNOWN_27 = 0xA3;
    public static final int TAG_UNKNOWN_28 = 0xA4;
    public static final int TAG_UNKNOWN_29 = 0xAE;
    public static final int TAG_UNKNOWN_30 = 0xAF;
    public static final int TAG_UNKNOWN_31 = 0xB2;
    public static final int TAG_UNKNOWN_33 = 180;
    public static final int TAG_UNKNOWN_34 = 10;
    public static final int TAG_UNKNOWN_36 = 38;
    public static final int TAG_UNKNOWN_37 = 39;
    public static final int TAG_UNKNOWN_38 = 40;
    public static final int TAG_UNKNOWN_39 = 41;
    public static final int TAG_UNKNOWN_41 = 44;
    public static final int TAG_UNKNOWN_42 = 45;
    public static final int TAG_UNKNOWN_43 = 46;
    public static final int TAG_UNKNOWN_44 = 0x2F;
    public static final int TAG_UNKNOWN_45 = 0x30;
    public static final int TAG_UNKNOWN_46 = 49;
    public static final int TAG_UNKNOWN_47 = 0x8E;
    public static final int TAG_UNKNOWN_48 = 0xB5;
    public static final int TAG_UNKNOWN_51 = 0x103;
    public static final int TAG_UNKNOWN_52 = 0xE05;
    public static final int TAG_UNKNOWN_53 = 0xE08;
    public static final int TAG_UNKNOWN_54 = 3609;
    public static final int TAG_UNKNOWN_55 = 0xE23;
    public static final int TAG_VIGNETTE_CONTROL = 42;
    public static final int TAG_VR_INFO = 0x1F;
    public static final int TAG_WORLD_TIME = 36;
    private static final int[] _decTable1;
    private static final int[] _decTable2;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        NikonType2MakernoteDirectory._tagNameMap = hashMap0;
        com.apollographql.apollo.api.b.z(1, hashMap0, "Firmware Version", 2, "ISO");
        com.apollographql.apollo.api.b.z(4, hashMap0, "Quality & File Format", 5, "White Balance");
        com.apollographql.apollo.api.b.z(6, hashMap0, "Sharpening", 7, "AF Type");
        com.apollographql.apollo.api.b.z(11, hashMap0, "White Balance Fine", 12, "White Balance RB Coefficients");
        com.apollographql.apollo.api.b.z(19, hashMap0, "ISO", 15, "ISO Mode");
        com.apollographql.apollo.api.b.z(16, hashMap0, "Data Dump", 13, "Program Shift");
        com.apollographql.apollo.api.b.z(14, hashMap0, "Exposure Difference", 17, "Preview IFD");
        com.apollographql.apollo.api.b.z(0x83, hashMap0, "Lens Type", 0x87, "Flash Used");
        com.apollographql.apollo.api.b.z(0x88, hashMap0, "AF Focus Position", 0x89, "Shooting Mode");
        com.apollographql.apollo.api.b.z(0x8B, hashMap0, "Lens Stops", 140, "Contrast Curve");
        com.apollographql.apollo.api.b.z(0x90, hashMap0, "Light source", 0x91, "Shot Info");
        com.apollographql.apollo.api.b.z(0x97, hashMap0, "Color Balance", 0x98, "Lens Data");
        com.apollographql.apollo.api.b.z(0x99, hashMap0, "NEF Thumbnail Size", 0x9A, "Sensor Pixel Size");
        com.apollographql.apollo.api.b.z(0x9B, hashMap0, "Unknown 10", 0x9C, "Scene Assist");
        com.apollographql.apollo.api.b.z(0x9D, hashMap0, "Date Stamp Mode", 0x9E, "Retouch History");
        com.apollographql.apollo.api.b.z(0x9F, hashMap0, "Unknown 12", 8, "Flash Sync Mode");
        com.apollographql.apollo.api.b.z(9, hashMap0, "Auto Flash Mode", 18, "Auto Flash Compensation");
        com.apollographql.apollo.api.b.z(0xA7, hashMap0, "Exposure Sequence Number", 3, "Color Mode");
        com.apollographql.apollo.api.b.z(0x8A, hashMap0, "Unknown 20", 22, "Image Boundary");
        com.apollographql.apollo.api.b.z(23, hashMap0, "Flash Exposure Compensation", 24, "Flash Bracket Compensation");
        com.apollographql.apollo.api.b.z(25, hashMap0, "AE Bracket Compensation", 26, "Flash Mode");
        com.apollographql.apollo.api.b.z(27, hashMap0, "Crop High Speed", 28, "Exposure Tuning");
        com.apollographql.apollo.api.b.z(29, hashMap0, "Camera Serial Number", 30, "Color Space");
        com.apollographql.apollo.api.b.z(0x1F, hashMap0, "VR Info", 0x20, "Image Authentication");
        com.apollographql.apollo.api.b.z(33, hashMap0, "Face Detect", 34, "Active D-Lighting");
        com.apollographql.apollo.api.b.z(35, hashMap0, "Picture Control", 36, "World Time");
        com.apollographql.apollo.api.b.z(37, hashMap0, "ISO Info", 38, "Unknown 36");
        com.apollographql.apollo.api.b.z(39, hashMap0, "Unknown 37", 40, "Unknown 38");
        com.apollographql.apollo.api.b.z(41, hashMap0, "Unknown 39", 42, "Vignette Control");
        com.apollographql.apollo.api.b.z(43, hashMap0, "Distort Info", 44, "Unknown 41");
        com.apollographql.apollo.api.b.z(45, hashMap0, "Unknown 42", 46, "Unknown 43");
        com.apollographql.apollo.api.b.z(0x2F, hashMap0, "Unknown 44", 0x30, "Unknown 45");
        com.apollographql.apollo.api.b.z(49, hashMap0, "Unknown 46", 0x8E, "Unknown 47");
        com.apollographql.apollo.api.b.z(0x8F, hashMap0, "Scene Mode", 0xA0, "Camera Serial Number");
        com.apollographql.apollo.api.b.z(0xA2, hashMap0, "Image Data Size", 0xA3, "Unknown 27");
        com.apollographql.apollo.api.b.z(0xA4, hashMap0, "Unknown 28", 0xA5, "Image Count");
        com.apollographql.apollo.api.b.z(0xA6, hashMap0, "Deleted Image Count", 170, "Saturation");
        com.apollographql.apollo.api.b.z(0xAB, hashMap0, "Digital Vari Program", 0xAC, "Image Stabilisation");
        com.apollographql.apollo.api.b.z(0xAD, hashMap0, "AF Response", 0xAE, "Unknown 29");
        com.apollographql.apollo.api.b.z(0xAF, hashMap0, "Unknown 30", 0xB0, "Multi Exposure");
        com.apollographql.apollo.api.b.z(0xB1, hashMap0, "High ISO Noise Reduction", 0xB2, "Unknown 31");
        com.apollographql.apollo.api.b.z(0xB3, hashMap0, "Toning Effect", 180, "Unknown 33");
        com.apollographql.apollo.api.b.z(0xB5, hashMap0, "Unknown 48", 0xB6, "Power Up Time");
        com.apollographql.apollo.api.b.z(0xB7, hashMap0, "AF Info 2", 0xB8, "File Info");
        com.apollographql.apollo.api.b.z(0xB9, hashMap0, "AF Tune", 0xA8, "Flash Info");
        com.apollographql.apollo.api.b.z(0xA9, hashMap0, "Image Optimisation", 0x80, "Image Adjustment");
        com.apollographql.apollo.api.b.z(0x81, hashMap0, "Tone Compensation", 130, "Adapter");
        com.apollographql.apollo.api.b.z(0x84, hashMap0, "Lens", 0x85, "Manual Focus Distance");
        com.apollographql.apollo.api.b.z(0x86, hashMap0, "Digital Zoom", 0x8D, "Colour Mode");
        com.apollographql.apollo.api.b.z(0x92, hashMap0, "Camera Hue Adjustment", 0x93, "NEF Compression");
        com.apollographql.apollo.api.b.z(0x94, hashMap0, "Saturation", 0x95, "Noise Reduction");
        com.apollographql.apollo.api.b.z(150, hashMap0, "Linearization Table", 0xE01, "Nikon Capture Data");
        com.apollographql.apollo.api.b.z(0xBB, hashMap0, "Retouch Info", 0xBD, "Picture Control 2");
        com.apollographql.apollo.api.b.z(0x103, hashMap0, "Unknown 51", 0xE00, "Print IM");
        com.apollographql.apollo.api.b.z(0xE05, hashMap0, "Unknown 52", 0xE08, "Unknown 53");
        com.apollographql.apollo.api.b.z(0xE09, hashMap0, "Nikon Capture Version", 0xE0E, "Nikon Capture Offsets");
        com.apollographql.apollo.api.b.z(3600, hashMap0, "Nikon Scan", 3609, "Unknown 54");
        com.apollographql.apollo.api.b.z(0xE22, hashMap0, "NEF Bit Depth", 0xE23, "Unknown 55");
        NikonType2MakernoteDirectory._decTable1 = new int[]{0xC1, 0xBF, 109, 13, 89, 0xC5, 19, 0x9D, 0x83, 97, 107, 0x4F, 0xC7, 0x7F, 61, 61, 83, 89, 0xE3, 0xC7, 0xE9, 0x2F, 0x95, 0xA7, 0x95, 0x1F, 0xDF, 0x7F, 43, 41, 0xC7, 13, 0xDF, 7, 0xEF, 0x71, 0x89, 61, 19, 61, 59, 19, 0xFB, 13, 0x89, 0xC1, 101, 0x1F, 0xB3, 13, 107, 41, 0xE3, 0xFB, 0xEF, 0xA3, 107, 71, 0x7F, 0x95, 53, 0xA7, 71, 0x4F, 0xC7, 0xF1, 89, 0x95, 53, 17, 41, 97, 0xF1, 61, 0xB3, 43, 13, 67, 0x89, 0xC1, 0x9D, 0x9D, 0x89, 101, 0xF1, 0xE9, 0xDF, 0xBF, 61, 0x7F, 83, 0x97, 0xE5, 0xE9, 0x95, 23, 29, 61, 0x8B, 0xFB, 0xC7, 0xE3, 103, 0xA7, 7, 0xF1, 0x71, 0xA7, 83, 0xB5, 41, 0x89, 0xE5, 43, 0xA7, 23, 41, 0xE9, 0x4F, 0xC5, 101, 109, 107, 0xEF, 13, 0x89, 73, 0x2F, 0xB3, 67, 83, 101, 29, 73, 0xA3, 19, 0x89, 89, 0xEF, 107, 0xEF, 101, 29, 11, 89, 19, 0xE3, 0x4F, 0x9D, 0xB3, 41, 67, 43, 7, 29, 0x95, 89, 89, 71, 0xFB, 0xE5, 0xE9, 97, 71, 0x2F, 53, 0x7F, 23, 0x7F, 0xEF, 0x7F, 0x95, 0x95, 0x71, 0xD3, 0xA3, 11, 0x71, 0xA3, 0xAD, 11, 59, 0xB5, 0xFB, 0xA3, 0xBF, 0x4F, 0x83, 29, 0xAD, 0xE9, 0x2F, 0x71, 101, 0xA3, 0xE5, 7, 53, 61, 13, 0xB5, 0xE9, 0xE5, 71, 59, 0x9D, 0xEF, 53, 0xA3, 0xBF, 0xB3, 0xDF, 83, 0xD3, 0x97, 83, 73, 0x71, 7, 53, 97, 0x71, 0x2F, 67, 0x2F, 17, 0xDF, 23, 0x97, 0xFB, 0x95, 59, 0x7F, 107, 0xD3, 37, 0xBF, 0xAD, 0xC7, 0xC5, 0xC5, 0xB5, 0x8B, 0xEF, 0x2F, 0xD3, 7, 107, 37, 73, 0x95, 37, 73, 109, 0x71, 0xC7};
        NikonType2MakernoteDirectory._decTable2 = new int[]{0xA7, 0xBC, 201, 0xAD, 0x91, 0xDF, 0x85, 0xE5, 0xD4, 120, 0xD5, 23, 70, 0x7C, 41, 76, 77, 3, 0xE9, 37, 104, 17, 0x86, 0xB3, 0xBD, 0xF7, 0x6F, 97, 34, 0xA2, 38, 52, 42, 190, 30, 70, 20, 104, 0x9D, 68, 24, 0xC2, 0x40, 0xF4, 0x7E, 0x5F, 27, 0xAD, 11, 0x94, 0xB6, 103, 180, 11, 0xE1, 0xEA, 0x95, 0x9C, 102, 220, 0xE7, 93, 108, 5, 0xDA, 0xD5, 0xDF, 0x7A, 0xEF, 0xF6, 0xDB, 0x1F, 130, 76, 0xC0, 104, 71, 0xA1, 0xBD, 0xEE, 57, 80, 86, 74, 0xDD, 0xDF, 0xA5, 0xF8, 0xC6, 0xDA, 202, 0x90, 202, 1, 66, 0x9D, 0x8B, 12, 0x73, 67, 0x75, 5, 0x94, 0xDE, 36, 0xB3, 0x80, 52, 0xE5, 44, 220, 0x9B, 0x3F, 202, 51, 69, 0xD0, 0xDB, 0x5F, 0xF5, 82, 0xC3, 33, 0xDA, 0xE2, 34, 0x72, 107, 62, 0xD0, 91, 0xA8, 0x87, 140, 6, 93, 15, 0xDD, 9, 25, 0x93, 0xD0, 0xB9, 0xFC, 0x8B, 15, 0x84, 0x60, 51, 28, 0x9B, 69, 0xF1, 0xF0, 0xA3, 0x94, 58, 18, 0x77, 51, 77, 68, 120, 40, 60, 0x9E, 0xFD, 101, 87, 22, 0x94, 107, 0xFB, 89, 0xD0, 200, 34, 54, 0xDB, 210, 99, 0x98, 67, 0xA1, 4, 0x87, 0x86, 0xF7, 0xA6, 38, 0xBB, 0xD6, 89, 77, 0xBF, 106, 46, 170, 43, 0xEF, 230, 120, 0xB6, 78, 0xE0, 0x2F, 220, 0x7C, 190, 87, 25, 50, 0x7E, 42, 0xD0, 0xB8, 0xBA, 41, 0, 60, 82, 0x7D, 0xA8, 73, 59, 45, 0xEB, 37, 73, 0xFA, 0xA3, 170, 57, 0xA7, 0xC5, 0xA7, 80, 17, 54, 0xFB, 0xC6, 103, 74, 0xF5, 0xA5, 18, 101, 0x7E, 0xB0, 0xDF, 0xAF, 78, 0xB3, 97, 0x7F, 0x2F};
    }

    public NikonType2MakernoteDirectory() {
        this.setDescriptor(new d(14, this));
    }

    public int[] getDecryptedIntArray(int v) {
        int[] arr_v = this.getIntArray(v);
        Integer integer0 = this.getInteger(29);
        Integer integer1 = this.getInteger(0xA7);
        if(arr_v != null && integer0 != null && integer1 != null) {
            int v2 = 0;
            for(int v1 = 0; v1 < 4; ++v1) {
                v2 ^= ((int)integer1) >> v1 * 8 & 0xFF;
            }
            int v4 = NikonType2MakernoteDirectory._decTable1[((int)integer0) & 0xFF];
            int v5 = NikonType2MakernoteDirectory._decTable2[v2];
            int v6 = 0x60;
            for(int v3 = 4; v3 < arr_v.length; ++v3) {
                v5 = v4 * v6 + v5 & 0xFF;
                v6 = v6 + 1 & 0xFF;
                arr_v[v3] ^= v5;
            }
            return arr_v;
        }
        return null;
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "Nikon Makernote";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return NikonType2MakernoteDirectory._tagNameMap;
    }
}

