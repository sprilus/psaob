package it.aob.psaob.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum SaErogatori implements EnumClass<String> {

    SC_Pronto_Soccorso_e_Medicina_Urgenza("PS200904GEN"),
    MEDICINA_URGENZA_PEDIATRICA_SSD("PS200904PED"),
    ANEST_TIPO_EX_CAR_T_I("0702"),
    CARDIOCHIRURGIA("0701"),
    CARDIOLOGIA("0801"),
    CARDIORIABILITAZIONE("5603"),
    CENTRO_DIABETOLOGICO("1901"),
    CHIRURGIA_GENERALE("0901"),
    CHIRURGIA_MAXILLO_FACCIALE("1001"),
    CHIRURGIA_PLASTICA("1201"),
    CHIRURGIA_URGENZA("0902"),
    CHIRURGIA_VASCOLARE_E_TORACICA("1401"),
    DIST_PERVASIVI_SVILUPPO("7502"),
    GASTROENTEROLOGIA("5801"),
    MEDICINA_GENERALE_1("2603"),
    MEDICINA_GENERALE_2("2602"),
    MEDICINA_NUCLEARE("6101"),
    NEFROLOGIA("4801"),
    NEONATOLOGIA("6201"),
    NEUROCHIRURGIA("3001"),
    NEUROLOGIA("3201"),
    NEURORIABILITAZIONE("7501"),
    NIDO("3101"),
    OCULISTICA("3401"),
    ORTOPEDIA_E_TRAUMATOLOGIA("3601"),
    OSTETRICIA_E_GINECOLOGIA("3701"),
    PEDIATRIA("3901"),
    RIANIMAZIONE("4901"),
    SENOLOGIA("0905"),
    STROKE_UNIT("3202"),
    UNITA_CORONARICA("5001"),
    UROLOGIA("4301");

    private String id;

    SaErogatori(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static SaErogatori fromId(String id) {
        for (SaErogatori at : SaErogatori.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}