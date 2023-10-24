
public class yazilimci extends calisan{
    private String diller;
    public yazilimci(String ad,String soyad,int ID,String diller){
        super(ad, ad, ID);
        this.diller=diller;
    }
    public void formatat(String isletimsistemi){
        System.out.println(getad()+" "+isletimsistemi+" yukluyor...");
    }
    public void bilgilerigoster(){
       /* System.out.println("ad: "+getad());
        System.out.println("soyad: "+getsoyad());
        System.out.println("ID: "+getID());*/
       super.bilgilerigoster();
        System.out.println("yazilimcinin bildiği diller:"+diller);
    }
    
}
