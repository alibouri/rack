package com.drew.metadata.exif.makernotes;

import M.J;
import com.drew.metadata.a;
import com.drew.metadata.b;
import com.drew.metadata.c;
import com.drew.metadata.e;
import com.drew.metadata.g;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import l4.f;
import l4.k;

public final class d extends g {
    public final int b;
    public static final String[] c;

    static {
        d.c = new String[]{"Normal", "Portrait", "Scenery", "Sports", "Night Portrait", "Program", "Aperture Priority", "Shutter Priority", "Macro", "Spot", "Manual", "Movie Preview", "Panning", "Simple", "Color Effects", "Self Portrait", "Economy", "Fireworks", "Party", "Snow", "Night Scenery", "Food", "Baby", "Soft Skin", "Candlelight", "Starry Night", "High Sensitivity", "Panorama Assist", "Underwater", "Beach", "Aerial Photo", "Sunset", "Pet", "Intelligent ISO", "Clipboard", "High Speed Continuous Shooting", "Intelligent Auto", 0, "Multi-aspect", 0, "Transform", "Flash Burst", "Pin Hole", "Film Grain", "My Color", "Photo Frame", 0, 0, 0, 0, "HDR"};
    }

    public d(int v, b b0) {
        this.b = v;
        super(b0);
    }

    private final String A(int v) {
        switch(v) {
            case 1: {
                return this.g(1, 0, new String[]{"Auto", "Night-scene", "Manual", 0, "Multiple"});
            }
            case 2: {
                return this.g(2, 0, new String[]{"Good", "Better", "Best"});
            }
            case 3: {
                return this.g(3, 2, new String[]{"Custom", "Auto"});
            }
            case 4: {
                return this.g(4, 1, new String[]{"Auto", "Flash On", 0, "Flash Off", 0, "Red-eye Reduction"});
            }
            case 7: {
                return this.g(7, 0, new String[]{"Auto", "Daylight", "Shade", "Tungsten", "Fluorescent", "Manual"});
            }
            default: {
                b b0 = this.a;
                switch(v) {
                    case 10: {
                        Float float0 = ((PentaxMakernoteDirectory)b0).getFloatObject(10);
                        if(float0 != null) {
                            return ((float)float0) == 0.0f ? "Off" : Float.toString(((float)float0));
                        }
                        return null;
                    }
                    case 11: {
                        return this.g(11, 0, new String[]{"Normal", "Soft", "Hard"});
                    }
                    case 12: {
                        return this.g(12, 0, new String[]{"Normal", "Low", "High"});
                    }
                    case 13: {
                        return this.g(13, 0, new String[]{"Normal", "Low", "High"});
                    }
                    case 20: {
                        Integer integer0 = ((PentaxMakernoteDirectory)b0).getInteger(20);
                        if(integer0 != null) {
                            switch(((int)integer0)) {
                                case 10: 
                                case 100: {
                                    return "ISO 100";
                                }
                                case 16: 
                                case 200: {
                                    return "ISO 200";
                                }
                                default: {
                                    return m5.b.v("Unknown (", integer0, ")");
                                }
                            }
                        }
                        return null;
                    }
                    case 23: {
                        return this.g(23, 1, new String[]{"Normal", "Black & White", "Sepia"});
                    }
                    default: {
                        return super.c(v);
                    }
                }
            }
        }
    }

    private final String B(int v) {
        b b0 = this.a;
        switch(v) {
            case 16: {
                return String.format("%d", ((ReconyxHyperFire2MakernoteDirectory)b0).getInteger(16));
            }
            case 18: {
                return String.format("%d", ((ReconyxHyperFire2MakernoteDirectory)b0).getInteger(18));
            }
            case 42: {
                return ((ReconyxHyperFire2MakernoteDirectory)b0).getString(42);
            }
            case 0x30: {
                String s = ((ReconyxHyperFire2MakernoteDirectory)b0).getString(0x30);
                try {
                    SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
                    return simpleDateFormat0.format(simpleDateFormat0.parse(s));
                }
                catch(ParseException unused_ex) {
                    return null;
                }
            }
            case 52: {
                return ((ReconyxHyperFire2MakernoteDirectory)b0).getString(52);
            }
            case 54: {
                int[] arr_v = ((ReconyxHyperFire2MakernoteDirectory)b0).getIntArray(54);
                return arr_v == null ? null : String.format("%d/%d", ((int)arr_v[0]), ((int)arr_v[1]));
            }
            case 58: {
                return String.format("%d", ((ReconyxHyperFire2MakernoteDirectory)b0).getInteger(58));
            }
            case 62: {
                String s1 = ((ReconyxHyperFire2MakernoteDirectory)b0).getString(62);
                try {
                    SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
                    return simpleDateFormat1.format(simpleDateFormat1.parse(s1));
                }
                catch(ParseException unused_ex) {
                    return null;
                }
            }
            case 74: {
                return this.g(74, 0, new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"});
            }
            case 76: {
                return this.g(76, 0, new String[]{"New", "Waxing Crescent", "First Quarter", "Waxing Gibbous", "Full", "Waning Gibbous", "Last Quarter", "Waning Crescent"});
            }
            case 78: 
            case 80: {
                return String.format("%d", ((ReconyxHyperFire2MakernoteDirectory)b0).getInteger(v));
            }
            case 82: 
            case 84: 
            case 86: 
            case 88: {
                return String.format("%d", ((ReconyxHyperFire2MakernoteDirectory)b0).getInteger(v));
            }
            case 90: {
                return this.g(90, 0, new String[]{"Off", "On"});
            }
            case 92: 
            case 94: {
                return String.format("%d", ((ReconyxHyperFire2MakernoteDirectory)b0).getInteger(v));
            }
            case 0x60: {
                return String.format("%d", ((ReconyxHyperFire2MakernoteDirectory)b0).getInteger(0x60));
            }
            case 98: 
            case 100: {
                Double double0 = ((ReconyxHyperFire2MakernoteDirectory)b0).getDoubleObject(v);
                return double0 == null ? null : new DecimalFormat("0.000").format(double0);
            }
            case 102: {
                return String.format("%d", ((ReconyxHyperFire2MakernoteDirectory)b0).getInteger(102));
            }
            case 104: {
                return ((ReconyxHyperFire2MakernoteDirectory)b0).getString(104);
            }
            case 0x7E: {
                e e0 = ((ReconyxHyperFire2MakernoteDirectory)b0).getStringValue(0x7E);
                return e0 == null ? null : e0.toString();
            }
            default: {
                return super.c(v);
            }
        }
    }

    private final String C(int v) {
        b b0 = this.a;
        switch(v) {
            case 0: {
                return String.format("%d", ((ReconyxHyperFireMakernoteDirectory)b0).getInteger(0));
            }
            case 2: {
                return ((ReconyxHyperFireMakernoteDirectory)b0).getString(2);
            }
            case 12: {
                return ((ReconyxHyperFireMakernoteDirectory)b0).getString(12);
            }
            case 14: {
                int[] arr_v = ((ReconyxHyperFireMakernoteDirectory)b0).getIntArray(14);
                return arr_v == null ? null : String.format("%d/%d", ((int)arr_v[0]), ((int)arr_v[1]));
            }
            case 18: {
                return String.format("%d", ((ReconyxHyperFireMakernoteDirectory)b0).getInteger(18));
            }
            case 22: {
                String s = ((ReconyxHyperFireMakernoteDirectory)b0).getString(22);
                try {
                    SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
                    return simpleDateFormat0.format(simpleDateFormat0.parse(s));
                }
                catch(ParseException unused_ex) {
                    return null;
                }
            }
            case 36: {
                return this.g(36, 0, new String[]{"New", "Waxing Crescent", "First Quarter", "Waxing Gibbous", "Full", "Waning Gibbous", "Last Quarter", "Waning Crescent"});
            }
            case 38: 
            case 40: {
                return String.format("%d", ((ReconyxHyperFireMakernoteDirectory)b0).getInteger(v));
            }
            case 42: {
                e e0 = ((ReconyxHyperFireMakernoteDirectory)b0).getStringValue(42);
                return e0 == null ? null : e0.toString();
            }
            case 72: 
            case 74: 
            case 76: 
            case 78: {
                return String.format("%d", ((ReconyxHyperFireMakernoteDirectory)b0).getInteger(v));
            }
            case 80: {
                return this.g(80, 0, new String[]{"Off", "On"});
            }
            case 82: {
                return String.format("%d", ((ReconyxHyperFireMakernoteDirectory)b0).getInteger(82));
            }
            case 84: {
                Double double0 = ((ReconyxHyperFireMakernoteDirectory)b0).getDoubleObject(84);
                return double0 == null ? null : new DecimalFormat("0.000").format(double0);
            }
            case 86: {
                return ((ReconyxHyperFireMakernoteDirectory)b0).getString(86);
            }
            default: {
                return super.c(v);
            }
        }
    }

    private final String D(int v) {
        b b0 = this.a;
        switch(v) {
            case 0: {
                return ((ReconyxUltraFireMakernoteDirectory)b0).getString(0);
            }
            case 10: {
                return String.format("0x%08X", ((ReconyxUltraFireMakernoteDirectory)b0).getInteger(10));
            }
            case 14: {
                return String.format("%d", ((ReconyxUltraFireMakernoteDirectory)b0).getInteger(14));
            }
            case 18: {
                return String.format("0x%08X", ((ReconyxUltraFireMakernoteDirectory)b0).getInteger(18));
            }
            case 22: {
                return String.format("%d", ((ReconyxUltraFireMakernoteDirectory)b0).getInteger(22));
            }
            case 24: 
            case 0x1F: 
            case 38: 
            case 45: 
            case 52: {
                return ((ReconyxUltraFireMakernoteDirectory)b0).getString(v);
            }
            case 53: {
                int[] arr_v = ((ReconyxUltraFireMakernoteDirectory)b0).getIntArray(53);
                return arr_v == null ? null : String.format("%d/%d", ((int)arr_v[0]), ((int)arr_v[1]));
            }
            case 55: {
                return String.format("%d", ((ReconyxUltraFireMakernoteDirectory)b0).getInteger(55));
            }
            case 59: {
                String s = ((ReconyxUltraFireMakernoteDirectory)b0).getString(59);
                try {
                    SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
                    return simpleDateFormat0.format(simpleDateFormat0.parse(s));
                }
                catch(ParseException unused_ex) {
                    return null;
                }
            }
            case 67: {
                return this.g(67, 0, new String[]{"New", "Waxing Crescent", "First Quarter", "Waxing Gibbous", "Full", "Waning Gibbous", "Last Quarter", "Waning Crescent"});
            }
            case 68: 
            case 70: {
                return String.format("%d", ((ReconyxUltraFireMakernoteDirectory)b0).getInteger(v));
            }
            case 72: {
                return this.g(72, 0, new String[]{"Off", "On"});
            }
            case 73: {
                Double double0 = ((ReconyxUltraFireMakernoteDirectory)b0).getDoubleObject(73);
                return double0 == null ? null : new DecimalFormat("0.000").format(double0);
            }
            case 75: {
                e e0 = ((ReconyxUltraFireMakernoteDirectory)b0).getStringValue(75);
                return e0 == null ? null : e0.toString();
            }
            case 80: {
                return ((ReconyxUltraFireMakernoteDirectory)b0).getString(80);
            }
            default: {
                return super.c(v);
            }
        }
    }

    private final String E(int v) {
        if(v != 1) {
            b b0 = this.a;
            if(v != 2) {
                switch(v) {
                    case 3: {
                        Integer integer0 = ((SamsungType2MakernoteDirectory)b0).getInteger(3);
                        if(integer0 != null) {
                            switch(((int)integer0)) {
                                case 0x100101C: {
                                    return "NX10";
                                }
                                case 0x1001226: {
                                    return "HMX-S15BP";
                                }
                                case 0x1001233: {
                                    return "HMX-Q10";
                                }
                                case 0x1001234: {
                                    return "HMX-H304";
                                }
                                case 0x100130C: {
                                    return "NX100";
                                }
                                case 0x1001327: {
                                    return "NX11";
                                }
                                case 0x170104E: {
                                    return "ES70, ES71 / VLUU ES70, ES71 / SL600";
                                }
                                case 0x1701052: {
                                    return "ES73 / VLUU ES73 / SL605";
                                }
                                case 0x1701300: {
                                    return "ES28 / VLUU ES28";
                                }
                                case 0x1701303: {
                                    return "ES74,ES75,ES78 / VLUU ES75,ES78";
                                }
                                case 0x2001046: {
                                    return "PL150 / VLUU PL150 / TL210 / PL151";
                                }
                                case 0x2001311: {
                                    return "PL120,PL121 / VLUU PL120,PL121";
                                }
                                case 0x2001315: {
                                    return "PL170,PL171 / VLUUPL170,PL171";
                                }
                                case 0x200131E: {
                                    return "PL210, PL211 / VLUU PL210, PL211";
                                }
                                case 0x2701317: {
                                    return "PL20,PL21 / VLUU PL20,PL21";
                                }
                                case 0x2A0001B: {
                                    return "WP10 / VLUU WP10 / AQ100";
                                }
                                case 0x3000000: {
                                    return "Various Models (0x3000000)";
                                }
                                case 0x3A00018: {
                                    return "Various Models (0x3a00018)";
                                }
                                case 0x400101F: {
                                    return "ST1000 / ST1100 / VLUU ST1000 / CL65";
                                }
                                case 0x4001022: {
                                    return "ST550 / VLUU ST550 / TL225";
                                }
                                case 0x4001025: {
                                    return "Various Models (0x4001025)";
                                }
                                case 0x400103E: {
                                    return "VLUU ST5500, ST5500, CL80";
                                }
                                case 0x4001041: {
                                    return "VLUU ST5000, ST5000, TL240";
                                }
                                case 0x4001043: {
                                    return "ST70 / VLUU ST70 / ST71";
                                }
                                case 0x400130A: {
                                    return "Various Models (0x400130a)";
                                }
                                case 0x400130E: {
                                    return "ST90,ST91 / VLUU ST90,ST91";
                                }
                                case 0x4001313: {
                                    return "VLUU ST95, ST95";
                                }
                                case 0x4A00015: {
                                    return "VLUU ST60";
                                }
                                case 0x4A0135B: {
                                    return "ST30, ST65 / VLUU ST65 / ST67";
                                }
                                case 0x5000000: {
                                    return "Various Models (0x5000000)";
                                }
                                case 0x5001038: {
                                    return "Various Models (0x5001038)";
                                }
                                case 0x500103A: {
                                    return "WB650 / VLUU WB650 / WB660";
                                }
                                case 0x500103C: {
                                    return "WB600 / VLUU WB600 / WB610";
                                }
                                case 0x500133E: {
                                    return "WB150 / WB150F / WB152 / WB152F / WB151";
                                }
                                case 0x5A0000F: {
                                    return "WB5000 / HZ25W";
                                }
                                case 0x6001036: {
                                    return "EX1";
                                }
                                case 0x700131C: {
                                    return "VLUU SH100, SH100";
                                }
                                case 0x27127002: {
                                    return "SMX - C20N";
                                }
                                default: {
                                    return String.format("Unknown (%d)", integer0);
                                }
                            }
                        }
                        return null;
                    }
                    case 0x40: {
                        return this.g(0x40, 0, new String[]{"Little-endian (Intel)", "Big-endian (Motorola)"});
                    }
                    case 65: {
                        return this.g(65, 0, new String[]{"Auto", "Manual"});
                    }
                    case 67: {
                        Integer integer1 = b0.getInteger(67);
                        return integer1 == null ? null : String.format("%d C", integer1);
                    }
                    case 80: {
                        Integer integer2 = ((SamsungType2MakernoteDirectory)b0).getInteger(80);
                        if(integer2 != null) {
                            int v1 = (int)integer2;
                            switch(v1) {
                                case 0: {
                                    return "Unchanged";
                                }
                                case 1: {
                                    return "Swap";
                                }
                                default: {
                                    return v1 == 0xFFFF ? "Roll" : String.format("Unknown (%d)", integer2);
                                }
                            }
                        }
                        return null;
                    }
                    case 0x100: {
                        return this.g(0x100, 0, new String[]{"Off", "On"});
                    }
                    case 0x120: {
                        return this.g(0x120, 0, new String[]{"Off", "On"});
                    }
                    case 0xA003: {
                        return this.g(0xA003, 0, new String[]{"Built-in or Manual Lens", "Samsung NX 30mm F2 Pancake", "Samsung NX 18-55mm F3.5-5.6 OIS", "Samsung NX 50-200mm F4-5.6 ED OIS", "Samsung NX 20-50mm F3.5-5.6 ED", "Samsung NX 20mm F2.8 Pancake", "Samsung NX 18-200mm F3.5-6.3 ED OIS", "Samsung NX 60mm F2.8 Macro ED OIS SSA", "Samsung NX 16mm F2.4 Pancake", "Samsung NX 85mm F1.4 ED SSA", "Samsung NX 45mm F1.8", "Samsung NX 45mm F1.8 2D/3D", "Samsung NX 12-24mm F4-5.6 ED", "Samsung NX 16-50mm F2-2.8 S ED OIS", "Samsung NX 10mm F3.5 Fisheye", "Samsung NX 16-50mm F3.5-5.6 Power Zoom ED OIS", 0, 0, 0, 0, "Samsung NX 50-150mm F2.8 S ED OIS", "Samsung NX 300mm F2.8 ED OIS"});
                    }
                    case 0xA011: {
                        return this.g(0xA011, 0, new String[]{"sRGB", "Adobe RGB"});
                    }
                    case 0xA012: {
                        return this.g(0xA012, 0, new String[]{"Off", "On"});
                    }
                    default: {
                        return super.c(v);
                    }
                }
            }
            Integer integer3 = ((SamsungType2MakernoteDirectory)b0).getInteger(2);
            if(integer3 != null) {
                switch(((int)integer3)) {
                    case 0x1000: {
                        return "Compact Digital Camera";
                    }
                    case 0x2000: {
                        return "High-end NX Camera";
                    }
                    case 0x3000: {
                        return "HXM Video Camera";
                    }
                    case 0x12000: {
                        return "Cell Phone";
                    }
                    case 0x300000: {
                        return "SMX Video Camera";
                    }
                    default: {
                        return String.format("Unknown (%d)", integer3);
                    }
                }
            }
            return null;
        }
        return this.l(1, 2);
    }

    private final String F(int v) {
        b b0 = this.a;
        switch(v) {
            case 0x201: {
                Integer integer0 = ((SanyoMakernoteDirectory)b0).getInteger(0x201);
                if(integer0 != null) {
                    switch(((int)integer0)) {
                        case 0: {
                            return "Normal/Very Low";
                        }
                        case 1: {
                            return "Normal/Low";
                        }
                        case 2: {
                            return "Normal/Medium Low";
                        }
                        case 3: {
                            return "Normal/Medium";
                        }
                        case 4: {
                            return "Normal/Medium High";
                        }
                        case 5: {
                            return "Normal/High";
                        }
                        case 6: {
                            return "Normal/Very High";
                        }
                        case 7: {
                            return "Normal/Super High";
                        }
                        case 0x100: {
                            return "Fine/Very Low";
                        }
                        case 0x101: {
                            return "Fine/Low";
                        }
                        case 0x102: {
                            return "Fine/Medium Low";
                        }
                        case 0x103: {
                            return "Fine/Medium";
                        }
                        case 260: {
                            return "Fine/Medium High";
                        }
                        case 0x105: {
                            return "Fine/High";
                        }
                        case 0x106: {
                            return "Fine/Very High";
                        }
                        case 0x107: {
                            return "Fine/Super High";
                        }
                        case 0x200: {
                            return "Super Fine/Very Low";
                        }
                        case 0x201: {
                            return "Super Fine/Low";
                        }
                        case 0x202: {
                            return "Super Fine/Medium Low";
                        }
                        case 0x203: {
                            return "Super Fine/Medium";
                        }
                        case 0x204: {
                            return "Super Fine/Medium High";
                        }
                        case 0x205: {
                            return "Super Fine/High";
                        }
                        case 0x206: {
                            return "Super Fine/Very High";
                        }
                        case 0x207: {
                            return "Super Fine/Super High";
                        }
                        default: {
                            return m5.b.v("Unknown (", integer0, ")");
                        }
                    }
                }
                return null;
            }
            case 0x202: {
                return this.g(0x202, 0, new String[]{"Normal", "Macro", "View", "Manual"});
            }
            case 0x204: {
                k k0 = b0.getRational(0x204);
                return k0 == null ? null : String.format("%.3f", k0.doubleValue());
            }
            case 0x20E: {
                return this.g(0x20E, 0, new String[]{"None", "Standard", "Best", "Adjust Exposure"});
            }
            case 0x20F: {
                return this.g(0x20F, 0, new String[]{"Off", "On"});
            }
            case 0x210: {
                return this.g(0x210, 0, new String[]{"Off", "On"});
            }
            case 531: {
                return this.g(531, 0, new String[]{"Off", "On"});
            }
            case 532: {
                return this.g(532, 0, new String[]{"Off", "On"});
            }
            case 534: {
                return this.g(534, 0, new String[]{"Off", "On"});
            }
            case 535: {
                return this.g(535, 0, new String[]{"Record while down", "Press start, press stop"});
            }
            case 536: {
                return this.g(536, 0, new String[]{"Off", "On"});
            }
            case 537: {
                return this.g(537, 0, new String[]{"Off", "On"});
            }
            case 539: {
                return this.g(539, 0, new String[]{"Off", "On"});
            }
            case 541: {
                return this.g(541, 0, new String[]{"Off", "On"});
            }
            case 542: {
                return this.g(542, 0, new String[]{"No", "Yes"});
            }
            case 0x21F: {
                return this.g(0x21F, 0, new String[]{"Off", "Sport", "TV", "Night", "User 1", "User 2", "Lamp"});
            }
            case 548: {
                return this.g(548, 0, new String[]{"5 frames/sec", "10 frames/sec", "15 frames/sec", "20 frames/sec"});
            }
            case 549: {
                return this.g(549, 0, new String[]{"Auto", "Force", "Disabled", "Red eye"});
            }
            default: {
                return super.c(v);
            }
        }
    }

    private final String G(int v) {
        b b0 = this.a;
        switch(v) {
            case 8: {
                String s = ((SigmaMakernoteDirectory)b0).getString(8);
                if(s != null && s.length() != 0) {
                    switch(s.charAt(0)) {
                        case 65: {
                            return "Aperture Priority AE";
                        }
                        case 77: {
                            return "Manual";
                        }
                        case 80: {
                            return "Program AE";
                        }
                        case 83: {
                            return "Shutter Speed Priority AE";
                        }
                        default: {
                            return s;
                        }
                    }
                }
                return null;
            }
            case 9: {
                String s1 = ((SigmaMakernoteDirectory)b0).getString(9);
                if(s1 != null && s1.length() != 0) {
                    int v1 = s1.charAt(0);
                    switch(v1) {
                        case 56: {
                            return "Multi Segment";
                        }
                        case 65: {
                            return "Average";
                        }
                        default: {
                            return v1 == 67 ? "Center Weighted Average" : s1;
                        }
                    }
                }
                return null;
            }
            default: {
                return super.c(v);
            }
        }
    }

    private final String H(int v) {
        b b0 = this.a;
        switch(v) {
            case 57: {
                Integer integer0 = ((SonyTag9050bDirectory)b0).getInteger(57);
                if(integer0 != null) {
                    switch(((int)integer0)) {
                        case 0: {
                            return "No flash present";
                        }
                        case 2: {
                            return "Flash inhibited";
                        }
                        case 0x40: {
                            return "Built-in flash present";
                        }
                        case 65: {
                            return "Built-in flash fired";
                        }
                        case 66: {
                            return "Built-in flash inhibited";
                        }
                        case 0x80: {
                            return "External flash present";
                        }
                        case 0x81: {
                            return "External flash fired";
                        }
                        default: {
                            return m5.b.v("Unknown (", integer0, ")");
                        }
                    }
                }
                return null;
            }
            case 70: {
                Float float0 = ((SonyTag9050bDirectory)b0).getFloatObject(70);
                if(float0 != null) {
                    return ((float)float0) == 0.0f ? "0" : m5.b.s(((int)(((double)(1.0f / ((float)float0))) + 0.5)), "1/");
                }
                return null;
            }
            case 0x88: {
                int[] arr_v = ((SonyTag9050bDirectory)b0).getIntArray(0x88);
                if(arr_v != null) {
                    StringBuilder stringBuilder0 = new StringBuilder();
                    for(int v1 = 0; v1 < arr_v.length; ++v1) {
                        stringBuilder0.append(String.format("%02x", ((int)arr_v[v1])));
                    }
                    return stringBuilder0.toString();
                }
                return null;
            }
            default: {
                return super.c(v);
            }
        }
    }

    private final String I(int v) {
        b b0 = this.a;
        switch(v) {
            case 0x102: {
                return this.g(0x102, 0, new String[]{"RAW", "Super Fine", "Fine", "Standard", "Economy", "Extra Fine", "RAW + JPEG", "Compressed RAW", "Compressed RAW + JPEG"});
            }
            case 260: {
                Integer integer0 = b0.getInteger(260);
                return integer0 == null ? null : String.format("%d EV", integer0);
            }
            case 0x105: {
                Integer integer1 = ((SonyType1MakernoteDirectory)b0).getInteger(0x105);
                if(integer1 != null) {
                    switch(((int)integer1)) {
                        case 0: {
                            return "None";
                        }
                        case 72: {
                            return "Minolta/Sony AF 2x APO (D)";
                        }
                        case 80: {
                            return "Minolta AF 2x APO II";
                        }
                        case 0x60: {
                            return "Minolta AF 2x APO";
                        }
                        case 0x88: {
                            return "Minolta/Sony AF 1.4x APO (D)";
                        }
                        case 0x90: {
                            return "Minolta AF 1.4x APO II";
                        }
                        case 0xA0: {
                            return "Minolta AF 1.4x APO";
                        }
                        default: {
                            return m5.b.v("Unknown (", integer1, ")");
                        }
                    }
                }
                return null;
            }
            case 277: {
                Integer integer2 = ((SonyType1MakernoteDirectory)b0).getInteger(277);
                if(integer2 == null) {
                    return null;
                }
                switch(((int)integer2)) {
                    case 0: {
                        return "Auto";
                    }
                    case 1: {
                        return "Color Temperature/Color Filter";
                    }
                    case 16: {
                        return "Daylight";
                    }
                    case 0x20: {
                        return "Cloudy";
                    }
                    case 0x30: {
                        return "Shade";
                    }
                    case 0x40: {
                        return "Tungsten";
                    }
                    case 80: {
                        return "Flash";
                    }
                    case 0x60: {
                        return "Fluorescent";
                    }
                    case 0x70: {
                        return "Custom";
                    }
                    default: {
                        return m5.b.v("Unknown (", integer2, ")");
                    }
                }
            }
            case 0x2009: {
                Integer integer3 = ((SonyType1MakernoteDirectory)b0).getInteger(0x2009);
                if(integer3 == null) {
                    return null;
                }
                switch(((int)integer3)) {
                    case 0: {
                        return "Off";
                    }
                    case 1: {
                        return "On";
                    }
                    case 2: {
                        return "Normal";
                    }
                    case 3: {
                        return "High";
                    }
                    case 0x100: {
                        return "Auto";
                    }
                    case 0xFFFF: {
                        return "N/A";
                    }
                    default: {
                        return String.format("Unknown (%d)", integer3);
                    }
                }
            }
            case 0x200E: {
                Integer integer4 = ((SonyType1MakernoteDirectory)b0).getInteger(0x200E);
                if(integer4 == null) {
                    return null;
                }
                switch(((int)integer4)) {
                    case 0: {
                        return "Off";
                    }
                    case 1: {
                        return "Toy Camera";
                    }
                    case 2: {
                        return "Pop Color";
                    }
                    case 3: {
                        return "Posterization";
                    }
                    case 4: {
                        return "Posterization B/W";
                    }
                    case 5: {
                        return "Retro Photo";
                    }
                    case 6: {
                        return "Soft High Key";
                    }
                    case 7: {
                        return "Partial Color (red)";
                    }
                    case 8: {
                        return "Partial Color (green)";
                    }
                    case 9: {
                        return "Partial Color (blue)";
                    }
                    case 10: {
                        return "Partial Color (yellow)";
                    }
                    case 13: {
                        return "High Contrast Monochrome";
                    }
                    case 16: {
                        return "Toy Camera (normal)";
                    }
                    case 17: {
                        return "Toy Camera (cool)";
                    }
                    case 18: {
                        return "Toy Camera (warm)";
                    }
                    case 19: {
                        return "Toy Camera (green)";
                    }
                    case 20: {
                        return "Toy Camera (magenta)";
                    }
                    case 0x20: {
                        return "Soft Focus (low)";
                    }
                    case 33: {
                        return "Soft Focus";
                    }
                    case 34: {
                        return "Soft Focus (high)";
                    }
                    case 0x30: {
                        return "Miniature (auto)";
                    }
                    case 49: {
                        return "Miniature (top)";
                    }
                    case 50: {
                        return "Miniature (middle horizontal)";
                    }
                    case 51: {
                        return "Miniature (bottom)";
                    }
                    case 52: {
                        return "Miniature (left)";
                    }
                    case 53: {
                        return "Miniature (middle vertical)";
                    }
                    case 54: {
                        return "Miniature (right)";
                    }
                    case 0x40: {
                        return "HDR Painting (low)";
                    }
                    case 65: {
                        return "HDR Painting";
                    }
                    case 66: {
                        return "HDR Painting (high)";
                    }
                    case 80: {
                        return "Rich-tone Monochrome";
                    }
                    case 97: {
                        return "Water Color";
                    }
                    case 98: {
                        return "Water Color 2";
                    }
                    case 0x70: {
                        return "Illustration (low)";
                    }
                    case 0x71: {
                        return "Illustration";
                    }
                    case 0x72: {
                        return "Illustration (high)";
                    }
                    default: {
                        return String.format("Unknown (%d)", integer4);
                    }
                }
            }
            case 0x200F: {
                return this.g(0x200F, 0, new String[]{"Off", "Low", "Mid", "High"});
            }
            case 8209: {
                Integer integer5 = ((SonyType1MakernoteDirectory)b0).getInteger(8209);
                if(integer5 == null) {
                    return null;
                }
                int v1 = (int)integer5;
                switch(v1) {
                    case -1: {
                        return "N/A";
                    }
                    case 0: {
                        return "Off";
                    }
                    default: {
                        return v1 == 2 ? "Auto" : String.format("Unknown (%d)", integer5);
                    }
                }
            }
            case 8210: {
                Integer integer6 = ((SonyType1MakernoteDirectory)b0).getInteger(8210);
                if(integer6 == null) {
                    return null;
                }
                int v2 = (int)integer6;
                switch(v2) {
                    case -1: {
                        return "N/A";
                    }
                    case 0: {
                        return "Off";
                    }
                    default: {
                        return v2 == 2 ? "Auto" : String.format("Unknown (%d)", integer6);
                    }
                }
            }
            case 0x2013: {
                Integer integer7 = ((SonyType1MakernoteDirectory)b0).getInteger(0x2013);
                if(integer7 == null) {
                    return null;
                }
                int v3 = (int)integer7;
                switch(v3) {
                    case -1: {
                        return "N/A";
                    }
                    case 0: {
                        return "Off";
                    }
                    default: {
                        return v3 == 2 ? "Auto" : String.format("Unknown (%d)", integer7);
                    }
                }
            }
            case 0x2016: {
                return this.g(0x2016, 0, new String[]{"No", "Yes"});
            }
            case 0x201B: {
                return this.g(0x201B, 0, new String[]{"Manual", 0, "AF-A", "AF-C", "AF-S", 0, "DMF", "AF-D"});
            }
            case 0x201E: {
                return this.g(0x201E, 0, new String[]{"Auto", "Center", "Top", "Upper-right", "Right", "Lower-right", "Bottom", "Lower-left", "Left", "Upper-left\t  \t", "Far Right", "Far Left", "Upper-middle", "Near Right", "Lower-middle", "Near Left", "Upper Far Right", "Lower Far Right", "Lower Far Left", "Upper Far Left"});
            }
            case 0xB001: {
                Integer integer8 = ((SonyType1MakernoteDirectory)b0).getInteger(0xB001);
                if(integer8 != null) {
                    switch(((int)integer8)) {
                        case 2: {
                            return "DSC-R1";
                        }
                        case 0x100: {
                            return "DSLR-A100";
                        }
                        case 0x101: {
                            return "DSLR-A900";
                        }
                        case 0x102: {
                            return "DSLR-A700";
                        }
                        case 0x103: {
                            return "DSLR-A200";
                        }
                        case 260: {
                            return "DSLR-A350";
                        }
                        case 0x105: {
                            return "DSLR-A300";
                        }
                        case 0x106: {
                            return "DSLR-A900 (APS-C mode)";
                        }
                        case 0x107: {
                            return "DSLR-A380/A390";
                        }
                        case 0x108: {
                            return "DSLR-A330";
                        }
                        case 0x109: {
                            return "DSLR-A230";
                        }
                        case 0x10A: {
                            return "DSLR-A290";
                        }
                        case 0x10D: {
                            return "DSLR-A850";
                        }
                        case 270: {
                            return "DSLR-A850 (APS-C mode)";
                        }
                        case 273: {
                            return "DSLR-A550";
                        }
                        case 274: {
                            return "DSLR-A500";
                        }
                        case 275: {
                            return "DSLR-A450";
                        }
                        case 278: {
                            return "NEX-5";
                        }
                        case 279: {
                            return "NEX-3";
                        }
                        case 280: {
                            return "SLT-A33";
                        }
                        case 281: {
                            return "SLT-A55V";
                        }
                        case 282: {
                            return "DSLR-A560";
                        }
                        case 283: {
                            return "DSLR-A580";
                        }
                        case 284: {
                            return "NEX-C3";
                        }
                        case 285: {
                            return "SLT-A35";
                        }
                        case 286: {
                            return "SLT-A65V";
                        }
                        case 0x11F: {
                            return "SLT-A77V";
                        }
                        case 0x120: {
                            return "NEX-5N";
                        }
                        case 289: {
                            return "NEX-7";
                        }
                        case 290: {
                            return "NEX-VG20E";
                        }
                        case 291: {
                            return "SLT-A37";
                        }
                        case 292: {
                            return "SLT-A57";
                        }
                        case 293: {
                            return "NEX-F3";
                        }
                        case 294: {
                            return "SLT-A99V";
                        }
                        case 295: {
                            return "NEX-6";
                        }
                        case 296: {
                            return "NEX-5R";
                        }
                        case 297: {
                            return "DSC-RX100";
                        }
                        case 298: {
                            return "DSC-RX1";
                        }
                        case 299: {
                            return "NEX - VG900";
                        }
                        case 300: {
                            return "NEX - VG30E";
                        }
                        case 302: {
                            return "ILCE - 3000 / ILCE - 3500";
                        }
                        case 303: {
                            return "SLT - A58";
                        }
                        case 305: {
                            return "NEX - 3N";
                        }
                        case 306: {
                            return "ILCE-7";
                        }
                        case 307: {
                            return "NEX-5T";
                        }
                        case 308: {
                            return "DSC-RX100M2";
                        }
                        case 309: {
                            return "DSC-RX10";
                        }
                        case 310: {
                            return "DSC-RX1R";
                        }
                        case 311: {
                            return "ILCE-7R";
                        }
                        case 312: {
                            return "ILCE-6000";
                        }
                        case 313: {
                            return "ILCE-5000";
                        }
                        case 317: {
                            return "DSC-RX100M3";
                        }
                        case 318: {
                            return "ILCE-7S";
                        }
                        case 0x13F: {
                            return "ILCA-77M2";
                        }
                        case 339: {
                            return "ILCE-5100";
                        }
                        case 340: {
                            return "ILCE-7M2";
                        }
                        case 341: {
                            return "DSC-RX100M4";
                        }
                        case 342: {
                            return "DSC-RX10M2";
                        }
                        case 344: {
                            return "DSC-RX1RM2";
                        }
                        case 346: {
                            return "ILCE-QX1";
                        }
                        case 347: {
                            return "ILCE-7RM2";
                        }
                        case 350: {
                            return "ILCE-7SM2";
                        }
                        case 353: {
                            return "ILCA-68";
                        }
                        case 354: {
                            return "ILCA-99M2";
                        }
                        case 355: {
                            return "DSC-RX10M3";
                        }
                        case 356: {
                            return "DSC-RX100M5";
                        }
                        case 357: {
                            return "ILCE-6300";
                        }
                        case 358: {
                            return "ILCE-9";
                        }
                        case 360: {
                            return "ILCE-6500";
                        }
                        case 362: {
                            return "ILCE-7RM3";
                        }
                        case 363: {
                            return "ILCE-7M3";
                        }
                        case 364: {
                            return "DSC-RX0";
                        }
                        case 365: {
                            return "DSC-RX10M4";
                        }
                        case 366: {
                            return "DSC-RX100M6";
                        }
                        case 0x16F: {
                            return "DSC-HX99";
                        }
                        case 369: {
                            return "DSC-RX100M5A";
                        }
                        case 371: {
                            return "ILCE-6400";
                        }
                        case 372: {
                            return "DSC-RX0M2";
                        }
                        case 374: {
                            return "DSC-RX100M7";
                        }
                        case 375: {
                            return "ILCE-7RM4";
                        }
                        case 376: {
                            return "ILCE-9M2";
                        }
                        case 378: {
                            return "ILCE-6600";
                        }
                        case 379: {
                            return "ILCE-6100";
                        }
                        case 380: {
                            return "ZV-1";
                        }
                        case 381: {
                            return "ILCE-7C";
                        }
                        case 0x17F: {
                            return "ILCE-7SM3";
                        }
                        default: {
                            return m5.b.v("Unknown (", integer8, ")");
                        }
                    }
                }
                return null;
            }
            case 0xB021: {
                Integer integer9 = ((SonyType1MakernoteDirectory)b0).getInteger(0xB021);
                if(integer9 == null) {
                    return null;
                }
                return ((int)integer9) == 0 ? "Auto" : String.format("%d K", ((int)((((int)integer9) & 0xFF000000) >> 24 | (((int)integer9) & 0xFF0000) >> 8)));
            }
            case 0xB023: {
                Integer integer10 = ((SonyType1MakernoteDirectory)b0).getInteger(0xB023);
                if(integer10 == null) {
                    return null;
                }
                switch(((int)integer10)) {
                    case 0: {
                        return "Standard";
                    }
                    case 1: {
                        return "Portrait";
                    }
                    case 2: {
                        return "Text";
                    }
                    case 3: {
                        return "Night Scene";
                    }
                    case 4: {
                        return "Sunset";
                    }
                    case 5: {
                        return "Sports";
                    }
                    case 6: {
                        return "Landscape";
                    }
                    case 7: {
                        return "Night Portrait";
                    }
                    case 8: {
                        return "Macro";
                    }
                    case 9: {
                        return "Super Macro";
                    }
                    case 16: {
                        return "Auto";
                    }
                    case 17: {
                        return "Night View/Portrait";
                    }
                    case 18: {
                        return "Sweep Panorama";
                    }
                    case 19: {
                        return "Handheld Night Shot";
                    }
                    case 20: {
                        return "Anti Motion Blur";
                    }
                    case 21: {
                        return "Cont. Priority AE";
                    }
                    case 22: {
                        return "Auto+";
                    }
                    case 23: {
                        return "3D Sweep Panorama";
                    }
                    case 24: {
                        return "Superior Auto";
                    }
                    case 25: {
                        return "High Sensitivity";
                    }
                    case 26: {
                        return "Fireworks";
                    }
                    case 27: {
                        return "Food";
                    }
                    case 28: {
                        return "Pet";
                    }
                    default: {
                        return m5.b.v("Unknown (", integer10, ")");
                    }
                }
            }
            case 0xB024: {
                return this.g(0xB024, 0, new String[]{"ISO Setting Used", "High Key", "Low Key"});
            }
            case 0xB025: {
                Integer integer11 = ((SonyType1MakernoteDirectory)b0).getInteger(0xB025);
                if(integer11 == null) {
                    return null;
                }
                switch(((int)integer11)) {
                    case 0: {
                        return "Off";
                    }
                    case 1: {
                        return "Standard";
                    }
                    case 2: {
                        return "Advanced Auto";
                    }
                    case 3: {
                        return "Auto";
                    }
                    case 8: {
                        return "Advanced LV1";
                    }
                    case 9: {
                        return "Advanced LV2";
                    }
                    case 10: {
                        return "Advanced LV3";
                    }
                    case 11: {
                        return "Advanced LV4";
                    }
                    case 12: {
                        return "Advanced LV5";
                    }
                    case 16: {
                        return "LV1";
                    }
                    case 17: {
                        return "LV2";
                    }
                    case 18: {
                        return "LV3";
                    }
                    case 19: {
                        return "LV4";
                    }
                    case 20: {
                        return "LV5";
                    }
                    default: {
                        return String.format("Unknown (%d)", integer11);
                    }
                }
            }
            case 0xB026: {
                Integer integer12 = ((SonyType1MakernoteDirectory)b0).getInteger(0xB026);
                if(integer12 == null) {
                    return null;
                }
                switch(((int)integer12)) {
                    case 0: {
                        return "Off";
                    }
                    case 1: {
                        return "On";
                    }
                    default: {
                        return "N/A";
                    }
                }
            }
            case 0xB029: {
                Integer integer13 = ((SonyType1MakernoteDirectory)b0).getInteger(0xB029);
                if(integer13 == null) {
                    return null;
                }
                switch(((int)integer13)) {
                    case 0: {
                        return "Standard";
                    }
                    case 1: {
                        return "Vivid";
                    }
                    case 2: {
                        return "Portrait";
                    }
                    case 3: {
                        return "Landscape";
                    }
                    case 4: {
                        return "Sunset";
                    }
                    case 5: {
                        return "Night Portrait";
                    }
                    case 6: {
                        return "Black & White";
                    }
                    case 7: {
                        return "Adobe RGB";
                    }
                    case 16: {
                        return "Autumn";
                    }
                    case 17: {
                        return "Sepia";
                    }
                    case 12: 
                    case 100: {
                        return "Neutral";
                    }
                    case 13: 
                    case 101: {
                        return "Clear";
                    }
                    case 14: 
                    case 102: {
                        return "Deep";
                    }
                    case 15: 
                    case 103: {
                        return "Light";
                    }
                    case 104: {
                        return "Night View";
                    }
                    case 105: {
                        return "Autumn Leaves";
                    }
                    default: {
                        return String.format("Unknown (%d)", integer13);
                    }
                }
            }
            case 0xB040: {
                Integer integer14 = ((SonyType1MakernoteDirectory)b0).getInteger(0xB040);
                if(integer14 == null) {
                    return null;
                }
                switch(((int)integer14)) {
                    case 0: {
                        return "Off";
                    }
                    case 1: {
                        return "On";
                    }
                    case 2: {
                        return "Magnifying Glass/Super Macro";
                    }
                    case 0xFFFF: {
                        return "N/A";
                    }
                    default: {
                        return String.format("Unknown (%d)", integer14);
                    }
                }
            }
            case 0xB041: {
                Integer integer15 = ((SonyType1MakernoteDirectory)b0).getInteger(0xB041);
                if(integer15 == null) {
                    return null;
                }
                switch(((int)integer15)) {
                    case 0: {
                        return "Program";
                    }
                    case 1: {
                        return "Portrait";
                    }
                    case 2: {
                        return "Beach";
                    }
                    case 3: {
                        return "Sports";
                    }
                    case 4: {
                        return "Snow";
                    }
                    case 5: {
                        return "Landscape";
                    }
                    case 6: {
                        return "Auto";
                    }
                    case 7: {
                        return "Aperture Priority";
                    }
                    case 8: {
                        return "Shutter Priority";
                    }
                    case 9: {
                        return "Night Scene / Twilight";
                    }
                    case 10: {
                        return "Hi-Speed Shutter";
                    }
                    case 11: {
                        return "Twilight Portrait";
                    }
                    case 12: {
                        return "Soft Snap/Portrait";
                    }
                    case 13: {
                        return "Fireworks";
                    }
                    case 14: {
                        return "Smile Shutter";
                    }
                    case 15: {
                        return "Manual";
                    }
                    case 18: {
                        return "High Sensitivity";
                    }
                    case 19: {
                        return "Macro";
                    }
                    case 20: {
                        return "Advanced Sports Shooting";
                    }
                    case 29: {
                        return "Underwater";
                    }
                    case 33: {
                        return "Food";
                    }
                    case 34: {
                        return "Panorama";
                    }
                    case 35: {
                        return "Handheld Night Shot";
                    }
                    case 36: {
                        return "Anti Motion Blur";
                    }
                    case 37: {
                        return "Pet";
                    }
                    case 38: {
                        return "Backlight Correction HDR";
                    }
                    case 39: {
                        return "Superior Auto";
                    }
                    case 40: {
                        return "Background Defocus";
                    }
                    case 41: {
                        return "Soft Skin";
                    }
                    case 42: {
                        return "3D Image";
                    }
                    case 0xFFFF: {
                        return "N/A";
                    }
                    default: {
                        return String.format("Unknown (%d)", integer15);
                    }
                }
            }
            case 0xB043: {
                Integer integer16 = ((SonyType1MakernoteDirectory)b0).getInteger(0xB043);
                if(integer16 == null) {
                    return null;
                }
                switch(((int)integer16)) {
                    case 0: {
                        return "Default";
                    }
                    case 1: {
                        return "Multi";
                    }
                    case 2: {
                        return "Center";
                    }
                    case 3: {
                        return "Spot";
                    }
                    case 4: {
                        return "Flexible Spot";
                    }
                    case 6: {
                        return "Touch";
                    }
                    case 14: {
                        return "Manual Focus";
                    }
                    case 15: {
                        return "Face Detected";
                    }
                    case 0xFFFF: {
                        return "n/a";
                    }
                    default: {
                        return m5.b.v("Unknown (", integer16, ")");
                    }
                }
            }
            case 0xB044: {
                Integer integer17 = ((SonyType1MakernoteDirectory)b0).getInteger(0xB044);
                if(integer17 == null) {
                    return null;
                }
                switch(((int)integer17)) {
                    case 0: {
                        return "Off";
                    }
                    case 1: {
                        return "Auto";
                    }
                    case 0xFFFF: {
                        return "n/a";
                    }
                    default: {
                        return m5.b.v("Unknown (", integer17, ")");
                    }
                }
            }
            case 0xB047: {
                Integer integer18 = ((SonyType1MakernoteDirectory)b0).getInteger(0xB047);
                if(integer18 == null) {
                    return null;
                }
                switch(((int)integer18)) {
                    case 0: {
                        return "Normal";
                    }
                    case 1: {
                        return "Fine";
                    }
                    case 2: {
                        return "Extra Fine";
                    }
                    case 0xFFFF: {
                        return "N/A";
                    }
                    default: {
                        return String.format("Unknown (%d)", integer18);
                    }
                }
            }
            case 0xB048: {
                Integer integer19 = ((SonyType1MakernoteDirectory)b0).getInteger(0xB048);
                if(integer19 == null) {
                    return null;
                }
                switch(((int)integer19)) {
                    case 0xFFFF8000: {
                        return "Low";
                    }
                    case -3: {
                        return "-3/3";
                    }
                    case -2: {
                        return "-2/3";
                    }
                    case -1: {
                        return "-1/3";
                    }
                    case 0: {
                        return "Normal";
                    }
                    case 1: {
                        return "+1/3";
                    }
                    case 2: {
                        return "+2/3";
                    }
                    case 3: {
                        return "+3/3";
                    }
                    case 0x80: {
                        return "n/a";
                    }
                    case 0x7FFF: {
                        return "High";
                    }
                    default: {
                        return m5.b.v("Unknown (", integer19, ")");
                    }
                }
            }
            case 0xB049: {
                Integer integer20 = ((SonyType1MakernoteDirectory)b0).getInteger(0xB049);
                if(integer20 == null) {
                    return null;
                }
                switch(((int)integer20)) {
                    case 0: {
                        return "Normal";
                    }
                    case 2: {
                        return "Continuous";
                    }
                    case 5: {
                        return "Exposure Bracketing";
                    }
                    case 6: {
                        return "White Balance Bracketing";
                    }
                    case 0xFFFF: {
                        return "n/a";
                    }
                    default: {
                        return m5.b.v("Unknown (", integer20, ")");
                    }
                }
            }
            case 0xB04A: {
                Integer integer21 = ((SonyType1MakernoteDirectory)b0).getInteger(0xB049);
                if(integer21 == null) {
                    return null;
                }
                switch(((int)integer21)) {
                    case 0: {
                        return "Single";
                    }
                    case 0xFFFF: {
                        return "n/a";
                    }
                    default: {
                        return integer21.toString();
                    }
                }
            }
            case 0xB04B: {
                Integer integer22 = ((SonyType1MakernoteDirectory)b0).getInteger(0xB04B);
                if(integer22 == null) {
                    return null;
                }
                switch(((int)integer22)) {
                    case 0: {
                        return "Off";
                    }
                    case 1: {
                        return "On (Continuous)";
                    }
                    case 2: {
                        return "On (Shooting)";
                    }
                    case 0xFFFF: {
                        return "N/A";
                    }
                    default: {
                        return String.format("Unknown (%d)", integer22);
                    }
                }
            }
            case 0xB04E: {
                Integer integer23 = ((SonyType1MakernoteDirectory)b0).getInteger(0xB04E);
                if(integer23 == null) {
                    return null;
                }
                switch(((int)integer23)) {
                    case 0: {
                        return "Off";
                    }
                    case 1: {
                        return "On";
                    }
                    case 0xFFFF: {
                        return "N/A";
                    }
                    default: {
                        return String.format("Unknown (%d)", integer23);
                    }
                }
            }
            default: {
                return super.c(v);
            }
        }
    }

    public String J(int v) {
        int[] arr_v = ((NikonType2MakernoteDirectory)this.a).getIntArray(v);
        return arr_v == null || arr_v.length < 2 || arr_v.length < 3 || arr_v[2] == 0 ? null : new DecimalFormat("0.##").format(((double)(arr_v[0] * arr_v[1])) / ((double)arr_v[2])) + " EV";
    }

    public String K(int v) {
        byte[] arr_b = ((PanasonicMakernoteDirectory)this.a).getByteArray(v);
        if(arr_b == null) {
            return null;
        }
        l4.b b0 = new l4.b(0, arr_b);
        try {
            int v1 = b0.y(0);
            int v2 = b0.y(2);
            switch(v1) {
                case -3: {
                    return v2 == 2 ? "Slim High" : "Unknown (" + -3 + " " + v2 + ")";
                }
                case 0: {
                    return v2 == 0 ? "Off" : "Unknown (" + 0 + " " + v2 + ")";
                }
                case 1: {
                    return v2 == 1 ? "Stretch Low" : "Unknown (" + 1 + " " + v2 + ")";
                }
                case 3: {
                    return v2 == 2 ? "Stretch High" : "Unknown (" + 3 + " " + v2 + ")";
                }
                default: {
                    return "Unknown (" + v1 + " " + v2 + ")";
                }
            }
        }
        catch(IOException unused_ex) {
            return null;
        }
    }

    public static String L(String s) {
        return s == null ? null : s.trim();
    }

    @Override  // com.drew.metadata.g
    public String c(int v) {
        b b0 = this.a;
        switch(this.b) {
            case 0: {
                switch(v) {
                    case 0: {
                        return this.l(0, 2);
                    }
                    case 0x101: {
                        return this.g(0x101, 0, new String[]{"Natural Colour", "Black & White", "Vivid Colour", "Solarization", "AdobeRGB"});
                    }
                    case 0x102: {
                        return this.g(0x102, 0, new String[]{"Raw", "Super Fine", "Fine", "Standard", "Extra Fine"});
                    }
                    case 0x103: {
                        return this.g(0x103, 0, new String[]{"Raw", "Super Fine", "Fine", "Standard", "Extra Fine"});
                    }
                    case 0x200: {
                        long[] arr_v3 = (long[])((OlympusMakernoteDirectory)b0).getObject(0x200);
                        if(arr_v3 != null) {
                            if(arr_v3.length < 1) {
                                return "";
                            }
                            StringBuilder stringBuilder0 = new StringBuilder();
                            switch(((int)arr_v3[0])) {
                                case 0: {
                                    stringBuilder0.append("Normal picture taking mode");
                                    break;
                                }
                                case 1: {
                                    stringBuilder0.append("Unknown picture taking mode");
                                    break;
                                }
                                case 2: {
                                    stringBuilder0.append("Fast picture taking mode");
                                    break;
                                }
                                case 3: {
                                    stringBuilder0.append("Panorama picture taking mode");
                                    break;
                                }
                                default: {
                                    stringBuilder0.append("Unknown picture taking mode");
                                }
                            }
                            if(arr_v3.length >= 2) {
                                int v1 = (int)arr_v3[1];
                                switch(v1) {
                                    case 0: {
                                        break;
                                    }
                                    case 1: {
                                        stringBuilder0.append(" / 1st in a sequence");
                                        break;
                                    }
                                    case 2: {
                                        stringBuilder0.append(" / 2nd in a sequence");
                                        break;
                                    }
                                    default: {
                                        if(v1 == 3) {
                                            stringBuilder0.append(" / 3rd in a sequence");
                                        }
                                        else {
                                            stringBuilder0.append(" / ");
                                            stringBuilder0.append(arr_v3[1]);
                                            stringBuilder0.append("th in a sequence");
                                        }
                                    }
                                }
                            }
                            if(arr_v3.length >= 3) {
                                int v2 = (int)arr_v3[2];
                                switch(v2) {
                                    case 1: {
                                        stringBuilder0.append(" / Left to right panorama direction");
                                        break;
                                    }
                                    case 2: {
                                        stringBuilder0.append(" / Right to left panorama direction");
                                        return stringBuilder0.toString();
                                    }
                                    case 3: {
                                        stringBuilder0.append(" / Bottom to top panorama direction");
                                        return stringBuilder0.toString();
                                    label_157:
                                        if(v2 == 4) {
                                            stringBuilder0.append(" / Top to bottom panorama direction");
                                            return stringBuilder0.toString();
                                        }
                                        break;
                                    }
                                    default: {
                                        goto label_157;
                                    }
                                }
                            }
                            return stringBuilder0.toString();
                        }
                        break;
                    }
                    case 0x201: {
                        String s2 = ((OlympusMakernoteDirectory)b0).getString(0x207);
                        if(s2 == null) {
                            return this.g(0x201, 1, new String[]{"Standard Quality", "High Quality", "Super High Quality"});
                        }
                        Integer integer0 = ((OlympusMakernoteDirectory)b0).getInteger(0x201);
                        if(integer0 != null) {
                            if(s2.startsWith("SX") && !s2.startsWith("SX151") || s2.startsWith("D4322")) {
                                switch(((int)integer0)) {
                                    case 0: {
                                        return "Standard Quality (Low)";
                                    }
                                    case 1: {
                                        return "High Quality (Normal)";
                                    }
                                    case 2: {
                                        return "Super High Quality (Fine)";
                                    }
                                    case 6: {
                                        return "RAW";
                                    }
                                    default: {
                                        return "Unknown (" + integer0.toString() + ")";
                                    }
                                }
                            }
                            int v3 = (int)integer0;
                            switch(v3) {
                                case 0: {
                                    return "Standard Quality (Low)";
                                }
                                case 1: {
                                    return "High Quality (Normal)";
                                }
                                case 2: {
                                    return "Super High Quality (Fine)";
                                }
                                case 4: {
                                    return "RAW";
                                }
                                case 5: {
                                    return "Medium-Fine";
                                }
                                case 6: {
                                    return "Small-Fine";
                                }
                                default: {
                                    return v3 == 33 ? "Uncompressed" : "Unknown (" + integer0.toString() + ")";
                                }
                            }
                            return this.g(0x201, 1, new String[]{"Standard Quality", "High Quality", "Super High Quality"});
                        }
                        break;
                    }
                    case 0x202: {
                        return this.g(0x202, 0, new String[]{"Normal (no macro)", "Macro"});
                    }
                    case 0x203: {
                        return this.g(0x203, 0, new String[]{"Off", "On"});
                    }
                    case 0x204: {
                        k k0 = ((OlympusMakernoteDirectory)b0).getRational(0x204);
                        return k0 == null ? null : k0.d(false);
                    }
                    case 0x205: {
                        k k1 = ((OlympusMakernoteDirectory)b0).getRational(0x205);
                        return k1 == null ? null : new DecimalFormat("0.###").format(k1.doubleValue()) + " mm";
                    }
                    case 0x207: {
                        String s = ((OlympusMakernoteDirectory)b0).getString(0x207);
                        if(s != null) {
                            return OlympusMakernoteDirectory.OlympusCameraTypes.containsKey(s) ? ((String)OlympusMakernoteDirectory.OlympusCameraTypes.get(s)) : s;
                        }
                        return null;
                    }
                    case 0x209: {
                        byte[] arr_b = ((OlympusMakernoteDirectory)b0).getByteArray(0x209);
                        return arr_b == null ? null : new String(arr_b);
                    }
                    case 770: {
                        return this.g(770, 0, new String[]{"Off", "On", "On (Preset)"});
                    }
                    case 0x1000: {
                        return this.i(0x1000);
                    }
                    case 0x1001: {
                        k k2 = ((OlympusMakernoteDirectory)b0).getRational(0x1001);
                        return k2 == null ? null : String.valueOf(Math.round(Math.pow(2.0, k2.doubleValue() - 5.0) * 100.0));
                    }
                    case 0x1002: {
                        Double double0 = ((OlympusMakernoteDirectory)b0).getDoubleObject(0x1002);
                        return double0 == null ? null : g.e(Math.pow(c4.d.a, ((double)double0)));
                    }
                    case 4100: {
                        return this.g(4100, 0, new String[]{0, 0, "On", "Off"});
                    }
                    case 0x100A: {
                        return this.g(0x100A, 0, new String[]{"Normal", "Macro"});
                    }
                    case 0x100B: {
                        return this.g(0x100B, 0, new String[]{"Auto", "Manual"});
                    }
                    case 0x100F: {
                        return this.g(0x100F, 0, new String[]{"Normal", "Hard", "Soft"});
                    }
                    case 0x1011: {
                        int[] arr_v4 = ((OlympusMakernoteDirectory)b0).getIntArray(0x1011);
                        if(arr_v4 != null) {
                            StringBuilder stringBuilder1 = new StringBuilder();
                            for(int v4 = 0; v4 < arr_v4.length; ++v4) {
                                stringBuilder1.append(((int)(((short)arr_v4[v4]))));
                                if(v4 < arr_v4.length - 1) {
                                    stringBuilder1.append(" ");
                                }
                            }
                            return stringBuilder1.length() == 0 ? null : stringBuilder1.toString();
                        }
                        break;
                    }
                    case 0x1015: {
                        int[] arr_v = ((OlympusMakernoteDirectory)b0).getIntArray(0x1015);
                        if(arr_v == null) {
                            return null;
                        }
                        String s1 = String.format("%d %d", ((int)arr_v[0]), ((int)arr_v[1]));
                        if(!s1.equals("1 0")) {
                            if(s1.equals("1 2")) {
                                return "Auto (2)";
                            }
                            if(s1.equals("1 4")) {
                                return "Auto (4)";
                            }
                            if(s1.equals("2 2")) {
                                return "3000 Kelvin";
                            }
                            if(s1.equals("2 3")) {
                                return "3700 Kelvin";
                            }
                            if(s1.equals("2 4")) {
                                return "4000 Kelvin";
                            }
                            if(s1.equals("2 5")) {
                                return "4500 Kelvin";
                            }
                            if(s1.equals("2 6")) {
                                return "5500 Kelvin";
                            }
                            if(s1.equals("2 7")) {
                                return "6500 Kelvin";
                            }
                            if(s1.equals("2 8")) {
                                return "7500 Kelvin";
                            }
                            return s1.equals("3 0") ? "One-touch" : "Unknown " + s1;
                        }
                        return "Auto";
                    }
                    case 0x1017: {
                        int[] arr_v1 = ((OlympusMakernoteDirectory)b0).getIntArray(0x1017);
                        return arr_v1 == null ? null : String.valueOf(((double)(((short)arr_v1[0]))) / 256.0);
                    }
                    case 4120: {
                        int[] arr_v2 = ((OlympusMakernoteDirectory)b0).getIntArray(4120);
                        return arr_v2 == null ? null : String.valueOf(((double)(((short)arr_v2[0]))) / 256.0);
                    }
                    case 0x1029: {
                        return this.g(0x1029, 0, new String[]{"High", "Normal", "Low"});
                    }
                    case 0x1035: {
                        return this.g(0x1035, 0, new String[]{"No", "Yes"});
                    }
                    case 0xF002: {
                        return this.g(0xF002, 0, new String[]{"P", "A", "S", "M"});
                    }
                    case 0xF003: {
                        return this.g(0xF003, 0, new String[]{"Normal", "Red-eye reduction", "Rear flash sync", "Wireless"});
                    }
                    case 0xF004: {
                        return this.g(0xF004, 0, new String[]{"Auto", "Daylight", "Cloudy", "Tungsten", 0, "Custom", 0, "Fluorescent", "Fluorescent 2", 0, 0, "Custom 2", "Custom 3"});
                    }
                    case 0xF005: {
                        return this.g(0xF005, 0, new String[]{"2560 x 1920", "1600 x 1200", "1280 x 960", "640 x 480"});
                    }
                    case 0xF006: {
                        return this.g(0xF006, 0, new String[]{"Raw", "Super Fine", "Fine", "Standard", "Economy", "Extra Fine"});
                    }
                    case 0xF007: {
                        return this.g(0xF007, 0, new String[]{"Single", "Continuous", "Self Timer", 0, "Bracketing", "Interval", "UHS Continuous", "HS Continuous"});
                    }
                    case 0xF008: {
                        return this.g(0xF008, 0, new String[]{"Multi-Segment", "Centre Weighted", "Spot"});
                    }
                    case 0xF009: {
                        Long long14 = ((OlympusMakernoteDirectory)b0).getLongObject(0xF009);
                        if(long14 != null) {
                            DecimalFormat decimalFormat0 = new DecimalFormat("0.##");
                            decimalFormat0.setRoundingMode(RoundingMode.HALF_UP);
                            return decimalFormat0.format(Math.pow(((double)(((long)long14))) / 8.0 - 1.0, 2.0) * 3.125);
                        }
                        break;
                    }
                    case 0xF00A: {
                        Long long15 = ((OlympusMakernoteDirectory)b0).getLongObject(0xF00A);
                        if(long15 != null) {
                            DecimalFormat decimalFormat1 = new DecimalFormat("0.###");
                            decimalFormat1.setRoundingMode(RoundingMode.HALF_UP);
                            return decimalFormat1.format(Math.pow(((double)(49L - ((long)long15))) / 8.0, 2.0)) + " sec";
                        }
                        break;
                    }
                    case 0xF00B: {
                        Long long0 = ((OlympusMakernoteDirectory)b0).getLongObject(0xF00B);
                        return long0 == null ? null : g.e(Math.pow(((double)(((long)long0))) / 16.0 - 0.5, 2.0));
                    }
                    case 0xF00C: {
                        return this.g(0xF00C, 0, new String[]{"Off", "On"});
                    }
                    case 0xF00D: {
                        return this.g(0xF00D, 0, new String[]{"Off", "Electronic magnification", "Digital zoom 2x"});
                    }
                    case 0xF00E: {
                        Long long1 = ((OlympusMakernoteDirectory)b0).getLongObject(0xF00E);
                        return long1 == null ? null : new DecimalFormat("0.##").format(((double)(((long)long1))) / 3.0 - 2.0) + " EV";
                    }
                    case 0xF00F: {
                        return this.g(0xF00F, 0, new String[]{"1/3 EV", "2/3 EV", "1 EV"});
                    }
                    case 0xF011: {
                        if(!((OlympusMakernoteDirectory)b0).isIntervalMode()) {
                            return "N/A";
                        }
                        Long long2 = ((OlympusMakernoteDirectory)b0).getLongObject(0xF011);
                        return long2 == null ? null : long2 + " min";
                    }
                    case 0xF012: {
                        if(!((OlympusMakernoteDirectory)b0).isIntervalMode()) {
                            return "N/A";
                        }
                        Long long3 = ((OlympusMakernoteDirectory)b0).getLongObject(0xF012);
                        return long3 == null ? null : Long.toString(((long)long3));
                    }
                    case 0xF013: {
                        Long long4 = ((OlympusMakernoteDirectory)b0).getLongObject(0xF013);
                        return long4 == null ? null : g.f(((double)(((long)long4))) / 256.0);
                    }
                    case 0xF014: {
                        Long long16 = ((OlympusMakernoteDirectory)b0).getLongObject(0xF014);
                        if(long16 != null) {
                            return ((long)long16) == 0L ? "Infinity" : long16 + " mm";
                        }
                        break;
                    }
                    case 0xF015: {
                        return this.g(0xF015, 0, new String[]{"No", "Yes"});
                    }
                    case 0xF016: {
                        Long long17 = ((OlympusMakernoteDirectory)b0).getLongObject(0xF016);
                        if(long17 != null) {
                            long v5 = (long)long17;
                            int v6 = (int)(((long)long17) >> 16 & 0xFFL);
                            int v7 = ((int)(((long)long17) >> 8 & 0xFFL)) + 1970;
                            return f.c(v7, v6, ((int)(v5 & 0xFFL))) ? String.format("%04d-%02d-%02d", v7, ((int)(v6 + 1)), ((int)(v5 & 0xFFL))) : "Invalid date";
                        }
                        break;
                    }
                    case 0xF017: {
                        Long long18 = ((OlympusMakernoteDirectory)b0).getLongObject(0xF017);
                        if(long18 != null) {
                            int v8 = (int)(((long)long18) >> 8 & 0xFFL);
                            int v9 = (int)(((long)long18) >> 16 & 0xFFL);
                            long v10 = (long)long18;
                            return f.d(v8, v9, ((int)(v10 & 0xFFL))) ? String.format("%02d:%02d:%02d", v8, v9, ((int)(v10 & 0xFFL))) : "Invalid time";
                        }
                        break;
                    }
                    case 0xF018: {
                        Long long5 = ((OlympusMakernoteDirectory)b0).getLongObject(0xF017);
                        return long5 == null ? null : g.e(Math.pow(((double)(((long)long5))) / 16.0 - 0.5, 2.0));
                    }
                    case 0xF01B: {
                        return this.g(0xF01B, 0, new String[]{"Off", "On"});
                    }
                    case 0xF01C: {
                        Long long19 = ((OlympusMakernoteDirectory)b0).getLongObject(0xF01C);
                        if(long19 != null) {
                            return ((long)long19) == 0L ? "File Number Memory Off" : Long.toString(((long)long19));
                        }
                        break;
                    }
                    case 0xF01D: {
                        Long long6 = ((OlympusMakernoteDirectory)b0).getLongObject(0xF01D);
                        return long6 == null ? null : new DecimalFormat("0.##").format(((double)(((long)long6))) / 256.0);
                    }
                    case 0xF01E: {
                        Long long7 = ((OlympusMakernoteDirectory)b0).getLongObject(0xF01E);
                        return long7 == null ? null : new DecimalFormat("0.##").format(((double)(((long)long7))) / 256.0);
                    }
                    case 0xF01F: {
                        Long long8 = ((OlympusMakernoteDirectory)b0).getLongObject(0xF01F);
                        return long8 == null ? null : new DecimalFormat("0.##").format(((double)(((long)long8))) / 256.0);
                    }
                    case 0xF020: {
                        Long long9 = ((OlympusMakernoteDirectory)b0).getLongObject(0xF020);
                        return long9 == null ? null : Long.toString(((long)long9) - 3L);
                    }
                    case 0xF021: {
                        Long long10 = ((OlympusMakernoteDirectory)b0).getLongObject(0xF021);
                        return long10 == null ? null : Long.toString(((long)long10) - 3L);
                    }
                    case 0xF022: {
                        return this.g(0xF022, 0, new String[]{"Hard", "Normal", "Soft"});
                    }
                    case 0xF023: {
                        return this.g(0xF023, 0, new String[]{"None", "Portrait", "Text", "Night Portrait", "Sunset", "Sports Action"});
                    }
                    case 0xF024: {
                        Long long11 = ((OlympusMakernoteDirectory)b0).getLongObject(0xF024);
                        return long11 == null ? null : new DecimalFormat("0.##").format(((double)(((long)long11) - 6L)) / 3.0) + " EV";
                    }
                    case 0xF025: {
                        return this.g(0xF025, 0, new String[]{"100", "200", "400", "800", "Auto", "64"});
                    }
                    case 0xF026: {
                        return this.g(0xF026, 0, new String[]{"DiMAGE 7", "DiMAGE 5", "DiMAGE S304", "DiMAGE S404", "DiMAGE 7i", "DiMAGE 7Hi", "DiMAGE A1", "DiMAGE S414"});
                    }
                    case 0xF027: {
                        return this.g(0xF027, 0, new String[]{"Still Image", "Time Lapse Movie"});
                    }
                    case 0xF028: {
                        return this.g(0xF028, 0, new String[]{"Standard Form", "Data Form"});
                    }
                    case 0xF029: {
                        return this.g(0xF029, 0, new String[]{"Natural Color", "Black & White", "Vivid Color", "Solarization", "AdobeRGB"});
                    }
                    case 0xF02A: {
                        Long long12 = ((OlympusMakernoteDirectory)b0).getLongObject(0xF02A);
                        return long12 == null ? null : Long.toString(((long)long12) - 3L);
                    }
                    case 0xF02B: {
                        return super.c(0xF02B);
                    }
                    case 0xF02C: {
                        return this.g(0xF02C, 0, new String[]{"Did Not Fire", "Fired"});
                    }
                    case 0xF02D: {
                        Long long13 = ((OlympusMakernoteDirectory)b0).getLongObject(0xF02D);
                        return long13 == null ? null : new DecimalFormat("0.##").format(((double)(((long)long13))) / 8.0 - 6.0);
                    }
                    case 0xF02E: {
                        return super.c(0xF02E);
                    }
                    case 0xF02F: {
                        return super.c(0xF02F);
                    }
                    case 0xF030: {
                        return this.g(0xF030, 0, new String[]{"No Zone or AF Failed", "Center Zone (Horizontal Orientation)", "Center Zone (Vertical Orientation)", "Left Zone", "Right Zone"});
                    }
                    case 0xF031: {
                        return this.g(0xF031, 0, new String[]{"Auto Focus", "Manual Focus"});
                    }
                    case 0xF032: {
                        return this.g(0xF032, 0, new String[]{"Wide Focus (Normal)", "Spot Focus"});
                    }
                    case 0xF033: {
                        return this.g(0xF033, 0, new String[]{"Exposure", "Contrast", "Saturation", "Filter"});
                    }
                    default: {
                        return super.c(v);
                    }
                }
                return null;
            }
            case 1: {
                return this.z(v);
            }
            case 2: {
                switch(v) {
                    case 8: {
                        k[] arr_k = ((AppleMakernoteDirectory)b0).getRationalArray(8);
                        return arr_k == null || arr_k.length != 3 ? null : String.format("%.2fg %s, ", new k(Math.abs(arr_k[0].X), Math.abs(arr_k[0].Y)).doubleValue(), (arr_k[0].b() ? "left" : "right")) + String.format("%.2fg %s, ", new k(Math.abs(arr_k[1].X), Math.abs(arr_k[1].Y)).doubleValue(), (arr_k[1].b() ? "down" : "up")) + String.format("%.2fg %s", new k(Math.abs(arr_k[2].X), Math.abs(arr_k[2].Y)).doubleValue(), (arr_k[2].b() ? "forward" : "backward"));
                    }
                    case 10: {
                        return this.g(10, 3, new String[]{"HDR Image", "Original Image"});
                    }
                    default: {
                        return super.c(v);
                    }
                }
            }
            case 3: {
                try {
                    switch(v) {
                        case 1: {
                            goto label_227;
                        }
                        case 4: {
                            return String.format("%d seconds", ((long)(((AppleRunTimeMakernoteDirectory)b0).getLong(4) / ((AppleRunTimeMakernoteDirectory)b0).getLong(3))));
                        }
                    }
                }
                catch(com.drew.metadata.d unused_ex) {
                    return null;
                }
                return super.c(v);
                try {
                label_227:
                    int v11 = ((AppleRunTimeMakernoteDirectory)b0).getInt(1);
                    StringBuilder stringBuilder2 = new StringBuilder();
                    if((v11 & 1) == 1) {
                        stringBuilder2.append("Valid");
                    }
                    else {
                        stringBuilder2.append("Invalid");
                    }
                    if((v11 & 2) != 0) {
                        stringBuilder2.append(", rounded");
                    }
                    if((4 & v11) != 0) {
                        stringBuilder2.append(", positive infinity");
                    }
                    if((8 & v11) != 0) {
                        stringBuilder2.append(", negative infinity");
                    }
                    if((16 & v11) != 0) {
                        stringBuilder2.append(", indefinite");
                    }
                    return stringBuilder2.toString();
                }
                catch(com.drew.metadata.d unused_ex) {
                }
                return null;
            }
            case 4: {
                if(v == 20) {
                    Integer integer5 = ((CasioType1MakernoteDirectory)b0).getInteger(20);
                    if(integer5 != null) {
                        switch(((int)integer5)) {
                            case 0x40: {
                                return "Normal";
                            }
                            case 80: {
                                return "Normal (ISO 80 equivalent)";
                            }
                            case 100: {
                                return "High";
                            }
                            case 0x7D: {
                                return "+1.0";
                            }
                            case 0xF4: {
                                return "+3.0";
                            }
                            case 0xFA: {
                                return "+2.0";
                            }
                            default: {
                                return m5.b.v("Unknown (", integer5, ")");
                            }
                        }
                    }
                }
                else {
                    switch(v) {
                        case 1: {
                            return this.g(1, 1, new String[]{"Single shutter", "Panorama", "Night scene", "Portrait", "Landscape"});
                        }
                        case 2: {
                            return this.g(2, 1, new String[]{"Economy", "Normal", "Fine"});
                        }
                        case 3: {
                            return this.g(3, 2, new String[]{"Macro", "Auto focus", "Manual focus", "Infinity"});
                        }
                        case 4: {
                            return this.g(4, 1, new String[]{"Auto", "On", "Off", "Red eye reduction"});
                        }
                        case 5: {
                            goto label_277;
                        }
                        case 6: {
                            goto label_251;
                        }
                        case 7: {
                            goto label_253;
                        }
                        case 10: {
                            goto label_264;
                        }
                        case 11: {
                            return this.g(11, 0, new String[]{"Normal", "Soft", "Hard"});
                        }
                        case 12: {
                            return this.g(12, 0, new String[]{"Normal", "Low", "High"});
                        }
                        case 13: {
                            return this.g(13, 0, new String[]{"Normal", "Low", "High"});
                        }
                    }
                    return super.c(v);
                label_251:
                    Integer integer1 = ((CasioType1MakernoteDirectory)b0).getInteger(6);
                    return integer1 == null ? null : g.f(((int)integer1));
                label_253:
                    Integer integer2 = ((CasioType1MakernoteDirectory)b0).getInteger(7);
                    if(integer2 == null) {
                        return null;
                    }
                    switch(((int)integer2)) {
                        case 1: {
                            return "Auto";
                        }
                        case 2: {
                            return "Tungsten";
                        }
                        case 3: {
                            return "Daylight";
                        }
                        case 4: {
                            return "Florescent";
                        }
                        case 5: {
                            return "Shade";
                        }
                        case 0x81: {
                            return "Manual";
                        }
                        default: {
                            return m5.b.v("Unknown (", integer2, ")");
                        }
                    }
                label_264:
                    Integer integer3 = ((CasioType1MakernoteDirectory)b0).getInteger(10);
                    if(integer3 == null) {
                        return null;
                    }
                    int v12 = (int)integer3;
                    if(v12 != 0x10000) {
                        switch(v12) {
                            case 0x10001: 
                            case 0x20000: {
                                return "2x digital zoom";
                            }
                            case 0x40000: {
                                return "4x digital zoom";
                            }
                            default: {
                                return m5.b.v("Unknown (", integer3, ")");
                            }
                        }
                    }
                    return "No digital zoom";
                label_277:
                    Integer integer4 = ((CasioType1MakernoteDirectory)b0).getInteger(5);
                    if(integer4 != null) {
                        switch(((int)integer4)) {
                            case 11: {
                                return "Weak";
                            }
                            case 13: {
                                return "Normal";
                            }
                            case 15: {
                                return "Strong";
                            }
                            default: {
                                return m5.b.v("Unknown (", integer4, ")");
                            }
                        }
                    }
                }
                return null;
            }
            case 5: {
                return this.n(v);
            }
            case 6: {
                return this.o(v);
            }
            case 7: {
                switch(v) {
                    case 9: {
                        return this.g(9, 1, new String[]{"Fine", "Normal"});
                    }
                    case 10: {
                        return this.g(10, 0, new String[]{"Off", "On"});
                    }
                    case 27: {
                        Integer integer8 = ((KodakMakernoteDirectory)b0).getInteger(27);
                        if(integer8 == null) {
                            return null;
                        }
                        switch(((int)integer8)) {
                            case 0: {
                                return "Auto";
                            }
                            case 8: {
                                return "Aperture Priority";
                            }
                            case 0x20: {
                                return "Manual";
                            }
                            default: {
                                return m5.b.v("Unknown (", integer8, ")");
                            }
                        }
                    }
                    case 56: {
                        return this.g(56, 0, new String[]{"Normal", 0, "Macro"});
                    }
                    case 0x40: {
                        return this.g(0x40, 0, new String[]{"Auto", "Flash", "Tungsten", "Daylight"});
                    }
                    case 92: {
                        Integer integer6 = ((KodakMakernoteDirectory)b0).getInteger(92);
                        if(integer6 == null) {
                            return null;
                        }
                        switch(((int)integer6)) {
                            case 0: {
                                return "Auto";
                            }
                            case 1: 
                            case 16: {
                                return "Fill Flash";
                            }
                            case 2: 
                            case 0x20: {
                                return "Off";
                            }
                            case 3: 
                            case 0x40: {
                                return "Red Eye";
                            }
                            default: {
                                return m5.b.v("Unknown (", integer6, ")");
                            }
                        }
                    }
                    case 93: {
                        return this.g(93, 0, new String[]{"No", "Yes"});
                    }
                    case 102: {
                        Integer integer7 = ((KodakMakernoteDirectory)b0).getInteger(102);
                        if(integer7 == null) {
                            return null;
                        }
                        int v13 = (int)integer7;
                        switch(v13) {
                            case 1: {
                                return "B&W";
                            }
                            case 2: {
                                return "Sepia";
                            label_316:
                                if(v13 != 3) {
                                    switch(v13) {
                                        case 4: {
                                            return "B&W Red Filter";
                                        }
                                        case 0x20: 
                                        case 0x100: {
                                            return "Saturated Color";
                                        }
                                        case 0x40: 
                                        case 0x200: {
                                            return "Neutral Color";
                                        }
                                        case 0x2000: {
                                            return "B&W";
                                        }
                                        default: {
                                            return v13 == 0x4000 ? "Sepia" : m5.b.v("Unknown (", integer7, ")");
                                        }
                                    }
                                }
                                return "B&W Yellow Filter";
                            }
                            default: {
                                goto label_316;
                            }
                        }
                    }
                    case 107: {
                        return this.g(107, 0, new String[]{"Normal"});
                    }
                    default: {
                        return super.c(v);
                    }
                }
            }
            case 8: {
                return v == 1 ? this.b(1) : super.c(v);
            }
            case 9: {
                return this.p(v);
            }
            case 10: {
                return this.q(v);
            }
            case 11: {
                return this.r(v);
            }
            case 12: {
                return this.s(v);
            }
            case 13: {
                return this.t(v);
            }
            case 14: {
                return this.u(v);
            }
            case 15: {
                return this.v(v);
            }
            case 16: {
                return this.w(v);
            }
            case 17: {
                return this.x(v);
            }
            case 18: {
                return this.y(v);
            }
            case 19: {
                return this.A(v);
            }
            case 20: {
                return this.B(v);
            }
            case 21: {
                return this.C(v);
            }
            case 22: {
                return this.D(v);
            }
            case 24: {
                return this.E(v);
            }
            case 25: {
                return this.F(v);
            }
            case 26: {
                return this.G(v);
            }
            case 27: {
                return this.H(v);
            }
            case 28: {
                return this.I(v);
            }
            case 29: {
                return v == 0x2000 ? this.l(0x2000, 2) : super.c(v);
            }
            default: {
                return super.c(v);
            }
        }
    }

    public static String m(c[] arr_c) {
        if(arr_c == null) {
            return null;
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        for(int v = 0; v < arr_c.length; ++v) {
            stringBuilder0.append("Face ");
            stringBuilder0.append(v + 1);
            stringBuilder0.append(": ");
            stringBuilder0.append(arr_c[v].toString());
            stringBuilder0.append("\n");
        }
        return stringBuilder0.length() <= 0 ? null : stringBuilder0.substring(0, stringBuilder0.length() - 1);
    }

    private final String n(int v) {
        b b0 = this.a;
        if(v != 2) {
            String s = null;
            switch(v) {
                case 3: {
                    Integer integer0 = ((CasioType2MakernoteDirectory)b0).getInteger(3);
                    return integer0 == null ? null : Integer.toString(((int)integer0)) + " bytes";
                }
                case 4: {
                    return ((CasioType2MakernoteDirectory)b0).getString(4);
                }
                case 8: {
                    return this.g(8, 1, new String[]{"Fine", "Super Fine"});
                }
                case 9: {
                    Integer integer1 = ((CasioType2MakernoteDirectory)b0).getInteger(9);
                    if(integer1 != null) {
                        int v1 = (int)integer1;
                        if(v1 != 0) {
                            switch(v1) {
                                case 4: {
                                    return "1600 x 1200 pixels";
                                }
                                case 36: {
                                    return "3008 x 2008 pixels";
                                }
                                default: {
                                    if(v1 != 5) {
                                        switch(v1) {
                                            case 20: {
                                                return "2288 x 1712 pixels";
                                            }
                                            case 21: {
                                                return "2592 x 1944 pixels";
                                            }
                                            case 22: {
                                                return "2304 x 1728 pixels";
                                            }
                                            default: {
                                                return m5.b.v("Unknown (", integer1, ")");
                                            }
                                        }
                                    }
                                    return "2048 x 1536 pixels";
                                }
                            }
                        }
                        return "640 x 480 pixels";
                    }
                    return null;
                }
                case 13: {
                    return this.g(13, 0, new String[]{"Normal", "Macro"});
                }
                case 20: {
                    Integer integer2 = ((CasioType2MakernoteDirectory)b0).getInteger(20);
                    if(integer2 != null) {
                        switch(((int)integer2)) {
                            case 3: {
                                return "50";
                            }
                            case 4: {
                                return "64";
                            }
                            case 6: {
                                return "100";
                            }
                            case 9: {
                                return "200";
                            }
                            default: {
                                return m5.b.v("Unknown (", integer2, ")");
                            }
                        }
                    }
                    return null;
                }
                case 25: {
                    return this.g(25, 0, new String[]{"Auto", "Daylight", "Shade", "Tungsten", "Florescent", "Manual"});
                }
                case 29: {
                    Double double0 = ((CasioType2MakernoteDirectory)b0).getDoubleObject(29);
                    return double0 == null ? null : g.f(((double)double0) / 10.0);
                }
                case 0x1F: {
                    return this.g(0x1F, 0, new String[]{"-1", "Normal", "+1"});
                }
                case 0x20: {
                    return this.g(0x20, 0, new String[]{"-1", "Normal", "+1"});
                }
                case 33: {
                    return this.g(33, 0, new String[]{"-1", "Normal", "+1"});
                }
                case 0x2000: {
                    byte[] arr_b = ((CasioType2MakernoteDirectory)b0).getByteArray(0x2000);
                    return arr_b == null ? null : J.f(new StringBuilder("<"), arr_b.length, " bytes of image data>");
                }
                case 8209: {
                    return ((CasioType2MakernoteDirectory)b0).getString(8209);
                }
                case 8210: {
                    Integer integer3 = ((CasioType2MakernoteDirectory)b0).getInteger(8210);
                    if(integer3 != null) {
                        s = "Flash";
                        switch(((int)integer3)) {
                            case 0: {
                                return "Manual";
                            }
                            case 1: {
                                return "Auto";
                            }
                            case 4: 
                            case 12: {
                                break;
                            }
                            default: {
                                return m5.b.v("Unknown (", integer3, ")");
                            }
                        }
                    }
                    return s;
                }
                case 0x2022: {
                    Integer integer4 = ((CasioType2MakernoteDirectory)b0).getInteger(0x2022);
                    return integer4 == null ? null : Integer.toString(((int)integer4)) + " mm";
                }
                case 0x2034: {
                    return this.g(0x2034, 0, new String[]{"Off"});
                }
                case 0x3000: {
                    return this.g(0x3000, 2, new String[]{"Normal"});
                }
                case 0x3001: {
                    return this.g(0x3001, 1, new String[]{"Off"});
                }
                case 0x3002: {
                    return this.g(0x3002, 3, new String[]{"Fine"});
                }
                case 0x3003: {
                    Integer integer5 = ((CasioType2MakernoteDirectory)b0).getInteger(0x3003);
                    if(integer5 != null) {
                        switch(((int)integer5)) {
                            case 1: {
                                return "Fixation";
                            }
                            case 6: {
                                return "Multi-Area Focus";
                            }
                            default: {
                                return m5.b.v("Unknown (", integer5, ")");
                            }
                        }
                    }
                    return null;
                }
                case 0x3006: {
                    return ((CasioType2MakernoteDirectory)b0).getString(0x3006);
                }
                case 0x3014: {
                    return this.g(0x3014, 0, new String[]{"Off", "On"});
                }
                case 0x3015: {
                    return this.g(0x3015, 0, new String[]{"Off"});
                }
                case 0x3016: {
                    return this.g(0x3016, 0, new String[]{"Off"});
                }
                case 0x3017: {
                    return this.g(0x3017, 0, new String[]{"Off"});
                }
                default: {
                    return super.c(v);
                }
            }
        }
        int[] arr_v = ((CasioType2MakernoteDirectory)b0).getIntArray(2);
        if(arr_v != null && arr_v.length == 2) {
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append(arr_v[0]);
            stringBuilder0.append(" x ");
            return J.f(stringBuilder0, arr_v[1], " pixels");
        }
        return ((CasioType2MakernoteDirectory)b0).getString(2);
    }

    private final String o(int v) {
        if(v != 0) {
            b b0 = this.a;
            switch(v) {
                case 0x1001: {
                    Integer integer0 = ((FujifilmMakernoteDirectory)b0).getInteger(0x1001);
                    if(integer0 == null) {
                        return null;
                    }
                    int v1 = (int)integer0;
                    switch(v1) {
                        case 1: {
                            return "Softest";
                        }
                        case 2: {
                            return "Soft";
                        }
                        case 3: {
                            return "Normal";
                        }
                        case 4: {
                            return "Hard";
                        }
                        case 5: {
                            return "Hardest";
                        }
                        case 130: {
                            return "Medium Soft";
                        }
                        case 0x84: {
                            return "Medium Hard";
                        }
                        case 0x8000: {
                            return "Film Simulation";
                        }
                        default: {
                            return v1 == 0xFFFF ? "N/A" : m5.b.v("Unknown (", integer0, ")");
                        }
                    }
                }
                case 0x1002: {
                    Integer integer1 = ((FujifilmMakernoteDirectory)b0).getInteger(0x1002);
                    if(integer1 == null) {
                        return null;
                    }
                    switch(((int)integer1)) {
                        case 0: {
                            return "Auto";
                        }
                        case 0x100: {
                            return "Daylight";
                        }
                        case 0x200: {
                            return "Cloudy";
                        }
                        case 0x300: {
                            return "Daylight Fluorescent";
                        }
                        case 0x301: {
                            return "Day White Fluorescent";
                        }
                        case 770: {
                            return "White Fluorescent";
                        }
                        case 0x303: {
                            return "Warm White Fluorescent";
                        }
                        case 0x304: {
                            return "Living Room Warm White Fluorescent";
                        }
                        case 0x400: {
                            return "Incandescence";
                        }
                        case 0x500: {
                            return "Flash";
                        }
                        case 0xF00: {
                            return "Custom White Balance";
                        }
                        case 0xF01: {
                            return "Custom White Balance 2";
                        }
                        case 0xF02: {
                            return "Custom White Balance 3";
                        }
                        case 0xF03: {
                            return "Custom White Balance 4";
                        }
                        case 0xF04: {
                            return "Custom White Balance 5";
                        }
                        case 0xFF0: {
                            return "Kelvin";
                        }
                        default: {
                            return m5.b.v("Unknown (", integer1, ")");
                        }
                    }
                }
                case 0x1003: {
                    Integer integer2 = ((FujifilmMakernoteDirectory)b0).getInteger(0x1003);
                    if(integer2 == null) {
                        return null;
                    }
                    switch(((int)integer2)) {
                        case 0: {
                            return "Normal";
                        }
                        case 0x80: {
                            return "Medium High";
                        }
                        case 0x100: {
                            return "High";
                        }
                        case 0x180: {
                            return "Medium Low";
                        }
                        case 0x200: {
                            return "Low";
                        }
                        case 0x300: {
                            return "None (B&W)";
                        }
                        case 0x301: {
                            return "B&W Green Filter";
                        }
                        case 770: {
                            return "B&W Yellow Filter";
                        }
                        case 0x303: {
                            return "B&W Blue Filter";
                        }
                        case 0x304: {
                            return "B&W Sepia";
                        }
                        case 0x8000: {
                            return "Film Simulation";
                        }
                        default: {
                            return m5.b.v("Unknown (", integer2, ")");
                        }
                    }
                }
                case 4100: {
                    Integer integer3 = ((FujifilmMakernoteDirectory)b0).getInteger(4100);
                    if(integer3 == null) {
                        return null;
                    }
                    switch(((int)integer3)) {
                        case 0: {
                            return "Normal";
                        }
                        case 0x80: {
                            return "Medium High";
                        }
                        case 0x100: {
                            return "High";
                        }
                        case 0x180: {
                            return "Medium Low";
                        }
                        case 0x200: {
                            return "Low";
                        }
                        case 0x300: {
                            return "None (B&W)";
                        }
                        case 0x8000: {
                            return "Film Simulation";
                        }
                        default: {
                            return m5.b.v("Unknown (", integer3, ")");
                        }
                    }
                }
                case 0x1006: {
                    Integer integer4 = ((FujifilmMakernoteDirectory)b0).getInteger(0x1006);
                    if(integer4 == null) {
                        return null;
                    }
                    switch(((int)integer4)) {
                        case 0: {
                            return "Normal";
                        }
                        case 0x100: {
                            return "High";
                        }
                        case 0x300: {
                            return "Low";
                        }
                        default: {
                            return m5.b.v("Unknown (", integer4, ")");
                        }
                    }
                }
                case 0x100B: {
                    Integer integer5 = ((FujifilmMakernoteDirectory)b0).getInteger(0x100B);
                    if(integer5 == null) {
                        return null;
                    }
                    switch(((int)integer5)) {
                        case 0x40: {
                            return "Low";
                        }
                        case 0x80: {
                            return "Normal";
                        }
                        case 0x100: {
                            return "N/A";
                        }
                        default: {
                            return m5.b.v("Unknown (", integer5, ")");
                        }
                    }
                }
                case 0x100E: {
                    Integer integer6 = ((FujifilmMakernoteDirectory)b0).getInteger(0x100E);
                    if(integer6 == null) {
                        return null;
                    }
                    switch(((int)integer6)) {
                        case 0: {
                            return "Normal";
                        }
                        case 0x100: {
                            return "Strong";
                        }
                        case 0x200: {
                            return "Weak";
                        }
                        default: {
                            return m5.b.v("Unknown (", integer6, ")");
                        }
                    }
                }
                case 0x1010: {
                    return this.g(0x1010, 0, new String[]{"Auto", "On", "Off", "Red-eye Reduction", "External"});
                }
                case 0x1011: {
                    k k0 = ((FujifilmMakernoteDirectory)b0).getRational(0x1011);
                    return k0 == null ? null : k0.d(false) + " EV (Apex)";
                }
                case 0x1020: {
                    return this.g(0x1020, 0, new String[]{"Off", "On"});
                }
                case 0x1021: {
                    return this.g(0x1021, 0, new String[]{"Auto Focus", "Manual Focus"});
                }
                case 0x1030: {
                    return this.g(0x1030, 0, new String[]{"Off", "On"});
                }
                case 0x1031: {
                    Integer integer7 = ((FujifilmMakernoteDirectory)b0).getInteger(0x1031);
                    if(integer7 == null) {
                        return null;
                    }
                    switch(((int)integer7)) {
                        case 0: {
                            return "Auto";
                        }
                        case 1: {
                            return "Portrait scene";
                        }
                        case 2: {
                            return "Landscape scene";
                        }
                        case 3: {
                            return "Macro";
                        }
                        case 4: {
                            return "Sports scene";
                        }
                        case 5: {
                            return "Night scene";
                        }
                        case 6: {
                            return "Program AE";
                        }
                        case 7: {
                            return "Natural Light";
                        }
                        case 8: {
                            return "Anti-blur";
                        }
                        case 9: {
                            return "Beach & Snow";
                        }
                        case 10: {
                            return "Sunset";
                        }
                        case 11: {
                            return "Museum";
                        }
                        case 12: {
                            return "Party";
                        }
                        case 13: {
                            return "Flower";
                        }
                        case 14: {
                            return "Text";
                        }
                        case 15: {
                            return "Natural Light & Flash";
                        }
                        case 16: {
                            return "Beach";
                        }
                        case 17: {
                            return "Snow";
                        }
                        case 18: {
                            return "Fireworks";
                        }
                        case 19: {
                            return "Underwater";
                        }
                        case 20: {
                            return "Portrait with Skin Correction";
                        }
                        case 22: {
                            return "Panorama";
                        }
                        case 23: {
                            return "Night (Tripod)";
                        }
                        case 24: {
                            return "Pro Low-light";
                        }
                        case 25: {
                            return "Pro Focus";
                        }
                        case 27: {
                            return "Dog Face Detection";
                        }
                        case 28: {
                            return "Cat Face Detection";
                        }
                        case 0x100: {
                            return "Aperture priority AE";
                        }
                        case 0x200: {
                            return "Shutter priority AE";
                        }
                        case 0x300: {
                            return "Manual exposure";
                        }
                        default: {
                            return m5.b.v("Unknown (", integer7, ")");
                        }
                    }
                }
                case 0x1033: {
                    return this.g(0x1033, 0, new String[]{"Auto", "Manual"});
                }
                case 0x1034: {
                    Integer integer8 = ((FujifilmMakernoteDirectory)b0).getInteger(0x1034);
                    if(integer8 == null) {
                        return null;
                    }
                    switch(((int)integer8)) {
                        case 0x100: {
                            return "HR (High Resolution)";
                        }
                        case 0x200: {
                            return "SN (Signal to Noise Priority)";
                        }
                        case 0x300: {
                            return "DR (Dynamic Range Priority)";
                        }
                        default: {
                            return m5.b.v("Unknown (", integer8, ")");
                        }
                    }
                }
                case 0x1100: {
                    return this.g(0x1100, 0, new String[]{"Off", "On", "No Flash & Flash"});
                }
                case 0x1210: {
                    Integer integer9 = ((FujifilmMakernoteDirectory)b0).getInteger(0x1210);
                    if(integer9 == null) {
                        return null;
                    }
                    switch(((int)integer9)) {
                        case 0: {
                            return "Standard";
                        }
                        case 16: {
                            return "Chrome";
                        }
                        case 0x30: {
                            return "B&W";
                        }
                        default: {
                            return m5.b.v("Unknown (", integer9, ")");
                        }
                    }
                }
                case 0x1300: {
                    return this.g(0x1300, 0, new String[]{"No Blur Warning", "Blur warning"});
                }
                case 0x1301: {
                    return this.g(0x1301, 0, new String[]{"Good Focus", "Out Of Focus"});
                }
                case 0x1302: {
                    return this.g(0x1302, 0, new String[]{"AE Good", "Over Exposed"});
                }
                case 0x1400: {
                    return this.g(0x1400, 1, new String[]{"Standard", 0, "Wide"});
                }
                case 0x1401: {
                    Integer integer10 = ((FujifilmMakernoteDirectory)b0).getInteger(0x1401);
                    if(integer10 == null) {
                        return null;
                    }
                    switch(((int)integer10)) {
                        case 0: {
                            return "F0/Standard (Provia) ";
                        }
                        case 0x100: {
                            return "F1/Studio Portrait";
                        }
                        case 0x110: {
                            return "F1a/Studio Portrait Enhanced Saturation";
                        }
                        case 0x120: {
                            return "F1b/Studio Portrait Smooth Skin Tone (Astia)";
                        }
                        case 304: {
                            return "F1c/Studio Portrait Increased Sharpness";
                        }
                        case 0x200: {
                            return "F2/Fujichrome (Velvia)";
                        }
                        case 0x300: {
                            return "F3/Studio Portrait Ex";
                        }
                        case 0x400: {
                            return "F4/Velvia";
                        }
                        case 0x500: {
                            return "Pro Neg. Std";
                        }
                        case 0x501: {
                            return "Pro Neg. Hi";
                        }
                        case 0x600: {
                            return "Classic Chrome";
                        }
                        case 0x700: {
                            return "Eterna";
                        }
                        case 0x800: {
                            return "Classic Negative";
                        }
                        case 0x900: {
                            return "Bleach Bypass";
                        }
                        case 0xA00: {
                            return "Nostalgic Neg";
                        }
                        default: {
                            return m5.b.v("Unknown (", integer10, ")");
                        }
                    }
                }
                case 0x1402: {
                    Integer integer11 = ((FujifilmMakernoteDirectory)b0).getInteger(0x1402);
                    if(integer11 == null) {
                        return null;
                    }
                    switch(((int)integer11)) {
                        case 0: {
                            return "Auto (100-400%)";
                        }
                        case 1: {
                            return "Manual";
                        }
                        case 0x100: {
                            return "Standard (100%)";
                        }
                        case 0x200: {
                            return "Wide 1 (230%)";
                        }
                        case 0x201: {
                            return "Wide 2 (400%)";
                        }
                        case 0x8000: {
                            return "Film Simulation";
                        }
                        default: {
                            return m5.b.v("Unknown (", integer11, ")");
                        }
                    }
                }
                default: {
                    return super.c(v);
                }
            }
        }
        return this.l(0, 2);
    }

    private final String p(int v) {
        switch(v) {
            case 0x300: {
                return this.g(0x300, 1, new String[]{"Fine", "Basic"});
            }
            case 770: {
                return this.g(0x300, 1, new String[]{"User Profile 1", "User Profile 2", "User Profile 3", "User Profile 0 (Dynamic)"});
            }
            case 0x304: {
                return this.g(0x304, 0, new String[]{"Auto or Manual", "Daylight", "Fluorescent", "Tungsten", "Flash", "Cloudy", "Shadow"});
            }
            case 785: {
                return this.j(785);
            }
            case 786: {
                return this.j(786);
            }
            case 787: {
                return this.j(787);
            }
            case 800: {
                Integer integer0 = this.a.getInteger(800);
                return integer0 == null ? null : String.format("%d C", integer0);
            }
            default: {
                return v == 802 || v == 803 || v == 804 ? this.j(v) : super.c(v);
            }
        }
    }

    private final String q(int v) {
        if(v != 0x40D) {
            return super.c(v);
        }
        byte[] arr_b = ((LeicaType5MakernoteDirectory)this.a).getByteArray(0x40D);
        if(arr_b != null && arr_b.length >= 4) {
            String s = String.format("%d %d %d %d", ((byte)arr_b[0]), ((byte)arr_b[1]), ((byte)arr_b[2]), ((byte)arr_b[3]));
            if(s.equals("0 0 0 0")) {
                return "Program AE";
            }
            if(s.equals("1 0 0 0")) {
                return "Aperture-priority AE";
            }
            if(s.equals("1 1 0 0")) {
                return "Aperture-priority AE (1)";
            }
            if(s.equals("2 0 0 0")) {
                return "Shutter speed priority AE";
            }
            return s.equals("3 0 0 0") ? "Manual" : J.e("Unknown (", s, ")");
        }
        return null;
    }

    private final String r(int v) {
        if(v != 0x30) {
            b b0 = this.a;
            switch(v) {
                case 55: {
                    Integer integer0 = ((NikonPictureControl1Directory)b0).getInteger(55);
                    if(integer0 == null) {
                        return null;
                    }
                    int v1 = (int)integer0;
                    if(v1 != 0xFF) {
                        switch(v1) {
                            case 0x80: {
                                return "Off";
                            }
                            case 0x81: {
                                return "Yellow";
                            }
                            case 130: {
                                return "Orange";
                            }
                            case 0x83: {
                                return "Red";
                            }
                            case 0x84: {
                                return "Green";
                            }
                            default: {
                                return super.c(55);
                            }
                        }
                    }
                    return "N/A";
                }
                case 56: {
                    Integer integer1 = ((NikonPictureControl1Directory)b0).getInteger(56);
                    if(integer1 == null) {
                        return null;
                    }
                    int v2 = (int)integer1;
                    if(v2 != 0xFF) {
                        switch(v2) {
                            case 0x80: {
                                return "B&W";
                            }
                            case 0x81: {
                                return "Sepia";
                            }
                            case 130: {
                                return "Cyanotype";
                            }
                            case 0x83: {
                                return "Red";
                            }
                            case 0x84: {
                                return "Yellow";
                            }
                            case 0x85: {
                                return "Green";
                            }
                            case 0x86: {
                                return "Blue-green";
                            }
                            case 0x87: {
                                return "Blue";
                            }
                            case 0x88: {
                                return "Purple-blue";
                            }
                            case 0x89: {
                                return "Red-purple";
                            }
                            default: {
                                return super.c(56);
                            }
                        }
                    }
                    return "N/A";
                }
                default: {
                    return super.c(v);
                }
            }
        }
        return this.g(0x30, 0, new String[]{"Default Settings", "Quick Adjust", "Full Control"});
    }

    private final String s(int v) {
        if(v != 0x30) {
            b b0 = this.a;
            switch(v) {
                case 0x3F: {
                    byte[] arr_b = ((NikonPictureControl2Directory)b0).getByteArray(0x3F);
                    if(arr_b == null) {
                        return null;
                    }
                    int v1 = arr_b[0];
                    if(v1 != -1) {
                        switch(v1) {
                            case 0xFFFFFF80: {
                                return "Off";
                            }
                            case 0xFFFFFF81: {
                                return "Yellow";
                            }
                            case 0xFFFFFF82: {
                                return "Orange";
                            }
                            case 0xFFFFFF83: {
                                return "Red";
                            }
                            case 0xFFFFFF84: {
                                return "Green";
                            }
                            default: {
                                return super.c(0x3F);
                            }
                        }
                    }
                    return "N/A";
                }
                case 0x40: {
                    byte[] arr_b1 = ((NikonPictureControl2Directory)b0).getByteArray(0x40);
                    if(arr_b1 == null) {
                        return null;
                    }
                    int v2 = arr_b1[0];
                    if(v2 != -1) {
                        switch(v2) {
                            case 0xFFFFFF80: {
                                return "B&W";
                            }
                            case 0xFFFFFF81: {
                                return "Sepia";
                            }
                            case 0xFFFFFF82: {
                                return "Cyanotype";
                            }
                            case 0xFFFFFF83: {
                                return "Red";
                            }
                            case 0xFFFFFF84: {
                                return "Yellow";
                            }
                            case 0xFFFFFF85: {
                                return "Green";
                            }
                            case 0xFFFFFF86: {
                                return "Blue-green";
                            }
                            case 0xFFFFFF87: {
                                return "Blue";
                            }
                            case -120: {
                                return "Purple-blue";
                            }
                            case 0xFFFFFF89: {
                                return "Red-purple";
                            }
                            default: {
                                return super.c(0x40);
                            }
                        }
                    }
                    return "N/A";
                }
                default: {
                    return super.c(v);
                }
            }
        }
        return this.g(0x30, 0, new String[]{"Default Settings", "Quick Adjust", "Full Control"});
    }

    private final String t(int v) {
        b b0 = this.a;
        switch(v) {
            case 3: {
                return this.g(3, 1, new String[]{"VGA Basic", "VGA Normal", "VGA Fine", "SXGA Basic", "SXGA Normal", "SXGA Fine"});
            }
            case 4: {
                return this.g(4, 1, new String[]{"Color", "Monochrome"});
            }
            case 5: {
                return this.g(5, 0, new String[]{"Normal", "Bright +", "Bright -", "Contrast +", "Contrast -"});
            }
            case 6: {
                return this.g(6, 0, new String[]{"ISO80", 0, "ISO160", 0, "ISO320", "ISO100"});
            }
            case 7: {
                return this.g(7, 0, new String[]{"Auto", "Preset", "Daylight", "Incandescence", "Florescence", "Cloudy", "SpeedLight"});
            }
            case 8: {
                k k0 = ((NikonType1MakernoteDirectory)b0).getRational(8);
                if(k0 != null) {
                    return k0.X != 1L || k0.Y != 0L ? k0.d(true) : "Infinite";
                }
                return null;
            }
            case 10: {
                k k1 = ((NikonType1MakernoteDirectory)b0).getRational(10);
                if(k1 != null) {
                    return k1.X == 0L ? "No digital zoom" : k1.d(true) + "x digital zoom";
                }
                return null;
            }
            case 11: {
                return this.g(11, 0, new String[]{"None", "Fisheye converter"});
            }
            default: {
                return super.c(v);
            }
        }
    }

    private final String u(int v) {
        if(v != 1) {
            b b0 = this.a;
            switch(v) {
                case 2: {
                    int[] arr_v = ((NikonType2MakernoteDirectory)b0).getIntArray(2);
                    if(arr_v != null) {
                        return arr_v[0] != 0 || arr_v[1] == 0 ? "Unknown (" + ((NikonType2MakernoteDirectory)b0).getString(2) + ")" : "ISO " + arr_v[1];
                    }
                    return null;
                }
                case 13: {
                    return this.J(13);
                }
                case 14: {
                    return this.J(14);
                }
                case 18: {
                    return this.J(18);
                }
                case 23: {
                    return this.J(23);
                }
                case 24: {
                    return this.J(24);
                }
                case 28: {
                    return this.J(28);
                }
                case 30: {
                    return this.g(30, 1, new String[]{"sRGB", "Adobe RGB"});
                }
                case 34: {
                    Integer integer0 = ((NikonType2MakernoteDirectory)b0).getInteger(34);
                    if(integer0 != null) {
                        switch(((int)integer0)) {
                            case 0: {
                                return "Off";
                            }
                            case 1: {
                                return "Light";
                            }
                            case 3: {
                                return "Normal";
                            }
                            case 5: {
                                return "High";
                            }
                            case 7: {
                                return "Extra High";
                            }
                            case 0xFFFF: {
                                return "Auto";
                            }
                            default: {
                                return m5.b.v("Unknown (", integer0, ")");
                            }
                        }
                    }
                    return null;
                }
                case 42: {
                    Integer integer1 = ((NikonType2MakernoteDirectory)b0).getInteger(42);
                    if(integer1 != null) {
                        switch(((int)integer1)) {
                            case 0: {
                                return "Off";
                            }
                            case 1: {
                                return "Low";
                            }
                            case 3: {
                                return "Normal";
                            }
                            case 5: {
                                return "High";
                            }
                            default: {
                                return m5.b.v("Unknown (", integer1, ")");
                            }
                        }
                    }
                    return null;
                }
                case 0x83: {
                    return this.a(0x83, new Object[]{new String[]{"AF", "MF"}, "D", "G", "VR"});
                }
                case 0x84: {
                    return this.h(0x84);
                }
                case 0x86: {
                    k k0 = ((NikonType2MakernoteDirectory)b0).getRational(0x86);
                    if(k0 != null) {
                        return ((int)k0.doubleValue()) == 1 ? "No digital zoom" : k0.d(true) + "x digital zoom";
                    }
                    return null;
                }
                case 0x87: {
                    return this.g(0x87, 0, new String[]{"Flash Not Used", "Manual Flash", 0, "Flash Not Ready", 0, 0, 0, "External Flash", "Fired, Commander Mode", "Fired, TTL Mode"});
                }
                case 0x88: {
                    int[] arr_v1 = ((NikonType2MakernoteDirectory)b0).getIntArray(0x88);
                    if(arr_v1 != null) {
                        if(arr_v1.length == 4 && arr_v1[0] == 0 && arr_v1[2] == 0 && arr_v1[3] == 0) {
                            switch(arr_v1[1]) {
                                case 0: {
                                    return "Centre";
                                }
                                case 1: {
                                    return "Top";
                                }
                                case 2: {
                                    return "Bottom";
                                }
                                case 3: {
                                    return "Left";
                                }
                                case 4: {
                                    return "Right";
                                }
                                default: {
                                    return J.f(new StringBuilder("Unknown ("), arr_v1[1], ")");
                                }
                            }
                        }
                        return "Unknown (" + ((NikonType2MakernoteDirectory)b0).getString(0x88) + ")";
                    }
                    return null;
                }
                case 0x89: {
                    return this.a(0x89, new Object[]{new String[]{"Single Frame", "Continuous"}, "Delay", null, "PC Control", "Exposure Bracketing", "Auto ISO", "White-Balance Bracketing", "IR Control"});
                }
                case 0x8B: {
                    return this.J(0x8B);
                }
                case 0x8D: {
                    String s = ((NikonType2MakernoteDirectory)b0).getString(0x8D);
                    if(s != null) {
                        return s.startsWith("MODE1") ? "Mode I (sRGB)" : s;
                    }
                    return null;
                }
                case 0x92: {
                    String s1 = b0.getString(0x92);
                    return s1 == null ? null : s1 + " degrees";
                }
                case 0x93: {
                    return this.g(0x93, 1, new String[]{"Lossy (Type 1)", 0, "Uncompressed", 0, 0, 0, "Lossless", "Lossy (Type 2)"});
                }
                case 0xB1: {
                    return this.g(0xB1, 0, new String[]{"Off", "Minimal", "Low", 0, "Normal", 0, "High"});
                }
                case 0xB6: {
                    byte[] arr_b = ((NikonType2MakernoteDirectory)b0).getByteArray(0xB6);
                    return arr_b == null ? null : String.format("%04d:%02d:%02d %02d:%02d:%02d", ByteBuffer.wrap(new byte[]{arr_b[0], arr_b[1]}).getShort(), ((byte)arr_b[2]), ((byte)arr_b[3]), ((byte)arr_b[4]), ((byte)arr_b[5]), ((byte)arr_b[6]));
                }
                default: {
                    return super.c(v);
                }
            }
        }
        return this.l(1, 2);
    }

    private final String v(int v) {
        int v2;
        int v1;
        switch(v) {
            case 0: {
                return this.l(0, 4);
            }
            case 0x209: {
                return this.g(0x209, 0, new String[]{"Off", "On"});
            }
            default: {
                b b0 = this.a;
                if(v != 0x305) {
                    switch(v) {
                        case 0x308: {
                            Integer integer1 = ((OlympusFocusInfoMakernoteDirectory)b0).getInteger(0x308);
                            return integer1 == null ? null : integer1.toString();
                        }
                        case 4609: {
                            int[] arr_v2 = ((OlympusFocusInfoMakernoteDirectory)b0).getIntArray(4609);
                            if(arr_v2 != null && arr_v2.length >= 2) {
                                String s1 = String.format("%d %d", ((short)arr_v2[0]), ((short)arr_v2[1]));
                                if(s1.equals("0 0")) {
                                    return "Off";
                                }
                                return s1.equals("1 0") ? "On" : J.e("Unknown (", s1, ")");
                            }
                            return null;
                        }
                        case 0x1204: {
                            return this.g(0x1204, 0, new String[]{"Bounce or Off", "Direct"});
                        }
                        case 0x1205: {
                            int[] arr_v1 = ((OlympusFocusInfoMakernoteDirectory)b0).getIntArray(0x1205);
                            if(arr_v1 == null) {
                                Integer integer0 = ((OlympusFocusInfoMakernoteDirectory)b0).getInteger(0x1205);
                                if(integer0 != null) {
                                    arr_v1 = new int[]{((int)integer0)};
                                    v1 = (int)integer0;
                                    v2 = 0;
                                    goto label_19;
                                }
                            }
                            else {
                            label_19:
                                if(arr_v1.length != 0) {
                                    String s = String.format("%d", ((short)v1));
                                    if(arr_v1.length > 1) {
                                        StringBuilder stringBuilder0 = A3.e.w(s, " ");
                                        stringBuilder0.append(String.format("%d", ((short)v2)));
                                        s = stringBuilder0.toString();
                                    }
                                    if(!s.equals("0")) {
                                        if(s.equals("1")) {
                                            return "On";
                                        }
                                        if(!s.equals("0 0")) {
                                            return s.equals("1 0") ? "On" : J.e("Unknown (", s, ")");
                                        }
                                    }
                                    return "Off";
                                }
                            }
                            return null;
                        }
                        case 0x1209: {
                            int[] arr_v = ((OlympusFocusInfoMakernoteDirectory)b0).getIntArray(0x1209);
                            if(arr_v == null) {
                                return null;
                            }
                            if(((short)arr_v[0]) != 0) {
                                return ((short)arr_v[1]) == 1 ? "Full" : J.f(new StringBuilder("On (1/"), ((int)(((short)arr_v[1]))), " strength)");
                            }
                            return "Off";
                        }
                        case 0x120A: {
                            return this.g(0x120A, 0, new String[]{"Off", "On"});
                        }
                        case 0x1500: {
                            return ((OlympusFocusInfoMakernoteDirectory)b0).getString(0x1500);
                        }
                        case 0x1600: {
                            byte[] arr_b = ((OlympusFocusInfoMakernoteDirectory)b0).getByteArray(0x1600);
                            if(arr_b == null) {
                                return null;
                            }
                            if((arr_b[2] | (arr_b[0] | arr_b[1]) | arr_b[3]) != 0) {
                                return (arr_b[43] & 1) <= 0 ? "On, Mode 2" : "On, Mode 1";
                            }
                            return "Off";
                        }
                        default: {
                            return super.c(v);
                        }
                    }
                }
                k k0 = ((OlympusFocusInfoMakernoteDirectory)b0).getRational(0x305);
                if(k0 != null) {
                    return k0.X == 0xFFFFFFFFL || k0.X == 0L ? "inf" : ((double)k0.X) / 1000.0 + " m";
                }
                return "inf";
            }
        }
    }

    private final String w(int v) {
        int v4;
        int v3;
        if(v != 0) {
            b b0 = this.a;
            switch(v) {
                case 0x200: {
                    int[] arr_v = ((OlympusImageProcessingMakernoteDirectory)b0).getIntArray(0x200);
                    if(arr_v != null) {
                        StringBuilder stringBuilder0 = new StringBuilder();
                        for(int v1 = 0; v1 < arr_v.length; ++v1) {
                            if(v1 != 0) {
                                stringBuilder0.append(" ");
                            }
                            stringBuilder0.append(((int)(((short)arr_v[v1]))));
                        }
                        return stringBuilder0.toString();
                    }
                    return null;
                }
                case 0x1010: {
                    Integer integer0 = ((OlympusImageProcessingMakernoteDirectory)b0).getInteger(0x1010);
                    if(integer0 != null) {
                        if(((int)integer0) == 0) {
                            return "(none)";
                        }
                        StringBuilder stringBuilder1 = new StringBuilder();
                        int v2 = integer0.shortValue();
                        if((v2 & 1) != 0) {
                            stringBuilder1.append("Noise Reduction, ");
                        }
                        if((v2 >> 1 & 1) != 0) {
                            stringBuilder1.append("Noise Filter, ");
                        }
                        if((v2 >> 2 & 1) != 0) {
                            stringBuilder1.append("Noise Filter (ISO Boost), ");
                        }
                        return stringBuilder1.substring(0, stringBuilder1.length() - 2);
                    }
                    return null;
                }
                case 0x1011: {
                    return this.g(0x1011, 0, new String[]{"Off", "On"});
                }
                case 0x1012: {
                    return this.g(0x1012, 0, new String[]{"Off", "On"});
                }
                case 0x101C: {
                    int[] arr_v1 = ((OlympusImageProcessingMakernoteDirectory)b0).getIntArray(0x101C);
                    if(arr_v1 == null) {
                        Integer integer1 = ((OlympusImageProcessingMakernoteDirectory)b0).getInteger(0x101C);
                        if(integer1 != null) {
                            arr_v1 = new int[]{((int)integer1)};
                            v3 = (int)integer1;
                            v4 = 0;
                            goto label_39;
                        }
                    }
                    else {
                    label_39:
                        if(arr_v1.length != 0) {
                            StringBuilder stringBuilder2 = new StringBuilder();
                            switch(((short)v3)) {
                                case 0: {
                                    stringBuilder2.append("Off");
                                    break;
                                }
                                case 2: {
                                    stringBuilder2.append("On (2 frames)");
                                    break;
                                }
                                default: {
                                    if(((short)v3) == 3) {
                                        stringBuilder2.append("On (3 frames)");
                                    }
                                    else {
                                        stringBuilder2.append("Unknown (");
                                        stringBuilder2.append(((int)(((short)v3))));
                                        stringBuilder2.append(")");
                                    }
                                }
                            }
                            if(arr_v1.length > 1) {
                                stringBuilder2.append("; ");
                                stringBuilder2.append(((int)(((short)v4))));
                            }
                            return stringBuilder2.toString();
                        }
                    }
                    return null;
                }
                case 4370: {
                    byte[] arr_b = ((OlympusImageProcessingMakernoteDirectory)b0).getByteArray(4370);
                    if(arr_b != null && arr_b.length >= 2) {
                        String s = String.format("%d %d", ((byte)arr_b[0]), ((byte)arr_b[1]));
                        if(s.equals("1 1")) {
                            return "4:3";
                        }
                        if(s.equals("1 4")) {
                            return "1:1";
                        }
                        if(s.equals("2 1")) {
                            return "3:2 (RAW)";
                        }
                        if(s.equals("2 2")) {
                            return "3:2";
                        }
                        if(s.equals("3 1")) {
                            return "16:9 (RAW)";
                        }
                        if(s.equals("3 3")) {
                            return "16:9";
                        }
                        if(s.equals("4 1")) {
                            return "1:1 (RAW)";
                        }
                        if(s.equals("4 4")) {
                            return "6:6";
                        }
                        if(s.equals("5 5")) {
                            return "5:4";
                        }
                        if(s.equals("6 6")) {
                            return "7:6";
                        }
                        if(s.equals("7 7")) {
                            return "6:5";
                        }
                        if(s.equals("8 8")) {
                            return "7:5";
                        }
                        if(s.equals("9 1")) {
                            return "3:4 (RAW)";
                        }
                        return s.equals("9 9") ? "3:4" : J.e("Unknown (", s, ")");
                    }
                    return null;
                }
                case 6400: {
                    byte[] arr_b1 = ((OlympusImageProcessingMakernoteDirectory)b0).getByteArray(6400);
                    if(arr_b1 != null && arr_b1.length >= 2) {
                        String s1 = String.format("%d %d", ((byte)arr_b1[0]), ((byte)arr_b1[1]));
                        if(s1.equals("0 0")) {
                            return "Off";
                        }
                        return s1.equals("0 1") ? "On" : J.e("Unknown (", s1, ")");
                    }
                    return null;
                }
                case 6401: {
                    return this.g(6401, 0, new String[]{"Vertical", "Horizontal"});
                }
                default: {
                    return super.c(v);
                }
            }
        }
        return this.l(0, 4);
    }

    private final String x(int v) {
        if(v != 0) {
            b b0 = this.a;
            switch(v) {
                case 0x108: {
                    return this.g(0x108, 0, new String[]{"sRGB", "Adobe RGB", "Pro Photo RGB"});
                }
                case 0x109: {
                    return this.g(0x109, 0, new String[]{"High Speed", "High Function", "Advanced High Speed", "Advanced High Function"});
                }
                case 0x10A: {
                    Integer integer0 = ((OlympusRawDevelopmentMakernoteDirectory)b0).getInteger(0x10A);
                    if(integer0 == null) {
                        return null;
                    }
                    if(((int)integer0) != 0) {
                        StringBuilder stringBuilder0 = new StringBuilder();
                        int v1 = (int)integer0;
                        if((v1 & 1) != 0) {
                            stringBuilder0.append("Noise Reduction, ");
                        }
                        if((v1 >> 1 & 1) != 0) {
                            stringBuilder0.append("Noise Filter, ");
                        }
                        if((v1 >> 2 & 1) != 0) {
                            stringBuilder0.append("Noise Filter (ISO Boost), ");
                        }
                        return stringBuilder0.substring(0, stringBuilder0.length() - 2);
                    }
                    return "(none)";
                }
                case 0x10B: {
                    Integer integer1 = ((OlympusRawDevelopmentMakernoteDirectory)b0).getInteger(0x10B);
                    if(integer1 != null) {
                        int v2 = (int)integer1;
                        switch(v2) {
                            case 0: {
                                return "Original";
                            }
                            case 1: {
                                return "Edited (Landscape)";
                            }
                            default: {
                                return v2 == 6 || v2 == 8 ? "Edited (Portrait)" : m5.b.v("Unknown (", integer1, ")");
                            }
                        }
                    }
                    return null;
                }
                case 0x10C: {
                    Integer integer2 = ((OlympusRawDevelopmentMakernoteDirectory)b0).getInteger(0x10C);
                    if(integer2 == null) {
                        return null;
                    }
                    if(((int)integer2) != 0) {
                        StringBuilder stringBuilder1 = new StringBuilder();
                        int v3 = (int)integer2;
                        if((v3 & 1) != 0) {
                            stringBuilder1.append("WB Color Temp, ");
                        }
                        if((v3 >> 1 & 1) != 0) {
                            stringBuilder1.append("WB Gray Point, ");
                        }
                        if((v3 >> 2 & 1) != 0) {
                            stringBuilder1.append("Saturation, ");
                        }
                        if((v3 >> 3 & 1) != 0) {
                            stringBuilder1.append("Contrast, ");
                        }
                        if((v3 >> 4 & 1) != 0) {
                            stringBuilder1.append("Sharpness, ");
                        }
                        if((v3 >> 5 & 1) != 0) {
                            stringBuilder1.append("Color Space, ");
                        }
                        if((v3 >> 6 & 1) != 0) {
                            stringBuilder1.append("High Function, ");
                        }
                        if((v3 >> 7 & 1) != 0) {
                            stringBuilder1.append("Noise Reduction, ");
                        }
                        return stringBuilder1.substring(0, stringBuilder1.length() - 2);
                    }
                    return "(none)";
                }
                default: {
                    return super.c(v);
                }
            }
        }
        return this.l(0, 4);
    }

    private final String y(int v) {
        int v1 = 0;
        if(v != 0) {
            b b0 = this.a;
            switch(v) {
                case 0x200: {
                    int[] arr_v = ((OlympusRawInfoMakernoteDirectory)b0).getIntArray(0x200);
                    if(arr_v != null) {
                        StringBuilder stringBuilder0 = new StringBuilder();
                        while(v1 < arr_v.length) {
                            stringBuilder0.append(((int)(((short)arr_v[v1]))));
                            if(v1 < arr_v.length - 1) {
                                stringBuilder0.append(" ");
                            }
                            ++v1;
                        }
                        return stringBuilder0.length() == 0 ? null : stringBuilder0.toString();
                    }
                    return null;
                }
                case 0x601: {
                    int[] arr_v1 = ((OlympusRawInfoMakernoteDirectory)b0).getIntArray(0x601);
                    if(arr_v1 != null) {
                        int v2 = arr_v1.length / 2;
                        k[] arr_k = new k[v2];
                        for(int v3 = 0; v3 < arr_v1.length / 2; ++v3) {
                            arr_k[v3] = new k(((long)(((short)arr_v1[v3 * 2]))), ((long)(((short)arr_v1[v3 * 2 + 1]))));
                        }
                        StringBuilder stringBuilder1 = new StringBuilder();
                        while(v1 < v2) {
                            stringBuilder1.append(arr_k[v1].doubleValue());
                            if(v1 < v2 - 1) {
                                stringBuilder1.append(" ");
                            }
                            ++v1;
                        }
                        return stringBuilder1.length() == 0 ? null : stringBuilder1.toString();
                    }
                    return null;
                }
                case 0x1000: {
                    Integer integer0 = ((OlympusRawInfoMakernoteDirectory)b0).getInteger(0x1000);
                    if(integer0 != null) {
                        switch(integer0.shortValue()) {
                            case 0: {
                                return "Unknown";
                            }
                            case 16: {
                                return "Shade";
                            }
                            case 17: {
                                return "Cloudy";
                            }
                            case 18: {
                                return "Fine Weather";
                            }
                            case 20: {
                                return "Tungsten (Incandescent)";
                            }
                            case 22: {
                                return "Evening Sunlight";
                            }
                            case 33: {
                                return "Daylight Fluorescent";
                            }
                            case 34: {
                                return "Day White Fluorescent";
                            }
                            case 35: {
                                return "Cool White Fluorescent";
                            }
                            case 36: {
                                return "White Fluorescent";
                            }
                            case 0x100: {
                                return "One Touch White Balance";
                            }
                            case 0x200: {
                                return "Custom 1-4";
                            }
                            default: {
                                return m5.b.v("Unknown (", integer0, ")");
                            }
                        }
                    }
                    return null;
                }
                default: {
                    return super.c(v);
                }
            }
        }
        return this.l(0, 4);
    }

    private final String z(int v) {
        String[] arr_s = d.c;
        b b0 = this.a;
        switch(v) {
            case 1: {
                return this.g(1, 2, new String[]{"High", "Normal", 0, 0, "Very High", "Raw", 0, "Motion Picture"});
            }
            case 2: {
                return this.l(2, 2);
            }
            case 3: {
                return this.g(3, 1, new String[]{"Auto", "Daylight", "Cloudy", "Incandescent", "Manual", 0, 0, "Flash", 0, "Black & White", "Manual", "Shade"});
            }
            case 7: {
                return this.g(7, 1, new String[]{"Auto", "Manual", 0, "Auto, Focus Button", "Auto, Continuous"});
            }
            case 15: {
                int[] arr_v = ((PanasonicMakernoteDirectory)b0).getIntArray(15);
                if(arr_v != null && arr_v.length >= 2) {
                    switch(arr_v[0]) {
                        case 0: {
                            switch(arr_v[1]) {
                                case 1: {
                                    return "Spot Mode On";
                                }
                                case 16: {
                                    return "Spot Mode Off";
                                }
                                default: {
                                    StringBuilder stringBuilder1 = new StringBuilder("Unknown (");
                                    stringBuilder1.append(arr_v[0]);
                                    stringBuilder1.append(" ");
                                    return J.f(stringBuilder1, arr_v[1], ")");
                                }
                            }
                        }
                        case 1: {
                            switch(arr_v[1]) {
                                case 0: {
                                    return "Spot Focusing";
                                }
                                case 1: {
                                    return "5-area";
                                }
                                default: {
                                    StringBuilder stringBuilder2 = new StringBuilder("Unknown (");
                                    stringBuilder2.append(arr_v[0]);
                                    stringBuilder2.append(" ");
                                    return J.f(stringBuilder2, arr_v[1], ")");
                                }
                            }
                        }
                        case 16: {
                            switch(arr_v[1]) {
                                case 0: {
                                    return "1-area";
                                }
                                case 16: {
                                    return "1-area (high speed)";
                                }
                                default: {
                                    StringBuilder stringBuilder3 = new StringBuilder("Unknown (");
                                    stringBuilder3.append(arr_v[0]);
                                    stringBuilder3.append(" ");
                                    return J.f(stringBuilder3, arr_v[1], ")");
                                }
                            }
                        }
                        case 0x20: {
                            int v2 = arr_v[1];
                            switch(v2) {
                                case 0: {
                                    return "Auto or Face Detect";
                                }
                                case 1: {
                                    return "3-area (left)";
                                }
                                case 2: {
                                    return "3-area (center)";
                                }
                                default: {
                                    if(v2 != 3) {
                                        StringBuilder stringBuilder4 = new StringBuilder("Unknown (");
                                        stringBuilder4.append(arr_v[0]);
                                        stringBuilder4.append(" ");
                                        return J.f(stringBuilder4, arr_v[1], ")");
                                    }
                                    return "3-area (right)";
                                }
                            }
                        }
                        case 0x40: {
                            return "Face Detect";
                        }
                        default: {
                            StringBuilder stringBuilder0 = new StringBuilder("Unknown (");
                            stringBuilder0.append(arr_v[0]);
                            stringBuilder0.append(" ");
                            return J.f(stringBuilder0, arr_v[1], ")");
                        }
                    }
                }
                return null;
            }
            case 26: {
                return this.g(26, 2, new String[]{"On, Mode 1", "Off", "On, Mode 2"});
            }
            case 28: {
                return this.g(28, 1, new String[]{"Off", "On"});
            }
            case 0x1F: {
                return this.g(0x1F, 1, arr_s);
            }
            case 0x20: {
                return this.g(0x20, 1, new String[]{"Off", "On"});
            }
            case 33: {
                return this.b(33);
            }
            case 37: {
                byte[] arr_b = b0.getByteArray(37);
                if(arr_b == null) {
                    return null;
                }
                int v3 = arr_b.length;
                int v4 = 0;
                while(v4 < arr_b.length) {
                    int v5 = arr_b[v4] & 0xFF;
                    if(v5 != 0 && v5 <= 0x7F) {
                        ++v4;
                    }
                    else {
                        v3 = v4;
                        if(true) {
                            break;
                        }
                    }
                }
                return new String(arr_b, 0, v3);
            }
            case 38: {
                return this.l(38, 2);
            }
            case 40: {
                return this.g(40, 1, new String[]{"Off", "Warm", "Cool", "Black & White", "Sepia"});
            }
            case 41: {
                Integer integer0 = ((PanasonicMakernoteDirectory)b0).getInteger(41);
                return integer0 == null ? null : ((float)(((int)integer0))) / 100.0f + " s";
            }
            case 42: {
                return this.g(42, 0, new String[]{"Off", 0, "On", "Indefinite", "Unlimited"});
            }
            case 44: {
                Integer integer1 = ((PanasonicMakernoteDirectory)b0).getInteger(44);
                if(integer1 == null) {
                    return null;
                }
                switch(((int)integer1)) {
                    case 6: {
                        return "Medium Low";
                    }
                    case 7: {
                        return "Medium High";
                    }
                    case 1: 
                    case 0x100: {
                        return "Low";
                    }
                    case 0: 
                    case 0x110: {
                        return "Normal";
                    }
                    case 2: 
                    case 0x120: {
                        return "High";
                    }
                    default: {
                        return m5.b.v("Unknown (", integer1, ")");
                    }
                }
            }
            case 45: {
                return this.g(45, 0, new String[]{"Standard (0)", "Low (-1)", "High (+1)", "Lowest (-2)", "Highest (+2)"});
            }
            case 46: {
                return this.g(46, 1, new String[]{"Off", "10 s", "2 s"});
            }
            case 0x30: {
                Integer integer2 = ((PanasonicMakernoteDirectory)b0).getInteger(0x30);
                if(integer2 == null) {
                    return null;
                }
                switch(((int)integer2)) {
                    case 1: {
                        return "Horizontal";
                    }
                    case 3: {
                        return "Rotate 180";
                    }
                    case 6: {
                        return "Rotate 90 CW";
                    }
                    case 8: {
                        return "Rotate 270 CW";
                    }
                    default: {
                        return m5.b.v("Unknown (", integer2, ")");
                    }
                }
            }
            case 49: {
                return this.g(49, 1, new String[]{"Fired", "Enabled but not used", "Disabled but required", "Disabled and not required"});
            }
            case 50: {
                return this.g(50, 0, new String[]{"Normal", "Natural", "Vivid"});
            }
            case 51: {
                a a0 = ((PanasonicMakernoteDirectory)b0).getAge(51);
                return a0 == null ? null : a0.c();
            }
            case 52: {
                return this.g(52, 1, new String[]{"Standard", "Extended"});
            }
            case 53: {
                return this.g(53, 1, new String[]{"Off", "Wide", "Telephoto", "Macro"});
            }
            case 57: {
                return this.g(57, 0, new String[]{"Normal"});
            }
            case 58: {
                return this.g(58, 1, new String[]{"Home", "Destination"});
            }
            case 59: {
                return this.g(59, 1, new String[]{"Off", "On"});
            }
            case 61: {
                return this.g(61, 1, new String[]{"Normal", "Outdoor/Illuminations/Flower/HDR Art", "Indoor/Architecture/Objects/HDR B&W", "Creative", "Auto", 0, "Expressive", "Retro", "Pure", "Elegant", 0, "Monochrome", "Dynamic Art", "Silhouette"});
            }
            case 62: {
                return this.g(62, 1, new String[]{"Off", "On"});
            }
            case 69: {
                return this.g(69, 0, new String[]{"No Bracket", "3 Images, Sequence 0/-/+", "3 Images, Sequence -/0/+", "5 Images, Sequence 0/-/+", "5 Images, Sequence -/0/+", "7 Images, Sequence 0/-/+", "7 Images, Sequence -/0/+"});
            }
            case 72: {
                return this.g(72, 0, new String[]{"n/a", "1st", "2nd"});
            }
            case 73: {
                return this.g(73, 1, new String[]{"Off", "On"});
            }
            case 78: {
                return d.m(((PanasonicMakernoteDirectory)b0).getDetectedFaces());
            }
            case 89: {
                return this.K(89);
            }
            case 93: {
                return this.g(93, 0, new String[]{"Off", "Low", "Standard", "High"});
            }
            case 0x60: {
                byte[] arr_b1 = ((PanasonicMakernoteDirectory)b0).getByteArray(0x60);
                if(arr_b1 == null) {
                    return null;
                }
                StringBuilder stringBuilder5 = new StringBuilder();
                for(int v1 = 0; v1 < arr_b1.length; ++v1) {
                    stringBuilder5.append(((int)arr_b1[v1]));
                    if(v1 < arr_b1.length - 1) {
                        stringBuilder5.append(".");
                    }
                }
                return stringBuilder5.toString();
            }
            case 97: {
                return d.m(((PanasonicMakernoteDirectory)b0).getRecognizedFaces());
            }
            case 98: {
                return this.g(98, 0, new String[]{"No", "Yes (Flash required but disabled)"});
            }
            case 101: {
                return d.L(this.k(101, l4.d.a));
            }
            case 102: {
                return d.L(this.k(102, l4.d.a));
            }
            case 103: {
                return d.L(this.k(103, l4.d.a));
            }
            case 105: {
                return d.L(this.k(105, l4.d.a));
            }
            case 107: {
                return d.L(this.k(107, l4.d.a));
            }
            case 109: {
                return d.L(this.k(109, l4.d.a));
            }
            case 0x6F: {
                return d.L(this.k(0x6F, l4.d.a));
            }
            case 0x70: {
                return this.g(0x70, 0, new String[]{"Off", 0, "Auto", "On"});
            }
            case 0x79: {
                return this.g(0x79, 0, new String[]{"Off", "Low", "Standard", "High"});
            }
            case 0x7C: {
                return this.g(0x7C, 0, new String[]{"Off", "On"});
            }
            case 0x89: {
                return this.g(0x89, 0, new String[]{"Auto", "Standard or Custom", "Vivid", "Natural", "Monochrome", "Scenery", "Portrait"});
            }
            case 0x8A: {
                return this.g(0x8A, 0, new String[]{"Off", "On"});
            }
            case 140: {
                Integer integer3 = ((PanasonicMakernoteDirectory)b0).getInteger(140);
                return integer3 == null ? null : String.valueOf(integer3.shortValue());
            }
            case 0x8D: {
                Integer integer4 = ((PanasonicMakernoteDirectory)b0).getInteger(0x8D);
                return integer4 == null ? null : String.valueOf(integer4.shortValue());
            }
            case 0x8E: {
                Integer integer5 = ((PanasonicMakernoteDirectory)b0).getInteger(0x8E);
                return integer5 == null ? null : String.valueOf(integer5.shortValue());
            }
            case 0x8F: {
                return this.g(0x8F, 0, new String[]{"Normal", "Rotate CW", "Rotate 180", "Rotate CCW", "Tilt Upwards", "Tile Downwards"});
            }
            case 0x90: {
                Integer integer6 = ((PanasonicMakernoteDirectory)b0).getInteger(0x90);
                return integer6 == null ? null : new DecimalFormat("0.#").format(((double)integer6.shortValue()) / 10.0);
            }
            case 0x91: {
                Integer integer7 = ((PanasonicMakernoteDirectory)b0).getInteger(0x91);
                return integer7 == null ? null : new DecimalFormat("0.#").format(((double)(-integer7.shortValue())) / 10.0);
            }
            case 0x93: {
                return this.g(0x93, 0, new String[]{"Off", "Left to Right", "Right to Left", "Top to Bottom", "Bottom to Top"});
            }
            case 150: {
                return this.g(150, 0, new String[]{"Off", "Time Lapse", "Stop-motion Animation"});
            }
            case 0x9E: {
                Integer integer8 = ((PanasonicMakernoteDirectory)b0).getInteger(0x9E);
                if(integer8 == null) {
                    return null;
                }
                switch(((int)integer8)) {
                    case 0: {
                        return "Off";
                    }
                    case 100: {
                        return "1 EV";
                    }
                    case 200: {
                        return "2 EV";
                    }
                    case 300: {
                        return "3 EV";
                    }
                    case 0x8064: {
                        return "1 EV (Auto)";
                    }
                    case 0x80C8: {
                        return "2 EV (Auto)";
                    }
                    case 33068: {
                        return "3 EV (Auto)";
                    }
                    default: {
                        return String.format("Unknown (%d)", integer8);
                    }
                }
            }
            case 0x9F: {
                return this.g(0x9F, 0, new String[]{"Mechanical", "Electronic", "Hybrid"});
            }
            case 0xAB: {
                return this.g(0xAB, 0, new String[]{"Off", "On"});
            }
            case 0x8000: {
                return this.l(0x8000, 2);
            }
            case 0x8001: {
                return this.g(0x8001, 1, arr_s);
            }
            case 0x8007: {
                return this.g(0x8007, 1, new String[]{"Off", "On"});
            }
            case 0x8008: {
                return this.g(0x8008, 1, new String[]{"Off", "On"});
            }
            case 0x8009: {
                return this.g(0x8009, 1, new String[]{"Off", "On"});
            }
            case 0x8010: {
                a a1 = ((PanasonicMakernoteDirectory)b0).getAge(0x8010);
                return a1 == null ? null : a1.c();
            }
            case 0x8012: {
                return this.K(0x8012);
            }
            default: {
                return super.c(v);
            }
        }
    }
}

