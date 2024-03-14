import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ürünün fiyatı nedir;");
        double fiyat=input.nextDouble();

        if(fiyat>1000){
            System.out.println("Ürünün kdvsi bu kadar:"+fiyat*0.08);
            double yenifiyat=(fiyat*0.08+fiyat);
            System.out.println("Ürün 1000 tl den pahalıysa kdvli fiyatı="+yenifiyat);
        }else{
            System.out.println("Ürünün kdvsi bu kadar:"+fiyat*0.18);
            double yenifiyat2=(fiyat*0.18+fiyat);
            System.out.println("Üründen 1000 tl den daha düşükse kdvli fiyatı="+yenifiyat2);
        }


    }
}