import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
        BaseKrediManager tarimKrediManager = new TarimKrediManager();
//        ogretmenKrediManager.hesapla();

        KredUI kredUI = new KredUI();
        kredUI.KrediHesapla(ogretmenKrediManager);

        kredUI.KrediHesapla(tarimKrediManager);

       /* List<BaseKrediManager> credits = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            credits.add(kredUI.generateKrediManager());
        }

        System.out.println("Bütün krediler : \n");

        for (BaseKrediManager kredi : credits) {
            kredUI.KrediHesapla(kredi);
        }*/

    }
}
