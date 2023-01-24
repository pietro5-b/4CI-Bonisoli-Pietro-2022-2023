
public class BollettaCalculator
{
    private static final int VALORE_MAX=9999;
    private ContatoreGas gas;
    Scanner in = new Scanner(System.in);
    
    public BollettaCalculator(){
        gas = new ContatoreGas();
    }

    public void start(){
        this.descriviApp();
        this.prendiInput();
        this.visualizzaRisultati();
    }
    
    public void descriviApp(){
        System.out.println("Descrizione attività");
    }
    
    public void prendiInput(){
        System.out.println("Dimmi il costo del gas");
        gas.setWeight(in.nextDouble());
    }
    
    public void visualizzaRisultati(){
        gas.toString();
        System.out.println("Bolletta gas");
    }
}
