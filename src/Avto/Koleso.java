
package Avto;
import java.util.Scanner;

public class Koleso {
    
    private double shirina;
    private double visota;
    private double diametr;
    private String tip_diska;
    private int id;
    
    private static int id_kolesa;
    private static int kolvo_koles;
    
    
    public void new_koleso_info()
    {
        Scanner in = new Scanner(System.in);        //инициализация сканера
        
        System.out.println("Введите ширину: ");
        do
        {
            if (in.hasNextDouble()){
                this.shirina = in.nextDouble();
            }
            else
            {
                System.out.println("Ширина введена неверно, повторите попытку: ");    
                in.nextLine();
            }
        } while (this.shirina < 0);
        
        System.out.println("Введите высоту: ");
        do
        {
            if (in.hasNextDouble()){
                this.visota = in.nextDouble();
            }
            else
            {
                System.out.println("Высота введена неверно, повторите попытку: ");    
                in.nextLine();
            }
        } while (this.visota < 0);
        
        System.out.println("Введите диаметр: ");
        do
        {
            if (in.hasNextDouble()){
                this.diametr = in.nextDouble();
            }
            else
            {
                System.out.println("Диаметр введен неверно, повторите попытку: ");    
                in.nextLine();
            }
        } while (this.diametr < 0);
        
        System.out.println("Введите тип диска: ");
        do
        {
            if (in.hasNextLine()){
                this.tip_diska = in.nextLine();
            }
            else
            {
                System.out.println("Тип диска введен неверно, повторите попытку: ");    
                in.nextLine();
            }
        } while (this.tip_diska == "");
        
    }
    
    
    
    public void new_koleso(double shirina, double diametr, double visota, String tip_diska)     //конструктор с параметрами
    {
        this.shirina = shirina;
        this.diametr = diametr;
        this.tip_diska = tip_diska;
        this.visota = visota;
    }
    
    public void prosmotr_koleso()       //функция просмотра информации о колесе
    {
        System.out.println("Ширина: " + this.shirina);
        System.out.println("Высота: " + this.visota);
        System.out.println("Диаметр: " + this.diametr);      
        System.out.println("Тип диска: " + this.tip_diska);
    }

    public Koleso()     //конструктор без параметров
    {
        this.diametr = -1.0;
        this.visota = -1;
        this.shirina = -1;
        this.tip_diska = "";
    }

 
    
}
