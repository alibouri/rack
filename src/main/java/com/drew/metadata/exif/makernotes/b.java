package com.drew.metadata.exif.makernotes;

import M.J;
import com.drew.metadata.g;
import java.text.DecimalFormat;
import java.util.HashMap;
import l4.k;

public final class b extends g {
    public static final HashMap b;
    public static final HashMap c;

    static {
        HashMap hashMap0 = new HashMap();
        b.b = hashMap0;
        HashMap hashMap1 = new HashMap();
        b.c = hashMap1;
        Integer integer0 = 0;
        hashMap1.put(integer0, "Off");
        hashMap1.put(1, "Soft Focus");
        com.apollographql.apollo.api.b.z(2, hashMap1, "Pop Art", 3, "Pale & Light Color");
        com.apollographql.apollo.api.b.z(4, hashMap1, "Light Tone", 5, "Pin Hole");
        com.apollographql.apollo.api.b.z(6, hashMap1, "Grainy Film", 9, "Diorama");
        com.apollographql.apollo.api.b.z(10, hashMap1, "Cross Process", 12, "Fish Eye");
        com.apollographql.apollo.api.b.z(13, hashMap1, "Drawing", 14, "Gentle Sepia");
        com.apollographql.apollo.api.b.z(15, hashMap1, "Pale & Light Color II", 16, "Pop Art II");
        com.apollographql.apollo.api.b.z(17, hashMap1, "Pin Hole II", 18, "Pin Hole III");
        com.apollographql.apollo.api.b.z(19, hashMap1, "Grainy Film II", 20, "Dramatic Tone");
        com.apollographql.apollo.api.b.z(21, hashMap1, "Punk", 22, "Soft Focus 2");
        com.apollographql.apollo.api.b.z(23, hashMap1, "Sparkle", 24, "Watercolor");
        com.apollographql.apollo.api.b.z(25, hashMap1, "Key Line", 26, "Key Line II");
        com.apollographql.apollo.api.b.z(27, hashMap1, "Miniature", 28, "Reflection");
        com.apollographql.apollo.api.b.z(29, hashMap1, "Fragmented", 0x1F, "Cross Process II");
        com.apollographql.apollo.api.b.z(0x20, hashMap1, "Dramatic Tone II", 33, "Watercolor I");
        com.apollographql.apollo.api.b.z(34, hashMap1, "Watercolor II", 35, "Diorama II");
        com.apollographql.apollo.api.b.z(36, hashMap1, "Vintage", 37, "Vintage II");
        com.apollographql.apollo.api.b.z(38, hashMap1, "Vintage III", 39, "Partial Color");
        com.apollographql.apollo.api.b.z(40, hashMap1, "Partial Color II", 41, "Partial Color III");
        hashMap0.put(integer0, "0");
        hashMap0.put(0xFFFF8301, "Highlights ");
        com.apollographql.apollo.api.b.z(0xFFFF8302, hashMap0, "Shadows ", 0xFFFF8303, "Midtones ");
    }

    @Override  // com.drew.metadata.g
    public final String c(int v) {
        String s3;
        int v7;
        StringBuilder stringBuilder4;
        int v2;
        int v1;
        int v18;
        int v17;
        if(v != 0) {
            String s = null;
            com.drew.metadata.b b0 = this.a;
            switch(v) {
                case 0x500: {
                    Integer integer9 = ((OlympusCameraSettingsMakernoteDirectory)b0).getInteger(0x500);
                    if(integer9 != null) {
                        s = "3600K (Tungsten light-like)";
                        switch(((int)integer9)) {
                            case 0: {
                                return "Auto";
                            }
                            case 1: {
                                return "Auto (Keep Warm Color Off)";
                            }
                            case 16: {
                                return "7500K (Fine Weather with Shade)";
                            }
                            case 17: {
                                return "6000K (Cloudy)";
                            }
                            case 18: {
                                return "5300K (Fine Weather)";
                            }
                            case 20: {
                                return "3000K (Tungsten light)";
                            }
                            case 22: {
                                return "Auto Setup";
                            }
                            case 23: {
                                return "5500K (Flash)";
                            }
                            case 33: {
                                return "6600K (Daylight fluorescent)";
                            }
                            case 34: {
                                return "4500K (Neutral white fluorescent)";
                            }
                            case 35: {
                                return "4000K (Cool white fluorescent)";
                            }
                            case 36: {
                                return "White Fluorescent";
                            }
                            case 21: 
                            case 0x30: {
                                break;
                            }
                            case 67: {
                                return "Underwater";
                            }
                            case 0x100: {
                                return "One Touch WB 1";
                            }
                            case 0x101: {
                                return "One Touch WB 2";
                            }
                            case 0x102: {
                                return "One Touch WB 3";
                            }
                            case 0x103: {
                                return "One Touch WB 4";
                            }
                            case 0x200: {
                                return "Custom WB 1";
                            }
                            case 0x201: {
                                return "Custom WB 2";
                            }
                            case 0x202: {
                                return "Custom WB 3";
                            }
                            case 0x203: {
                                return "Custom WB 4";
                            }
                            default: {
                                return m5.b.v("Unknown (", integer9, ")");
                            }
                        }
                    }
                    return s;
                }
                case 0x501: {
                    Integer integer8 = ((OlympusCameraSettingsMakernoteDirectory)b0).getInteger(0x501);
                    if(integer8 != null) {
                        return ((int)integer8) == 0 ? "Auto" : integer8.toString();
                    }
                    return null;
                }
                case 0x520: {
                    int[] arr_v14 = ((OlympusCameraSettingsMakernoteDirectory)b0).getIntArray(0x520);
                    if(arr_v14 == null) {
                        Integer integer7 = ((OlympusCameraSettingsMakernoteDirectory)b0).getInteger(0x50A);
                        if(integer7 != null) {
                            arr_v14 = new int[]{((int)integer7)};
                            v17 = (int)integer7;
                            v18 = 0;
                            goto label_460;
                        }
                    }
                    else {
                    label_460:
                        if(arr_v14.length != 0) {
                            StringBuilder stringBuilder10 = new StringBuilder();
                            switch(v17) {
                                case 1: {
                                    stringBuilder10.append("Vivid");
                                    break;
                                }
                                case 2: {
                                    stringBuilder10.append("Natural");
                                    break;
                                }
                                case 3: {
                                    stringBuilder10.append("Muted");
                                    break;
                                }
                                case 4: {
                                    stringBuilder10.append("Portrait");
                                    break;
                                }
                                case 5: {
                                    stringBuilder10.append("i-Enhance");
                                    break;
                                }
                                case 0x100: {
                                    stringBuilder10.append("Monotone");
                                    break;
                                }
                                case 0x200: {
                                    stringBuilder10.append("Sepia");
                                    break;
                                }
                                default: {
                                    stringBuilder10.append("Unknown (");
                                    stringBuilder10.append(v17);
                                    stringBuilder10.append(")");
                                }
                            }
                            if(arr_v14.length > 1) {
                                stringBuilder10.append("; ");
                                stringBuilder10.append(v18);
                            }
                            return stringBuilder10.toString();
                        }
                    }
                    return null;
                }
                case 0x521: {
                    return this.p(0x521);
                }
                case 0x600: {
                    int[] arr_v13 = ((OlympusCameraSettingsMakernoteDirectory)b0).getIntArray(0x600);
                    if(arr_v13 != null) {
                        if(arr_v13.length != 0 && arr_v13[0] != 0) {
                            StringBuilder stringBuilder9 = new StringBuilder();
                            switch(arr_v13[0]) {
                                case 1: {
                                    stringBuilder9.append("Continuous Shooting");
                                    break;
                                }
                                case 2: {
                                    stringBuilder9.append("Exposure Bracketing");
                                    break;
                                }
                                case 3: {
                                    stringBuilder9.append("White Balance Bracketing");
                                    break;
                                }
                                case 4: {
                                    stringBuilder9.append("Exposure+WB Bracketing");
                                    break;
                                }
                                default: {
                                    stringBuilder9.append("Unknown (");
                                    stringBuilder9.append(arr_v13[0]);
                                    stringBuilder9.append(")");
                                }
                            }
                            stringBuilder9.append(", Shot ");
                            stringBuilder9.append(arr_v13[1]);
                            return stringBuilder9.toString();
                        }
                        return "Single Shot";
                    }
                    return null;
                }
                default: {
                    String s1 = "n/a";
                    switch(v) {
                        case 0x100: {
                            return this.g(0x100, 0, new String[]{"No", "Yes"});
                        }
                        case 0x200: {
                            return this.g(0x200, 1, new String[]{"Manual", "Program", "Aperture-priority AE", "Shutter speed priority", "Program-shift"});
                        }
                        case 0x201: {
                            return this.g(0x201, 0, new String[]{"Off", "On"});
                        }
                        case 0x202: {
                            Integer integer0 = ((OlympusCameraSettingsMakernoteDirectory)b0).getInteger(0x202);
                            if(integer0 != null) {
                                switch(((int)integer0)) {
                                    case 2: {
                                        return "Center-weighted average";
                                    }
                                    case 3: {
                                        return "Spot";
                                    }
                                    case 5: {
                                        return "ESP";
                                    }
                                    case 0x105: {
                                        return "Pattern+AF";
                                    }
                                    case 0x203: {
                                        return "Spot+Highlight control";
                                    }
                                    case 0x403: {
                                        return "Spot+Shadow control";
                                    }
                                    default: {
                                        return m5.b.v("Unknown (", integer0, ")");
                                    }
                                }
                            }
                            return null;
                        }
                        case 0x203: {
                            k k0 = b0.getRational(0x203);
                            if(k0 != null) {
                                return k0.d(true);
                            }
                            Double double0 = b0.getDoubleObject(0x203);
                            return double0 == null ? null : new DecimalFormat("0.###").format(double0);
                        }
                        case 0x204: {
                            return this.g(0x204, 0, new String[]{"Off", "On"});
                        }
                        case 0x300: {
                            return this.g(0x300, 0, new String[]{"Off", "On", "Super Macro"});
                        }
                        case 0x301: {
                            return this.o();
                        }
                        case 770: {
                            int[] arr_v = ((OlympusCameraSettingsMakernoteDirectory)b0).getIntArray(770);
                            if(arr_v == null) {
                                Integer integer1 = ((OlympusCameraSettingsMakernoteDirectory)b0).getInteger(770);
                                if(integer1 != null) {
                                    arr_v = new int[]{((int)integer1)};
                                    v1 = (int)integer1;
                                    v2 = 0;
                                    goto label_36;
                                }
                            }
                            else {
                            label_36:
                                if(arr_v.length != 0) {
                                    StringBuilder stringBuilder0 = new StringBuilder();
                                    switch(v1) {
                                        case 0: {
                                            stringBuilder0.append("AF not used");
                                            break;
                                        }
                                        case 1: {
                                            stringBuilder0.append("AF used");
                                            break;
                                        }
                                        default: {
                                            stringBuilder0.append("Unknown (" + v1 + ")");
                                        }
                                    }
                                    if(arr_v.length > 1) {
                                        stringBuilder0.append("; " + v2);
                                    }
                                    return stringBuilder0.toString();
                                }
                            }
                            return null;
                        }
                        case 0x303: {
                            return this.g(0x303, 0, new String[]{"Not Ready", "Ready"});
                        }
                        case 0x304: {
                            return this.m();
                        }
                        case 0x305: {
                            k[] arr_k = ((OlympusCameraSettingsMakernoteDirectory)b0).getRationalArray(0x305);
                            if(arr_k == null) {
                                return "n/a";
                            }
                            if(arr_k.length >= 4) {
                                int v3 = arr_k.length != 5 || ((long)arr_k[0].doubleValue()) != 0L ? 0 : 1;
                                double f = arr_k[v3].doubleValue();
                                double f1 = arr_k[v3 + 1].doubleValue();
                                double f2 = arr_k[v3 + 2].doubleValue();
                                double f3 = arr_k[v3 + 3].doubleValue();
                                return ((int)(f * 100.0)) + ((int)(f1 * 100.0)) + ((int)(f2 * 100.0)) + ((int)(f3 * 100.0)) == 0 ? "n/a" : String.format("(%d%%,%d%%) (%d%%,%d%%)", ((int)(f * 100.0)), ((int)(f1 * 100.0)), ((int)(f2 * 100.0)), ((int)(f3 * 100.0)));
                            }
                            return null;
                        }
                        case 0x306: {
                            return this.g(0x306, 0, new String[]{"Off", "On"});
                        }
                        case 0x400: {
                            Integer integer2 = ((OlympusCameraSettingsMakernoteDirectory)b0).getInteger(0x400);
                            if(integer2 != null) {
                                if(((int)integer2) == 0) {
                                    return "Off";
                                }
                                StringBuilder stringBuilder1 = new StringBuilder();
                                int v4 = (int)integer2;
                                if((v4 & 1) != 0) {
                                    stringBuilder1.append("On, ");
                                }
                                if((v4 >> 1 & 1) != 0) {
                                    stringBuilder1.append("Fill-in, ");
                                }
                                if((v4 >> 2 & 1) != 0) {
                                    stringBuilder1.append("Red-eye, ");
                                }
                                if((v4 >> 3 & 1) != 0) {
                                    stringBuilder1.append("Slow-sync, ");
                                }
                                if((v4 >> 4 & 1) != 0) {
                                    stringBuilder1.append("Forced On, ");
                                }
                                if((v4 >> 5 & 1) != 0) {
                                    stringBuilder1.append("2nd Curtain, ");
                                }
                                return stringBuilder1.substring(0, stringBuilder1.length() - 2);
                            }
                            return null;
                        }
                        case 0x403: {
                            Integer integer3 = ((OlympusCameraSettingsMakernoteDirectory)b0).getInteger(0x403);
                            if(integer3 != null) {
                                switch(((int)integer3)) {
                                    case 0: {
                                        return "Off";
                                    }
                                    case 1: {
                                        return "Channel 1, Low";
                                    }
                                    case 2: {
                                        return "Channel 2, Low";
                                    }
                                    case 3: {
                                        return "Channel 3, Low";
                                    }
                                    case 4: {
                                        return "Channel 4, Low";
                                    }
                                    case 9: {
                                        return "Channel 1, Mid";
                                    }
                                    case 10: {
                                        return "Channel 2, Mid";
                                    }
                                    case 11: {
                                        return "Channel 3, Mid";
                                    }
                                    case 12: {
                                        return "Channel 4, Mid";
                                    }
                                    case 17: {
                                        return "Channel 1, High";
                                    }
                                    case 18: {
                                        return "Channel 2, High";
                                    }
                                    case 19: {
                                        return "Channel 3, High";
                                    }
                                    case 20: {
                                        return "Channel 4, High";
                                    }
                                    default: {
                                        return m5.b.v("Unknown (", integer3, ")");
                                    }
                                }
                            }
                            return null;
                        }
                        case 0x404: {
                            int[] arr_v1 = ((OlympusCameraSettingsMakernoteDirectory)b0).getIntArray(0x404);
                            if(arr_v1 != null && arr_v1.length != 0) {
                                StringBuilder stringBuilder2 = new StringBuilder();
                                switch(arr_v1[0]) {
                                    case 0: {
                                        stringBuilder2.append("Off");
                                        break;
                                    }
                                    case 3: {
                                        stringBuilder2.append("TTL");
                                        break;
                                    }
                                    case 4: {
                                        stringBuilder2.append("Auto");
                                        break;
                                    }
                                    case 5: {
                                        stringBuilder2.append("Manual");
                                        break;
                                    }
                                    default: {
                                        stringBuilder2.append("Unknown (");
                                        stringBuilder2.append(arr_v1[0]);
                                        stringBuilder2.append(")");
                                    }
                                }
                                for(int v5 = 1; v5 < arr_v1.length; ++v5) {
                                    stringBuilder2.append("; ");
                                    stringBuilder2.append(arr_v1[v5]);
                                }
                                return stringBuilder2.toString();
                            }
                            return null;
                        }
                        case 0x405: {
                            k[] arr_k1 = ((OlympusCameraSettingsMakernoteDirectory)b0).getRationalArray(0x405);
                            if(arr_k1 != null) {
                                switch(arr_k1.length) {
                                    case 0: {
                                        break;
                                    }
                                    case 3: {
                                        if(arr_k1[0].Y == 0L && arr_k1[1].Y == 0L && arr_k1[2].Y == 0L) {
                                            return "n/a";
                                        }
                                        goto label_131;
                                    }
                                    case 4: {
                                        if(arr_k1[0].Y == 0L && arr_k1[1].Y == 0L && arr_k1[2].Y == 0L && arr_k1[3].Y == 0L) {
                                            return "n/a (x4)";
                                        }
                                    label_131:
                                        StringBuilder stringBuilder3 = new StringBuilder();
                                        for(int v6 = 0; v6 < arr_k1.length; ++v6) {
                                            stringBuilder3.append(arr_k1[v6]);
                                            stringBuilder3.append(", ");
                                        }
                                        return stringBuilder3.substring(0, stringBuilder3.length() - 2);
                                    }
                                    default: {
                                        goto label_131;
                                    }
                                }
                            }
                            return null;
                        }
                        case 1030: {
                            k[] arr_k2 = ((OlympusCameraSettingsMakernoteDirectory)b0).getRationalArray(1030);
                            if(arr_k2 != null) {
                                switch(arr_k2.length) {
                                    case 0: {
                                        break;
                                    }
                                    case 3: {
                                        if(arr_k2[0].Y != 0L || arr_k2[1].Y != 0L || arr_k2[2].Y != 0L) {
                                            stringBuilder4 = new StringBuilder();
                                            v7 = 0;
                                            goto label_154;
                                        }
                                        break;
                                    }
                                    case 4: {
                                        if(arr_k2[0].Y == 0L && arr_k2[1].Y == 0L && arr_k2[2].Y == 0L && arr_k2[3].Y == 0L) {
                                            return "n/a (x4)";
                                        }
                                        stringBuilder4 = new StringBuilder();
                                        v7 = 0;
                                    label_154:
                                        while(v7 < arr_k2.length) {
                                            stringBuilder4.append(arr_k2[v7]);
                                            stringBuilder4.append(", ");
                                            ++v7;
                                        }
                                        return stringBuilder4.substring(0, stringBuilder4.length() - 2);
                                    }
                                    default: {
                                        stringBuilder4 = new StringBuilder();
                                        v7 = 0;
                                        goto label_154;
                                    }
                                }
                            }
                            return "n/a";
                        }
                        case 0x503: {
                            return this.p(0x503);
                        }
                        case 0x504: {
                            return this.g(0x504, 0, new String[]{"Off", "CM1 (Red Enhance)", "CM2 (Green Enhance)", "CM3 (Blue Enhance)", "CM4 (Skin Tones)"});
                        }
                        case 0x505: {
                            return this.p(0x505);
                        }
                        case 0x506: {
                            return this.p(0x506);
                        }
                        case 0x507: {
                            return this.g(0x507, 0, new String[]{"sRGB", "Adobe RGB", "Pro Photo RGB"});
                        }
                        case 0x509: {
                            Integer integer4 = ((OlympusCameraSettingsMakernoteDirectory)b0).getInteger(0x509);
                            if(integer4 == null) {
                                return null;
                            }
                            switch(((int)integer4)) {
                                case 0: {
                                    return "Standard";
                                }
                                case 6: {
                                    return "Auto";
                                }
                                case 7: {
                                    return "Sport";
                                }
                                case 8: {
                                    return "Portrait";
                                }
                                case 10: {
                                    return "Landscape";
                                }
                                case 11: {
                                    return "Night Scene";
                                }
                                case 12: {
                                    return "Self Portrait";
                                }
                                case 13: {
                                    return "Panorama";
                                }
                                case 14: {
                                    return "2 in 1";
                                }
                                case 15: {
                                    return "Movie";
                                }
                                case 9: 
                                case 16: {
                                    return "Landscape+Portrait";
                                }
                                case 17: {
                                    return "Night+Portrait";
                                }
                                case 18: {
                                    return "Indoor";
                                }
                                case 19: {
                                    return "Fireworks";
                                }
                                case 20: {
                                    return "Sunset";
                                }
                                case 21: {
                                    return "Beauty Skin";
                                }
                                case 22: {
                                    return "Macro";
                                }
                                case 23: {
                                    return "Super Macro";
                                }
                                case 24: {
                                    return "Food";
                                }
                                case 25: {
                                    return "Documents";
                                }
                                case 26: {
                                    return "Museum";
                                }
                                case 27: {
                                    return "Shoot & Select";
                                }
                                case 28: {
                                    return "Beach & Snow";
                                }
                                case 29: {
                                    return "Self Portrait+Timer";
                                }
                                case 30: {
                                    return "Candle";
                                }
                                case 0x1F: {
                                    return "Available Light";
                                }
                                case 0x20: {
                                    return "Behind Glass";
                                }
                                case 33: {
                                    return "My Mode";
                                }
                                case 34: {
                                    return "Pet";
                                }
                                case 35: {
                                    return "Underwater Wide1";
                                }
                                case 36: {
                                    return "Underwater Macro";
                                }
                                case 37: {
                                    return "Shoot & Select1";
                                }
                                case 38: {
                                    return "Shoot & Select2";
                                }
                                case 39: {
                                    return "High Key";
                                }
                                case 40: {
                                    return "Digital Image Stabilization";
                                }
                                case 41: {
                                    return "Auction";
                                }
                                case 42: {
                                    return "Beach";
                                }
                                case 43: {
                                    return "Snow";
                                }
                                case 44: {
                                    return "Underwater Wide2";
                                }
                                case 45: {
                                    return "Low Key";
                                }
                                case 46: {
                                    return "Children";
                                }
                                case 0x2F: {
                                    return "Vivid";
                                }
                                case 0x30: {
                                    return "Nature Macro";
                                }
                                case 49: {
                                    return "Underwater Snapshot";
                                }
                                case 50: {
                                    return "Shooting Guide";
                                }
                                case 54: {
                                    return "Face Portrait";
                                }
                                case 57: {
                                    return "Bulb";
                                }
                                case 59: {
                                    return "Smile Shot";
                                }
                                case 60: {
                                    return "Quick Shutter";
                                }
                                case 0x3F: {
                                    return "Slow Shutter";
                                }
                                case 0x40: {
                                    return "Bird Watching";
                                }
                                case 65: {
                                    return "Multiple Exposure";
                                }
                                case 66: {
                                    return "e-Portrait";
                                }
                                case 67: {
                                    return "Soft Background Shot";
                                }
                                case 0x8E: {
                                    return "Hand-held Starlight";
                                }
                                case 0x9A: {
                                    return "HDR";
                                }
                                default: {
                                    return m5.b.v("Unknown (", integer4, ")");
                                }
                            }
                        }
                        case 0x50A: {
                            Integer integer5 = ((OlympusCameraSettingsMakernoteDirectory)b0).getInteger(0x50A);
                            if(integer5 != null) {
                                s = "(none)";
                                if(((int)integer5) != 0) {
                                    StringBuilder stringBuilder5 = new StringBuilder();
                                    int v8 = (int)integer5;
                                    if((v8 & 1) != 0) {
                                        stringBuilder5.append("Noise Reduction, ");
                                    }
                                    if((v8 >> 1 & 1) != 0) {
                                        stringBuilder5.append("Noise Filter, ");
                                    }
                                    if((v8 >> 2 & 1) != 0) {
                                        stringBuilder5.append("Noise Filter (ISO Boost), ");
                                    }
                                    if((v8 >> 3 & 1) != 0) {
                                        stringBuilder5.append("Auto, ");
                                    }
                                    return stringBuilder5.length() == 0 ? "(none)" : stringBuilder5.substring(0, stringBuilder5.length() - 2);
                                }
                            }
                            return s;
                        }
                        case 0x50B: {
                            return this.g(0x50B, 0, new String[]{"Off", "On"});
                        }
                        case 0x50C: {
                            return this.g(0x50C, 0, new String[]{"Off", "On"});
                        }
                        case 0x50F: {
                            int[] arr_v2 = ((OlympusCameraSettingsMakernoteDirectory)b0).getIntArray(0x50F);
                            if(arr_v2 != null && arr_v2.length >= 3) {
                                String s2 = String.format("%d %d %d", ((int)arr_v2[0]), ((int)arr_v2[1]), ((int)arr_v2[2]));
                                if(s2.equals("0 0 0")) {
                                    s3 = "n/a";
                                }
                                else if(s2.equals("-1 -1 1")) {
                                    s3 = "Low Key";
                                }
                                else if(s2.equals("0 -1 1")) {
                                    s3 = "Normal";
                                }
                                else {
                                    s3 = s2.equals("1 -1 1") ? "High Key" : J.e("Unknown (", s2, ")");
                                }
                                if(arr_v2.length > 3) {
                                    int v9 = arr_v2[3];
                                    if(v9 == 0) {
                                        return s3 + "; User-Selected";
                                    }
                                    return v9 == 1 ? s3 + "; Auto-Override" : s3;
                                }
                                return s3;
                            }
                            return null;
                        }
                        case 0x523: {
                            return this.p(0x523);
                        }
                        case 0x524: {
                            return this.p(0x524);
                        }
                        case 0x525: {
                            return this.g(0x525, 0, new String[]{"n/a", "Neutral", "Yellow", "Orange", "Red", "Green"});
                        }
                        case 0x526: {
                            return this.g(0x526, 0, new String[]{"n/a", "Neutral", "Sepia", "Blue", "Purple", "Green"});
                        }
                        case 0x527: {
                            int[] arr_v3 = ((OlympusCameraSettingsMakernoteDirectory)b0).getIntArray(0x527);
                            if(arr_v3 == null) {
                                return null;
                            }
                            String s4 = String.format("%d %d %d", ((int)arr_v3[0]), ((int)arr_v3[1]), ((int)arr_v3[2]));
                            if(s4.equals("0 0 0")) {
                                return "n/a";
                            }
                            if(!s4.equals("-2 -2 1")) {
                                if(s4.equals("-1 -2 1")) {
                                    return "Low";
                                }
                                if(s4.equals("0 -2 1")) {
                                    return "Standard";
                                }
                                return s4.equals("1 -2 1") ? "High" : J.e("Unknown (", s4, ")");
                            }
                            return "Off";
                        }
                        case 0x529: {
                            return this.n(0x529);
                        }
                        case 0x52C: {
                            return this.n(0x52C);
                        }
                        case 0x52D: {
                            int[] arr_v4 = ((OlympusCameraSettingsMakernoteDirectory)b0).getIntArray(0x52D);
                            if(arr_v4 == null) {
                                return null;
                            }
                            String s5 = String.format("%d %d %d", ((int)arr_v4[0]), ((int)arr_v4[1]), ((int)arr_v4[2]));
                            if(s5.equals("0 0 0")) {
                                return "n/a";
                            }
                            if(s5.equals("-1 -1 1")) {
                                return "Low";
                            }
                            if(s5.equals("0 -1 1")) {
                                return "Standard";
                            }
                            return s5.equals("1 -1 1") ? "High" : J.e("Unknown (", s5, ")");
                        }
                        case 0x52E: {
                            int[] arr_v5 = ((OlympusCameraSettingsMakernoteDirectory)b0).getIntArray(0x52E);
                            if(arr_v5 != null && arr_v5.length != 0) {
                                StringBuilder stringBuilder6 = new StringBuilder();
                                for(int v10 = 0; v10 < arr_v5.length; ++v10) {
                                    switch(v10) {
                                        case 0: 
                                        case 4: 
                                        case 8: 
                                        case 12: 
                                        case 16: 
                                        case 20: 
                                        case 24: {
                                            stringBuilder6.append(((String)b.b.get(((int)arr_v5[v10]))));
                                            stringBuilder6.append("; ");
                                            break;
                                        }
                                        default: {
                                            stringBuilder6.append(arr_v5[v10]);
                                            stringBuilder6.append("; ");
                                        }
                                    }
                                }
                                return stringBuilder6.substring(0, stringBuilder6.length() - 2);
                            }
                            return null;
                        }
                        case 0x52F: {
                            int[] arr_v6 = ((OlympusCameraSettingsMakernoteDirectory)b0).getIntArray(0x52F);
                            if(arr_v6 != null) {
                                StringBuilder stringBuilder7 = new StringBuilder();
                                int v11 = 0;
                                while(v11 < arr_v6.length) {
                                    if(v11 == 0) {
                                        stringBuilder7.append((b.c.containsKey(((int)arr_v6[0])) ? ((String)b.c.get(((int)arr_v6[0]))) : "[unknown]"));
                                        stringBuilder7.append("; ");
                                    }
                                    else {
                                        switch(v11) {
                                            case 3: {
                                                stringBuilder7.append("Partial Color ");
                                                stringBuilder7.append(arr_v6[3]);
                                                stringBuilder7.append("; ");
                                                break;
                                            }
                                            case 4: {
                                                switch(arr_v6[4]) {
                                                    case 0: {
                                                        stringBuilder7.append("No Effect");
                                                        goto label_360;
                                                    }
                                                    case 0x8010: {
                                                        stringBuilder7.append("Star Light");
                                                        goto label_360;
                                                    }
                                                    case 0x8020: {
                                                        stringBuilder7.append("Pin Hole");
                                                        goto label_360;
                                                    }
                                                    case 0x8030: {
                                                        stringBuilder7.append("Frame");
                                                        goto label_360;
                                                    }
                                                    case 0x8040: {
                                                        stringBuilder7.append("Soft Focus");
                                                        goto label_360;
                                                    }
                                                    case 0x8050: {
                                                        stringBuilder7.append("White Edge");
                                                        goto label_360;
                                                    }
                                                    case 0x8060: {
                                                        stringBuilder7.append("B&W");
                                                        goto label_360;
                                                    }
                                                    default: {
                                                        stringBuilder7.append("Unknown (");
                                                        stringBuilder7.append(arr_v6[4]);
                                                        stringBuilder7.append(")");
                                                        goto label_360;
                                                    }
                                                }
                                            }
                                            case 6: {
                                                switch(arr_v6[6]) {
                                                    case 0: {
                                                        stringBuilder7.append("No Color Filter");
                                                        break;
                                                    }
                                                    case 1: {
                                                        stringBuilder7.append("Yellow Color Filter");
                                                        break;
                                                    }
                                                    case 2: {
                                                        stringBuilder7.append("Orange Color Filter");
                                                        break;
                                                    }
                                                    case 3: {
                                                        stringBuilder7.append("Red Color Filter");
                                                        break;
                                                    }
                                                    case 4: {
                                                        stringBuilder7.append("Green Color Filter");
                                                        break;
                                                    }
                                                    default: {
                                                        stringBuilder7.append("Unknown (");
                                                        stringBuilder7.append(arr_v6[6]);
                                                        stringBuilder7.append(")");
                                                    }
                                                }
                                            label_360:
                                                stringBuilder7.append("; ");
                                                break;
                                            }
                                            default: {
                                                stringBuilder7.append(arr_v6[v11]);
                                                stringBuilder7.append("; ");
                                            }
                                        }
                                    }
                                    ++v11;
                                }
                                return stringBuilder7.substring(0, stringBuilder7.length() - 2);
                            }
                            return null;
                        }
                        case 1330: {
                            int[] arr_v7 = ((OlympusCameraSettingsMakernoteDirectory)b0).getIntArray(1330);
                            if(arr_v7 != null) {
                                StringBuilder stringBuilder8 = new StringBuilder();
                                for(int v12 = 0; v12 < arr_v7.length; ++v12) {
                                    if(v12 == 0) {
                                        stringBuilder8.append("Color ");
                                        stringBuilder8.append(arr_v7[0]);
                                    }
                                    else if(v12 == 3) {
                                        stringBuilder8.append("Strength ");
                                        stringBuilder8.append(arr_v7[3]);
                                    }
                                    else {
                                        stringBuilder8.append(arr_v7[v12]);
                                    }
                                    stringBuilder8.append("; ");
                                }
                                return stringBuilder8.substring(0, stringBuilder8.length() - 2);
                            }
                            return null;
                        }
                        case 0x601: {
                            int[] arr_v8 = ((OlympusCameraSettingsMakernoteDirectory)b0).getIntArray(0x601);
                            if(arr_v8 != null) {
                                if(arr_v8.length != 0) {
                                    switch(arr_v8[0]) {
                                        case 0: {
                                            break;
                                        }
                                        case 1: {
                                            return String.format("%s, Shot %d", "Left to Right", ((int)arr_v8[1]));
                                        }
                                        case 2: {
                                            return String.format("%s, Shot %d", "Right to Left", ((int)arr_v8[1]));
                                        }
                                        case 3: {
                                            return String.format("%s, Shot %d", "Bottom to Top", ((int)arr_v8[1]));
                                        }
                                        case 4: {
                                            return String.format("%s, Shot %d", "Top to Bottom", ((int)arr_v8[1]));
                                        }
                                        default: {
                                            return String.format("%s, Shot %d", J.f(new StringBuilder("Unknown ("), arr_v8[0], ")"), ((int)arr_v8[1]));
                                        }
                                    }
                                }
                                return "Off";
                            }
                            return null;
                        }
                        case 0x603: {
                            return this.g(0x603, 1, new String[]{"SQ", "HQ", "SHQ", "RAW", "SQ (5)"});
                        }
                        case 0x604: {
                            return this.g(0x604, 0, new String[]{"Off", "On, Mode 1", "On, Mode 2", "On, Mode 3", "On, Mode 4"});
                        }
                        case 0x804: {
                            int[] arr_v9 = ((OlympusCameraSettingsMakernoteDirectory)b0).getIntArray(0x804);
                            if(arr_v9 != null && arr_v9.length >= 2) {
                                int v13 = arr_v9[0];
                                int v14 = arr_v9[1];
                                if(v13 == 0 && v14 == 0) {
                                    return "No";
                                }
                                return v13 != 9 || v14 != 8 ? String.format("Unknown (%d %d)", v13, v14) : "Focus-stacked (8 images)";
                            }
                            return null;
                        }
                        case 0x900: {
                            Integer integer6 = ((OlympusCameraSettingsMakernoteDirectory)b0).getInteger(0x900);
                            return integer6 == null ? null : com.apollographql.apollo.api.b.p(new DecimalFormat("#.##").format(((double)(((int)integer6))) / 10.0), " kPa");
                        }
                        case 0x901: {
                            int[] arr_v10 = ((OlympusCameraSettingsMakernoteDirectory)b0).getIntArray(0x901);
                            if(arr_v10 != null && arr_v10.length >= 2) {
                                DecimalFormat decimalFormat0 = new DecimalFormat("#.##");
                                return decimalFormat0.format(((double)arr_v10[0]) / 10.0) + " m, " + decimalFormat0.format(((double)arr_v10[1]) / 10.0) + " ft";
                            }
                            return null;
                        }
                        case 0x902: {
                            return this.g(0x902, 0, new String[]{"Off", "On"});
                        }
                        case 0x903: {
                            int[] arr_v11 = ((OlympusCameraSettingsMakernoteDirectory)b0).getIntArray(0x903);
                            if(arr_v11 != null && arr_v11.length >= 2) {
                                int v15 = arr_v11[0];
                                if(v15 != 0) {
                                    s1 = Double.toString(((double)(-v15)) / 10.0);
                                }
                                return String.format("%s %d", s1, ((int)arr_v11[1]));
                            }
                            return null;
                        }
                        case 0x904: {
                            int[] arr_v12 = ((OlympusCameraSettingsMakernoteDirectory)b0).getIntArray(0x904);
                            if(arr_v12 != null && arr_v12.length >= 2) {
                                int v16 = arr_v12[0];
                                if(v16 != 0) {
                                    s1 = Double.toString(((double)v16) / 10.0);
                                }
                                return String.format("%s %d", s1, ((int)arr_v12[1]));
                            }
                            return null;
                        }
                        case 0x908: {
                            Object object0 = ((OlympusCameraSettingsMakernoteDirectory)b0).getObject(0x908);
                            return object0 == null ? null : object0.toString();
                        }
                        default: {
                            return super.c(v);
                        }
                    }
                }
            }
        }
        return this.l(0, 4);
    }

    public final String m() {
        Object object0 = ((OlympusCameraSettingsMakernoteDirectory)this.a).getObject(0x304);
        if(object0 != null && object0 instanceof long[]) {
            StringBuilder stringBuilder0 = new StringBuilder();
            for(int v = 0; v < ((long[])object0).length; ++v) {
                long v1 = ((long[])object0)[v];
                if(v1 != 0L) {
                    if(stringBuilder0.length() != 0) {
                        stringBuilder0.append(", ");
                    }
                    if(v1 == 0x36794285L) {
                        stringBuilder0.append("Left ");
                    }
                    else if(v1 == 2038007173L) {
                        stringBuilder0.append("Center ");
                    }
                    else if(v1 == 0xBD79C985L) {
                        stringBuilder0.append("Right ");
                    }
                    stringBuilder0.append(String.format("(%d/255,%d/255)-(%d/255,%d/255)", ((long)(v1 >> 24 & 0xFFL)), ((long)(v1 >> 16 & 0xFFL)), ((long)(v1 >> 8 & 0xFFL)), ((long)(v1 & 0xFFL))));
                }
            }
            return stringBuilder0.length() == 0 ? null : stringBuilder0.toString();
        }
        return null;
    }

    public final String n(int v) {
        int[] arr_v = ((OlympusCameraSettingsMakernoteDirectory)this.a).getIntArray(v);
        if(arr_v != null && arr_v.length != 0) {
            StringBuilder stringBuilder0 = new StringBuilder();
            for(int v1 = 0; v1 < arr_v.length; ++v1) {
                if(v1 == 0) {
                    stringBuilder0.append((b.c.containsKey(((int)arr_v[0])) ? ((String)b.c.get(((int)arr_v[0]))) : "[unknown]"));
                }
                else {
                    stringBuilder0.append(arr_v[v1]);
                }
                stringBuilder0.append("; ");
            }
            return stringBuilder0.substring(0, stringBuilder0.length() - 2);
        }
        return null;
    }

    public final String o() {
        int v;
        com.drew.metadata.b b0 = this.a;
        int[] arr_v = ((OlympusCameraSettingsMakernoteDirectory)b0).getIntArray(0x301);
        if(arr_v == null) {
            Integer integer0 = ((OlympusCameraSettingsMakernoteDirectory)b0).getInteger(0x301);
            if(integer0 == null) {
                return null;
            }
            arr_v = new int[]{((int)integer0)};
            v = (int)integer0;
            int v1 = 0;
        }
        if(arr_v.length == 0) {
            return null;
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        switch(v) {
            case 0: {
                stringBuilder0.append("Single AF");
                break;
            }
            case 1: {
                stringBuilder0.append("Sequential shooting AF");
                break;
            }
            case 2: {
                stringBuilder0.append("Continuous AF");
                break;
            }
            case 3: {
                stringBuilder0.append("Multi AF");
                break;
            }
            case 4: {
                stringBuilder0.append("Face detect");
                break;
            }
            case 10: {
                stringBuilder0.append("MF");
                break;
            }
            default: {
                stringBuilder0.append("Unknown (" + v + ")");
            }
        }
        if(arr_v.length > 1) {
            stringBuilder0.append("; ");
            if(v1 == 0) {
                stringBuilder0.append("(none)");
                return stringBuilder0.toString();
            }
            if((v1 & 1) > 0) {
                stringBuilder0.append("S-AF, ");
            }
            if((v1 >> 2 & 1) > 0) {
                stringBuilder0.append("C-AF, ");
            }
            if((v1 >> 4 & 1) > 0) {
                stringBuilder0.append("MF, ");
            }
            if((v1 >> 5 & 1) > 0) {
                stringBuilder0.append("Face detect, ");
            }
            if((v1 >> 6 & 1) > 0) {
                stringBuilder0.append("Imager AF, ");
            }
            if((v1 >> 7 & 1) > 0) {
                stringBuilder0.append("Live View Magnification Frame, ");
            }
            if((v1 >> 8 & 1) > 0) {
                stringBuilder0.append("AF sensor, ");
            }
            stringBuilder0.setLength(stringBuilder0.length() - 2);
        }
        return stringBuilder0.toString();
    }

    public final String p(int v) {
        int[] arr_v = ((OlympusCameraSettingsMakernoteDirectory)this.a).getIntArray(v);
        return arr_v == null || arr_v.length < 3 ? null : String.format("%d (min %d, max %d)", ((int)arr_v[0]), ((int)arr_v[1]), ((int)arr_v[2]));
    }
}

