
public class calisan {
    private String ad;
    private String soyad;
    private int ID;
    
    public calisan(String ad, String soyad,int ID){
        this.ad=ad;
        this.soyad=soyad;
        this.ID=ID;
    }
    public void setad(String ad){
        this.ad=ad;
    }
    public String getad(){
        return ad;
    }
    public void setsoyad(String soyad){
        this.soyad=soyad;
    }
    public String getsoyad(){
        return soyad;
    }
    public void setID(int ID){
        this.ID=ID;
    }
    public int getID(){
        return ID;
    } 
    public void bilgilerigoster(){
        System.out.println("Calisan Bilgileri....");
        System.out.println("adı:"+ad);
        System.out.println("soyadı:"+soyad);
        System.out.println("ID'si:"+ID);
    }
}
