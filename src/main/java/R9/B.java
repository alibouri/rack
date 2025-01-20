package R9;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.sendwave.androidApi.Contact;
import com.sendwave.backend.FragmentHandle;
import com.sendwave.backend.type.ActionSource;
import com.sendwave.backend.type.PartnerOrg;
import com.sendwave.models.CurrencyAmount;
import com.sendwave.shared.PayBillDialogParams;
import com.sendwave.util.Country;
import com.wave.customer.AskedToRecoverPin;
import com.wave.customer.BuyAirtimeDialogParams;
import com.wave.customer.BuyAirtimeEnterContactParams;
import com.wave.customer.BuyAirtimeSelectParams;
import com.wave.customer.CreatePinParams;
import com.wave.customer.CreatePinResult;
import com.wave.customer.EnterNameParams;
import com.wave.customer.EnterNameResult;
import com.wave.customer.PayMerchantParams;
import com.wave.customer.PaymentCategoryHeader;
import com.wave.customer.PaymentListParams;
import com.wave.customer.QrScanOrCardParams;
import com.wave.customer.RecoverPinParams;
import com.wave.customer.RecoverPinResult;
import com.wave.customer.ResetPinParams;
import com.wave.customer.ResetPinResult;
import com.wave.customer.SignupDeviceApprovalRequired;
import com.wave.customer.SignupLoginParams;
import com.wave.customer.SignupMagicLinkRequired;
import com.wave.customer.SignupNeedsName;
import com.wave.customer.SignupNeedsNameAndNewPin;
import com.wave.customer.SignupNeedsPinUpgradeWithQr;
import com.wave.customer.SignupSuccess;
import com.wave.customer.UpgradeToPinResult;
import com.wave.customer.VerifyPinParams;
import com.wave.customer.VerifyPinToken;
import java.util.ArrayList;

public final class b implements Parcelable.Creator {
    public final int a;

    public b(int v) {
        this.a = v;
        super();
    }

    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        switch(this.a) {
            case 0: {
                j.f(parcel0, "parcel");
                return new AskedToRecoverPin(parcel0.readString());
            }
            case 1: {
                j.f(parcel0, "parcel");
                return new BuyAirtimeDialogParams(((Contact)parcel0.readParcelable(BuyAirtimeDialogParams.class.getClassLoader())), ((PayBillDialogParams)parcel0.readParcelable(BuyAirtimeDialogParams.class.getClassLoader())));
            }
            case 2: {
                j.f(parcel0, "parcel");
                String s = parcel0.readString();
                String s1 = parcel0.readString();
                Parcelable parcelable0 = parcel0.readParcelable(BuyAirtimeEnterContactParams.class.getClassLoader());
                Parcelable parcelable1 = parcel0.readParcelable(BuyAirtimeEnterContactParams.class.getClassLoader());
                int v = parcel0.readInt();
                ArrayList arrayList0 = new ArrayList(v);
                for(int v1 = 0; v1 != v; ++v1) {
                    arrayList0.add(parcel0.readSerializable());
                }
                return new BuyAirtimeEnterContactParams(s, s1, ((FragmentHandle)parcelable0), ((FragmentHandle)parcelable1), arrayList0);
            }
            case 3: {
                j.f(parcel0, "parcel");
                return new BuyAirtimeSelectParams(((FragmentHandle)parcel0.readParcelable(BuyAirtimeSelectParams.class.getClassLoader())));
            }
            case 4: {
                j.f(parcel0, "parcel");
                return new CreatePinParams(parcel0.readString(), parcel0.readString());
            }
            case 5: {
                j.f(parcel0, "parcel");
                return new CreatePinResult(parcel0.readString());
            }
            case 6: {
                j.f(parcel0, "parcel");
                String s2 = parcel0.readString();
                return new EnterNameParams(((FragmentHandle)parcel0.readParcelable(EnterNameParams.class.getClassLoader())), ((PartnerOrg)parcel0.readParcelable(EnterNameParams.class.getClassLoader())), s2);
            }
            case 7: {
                j.f(parcel0, "parcel");
                return new EnterNameResult(parcel0.readString());
            }
            case 8: {
                j.f(parcel0, "parcel");
                String s3 = parcel0.readString();
                boolean z = parcel0.readInt() != 0;
                String s4 = parcel0.readString();
                return new PayMerchantParams(s3, ((CurrencyAmount)parcel0.readParcelable(PayMerchantParams.class.getClassLoader())), z, ((FragmentHandle)parcel0.readParcelable(PayMerchantParams.class.getClassLoader())), s4, ((ActionSource)parcel0.readParcelable(PayMerchantParams.class.getClassLoader())));
            }
            case 9: {
                j.f(parcel0, "parcel");
                return new PaymentCategoryHeader(parcel0.readString());
            }
            case 10: {
                j.f(parcel0, "parcel");
                return new PaymentListParams(parcel0.readString());
            }
            case 11: {
                j.f(parcel0, "parcel");
                int v2 = parcel0.readInt();
                boolean z1 = parcel0.readInt() != 0;
                l2 l20 = l2.valueOf(parcel0.readString());
                return new QrScanOrCardParams(v2, z1, ((FragmentHandle)parcel0.readParcelable(QrScanOrCardParams.class.getClassLoader())), l20);
            }
            case 12: {
                j.f(parcel0, "parcel");
                return new RecoverPinParams(parcel0.readString(), parcel0.readString());
            }
            case 13: {
                j.f(parcel0, "parcel");
                return parcel0.readInt() == 0 ? new RecoverPinResult(false) : new RecoverPinResult(true);
            }
            case 14: {
                j.f(parcel0, "parcel");
                String s5 = parcel0.readString();
                String s6 = parcel0.readString();
                String s7 = parcel0.readString();
                String s8 = parcel0.readString();
                return new ResetPinParams(s5, ((Country)parcel0.readParcelable(ResetPinParams.class.getClassLoader())), s6, s7, s8);
            }
            case 15: {
                j.f(parcel0, "parcel");
                return ResetPinResult.valueOf(parcel0.readString());
            }
            case 16: {
                j.f(parcel0, "parcel");
                String s9 = parcel0.readString();
                if(parcel0.readInt() == 0) {
                    return new SignupDeviceApprovalRequired(s9, null);
                }
                return parcel0.readInt() == 0 ? new SignupDeviceApprovalRequired(s9, Boolean.valueOf(false)) : new SignupDeviceApprovalRequired(s9, Boolean.valueOf(true));
            }
            case 17: {
                j.f(parcel0, "parcel");
                return parcel0.readInt() == 0 ? new SignupLoginParams(false) : new SignupLoginParams(true);
            }
            case 18: {
                j.f(parcel0, "parcel");
                String s10 = parcel0.readString();
                if(parcel0.readInt() == 0) {
                    return new SignupMagicLinkRequired(s10, null);
                }
                return parcel0.readInt() == 0 ? new SignupMagicLinkRequired(s10, Boolean.valueOf(false)) : new SignupMagicLinkRequired(s10, Boolean.valueOf(true));
            }
            case 19: {
                j.f(parcel0, "parcel");
                String s11 = parcel0.readString();
                if(parcel0.readInt() == 0) {
                    return new SignupNeedsName(s11, null);
                }
                return parcel0.readInt() == 0 ? new SignupNeedsName(s11, Boolean.valueOf(false)) : new SignupNeedsName(s11, Boolean.valueOf(true));
            }
            case 20: {
                j.f(parcel0, "parcel");
                String s12 = parcel0.readString();
                if(parcel0.readInt() == 0) {
                    return new SignupNeedsNameAndNewPin(s12, null);
                }
                return parcel0.readInt() == 0 ? new SignupNeedsNameAndNewPin(s12, Boolean.valueOf(false)) : new SignupNeedsNameAndNewPin(s12, Boolean.valueOf(true));
            }
            case 21: {
                j.f(parcel0, "parcel");
                String s13 = parcel0.readString();
                if(parcel0.readInt() == 0) {
                    return new SignupNeedsPinUpgradeWithQr(s13, null);
                }
                return parcel0.readInt() == 0 ? new SignupNeedsPinUpgradeWithQr(s13, Boolean.valueOf(false)) : new SignupNeedsPinUpgradeWithQr(s13, Boolean.valueOf(true));
            }
            case 22: {
                j.f(parcel0, "parcel");
                return new SignupSuccess(parcel0.readString(), parcel0.readString(), ((FragmentHandle)parcel0.readParcelable(SignupSuccess.class.getClassLoader())), ((PartnerOrg)parcel0.readParcelable(SignupSuccess.class.getClassLoader())));
            }
            case 23: {
                j.f(parcel0, "parcel");
                return new UpgradeToPinResult(parcel0.readString());
            }
            case 24: {
                j.f(parcel0, "parcel");
                String s14 = parcel0.readString();
                String s15 = parcel0.readString();
                return parcel0.readInt() == 0 ? new VerifyPinParams(s14, s15, false) : new VerifyPinParams(s14, s15, true);
            }
            default: {
                j.f(parcel0, "parcel");
                return new VerifyPinToken(((FragmentHandle)parcel0.readParcelable(VerifyPinToken.class.getClassLoader())), ((PartnerOrg)parcel0.readParcelable(VerifyPinToken.class.getClassLoader())));
            }
        }
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        switch(this.a) {
            case 0: {
                return new AskedToRecoverPin[v];
            }
            case 1: {
                return new BuyAirtimeDialogParams[v];
            }
            case 2: {
                return new BuyAirtimeEnterContactParams[v];
            }
            case 3: {
                return new BuyAirtimeSelectParams[v];
            }
            case 4: {
                return new CreatePinParams[v];
            }
            case 5: {
                return new CreatePinResult[v];
            }
            case 6: {
                return new EnterNameParams[v];
            }
            case 7: {
                return new EnterNameResult[v];
            }
            case 8: {
                return new PayMerchantParams[v];
            }
            case 9: {
                return new PaymentCategoryHeader[v];
            }
            case 10: {
                return new PaymentListParams[v];
            }
            case 11: {
                return new QrScanOrCardParams[v];
            }
            case 12: {
                return new RecoverPinParams[v];
            }
            case 13: {
                return new RecoverPinResult[v];
            }
            case 14: {
                return new ResetPinParams[v];
            }
            case 15: {
                return new ResetPinResult[v];
            }
            case 16: {
                return new SignupDeviceApprovalRequired[v];
            }
            case 17: {
                return new SignupLoginParams[v];
            }
            case 18: {
                return new SignupMagicLinkRequired[v];
            }
            case 19: {
                return new SignupNeedsName[v];
            }
            case 20: {
                return new SignupNeedsNameAndNewPin[v];
            }
            case 21: {
                return new SignupNeedsPinUpgradeWithQr[v];
            }
            case 22: {
                return new SignupSuccess[v];
            }
            case 23: {
                return new UpgradeToPinResult[v];
            }
            case 24: {
                return new VerifyPinParams[v];
            }
            default: {
                return new VerifyPinToken[v];
            }
        }
    }
}

