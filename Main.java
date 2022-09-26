
public class Main {

	public static void main(String[] args) {
		   String mesaj = "Burada hava çok sıcak";
	        String yeniMesaj = mesaj.substring(7,11);
	        String yeniMesaj2 = sehirVer();
	        System.out.println(yeniMesaj);
	        System.out.println(yeniMesaj2);
	        int toplam = topla(7,5);
	        System.out.println(toplam);

	    }
	    public static void ekle(){
	        System.out.println("Müşteri eklendi.");
	    }
	    public static void sil(){
	        System.out.println("Müşteri silindi.");
	    }
	    public static void guncelle(){
	        System.out.println("Müşteri güncellendi.");
	    }
	    public static String sehirVer(){
	        return "Ordu";
	    }
	    public static int topla(int sayi1, int sayi2){
	        return sayi1+sayi2;
	    }
	

}
