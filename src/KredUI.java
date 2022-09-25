public class KredUI {
    public void KrediHesapla(BaseKrediManager baseKrediManager) {
       /* if (baseKrediManager instanceof OgretmenKrediManager) {
            String krediName = baseKrediManager.getClass().getSimpleName();
            String message = krediName.split("Manager")[0];
            System.out.println(message + " hesaplandı.");
        }*/

        String krediName = baseKrediManager.getClass().getSimpleName();
        String message = krediName.split("Manager")[0];
        System.out.println("\n" + message + "si hesaplandı.");

        baseKrediManager.hesapla();
    }
}
