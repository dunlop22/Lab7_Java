package Avto;
public class Avto {
    Motor motorishe = new Motor();
    Obchee obchie = new Obchee();
    Koleso kolesiko = new Koleso();
    Korobka korobas = new Korobka();
    
    public void new_avto(Motor motorishe1, Obchee obchie1, Koleso kolesiko1, Korobka korobas1)
    {
        this.kolesiko = kolesiko1;
        this.korobas = korobas1;
        this.motorishe = motorishe1;
        this.obchie = obchie1;
        System.out.println("\nАвтомобиль успешно создан\n");
    }
    
    public void prosmotr_avto()
    {
        if (this.kolesiko.diametr >= 0 && this.korobas.kolvo_peredach >= 0 && this.motorishe.kol_vo_cilindr >= 0 && this.obchie.kolvo_mest >= 0)
        System.out.println("\n");
        this.kolesiko.prosmotr_koleso();
        System.out.println("\n");    
        this.korobas.prosmotr_korobka();
        System.out.println("\n");
        this.motorishe.prosmotr_motor();
        System.out.println("\n");
        this.obchie.prosmotr_obchee();
        System.out.println("\n");
    }
}
