import java.util.ArrayList;
import java.util.List;

public class KredUI {

    public void getTypeOfKredi(Object o) {
        String krediName = o.getClass().getSimpleName();
        String message = krediName.split("Manager")[0];
        System.out.println("\n" + message + "si hesaplandı.");
    }

    public BaseKrediManager generateKrediManager() {

        BaseKrediManager krediManager = null;

        int i = (int) ((Math.random() * (6 - 0)) + 0);

        switch (i) {
            case '0':
                krediManager = new OgretmenKrediManager();
                break;
            case '1':
                krediManager = new TarimKrediManager();
                break;
            case '2':
                krediManager = new EmniyetKrediManager();
                break;
            case '3':
                krediManager = new AskerKrediManager();
                break;
            case '4':
                krediManager = new EmlakKrediManager();
                break;
            case '5':
                krediManager = new KamuKrediManager();
                break;
        }
        return krediManager;
    }

    public void KrediHesapla(BaseKrediManager baseKrediManager) {
       /* String krediName = baseKrediManager.getClass().getSimpleName();
        String message = krediName.split("Manager")[0];
        System.out.println("\n" + message + "si hesaplandı.");*/
        getTypeOfKredi(baseKrediManager);

        baseKrediManager.hesapla();
    }

}
