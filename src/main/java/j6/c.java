package j6;

import Nb.j;
import Q4.i;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.measurement.internal.zzae;
import com.google.android.gms.measurement.internal.zzaj;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzno;
import com.google.android.gms.measurement.internal.zzo;
import com.google.android.gms.measurement.internal.zzon;
import com.google.android.gms.signin.internal.zaa;
import com.google.android.gms.signin.internal.zag;
import com.google.android.gms.signin.internal.zai;
import com.google.android.gms.signin.internal.zak;
import com.sendwave.backend.FragmentHandle;
import com.sendwave.backend.type.ActionSource;
import com.sendwave.backend.type.Currency;
import com.sendwave.backend.type.LinkedAccountTransferDirection;
import com.sendwave.backend.type.PartnerOrg;
import com.sendwave.models.CurrencyAmount;
import com.sendwave.shared.PayBillDialogParams;
import com.sendwave.shared.PayBillDialogResult;
import com.sendwave.shared.PhotoActivityParams;
import com.sendwave.shared.PhotoActivityResult;
import com.sendwave.shared.ProposedBillField;
import com.sendwave.shared.QRScanResult;
import com.sendwave.shared.SecurityChallengeResult;
import com.sendwave.shared.VerifyAuthCodeParams;
import com.sendwave.shared.VerifyToken;
import com.sendwave.shared.paybill.AddFavoriteParams;
import com.sendwave.util.ParcelableSingleton;
import com.wave.customer.limits.AccountLimitsParams;
import com.wave.customer.linkedaccounts.CreateLinkedAccountParams;
import com.wave.customer.linkedaccounts.LinkedAccountActivationKeyParams;
import com.wave.customer.linkedaccounts.LinkedAccountCreationOtpParams;
import com.wave.customer.linkedaccounts.LinkedAccountSelectParams;
import com.wave.customer.linkedaccounts.LinkedAccountSelectResult;
import com.wave.customer.linkedaccounts.LinkedAccountTransferParams;
import com.wave.customer.linkedaccounts.typeselect.LinkedAccountTypeSelectParams;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import o9.H1;

public final class c implements Parcelable.Creator {
    public final int a;

    public c(int v) {
        this.a = v;
        super();
    }

    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        ArrayList arrayList4;
        int v22;
        switch(this.a) {
            case 0: {
                int v = i.R(parcel0);
                String s = null;
                String s1 = null;
                zzon zzon0 = null;
                String s2 = null;
                zzbf zzbf0 = null;
                zzbf zzbf1 = null;
                zzbf zzbf2 = null;
                long v1 = 0L;
                long v2 = 0L;
                long v3 = 0L;
                boolean z = false;
                while(parcel0.dataPosition() < v) {
                    int v4 = parcel0.readInt();
                    switch(((char)v4)) {
                        case 2: {
                            s = i.v(v4, parcel0);
                            break;
                        }
                        case 3: {
                            s1 = i.v(v4, parcel0);
                            break;
                        }
                        case 4: {
                            zzon0 = (zzon)i.u(parcel0, v4, zzon.CREATOR);
                            break;
                        }
                        case 5: {
                            v1 = i.N(v4, parcel0);
                            break;
                        }
                        case 6: {
                            z = i.K(v4, parcel0);
                            break;
                        }
                        case 7: {
                            s2 = i.v(v4, parcel0);
                            break;
                        }
                        case 8: {
                            zzbf0 = (zzbf)i.u(parcel0, v4, zzbf.CREATOR);
                            break;
                        }
                        case 9: {
                            v2 = i.N(v4, parcel0);
                            break;
                        }
                        case 10: {
                            zzbf1 = (zzbf)i.u(parcel0, v4, zzbf.CREATOR);
                            break;
                        }
                        case 11: {
                            v3 = i.N(v4, parcel0);
                            break;
                        }
                        case 12: {
                            zzbf2 = (zzbf)i.u(parcel0, v4, zzbf.CREATOR);
                            break;
                        }
                        default: {
                            i.P(v4, parcel0);
                        }
                    }
                }
                i.z(v, parcel0);
                return new zzae(s, s1, zzon0, v1, z, s2, zzbf0, v2, zzbf1, v3, zzbf2);
            }
            case 1: {
                int v5 = i.R(parcel0);
                Bundle bundle0 = null;
                while(parcel0.dataPosition() < v5) {
                    int v6 = parcel0.readInt();
                    if(((char)v6) == 1) {
                        bundle0 = i.s(v6, parcel0);
                    }
                    else {
                        i.P(v6, parcel0);
                    }
                }
                i.z(v5, parcel0);
                return new zzaj(bundle0);
            }
            case 2: {
                int v7 = i.R(parcel0);
                Bundle bundle1 = null;
                while(parcel0.dataPosition() < v7) {
                    int v8 = parcel0.readInt();
                    if(((char)v8) == 2) {
                        bundle1 = i.s(v8, parcel0);
                    }
                    else {
                        i.P(v8, parcel0);
                    }
                }
                i.z(v7, parcel0);
                return new zzbe(bundle1);
            }
            case 3: {
                int v9 = i.R(parcel0);
                String s3 = null;
                zzbe zzbe0 = null;
                String s4 = null;
                long v10 = 0L;
                while(parcel0.dataPosition() < v9) {
                    int v11 = parcel0.readInt();
                    switch(((char)v11)) {
                        case 2: {
                            s3 = i.v(v11, parcel0);
                            break;
                        }
                        case 3: {
                            zzbe0 = (zzbe)i.u(parcel0, v11, zzbe.CREATOR);
                            break;
                        }
                        case 4: {
                            s4 = i.v(v11, parcel0);
                            break;
                        }
                        case 5: {
                            v10 = i.N(v11, parcel0);
                            break;
                        }
                        default: {
                            i.P(v11, parcel0);
                        }
                    }
                }
                i.z(v9, parcel0);
                return new zzbf(s3, zzbe0, s4, v10);
            }
            case 4: {
                int v12 = i.R(parcel0);
                String s5 = null;
                long v13 = 0L;
                int v14 = 0;
                while(parcel0.dataPosition() < v12) {
                    int v15 = parcel0.readInt();
                    switch(((char)v15)) {
                        case 1: {
                            s5 = i.v(v15, parcel0);
                            break;
                        }
                        case 2: {
                            v13 = i.N(v15, parcel0);
                            break;
                        }
                        case 3: {
                            v14 = i.M(v15, parcel0);
                            break;
                        }
                        default: {
                            i.P(v15, parcel0);
                        }
                    }
                }
                i.z(v12, parcel0);
                return new zzno(v14, v13, s5);
            }
            case 5: {
                int v16 = i.R(parcel0);
                int v17 = 0;
                String s6 = null;
                Long long0 = null;
                Float float0 = null;
                String s7 = null;
                String s8 = null;
                Double double0 = null;
                long v18 = 0L;
                while(parcel0.dataPosition() < v16) {
                    int v19 = parcel0.readInt();
                    switch(((char)v19)) {
                        case 1: {
                            v17 = i.M(v19, parcel0);
                            break;
                        }
                        case 2: {
                            s6 = i.v(v19, parcel0);
                            break;
                        }
                        case 3: {
                            v18 = i.N(v19, parcel0);
                            break;
                        }
                        case 4: {
                            int v20 = i.O(v19, parcel0);
                            if(v20 == 0) {
                                long0 = null;
                            }
                            else {
                                i.S(parcel0, v20, 8);
                                long0 = parcel0.readLong();
                            }
                            break;
                        }
                        case 5: {
                            int v21 = i.O(v19, parcel0);
                            if(v21 == 0) {
                                float0 = null;
                            }
                            else {
                                i.S(parcel0, v21, 4);
                                float0 = parcel0.readFloat();
                            }
                            break;
                        }
                        case 6: {
                            s7 = i.v(v19, parcel0);
                            break;
                        }
                        case 7: {
                            s8 = i.v(v19, parcel0);
                            break;
                        }
                        case 8: {
                            v22 = i.O(v19, parcel0);
                            if(v22 == 0) {
                                double0 = null;
                            }
                            else {
                                goto label_149;
                            }
                            break;
                        }
                        default: {
                            i.P(v19, parcel0);
                        }
                    }
                    continue;
                label_149:
                    i.S(parcel0, v22, 8);
                    double0 = parcel0.readDouble();
                }
                i.z(v16, parcel0);
                return new zzon(v17, s6, v18, long0, float0, s7, s8, double0);
            }
            case 6: {
                int v23 = i.R(parcel0);
                String s9 = null;
                String s10 = null;
                String s11 = null;
                String s12 = null;
                String s13 = null;
                String s14 = null;
                String s15 = null;
                Boolean boolean0 = null;
                ArrayList arrayList0 = null;
                String s16 = null;
                String s17 = null;
                String s18 = null;
                long v24 = 0L;
                long v25 = 0L;
                long v26 = 0L;
                long v27 = 0L;
                long v28 = 0L;
                long v29 = 0L;
                long v30 = 0L;
                boolean z1 = true;
                boolean z2 = true;
                boolean z3 = false;
                int v31 = 0;
                boolean z4 = false;
                boolean z5 = false;
                int v32 = 0;
                long v33 = 0xFFFFFFFF80000000L;
                String s19 = "";
                String s20 = "";
                String s21 = "";
                String s22 = "";
                int v34 = 100;
                while(parcel0.dataPosition() < v23) {
                    int v35 = parcel0.readInt();
                    switch(((char)v35)) {
                        case 2: {
                            s9 = i.v(v35, parcel0);
                            break;
                        }
                        case 3: {
                            s10 = i.v(v35, parcel0);
                            break;
                        }
                        case 4: {
                            s11 = i.v(v35, parcel0);
                            break;
                        }
                        case 5: {
                            s12 = i.v(v35, parcel0);
                            break;
                        }
                        case 6: {
                            v24 = i.N(v35, parcel0);
                            break;
                        }
                        case 7: {
                            v25 = i.N(v35, parcel0);
                            break;
                        }
                        case 8: {
                            s13 = i.v(v35, parcel0);
                            break;
                        }
                        case 9: {
                            z1 = i.K(v35, parcel0);
                            break;
                        }
                        case 10: {
                            z3 = i.K(v35, parcel0);
                            break;
                        }
                        case 11: {
                            v33 = i.N(v35, parcel0);
                            break;
                        }
                        case 12: {
                            s14 = i.v(v35, parcel0);
                            break;
                        }
                        case 13: {
                            v26 = i.N(v35, parcel0);
                            break;
                        }
                        case 14: {
                            v27 = i.N(v35, parcel0);
                            break;
                        }
                        case 15: {
                            v31 = i.M(v35, parcel0);
                            break;
                        }
                        case 16: {
                            z2 = i.K(v35, parcel0);
                            break;
                        }
                        case 18: {
                            z4 = i.K(v35, parcel0);
                            break;
                        }
                        case 19: {
                            s15 = i.v(v35, parcel0);
                            break;
                        }
                        case 21: {
                            int v36 = i.O(v35, parcel0);
                            if(v36 == 0) {
                                boolean0 = null;
                                continue;
                            }
                            else {
                                i.S(parcel0, v36, 4);
                                boolean0 = Boolean.valueOf(parcel0.readInt() != 0);
                                break;
                            }
                            v28 = i.N(v35, parcel0);
                            break;
                        }
                        case 22: {
                            v28 = i.N(v35, parcel0);
                            break;
                        }
                        case 23: {
                            int v37 = i.O(v35, parcel0);
                            int v38 = parcel0.dataPosition();
                            if(v37 == 0) {
                                arrayList0 = null;
                                continue;
                            }
                            else {
                                ArrayList arrayList1 = parcel0.createStringArrayList();
                                parcel0.setDataPosition(v38 + v37);
                                arrayList0 = arrayList1;
                                break;
                            }
                            s16 = i.v(v35, parcel0);
                            break;
                        }
                        case 24: {
                            s16 = i.v(v35, parcel0);
                            break;
                        }
                        case 25: {
                            s19 = i.v(v35, parcel0);
                            break;
                        }
                        case 26: {
                            s20 = i.v(v35, parcel0);
                            break;
                        }
                        case 27: {
                            s17 = i.v(v35, parcel0);
                            break;
                        }
                        case 28: {
                            z5 = i.K(v35, parcel0);
                            break;
                        }
                        case 29: {
                            v29 = i.N(v35, parcel0);
                            break;
                        }
                        case 30: {
                            v34 = i.M(v35, parcel0);
                            break;
                        }
                        case 0x1F: {
                            s21 = i.v(v35, parcel0);
                            break;
                        }
                        case 0x20: {
                            v32 = i.M(v35, parcel0);
                            break;
                        }
                        case 34: {
                            v30 = i.N(v35, parcel0);
                            break;
                        }
                        case 35: {
                            s18 = i.v(v35, parcel0);
                            break;
                        }
                        case 36: {
                            s22 = i.v(v35, parcel0);
                            break;
                        }
                        default: {
                            i.P(v35, parcel0);
                        }
                    }
                }
                i.z(v23, parcel0);
                return new zzo(s9, s10, s11, s12, v24, v25, s13, z1, z3, v33, s14, v26, v27, v31, z2, z4, s15, boolean0, v28, arrayList0, s16, s19, s20, s17, z5, v29, v34, s21, v32, v30, s18, s22);
            }
            case 7: {
                return new CurrencyAmount(parcel0);
            }
            case 8: {
                j.f(parcel0, "parcel");
                String s23 = parcel0.readString();
                String s24 = parcel0.readString();
                return new AccountLimitsParams(((FragmentHandle)parcel0.readParcelable(AccountLimitsParams.class.getClassLoader())), s23, s24);
            }
            case 9: {
                int v39 = i.R(parcel0);
                Intent intent0 = null;
                int v40 = 0;
                int v41 = 0;
                while(parcel0.dataPosition() < v39) {
                    int v42 = parcel0.readInt();
                    switch(((char)v42)) {
                        case 1: {
                            v40 = i.M(v42, parcel0);
                            break;
                        }
                        case 2: {
                            v41 = i.M(v42, parcel0);
                            break;
                        }
                        case 3: {
                            intent0 = (Intent)i.u(parcel0, v42, Intent.CREATOR);
                            break;
                        }
                        default: {
                            i.P(v42, parcel0);
                        }
                    }
                }
                i.z(v39, parcel0);
                return new zaa(v40, v41, intent0);
            }
            case 10: {
                int v43 = i.R(parcel0);
                ArrayList arrayList2 = null;
                String s25 = null;
                while(parcel0.dataPosition() < v43) {
                    int v44 = parcel0.readInt();
                    switch(((char)v44)) {
                        case 1: {
                            int v45 = i.O(v44, parcel0);
                            int v46 = parcel0.dataPosition();
                            if(v45 == 0) {
                                arrayList2 = null;
                                continue;
                            }
                            else {
                                ArrayList arrayList3 = parcel0.createStringArrayList();
                                parcel0.setDataPosition(v46 + v45);
                                arrayList2 = arrayList3;
                                break;
                            }
                            s25 = i.v(v44, parcel0);
                            break;
                        }
                        case 2: {
                            s25 = i.v(v44, parcel0);
                            break;
                        }
                        default: {
                            i.P(v44, parcel0);
                        }
                    }
                }
                i.z(v43, parcel0);
                return new zag(s25, arrayList2);
            }
            case 11: {
                int v47 = i.R(parcel0);
                zat zat0 = null;
                int v48 = 0;
                while(parcel0.dataPosition() < v47) {
                    int v49 = parcel0.readInt();
                    switch(((char)v49)) {
                        case 1: {
                            v48 = i.M(v49, parcel0);
                            break;
                        }
                        case 2: {
                            zat0 = (zat)i.u(parcel0, v49, zat.CREATOR);
                            break;
                        }
                        default: {
                            i.P(v49, parcel0);
                        }
                    }
                }
                i.z(v47, parcel0);
                return new zai(v48, zat0);
            }
            case 12: {
                int v50 = i.R(parcel0);
                ConnectionResult connectionResult0 = null;
                int v51 = 0;
                zav zav0 = null;
                while(parcel0.dataPosition() < v50) {
                    int v52 = parcel0.readInt();
                    switch(((char)v52)) {
                        case 1: {
                            v51 = i.M(v52, parcel0);
                            break;
                        }
                        case 2: {
                            connectionResult0 = (ConnectionResult)i.u(parcel0, v52, ConnectionResult.CREATOR);
                            break;
                        }
                        case 3: {
                            zav0 = (zav)i.u(parcel0, v52, zav.CREATOR);
                            break;
                        }
                        default: {
                            i.P(v52, parcel0);
                        }
                    }
                }
                i.z(v50, parcel0);
                return new zak(v51, connectionResult0, zav0);
            }
            case 13: {
                j.f(parcel0, "parcel");
                return new CreateLinkedAccountParams(((FragmentHandle)parcel0.readParcelable(CreateLinkedAccountParams.class.getClassLoader())));
            }
            case 14: {
                j.f(parcel0, "parcel");
                String s26 = parcel0.readString();
                return new LinkedAccountActivationKeyParams(((FragmentHandle)parcel0.readParcelable(LinkedAccountActivationKeyParams.class.getClassLoader())), s26);
            }
            case 15: {
                j.f(parcel0, "parcel");
                return new LinkedAccountCreationOtpParams(((FragmentHandle)parcel0.readParcelable(LinkedAccountCreationOtpParams.class.getClassLoader())));
            }
            case 16: {
                j.f(parcel0, "parcel");
                String s27 = parcel0.readString();
                return new LinkedAccountSelectParams(((FragmentHandle)parcel0.readParcelable(LinkedAccountSelectParams.class.getClassLoader())), s27);
            }
            case 17: {
                j.f(parcel0, "parcel");
                return new LinkedAccountSelectResult(((FragmentHandle)parcel0.readParcelable(LinkedAccountSelectResult.class.getClassLoader())));
            }
            case 18: {
                j.f(parcel0, "parcel");
                return new LinkedAccountTransferParams(((FragmentHandle)parcel0.readParcelable(LinkedAccountTransferParams.class.getClassLoader())), ((Currency)parcel0.readParcelable(LinkedAccountTransferParams.class.getClassLoader())), ((LinkedAccountTransferDirection)parcel0.readParcelable(LinkedAccountTransferParams.class.getClassLoader())));
            }
            case 19: {
                j.f(parcel0, "parcel");
                Object object0 = FragmentHandle.CREATOR.createFromParcel(parcel0);
                Object object1 = FragmentHandle.CREATOR.createFromParcel(parcel0);
                Class class0 = PayBillDialogParams.class;
                Parcelable parcelable0 = parcel0.readParcelable(class0.getClassLoader());
                Object object2 = parcel0.readInt() == 0 ? null : FragmentHandle.CREATOR.createFromParcel(parcel0);
                if(parcel0.readInt() == 0) {
                    arrayList4 = null;
                }
                else {
                    int v54 = parcel0.readInt();
                    arrayList4 = new ArrayList(v54);
                    for(int v55 = 0; v55 != v54; ++v55) {
                        arrayList4.add(ProposedBillField.CREATOR.createFromParcel(parcel0));
                    }
                }
                Integer integer0 = parcel0.readInt() == 0 ? null : parcel0.readInt();
                String s28 = parcel0.readString();
                Parcelable parcelable1 = parcel0.readParcelable(class0.getClassLoader());
                ParcelableSingleton parcelableSingleton0 = (ParcelableSingleton)parcel0.readParcelable(class0.getClassLoader());
                int v56 = parcel0.readInt();
                LinkedHashMap linkedHashMap0 = new LinkedHashMap(v56);
                for(int v53 = 0; v53 != v56; ++v53) {
                    linkedHashMap0.put(parcel0.readString(), parcel0.readString());
                }
                return new PayBillDialogParams(((FragmentHandle)object0), ((FragmentHandle)object1), ((ParcelableSingleton)parcelable0), ((FragmentHandle)object2), arrayList4, integer0, s28, ((ActionSource)parcelable1), parcelableSingleton0, linkedHashMap0);
            }
            case 20: {
                j.f(parcel0, "parcel");
                return new PayBillDialogResult(parcel0.readString());
            }
            case 21: {
                j.f(parcel0, "parcel");
                String s29 = parcel0.readString();
                boolean z6 = parcel0.readInt() != 0;
                boolean z7 = parcel0.readInt() != 0;
                boolean z8 = parcel0.readInt() != 0;
                String s30 = parcel0.readString();
                H1 h10 = H1.valueOf(parcel0.readString());
                String s31 = parcel0.readString();
                String s32 = parcel0.readString();
                boolean z9 = parcel0.readInt() != 0;
                String s33 = parcel0.readString();
                boolean z10 = parcel0.readInt() != 0;
                boolean z11 = parcel0.readInt() != 0;
                return parcel0.readInt() == 0 ? new PhotoActivityParams(s29, z6, z7, z8, s30, h10, s31, s32, z9, s33, z10, z11, false) : new PhotoActivityParams(s29, z6, z7, z8, s30, h10, s31, s32, z9, s33, z10, z11, true);
            }
            case 22: {
                j.f(parcel0, "parcel");
                ArrayList arrayList5 = parcel0.createStringArrayList();
                if(parcel0.readInt() == 0) {
                    return new PhotoActivityResult(arrayList5, null);
                }
                return parcel0.readInt() == 0 ? new PhotoActivityResult(arrayList5, Boolean.valueOf(false)) : new PhotoActivityResult(arrayList5, Boolean.valueOf(true));
            }
            case 23: {
                j.f(parcel0, "parcel");
                return new ProposedBillField(parcel0.readString(), parcel0.readString(), parcel0.readString(), parcel0.readString());
            }
            case 24: {
                j.f(parcel0, "parcel");
                return new QRScanResult(parcel0.readString());
            }
            case 25: {
                j.f(parcel0, "parcel");
                return parcel0.readInt() == 0 ? new SecurityChallengeResult(false) : new SecurityChallengeResult(true);
            }
            case 26: {
                j.f(parcel0, "parcel");
                Object object3 = FragmentHandle.CREATOR.createFromParcel(parcel0);
                PartnerOrg partnerOrg0 = (PartnerOrg)parcel0.readParcelable(VerifyAuthCodeParams.class.getClassLoader());
                ParcelableSingleton parcelableSingleton1 = (ParcelableSingleton)parcel0.readParcelable(VerifyAuthCodeParams.class.getClassLoader());
                Parcelable parcelable2 = parcel0.readParcelable(VerifyAuthCodeParams.class.getClassLoader());
                String s34 = parcel0.readString();
                long v57 = parcel0.readLong();
                long v58 = parcel0.readLong();
                boolean z12 = true;
                boolean z13 = parcel0.readInt() != 0;
                if(parcel0.readInt() == 0) {
                    z12 = false;
                }
                return new VerifyAuthCodeParams(((FragmentHandle)object3), partnerOrg0, parcelableSingleton1, ((ParcelableSingleton)parcelable2), s34, v57, v58, z13, z12, parcel0.readString());
            }
            case 27: {
                j.f(parcel0, "parcel");
                return parcel0.readInt() == 0 ? new VerifyToken(false) : new VerifyToken(true);
            }
            case 28: {
                j.f(parcel0, "parcel");
                String s35 = parcel0.readString();
                return new LinkedAccountTypeSelectParams(((FragmentHandle)parcel0.readParcelable(LinkedAccountTypeSelectParams.class.getClassLoader())), s35);
            }
            default: {
                j.f(parcel0, "parcel");
                return new AddFavoriteParams(((FragmentHandle)FragmentHandle.CREATOR.createFromParcel(parcel0)));
            }
        }
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        switch(this.a) {
            case 0: {
                return new zzae[v];
            }
            case 1: {
                return new zzaj[v];
            }
            case 2: {
                return new zzbe[v];
            }
            case 3: {
                return new zzbf[v];
            }
            case 4: {
                return new zzno[v];
            }
            case 5: {
                return new zzon[v];
            }
            case 6: {
                return new zzo[v];
            }
            case 7: {
                return new CurrencyAmount[v];
            }
            case 8: {
                return new AccountLimitsParams[v];
            }
            case 9: {
                return new zaa[v];
            }
            case 10: {
                return new zag[v];
            }
            case 11: {
                return new zai[v];
            }
            case 12: {
                return new zak[v];
            }
            case 13: {
                return new CreateLinkedAccountParams[v];
            }
            case 14: {
                return new LinkedAccountActivationKeyParams[v];
            }
            case 15: {
                return new LinkedAccountCreationOtpParams[v];
            }
            case 16: {
                return new LinkedAccountSelectParams[v];
            }
            case 17: {
                return new LinkedAccountSelectResult[v];
            }
            case 18: {
                return new LinkedAccountTransferParams[v];
            }
            case 19: {
                return new PayBillDialogParams[v];
            }
            case 20: {
                return new PayBillDialogResult[v];
            }
            case 21: {
                return new PhotoActivityParams[v];
            }
            case 22: {
                return new PhotoActivityResult[v];
            }
            case 23: {
                return new ProposedBillField[v];
            }
            case 24: {
                return new QRScanResult[v];
            }
            case 25: {
                return new SecurityChallengeResult[v];
            }
            case 26: {
                return new VerifyAuthCodeParams[v];
            }
            case 27: {
                return new VerifyToken[v];
            }
            case 28: {
                return new LinkedAccountTypeSelectParams[v];
            }
            default: {
                return new AddFavoriteParams[v];
            }
        }
    }
}

