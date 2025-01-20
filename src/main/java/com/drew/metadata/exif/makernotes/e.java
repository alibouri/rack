package com.drew.metadata.exif.makernotes;

import com.apollographql.apollo.api.b;
import com.drew.metadata.g;
import java.util.HashMap;

public final class e extends g {
    public static final HashMap b;

    static {
        HashMap hashMap0 = new HashMap();
        e.b = hashMap0;
        b.z(0, hashMap0, "Off", 1, "Soft Focus");
        b.z(2, hashMap0, "Pop Art", 3, "Pale & Light Color");
        b.z(4, hashMap0, "Light Tone", 5, "Pin Hole");
        b.z(6, hashMap0, "Grainy Film", 9, "Diorama");
        b.z(10, hashMap0, "Cross Process", 12, "Fish Eye");
        b.z(13, hashMap0, "Drawing", 14, "Gentle Sepia");
        b.z(15, hashMap0, "Pale & Light Color II", 16, "Pop Art II");
        b.z(17, hashMap0, "Pin Hole II", 18, "Pin Hole III");
        b.z(19, hashMap0, "Grainy Film II", 20, "Dramatic Tone");
        b.z(21, hashMap0, "Punk", 22, "Soft Focus 2");
        b.z(23, hashMap0, "Sparkle", 24, "Watercolor");
        b.z(25, hashMap0, "Key Line", 26, "Key Line II");
        b.z(27, hashMap0, "Miniature", 28, "Reflection");
        b.z(29, hashMap0, "Fragmented", 0x1F, "Cross Process II");
        b.z(0x20, hashMap0, "Dramatic Tone II", 33, "Watercolor I");
        b.z(34, hashMap0, "Watercolor II", 35, "Diorama II");
        b.z(36, hashMap0, "Vintage", 37, "Vintage II");
        b.z(38, hashMap0, "Vintage III", 39, "Partial Color");
        b.z(40, hashMap0, "Partial Color II", 41, "Partial Color III");
    }

    @Override  // com.drew.metadata.g
    public final String c(int v) {
        switch(v) {
            case 0: {
                return this.l(0, 4);
            }
            case 0x100: {
                return this.g(0x100, 1, new String[]{"Color Temperature", "Gray Point"});
            }
            default: {
                com.drew.metadata.b b0 = this.a;
                switch(v) {
                    case 0x109: {
                        return this.g(0x109, 0, new String[]{"sRGB", "Adobe RGB", "Pro Photo RGB"});
                    }
                    case 0x10A: {
                        Integer integer0 = ((OlympusRawDevelopment2MakernoteDirectory)b0).getInteger(0x10A);
                        if(integer0 != null) {
                            if(((int)integer0) == 0) {
                                return "(none)";
                            }
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
                            if((v1 >> 3 & 1) != 0) {
                                stringBuilder0.append("Noise Filter (Auto), ");
                            }
                            if(stringBuilder0.length() > 2) {
                                stringBuilder0.delete(stringBuilder0.length() - 2, stringBuilder0.length());
                            }
                            return stringBuilder0.toString();
                        }
                        return null;
                    }
                    case 0x10B: {
                        return this.g(0x10B, 0, new String[]{"High Speed", "High Function", "Advanced High Speed", "Advanced High Function"});
                    }
                    case 0x10C: {
                        Integer integer1 = ((OlympusRawDevelopment2MakernoteDirectory)b0).getInteger(0x10C);
                        if(integer1 != null) {
                            int v2 = (int)integer1;
                            switch(v2) {
                                case 1: {
                                    return "Vivid";
                                }
                                case 2: {
                                    return "Natural";
                                }
                                case 3: {
                                    return "Muted";
                                }
                                case 0x100: {
                                    return "Monotone";
                                }
                                default: {
                                    return v2 == 0x200 ? "Sepia" : m5.b.v("Unknown (", integer1, ")");
                                }
                            }
                        }
                        return null;
                    }
                    case 0x110: {
                        return this.g(0x110, 0, new String[]{"Neutral", "Yellow", "Orange", "Red", "Green"});
                    }
                    case 273: {
                        return this.g(273, 0, new String[]{"Neutral", "Sepia", "Blue", "Purple", "Green"});
                    }
                    case 289: {
                        int[] arr_v = ((OlympusRawDevelopment2MakernoteDirectory)b0).getIntArray(289);
                        if(arr_v != null && arr_v.length != 0) {
                            StringBuilder stringBuilder1 = new StringBuilder();
                            for(int v3 = 0; v3 < arr_v.length; ++v3) {
                                if(v3 == 0) {
                                    stringBuilder1.append((e.b.containsKey(((int)arr_v[0])) ? ((String)e.b.get(((int)arr_v[0]))) : "[unknown]"));
                                }
                                else {
                                    stringBuilder1.append(arr_v[v3]);
                                    stringBuilder1.append("; ");
                                }
                                stringBuilder1.append("; ");
                            }
                            return stringBuilder1.substring(0, stringBuilder1.length() - 2);
                        }
                        return null;
                    }
                    default: {
                        return super.c(v);
                    }
                }
            }
        }
    }
}

