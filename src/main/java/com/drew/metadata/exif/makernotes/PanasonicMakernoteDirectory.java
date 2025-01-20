package com.drew.metadata.exif.makernotes;

import com.drew.metadata.a;
import com.drew.metadata.b;
import com.drew.metadata.c;
import java.io.IOException;
import java.util.HashMap;

public class PanasonicMakernoteDirectory extends b {
    public static final int TAG_ACCELEROMETER_X = 0x8D;
    public static final int TAG_ACCELEROMETER_Y = 0x8E;
    public static final int TAG_ACCELEROMETER_Z = 140;
    public static final int TAG_ACCESSORY_SERIAL_NUMBER = 84;
    public static final int TAG_ACCESSORY_TYPE = 83;
    public static final int TAG_ADVANCED_SCENE_MODE = 61;
    public static final int TAG_AF_AREA_MODE = 15;
    public static final int TAG_AF_ASSIST_LAMP = 49;
    public static final int TAG_AF_POINT_POSITION = 77;
    public static final int TAG_AUDIO = 0x20;
    public static final int TAG_BABY_AGE = 51;
    public static final int TAG_BABY_AGE_1 = 0x8010;
    public static final int TAG_BABY_NAME = 102;
    public static final int TAG_BRACKET_SETTINGS = 69;
    public static final int TAG_BURST_MODE = 42;
    public static final int TAG_BURST_SPEED = 0x77;
    public static final int TAG_CAMERA_ORIENTATION = 0x8F;
    public static final int TAG_CITY = 109;
    public static final int TAG_CITY2 = 0x80;
    public static final int TAG_CLEAR_RETOUCH = 0x7C;
    public static final int TAG_CLEAR_RETOUCH_VALUE = 0xA3;
    public static final int TAG_COLOR_EFFECT = 40;
    public static final int TAG_COLOR_MODE = 50;
    public static final int TAG_COLOR_TEMP_KELVIN = 68;
    public static final int TAG_CONTRAST = 57;
    public static final int TAG_CONTRAST_MODE = 44;
    public static final int TAG_CONVERSION_LENS = 53;
    public static final int TAG_COUNTRY = 105;
    public static final int TAG_EASY_MODE = 34;
    public static final int TAG_EXIF_VERSION = 38;
    public static final int TAG_FACES_DETECTED = 0x3F;
    public static final int TAG_FACE_DETECTION_INFO = 78;
    public static final int TAG_FACE_RECOGNITION_INFO = 97;
    public static final int TAG_FILM_MODE = 66;
    public static final int TAG_FIRMWARE_VERSION = 2;
    public static final int TAG_FLASH_BIAS = 36;
    public static final int TAG_FLASH_CURTAIN = 72;
    public static final int TAG_FLASH_FIRED = 0x8007;
    public static final int TAG_FLASH_WARNING = 98;
    public static final int TAG_FOCUS_MODE = 7;
    public static final int TAG_HDR = 0x9E;
    public static final int TAG_IMAGE_STABILIZATION = 26;
    public static final int TAG_INTELLIGENT_D_RANGE = 0x79;
    public static final int TAG_INTELLIGENT_EXPOSURE = 93;
    public static final int TAG_INTELLIGENT_RESOLUTION = 0x70;
    public static final int TAG_INTERNAL_ND_FILTER = 0x9D;
    public static final int TAG_INTERNAL_SERIAL_NUMBER = 37;
    public static final int TAG_LANDMARK = 0x6F;
    public static final int TAG_LENS_FIRMWARE_VERSION = 0x60;
    public static final int TAG_LENS_SERIAL_NUMBER = 82;
    public static final int TAG_LENS_TYPE = 81;
    public static final int TAG_LOCATION = 103;
    public static final int TAG_LONG_EXPOSURE_NOISE_REDUCTION = 73;
    public static final int TAG_MACRO_MODE = 28;
    public static final int TAG_MAKERNOTE_VERSION = 0x8000;
    public static final int TAG_NOISE_REDUCTION = 45;
    public static final int TAG_OPTICAL_ZOOM_MODE = 52;
    public static final int TAG_PANASONIC_IMAGE_HEIGHT = 76;
    public static final int TAG_PANASONIC_IMAGE_WIDTH = 75;
    public static final int TAG_PHOTO_STYLE = 0x89;
    public static final int TAG_PITCH_ANGLE = 0x91;
    public static final int TAG_PRINT_IMAGE_MATCHING_INFO = 0xE00;
    public static final int TAG_PROGRAM_ISO = 60;
    public static final int TAG_QUALITY_MODE = 1;
    public static final int TAG_RECOGNIZED_FACE_FLAGS = 99;
    public static final int TAG_RECORD_MODE = 0x1F;
    public static final int TAG_ROLL_ANGLE = 0x90;
    public static final int TAG_ROTATION = 0x30;
    public static final int TAG_SATURATION = 0x40;
    public static final int TAG_SCENE_MODE = 0x8001;
    public static final int TAG_SELF_TIMER = 46;
    public static final int TAG_SEQUENCE_NUMBER = 43;
    public static final int TAG_SHADING_COMPENSATION = 0x8A;
    public static final int TAG_SHARPNESS = 65;
    public static final int TAG_SHUTTER_TYPE = 0x9F;
    public static final int TAG_STATE = 107;
    public static final int TAG_SWEEP_PANORAMA_DIRECTION = 0x93;
    public static final int TAG_SWEEP_PANORAMA_FIELD_OF_VIEW = 0x94;
    public static final int TAG_TEXT_STAMP = 59;
    public static final int TAG_TEXT_STAMP_1 = 62;
    public static final int TAG_TEXT_STAMP_2 = 0x8008;
    public static final int TAG_TEXT_STAMP_3 = 0x8009;
    public static final int TAG_TIMER_RECORDING = 150;
    public static final int TAG_TITLE = 101;
    public static final int TAG_TOUCH_AE = 0xAB;
    public static final int TAG_TRANSFORM = 89;
    public static final int TAG_TRANSFORM_1 = 0x8012;
    public static final int TAG_TRAVEL_DAY = 54;
    public static final int TAG_UNKNOWN_DATA_DUMP = 33;
    public static final int TAG_UPTIME = 41;
    public static final int TAG_WB_ADJUST_AB = 70;
    public static final int TAG_WB_ADJUST_GM = 71;
    public static final int TAG_WB_BLUE_LEVEL = 0x8006;
    public static final int TAG_WB_GREEN_LEVEL = 0x8005;
    public static final int TAG_WB_RED_LEVEL = 0x8004;
    public static final int TAG_WHITE_BALANCE = 3;
    public static final int TAG_WHITE_BALANCE_BIAS = 35;
    public static final int TAG_WORLD_TIME_LOCATION = 58;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        PanasonicMakernoteDirectory._tagNameMap = hashMap0;
        com.apollographql.apollo.api.b.z(1, hashMap0, "Quality Mode", 2, "Version");
        com.apollographql.apollo.api.b.z(3, hashMap0, "White Balance", 7, "Focus Mode");
        com.apollographql.apollo.api.b.z(15, hashMap0, "AF Area Mode", 26, "Image Stabilization");
        com.apollographql.apollo.api.b.z(28, hashMap0, "Macro Mode", 0x1F, "Record Mode");
        com.apollographql.apollo.api.b.z(0x20, hashMap0, "Audio", 37, "Internal Serial Number");
        com.apollographql.apollo.api.b.z(33, hashMap0, "Unknown Data Dump", 34, "Easy Mode");
        com.apollographql.apollo.api.b.z(35, hashMap0, "White Balance Bias", 36, "Flash Bias");
        com.apollographql.apollo.api.b.z(38, hashMap0, "Exif Version", 40, "Color Effect");
        com.apollographql.apollo.api.b.z(41, hashMap0, "Camera Uptime", 42, "Burst Mode");
        com.apollographql.apollo.api.b.z(43, hashMap0, "Sequence Number", 44, "Contrast Mode");
        com.apollographql.apollo.api.b.z(45, hashMap0, "Noise Reduction", 46, "Self Timer");
        com.apollographql.apollo.api.b.z(0x30, hashMap0, "Rotation", 49, "AF Assist Lamp");
        com.apollographql.apollo.api.b.z(50, hashMap0, "Color Mode", 51, "Baby Age");
        com.apollographql.apollo.api.b.z(52, hashMap0, "Optical Zoom Mode", 53, "Conversion Lens");
        com.apollographql.apollo.api.b.z(54, hashMap0, "Travel Day", 57, "Contrast");
        com.apollographql.apollo.api.b.z(58, hashMap0, "World Time Location", 59, "Text Stamp");
        com.apollographql.apollo.api.b.z(60, hashMap0, "Program ISO", 61, "Advanced Scene Mode");
        com.apollographql.apollo.api.b.z(0xE00, hashMap0, "Print Image Matching (PIM) Info", 0x3F, "Number of Detected Faces");
        com.apollographql.apollo.api.b.z(0x40, hashMap0, "Saturation", 65, "Sharpness");
        com.apollographql.apollo.api.b.z(66, hashMap0, "Film Mode", 68, "Color Temp Kelvin");
        com.apollographql.apollo.api.b.z(69, hashMap0, "Bracket Settings", 70, "White Balance Adjust (AB)");
        com.apollographql.apollo.api.b.z(71, hashMap0, "White Balance Adjust (GM)", 72, "Flash Curtain");
        com.apollographql.apollo.api.b.z(73, hashMap0, "Long Exposure Noise Reduction", 75, "Panasonic Image Width");
        com.apollographql.apollo.api.b.z(76, hashMap0, "Panasonic Image Height", 77, "Af Point Position");
        com.apollographql.apollo.api.b.z(78, hashMap0, "Face Detection Info", 81, "Lens Type");
        com.apollographql.apollo.api.b.z(82, hashMap0, "Lens Serial Number", 83, "Accessory Type");
        com.apollographql.apollo.api.b.z(84, hashMap0, "Accessory Serial Number", 89, "Transform");
        com.apollographql.apollo.api.b.z(93, hashMap0, "Intelligent Exposure", 0x60, "Lens Firmware Version");
        com.apollographql.apollo.api.b.z(97, hashMap0, "Face Recognition Info", 98, "Flash Warning");
        com.apollographql.apollo.api.b.z(99, hashMap0, "Recognized Face Flags", 101, "Title");
        com.apollographql.apollo.api.b.z(102, hashMap0, "Baby Name", 103, "Location");
        com.apollographql.apollo.api.b.z(105, hashMap0, "Country", 107, "State");
        com.apollographql.apollo.api.b.z(109, hashMap0, "City", 0x6F, "Landmark");
        com.apollographql.apollo.api.b.z(0x70, hashMap0, "Intelligent Resolution", 0x77, "Burst Speed");
        com.apollographql.apollo.api.b.z(0x79, hashMap0, "Intelligent D-Range", 0x7C, "Clear Retouch");
        com.apollographql.apollo.api.b.z(0x80, hashMap0, "City 2", 0x89, "Photo Style");
        com.apollographql.apollo.api.b.z(0x8A, hashMap0, "Shading Compensation", 140, "Accelerometer Z");
        com.apollographql.apollo.api.b.z(0x8D, hashMap0, "Accelerometer X", 0x8E, "Accelerometer Y");
        com.apollographql.apollo.api.b.z(0x8F, hashMap0, "Camera Orientation", 0x90, "Roll Angle");
        com.apollographql.apollo.api.b.z(0x91, hashMap0, "Pitch Angle", 0x93, "Sweep Panorama Direction");
        com.apollographql.apollo.api.b.z(0x94, hashMap0, "Sweep Panorama Field Of View", 150, "Timer Recording");
        com.apollographql.apollo.api.b.z(0x9D, hashMap0, "Internal ND Filter", 0x9E, "HDR");
        com.apollographql.apollo.api.b.z(0x9F, hashMap0, "Shutter Type", 0xA3, "Clear Retouch Value");
        com.apollographql.apollo.api.b.z(0xAB, hashMap0, "Touch AE", 0x8000, "Makernote Version");
        com.apollographql.apollo.api.b.z(0x8001, hashMap0, "Scene Mode", 0x8004, "White Balance (Red)");
        com.apollographql.apollo.api.b.z(0x8005, hashMap0, "White Balance (Green)", 0x8006, "White Balance (Blue)");
        com.apollographql.apollo.api.b.z(0x8007, hashMap0, "Flash Fired", 62, "Text Stamp 1");
        com.apollographql.apollo.api.b.z(0x8008, hashMap0, "Text Stamp 2", 0x8009, "Text Stamp 3");
        com.apollographql.apollo.api.b.z(0x8010, hashMap0, "Baby Age 1", 0x8012, "Transform 1");
    }

    public PanasonicMakernoteDirectory() {
        this.setDescriptor(new d(1, this));
    }

    public a getAge(int v) {
        String s = this.getString(v);
        return s == null ? null : a.b(s);
    }

    public c[] getDetectedFaces() {
        byte[] arr_b = this.getByteArray(78);
        if(arr_b == null) {
            return null;
        }
        l4.b b0 = new l4.b(0, arr_b);
        b0.a = false;
        try {
            int v1 = b0.y(0);
            if(v1 == 0) {
                return null;
            }
            c[] arr_c = new c[v1];
            for(int v = 0; v < v1; ++v) {
                arr_c[v] = new c(b0.y(v * 8 + 2), b0.y(v * 8 + 4), b0.y(v * 8 + 6), b0.y(v * 8 + 8), null, null);
            }
            return arr_c;
        }
        catch(IOException unused_ex) {
            return null;
        }
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "Panasonic Makernote";
    }

    public c[] getRecognizedFaces() {
        byte[] arr_b = this.getByteArray(97);
        if(arr_b == null) {
            return null;
        }
        l4.b b0 = new l4.b(0, arr_b);
        b0.a = false;
        try {
            int v1 = b0.y(0);
            if(v1 == 0) {
                return null;
            }
            c[] arr_c = new c[v1];
            for(int v = 0; v < v1; ++v) {
                String s = b0.t(v * 44 + 4, 20, "ASCII").trim();
                String s1 = b0.t(v * 44 + 0x20, 20, "ASCII").trim();
                arr_c[v] = new c(b0.y(v * 44 + 24), b0.y(v * 44 + 26), b0.y(v * 44 + 28), b0.y(v * 44 + 30), s, a.b(s1));
            }
            return arr_c;
        }
        catch(IOException unused_ex) {
            return null;
        }
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return PanasonicMakernoteDirectory._tagNameMap;
    }
}

