package Avto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Korobka {
    int kolvo_korobok;
    String tip_korobki;
    double kolvo_peredach;     
    List<Korobka> Korobka_Mass = new ArrayList<>();
    //private korobka[] Korobka_Mass = new korobka[1];
    
    public void Korobka_Mass(Korobka Kor1)
    {
        Korobka_Mass.add(Kor1);
	kolvo_korobok++;
    }
            
    public void new_korobka_info()
    {
        Scanner in = new Scanner(System.in);        //инициализация сканера
        
        System.out.println("Введите тип коробки передач: ");
        do
        {
            if (in.hasNextLine()){
                this.tip_korobki = in.nextLine();
            }
            else
            {
                System.out.println("Тип коробки передач введен неверно, повторите попытку: ");    
                in.nextLine();
            }
        } while (this.tip_korobki == "");
        
        
        System.out.println("Введите количество передач: ");
        do
        {
            if (in.hasNextDouble()){
                this.kolvo_peredach = in.nextDouble();
            }
            else
            {
                System.out.println("Количество передач введено неверно, повторите попытку: ");    
                in.nextLine();
            }
        } while (this.kolvo_peredach < 0);
    }
    
    public void prosmotr_korobka()
    {
        System.out.println("Тип коробки передач: " + this.tip_korobki);
        System.out.println("Количество передач: " + this.kolvo_peredach);
    }
    
    public void new_korobka(String tip_korobki, double kolvo_peredach)
    {
        this.kolvo_peredach = kolvo_peredach;
        this.tip_korobki = tip_korobki;
    }
       
    
    public Korobka()
    {
        this.kolvo_peredach = -1;
        this.tip_korobki = "";
    }
    
    
    public static void main(int args) {
    }
    
}
