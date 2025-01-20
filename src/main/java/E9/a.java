package e9;

import Nb.j;
import Y8.o;
import Y8.u1;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.type.ActionSource;
import com.sendwave.backend.type.AnnouncementFrequencyUnit.DAYS;
import com.sendwave.backend.type.AnnouncementFrequencyUnit.HOURS;
import com.sendwave.backend.type.AnnouncementFrequencyUnit.MINUTES;
import com.sendwave.backend.type.AnnouncementFrequencyUnit.UNKNOWN__;
import com.sendwave.backend.type.AnnouncementFrequencyUnit.WEEKS;
import com.sendwave.backend.type.AnnouncementFrequencyUnit;
import com.sendwave.backend.type.CallState.Answered;
import com.sendwave.backend.type.CallState.BeforeCall;
import com.sendwave.backend.type.CallState.CallEnded;
import com.sendwave.backend.type.CallState.NoCall;
import com.sendwave.backend.type.CallState.Reconnecting;
import com.sendwave.backend.type.CallState.Ringing;
import com.sendwave.backend.type.CallState.StartingCall;
import com.sendwave.backend.type.CallState;
import com.sendwave.backend.type.DeviceApprovalStatus.APPROVED;
import com.sendwave.backend.type.DeviceApprovalStatus.DISABLED;
import com.sendwave.backend.type.DeviceApprovalStatus.PENDING;
import com.sendwave.backend.type.DeviceApprovalStatus.REJECTED;
import com.sendwave.backend.type.DeviceApprovalStatus;
import com.sendwave.backend.type.HomescreenMenuButton.AIRTIME;
import com.sendwave.backend.type.HomescreenMenuButton.BILLS;
import com.sendwave.backend.type.HomescreenMenuButton.LEBALMA;
import com.sendwave.backend.type.HomescreenMenuButton.PAYMENTS;
import com.sendwave.backend.type.HomescreenMenuButton.REWARDS;
import com.sendwave.backend.type.HomescreenMenuButton.SEND;
import com.sendwave.backend.type.HomescreenMenuButton.SPI;
import com.sendwave.backend.type.HomescreenMenuButton.TRANSPORT;
import com.sendwave.backend.type.HomescreenMenuButton.VAULT;
import com.sendwave.backend.type.HomescreenMenuButton;
import com.sendwave.backend.type.IdPhotoStatus.ACCEPTED;
import com.sendwave.backend.type.IdPhotoStatus.CANCELLED;
import com.sendwave.backend.type.IdPhotoStatus.FAILED_TO_UPLOAD;
import com.sendwave.backend.type.IdPhotoStatus.NOT_FOR_REVIEW;
import com.sendwave.backend.type.IdPhotoStatus.REVIEWING;
import com.sendwave.backend.type.IdPhotoStatus.SOFT_REJECTED;
import com.sendwave.backend.type.IdPhotoStatus.UPLOADING;
import com.sendwave.backend.type.IdPhotoStatus;
import com.sendwave.backend.type.IdPhotoType.AGENT_COMMISSIONS_INVOICE_2020;
import com.sendwave.backend.type.IdPhotoType.AGENT_COMMISSIONS_INVOICE_2021;
import com.sendwave.backend.type.IdPhotoType.AGENT_OVERDRAFT_TERMS;
import com.sendwave.backend.type.IdPhotoType.AML_TRAINING_CERTIFICATE;
import com.sendwave.backend.type.IdPhotoType.BENEFICIAL_OWNER_DOCS;
import com.sendwave.backend.type.IdPhotoType.BENEFICIAL_OWNER_IDS;
import com.sendwave.backend.type.IdPhotoType.BIZ_ID;
import com.sendwave.backend.type.IdPhotoType.BIZ_REGISTRATION;
import com.sendwave.backend.type.IdPhotoType.CODE_OF_CONDUCT;
import com.sendwave.backend.type.IdPhotoType.CRIMINAL_RECORD;
import com.sendwave.backend.type.IdPhotoType.DELEGATION;
import com.sendwave.backend.type.IdPhotoType.DRIVERS_LICENSE;
import com.sendwave.backend.type.IdPhotoType.DRIVERS_LICENSE_BACK;
import com.sendwave.backend.type.IdPhotoType.ECOBANK_TERMINATION;
import com.sendwave.backend.type.IdPhotoType.FACE_PHOTO;
import com.sendwave.backend.type.IdPhotoType.GOV_AUTHORIZATION;
import com.sendwave.backend.type.IdPhotoType.GOV_ID;
import com.sendwave.backend.type.IdPhotoType.GOV_ID_BACK;
import com.sendwave.backend.type.IdPhotoType.POWER_OF_ATTORNEY;
import com.sendwave.backend.type.IdPhotoType.PREFUNDING_CONTRACT;
import com.sendwave.backend.type.IdPhotoType.PROFESSIONAL_LICENSE;
import com.sendwave.backend.type.IdPhotoType.PROOF_OF_ADDRESS;
import com.sendwave.backend.type.IdPhotoType.RESIDENCY_CERTIFICATE;
import com.sendwave.backend.type.IdPhotoType.TAXI_PERMIT;
import com.sendwave.backend.type.IdPhotoType.TAXI_PERMIT_BACK;
import com.sendwave.backend.type.IdPhotoType.TRAINING_CERTIFICATE;
import com.sendwave.backend.type.IdPhotoType.TRANSPORT_REGISTRATION;
import com.sendwave.backend.type.IdPhotoType.TRANSPORT_REGISTRATION_BACK;
import com.sendwave.backend.type.IdPhotoType.UBA_TERMINATION;
import com.sendwave.backend.type.IdPhotoType.WAVE_BUSINESS_CONTRACT;
import com.sendwave.backend.type.IdPhotoType.WAVE_BUSINESS_CONTRACT_ANNEX;
import com.sendwave.backend.type.IdPhotoType.WAVE_BUSINESS_CONTRACT_TERMINATION;
import com.sendwave.backend.type.IdPhotoType.WAVE_CONTRACT;
import com.sendwave.backend.type.IdPhotoType.WAVE_CONTRACT_BIA;
import com.sendwave.backend.type.IdPhotoType.WAVE_CONTRACT_CBC;
import com.sendwave.backend.type.IdPhotoType.WAVE_CONTRACT_ECOBANK;
import com.sendwave.backend.type.IdPhotoType.WAVE_CONTRACT_ORABANK;
import com.sendwave.backend.type.IdPhotoType.WAVE_CONTRACT_UBA;
import com.sendwave.backend.type.IdPhotoType.WAVE_SERVICES_AGREEMENT;
import com.sendwave.backend.type.IdPhotoType.WDF_CODE_OF_CONDUCT;
import com.sendwave.backend.type.IdPhotoType.WDF_WAVE_SERVICES_AGREEMENT;
import com.sendwave.backend.type.IdPhotoType;
import com.sendwave.backend.type.KycFineGrainTier.KYC0;
import com.sendwave.backend.type.KycFineGrainTier.KYC0Applied;
import com.sendwave.backend.type.KycFineGrainTier.KYC1;
import com.sendwave.backend.type.KycFineGrainTier.KYC1Applied;
import com.sendwave.backend.type.KycFineGrainTier.KYC2;
import com.sendwave.backend.type.KycFineGrainTier.KYC2SoftRejected;
import com.sendwave.backend.type.KycFineGrainTier;
import com.sendwave.backend.type.LinkedAccountFeature.TRANSFER_FROM_WALLET;
import com.sendwave.backend.type.LinkedAccountFeature.TRANSFER_TO_WALLET;
import com.sendwave.backend.type.LinkedAccountFeature.TRANSFER_TO_WALLET_TO_MERCHANT_PAYMENT;
import com.sendwave.backend.type.LinkedAccountFeature;
import com.sendwave.backend.type.LinkedAccountKind.BANK;
import com.sendwave.backend.type.LinkedAccountKind.CARD;
import com.sendwave.backend.type.LinkedAccountKind.MFI;
import com.sendwave.backend.type.LinkedAccountKind;
import com.sendwave.backend.type.LockUnlockState.LOCKED;
import com.sendwave.backend.type.LockUnlockState.UNLOCKED;
import com.sendwave.backend.type.LockUnlockState;
import com.sendwave.backend.type.PartnerOrg;
import com.sendwave.backend.type.PaymentCardState.ACTIVATION_FAILED;
import com.sendwave.backend.type.PaymentCardState.ACTIVATION_PENDING;
import com.sendwave.backend.type.PaymentCardState.ACTIVE;
import com.sendwave.backend.type.PaymentCardState.BLOCKED;
import com.sendwave.backend.type.PaymentCardState.CANCELED;
import com.sendwave.backend.type.PaymentCardState.PAUSED;
import com.sendwave.backend.type.PaymentCardState;
import com.sendwave.backend.type.ReceiptTemplateId.TICKET_TEMPLATE_ID;
import com.sendwave.backend.type.ReceiptTemplateId;
import com.sendwave.backend.type.ReceiptTemplateSlot;
import com.sendwave.backend.type.ScratchCardBackground.DEFAULT;
import com.sendwave.backend.type.ScratchCardBackground.HOLIDAY_EID_AL_FITR;
import com.sendwave.backend.type.ScratchCardBackground.HOLIDAY_NEW_YEARS;
import com.sendwave.backend.type.ScratchCardBackground.HOLIDAY_TABASKI;
import com.sendwave.backend.type.ScratchCardBackground.HOLIDAY_XMAS;
import com.sendwave.backend.type.ScratchCardBackground.REFERRAL;
import com.sendwave.backend.type.ScratchCardBackground.SPECIAL_BLUE;
import com.sendwave.backend.type.ScratchCardBackground.SPECIAL_GREY;
import com.sendwave.backend.type.ScratchCardBackground.SPECIAL_YELLOW;
import com.sendwave.backend.type.ScratchCardBackground;
import com.sendwave.backend.type.ScratchCardIcon.FUEL;
import com.sendwave.backend.type.ScratchCardIcon.GROCERY;
import com.sendwave.backend.type.ScratchCardIcon;
import com.sendwave.backend.type.SecurityQuestionFieldQuery.CALL_SUPPORT_FROM_VERIFIED_MOBILE;
import com.sendwave.backend.type.SecurityQuestionFieldQuery.CONFIRM_ID_PHOTO_MATCHES_CUSTOMER_FACE;
import com.sendwave.backend.type.SecurityQuestionFieldQuery.CURRENT_ATTEMPTED_TRANSACTION_DETAILS;
import com.sendwave.backend.type.SecurityQuestionFieldQuery.DATE_OF_BIRTH;
import com.sendwave.backend.type.SecurityQuestionFieldQuery.DOC_NUMBER_LAST_4;
import com.sendwave.backend.type.SecurityQuestionFieldQuery.FIRST_NAME;
import com.sendwave.backend.type.SecurityQuestionFieldQuery.LAST_ATX_LOCATION;
import com.sendwave.backend.type.SecurityQuestionFieldQuery.LAST_NAME;
import com.sendwave.backend.type.SecurityQuestionFieldQuery.LAST_P2P_SENT_DATE;
import com.sendwave.backend.type.SecurityQuestionFieldQuery.LAST_P2P_SENT_RECIPIENT_NAME;
import com.sendwave.backend.type.SecurityQuestionFieldQuery.MAGIC_LINK_SECRET;
import com.sendwave.backend.type.SecurityQuestionFieldQuery.USSD_CHALLENGE_CODE;
import com.sendwave.backend.type.SecurityQuestionFieldQuery;
import com.sendwave.backend.type.SecurityQuestionFormContent.AGENT_PHOTO_ID_CHECK_KYC1;
import com.sendwave.backend.type.SecurityQuestionFormContent.AGENT_PHOTO_ID_CHECK_KYC2;
import com.sendwave.backend.type.SecurityQuestionFormContent.KIOSK_PHOTO_ID_CHECK;
import com.sendwave.backend.type.SecurityQuestionFormContent.MAGIC_LINK;
import com.sendwave.backend.type.SecurityQuestionFormContent.SELF_SERVE_PIN_RECOVERY_VERIFICATION_EASIER_KYC2;
import com.sendwave.backend.type.SecurityQuestionFormContent.SELF_SERVE_PIN_RECOVERY_VERIFICATION_KYC1;
import com.sendwave.backend.type.SecurityQuestionFormContent.SELF_SERVE_PIN_RECOVERY_VERIFICATION_KYC2;
import com.sendwave.backend.type.SecurityQuestionFormContent.SUPPORT_IDENTITY_VERIFICATION;
import com.sendwave.backend.type.SecurityQuestionFormContent.USER_IDENTITY_VERIFICATION;
import com.sendwave.backend.type.SecurityQuestionFormContent.USER_USSD_VERIFICATION;
import com.sendwave.backend.type.SecurityQuestionFormContent;
import com.sendwave.backend.type.SecurityQuestionFormPurpose.AUTHORIZE_NEW_DEVICE;
import com.sendwave.backend.type.SecurityQuestionFormPurpose.PERSISTENT;
import com.sendwave.backend.type.SecurityQuestionFormPurpose.SELF_SERVE_PIN_RECOVERY;
import com.sendwave.backend.type.SecurityQuestionFormPurpose;
import com.sendwave.backend.type.SettlementFailureReason.AGENT_ABSENT;
import com.sendwave.backend.type.SettlementFailureReason.AGENT_REFUSED_TO_SETTLE;
import com.sendwave.backend.type.SettlementFailureReason.NONE;
import com.sendwave.backend.type.SettlementFailureReason.NOT_ENOUGH_LIQUDITY;
import com.sendwave.backend.type.SettlementFailureReason;
import com.sendwave.backend.type.SettlementPriority.P1;
import com.sendwave.backend.type.SettlementPriority.P2;
import com.sendwave.backend.type.SettlementPriority.P3;
import com.sendwave.backend.type.SettlementPriority;
import com.sendwave.backend.type.SettlementStatus.COMPLETED;
import com.sendwave.backend.type.SettlementStatus;
import com.sendwave.backend.type.a3;
import com.sendwave.backend.type.g;
import com.sendwave.backend.type.n2;
import d9.D3;
import d9.J1;
import d9.O0;
import d9.P;
import d9.R0;
import d9.v0;
import d9.v;

public final class a implements Adapter {
    public final int a;
    public static final a b;
    public static final a c;
    public static final a d;
    public static final a e;
    public static final a f;
    public static final a g;
    public static final a h;
    public static final a i;
    public static final a j;
    public static final a k;
    public static final a l;
    public static final a m;
    public static final a n;
    public static final a o;
    public static final a p;
    public static final a q;
    public static final a r;
    public static final a s;
    public static final a t;
    public static final a u;
    public static final a v;
    public static final a w;
    public static final a x;

    static {
        a.b = new a(0);
        a.c = new a(1);
        a.d = new a(3);
        a.e = new a(4);
        a.f = new a(5);
        a.g = new a(6);
        a.h = new a(8);
        a.i = new a(9);
        a.j = new a(10);
        a.k = new a(11);
        a.l = new a(13);
        a.m = new a(14);
        a.n = new a(16);
        a.o = new a(17);
        a.p = new a(19);
        a.q = new a(20);
        a.r = new a(21);
        a.s = new a(22);
        a.t = new a(23);
        a.u = new a(25);
        a.v = new a(26);
        a.w = new a(27);
        a.x = new a(28);
    }

    public a(int v) {
        this.a = v;
        super();
    }

    public static AnnouncementFrequencyUnit a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        String s = o.x(jsonReader0, "reader", customScalarAdapters0, "customScalarAdapters");
        AnnouncementFrequencyUnit.o.getClass();
        switch(s.hashCode()) {
            case 2091095: {
                if(s.equals("DAYS")) {
                    return DAYS.X;
                }
                break;
            }
            case 0x41BCEEF: {
                if(s.equals("HOURS")) {
                    return HOURS.X;
                }
                break;
            }
            case 0x4EA66DF: {
                if(s.equals("WEEKS")) {
                    return WEEKS.X;
                }
                break;
            }
            case 0x6A44A8BF: {
                if(s.equals("MINUTES")) {
                    return MINUTES.X;
                }
                break;
            }
            default: {
                return new UNKNOWN__(s);
            }
        }
        return new UNKNOWN__(s);
    }

    public static DeviceApprovalStatus b(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        String s = o.x(jsonReader0, "reader", customScalarAdapters0, "customScalarAdapters");
        DeviceApprovalStatus.r.getClass();
        switch(s.hashCode()) {
            case 0x21C1577: {
                if(s.equals("PENDING")) {
                    return PENDING.X;
                }
                break;
            }
            case 174130302: {
                if(s.equals("REJECTED")) {
                    return REJECTED.X;
                }
                break;
            }
            case 1053567612: {
                if(s.equals("DISABLED")) {
                    return DISABLED.X;
                }
                break;
            }
            case 0x754B56B7: {
                if(s.equals("APPROVED")) {
                    return APPROVED.X;
                }
                break;
            }
            default: {
                return new com.sendwave.backend.type.DeviceApprovalStatus.UNKNOWN__(s);
            }
        }
        return new com.sendwave.backend.type.DeviceApprovalStatus.UNKNOWN__(s);
    }

    public static IdPhotoType c(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        String s = o.x(jsonReader0, "reader", customScalarAdapters0, "customScalarAdapters");
        IdPhotoType.u.getClass();
        switch(s.hashCode()) {
            case 0x8931A279: {
                if(s.equals("UBA_TERMINATION")) {
                    return UBA_TERMINATION.X;
                }
                break;
            }
            case 0x8A177DB0: {
                if(s.equals("FACE_PHOTO")) {
                    return FACE_PHOTO.X;
                }
                break;
            }
            case 0x8FF1A7EC: {
                if(s.equals("POWER_OF_ATTORNEY")) {
                    return POWER_OF_ATTORNEY.X;
                }
                break;
            }
            case 0x98AE92BA: {
                if(s.equals("GOV_ID_BACK")) {
                    return GOV_ID_BACK.X;
                }
                break;
            }
            case 0x9BB1D729: {
                if(s.equals("WDF_WAVE_SERVICES_AGREEMENT")) {
                    return WDF_WAVE_SERVICES_AGREEMENT.X;
                }
                break;
            }
            case -1571470613: {
                if(s.equals("WAVE_BUSINESS_CONTRACT")) {
                    return WAVE_BUSINESS_CONTRACT.X;
                }
                break;
            }
            case -1559061720: {
                if(s.equals("WDF_CODE_OF_CONDUCT")) {
                    return WDF_CODE_OF_CONDUCT.X;
                }
                break;
            }
            case 0xA5F6F7B2: {
                if(s.equals("RESIDENCY_CERTIFICATE")) {
                    return RESIDENCY_CERTIFICATE.X;
                }
                break;
            }
            case -1504523940: {
                if(s.equals("TAXI_PERMIT")) {
                    return TAXI_PERMIT.X;
                }
                break;
            }
            case 0xAD37BBFB: {
                if(s.equals("BENEFICIAL_OWNER_IDS")) {
                    return BENEFICIAL_OWNER_IDS.X;
                }
                break;
            }
            case 0xB11A2609: {
                if(s.equals("PROFESSIONAL_LICENSE")) {
                    return PROFESSIONAL_LICENSE.X;
                }
                break;
            }
            case -1034073171: {
                if(s.equals("CRIMINAL_RECORD")) {
                    return CRIMINAL_RECORD.X;
                }
                break;
            }
            case -1009301426: {
                if(s.equals("CODE_OF_CONDUCT")) {
                    return CODE_OF_CONDUCT.X;
                }
                break;
            }
            case -867008295: {
                if(s.equals("DRIVERS_LICENSE_BACK")) {
                    return DRIVERS_LICENSE_BACK.X;
                }
                break;
            }
            case 0xD496AA2F: {
                if(s.equals("TRANSPORT_REGISTRATION")) {
                    return TRANSPORT_REGISTRATION.X;
                }
                break;
            }
            case 0xD67B96D1: {
                if(s.equals("AML_TRAINING_CERTIFICATE")) {
                    return AML_TRAINING_CERTIFICATE.X;
                }
                break;
            }
            case 0xEB679C85: {
                if(s.equals("BIZ_REGISTRATION")) {
                    return BIZ_REGISTRATION.X;
                }
                break;
            }
            case -323701358: {
                if(s.equals("TRAINING_CERTIFICATE")) {
                    return TRAINING_CERTIFICATE.X;
                }
                break;
            }
            case 0xF181EF98: {
                if(s.equals("WAVE_CONTRACT")) {
                    return WAVE_CONTRACT.X;
                }
                break;
            }
            case 0xF9A1FE4F: {
                if(s.equals("WAVE_SERVICES_AGREEMENT")) {
                    return WAVE_SERVICES_AGREEMENT.X;
                }
                break;
            }
            case -105011912: {
                if(s.equals("BENEFICIAL_OWNER_DOCS")) {
                    return BENEFICIAL_OWNER_DOCS.X;
                }
                break;
            }
            case 0x503550D: {
                if(s.equals("DRIVERS_LICENSE")) {
                    return DRIVERS_LICENSE.X;
                }
                break;
            }
            case 0x69110F7: {
                if(s.equals("TRANSPORT_REGISTRATION_BACK")) {
                    return TRANSPORT_REGISTRATION_BACK.X;
                }
                break;
            }
            case 0xBD51CB7: {
                if(s.equals("PREFUNDING_CONTRACT")) {
                    return PREFUNDING_CONTRACT.X;
                }
                break;
            }
            case 305096582: {
                if(s.equals("WAVE_CONTRACT_ECOBANK")) {
                    return WAVE_CONTRACT_ECOBANK.X;
                }
                break;
            }
            case 0x1D5A65EA: {
                if(s.equals("TAXI_PERMIT_BACK")) {
                    return TAXI_PERMIT_BACK.X;
                }
                break;
            }
            case 0x2805C67B: {
                if(s.equals("AGENT_OVERDRAFT_TERMS")) {
                    return AGENT_OVERDRAFT_TERMS.X;
                }
                break;
            }
            case 1006706771: {
                if(s.equals("WAVE_CONTRACT_ORABANK")) {
                    return WAVE_CONTRACT_ORABANK.X;
                }
                break;
            }
            case 0x48665D1F: {
                if(s.equals("AGENT_COMMISSIONS_INVOICE_2020")) {
                    return AGENT_COMMISSIONS_INVOICE_2020.X;
                }
                break;
            }
            case 0x48665D20: {
                if(s.equals("AGENT_COMMISSIONS_INVOICE_2021")) {
                    return AGENT_COMMISSIONS_INVOICE_2021.X;
                }
                break;
            }
            case 0x4F823767: {
                if(s.equals("PROOF_OF_ADDRESS")) {
                    return PROOF_OF_ADDRESS.X;
                }
                break;
            }
            case 1488078546: {
                if(s.equals("ECOBANK_TERMINATION")) {
                    return ECOBANK_TERMINATION.X;
                }
                break;
            }
            case 0x5F0923E0: {
                if(s.equals("WAVE_BUSINESS_CONTRACT_ANNEX")) {
                    return WAVE_BUSINESS_CONTRACT_ANNEX.X;
                }
                break;
            }
            case 1665893960: {
                if(s.equals("GOV_AUTHORIZATION")) {
                    return GOV_AUTHORIZATION.X;
                }
                break;
            }
            case 0x6DADF390: {
                if(s.equals("WAVE_BUSINESS_CONTRACT_TERMINATION")) {
                    return WAVE_BUSINESS_CONTRACT_TERMINATION.X;
                }
                break;
            }
            case 0x6FBE9928: {
                if(s.equals("DELEGATION")) {
                    return DELEGATION.X;
                }
                break;
            }
            case 0x74CEE3E7: {
                if(s.equals("BIZ_ID")) {
                    return BIZ_ID.X;
                }
                break;
            }
            case 2038207411: {
                if(s.equals("WAVE_CONTRACT_BIA")) {
                    return WAVE_CONTRACT_BIA.X;
                }
                break;
            }
            case 2038208157: {
                if(s.equals("WAVE_CONTRACT_CBC")) {
                    return WAVE_CONTRACT_CBC.X;
                }
                break;
            }
            case 2038225453: {
                if(s.equals("WAVE_CONTRACT_UBA")) {
                    return WAVE_CONTRACT_UBA.X;
                }
                break;
            }
            case 2108283532: {
                if(s.equals("GOV_ID")) {
                    return GOV_ID.X;
                }
                break;
            }
            default: {
                return new com.sendwave.backend.type.IdPhotoType.UNKNOWN__(s);
            }
        }
        return new com.sendwave.backend.type.IdPhotoType.UNKNOWN__(s);
    }

    public static KycFineGrainTier d(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        String s = o.x(jsonReader0, "reader", customScalarAdapters0, "customScalarAdapters");
        KycFineGrainTier.w.getClass();
        switch(s.hashCode()) {
            case 0x236E3B: {
                if(s.equals("KYC0")) {
                    return KYC0.X;
                }
                break;
            }
            case 2321980: {
                if(s.equals("KYC1")) {
                    return KYC1.X;
                }
                break;
            }
            case 0x236E3D: {
                if(s.equals("KYC2")) {
                    return KYC2.X;
                }
                break;
            }
            case 0x89AF1C2: {
                if(s.equals("KYC0Applied")) {
                    return KYC0Applied.X;
                }
                break;
            }
            case 0x707C1EA1: {
                if(s.equals("KYC1Applied")) {
                    return KYC1Applied.X;
                }
                break;
            }
            case 2000941477: {
                if(s.equals("KYC2SoftRejected")) {
                    return KYC2SoftRejected.X;
                }
                break;
            }
            default: {
                return new com.sendwave.backend.type.KycFineGrainTier.UNKNOWN__(s);
            }
        }
        return new com.sendwave.backend.type.KycFineGrainTier.UNKNOWN__(s);
    }

    public static LinkedAccountKind e(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        String s = o.x(jsonReader0, "reader", customScalarAdapters0, "customScalarAdapters");
        LinkedAccountKind.y.getClass();
        switch(s.hashCode()) {
            case 76240: {
                if(s.equals("MFI")) {
                    return MFI.X;
                }
                break;
            }
            case 0x1EFE3C: {
                if(s.equals("BANK")) {
                    return BANK.X;
                }
                break;
            }
            case 0x1F7310: {
                if(s.equals("CARD")) {
                    return CARD.X;
                }
                break;
            }
            default: {
                return new com.sendwave.backend.type.LinkedAccountKind.UNKNOWN__(s);
            }
        }
        return new com.sendwave.backend.type.LinkedAccountKind.UNKNOWN__(s);
    }

    public static PaymentCardState f(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        String s = o.x(jsonReader0, "reader", customScalarAdapters0, "customScalarAdapters");
        PaymentCardState.D.getClass();
        switch(s.hashCode()) {
            case -2063969402: {
                if(s.equals("ACTIVATION_FAILED")) {
                    return ACTIVATION_FAILED.X;
                }
                break;
            }
            case 0x8C3F8D2E: {
                if(s.equals("PAUSED")) {
                    return PAUSED.X;
                }
                break;
            }
            case 659453081: {
                if(s.equals("CANCELED")) {
                    return CANCELED.X;
                }
                break;
            }
            case 0x29846DCC: {
                if(s.equals("BLOCKED")) {
                    return BLOCKED.X;
                }
                break;
            }
            case 845460302: {
                if(s.equals("ACTIVATION_PENDING")) {
                    return ACTIVATION_PENDING.X;
                }
                break;
            }
            case 0x72C27306: {
                if(s.equals("ACTIVE")) {
                    return ACTIVE.X;
                }
                break;
            }
            default: {
                return new com.sendwave.backend.type.PaymentCardState.UNKNOWN__(s);
            }
        }
        return new com.sendwave.backend.type.PaymentCardState.UNKNOWN__(s);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        switch(this.a) {
            case 0: {
                String s = o.x(jsonReader0, "reader", customScalarAdapters0, "customScalarAdapters");
                ActionSource.m.getClass();
                return g.a(s);
            }
            case 1: {
                throw o.v(jsonReader0, "reader", customScalarAdapters0, "customScalarAdapters", "Input type used in output position");
            }
            case 2: {
                return a.a(jsonReader0, customScalarAdapters0);
            }
            case 3: {
                throw o.v(jsonReader0, "reader", customScalarAdapters0, "customScalarAdapters", "Input type used in output position");
            }
            case 4: {
                String s1 = o.x(jsonReader0, "reader", customScalarAdapters0, "customScalarAdapters");
                CallState.p.getClass();
                switch(s1.hashCode()) {
                    case -1957290017: {
                        if(s1.equals("NoCall")) {
                            return NoCall.X;
                        }
                        break;
                    }
                    case 0x95B2329D: {
                        if(s1.equals("BeforeCall")) {
                            return BeforeCall.X;
                        }
                        break;
                    }
                    case -1423288430: {
                        if(s1.equals("Ringing")) {
                            return Ringing.X;
                        }
                        break;
                    }
                    case 0xE613B8FD: {
                        if(s1.equals("Answered")) {
                            return Answered.X;
                        }
                        break;
                    }
                    case 0x6E5FD4B: {
                        if(s1.equals("Reconnecting")) {
                            return Reconnecting.X;
                        }
                        break;
                    }
                    case 0x127E02DE: {
                        if(s1.equals("StartingCall")) {
                            return StartingCall.X;
                        }
                        break;
                    }
                    case 933710556: {
                        if(s1.equals("CallEnded")) {
                            return CallEnded.X;
                        }
                        break;
                    }
                    default: {
                        return new com.sendwave.backend.type.CallState.UNKNOWN__(s1);
                    }
                }
                return new com.sendwave.backend.type.CallState.UNKNOWN__(s1);
            }
            case 5: {
                throw o.v(jsonReader0, "reader", customScalarAdapters0, "customScalarAdapters", "Input type used in output position");
            }
            case 6: {
                throw o.v(jsonReader0, "reader", customScalarAdapters0, "customScalarAdapters", "Input type used in output position");
            }
            case 7: {
                return a.b(jsonReader0, customScalarAdapters0);
            }
            case 8: {
                throw o.v(jsonReader0, "reader", customScalarAdapters0, "customScalarAdapters", "Input type used in output position");
            }
            case 9: {
                String s2 = o.x(jsonReader0, "reader", customScalarAdapters0, "customScalarAdapters");
                HomescreenMenuButton.s.getClass();
                switch(s2.hashCode()) {
                    case 0x810FFF2D: {
                        if(s2.equals("PAYMENTS")) {
                            return PAYMENTS.X;
                        }
                        break;
                    }
                    case 0xE4DB0709: {
                        if(s2.equals("TRANSPORT")) {
                            return TRANSPORT.X;
                        }
                        break;
                    }
                    case 0xEFB1A2F7: {
                        if(s2.equals("AIRTIME")) {
                            return AIRTIME.X;
                        }
                        break;
                    }
                    case 82316: {
                        if(s2.equals("SPI")) {
                            return SPI.X;
                        }
                        break;
                    }
                    case 0x1EFE3C: {
                        if(s2.equals("BANK")) {
                            return com.sendwave.backend.type.HomescreenMenuButton.BANK.X;
                        }
                        break;
                    }
                    case 0x1F7310: {
                        if(s2.equals("CARD")) {
                            return com.sendwave.backend.type.HomescreenMenuButton.CARD.X;
                        }
                        break;
                    }
                    case 0x26C788: {
                        if(s2.equals("SEND")) {
                            return SEND.X;
                        }
                        break;
                    }
                    case 63202604: {
                        if(s2.equals("BILLS")) {
                            return BILLS.X;
                        }
                        break;
                    }
                    case 0x4DABA12: {
                        if(s2.equals("VAULT")) {
                            return VAULT.X;
                        }
                        break;
                    }
                    case 0x2DD8BC68: {
                        if(s2.equals("LEBALMA")) {
                            return LEBALMA.X;
                        }
                        break;
                    }
                    case 0x6C662304: {
                        if(s2.equals("REWARDS")) {
                            return REWARDS.X;
                        }
                        break;
                    }
                    default: {
                        return new com.sendwave.backend.type.HomescreenMenuButton.UNKNOWN__(s2);
                    }
                }
                return new com.sendwave.backend.type.HomescreenMenuButton.UNKNOWN__(s2);
            }
            case 10: {
                String s3 = o.x(jsonReader0, "reader", customScalarAdapters0, "customScalarAdapters");
                IdPhotoStatus.t.getClass();
                switch(s3.hashCode()) {
                    case 0xA2B558F3: {
                        if(s3.equals("SOFT_REJECTED")) {
                            return SOFT_REJECTED.X;
                        }
                        break;
                    }
                    case 0xAEB48FA7: {
                        if(s3.equals("ACCEPTED")) {
                            return ACCEPTED.X;
                        }
                        break;
                    }
                    case 0xC2803931: {
                        if(s3.equals("CANCELLED")) {
                            return CANCELLED.X;
                        }
                        break;
                    }
                    case -1015328406: {
                        if(s3.equals("REVIEWING")) {
                            return REVIEWING.X;
                        }
                        break;
                    }
                    case 0xE8975EC3: {
                        if(s3.equals("FAILED_TO_UPLOAD")) {
                            return FAILED_TO_UPLOAD.X;
                        }
                        break;
                    }
                    case 0xEFF34E21: {
                        if(s3.equals("UPLOADING")) {
                            return UPLOADING.X;
                        }
                        break;
                    }
                    case 174130302: {
                        if(s3.equals("REJECTED")) {
                            return com.sendwave.backend.type.IdPhotoStatus.REJECTED.X;
                        }
                        break;
                    }
                    case 0x37D080BA: {
                        if(s3.equals("NOT_FOR_REVIEW")) {
                            return NOT_FOR_REVIEW.X;
                        }
                        break;
                    }
                    default: {
                        return new com.sendwave.backend.type.IdPhotoStatus.UNKNOWN__(s3);
                    }
                }
                return new com.sendwave.backend.type.IdPhotoStatus.UNKNOWN__(s3);
            }
            case 11: {
                return a.c(jsonReader0, customScalarAdapters0);
            }
            case 12: {
                return a.d(jsonReader0, customScalarAdapters0);
            }
            case 13: {
                String s4 = o.x(jsonReader0, "reader", customScalarAdapters0, "customScalarAdapters");
                LinkedAccountFeature.x.getClass();
                switch(s4.hashCode()) {
                    case -908492055: {
                        if(s4.equals("TRANSFER_TO_WALLET")) {
                            return TRANSFER_TO_WALLET.X;
                        }
                        break;
                    }
                    case 0xFBED955D: {
                        if(s4.equals("TRANSFER_TO_WALLET_TO_MERCHANT_PAYMENT")) {
                            return TRANSFER_TO_WALLET_TO_MERCHANT_PAYMENT.X;
                        }
                        break;
                    }
                    case 0x63F49FDA: {
                        if(s4.equals("TRANSFER_FROM_WALLET")) {
                            return TRANSFER_FROM_WALLET.X;
                        }
                        break;
                    }
                    default: {
                        return new com.sendwave.backend.type.LinkedAccountFeature.UNKNOWN__(s4);
                    }
                }
                return new com.sendwave.backend.type.LinkedAccountFeature.UNKNOWN__(s4);
            }
            case 14: {
                throw o.v(jsonReader0, "reader", customScalarAdapters0, "customScalarAdapters", "Input type used in output position");
            }
            case 15: {
                return a.e(jsonReader0, customScalarAdapters0);
            }
            case 16: {
                String s5 = o.x(jsonReader0, "reader", customScalarAdapters0, "customScalarAdapters");
                LockUnlockState.A.getClass();
                if(s5.equals("LOCKED")) {
                    return LOCKED.X;
                }
                return s5.equals("UNLOCKED") ? UNLOCKED.X : new com.sendwave.backend.type.LockUnlockState.UNKNOWN__(s5);
            }
            case 17: {
                String s6 = o.x(jsonReader0, "reader", customScalarAdapters0, "customScalarAdapters");
                PartnerOrg.B.getClass();
                return n2.a(s6);
            }
            case 18: {
                return a.f(jsonReader0, customScalarAdapters0);
            }
            case 19: {
                String s7 = o.x(jsonReader0, "reader", customScalarAdapters0, "customScalarAdapters");
                ReceiptTemplateId.E.getClass();
                return s7.equals("TICKET_TEMPLATE_ID") ? TICKET_TEMPLATE_ID.X : new com.sendwave.backend.type.ReceiptTemplateId.UNKNOWN__(s7);
            }
            case 20: {
                String s8 = o.x(jsonReader0, "reader", customScalarAdapters0, "customScalarAdapters");
                ReceiptTemplateSlot.F.getClass();
                return a3.a(s8);
            }
            case 21: {
                String s9 = o.x(jsonReader0, "reader", customScalarAdapters0, "customScalarAdapters");
                ScratchCardBackground.G.getClass();
                switch(s9.hashCode()) {
                    case -2032180703: {
                        if(s9.equals("DEFAULT")) {
                            return DEFAULT.X;
                        }
                        break;
                    }
                    case 0x8D63118E: {
                        if(s9.equals("HOLIDAY_XMAS")) {
                            return HOLIDAY_XMAS.X;
                        }
                        break;
                    }
                    case 0xE8C3C0F0: {
                        if(s9.equals("HOLIDAY_NEW_YEARS")) {
                            return HOLIDAY_NEW_YEARS.X;
                        }
                        break;
                    }
                    case 60058525: {
                        if(s9.equals("REFERRAL")) {
                            return REFERRAL.X;
                        }
                        break;
                    }
                    case 0x3100DADA: {
                        if(s9.equals("SPECIAL_YELLOW")) {
                            return SPECIAL_YELLOW.X;
                        }
                        break;
                    }
                    case 0x407A0C40: {
                        if(s9.equals("SPECIAL_BLUE")) {
                            return SPECIAL_BLUE.X;
                        }
                        break;
                    }
                    case 0x407C66C5: {
                        if(s9.equals("SPECIAL_GREY")) {
                            return SPECIAL_GREY.X;
                        }
                        break;
                    }
                    case 0x72DC136F: {
                        if(s9.equals("HOLIDAY_EID_AL_FITR")) {
                            return HOLIDAY_EID_AL_FITR.X;
                        }
                        break;
                    }
                    case 0x73ABF0FE: {
                        if(s9.equals("HOLIDAY_TABASKI")) {
                            return HOLIDAY_TABASKI.X;
                        }
                        break;
                    }
                    default: {
                        return new com.sendwave.backend.type.ScratchCardBackground.UNKNOWN__(s9);
                    }
                }
                return new com.sendwave.backend.type.ScratchCardBackground.UNKNOWN__(s9);
            }
            case 22: {
                String s10 = o.x(jsonReader0, "reader", customScalarAdapters0, "customScalarAdapters");
                ScratchCardIcon.H.getClass();
                switch(s10.hashCode()) {
                    case -2032180703: {
                        if(s10.equals("DEFAULT")) {
                            return com.sendwave.backend.type.ScratchCardIcon.DEFAULT.X;
                        }
                        break;
                    }
                    case 2169270: {
                        if(s10.equals("FUEL")) {
                            return FUEL.X;
                        }
                        break;
                    }
                    case 60058525: {
                        if(s10.equals("REFERRAL")) {
                            return com.sendwave.backend.type.ScratchCardIcon.REFERRAL.X;
                        }
                        break;
                    }
                    case 1010865389: {
                        if(s10.equals("GROCERY")) {
                            return GROCERY.X;
                        }
                        break;
                    }
                    default: {
                        return new com.sendwave.backend.type.ScratchCardIcon.UNKNOWN__(s10);
                    }
                }
                return new com.sendwave.backend.type.ScratchCardIcon.UNKNOWN__(s10);
            }
            case 23: {
                throw o.v(jsonReader0, "reader", customScalarAdapters0, "customScalarAdapters", "Input type used in output position");
            }
            case 24: {
                return a.g(jsonReader0, customScalarAdapters0);
            }
            case 25: {
                String s11 = o.x(jsonReader0, "reader", customScalarAdapters0, "customScalarAdapters");
                SecurityQuestionFormContent.K.getClass();
                switch(s11.hashCode()) {
                    case 0x91893B6C: {
                        if(s11.equals("SUPPORT_IDENTITY_VERIFICATION")) {
                            return SUPPORT_IDENTITY_VERIFICATION.X;
                        }
                        break;
                    }
                    case 0xA40F9196: {
                        if(s11.equals("SELF_SERVE_PIN_RECOVERY_VERIFICATION_EASIER_KYC2")) {
                            return SELF_SERVE_PIN_RECOVERY_VERIFICATION_EASIER_KYC2.X;
                        }
                        break;
                    }
                    case -1051304073: {
                        if(s11.equals("USER_USSD_VERIFICATION")) {
                            return USER_USSD_VERIFICATION.X;
                        }
                        break;
                    }
                    case 0xD9CFAD10: {
                        if(s11.equals("AGENT_PHOTO_ID_CHECK_KYC1")) {
                            return AGENT_PHOTO_ID_CHECK_KYC1.X;
                        }
                        break;
                    }
                    case 0xD9CFAD11: {
                        if(s11.equals("AGENT_PHOTO_ID_CHECK_KYC2")) {
                            return AGENT_PHOTO_ID_CHECK_KYC2.X;
                        }
                        break;
                    }
                    case 0xF266CD23: {
                        if(s11.equals("SELF_SERVE_PIN_RECOVERY_VERIFICATION_KYC1")) {
                            return SELF_SERVE_PIN_RECOVERY_VERIFICATION_KYC1.X;
                        }
                        break;
                    }
                    case 0xF266CD24: {
                        if(s11.equals("SELF_SERVE_PIN_RECOVERY_VERIFICATION_KYC2")) {
                            return SELF_SERVE_PIN_RECOVERY_VERIFICATION_KYC2.X;
                        }
                        break;
                    }
                    case 0x76DD688: {
                        if(s11.equals("USER_IDENTITY_VERIFICATION")) {
                            return USER_IDENTITY_VERIFICATION.X;
                        }
                        break;
                    }
                    case 0x5FA05687: {
                        if(s11.equals("KIOSK_PHOTO_ID_CHECK")) {
                            return KIOSK_PHOTO_ID_CHECK.X;
                        }
                        break;
                    }
                    case 2084872044: {
                        if(s11.equals("MAGIC_LINK")) {
                            return MAGIC_LINK.X;
                        }
                        break;
                    }
                    default: {
                        return new com.sendwave.backend.type.SecurityQuestionFormContent.UNKNOWN__(s11);
                    }
                }
                return new com.sendwave.backend.type.SecurityQuestionFormContent.UNKNOWN__(s11);
            }
            case 26: {
                String s12 = o.x(jsonReader0, "reader", customScalarAdapters0, "customScalarAdapters");
                SecurityQuestionFormPurpose.L.getClass();
                switch(s12.hashCode()) {
                    case 0xF6F682B: {
                        if(s12.equals("AUTHORIZE_NEW_DEVICE")) {
                            return AUTHORIZE_NEW_DEVICE.X;
                        }
                        break;
                    }
                    case 0x3B757A97: {
                        if(s12.equals("PERSISTENT")) {
                            return PERSISTENT.X;
                        }
                        break;
                    }
                    case 1383280194: {
                        if(s12.equals("SELF_SERVE_PIN_RECOVERY")) {
                            return SELF_SERVE_PIN_RECOVERY.X;
                        }
                        break;
                    }
                    default: {
                        return new com.sendwave.backend.type.SecurityQuestionFormPurpose.UNKNOWN__(s12);
                    }
                }
                return new com.sendwave.backend.type.SecurityQuestionFormPurpose.UNKNOWN__(s12);
            }
            case 27: {
                String s13 = o.x(jsonReader0, "reader", customScalarAdapters0, "customScalarAdapters");
                SettlementFailureReason.M.getClass();
                switch(s13.hashCode()) {
                    case 2402104: {
                        if(s13.equals("NONE")) {
                            return NONE.X;
                        }
                        break;
                    }
                    case 0x32EFE60E: {
                        if(s13.equals("NOT_ENOUGH_LIQUDITY")) {
                            return NOT_ENOUGH_LIQUDITY.X;
                        }
                        break;
                    }
                    case 0x42F479E6: {
                        if(s13.equals("AGENT_REFUSED_TO_SETTLE")) {
                            return AGENT_REFUSED_TO_SETTLE.X;
                        }
                        break;
                    }
                    case 0x6E346DD3: {
                        if(s13.equals("AGENT_ABSENT")) {
                            return AGENT_ABSENT.X;
                        }
                        break;
                    }
                    default: {
                        return new com.sendwave.backend.type.SettlementFailureReason.UNKNOWN__(s13);
                    }
                }
                return new com.sendwave.backend.type.SettlementFailureReason.UNKNOWN__(s13);
            }
            case 28: {
                String s14 = o.x(jsonReader0, "reader", customScalarAdapters0, "customScalarAdapters");
                SettlementPriority.N.getClass();
                switch(s14.hashCode()) {
                    case 0x9E1: {
                        if(s14.equals("P1")) {
                            return P1.X;
                        }
                        break;
                    }
                    case 2530: {
                        if(s14.equals("P2")) {
                            return P2.X;
                        }
                        break;
                    }
                    case 0x9E3: {
                        if(s14.equals("P3")) {
                            return P3.X;
                        }
                        break;
                    }
                    default: {
                        return new com.sendwave.backend.type.SettlementPriority.UNKNOWN__(s14);
                    }
                }
                return new com.sendwave.backend.type.SettlementPriority.UNKNOWN__(s14);
            }
            default: {
                return a.h(jsonReader0, customScalarAdapters0);
            }
        }
    }

    public static SecurityQuestionFieldQuery g(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        String s = o.x(jsonReader0, "reader", customScalarAdapters0, "customScalarAdapters");
        SecurityQuestionFieldQuery.J.getClass();
        switch(s.hashCode()) {
            case -1075088486: {
                if(s.equals("DOC_NUMBER_LAST_4")) {
                    return DOC_NUMBER_LAST_4.X;
                }
                break;
            }
            case 0xD017AEE3: {
                if(s.equals("MAGIC_LINK_SECRET")) {
                    return MAGIC_LINK_SECRET.X;
                }
                break;
            }
            case 0xE9AFCADE: {
                if(s.equals("LAST_P2P_SENT_RECIPIENT_NAME")) {
                    return LAST_P2P_SENT_RECIPIENT_NAME.X;
                }
                break;
            }
            case 0x4211E0: {
                if(s.equals("CONFIRM_ID_PHOTO_MATCHES_CUSTOMER_FACE")) {
                    return CONFIRM_ID_PHOTO_MATCHES_CUSTOMER_FACE.X;
                }
                break;
            }
            case 0x12D12139: {
                if(s.equals("USSD_CHALLENGE_CODE")) {
                    return USSD_CHALLENGE_CODE.X;
                }
                break;
            }
            case 353659610: {
                if(s.equals("FIRST_NAME")) {
                    return FIRST_NAME.X;
                }
                break;
            }
            case 0x1FD8CE94: {
                if(s.equals("LAST_NAME")) {
                    return LAST_NAME.X;
                }
                break;
            }
            case 0x2FA7B435: {
                if(s.equals("CALL_SUPPORT_FROM_VERIFIED_MOBILE")) {
                    return CALL_SUPPORT_FROM_VERIFIED_MOBILE.X;
                }
                break;
            }
            case 0x3275F9A8: {
                if(s.equals("DATE_OF_BIRTH")) {
                    return DATE_OF_BIRTH.X;
                }
                break;
            }
            case 0x34114488: {
                if(s.equals("CURRENT_ATTEMPTED_TRANSACTION_DETAILS")) {
                    return CURRENT_ATTEMPTED_TRANSACTION_DETAILS.X;
                }
                break;
            }
            case 1126048187: {
                if(s.equals("LAST_P2P_SENT_DATE")) {
                    return LAST_P2P_SENT_DATE.X;
                }
                break;
            }
            case 1740606264: {
                if(s.equals("LAST_ATX_LOCATION")) {
                    return LAST_ATX_LOCATION.X;
                }
                break;
            }
            default: {
                return new com.sendwave.backend.type.SecurityQuestionFieldQuery.UNKNOWN__(s);
            }
        }
        return new com.sendwave.backend.type.SecurityQuestionFieldQuery.UNKNOWN__(s);
    }

    public static SettlementStatus h(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        String s = o.x(jsonReader0, "reader", customScalarAdapters0, "customScalarAdapters");
        SettlementStatus.O.getClass();
        switch(s.hashCode()) {
            case 659453081: {
                if(s.equals("CANCELED")) {
                    return com.sendwave.backend.type.SettlementStatus.CANCELED.X;
                }
                break;
            }
            case 0x5279062B: {
                if(s.equals("COMPLETED")) {
                    return COMPLETED.X;
                }
                break;
            }
            case 0x72C27306: {
                if(s.equals("ACTIVE")) {
                    return com.sendwave.backend.type.SettlementStatus.ACTIVE.X;
                }
                break;
            }
            default: {
                return new com.sendwave.backend.type.SettlementStatus.UNKNOWN__(s);
            }
        }
        return new com.sendwave.backend.type.SettlementStatus.UNKNOWN__(s);
    }

    public static void i(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, PartnerOrg partnerOrg0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(partnerOrg0, "value");
        jsonWriter0.value(partnerOrg0.a());
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        switch(this.a) {
            case 0: {
                j.f(jsonWriter0, "writer");
                j.f(customScalarAdapters0, "customScalarAdapters");
                j.f(((ActionSource)object0), "value");
                jsonWriter0.value(((ActionSource)object0).a());
                return;
            }
            case 1: {
                j.f(jsonWriter0, "writer");
                j.f(customScalarAdapters0, "customScalarAdapters");
                j.f(((v)object0), "value");
                jsonWriter0.name("announcementId");
                Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((v)object0).a);
                jsonWriter0.name("type");
                j.f(((v)object0).b, "value");
                jsonWriter0.value(((v)object0).b.a());
                jsonWriter0.name("datetime");
                u1.a.b(jsonWriter0, customScalarAdapters0, ((v)object0).c);
                return;
            }
            case 2: {
                j.f(jsonWriter0, "writer");
                j.f(customScalarAdapters0, "customScalarAdapters");
                j.f(((AnnouncementFrequencyUnit)object0), "value");
                jsonWriter0.value(((AnnouncementFrequencyUnit)object0).a());
                return;
            }
            case 3: {
                j.f(jsonWriter0, "writer");
                j.f(customScalarAdapters0, "customScalarAdapters");
                j.f(((P)object0), "value");
                jsonWriter0.name("amount");
                j.f(((P)object0).a, "value");
                String s = ((P)object0).a.k();
                j.e(s, "toSerialized(...)");
                jsonWriter0.value(s);
                jsonWriter0.name("invoiceReference");
                Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((P)object0).b);
                return;
            }
            case 4: {
                j.f(jsonWriter0, "writer");
                j.f(customScalarAdapters0, "customScalarAdapters");
                j.f(((CallState)object0), "value");
                jsonWriter0.value(((CallState)object0).a());
                return;
            }
            case 5: {
                j.f(jsonWriter0, "writer");
                j.f(customScalarAdapters0, "customScalarAdapters");
                j.f(((v0)object0), "value");
                jsonWriter0.name("billTypeId");
                Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((v0)object0).a);
                jsonWriter0.name("name");
                Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((v0)object0).b);
                jsonWriter0.name("fields");
                Adapters.-list(Adapters.-nullable(Adapters.-obj$default(b.a, false, 1, null))).toJson(jsonWriter0, customScalarAdapters0, ((v0)object0).c);
                return;
            }
            case 6: {
                j.f(jsonWriter0, "writer");
                j.f(customScalarAdapters0, "customScalarAdapters");
                j.f(((O0)object0), "value");
                jsonWriter0.name("id");
                Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((O0)object0).a);
                return;
            }
            case 7: {
                j.f(jsonWriter0, "writer");
                j.f(customScalarAdapters0, "customScalarAdapters");
                j.f(((DeviceApprovalStatus)object0), "value");
                jsonWriter0.value(((DeviceApprovalStatus)object0).a());
                return;
            }
            case 8: {
                j.f(jsonWriter0, "writer");
                j.f(customScalarAdapters0, "customScalarAdapters");
                j.f(((R0)object0), "value");
                jsonWriter0.name("deviceId");
                Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((R0)object0).a);
                jsonWriter0.name("deviceName");
                Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((R0)object0).b);
                jsonWriter0.name("deviceModel");
                Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((R0)object0).c);
                return;
            }
            case 9: {
                j.f(jsonWriter0, "writer");
                j.f(customScalarAdapters0, "customScalarAdapters");
                j.f(((HomescreenMenuButton)object0), "value");
                jsonWriter0.value(((HomescreenMenuButton)object0).a());
                return;
            }
            case 10: {
                j.f(jsonWriter0, "writer");
                j.f(customScalarAdapters0, "customScalarAdapters");
                j.f(((IdPhotoStatus)object0), "value");
                jsonWriter0.value(((IdPhotoStatus)object0).a());
                return;
            }
            case 11: {
                j.f(jsonWriter0, "writer");
                j.f(customScalarAdapters0, "customScalarAdapters");
                j.f(((IdPhotoType)object0), "value");
                jsonWriter0.value(((IdPhotoType)object0).a());
                return;
            }
            case 12: {
                j.f(jsonWriter0, "writer");
                j.f(customScalarAdapters0, "customScalarAdapters");
                j.f(((KycFineGrainTier)object0), "value");
                jsonWriter0.value(((KycFineGrainTier)object0).a());
                return;
            }
            case 13: {
                j.f(jsonWriter0, "writer");
                j.f(customScalarAdapters0, "customScalarAdapters");
                j.f(((LinkedAccountFeature)object0), "value");
                jsonWriter0.value(((LinkedAccountFeature)object0).a());
                return;
            }
            case 14: {
                j.f(jsonWriter0, "writer");
                j.f(customScalarAdapters0, "customScalarAdapters");
                j.f(((J1)object0), "value");
                jsonWriter0.name("name");
                Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((J1)object0).a);
                jsonWriter0.name("value");
                Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((J1)object0).b);
                return;
            }
            case 15: {
                j.f(jsonWriter0, "writer");
                j.f(customScalarAdapters0, "customScalarAdapters");
                j.f(((LinkedAccountKind)object0), "value");
                jsonWriter0.value(((LinkedAccountKind)object0).a());
                return;
            }
            case 16: {
                j.f(jsonWriter0, "writer");
                j.f(customScalarAdapters0, "customScalarAdapters");
                j.f(((LockUnlockState)object0), "value");
                jsonWriter0.value(((LockUnlockState)object0).a());
                return;
            }
            case 17: {
                a.i(jsonWriter0, customScalarAdapters0, ((PartnerOrg)object0));
                return;
            }
            case 18: {
                j.f(jsonWriter0, "writer");
                j.f(customScalarAdapters0, "customScalarAdapters");
                j.f(((PaymentCardState)object0), "value");
                jsonWriter0.value(((PaymentCardState)object0).a());
                return;
            }
            case 19: {
                j.f(jsonWriter0, "writer");
                j.f(customScalarAdapters0, "customScalarAdapters");
                j.f(((ReceiptTemplateId)object0), "value");
                jsonWriter0.value(((ReceiptTemplateId)object0).a());
                return;
            }
            case 20: {
                j.f(jsonWriter0, "writer");
                j.f(customScalarAdapters0, "customScalarAdapters");
                j.f(((ReceiptTemplateSlot)object0), "value");
                jsonWriter0.value(((ReceiptTemplateSlot)object0).a());
                return;
            }
            case 21: {
                j.f(jsonWriter0, "writer");
                j.f(customScalarAdapters0, "customScalarAdapters");
                j.f(((ScratchCardBackground)object0), "value");
                jsonWriter0.value(((ScratchCardBackground)object0).a());
                return;
            }
            case 22: {
                j.f(jsonWriter0, "writer");
                j.f(customScalarAdapters0, "customScalarAdapters");
                j.f(((ScratchCardIcon)object0), "value");
                jsonWriter0.value(((ScratchCardIcon)object0).a());
                return;
            }
            case 23: {
                j.f(jsonWriter0, "writer");
                j.f(customScalarAdapters0, "customScalarAdapters");
                j.f(((D3)object0), "value");
                jsonWriter0.name("securityQuestionFieldId");
                Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((D3)object0).a);
                jsonWriter0.name("answer");
                Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((D3)object0).b);
                return;
            }
            case 24: {
                j.f(jsonWriter0, "writer");
                j.f(customScalarAdapters0, "customScalarAdapters");
                j.f(((SecurityQuestionFieldQuery)object0), "value");
                jsonWriter0.value(((SecurityQuestionFieldQuery)object0).a());
                return;
            }
            case 25: {
                j.f(jsonWriter0, "writer");
                j.f(customScalarAdapters0, "customScalarAdapters");
                j.f(((SecurityQuestionFormContent)object0), "value");
                jsonWriter0.value(((SecurityQuestionFormContent)object0).a());
                return;
            }
            case 26: {
                j.f(jsonWriter0, "writer");
                j.f(customScalarAdapters0, "customScalarAdapters");
                j.f(((SecurityQuestionFormPurpose)object0), "value");
                jsonWriter0.value(((SecurityQuestionFormPurpose)object0).a());
                return;
            }
            case 27: {
                j.f(jsonWriter0, "writer");
                j.f(customScalarAdapters0, "customScalarAdapters");
                j.f(((SettlementFailureReason)object0), "value");
                jsonWriter0.value(((SettlementFailureReason)object0).a());
                return;
            }
            case 28: {
                j.f(jsonWriter0, "writer");
                j.f(customScalarAdapters0, "customScalarAdapters");
                j.f(((SettlementPriority)object0), "value");
                jsonWriter0.value(((SettlementPriority)object0).a());
                return;
            }
            default: {
                j.f(jsonWriter0, "writer");
                j.f(customScalarAdapters0, "customScalarAdapters");
                j.f(((SettlementStatus)object0), "value");
                jsonWriter0.value(((SettlementStatus)object0).a());
            }
        }
    }
}

