
import static java.time.InstantSource.system;
import java.util.Scanner;


public class Calisanlar_projesi {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("calisanlar programina hos geldiniz...");
        String islemler="ISLEMLER\n"+"1. yazilimci islemleri\n"+
                "2.yonetici islemleri\n"+"cikis icin q'ya basin...";
        System.out.println(islemler);
        
        while (true) { 
            System.out.print("islemi seciniz:");
            String islem=scanner.nextLine();
            if(islem.equals("q")){
                System.out.println("programdan cikiliyor...");
                break;
            }
            else if(islem.equals("1")){
                yazilimci yazilimci1=new yazilimci("sumeyye", "koyuncu", 2249, "c,c++,java");
                String yazilimci_islem="1.format at\n"+
                                       "2.bilgileri goster\n"+
                                       "cikis icin q'ya basin";
                while (true) {    
                    System.out.println("islemi seciniz:");
                    String y_islem=scanner.nextLine();
                    System.out.println(yazilimci_islem);
                    if(y_islem.equals("q")){
                    System.out.println("yazilimci islemlerinden cikiliyor...");
                    break;
                }
                    else if(y_islem.equals("1")){
                        System.out.println("format atilmasi istenen isletim sistemi:");
                        String isletim=scanner.nextLine();
                        yazilimci1.formatat(isletim);
                        
                    }
                    else if(y_islem.equals("2")){
                        yazilimci1.bilgilerigoster();
                        
                    }
                    else{
                        System.out.println("gecersiz islem...");
                    }
                    
                    
                }
                
                
            }
            else if(islem.equals("2")){
                yonetici yonetici1=new yonetici("ahmet", "yilmaz", 123, 12);
                String yonetici_islem="yönetici islemleri\n"+
                                      "1.zam yap\n"+
                                      "2. bilgileri göster\n"+
                                      "cikis icin q'ya basin";
                System.out.println(yonetici_islem);
                while (true) {
                    System.out.print("islem seciniz:");
                    String y_islem=scanner.nextLine();
                     if(y_islem.equals("q")){
                         System.out.println("yonetici islemlerinden cikiliyor...");
                         break;
                     }      
                     else if(y_islem.equals("1")){
                         System.out.println("ne kadar zam yapilmali?");
                         int zam=scanner.nextInt();
                         scanner.nextLine();
                         yonetici1.zamyap(zam);
                         
                     }
                     else if(y_islem.equals("2")){
                         yonetici1.bilgilerigoster();
                         
                     }
                     else{
                         System.out.println("gecersiz islem...");
                     }
                    
                }
                
                                      
                
            }
            else{
                System.out.println("gecersiz islem...");
            }
        }
       
        
    }
}
