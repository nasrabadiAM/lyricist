package cafe.adriel.lyricist

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.intl.Locale

public enum class LyricistLocale(
    public val tag: String,
    public val language: String
) {
    AF(tag = "af", language = "Afrikaans"),
    AF_ZA(tag = "af-ZA", language = "Afrikaans (South Africa)"),
    AR(tag = "ar", language = "Arabic"),
    AR_AE(tag = "ar-AE", language = "Arabic (U.A.E.)"),
    AR_BH(tag = "ar-BH", language = "Arabic (Bahrain)"),
    AR_DZ(tag = "ar-DZ", language = "Arabic (Algeria)"),
    AR_EG(tag = "ar-EG", language = "Arabic (Egypt)"),
    AR_IQ(tag = "ar-IQ", language = "Arabic (Iraq)"),
    AR_JO(tag = "ar-JO", language = "Arabic (Jordan)"),
    AR_KW(tag = "ar-KW", language = "Arabic (Kuwait)"),
    AR_LB(tag = "ar-LB", language = "Arabic (Lebanon)"),
    AR_LY(tag = "ar-LY", language = "Arabic (Libya)"),
    AR_MA(tag = "ar-MA", language = "Arabic (Morocco)"),
    AR_OM(tag = "ar-OM", language = "Arabic (Oman)"),
    AR_QA(tag = "ar-QA", language = "Arabic (Qatar)"),
    AR_SA(tag = "ar-SA", language = "Arabic (Saudi Arabia)"),
    AR_SY(tag = "ar-SY", language = "Arabic (Syria)"),
    AR_TN(tag = "ar-TN", language = "Arabic (Tunisia)"),
    AR_YE(tag = "ar-YE", language = "Arabic (Yemen)"),
    AZ(tag = "az", language = "Azeri (Latin)"),
    AZ_AZ(tag = "az-AZ", language = "Azeri (Latin) (Azerbaijan)"),
    AZ_CYRL_AZ(tag = "az-Cyrl-AZ", language = "Azeri (Cyrillic) (Azerbaijan)"),
    BE(tag = "be", language = "Belarusian"),
    BE_BY(tag = "be-BY", language = "Belarusian (Belarus)"),
    BG(tag = "bg", language = "Bulgarian"),
    BG_BG(tag = "bg-BG", language = "Bulgarian (Bulgaria)"),
    BS_BA(tag = "bs-BA", language = "Bosnian (Bosnia and Herzegovina)"),
    CA(tag = "ca", language = "Catalan"),
    CA_ES(tag = "ca-ES", language = "Catalan (Spain)"),
    CS(tag = "cs", language = "Czech"),
    CS_CZ(tag = "cs-CZ", language = "Czech (Czech Republic)"),
    CY(tag = "cy", language = "Welsh"),
    CY_GB(tag = "cy-GB", language = "Welsh (United Kingdom)"),
    DA(tag = "da", language = "Danish"),
    DA_DK(tag = "da-DK", language = "Danish (Denmark)"),
    DE(tag = "de", language = "German"),
    DE_AT(tag = "de-AT", language = "German (Austria)"),
    DE_CH(tag = "de-CH", language = "German (Switzerland)"),
    DE_DE(tag = "de-DE", language = "German (Germany)"),
    DE_LI(tag = "de-LI", language = "German (Liechtenstein)"),
    DE_LU(tag = "de-LU", language = "German (Luxembourg)"),
    DV(tag = "dv", language = "Divehi"),
    DV_MV(tag = "dv-MV", language = "Divehi (Maldives)"),
    EL(tag = "el", language = "Greek"),
    EL_GR(tag = "el-GR", language = "Greek (Greece)"),
    EN(tag = "en", language = "English"),
    EN_AU(tag = "en-AU", language = "English (Australia)"),
    EN_BZ(tag = "en-BZ", language = "English (Belize)"),
    EN_CA(tag = "en-CA", language = "English (Canada)"),
    EN_CB(tag = "en-CB", language = "English (Caribbean)"),
    EN_GB(tag = "en-GB", language = "English (United Kingdom)"),
    EN_IE(tag = "en-IE", language = "English (Ireland)"),
    EN_JM(tag = "en-JM", language = "English (Jamaica)"),
    EN_NZ(tag = "en-NZ", language = "English (New Zealand)"),
    EN_PH(tag = "en-PH", language = "English (Republic of the Philippines)"),
    EN_TT(tag = "en-TT", language = "English (Trinidad and Tobago)"),
    EN_US(tag = "en-US", language = "English (United States)"),
    EN_ZA(tag = "en-ZA", language = "English (South Africa)"),
    EN_ZW(tag = "en-ZW", language = "English (Zimbabwe)"),
    EO(tag = "eo", language = "Esperanto"),
    ES(tag = "es", language = "Spanish"),
    ES_AR(tag = "es-AR", language = "Spanish (Argentina)"),
    ES_BO(tag = "es-BO", language = "Spanish (Bolivia)"),
    ES_CL(tag = "es-CL", language = "Spanish (Chile)"),
    ES_CO(tag = "es-CO", language = "Spanish (Colombia)"),
    ES_CR(tag = "es-CR", language = "Spanish (Costa Rica)"),
    ES_DO(tag = "es-DO", language = "Spanish (Dominican Republic)"),
    ES_EC(tag = "es-EC", language = "Spanish (Ecuador)"),
    ES_ES(tag = "es-ES", language = "Spanish (Spain)"),
    ES_GT(tag = "es-GT", language = "Spanish (Guatemala)"),
    ES_HN(tag = "es-HN", language = "Spanish (Honduras)"),
    ES_MX(tag = "es-MX", language = "Spanish (Mexico)"),
    ES_NI(tag = "es-NI", language = "Spanish (Nicaragua)"),
    ES_PA(tag = "es-PA", language = "Spanish (Panama)"),
    ES_PE(tag = "es-PE", language = "Spanish (Peru)"),
    ES_PR(tag = "es-PR", language = "Spanish (Puerto Rico)"),
    ES_PY(tag = "es-PY", language = "Spanish (Paraguay)"),
    ES_SV(tag = "es-SV", language = "Spanish (El Salvador)"),
    ES_UY(tag = "es-UY", language = "Spanish (Uruguay)"),
    ES_VE(tag = "es-VE", language = "Spanish (Venezuela)"),
    ET(tag = "et", language = "Estonian"),
    ET_EE(tag = "et-EE", language = "Estonian (Estonia)"),
    EU(tag = "eu", language = "Basque"),
    EU_ES(tag = "eu-ES", language = "Basque (Spain)"),
    FA(tag = "fa", language = "Farsi"),
    FA_IR(tag = "fa-IR", language = "Farsi (Iran)"),
    FI(tag = "fi", language = "Finnish"),
    FI_FI(tag = "fi-FI", language = "Finnish (Finland)"),
    FO(tag = "fo", language = "Faroese"),
    FO_FO(tag = "fo-FO", language = "Faroese (Faroe Islands)"),
    FR(tag = "fr", language = "French"),
    FR_BE(tag = "fr-BE", language = "French (Belgium)"),
    FR_CA(tag = "fr-CA", language = "French (Canada)"),
    FR_CH(tag = "fr-CH", language = "French (Switzerland)"),
    FR_FR(tag = "fr-FR", language = "French (France)"),
    FR_LU(tag = "fr-LU", language = "French (Luxembourg)"),
    FR_MC(tag = "fr-MC", language = "French (Principality of Monaco)"),
    GL(tag = "gl", language = "Galician"),
    GL_ES(tag = "gl-ES", language = "Galician (Spain)"),
    GU(tag = "gu", language = "Gujarati"),
    GU_IN(tag = "gu-IN", language = "Gujarati (India)"),
    HE(tag = "he", language = "Hebrew"),
    HE_IL(tag = "he-IL", language = "Hebrew (Israel)"),
    HI(tag = "hi", language = "Hindi"),
    HI_IN(tag = "hi-IN", language = "Hindi (India)"),
    HR(tag = "hr", language = "Croatian"),
    HR_BA(tag = "hr-BA", language = "Croatian (Bosnia and Herzegovina)"),
    HR_HR(tag = "hr-HR", language = "Croatian (Croatia)"),
    HU(tag = "hu", language = "Hungarian"),
    HU_HU(tag = "hu-HU", language = "Hungarian (Hungary)"),
    HY(tag = "hy", language = "Armenian"),
    HY_AM(tag = "hy-AM", language = "Armenian (Armenia)"),
    ID(tag = "id", language = "Indonesian"),
    ID_ID(tag = "id-ID", language = "Indonesian (Indonesia)"),
    IS(tag = "is", language = "Icelandic"),
    IS_IS(tag = "is-IS", language = "Icelandic (Iceland)"),
    IT(tag = "it", language = "Italian"),
    IT_CH(tag = "it-CH", language = "Italian (Switzerland)"),
    IT_IT(tag = "it-IT", language = "Italian (Italy)"),
    JA(tag = "ja", language = "Japanese"),
    JA_JP(tag = "ja-JP", language = "Japanese (Japan)"),
    KA(tag = "ka", language = "Georgian"),
    KA_GE(tag = "ka-GE", language = "Georgian (Georgia)"),
    KK(tag = "kk", language = "Kazakh"),
    KK_KZ(tag = "kk-KZ", language = "Kazakh (Kazakhstan)"),
    KN(tag = "kn", language = "Kannada"),
    KN_IN(tag = "kn-IN", language = "Kannada (India)"),
    KO(tag = "ko", language = "Korean"),
    KO_KR(tag = "ko-KR", language = "Korean (Korea)"),
    KOK(tag = "kok", language = "Konkani"),
    KOK_IN(tag = "kok-IN", language = "Konkani (India)"),
    KY(tag = "ky", language = "Kyrgyz"),
    KY_KG(tag = "ky-KG", language = "Kyrgyz (Kyrgyzstan)"),
    LT(tag = "lt", language = "Lithuanian"),
    LT_LT(tag = "lt-LT", language = "Lithuanian (Lithuania)"),
    LV(tag = "lv", language = "Latvian"),
    LV_LV(tag = "lv-LV", language = "Latvian (Latvia)"),
    MI(tag = "mi", language = "Maori"),
    MI_NZ(tag = "mi-NZ", language = "Maori (New Zealand)"),
    MK(tag = "mk", language = "FYRO Macedonian"),
    MK_MK(tag = "mk-MK", language = "FYRO Macedonian (Former Yugoslav Republic of Macedonia)"),
    MN(tag = "mn", language = "Mongolian"),
    MN_MN(tag = "mn-MN", language = "Mongolian (Mongolia)"),
    MR(tag = "mr", language = "Marathi"),
    MR_IN(tag = "mr-IN", language = "Marathi (India)"),
    MS(tag = "ms", language = "Malay"),
    MS_BN(tag = "ms-BN", language = "Malay (Brunei Darussalam)"),
    MS_MY(tag = "ms-MY", language = "Malay (Malaysia)"),
    MT(tag = "mt", language = "Maltese"),
    MT_MT(tag = "mt-MT", language = "Maltese (Malta)"),
    NB(tag = "nb", language = "Norwegian (Bokm?l)"),
    NB_NO(tag = "nb-NO", language = "Norwegian (Bokm?l) (Norway)"),
    NL(tag = "nl", language = "Dutch"),
    NL_BE(tag = "nl-BE", language = "Dutch (Belgium)"),
    NL_NL(tag = "nl-NL", language = "Dutch (Netherlands)"),
    NN_NO(tag = "nn-NO", language = "Norwegian (Nynorsk) (Norway)"),
    NS(tag = "ns", language = "Northern Sotho"),
    NS_ZA(tag = "ns-ZA", language = "Northern Sotho (South Africa)"),
    PA(tag = "pa", language = "Punjabi"),
    PA_IN(tag = "pa-IN", language = "Punjabi (India)"),
    PL(tag = "pl", language = "Polish"),
    PL_PL(tag = "pl-PL", language = "Polish (Poland)"),
    PS(tag = "ps", language = "Pashto"),
    PS_AR(tag = "ps-AR", language = "Pashto (Afghanistan)"),
    PT(tag = "pt", language = "Portuguese"),
    PT_BR(tag = "pt-BR", language = "Portuguese (Brazil)"),
    PT_PT(tag = "pt-PT", language = "Portuguese (Portugal)"),
    QU(tag = "qu", language = "Quechua"),
    QU_BO(tag = "qu-BO", language = "Quechua (Bolivia)"),
    QU_EC(tag = "qu-EC", language = "Quechua (Ecuador)"),
    QU_PE(tag = "qu-PE", language = "Quechua (Peru)"),
    RO(tag = "ro", language = "Romanian"),
    RO_RO(tag = "ro-RO", language = "Romanian (Romania)"),
    RU(tag = "ru", language = "Russian"),
    RU_RU(tag = "ru-RU", language = "Russian (Russia)"),
    SA(tag = "sa", language = "Sanskrit"),
    SA_IN(tag = "sa-IN", language = "Sanskrit (India)"),
    SE(tag = "se", language = "Sami"),
    SE_FI(tag = "se-FI", language = "Sami (Finland)"),
    SE_NO(tag = "se-NO", language = "Sami (Norway)"),
    SE_SE(tag = "se-SE", language = "Sami (Sweden)"),
    SK(tag = "sk", language = "Slovak"),
    SK_SK(tag = "sk-SK", language = "Slovak (Slovakia)"),
    SL(tag = "sl", language = "Slovenian"),
    SL_SI(tag = "sl-SI", language = "Slovenian (Slovenia)"),
    SQ(tag = "sq", language = "Albanian"),
    SQ_AL(tag = "sq-AL", language = "Albanian (Albania)"),
    SR_BA(tag = "sr-BA", language = "Serbian (Latin) (Bosnia and Herzegovina)"),
    SR_CYRL_BA(tag = "sr-Cyrl-BA", language = "Serbian (Cyrillic) (Bosnia and Herzegovina)"),
    SR_SP(tag = "sr-SP", language = "Serbian (Latin) (Serbia and Montenegro)"),
    SR_CYRL_SP(tag = "sr-Cyrl-SP", language = "Serbian (Cyrillic) (Serbia and Montenegro)"),
    SV(tag = "sv", language = "Swedish"),
    SV_FI(tag = "sv-FI", language = "Swedish (Finland)"),
    SV_SE(tag = "sv-SE", language = "Swedish (Sweden)"),
    SW(tag = "sw", language = "Swahili"),
    SW_KE(tag = "sw-KE", language = "Swahili (Kenya)"),
    SYR(tag = "syr", language = "Syriac"),
    SYR_SY(tag = "syr-SY", language = "Syriac (Syria)"),
    TA(tag = "ta", language = "Tamil"),
    TA_IN(tag = "ta-IN", language = "Tamil (India)"),
    TE(tag = "te", language = "Telugu"),
    TE_IN(tag = "te-IN", language = "Telugu (India)"),
    TH(tag = "th", language = "Thai"),
    TH_TH(tag = "th-TH", language = "Thai (Thailand)"),
    TL(tag = "tl", language = "Tagalog"),
    TL_PH(tag = "tl-PH", language = "Tagalog (Philippines)"),
    TN(tag = "tn", language = "Tswana"),
    TN_ZA(tag = "tn-ZA", language = "Tswana (South Africa)"),
    TR(tag = "tr", language = "Turkish"),
    TR_TR(tag = "tr-TR", language = "Turkish (Turkey)"),
    TT(tag = "tt", language = "Tatar"),
    TT_RU(tag = "tt-RU", language = "Tatar (Russia)"),
    TS(tag = "ts", language = "Tsonga"),
    UK(tag = "uk", language = "Ukrainian"),
    UK_UA(tag = "uk-UA", language = "Ukrainian (Ukraine)"),
    UR(tag = "ur", language = "Urdu"),
    UR_PK(tag = "ur-PK", language = "Urdu (Islamic Republic of Pakistan)"),
    UZ(tag = "uz", language = "Uzbek (Latin)"),
    UZ_UZ(tag = "uz-UZ", language = "Uzbek (Latin) (Uzbekistan)"),
    UZ_CYRL_UZ(tag = "uz-Cyrl-UZ", language = "Uzbek (Cyrillic) (Uzbekistan)"),
    VI(tag = "vi", language = "Vietnamese"),
    VI_VN(tag = "vi-VN", language = "Vietnamese (Viet Nam)"),
    XH(tag = "xh", language = "Xhosa"),
    XH_ZA(tag = "xh-ZA", language = "Xhosa (South Africa)"),
    ZH(tag = "zh", language = "Chinese"),
    ZH_CN(tag = "zh-CN", language = "Chinese (S)"),
    ZH_HK(tag = "zh-HK", language = "Chinese (Hong Kong)"),
    ZH_MO(tag = "zh-MO", language = "Chinese (Macau)"),
    ZH_SG(tag = "zh-SG", language = "Chinese (Singapore)"),
    ZH_TW(tag = "zh-TW", language = "Chinese (T)"),
    ZU(tag = "zu", language = "Zulu"),
    ZU_ZA(tag = "zu-ZA", language = "Zulu (South Africa)");

    public val fallbackOrNull: LyricistLocale?
        get() = values().firstOrNull { locale -> locale.tag == tag.primaryTag }

    private val String.primaryTag: String
        get() = split(LANGUAGE_TAG_SEPARATOR)[0]

    public companion object {
        private const val LANGUAGE_TAG_SEPARATOR = '-'

        public val current: LyricistLocale
            @Composable
            get() = values().firstOrNull { it.tag == Locale.current.toLanguageTag() } ?: EN
    }
}
