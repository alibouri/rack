package t0;

import G0.f0;
import J2.w;
import U.l;
import U.p;
import android.graphics.BlendModeColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build.VERSION;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.unit.Density;
import java.util.List;
import n0.M;
import n0.n;

public abstract class a {
    public static final float[] a;
    public static final long[] b;

    static {
        a.a = new float[]{1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 10000000.0f, 100000000.0f, 1000000000.0f, 10000000000.0f};
        a.b = new long[]{-6499023860262858360L, -3512093806901185046L, 0x818995CE7AA0E1B2L, 0xA1EBFB4219491A1FL, 0xCA66FA129F9B60A6L, 0xFD00B897478238D0L, -7052510166537641086L, 0xC5A890362FDDBC62L, 0xF712B443BBD52B7BL, 0x9A6BB0AA55653B2DL, 0xC1069CD4EABE89F8L, -1060522901877412746L, 0x96CD2A865764DBCAL, 0xBC807527ED3E12BCL, -1468012460592228501L, 0x93445B8731587EA3L, -5182110000961642932L, 0xE61ACF033D1A45DFL, 0x8FD0C16206306BABL, 0xB3C4F1BA87BC8696L, 0xE0B62E2929ABA83CL, -8326631408344020699L, 0xAF8E5410288E1B6FL, -2634068034075909558L, 0x892731AC9FAF056EL, 0xAB70FE17C79AC6CAL, -3004677628754823043L, 0x85F0468293F0EB4EL, 0xA76C582338ED2621L, 0xD1476E2C07286FAAL, -9021654690802612790L, 0xA37FCE126597973CL, 0xCC5FC196FEFD7D0CL, 0xFF77B1FCBEBCDC4FL, 0x9FAACF3DF73609B1L, 0xC795830D75038C1DL, 0xF97AE3D0D2446F25L, -7211161980820077193L, 0xC2E801FB244576D5L, 0xF3A20279ED56D48AL, 0x9845418C345644D6L, 0xBE5691EF416BD60CL, -1302606358729274481L, 0x94B3A202EB1C3F39L, 0xB9E08A83A5E34F07L, 0xE858AD248F5C22C9L, 0x91376C36D99995BEL, 0xB58547448FFFFB2DL, 0xE2E69915B3FFF9F9L, 0x8DD01FAD907FFC3BL, 0xB1442798F49FFB4AL, 0xDD95317F31C7FA1DL, 0x8A7D3EEF7F1CFC52L, 0xAD1C8EAB5EE43B66L, 0xD863B256369D4A40L, -8701430062309552536L, 0xA90DE3535AAAE202L, -3219690930897053053L, 0x8412D9991ED58091L, 0xA5178FFF668AE0B6L, 0xCE5D73FF402D98E3L, 0x80FA687F881C7F8EL, 0xA139029F6A239F72L, -3925094576856201394L, 0xFBE9141915D7A922L, -7101705404292871755L, 0xC4CE17B399107C22L, 0xF6019DA07F549B2BL, 0x99C102844F94E0FBL, 0xC0314325637A1939L, 0xF03D93EEBC589F88L, -7627272076051127371L, -4922404076636521310L, 0xEA9C227723EE8BCBL, -7880853450996246689L, 0xB749FAED14125D36L, 0xE51C79A85916F484L, 0x8F31CC0937AE58D2L, 0xB2FE3F0B8599EF07L, 0xDFBDCECE67006AC9L, 0x8BD6A141006042BDL, -5851220927660403859L, 0xDA7F5BF590966848L, 0x888F99797A5E012DL, 0xAAB37FD7D8F58178L, 0xD5605FCDCF32E1D6L, 0x855C3BE0A17FCD26L, 0xA6B34AD8C9DFC06FL, 0xD0601D8EFC57B08BL, -9062348037703676329L, -6716249028702207507L, -3783625267450371480L, 0xFE5D54150B090B02L, 0x9EFA548D26E5A6E1L, 0xC6B8E9B0709F109AL, 0xF867241C8CC6D4C0L, 0x9B407691D7FC44F8L, 0xC21094364DFB5636L, 0xF294B943E17A2BC4L, 0x979CF3CA6CEC5B5AL, 0xBD8430BD08277231L, 0xECE53CEC4A314EBDL, 0x940F4613AE5ED136L, -5110715207949843068L, 0xE757DD7EC07426E5L, 0x9096EA6F3848984FL, 0xB4BCA50B065ABE63L, 0xE1EBCE4DC7F16DFBL, 0x8D3360F09CF6E4BDL, 0xB080392CC4349DECL, 0xDCA04777F541C567L, 0x89E42CAAF9491B60L, -6026599335303880135L, -2921563150702462265L, -8743505996830120772L, 0xA8530886B54DBDEBL, 0xD267CAA862A12D66L, 0x8380DEA93DA4BC60L, -6601971030643840136L, 0xCD795BE870516656L, 0x806BD9714632DFF6L, 0xA086CFCD97BF97F3L, 0xC8A883C0FDAF7DF0L, 0xFAD2A4B13D1B5D6CL, 0x9CC3A6EEC6311A63L, 0xC3F490AA77BD60FCL, 0xF4F1B4D515ACB93BL, 0x991711052D8BF3C5L, 0xBF5CD54678EEF0B6L, 0xEF340A98172AACE4L, 0x9580869F0E7AAC0EL, 0xBAE0A846D2195712L, 0xE998D258869FACD7L, 0x91FF83775423CC06L, 0xB67F6455292CBF08L, -2008819381370884406L, -8173041140997884610L, 0xB23867FB2A35B28DL, 0xDEC681F9F4C31F31L, 0x8B3C113C38F9F37EL, 0xAE0B158B4738705EL, -2770317479606055818L, 0x87F8A8D4CFA417C9L, 0xA9F6D30A038D1DBCL, 0xD47487CC8470652BL, 0x84C8D4DFD2C63F3BL, 0xA5FB0A17C777CF09L, 0xCF79CC9DB955C2CCL, 0x81AC1FE293D599BFL, 0xA21727DB38CB002FL, 0xCA9CF1D206FDC03BL, -196981603220770742L, -7040642529654063570L, 0xC5DD44271AD3CDBAL, 0xF7549530E188C128L, -7307973034592864071L, 0xC13A148E3032D6E7L, 0xF18899B1BC3F8CA1L, 0x96F5600F15A7B7E5L, -4849611457600313890L, 0xEBDF661791D60F56L, 0x936B9FCEBB25C995L, 0xB84687C269EF3BFBL, 0xE65829B3046B0AFAL, 0x8FF71A0FE2C2E6DCL, 0xB3F4E093DB73A093L, 0xE0F218B8D25088B8L, -8316090829371189901L, 0xAFBD2350644EEACFL, 0xDBAC6C247D62A583L, -8553528014785370254L, -6080224000054324913L, 0xD686619BA27255A2L, 0x8613FD0145877585L, -6370064314280619289L, 0xD17F3B51FCA3A7A0L, 0x82EF85133DE648C4L, 0xA3AB66580D5FDAF5L, -3704703351750405709L, 0xFFBBCFE994E5C61FL, 0x9FD561F1FD0F9BD3L, -4050219931171323192L, 0xF9BD690A1B68637BL, 0x9C1661A651213E2DL, 0xC31BFA0FE5698DB8L, 0xF3E2F893DEC3F126L, -7463067817500576073L, 0xBE89523386091465L, 0xEE2BA6C0678B597FL, 0x94DB483840B717EFL, 0xBA121A4650E4DDEBL, 0xE896A0D7E51E1566L, 0x915E2486EF32CD60L, 0xB5B5ADA8AAFF80B8L, 0xE3231912D5BF60E6L, 0x8DF5EFABC5979C8FL, -5660062011615247437L, 0xDDD0467C64BCE4A0L, 0x8AA22C0DBEF60EE4L, 0xAD4AB7112EB3929DL, -2838001322129590460L, 0x87625F056C7C4A8BL, 0xA93AF6C6C79B5D2DL, -3203831230369745799L, 0x843610CB4BF160CBL, 0xA54394FE1EEDB8FEL, -3561087000135522498L, -9143208402725783417L, 0xA163FF802A3426A8L, 0xC9BCFF6034C13052L, 0xFC2C3F3841F17C67L, -7089889006590693952L, 0xC5029163F384A931L, 0xF64335BCF065D37DL, 0x99EA0196163FA42EL, 0xC06481FB9BCF8D39L, 0xF07DA27A82C37088L, -7616003081050118571L, 0xBBE226EFB628AFEAL, 0xEADAB0ABA3B2DBE5L, 0x92C8AE6B464FC96FL, 0xB77ADA0617E3BBCBL, 0xE55990879DDCAABDL, 0x8F57FA54C2A9EAB6L, 0xB32DF8E9F3546564L, 0xDFF9772470297EBDL, 0x8BFBEA76C619EF36L, 0xAEFAE51477A06B03L, 0xDAB99E59958885C4L, 0x88B402F7FD75539BL, 0xAAE103B5FCD2A881L, 0xD59944A37C0752A2L, 0x857FCAE62D8493A5L, -6422206049907525490L, 0xD097AD07A71F26B2L, -9052573742614218705L, 0xA2F67F2DFA90563BL, 0xCBB41EF979346BCAL, 0xFEA126B7D78186BCL, 0x9F24B832E6B0F436L, 0xC6EDE63FA05D3143L, 0xF8A95FCF88747D94L, -7248020362820530564L, 0xC24452DA229B021BL, 0xF2D56790AB41C2A2L, 0x97C560BA6B0919A5L, 0xBDB6B8E905CB600FL, 0xED246723473E3813L, -7766808894105001205L, -5096825099203863602L, 0xE7958CB87392C2C2L, 0x90BD77F3483BB9B9L, 0xB4ECD5F01A4AA828L, 0xE2280B6C20DD5232L, 0x8D590723948A535FL, 0xB0AF48EC79ACE837L, -2532400508596379068L, 0x8A08F0F8BF0F156BL, 0xAC8B2D36EED2DAC5L, -2905392935903719049L, -8733399612580906262L, 0xA87FEA27A539E9A5L, 0xD29FE4B18E88640EL, 0x83A3EEEEF9153E89L, -6589634135808373205L, 0xCDB02555653131B6L, 0x808E17555F3EBF11L, 0xA0B19D2AB70E6ED6L, 0xC8DE047564D20A8BL, -354230130378896082L, 0x9CED737BB6C4183DL, 0xC428D05AA4751E4CL, 0xF53304714D9265DFL, 0x993FE2C6D07B7FABL, 0xBF8FDB78849A5F96L, 0xEF73D256A5C0F77CL, 0x95A8637627989AADL, -4966770740134231719L, -1596777406740401745L, 0x9226712162AB070DL, 0xB6B00D69BB55C8D1L, 0xE45C10C42A2B3B05L, -8162340590452013853L, 0xB267ED1940F1C61CL, 0xDF01E85F912E37A3L, -8403381297090862394L, -5892540602936190089L, 0xD9C7DCED53C72255L, 0x881CEA14545C7575L, -6186779746782440750L, 0xD4AD2DBFC3D07787L, 0x84EC3C97DA624AB4L, 0xA6274BBDD0FADD61L, -3480967307441105734L, 0x81CEB32C4B43FCF4L, 0xA2425FF75E14FC31L, -3831727700400522434L, 0xFD87B5F28300CA0DL, 0x9E74D1B791E07E48L, 0xC612062576589DDAL, -606147914885053103L, -7296371474444240046L, 0xC16D9A0095928A27L, 0xF1C90080BAF72CB1L, 0x971DA05074DA7BEEL, 0xBCE5086492111AEAL, 0xEC1E4A7DB69561A5L, -7812920107430224633L, 0xB877AA3236A4B449L, -1831394126398103205L, 0x901D7CF73AB0ACD9L, 0xB424DC35095CD80FL, 0xE12E13424BB40E13L, 0x8CBCCC096F5088CBL, 0xAFEBFF0BCB24AAFEL, -2601111570856684098L, 0x89705F4136B4A597L, 0xABCC77118461CEFCL, 0xD6BF94D5E57A42BCL, 0x8637BD05AF6C69B5L, 0xA7C5AC471B478423L, 0xD1B71758E219652BL, -9002011107970261189L, 0xA3D70A3D70A3D70AL, 0xCCCCCCCCCCCCCCCCL, 0x8000000000000000L, 0xA000000000000000L, 0xC800000000000000L, 0xFA00000000000000L, 0x9C40000000000000L, 0xC350000000000000L, 0xF424000000000000L, 0x9896800000000000L, 0xBEBC200000000000L, 0xEE6B280000000000L, 0x9502F90000000000L, 0xBA43B74000000000L, 0xE8D4A51000000000L, 0x9184E72A00000000L, 0xB5E620F480000000L, 0xE35FA931A0000000L, 0x8E1BC9BF04000000L, 0xB1A2BC2EC5000000L, 0xDE0B6B3A76400000L, 0x8AC7230489E80000L, 0xAD78EBC5AC620000L, 0xD8D726B7177A8000L, 0x878678326EAC9000L, 0xA968163F0A57B400L, 0xD3C21BCECCEDA100L, -8910000909647051616L, 0xA56FA5B99019A5C8L, 0xCECB8F27F4200F3AL, 0x813F3978F8940984L, 0xA18F07D736B90BE5L, 0xC9F2C9CD04674EDEL, 0xFC6F7C4045812296L, -7078060301547948643L, 0xC5371912364CE305L, 0xF684DF56C3E01BC6L, 0x9A130B963A6C115CL, 0xC097CE7BC90715B3L, 0xF0BDC21ABB48DB20L, 0x96769950B50D88F4L, 0xBC143FA4E250EB31L, 0xEB194F8E1AE525FDL, 0x92EFD1B8D0CF37BEL, 0xB7ABC627050305ADL, 0xE596B7B0C643C719L, 0x8F7E32CE7BEA5C6FL, 0xB35DBF821AE4F38BL, 0xE0352F62A19E306EL, -8349324486880600507L, 0xAF298D050E4395D6L, 0xDAF3F04651D47B4CL, 0x88D8762BF324CD0FL, 0xAB0E93B6EFEE0053L, 0xD5D238A4ABE98068L, 0x85A36366EB71F041L, 0xA70C3C40A64E6C51L, 0xD0CF4B50CFE20765L, 0x82818F1281ED449FL, 0xA321F2D7226895C7L, 0xCBEA6F8CEB02BB39L, 0xFEE50B7025C36A08L, -6967307053960650171L, 0xC722F0EF9D80AAD6L, -510123730351893109L, 0x9B934C3B330C8577L, 0xC2781F49FFCFA6D5L, 0xF316271C7FC3908AL, 0x97EDD871CFDA3A56L, -4762188758037509908L, 0xED63A231D4C4FB27L, 0x945E455F24FB1CF8L, -5082920523248573386L, 0xE7D34C64A9C85D44L, 0x90E40FBEEA1D3A4AL, 0xB51D13AEA4A488DDL, -2133482903713240300L, 0x8D7EB76070A08AECL, -5702008784649933400L, 0xDD15FE86AFFAD912L, 0x8A2DBF142DFCC7ABL, -6000713517987268202L, 0xD7E77A8F87DAF7FBL, 0x86F0AC99B4E8DAFDL, -6292417359137009220L, 0xD2D80DB02AABD62BL, 0x83C7088E1AAB65DBL, 0xA4B8CAB1A1563F52L, 0xCDE6FD5E09ABCF26L, 0x80B05E5AC60B6178L, 0xA0DC75F1778E39D6L, 0xC913936DD571C84CL, 0xFB5878494ACE3A5FL, 0x9D174B2DCEC0E47BL, 0xC45D1DF942711D9AL, 0xF5746577930D6500L, 0x9968BF6ABBE85F20L, 0xBFC2EF456AE276E8L, 0xEFB3AB16C59B14A2L, 0x95D04AEE3B80ECE5L, -4952730706374481889L, 0xEA1575143CF97226L, -7904546130479028392L, 0xB6E0C377CFA2E12EL, 0xE498F455C38B997AL, 0x8EDF98B59A373FECL, 0xB2977EE300C50FE7L, 0xDF3D5E9BC0F653E1L, 0x8B865B215899F46CL, 0xAE67F1E9AEC07187L, 0xDA01EE641A708DE9L, 0x884134FE908658B2L, -6174010410465235234L, 0xD4E5E2CDC1D1EA96L, 0x850FADC09923329EL, 0xA6539930BF6BFF45L, 0xCFE87F7CEF46FF16L, 0x81F14FAE158C5F6EL, 0xA26DA3999AEF7749L, 0xCB090C8001AB551CL, 0xFDCB4FA002162A63L, -7016870160886801794L, 0xC646D63501A1511DL, -587566084924005019L, 0x9AE757596946075FL, 0xC1A12D2FC3978937L, -1006140569036166268L, 0x9745EB4D50CE6332L, 0xBD176620A501FBFFL, 0xEC5D3FA8CE427AFFL, 0x93BA47C980E98CDFL, 0xB8A8D9BBE123F017L, 0xE6D3102AD96CEC1DL, -8051334308064652398L, 0xB454E4A179DD1877L, 0xE16A1DC9D8545E94L, 0x8CE2529E2734BB1DL, -5757034887131305500L, -2584607590486743971L, 0x899504AE72497EBAL, 0xABFA45DA0EDBDE69L, 0xD6F8D7509292D603L, 0x865B86925B9BC5C2L, 0xA7F26836F282B732L, 0xD1EF0244AF2364FFL, 0x8335616AED761F1FL, 0xA402B9C5A8D3A6E7L, 0xCD036837130890A1L, 0x802221226BE55A64L, 0xA02AA96B06DEB0FDL, -4020214983419339459L, 0xFA42A8B73ABBF48CL, -7176018221920323369L, 0xC38413CF25E2D70DL, 0xF46518C2EF5B8CD1L, 0x98BF2F79D5993802L, 0xBEEEFB584AFF8603L, 0xEEAABA2E5DBF6784L, 0x952AB45CFA97A0B2L, -5010991858575374113L, -1652053804791829737L, -7950062655635975442L, 0xB616A12B7FE617AAL, 0xE39C49765FDF9D94L, 0x8E41ADE9FBEBC27DL, -5633412264537705700L, 0xDE469FBD99A05FE3L, 0x8AEC23D680043BEEL, 0xADA72CCC20054AE9L, 0xD910F7FF28069DA4L, 0x87AA9AFF79042286L, 0xA99541BF57452B28L, 0xD3FA922F2D1675F2L, -8900067937773286985L, -6513398903789220827L, 0xCF02B2C21207EF2EL, 0x8161AFB94B44F57DL, -6793086681209228580L, 0xCA28A291859BBF93L, 0xFCB2CB35E702AF78L, 0x9DEFBF01B061ADABL, -4221088077005055722L, 0xF6C69A72A3989F5BL, 0x9A3C2087A63F6399L, 0xC0CB28A98FCF3C7FL, 0xF0FDF2D3F3C30B9FL, 0x969EB7C47859E743L, -4880101315621920492L, 0xEB57FF22FC0C7959L, 0x9316FF75DD87CBD8L, 0xB7DCBF5354E9BECEL, 0xE5D3EF282A242E81L, 0x8FA475791A569D10L, 0xB38D92D760EC4455L, 0xE070F78D3927556AL, -8338807543829064350L, 0xAF58416654A6BABBL, 0xDB2E51BFE9D0696AL, 0x88FCF317F22241E2L, 0xAB3C2FDDEEAAD25AL, 0xD60B3BD56A5586F1L, -8807064613298015146L, 0xA738C6BEBB12D16CL, 0xD106F86E69D785C7L, -9032994600651410532L, 0xA34D721642B06084L, -3737760522056206171L, 0xFF290242C83396CEL, 0x9F79A169BD203E41L, -4082502324048081455L, 0xF92E0C3537826145L, -7224680206786528053L, 0xC2ABF989935DDBFEL, 0xF356F7EBF83552FEL, 0x98165AF37B2153DEL, 0xBE1BF1B059E9A8D6L, 0xEDA2EE1C7064130CL, 0x9485D4D1C63E8BE7L, -5069001465015685407L, 0xE8111C87C5C1BA99L, 0x910AB1D4DB9914A0L, 0xB54D5E4A127F59C8L, 0xE2A0B5DC971F303AL, -8240336443785642460L, 0xB10D8E1456105DADL, 0xDD50F1996B947518L, 0x8A5296FFE33CC92FL, 0xACE73CBFDC0BFB7BL, 0xD8210BEFD30EFA5AL, 0x8714A775E3E95C78L, -6279758049420528746L, 0xD31045A8341CA07CL, 0x83EA2B892091E44DL, 0xA4E4B66B68B65D60L, 0xCE1DE40642E3F4B9L, 0x80D2AE83E9CE78F3L, 0xA1075A24E4421730L, 0xC94930AE1D529CFCL, -316522074587315140L, 0x9D412E0806E88AA5L, -4282508136895304370L, 0xF5B5D7EC8ACB58A2L, 0x9991A6F3D6BF1765L, 0xBFF610B0CC6EDD3FL, 0xEFF394DCFF8A948EL, 0x95F83D0A1FB69CD9L, 0xBB764C4CA7A4440FL, 0xEA53DF5FD18D5513L, -7893565929601608404L, 0xB7118682DBB66A77L, -1957403223540890347L, 0x8F05B1163BA6832DL, 0xB2C71D5BCA9023F8L, 0xDF78E4B2BD342CF6L, 0x8BAB8EEFB6409C1AL, 0xAE9672ABA3D0C320L, 0xDA3C0F568CC4F3E8L, 0x8865899617FB1871L, 0xAA7EEBFB9DF9DE8DL, 0xD51EA6FA85785631L, 0x8533285C936B35DEL, 0xA67FF273B8460356L, 0xD01FEF10A657842CL, 0x8213F56A67F6B29BL, 0xA298F2C501F45F42L, -3801267375510030573L, 0xFE0EFB53D30DD4D7L, -7004965403241175802L, -4144520735624081848L, -568964901102714406L, -7273132090830278360L, -4479729095110460046L, 0xF24A01A73CF2DCCFL, 0x976E41088617CA01L, -4807081008671376254L, 0xEC9C459D51852BA2L, 0x93E1AB8252F33B45L, 0xB8DA1662E7B00A17L, 0xE7109BFBA19C0C9DL, -8040506994060064798L, 0xB484F9DC9641E9DAL, 0xE1A63853BBD26451L, 0x8D07E33455637EB2L, 0xB049DC016ABC5E5FL, 0xDC5C5301C56B75F7L, -8522583040413455942L, 0xAC2820D9623BF429L, 0xD732290FBACAF133L, 0x867F59A9D4BED6C0L, 0xA81F301449EE8C70L, 0xD226FC195C6A2F8CL, 0x83585D8FD9C25DB7L, 0xA42E74F3D032F525L, 0xCD3A1230C43FB26FL, 0x80444B5E7AA7CF85L, -6893500068174642330L, -4005189066790915008L, 0xFA856334878FC150L, 0x9C935E00D4B9D8D2L, 0xC3B8358109E84F07L, 0xF4A642E14C6262C8L, 0x98E7E9CCCFBD7DBDL, 0xBF21E44003ACDD2CL, 0xEEEA5D5004981478L, 0x95527A5202DF0CCBL, 0xBAA718E68396CFFDL, 0xE950DF20247C83FDL, 0x91D28B7416CDD27EL, 0xB6472E511C81471DL, 0xE3D8F9E563A198E5L, 0x8E679C2F5E44FF8FL};
    }

    public static final void a(b b0, E e0) {
        int v = e0.h0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            G g0 = (G)e0.h0.get(v1);
            if(g0 instanceof I) {
                g g1 = new g();
                g1.d = ((I)g0).Y;
                g1.n = true;
                g1.c();
                g1.s.l(((I)g0).Z);
                g1.c();
                g1.c();
                g1.b = ((I)g0).b0;
                g1.c();
                g1.c = ((I)g0).c0;
                g1.c();
                g1.g = ((I)g0).d0;
                g1.c();
                g1.e = ((I)g0).e0;
                g1.c();
                g1.f = ((I)g0).f0;
                g1.o = true;
                g1.c();
                g1.h = ((I)g0).g0;
                g1.o = true;
                g1.c();
                g1.i = ((I)g0).h0;
                g1.o = true;
                g1.c();
                g1.j = ((I)g0).i0;
                g1.o = true;
                g1.c();
                g1.k = ((I)g0).j0;
                g1.p = true;
                g1.c();
                g1.l = ((I)g0).k0;
                g1.p = true;
                g1.c();
                g1.m = ((I)g0).l0;
                g1.p = true;
                g1.c();
                b0.e(v1, g1);
            }
            else if(g0 instanceof E) {
                b b1 = new b();
                b1.k = ((E)g0).X;
                b1.c();
                b1.l = ((E)g0).Y;
                b1.s = true;
                b1.c();
                b1.o = ((E)g0).c0;
                b1.s = true;
                b1.c();
                b1.p = ((E)g0).d0;
                b1.s = true;
                b1.c();
                b1.q = ((E)g0).e0;
                b1.s = true;
                b1.c();
                b1.r = ((E)g0).f0;
                b1.s = true;
                b1.c();
                b1.m = ((E)g0).Z;
                b1.s = true;
                b1.c();
                b1.n = ((E)g0).b0;
                b1.s = true;
                b1.c();
                b1.f = ((E)g0).g0;
                b1.g = true;
                b1.c();
                a.a(b1, ((E)g0));
                b0.e(v1, b1);
            }
        }
    }

    public static final void b(Path path0, double f, double f1, double f2, double f3, double f4, double f5, double f6, boolean z, boolean z1) {
        double f26;
        double f25;
        double f7 = f4;
        double f8 = f6 / 180.0 * 3.141593;
        double f9 = Math.cos(f8);
        double f10 = Math.sin(f8);
        double f11 = (f1 * f10 + f * f9) / f7;
        double f12 = (f1 * f9 + -f * f10) / f5;
        double f13 = (f3 * f10 + f2 * f9) / f7;
        double f14 = (f3 * f9 + -f2 * f10) / f5;
        double f15 = f11 - f13;
        double f16 = f12 - f14;
        double f17 = (f11 + f13) / 2.0;
        double f18 = (f12 + f14) / 2.0;
        double f19 = f16 * f16 + f15 * f15;
        if(f19 == 0.0) {
            return;
        }
        double f20 = 1.0 / f19 - 0.25;
        if(f20 < 0.0) {
            double f21 = (double)(((float)(Math.sqrt(f19) / 1.99999)));
            a.b(path0, f, f1, f2, f3, f7 * f21, f5 * f21, f6, z, z1);
            return;
        }
        double f22 = Math.sqrt(f20);
        double f23 = f15 * f22;
        double f24 = f22 * f16;
        if(z == z1) {
            f25 = f17 - f24;
            f26 = f18 + f23;
        }
        else {
            f25 = f17 + f24;
            f26 = f18 - f23;
        }
        double f27 = Math.atan2(f12 - f26, f11 - f25);
        double f28 = Math.atan2(f14 - f26, f13 - f25) - f27;
        int v = Double.compare(f28, 0.0);
        if(z1 != v >= 0) {
            f28 = v <= 0 ? f28 + 6.283185 : f28 - 6.283185;
        }
        double f29 = f25 * f7;
        double f30 = f26 * f5;
        int v1 = (int)Math.ceil(Math.abs(f28 * 4.0 / 3.141593));
        double f31 = Math.cos(f8);
        double f32 = Math.sin(f8);
        double f33 = Math.cos(f27);
        double f34 = Math.sin(f27);
        double f35 = -f7 * f31;
        double f36 = f5 * f32;
        double f37 = -f7 * f32;
        double f38 = f5 * f31;
        double f39 = f28 / ((double)v1);
        double f40 = f;
        double f41 = f27;
        double f42 = f35 * f34 - f36 * f33;
        int v2 = 0;
        double f43 = f33 * f38 + f34 * f37;
        double f44 = f1;
        while(v2 < v1) {
            double f45 = f41 + f39;
            double f46 = Math.sin(f45);
            double f47 = Math.cos(f45);
            double f48 = f7 * f31 * f47 + (f29 * f9 - f30 * f10) - f36 * f46;
            double f49 = f38 * f46 + (f7 * f32 * f47 + (f30 * f9 + f29 * f10));
            double f50 = f35 * f46 - f36 * f47;
            double f51 = f47 * f38 + f46 * f37;
            double f52 = f45 - f41;
            double f53 = Math.tan(f52 / 2.0);
            double f54 = (Math.sqrt(3.0 * f53 * f53 + 4.0) - 1.0) * Math.sin(f52) / 3.0;
            path0.b(((float)(f42 * f54 + f40)), ((float)(f43 * f54 + f44)), ((float)(f48 - f54 * f50)), ((float)(f49 - f54 * f51)), ((float)f48), ((float)f49));
            ++v2;
            f32 = f32;
            f31 = f31;
            f40 = f48;
            f44 = f49;
            v1 = v1;
            f41 = f45;
            f43 = f51;
            f42 = f50;
            f39 = f39;
            f7 = f4;
        }
    }

    public static final H c(e e0, p p0) {
        Object object1;
        Density density0 = (Density)p0.k(f0.f);
        boolean z = p0.e(((long)Float.floatToRawIntBits(density0.getDensity())) & 0xFFFFFFFFL | ((long)Float.floatToRawIntBits(e0.j)) << 0x20);
        Object object0 = p0.G();
        if(z || object0 == l.a) {
            b b0 = new b();
            a.a(b0, e0.f);
            long v = w.m(density0.w(e0.b), density0.w(e0.c));
            long v1 = w.m((Float.isNaN(e0.d) ? m0.e.d(v) : e0.d), (Float.isNaN(e0.e) ? m0.e.b(v) : e0.e));
            H h0 = new H(b0);
            long v2 = e0.g;
            if(v2 == 16L) {
                object1 = null;
            }
            else {
                int v3 = e0.h;
                BlendModeColorFilter blendModeColorFilter0 = Build.VERSION.SDK_INT >= 29 ? n0.p.a.a(v2, v3) : new PorterDuffColorFilter(M.G(v2), M.J(v3));
                object1 = new n(v2, v3, blendModeColorFilter0);
            }
            m0.e e1 = new m0.e(v);
            h0.d0.setValue(e1);
            h0.e0.setValue(Boolean.valueOf(e0.i));
            h0.f0.g.setValue(object1);
            m0.e e2 = new m0.e(v1);
            h0.f0.i.setValue(e2);
            h0.f0.c = e0.a;
            p0.a0(h0);
            object0 = h0;
        }
        return (H)object0;
    }

    public static final void d(List list0, Path path0) {
        A a3;
        float f17;
        float f16;
        float f14;
        float f13;
        float f12;
        float f11;
        float f10;
        float f9;
        float f8;
        float f7;
        float f6;
        int v4;
        int v3;
        A a2;
        List list1 = list0;
        Path path1 = path0;
        int v = path0.o();
        path0.rewind();
        path1.l(v);
        A a0 = list0.isEmpty() ? i.c : ((A)list1.get(0));
        int v1 = list0.size();
        int v2 = 0;
        float f = 0.0f;
        float f1 = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        while(v2 < v1) {
            A a1 = (A)list1.get(v2);
            if(a1 instanceof i) {
                path0.close();
                a2 = a1;
                v3 = v2;
                v4 = v1;
                f = f4;
                f2 = f;
                f1 = f5;
                f3 = f1;
            }
            else if(a1 instanceof u) {
                f2 += ((u)a1).c;
                f3 += ((u)a1).d;
                path1.g(((u)a1).c, ((u)a1).d);
                f4 = f2;
                f5 = f3;
                goto label_129;
            }
            else if(a1 instanceof m) {
                path1.a(((m)a1).c, ((m)a1).d);
                f3 = ((m)a1).d;
                f5 = f3;
                f2 = ((m)a1).c;
                f4 = f2;
                goto label_129;
            }
            else if(a1 instanceof t) {
                path1.k(((t)a1).c, ((t)a1).d);
                f2 += ((t)a1).c;
                f3 += ((t)a1).d;
                goto label_129;
            }
            else if(a1 instanceof t0.l) {
                path1.c(((t0.l)a1).c, ((t0.l)a1).d);
                f2 = ((t0.l)a1).c;
                f3 = ((t0.l)a1).d;
                goto label_129;
            }
            else if(a1 instanceof s) {
                path1.k(((s)a1).c, 0.0f);
                f2 += ((s)a1).c;
                goto label_129;
            }
            else if(a1 instanceof k) {
                path1.c(((k)a1).c, f3);
                f2 = ((k)a1).c;
                goto label_129;
            }
            else if(a1 instanceof y) {
                path1.k(0.0f, ((y)a1).c);
                f3 += ((y)a1).c;
                goto label_129;
            }
            else if(a1 instanceof z) {
                path1.c(f2, ((z)a1).c);
                f3 = ((z)a1).c;
                goto label_129;
            }
            else if(a1 instanceof r) {
                path0.h(((r)a1).c, ((r)a1).d, ((r)a1).e, ((r)a1).f, ((r)a1).g, ((r)a1).h);
                f6 = ((r)a1).e + f2;
                f7 = ((r)a1).f + f3;
                f2 += ((r)a1).g;
                f3 += ((r)a1).h;
                goto label_145;
            }
            else if(a1 instanceof j) {
                path0.b(((j)a1).c, ((j)a1).d, ((j)a1).e, ((j)a1).f, ((j)a1).g, ((j)a1).h);
                f6 = ((j)a1).e;
                f8 = ((j)a1).f;
                f9 = ((j)a1).g;
                f10 = ((j)a1).h;
                goto label_108;
            }
            else if(a1 instanceof t0.w) {
                if(a0.a) {
                    f11 = f3 - f1;
                    f12 = f2 - f;
                }
                else {
                    f12 = 0.0f;
                    f11 = 0.0f;
                }
                path0.h(f12, f11, ((t0.w)a1).c, ((t0.w)a1).d, ((t0.w)a1).e, ((t0.w)a1).f);
                f6 = ((t0.w)a1).c + f2;
                f7 = ((t0.w)a1).d + f3;
                f2 += ((t0.w)a1).e;
                f3 += ((t0.w)a1).f;
                goto label_145;
            }
            else if(a1 instanceof o) {
                if(a0.a) {
                    f13 = 2.0f * f3 - f1;
                    f14 = f2 * 2.0f - f;
                }
                else {
                    f14 = f2;
                    f13 = f3;
                }
                path0.b(f14, f13, ((o)a1).c, ((o)a1).d, ((o)a1).e, ((o)a1).f);
                f6 = ((o)a1).c;
                f8 = ((o)a1).d;
                f9 = ((o)a1).e;
                f10 = ((o)a1).f;
            label_108:
                f2 = f9;
                f3 = f10;
                a2 = a1;
                v3 = v2;
                v4 = v1;
                f1 = f8;
                goto label_149;
            }
            else if(a1 instanceof v) {
                path1.d(((v)a1).c, ((v)a1).d, ((v)a1).e, ((v)a1).f);
                float f15 = ((v)a1).c + f2;
                f1 = ((v)a1).d + f3;
                f2 += ((v)a1).e;
                f3 += ((v)a1).f;
                f = f15;
                goto label_129;
            }
            else if(a1 instanceof t0.n) {
                f1 = ((t0.n)a1).d;
                path1.n(((t0.n)a1).c, f1, ((t0.n)a1).e, ((t0.n)a1).f);
                f = ((t0.n)a1).c;
                f2 = ((t0.n)a1).e;
                f3 = ((t0.n)a1).f;
            label_129:
                a2 = a1;
                v3 = v2;
                v4 = v1;
            }
            else if(a1 instanceof x) {
                if(a0.b) {
                    f16 = f2 - f;
                    f17 = f3 - f1;
                }
                else {
                    f16 = 0.0f;
                    f17 = 0.0f;
                }
                path1.d(f16, f17, ((x)a1).c, ((x)a1).d);
                f6 = f16 + f2;
                f7 = f17 + f3;
                f2 += ((x)a1).c;
                f3 += ((x)a1).d;
            label_145:
                f1 = f7;
                a2 = a1;
                v3 = v2;
                v4 = v1;
            label_149:
                f = f6;
            }
            else if(a1 instanceof t0.p) {
                if(a0.b) {
                    f2 = f2 * 2.0f - f;
                    f3 = 2.0f * f3 - f1;
                }
                path1.n(f2, f3, ((t0.p)a1).c, ((t0.p)a1).d);
                f = f2;
                a2 = a1;
                v3 = v2;
                v4 = v1;
                f2 = ((t0.p)a1).c;
                float f18 = f3;
                f3 = ((t0.p)a1).d;
                f1 = f18;
            }
            else {
                if(a1 instanceof q) {
                    float f19 = ((q)a1).h + f2;
                    float f20 = ((q)a1).i + f3;
                    v3 = v2;
                    a3 = a1;
                    v4 = v1;
                    a.b(path0, ((double)f2), ((double)f3), ((double)f19), ((double)f20), ((double)((q)a1).c), ((double)((q)a1).d), ((double)((q)a1).e), ((q)a1).f, ((q)a1).g);
                    f = f19;
                    f2 = f;
                    f1 = f20;
                    f3 = f1;
                }
                else {
                    a3 = a1;
                    v3 = v2;
                    v4 = v1;
                    if(a3 instanceof h) {
                        a2 = a3;
                        a.b(path0, ((double)f2), ((double)f3), ((double)((h)a3).h), ((double)((h)a3).i), ((double)((h)a3).c), ((double)((h)a3).d), ((double)((h)a3).e), ((h)a3).f, ((h)a3).g);
                        f = ((h)a3).h;
                        f2 = f;
                        f1 = ((h)a3).i;
                        f3 = f1;
                        goto label_189;
                    }
                }
                a2 = a3;
            }
        label_189:
            v2 = v3 + 1;
            list1 = list0;
            path1 = path0;
            a0 = a2;
            v1 = v4;
        }
    }
}

