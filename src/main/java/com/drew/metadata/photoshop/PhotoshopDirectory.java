package com.drew.metadata.photoshop;

import com.drew.metadata.b;
import java.util.HashMap;

public class PhotoshopDirectory extends b {
    public static final int TAG_ALPHA_CHANNELS = 1006;
    public static final int TAG_ALPHA_IDENTIFIERS = 1053;
    public static final int TAG_ALTERNATE_DUOTONE_COLORS = 1066;
    public static final int TAG_ALTERNATE_SPOT_COLORS = 1067;
    public static final int TAG_AUTO_SAVE_FILE_PATH = 1086;
    public static final int TAG_AUTO_SAVE_FORMAT = 0x43F;
    public static final int TAG_BACKGROUND_COLOR = 1010;
    public static final int TAG_BORDER_INFORMATION = 1009;
    public static final int TAG_CAPTION = 0x3F0;
    public static final int TAG_CAPTION_DIGEST = 1061;
    public static final int TAG_CHANNELS_ROWS_COLUMNS_DEPTH_MODE = 1000;
    public static final int TAG_CLIPPING_PATH_NAME = 0xBB7;
    public static final int TAG_COLOR_HALFTONING_INFORMATION = 0x3F5;
    public static final int TAG_COLOR_SAMPLERS = 1073;
    public static final int TAG_COLOR_TRANSFER_FUNCTIONS = 0x3F8;
    public static final int TAG_COPYRIGHT = 0x40A;
    public static final int TAG_COUNT_INFORMATION = 1080;
    public static final int TAG_DISPLAY_INFO = 1077;
    public static final int TAG_DISPLAY_INFO_OBSOLETE = 1007;
    public static final int TAG_DUOTONE_HALFTONING_INFORMATION = 0x3F6;
    public static final int TAG_DUOTONE_IMAGE_INFORMATION = 0x3FA;
    public static final int TAG_DUOTONE_TRANSFER_FUNCTIONS = 0x3F9;
    public static final int TAG_EFFECTIVE_BLACK_AND_WHITE_VALUES = 0x3FB;
    public static final int TAG_EFFECTS_VISIBLE = 1042;
    public static final int TAG_EPS_OPTIONS = 0x3FD;
    public static final int TAG_EXIF_DATA_1 = 1058;
    public static final int TAG_EXIF_DATA_3 = 1059;
    public static final int TAG_GLOBAL_ALTITUDE = 1049;
    public static final int TAG_GLOBAL_ANGLE = 0x40D;
    public static final int TAG_GRAYSCALE_AND_MULTICHANNEL_HALFTONING_INFORMATION = 0x3F4;
    public static final int TAG_GRAYSCALE_AND_MULTICHANNEL_TRANSFER_FUNCTION = 0x3F7;
    public static final int TAG_GRID_AND_GUIDES_INFORMATION = 0x408;
    public static final int TAG_HDR_TONING_INFO = 1070;
    public static final int TAG_ICC_PROFILE_BYTES = 0x40F;
    public static final int TAG_ICC_UNTAGGED_PROFILE = 1041;
    public static final int TAG_IMAGE_MODE_FOR_RAW_FORMAT_FILES = 0x405;
    public static final int TAG_IMAGE_READY_7_ROLLOVER = 7003;
    public static final int TAG_IMAGE_READY_DATA_SETS = 7001;
    public static final int TAG_IMAGE_READY_ROLLOVER = 7004;
    public static final int TAG_IMAGE_READY_SAVE_LAYER_SETTINGS = 7005;
    public static final int TAG_IMAGE_READY_SELECTED_STATE = 7002;
    public static final int TAG_IMAGE_READY_VARIABLES_XML = 7000;
    public static final int TAG_IMAGE_READY_VERSION = 7006;
    public static final int TAG_INDEXED_COLOR_TABLE = 1003;
    public static final int TAG_INDEXED_COLOR_TABLE_COUNT = 1046;
    public static final int TAG_IPTC = 0x404;
    public static final int TAG_JPEG_QUALITY = 1030;
    public static final int TAG_JUMP_TO_XPEP = 1052;
    public static final int TAG_LAYERS_GROUP_INFORMATION = 0x402;
    public static final int TAG_LAYER_COMPS = 1065;
    public static final int TAG_LAYER_GROUPS_ENABLED_ID = 0x430;
    public static final int TAG_LAYER_SELECTION_IDS = 1069;
    public static final int TAG_LAYER_STATE_INFORMATION = 0x400;
    public static final int TAG_LIGHTROOM_WORKFLOW = 8000;
    public static final int TAG_MAC_NSPRINTINFO = 1084;
    public static final int TAG_MAC_PRINT_INFO = 1001;
    public static final int TAG_MEASUREMENT_SCALE = 1074;
    public static final int TAG_ONION_SKINS = 1078;
    public static final int TAG_ORIGIN_PATH_INFO = 3000;
    public static final int TAG_PATH_SELECTION_STATE = 0x440;
    public static final int TAG_PIXEL_ASPECT_RATIO = 1064;
    public static final int TAG_PRINT_FLAGS = 0x3F3;
    public static final int TAG_PRINT_FLAGS_INFO = 10000;
    public static final int TAG_PRINT_INFO = 0x42F;
    public static final int TAG_PRINT_INFO_2 = 1082;
    public static final int TAG_PRINT_SCALE = 1062;
    public static final int TAG_PRINT_STYLE = 1083;
    public static final int TAG_QUICK_MASK_INFORMATION = 0x3FE;
    public static final int TAG_RESOLUTION_INFO = 1005;
    public static final int TAG_SEED_NUMBER = 1044;
    public static final int TAG_SHEET_DISCLOSURE = 1076;
    public static final int TAG_SLICES = 1050;
    public static final int TAG_SPOT_HALFTONE = 1043;
    public static final int TAG_THUMBNAIL = 0x40C;
    public static final int TAG_THUMBNAIL_OLD = 0x409;
    public static final int TAG_TIMELINE_INFORMATION = 1075;
    public static final int TAG_TRANSPARENCY_INDEX = 1047;
    public static final int TAG_UNICODE_ALPHA_NAMES = 1045;
    public static final int TAG_URL = 0x40B;
    public static final int TAG_URL_LIST = 1054;
    public static final int TAG_VERSION = 1057;
    public static final int TAG_WATERMARK = 1040;
    public static final int TAG_WIN_DEVMODE = 1085;
    public static final int TAG_WORKFLOW_URL = 1051;
    public static final int TAG_XML = 1002;
    public static final int TAG_XMP_DATA = 1060;
    static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        PhotoshopDirectory._tagNameMap = hashMap0;
        com.apollographql.apollo.api.b.z(1000, hashMap0, "Channels, Rows, Columns, Depth, Mode", 1001, "Mac Print Info");
        com.apollographql.apollo.api.b.z(1002, hashMap0, "XML Data", 1003, "Indexed Color Table");
        com.apollographql.apollo.api.b.z(1005, hashMap0, "Resolution Info", 1006, "Alpha Channels");
        com.apollographql.apollo.api.b.z(1007, hashMap0, "Display Info (Obsolete)", 0x3F0, "Caption");
        com.apollographql.apollo.api.b.z(1009, hashMap0, "Border Information", 1010, "Background Color");
        com.apollographql.apollo.api.b.z(0x3F3, hashMap0, "Print Flags", 0x3F4, "Grayscale and Multichannel Halftoning Information");
        com.apollographql.apollo.api.b.z(0x3F5, hashMap0, "Color Halftoning Information", 0x3F6, "Duotone Halftoning Information");
        com.apollographql.apollo.api.b.z(0x3F7, hashMap0, "Grayscale and Multichannel Transfer Function", 0x3F8, "Color Transfer Functions");
        com.apollographql.apollo.api.b.z(0x3F9, hashMap0, "Duotone Transfer Functions", 0x3FA, "Duotone Image Information");
        com.apollographql.apollo.api.b.z(0x3FB, hashMap0, "Effective Black and White Values", 0x3FD, "EPS Options");
        com.apollographql.apollo.api.b.z(0x3FE, hashMap0, "Quick Mask Information", 0x400, "Layer State Information");
        com.apollographql.apollo.api.b.z(0x402, hashMap0, "Layers Group Information", 0x404, "IPTC-NAA Record");
        com.apollographql.apollo.api.b.z(0x405, hashMap0, "Image Mode for Raw Format Files", 1030, "JPEG Quality");
        com.apollographql.apollo.api.b.z(0x408, hashMap0, "Grid and Guides Information", 0x409, "Photoshop 4.0 Thumbnail");
        com.apollographql.apollo.api.b.z(0x40A, hashMap0, "Copyright Flag", 0x40B, "URL");
        com.apollographql.apollo.api.b.z(0x40C, hashMap0, "Thumbnail Data", 0x40D, "Global Angle");
        com.apollographql.apollo.api.b.z(0x40F, hashMap0, "ICC Profile Bytes", 1040, "Watermark");
        com.apollographql.apollo.api.b.z(1041, hashMap0, "ICC Untagged Profile", 1042, "Effects Visible");
        com.apollographql.apollo.api.b.z(1043, hashMap0, "Spot Halftone", 1044, "Seed Number");
        com.apollographql.apollo.api.b.z(1045, hashMap0, "Unicode Alpha Names", 1046, "Indexed Color Table Count");
        com.apollographql.apollo.api.b.z(1047, hashMap0, "Transparency Index", 1049, "Global Altitude");
        com.apollographql.apollo.api.b.z(1050, hashMap0, "Slices", 1051, "Workflow URL");
        com.apollographql.apollo.api.b.z(1052, hashMap0, "Jump To XPEP", 1053, "Alpha Identifiers");
        com.apollographql.apollo.api.b.z(1054, hashMap0, "URL List", 1057, "Version Info");
        com.apollographql.apollo.api.b.z(1058, hashMap0, "EXIF Data 1", 1059, "EXIF Data 3");
        com.apollographql.apollo.api.b.z(1060, hashMap0, "XMP Data", 1061, "Caption Digest");
        com.apollographql.apollo.api.b.z(1062, hashMap0, "Print Scale", 1064, "Pixel Aspect Ratio");
        com.apollographql.apollo.api.b.z(1065, hashMap0, "Layer Comps", 1066, "Alternate Duotone Colors");
        com.apollographql.apollo.api.b.z(1067, hashMap0, "Alternate Spot Colors", 1069, "Layer Selection IDs");
        com.apollographql.apollo.api.b.z(1070, hashMap0, "HDR Toning Info", 0x42F, "Print Info");
        com.apollographql.apollo.api.b.z(0x430, hashMap0, "Layer Groups Enabled ID", 1073, "Color Samplers");
        com.apollographql.apollo.api.b.z(1074, hashMap0, "Measurement Scale", 1075, "Timeline Information");
        com.apollographql.apollo.api.b.z(1076, hashMap0, "Sheet Disclosure", 1077, "Display Info");
        com.apollographql.apollo.api.b.z(1078, hashMap0, "Onion Skins", 1080, "Count information");
        com.apollographql.apollo.api.b.z(1082, hashMap0, "Print Info 2", 1083, "Print Style");
        com.apollographql.apollo.api.b.z(1084, hashMap0, "Mac NSPrintInfo", 1085, "Win DEVMODE");
        com.apollographql.apollo.api.b.z(1086, hashMap0, "Auto Save File Subpath", 0x43F, "Auto Save Format");
        com.apollographql.apollo.api.b.z(0x440, hashMap0, "Subpath Selection State", 0xBB7, "Clipping Path Name");
        com.apollographql.apollo.api.b.z(3000, hashMap0, "Origin Subpath Info", 7000, "Image Ready Variables XML");
        com.apollographql.apollo.api.b.z(7001, hashMap0, "Image Ready Data Sets", 7002, "Image Ready Selected State");
        com.apollographql.apollo.api.b.z(7003, hashMap0, "Image Ready 7 Rollover Expanded State", 7004, "Image Ready Rollover Expanded State");
        com.apollographql.apollo.api.b.z(7005, hashMap0, "Image Ready Save Layer Settings", 7006, "Image Ready Version");
        com.apollographql.apollo.api.b.z(8000, hashMap0, "Lightroom Workflow", 10000, "Print Flags Information");
    }

    public PhotoshopDirectory() {
        this.setDescriptor(new A4.b(17, this));
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "Photoshop";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return PhotoshopDirectory._tagNameMap;
    }

    public byte[] getThumbnailBytes() {
        byte[] arr_b = this.getByteArray(0x40C);
        if(arr_b == null) {
            arr_b = this.getByteArray(0x409);
        }
        if(arr_b != null && arr_b.length > 28) {
            byte[] arr_b1 = new byte[arr_b.length - 28];
            System.arraycopy(arr_b, 28, arr_b1, 0, arr_b.length - 28);
            return arr_b1;
        }
        return null;
    }
}

