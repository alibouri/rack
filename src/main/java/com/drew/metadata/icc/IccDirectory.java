package com.drew.metadata.icc;

import com.drew.metadata.b;
import java.util.HashMap;
import r4.a;

public class IccDirectory extends b {
    public static final int TAG_APPLE_MULTI_LANGUAGE_PROFILE_NAME = 0x6473636D;
    public static final int TAG_CMM_FLAGS = 44;
    public static final int TAG_CMM_TYPE = 4;
    public static final int TAG_COLOR_SPACE = 16;
    public static final int TAG_DEVICE_ATTR = 56;
    public static final int TAG_DEVICE_MAKE = 0x30;
    public static final int TAG_DEVICE_MODEL = 52;
    public static final int TAG_PLATFORM = 40;
    public static final int TAG_PROFILE_BYTE_COUNT = 0;
    public static final int TAG_PROFILE_CLASS = 12;
    public static final int TAG_PROFILE_CONNECTION_SPACE = 20;
    public static final int TAG_PROFILE_CREATOR = 80;
    public static final int TAG_PROFILE_DATETIME = 24;
    public static final int TAG_PROFILE_VERSION = 8;
    public static final int TAG_RENDERING_INTENT = 0x40;
    public static final int TAG_SIGNATURE = 36;
    public static final int TAG_TAG_A2B0 = 0x41324230;
    public static final int TAG_TAG_A2B1 = 1093812785;
    public static final int TAG_TAG_A2B2 = 1093812786;
    public static final int TAG_TAG_B2A0 = 0x42324130;
    public static final int TAG_TAG_B2A1 = 1110589745;
    public static final int TAG_TAG_B2A2 = 1110589746;
    public static final int TAG_TAG_COUNT = 0x80;
    public static final int TAG_TAG_aabg = 0x61616267;
    public static final int TAG_TAG_aagg = 0x61616767;
    public static final int TAG_TAG_aarg = 0x61617267;
    public static final int TAG_TAG_bTRC = 0x62545243;
    public static final int TAG_TAG_bXYZ = 1649957210;
    public static final int TAG_TAG_bfd = 0x62666420;
    public static final int TAG_TAG_bkpt = 1651208308;
    public static final int TAG_TAG_calt = 1667329140;
    public static final int TAG_TAG_chad = 1667785060;
    public static final int TAG_TAG_chrm = 0x6368726D;
    public static final int TAG_TAG_cprt = 0x63707274;
    public static final int TAG_TAG_crdi = 0x63726469;
    public static final int TAG_TAG_desc = 1684370275;
    public static final int TAG_TAG_devs = 1684371059;
    public static final int TAG_TAG_dmdd = 1684890724;
    public static final int TAG_TAG_dmnd = 0x646D6E64;
    public static final int TAG_TAG_gTRC = 0x67545243;
    public static final int TAG_TAG_gXYZ = 1733843290;
    public static final int TAG_TAG_gamt = 1734438260;
    public static final int TAG_TAG_kTRC = 1800688195;
    public static final int TAG_TAG_lumi = 1819635049;
    public static final int TAG_TAG_meas = 1835360627;
    public static final int TAG_TAG_mmod = 0x6D6D6F64;
    public static final int TAG_TAG_ncl2 = 1852009522;
    public static final int TAG_TAG_ncol = 1852010348;
    public static final int TAG_TAG_ndin = 1852074350;
    public static final int TAG_TAG_pre0 = 0x70726530;
    public static final int TAG_TAG_pre1 = 0x70726531;
    public static final int TAG_TAG_pre2 = 0x70726532;
    public static final int TAG_TAG_ps2i = 0x70733269;
    public static final int TAG_TAG_ps2s = 0x70733273;
    public static final int TAG_TAG_psd0 = 0x70736430;
    public static final int TAG_TAG_psd1 = 0x70736431;
    public static final int TAG_TAG_psd2 = 0x70736432;
    public static final int TAG_TAG_psd3 = 0x70736433;
    public static final int TAG_TAG_pseq = 1886610801;
    public static final int TAG_TAG_rTRC = 1918128707;
    public static final int TAG_TAG_rXYZ = 0x7258595A;
    public static final int TAG_TAG_resp = 0x72657370;
    public static final int TAG_TAG_scrd = 0x73637264;
    public static final int TAG_TAG_scrn = 0x7363726E;
    public static final int TAG_TAG_targ = 0x74617267;
    public static final int TAG_TAG_tech = 1952801640;
    public static final int TAG_TAG_vcgt = 1986226036;
    public static final int TAG_TAG_view = 0x76696577;
    public static final int TAG_TAG_vued = 1987405156;
    public static final int TAG_TAG_wtpt = 2004119668;
    public static final int TAG_XYZ_VALUES = 68;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        IccDirectory._tagNameMap = hashMap0;
        com.apollographql.apollo.api.b.z(0, hashMap0, "Profile Size", 4, "CMM Type");
        com.apollographql.apollo.api.b.z(8, hashMap0, "Version", 12, "Class");
        com.apollographql.apollo.api.b.z(16, hashMap0, "Color space", 20, "Profile Connection Space");
        com.apollographql.apollo.api.b.z(24, hashMap0, "Profile Date/Time", 36, "Signature");
        com.apollographql.apollo.api.b.z(40, hashMap0, "Primary Platform", 44, "CMM Flags");
        com.apollographql.apollo.api.b.z(0x30, hashMap0, "Device manufacturer", 52, "Device model");
        com.apollographql.apollo.api.b.z(56, hashMap0, "Device attributes", 0x40, "Rendering Intent");
        com.apollographql.apollo.api.b.z(68, hashMap0, "XYZ values", 80, "Profile Creator");
        com.apollographql.apollo.api.b.z(0x80, hashMap0, "Tag Count", 0x41324230, "AToB 0");
        com.apollographql.apollo.api.b.z(1093812785, hashMap0, "AToB 1", 1093812786, "AToB 2");
        com.apollographql.apollo.api.b.z(1649957210, hashMap0, "Blue Colorant", 0x62545243, "Blue TRC");
        com.apollographql.apollo.api.b.z(0x42324130, hashMap0, "BToA 0", 1110589745, "BToA 1");
        com.apollographql.apollo.api.b.z(1110589746, hashMap0, "BToA 2", 1667329140, "Calibration Date/Time");
        com.apollographql.apollo.api.b.z(0x74617267, hashMap0, "Char Target", 1667785060, "Chromatic Adaptation");
        com.apollographql.apollo.api.b.z(0x6368726D, hashMap0, "Chromaticity", 0x63707274, "Profile Copyright");
        com.apollographql.apollo.api.b.z(0x63726469, hashMap0, "CrdInfo", 0x646D6E64, "Device Mfg Description");
        com.apollographql.apollo.api.b.z(1684890724, hashMap0, "Device Model Description", 1684371059, "Device Settings");
        com.apollographql.apollo.api.b.z(1734438260, hashMap0, "Gamut", 1800688195, "Gray TRC");
        com.apollographql.apollo.api.b.z(1733843290, hashMap0, "Green Colorant", 0x67545243, "Green TRC");
        com.apollographql.apollo.api.b.z(1819635049, hashMap0, "Luminance", 1835360627, "Measurement");
        com.apollographql.apollo.api.b.z(1651208308, hashMap0, "Media Black Point", 2004119668, "Media White Point");
        com.apollographql.apollo.api.b.z(1852010348, hashMap0, "Named Color", 1852009522, "Named Color 2");
        com.apollographql.apollo.api.b.z(0x72657370, hashMap0, "Output Response", 0x70726530, "Preview 0");
        com.apollographql.apollo.api.b.z(0x70726531, hashMap0, "Preview 1", 0x70726532, "Preview 2");
        com.apollographql.apollo.api.b.z(1684370275, hashMap0, "Profile Description", 1886610801, "Profile Sequence Description");
        com.apollographql.apollo.api.b.z(0x70736430, hashMap0, "Ps2 CRD 0", 0x70736431, "Ps2 CRD 1");
        com.apollographql.apollo.api.b.z(0x70736432, hashMap0, "Ps2 CRD 2", 0x70736433, "Ps2 CRD 3");
        com.apollographql.apollo.api.b.z(0x70733273, hashMap0, "Ps2 CSA", 0x70733269, "Ps2 Rendering Intent");
        com.apollographql.apollo.api.b.z(0x7258595A, hashMap0, "Red Colorant", 1918128707, "Red TRC");
        com.apollographql.apollo.api.b.z(0x73637264, hashMap0, "Screening Desc", 0x7363726E, "Screening");
        com.apollographql.apollo.api.b.z(1952801640, hashMap0, "Technology", 0x62666420, "Ucrbg");
        com.apollographql.apollo.api.b.z(1987405156, hashMap0, "Viewing Conditions Description", 0x76696577, "Viewing Conditions");
        com.apollographql.apollo.api.b.z(0x61616267, hashMap0, "Blue Parametric TRC", 0x61616767, "Green Parametric TRC");
        com.apollographql.apollo.api.b.z(0x61617267, hashMap0, "Red Parametric TRC", 0x6D6D6F64, "Make And Model");
        com.apollographql.apollo.api.b.z(1852074350, hashMap0, "Native Display Information", 1986226036, "Video Card Gamma");
        hashMap0.put(0x6473636D, "Apple Multi-language Profile Name");
    }

    public IccDirectory() {
        this.setDescriptor(new a(7, this));
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "ICC Profile";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return IccDirectory._tagNameMap;
    }
}

