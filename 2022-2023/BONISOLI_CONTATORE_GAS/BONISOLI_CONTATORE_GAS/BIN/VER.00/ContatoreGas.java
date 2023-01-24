
public class ContatoreGas
{
    private double consumoPrecedente;
    private double consumoAttuale;
    private static final double prezzo = 1.02;


    public ContatoreGas()
    {
        this.consumoPrecedente = 0;
        this.consumoAttuale = 0;
        
    }
    
    public ContatoreGas(double precedente, double attuale)
    {
        
        setConsumoPrecedente(precedente);
        setConsumoAttuale(attuale);
    }

    
    public void setConsumoPrecedente(double precedente)
    {
        if(consumoPrecedente<0){
            this.consumoPrecedente=precedente;
        }else{
            this.consumoPrecedente=0;  
        }
    }
    
    public double getConsumoPrecedente(){
        return consumoPrecedente;
    }
    
    public void setConsumoAttuale(double attuale)
    {
        if(consumoAttuale<0){
            this.consumoAttuale=attuale;
        }else{
            this.consumoAttuale=0;  
        }
    }
    
    public double getConsumoAttuale(){
        return consumoAttuale;
    }
    
    public double rilevazionePrecedente(){
        return this.consumoPrecedente*prezzo;
    }
    
    public double rilevazioneAttaule(){
        return this.consumoAttuale*prezzo;
    }
    
    public String toString(){
        String out="consumo precedente: "+getConsumoPrecedente(); out+="\n consumo attuale: "+getConsumoAttuale();
        
        return out;
    }
}
