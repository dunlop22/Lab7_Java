package Avto;

import java.util.Scanner;


public class Motor {
    String name;
    double rab_obem;
    double koni;
    double rasxod;
    double kol_vo_cilindr;
    double klapan;
    
    public void new_motor_info()
    {
        Scanner in = new Scanner(System.in);        //инициализация сканера
        
        System.out.println("Введите маркировку: ");
        do
        {
            if (in.hasNextLine()){
                this.name = in.nextLine();
            }
            else
            {
                System.out.println("Маркировка введена неверно, повторите попытку: ");    
                in.nextLine();
            }
        } while (this.name == "");
        
        System.out.println("Введите рабочий объем: ");
        do
        {
            if (in.hasNextDouble()){
                this.rab_obem = in.nextDouble();
            }
            else
            {
                System.out.println("Рабочий объем введен неверно, повторите попытку: ");    
                in.nextLine();
            }
        } while (this.rab_obem < 0);
        
        System.out.println("Введите количество лошадиных сил: ");
        do
        {
            if (in.hasNextDouble()){
                this.koni = in.nextDouble();
            }
            else
            {
                System.out.println("Количество лошадиных сил введено неверно, повторите попытку: ");    
                in.nextLine();
            }
        } while (this.koni < 0);
        
        System.out.println("Введите расход: ");
        do
        {
            if (in.hasNextDouble()){
                this.rasxod = in.nextDouble();
            }
            else
            {
                System.out.println("Расход введен неверно, повторите попытку: ");    
                in.nextLine();
            }
        } while (this.rasxod < 0);
        
        System.out.println("Введите количество цилиндров: ");
        do
        {
            if (in.hasNextDouble()){
                this.kol_vo_cilindr = in.nextDouble();
            }
            else
            {
                System.out.println("Количество цилиндров введено неверно, повторите попытку: ");    
                in.nextLine();
            }
        } while (this.kol_vo_cilindr < 0);
        
        System.out.println("Введите количество клапанов на 1 цилиндр: ");
        do
        {
            if (in.hasNextDouble()){
                this.klapan = in.nextDouble();
            }
            else
            {
                System.out.println("Количество клапанов введено неверно, повторите попытку: ");    
                in.nextLine();
            }
        } while (this.klapan < 0);
    }
    
    public void new_motor(String name, double koni, double klapan, double rasxod, double kol_vo_cilindr, double rab_obem)
    {
        this.name = name;
        this.klapan = klapan;
        this.kol_vo_cilindr = kol_vo_cilindr;
        this.koni = koni;
        this.rab_obem = rab_obem;
        this.rasxod = rasxod;
    }
    
    public void prosmotr_motor()
    {
        System.out.println("Маркировка: " + this.name); 
        System.out.println("Рабочий объем: " + this.rab_obem); 
        System.out.println("Количество клапанов: " + this.klapan); 
        System.out.println("Количество цилиндров: " + this.kol_vo_cilindr); 
        System.out.println("Расход: " + this.rasxod); 
        System.out.println("Количество лошадиных сил: " + this.koni); 
    }
    
    public Motor()
    {
        this.name = "";
        this.klapan = -1;
        this.kol_vo_cilindr = -1;
        this.koni = -1;
        this.rab_obem = -1;
        this.rasxod = -1;
    }
}
