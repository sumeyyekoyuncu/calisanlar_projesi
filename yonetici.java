
public class yonetici extends calisan {
    private int sorumlukisi;
    public yonetici(String ad,String soyad,int ID,int sorumlukisi){
        super(ad, soyad, ID);
        this.sorumlukisi=sorumlukisi;
    }
    public void bilgilerigoster(){
        super.bilgilerigoster();
        System.out.println("sorumlu oldugu kisi sayisi:"+sorumlukisi);
    }
    public void zamyap(int miktar){
        System.out.println(getad()+" calisanlara "+miktar+"tl zam yapti...");
    }
    
    
}
