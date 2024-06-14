package ma_quoc_gia;

import java.util.Locale;

public class XemMaQuocGia {
    public static void main(String[] args) {
        Locale[] availableLocales = Locale.getAvailableLocales();
        for(Locale l : availableLocales){
            System.out.println(l.getDisplayCountry()+" : "+l.getLanguage()+"_"+l.getCountry());
        }
    }
}
