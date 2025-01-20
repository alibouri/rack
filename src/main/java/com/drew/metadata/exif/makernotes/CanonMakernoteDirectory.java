package com.drew.metadata.exif.makernotes;

import com.drew.metadata.b;
import java.util.HashMap;

public class CanonMakernoteDirectory extends b {
    private static final int TAG_AF_INFO_ARRAY = 18;
    public static final int TAG_AF_INFO_ARRAY_2 = 38;
    public static final int TAG_AF_POINTS_IN_FOCUS_1D = 0x94;
    public static final int TAG_AMBIANCE_INFO_ARRAY = 0x4020;
    public static final int TAG_ASPECT_INFO_ARRAY = 0x9A;
    public static final int TAG_BLACK_LEVEL = 0x4008;
    public static final int TAG_CAMERA_INFO_ARRAY = 13;
    private static final int TAG_CAMERA_SETTINGS_ARRAY = 1;
    public static final int TAG_CANON_CUSTOM_FUNCTIONS_ARRAY = 15;
    public static final int TAG_CANON_FILE_LENGTH = 14;
    public static final int TAG_CANON_FIRMWARE_VERSION = 7;
    public static final int TAG_CANON_FLAGS_ARRAY = 0xB0;
    public static final int TAG_CANON_IMAGE_NUMBER = 8;
    public static final int TAG_CANON_IMAGE_TYPE = 6;
    public static final int TAG_CANON_OWNER_NAME = 9;
    public static final int TAG_CANON_SERIAL_NUMBER = 12;
    public static final int TAG_CATEGORIES = 35;
    public static final int TAG_COLOR_BALANCE_ARRAY = 0xA9;
    public static final int TAG_COLOR_DATA_ARRAY_2 = 0x4001;
    public static final int TAG_COLOR_INFO_ARRAY = 0x4013;
    public static final int TAG_COLOR_INFO_ARRAY_2 = 0x4003;
    public static final int TAG_COLOR_SPACE = 180;
    public static final int TAG_COLOR_TEMPERATURE = 0xAE;
    public static final int TAG_CROP_INFO = 0x98;
    public static final int TAG_CRW_PARAM = 0x4002;
    public static final int TAG_CUSTOM_FUNCTIONS_1D_ARRAY = 0x90;
    public static final int TAG_CUSTOM_FUNCTIONS_ARRAY_2 = 0x99;
    public static final int TAG_CUSTOM_PICTURE_STYLE_FILE_NAME = 0x4010;
    public static final int TAG_DATE_STAMP_MODE = 28;
    public static final int TAG_DUST_REMOVAL_DATA = 0x97;
    public static final int TAG_FACE_DETECT_ARRAY_1 = 36;
    public static final int TAG_FACE_DETECT_ARRAY_2 = 37;
    public static final int TAG_FILE_INFO_ARRAY = 0x93;
    public static final int TAG_FILTER_INFO_ARRAY = 0x4024;
    public static final int TAG_FIRMWARE_REVISION = 30;
    private static final int TAG_FOCAL_LENGTH_ARRAY = 2;
    public static final int TAG_IMAGE_UNIQUE_ID = 40;
    public static final int TAG_LENS_INFO_ARRAY = 0x4019;
    public static final int TAG_LENS_MODEL = 0x95;
    public static final int TAG_LIGHTING_OPTIMIZER_ARRAY = 0x4018;
    public static final int TAG_MEASURED_COLOR_ARRAY = 170;
    public static final int TAG_MODEL_ID = 16;
    public static final int TAG_MODIFIED_INFO_ARRAY = 0xB1;
    public static final int TAG_MOVIE_INFO_ARRAY = 17;
    public static final int TAG_MY_COLORS = 29;
    public static final int TAG_ORIGINAL_DECISION_DATA_OFFSET = 0x83;
    private static final int TAG_PANORAMA_ARRAY = 5;
    public static final int TAG_PERSONAL_FUNCTIONS_ARRAY = 0x91;
    public static final int TAG_PERSONAL_FUNCTION_VALUES_ARRAY = 0x92;
    public static final int TAG_PREVIEW_IMAGE_INFO_ARRAY = 0xB6;
    public static final int TAG_PROCESSING_INFO_ARRAY = 0xA0;
    public static final int TAG_RAW_DATA_OFFSET = 0x81;
    public static final int TAG_SENSOR_INFO_ARRAY = 0xE0;
    public static final int TAG_SERIAL_INFO_ARRAY = 150;
    public static final int TAG_SERIAL_NUMBER_FORMAT = 21;
    public static final int TAG_SHARPNESS_FREQ_TABLE = 0xA3;
    public static final int TAG_SHARPNESS_TABLE = 0xA2;
    private static final int TAG_SHOT_INFO_ARRAY = 4;
    public static final int TAG_SUPER_MACRO = 26;
    public static final int TAG_THUMBNAIL_IMAGE_VALID_AREA = 19;
    public static final int TAG_TONE_CURVE_MATCHING = 0xB2;
    public static final int TAG_TONE_CURVE_TABLE = 0xA1;
    public static final int TAG_VIGNETTING_CORRECTION_ARRAY_1 = 0x4015;
    public static final int TAG_VIGNETTING_CORRECTION_ARRAY_2 = 0x4016;
    public static final int TAG_VRD_OFFSET = 0xD0;
    public static final int TAG_WHITE_BALANCE_MATCHING = 0xB3;
    public static final int TAG_WHITE_BALANCE_TABLE = 0xA4;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        CanonMakernoteDirectory._tagNameMap = hashMap0;
        com.apollographql.apollo.api.b.z(7, hashMap0, "Firmware Version", 8, "Image Number");
        com.apollographql.apollo.api.b.z(6, hashMap0, "Image Type", 9, "Owner Name");
        com.apollographql.apollo.api.b.z(12, hashMap0, "Camera Serial Number", 13, "Camera Info Array");
        com.apollographql.apollo.api.b.z(14, hashMap0, "File Length", 15, "Custom Functions");
        com.apollographql.apollo.api.b.z(16, hashMap0, "Canon Model ID", 17, "Movie Info Array");
        com.apollographql.apollo.api.b.z(0xC113, hashMap0, "AF Point Selected", 0xC105, "Continuous Drive Mode");
        com.apollographql.apollo.api.b.z(0xC10D, hashMap0, "Contrast", 0xC10B, "Easy Shooting Mode");
        com.apollographql.apollo.api.b.z(0xC114, hashMap0, "Exposure Mode", 0xC11D, "Flash Details");
        com.apollographql.apollo.api.b.z(0xC104, hashMap0, "Flash Mode", 0xC119, "Focal Units per mm");
        com.apollographql.apollo.api.b.z(0xC107, hashMap0, "Focus Mode", 0xC120, "Focus Mode");
        com.apollographql.apollo.api.b.z(0xC10A, hashMap0, "Image Size", 0xC110, "Iso");
        com.apollographql.apollo.api.b.z(0xC117, hashMap0, "Long Focal Length", 0xC101, "Macro Mode");
        com.apollographql.apollo.api.b.z(0xC111, hashMap0, "Metering Mode", 0xC10E, "Saturation");
        com.apollographql.apollo.api.b.z(0xC102, hashMap0, "Self Timer Delay", 0xC10F, "Sharpness");
        com.apollographql.apollo.api.b.z(0xC118, hashMap0, "Short Focal Length", 0xC103, "Quality");
        com.apollographql.apollo.api.b.z(0xC106, hashMap0, "Unknown Camera Setting 2", 0xC108, "Unknown Camera Setting 3");
        com.apollographql.apollo.api.b.z(0xC109, hashMap0, "Record Mode", 0xC10C, "Digital Zoom");
        com.apollographql.apollo.api.b.z(0xC112, hashMap0, "Focus Type", 0xC115, "Unknown Camera Setting 7");
        com.apollographql.apollo.api.b.z(49430, hashMap0, "Lens Type", 0xC11A, "Max Aperture");
        com.apollographql.apollo.api.b.z(0xC11B, hashMap0, "Min Aperture", 0xC11C, "Flash Activity");
        com.apollographql.apollo.api.b.z(0xC11E, hashMap0, "Focus Continuous", 0xC11F, "AE Setting");
        com.apollographql.apollo.api.b.z(0xC121, hashMap0, "Display Aperture", 0xC122, "Zoom Source Width");
        com.apollographql.apollo.api.b.z(0xC123, hashMap0, "Zoom Target Width", 0xC125, "Spot Metering Mode");
        com.apollographql.apollo.api.b.z(0xC126, hashMap0, "Photo Effect", 0xC127, "Manual Flash Output");
        com.apollographql.apollo.api.b.z(0xC129, hashMap0, "Color Tone", 0xC12D, "SRAW Quality");
        com.apollographql.apollo.api.b.z(0xC207, hashMap0, "White Balance", 0xC209, "Sequence Number");
        com.apollographql.apollo.api.b.z(0xC20E, hashMap0, "AF Point Used", 0xC20F, "Flash Bias");
        com.apollographql.apollo.api.b.z(0xC210, hashMap0, "Auto Exposure Bracketing", 0xC211, "AEB Bracket Value");
        com.apollographql.apollo.api.b.z(0xC213, hashMap0, "Subject Distance", 0xC401, "Auto ISO");
        com.apollographql.apollo.api.b.z(0xC402, hashMap0, "Base ISO", 0xC403, "Measured EV");
        com.apollographql.apollo.api.b.z(50180, hashMap0, "Target Aperture", 0xC405, "Target Exposure Time");
        com.apollographql.apollo.api.b.z(0xC406, hashMap0, "Exposure Compensation", 0xC407, "White Balance");
        com.apollographql.apollo.api.b.z(0xC408, hashMap0, "Slow Shutter", 0xC409, "Sequence Number");
        com.apollographql.apollo.api.b.z(0xC40A, hashMap0, "Optical Zoom Code", 0xC40C, "Camera Temperature");
        com.apollographql.apollo.api.b.z(0xC40D, hashMap0, "Flash Guide Number", 50190, "AF Points in Focus");
        com.apollographql.apollo.api.b.z(0xC40F, hashMap0, "Flash Exposure Compensation", 0xC410, "Auto Exposure Bracketing");
        com.apollographql.apollo.api.b.z(50193, hashMap0, "AEB Bracket Value", 50194, "Control Mode");
        com.apollographql.apollo.api.b.z(50195, hashMap0, "Focus Distance Upper", 50196, "Focus Distance Lower");
        com.apollographql.apollo.api.b.z(50197, hashMap0, "F Number", 50198, "Exposure Time");
        com.apollographql.apollo.api.b.z(50199, hashMap0, "Measured EV 2", 50200, "Bulb Duration");
        com.apollographql.apollo.api.b.z(50202, hashMap0, "Camera Type", 50203, "Auto Rotate");
        com.apollographql.apollo.api.b.z(50204, hashMap0, "ND Filter", 50205, "Self Timer 2");
        com.apollographql.apollo.api.b.z(50209, hashMap0, "Flash Output", 0xC502, "Panorama Frame Number");
        com.apollographql.apollo.api.b.z(0xC505, hashMap0, "Panorama Direction", 0xD200, "AF Point Count");
        com.apollographql.apollo.api.b.z(0xD201, hashMap0, "Valid AF Point Count", 0xD202, "Image Width");
        com.apollographql.apollo.api.b.z(0xD203, hashMap0, "Image Height", 0xD204, "AF Image Width");
        com.apollographql.apollo.api.b.z(0xD205, hashMap0, "AF Image Height", 0xD206, "AF Area Width");
        com.apollographql.apollo.api.b.z(0xD207, hashMap0, "AF Area Height", 0xD208, "AF Area X Positions");
        com.apollographql.apollo.api.b.z(0xD209, hashMap0, "AF Area Y Positions", 0xD20A, "AF Points in Focus");
        com.apollographql.apollo.api.b.z(0xD20B, hashMap0, "Primary AF Point 1", 0xD20C, "Primary AF Point 2");
        com.apollographql.apollo.api.b.z(19, hashMap0, "Thumbnail Image Valid Area", 21, "Serial Number Format");
        com.apollographql.apollo.api.b.z(26, hashMap0, "Super Macro", 28, "Date Stamp Mode");
        com.apollographql.apollo.api.b.z(29, hashMap0, "My Colors", 30, "Firmware Revision");
        com.apollographql.apollo.api.b.z(35, hashMap0, "Categories", 36, "Face Detect Array 1");
        com.apollographql.apollo.api.b.z(37, hashMap0, "Face Detect Array 2", 38, "AF Info Array 2");
        com.apollographql.apollo.api.b.z(40, hashMap0, "Image Unique ID", 0x81, "Raw Data Offset");
        com.apollographql.apollo.api.b.z(0x83, hashMap0, "Original Decision Data Offset", 0x90, "Custom Functions (1D) Array");
        com.apollographql.apollo.api.b.z(0x91, hashMap0, "Personal Functions Array", 0x92, "Personal Function Values Array");
        com.apollographql.apollo.api.b.z(0x93, hashMap0, "File Info Array", 0x94, "AF Points in Focus (1D)");
        com.apollographql.apollo.api.b.z(0x95, hashMap0, "Lens Model", 150, "Serial Info Array");
        com.apollographql.apollo.api.b.z(0x97, hashMap0, "Dust Removal Data", 0x98, "Crop Info");
        com.apollographql.apollo.api.b.z(0x99, hashMap0, "Custom Functions Array 2", 0x9A, "Aspect Information Array");
        com.apollographql.apollo.api.b.z(0xA0, hashMap0, "Processing Information Array", 0xA1, "Tone Curve Table");
        com.apollographql.apollo.api.b.z(0xA2, hashMap0, "Sharpness Table", 0xA3, "Sharpness Frequency Table");
        com.apollographql.apollo.api.b.z(0xA4, hashMap0, "White Balance Table", 0xA9, "Color Balance Array");
        com.apollographql.apollo.api.b.z(170, hashMap0, "Measured Color Array", 0xAE, "Color Temperature");
        com.apollographql.apollo.api.b.z(0xB0, hashMap0, "Canon Flags Array", 0xB1, "Modified Information Array");
        com.apollographql.apollo.api.b.z(0xB2, hashMap0, "Tone Curve Matching", 0xB3, "White Balance Matching");
        com.apollographql.apollo.api.b.z(180, hashMap0, "Color Space", 0xB6, "Preview Image Info Array");
        com.apollographql.apollo.api.b.z(0xD0, hashMap0, "VRD Offset", 0xE0, "Sensor Information Array");
        com.apollographql.apollo.api.b.z(0x4001, hashMap0, "Color Data Array 1", 0x4002, "CRW Parameters");
        com.apollographql.apollo.api.b.z(0x4003, hashMap0, "Color Data Array 2", 0x4008, "Black Level");
        com.apollographql.apollo.api.b.z(0x4010, hashMap0, "Custom Picture Style File Name", 0x4013, "Color Info Array");
        com.apollographql.apollo.api.b.z(0x4015, hashMap0, "Vignetting Correction Array 1", 0x4016, "Vignetting Correction Array 2");
        com.apollographql.apollo.api.b.z(0x4018, hashMap0, "Lighting Optimizer Array", 0x4019, "Lens Info Array");
        com.apollographql.apollo.api.b.z(0x4020, hashMap0, "Ambiance Info Array", 0x4024, "Filter Info Array");
    }

    public CanonMakernoteDirectory() {
        this.setDescriptor(new a(this));  // initializer: Lcom/drew/metadata/g;-><init>(Lcom/drew/metadata/b;)V
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "Canon Makernote";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return CanonMakernoteDirectory._tagNameMap;
    }

    @Override  // com.drew.metadata.b
    public void setObjectArray(int v, Object object0) {
        if(!(object0 instanceof int[])) {
            super.setObjectArray(v, object0);
            return;
        }
        int v1 = 0;
        switch(v) {
            case 1: {
                break;
            }
            case 2: {
                while(v1 < ((int[])object0).length) {
                    this.setInt(0xC200 + v1, ((int[])object0)[v1]);
                    ++v1;
                }
                return;
            }
            case 4: {
                while(v1 < ((int[])object0).length) {
                    this.setInt(0xC400 + v1, ((int[])object0)[v1]);
                    ++v1;
                }
                return;
            }
            case 5: {
                while(v1 < ((int[])object0).length) {
                    this.setInt(0xC500 + v1, ((int[])object0)[v1]);
                    ++v1;
                }
                return;
            }
            case 18: {
                int v2 = ((int[])object0)[0];
                int v4 = 0;
                for(int v3 = 0; v3 < ((int[])object0).length; ++v3) {
                    switch(0xD200 + v4) {
                        case 0xD208: 
                        case 0xD209: {
                            if(((int[])object0).length - 1 >= v3 + v2) {
                                short[] arr_v = new short[v2];
                                for(int v5 = 0; v5 < v2; ++v5) {
                                    arr_v[v5] = (short)((int[])object0)[v3 + v5];
                                }
                                super.setObjectArray(0xD200 + v4, arr_v);
                            }
                            v3 += v2 - 1;
                            break;
                        }
                        case 0xD20A: {
                            int v6 = (v2 + 15) / 16;
                            short[] arr_v1 = new short[v6];
                            if(((int[])object0).length - 1 >= v3 + v6) {
                                for(int v7 = 0; v7 < v6; ++v7) {
                                    arr_v1[v7] = (short)((int[])object0)[v3 + v7];
                                }
                                super.setObjectArray(0xD20A, arr_v1);
                            }
                            v3 += v6 - 1;
                            break;
                        }
                        default: {
                            super.setObjectArray(0xD200 + v4, ((int)((int[])object0)[v3]));
                        }
                    }
                    ++v4;
                }
                return;
            }
            default: {
                super.setObjectArray(v, object0);
                return;
            }
        }
        while(v1 < ((int[])object0).length) {
            this.setInt(0xC100 + v1, ((int[])object0)[v1]);
            ++v1;
        }
    }
}

