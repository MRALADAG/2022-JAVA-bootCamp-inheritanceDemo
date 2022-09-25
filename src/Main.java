public class Main {
    public static void main(String[] args) {
        OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
        BaseKrediManager tarimKrediManager = new TarimKrediManager();
//        ogretmenKrediManager.hesapla();

        KredUI kredUI = new KredUI();
        kredUI.KrediHesapla(ogretmenKrediManager);

        kredUI.KrediHesapla(tarimKrediManager);
    }
}
