package com.drew.metadata.exif.makernotes;

import com.drew.metadata.b;
import com.drew.metadata.g;
import java.text.DecimalFormat;
import java.util.HashMap;

public final class c extends g {
    public static final HashMap b;
    public static final HashMap c;

    static {
        HashMap hashMap0 = new HashMap();
        c.b = hashMap0;
        HashMap hashMap1 = new HashMap();
        c.c = hashMap1;
        hashMap0.put("0 00 00", "None");
        hashMap0.put("0 01 00", "Olympus Zuiko Digital ED 50mm F2.0 Macro");
        hashMap0.put("0 01 01", "Olympus Zuiko Digital 40-150mm F3.5-4.5");
        hashMap0.put("0 01 10", "Olympus M.Zuiko Digital ED 14-42mm F3.5-5.6");
        hashMap0.put("0 02 00", "Olympus Zuiko Digital ED 150mm F2.0");
        hashMap0.put("0 02 10", "Olympus M.Zuiko Digital 17mm F2.8 Pancake");
        hashMap0.put("0 03 00", "Olympus Zuiko Digital ED 300mm F2.8");
        hashMap0.put("0 03 10", "Olympus M.Zuiko Digital ED 14-150mm F4.0-5.6 [II]");
        hashMap0.put("0 04 10", "Olympus M.Zuiko Digital ED 9-18mm F4.0-5.6");
        hashMap0.put("0 05 00", "Olympus Zuiko Digital 14-54mm F2.8-3.5");
        hashMap0.put("0 05 01", "Olympus Zuiko Digital Pro ED 90-250mm F2.8");
        hashMap0.put("0 05 10", "Olympus M.Zuiko Digital ED 14-42mm F3.5-5.6 L");
        hashMap0.put("0 06 00", "Olympus Zuiko Digital ED 50-200mm F2.8-3.5");
        hashMap0.put("0 06 01", "Olympus Zuiko Digital ED 8mm F3.5 Fisheye");
        hashMap0.put("0 06 10", "Olympus M.Zuiko Digital ED 40-150mm F4.0-5.6");
        hashMap0.put("0 07 00", "Olympus Zuiko Digital 11-22mm F2.8-3.5");
        hashMap0.put("0 07 01", "Olympus Zuiko Digital 18-180mm F3.5-6.3");
        hashMap0.put("0 07 10", "Olympus M.Zuiko Digital ED 12mm F2.0");
        hashMap0.put("0 08 01", "Olympus Zuiko Digital 70-300mm F4.0-5.6");
        hashMap0.put("0 08 10", "Olympus M.Zuiko Digital ED 75-300mm F4.8-6.7");
        hashMap0.put("0 09 10", "Olympus M.Zuiko Digital 14-42mm F3.5-5.6 II");
        hashMap0.put("0 10 01", "Kenko Tokina Reflex 300mm F6.3 MF Macro");
        hashMap0.put("0 10 10", "Olympus M.Zuiko Digital ED 12-50mm F3.5-6.3 EZ");
        hashMap0.put("0 11 10", "Olympus M.Zuiko Digital 45mm F1.8");
        hashMap0.put("0 12 10", "Olympus M.Zuiko Digital ED 60mm F2.8 Macro");
        hashMap0.put("0 13 10", "Olympus M.Zuiko Digital 14-42mm F3.5-5.6 II R");
        hashMap0.put("0 14 10", "Olympus M.Zuiko Digital ED 40-150mm F4.0-5.6 R");
        hashMap0.put("0 15 00", "Olympus Zuiko Digital ED 7-14mm F4.0");
        hashMap0.put("0 15 10", "Olympus M.Zuiko Digital ED 75mm F1.8");
        hashMap0.put("0 16 10", "Olympus M.Zuiko Digital 17mm F1.8");
        hashMap0.put("0 17 00", "Olympus Zuiko Digital Pro ED 35-100mm F2.0");
        hashMap0.put("0 18 00", "Olympus Zuiko Digital 14-45mm F3.5-5.6");
        hashMap0.put("0 18 10", "Olympus M.Zuiko Digital ED 75-300mm F4.8-6.7 II");
        hashMap0.put("0 19 10", "Olympus M.Zuiko Digital ED 12-40mm F2.8 Pro");
        hashMap0.put("0 20 00", "Olympus Zuiko Digital 35mm F3.5 Macro");
        hashMap0.put("0 20 10", "Olympus M.Zuiko Digital ED 40-150mm F2.8 Pro");
        hashMap0.put("0 21 10", "Olympus M.Zuiko Digital ED 14-42mm F3.5-5.6 EZ");
        hashMap0.put("0 22 00", "Olympus Zuiko Digital 17.5-45mm F3.5-5.6");
        hashMap0.put("0 22 10", "Olympus M.Zuiko Digital 25mm F1.8");
        hashMap0.put("0 23 00", "Olympus Zuiko Digital ED 14-42mm F3.5-5.6");
        hashMap0.put("0 23 10", "Olympus M.Zuiko Digital ED 7-14mm F2.8 Pro");
        hashMap0.put("0 24 00", "Olympus Zuiko Digital ED 40-150mm F4.0-5.6");
        hashMap0.put("0 24 10", "Olympus M.Zuiko Digital ED 300mm F4.0 IS Pro");
        hashMap0.put("0 25 10", "Olympus M.Zuiko Digital ED 8mm F1.8 Fisheye Pro");
        hashMap0.put("0 30 00", "Olympus Zuiko Digital ED 50-200mm F2.8-3.5 SWD");
        hashMap0.put("0 31 00", "Olympus Zuiko Digital ED 12-60mm F2.8-4.0 SWD");
        hashMap0.put("0 32 00", "Olympus Zuiko Digital ED 14-35mm F2.0 SWD");
        hashMap0.put("0 33 00", "Olympus Zuiko Digital 25mm F2.8");
        hashMap0.put("0 34 00", "Olympus Zuiko Digital ED 9-18mm F4.0-5.6");
        hashMap0.put("0 35 00", "Olympus Zuiko Digital 14-54mm F2.8-3.5 II");
        hashMap0.put("1 01 00", "Sigma 18-50mm F3.5-5.6 DC");
        hashMap0.put("1 01 10", "Sigma 30mm F2.8 EX DN");
        hashMap0.put("1 02 00", "Sigma 55-200mm F4.0-5.6 DC");
        hashMap0.put("1 02 10", "Sigma 19mm F2.8 EX DN");
        hashMap0.put("1 03 00", "Sigma 18-125mm F3.5-5.6 DC");
        hashMap0.put("1 03 10", "Sigma 30mm F2.8 DN | A");
        hashMap0.put("1 04 00", "Sigma 18-125mm F3.5-5.6 DC");
        hashMap0.put("1 04 10", "Sigma 19mm F2.8 DN | A");
        hashMap0.put("1 05 00", "Sigma 30mm F1.4 EX DC HSM");
        hashMap0.put("1 05 10", "Sigma 60mm F2.8 DN | A");
        hashMap0.put("1 06 00", "Sigma APO 50-500mm F4.0-6.3 EX DG HSM");
        hashMap0.put("1 07 00", "Sigma Macro 105mm F2.8 EX DG");
        hashMap0.put("1 08 00", "Sigma APO Macro 150mm F2.8 EX DG HSM");
        hashMap0.put("1 09 00", "Sigma 18-50mm F2.8 EX DC Macro");
        hashMap0.put("1 10 00", "Sigma 24mm F1.8 EX DG Aspherical Macro");
        hashMap0.put("1 11 00", "Sigma APO 135-400mm F4.5-5.6 DG");
        hashMap0.put("1 12 00", "Sigma APO 300-800mm F5.6 EX DG HSM");
        hashMap0.put("1 13 00", "Sigma 30mm F1.4 EX DC HSM");
        hashMap0.put("1 14 00", "Sigma APO 50-500mm F4.0-6.3 EX DG HSM");
        hashMap0.put("1 15 00", "Sigma 10-20mm F4.0-5.6 EX DC HSM");
        hashMap0.put("1 16 00", "Sigma APO 70-200mm F2.8 II EX DG Macro HSM");
        hashMap0.put("1 17 00", "Sigma 50mm F1.4 EX DG HSM");
        hashMap0.put("2 01 00", "Leica D Vario Elmarit 14-50mm F2.8-3.5 Asph.");
        hashMap0.put("2 01 10", "Lumix G Vario 14-45mm F3.5-5.6 Asph. Mega OIS");
        hashMap0.put("2 02 00", "Leica D Summilux 25mm F1.4 Asph.");
        hashMap0.put("2 02 10", "Lumix G Vario 45-200mm F4.0-5.6 Mega OIS");
        hashMap0.put("2 03 00", "Leica D Vario Elmar 14-50mm F3.8-5.6 Asph. Mega OIS");
        hashMap0.put("2 03 01", "Leica D Vario Elmar 14-50mm F3.8-5.6 Asph.");
        hashMap0.put("2 03 10", "Lumix G Vario HD 14-140mm F4.0-5.8 Asph. Mega OIS");
        hashMap0.put("2 04 00", "Leica D Vario Elmar 14-150mm F3.5-5.6");
        hashMap0.put("2 04 10", "Lumix G Vario 7-14mm F4.0 Asph.");
        hashMap0.put("2 05 10", "Lumix G 20mm F1.7 Asph.");
        hashMap0.put("2 06 10", "Leica DG Macro-Elmarit 45mm F2.8 Asph. Mega OIS");
        hashMap0.put("2 07 10", "Lumix G Vario 14-42mm F3.5-5.6 Asph. Mega OIS");
        hashMap0.put("2 08 10", "Lumix G Fisheye 8mm F3.5");
        hashMap0.put("2 09 10", "Lumix G Vario 100-300mm F4.0-5.6 Mega OIS");
        hashMap0.put("2 10 10", "Lumix G 14mm F2.5 Asph.");
        hashMap0.put("2 11 10", "Lumix G 12.5mm F12 3D");
        hashMap0.put("2 12 10", "Leica DG Summilux 25mm F1.4 Asph.");
        hashMap0.put("2 13 10", "Lumix G X Vario PZ 45-175mm F4.0-5.6 Asph. Power OIS");
        hashMap0.put("2 14 10", "Lumix G X Vario PZ 14-42mm F3.5-5.6 Asph. Power OIS");
        hashMap0.put("2 15 10", "Lumix G X Vario 12-35mm F2.8 Asph. Power OIS");
        hashMap0.put("2 16 10", "Lumix G Vario 45-150mm F4.0-5.6 Asph. Mega OIS");
        hashMap0.put("2 17 10", "Lumix G X Vario 35-100mm F2.8 Power OIS");
        hashMap0.put("2 18 10", "Lumix G Vario 14-42mm F3.5-5.6 II Asph. Mega OIS");
        hashMap0.put("2 19 10", "Lumix G Vario 14-140mm F3.5-5.6 Asph. Power OIS");
        hashMap0.put("2 20 10", "Lumix G Vario 12-32mm F3.5-5.6 Asph. Mega OIS");
        hashMap0.put("2 21 10", "Leica DG Nocticron 42.5mm F1.2 Asph. Power OIS");
        hashMap0.put("2 22 10", "Leica DG Summilux 15mm F1.7 Asph.");
        hashMap0.put("2 24 10", "Lumix G Macro 30mm F2.8 Asph. Mega OIS");
        hashMap0.put("2 25 10", "Lumix G 42.5mm F1.7 Asph. Power OIS");
        hashMap0.put("3 01 00", "Leica D Vario Elmarit 14-50mm F2.8-3.5 Asph.");
        hashMap0.put("3 02 00", "Leica D Summilux 25mm F1.4 Asph.");
        hashMap0.put("5 01 10", "Tamron 14-150mm F3.5-5.8 Di III");
        hashMap1.put("0 00", "None");
        hashMap1.put("0 04", "Olympus Zuiko Digital EC-14 1.4x Teleconverter");
        hashMap1.put("0 08", "Olympus EX-25 Extension Tube");
        hashMap1.put("0 10", "Olympus Zuiko Digital EC-20 2.0x Teleconverter");
    }

    @Override  // com.drew.metadata.g
    public final String c(int v) {
        if(v != 0) {
            b b0 = this.a;
            if(v != 0x100) {
                switch(v) {
                    case 0x103: {
                        return ((OlympusEquipmentMakernoteDirectory)b0).getString(0x103) + " mm";
                    }
                    case 260: {
                        Integer integer0 = ((OlympusEquipmentMakernoteDirectory)b0).getInteger(260);
                        if(integer0 != null) {
                            String s = String.format("%04X", integer0);
                            return com.apollographql.apollo.api.b.q(s.substring(0, s.length() - 3), ".", s.substring(s.length() - 3));
                        }
                        return null;
                    }
                    case 0x201: {
                        String s1 = ((OlympusEquipmentMakernoteDirectory)b0).getString(0x201);
                        if(s1 != null) {
                            String[] arr_s = s1.split(" ");
                            if(arr_s.length >= 6) {
                                try {
                                    Object[] arr_object = {Integer.parseInt(arr_s[0]), Integer.parseInt(arr_s[2]), Integer.parseInt(arr_s[3])};
                                    return (String)c.b.get(String.format("%X %02X %02X", arr_object));
                                }
                                catch(NumberFormatException unused_ex) {
                                }
                            }
                        }
                        return null;
                    }
                    case 0x204: {
                        Integer integer1 = ((OlympusEquipmentMakernoteDirectory)b0).getInteger(0x204);
                        if(integer1 != null) {
                            String s2 = String.format("%04X", integer1);
                            return com.apollographql.apollo.api.b.q(s2.substring(0, s2.length() - 3), ".", s2.substring(s2.length() - 3));
                        }
                        return null;
                    }
                    case 0x205: {
                        Integer integer2 = ((OlympusEquipmentMakernoteDirectory)b0).getInteger(0x205);
                        return integer2 == null ? null : new DecimalFormat("0.#").format(Math.pow(Math.sqrt(2.0), ((double)(((int)integer2))) / 256.0));
                    }
                    case 0x206: {
                        Integer integer3 = ((OlympusEquipmentMakernoteDirectory)b0).getInteger(0x206);
                        return integer3 == null ? null : new DecimalFormat("0.#").format(Math.pow(Math.sqrt(2.0), ((double)(((int)integer3))) / 256.0));
                    }
                    case 0x20A: {
                        Integer integer4 = ((OlympusEquipmentMakernoteDirectory)b0).getInteger(0x20A);
                        return integer4 == null ? null : new DecimalFormat("0.#").format(Math.pow(Math.sqrt(2.0), ((double)(((int)integer4))) / 256.0));
                    }
                    case 0x20B: {
                        Integer integer5 = ((OlympusEquipmentMakernoteDirectory)b0).getInteger(0x20B);
                        return integer5 == null ? null : String.format("0x%04X", integer5);
                    }
                    case 0x301: {
                        String s3 = ((OlympusEquipmentMakernoteDirectory)b0).getString(0x301);
                        if(s3 != null) {
                            String[] arr_s1 = s3.split(" ");
                            if(arr_s1.length >= 6) {
                                try {
                                    Object[] arr_object1 = {Integer.parseInt(arr_s1[0]), Integer.parseInt(arr_s1[2])};
                                    return (String)c.c.get(String.format("%X %02X", arr_object1));
                                }
                                catch(NumberFormatException unused_ex) {
                                }
                            }
                        }
                        return null;
                    }
                    case 0x1000: {
                        return this.g(0x1000, 0, new String[]{"None", 0, "Simple E-System", "E-System"});
                    }
                    case 0x1001: {
                        return this.g(0x1001, 0, new String[]{"None", "FL-20", "FL-50", "RF-11", "TF-22", "FL-36", "FL-50R", "FL-36R"});
                    }
                    default: {
                        return super.c(v);
                    }
                }
            }
            String s4 = ((OlympusEquipmentMakernoteDirectory)b0).getString(0x100);
            if(s4 != null) {
                return OlympusMakernoteDirectory.OlympusCameraTypes.containsKey(s4) ? ((String)OlympusMakernoteDirectory.OlympusCameraTypes.get(s4)) : s4;
            }
            return null;
        }
        return this.l(0, 4);
    }
}

