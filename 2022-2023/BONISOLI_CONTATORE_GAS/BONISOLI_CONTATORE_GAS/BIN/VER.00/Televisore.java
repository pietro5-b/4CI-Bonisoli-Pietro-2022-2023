
/**
 * Aggiungi qui una descrizione della classe Televisore
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
public class Televisore extends TelevisoreTest
{
    private int pollici;
    private String schermo;
    private String colore;
    private int canale;
    private int volume;
    private int luminos;
    private boolean acceso;
    
    public Televisore(){
        this.pollici=0;
        this.schermo="anonimo";
        this.colore="anonimo";
        this.canale=0;
        this.volume=0;
        this.luminos=0;
        this.acceso=false;
    }
    
    public Televisore(int pollici, String schermo, String colore, int canale, int volume, int luminos, boolean acceso){
       
        if(pollici<0){
            this.pollici=0;
        }
        else{
            this.pollici=pollici;
        }
       
        if(schermo==null){
            this.schermo="anonimo";
        }
        else{
            this.schermo=schermo;
        }
       
        if(colore==null){
            this.colore="anonimo";
        }
        else{
            this.colore=colore;
        }
       
        if(canale<0){
            this.canale=0;
        }
        else{
            this.canale=canale;
        }
        if(volume<0){
            this.volume=0;
        }
        else{
            this.volume=volume;
        }
       
        if(luminos<0){
            this.luminos=0;
        }
        else{
            this.luminos=luminos;
        }
       
       
        this.acceso=acceso;
    }
    
     public String toString(){
        String out="";
        out+="Il televisore è di pollici: "+this.pollici+"\n";
        out+="Il televisore ha uno schermo di tipo: "+this.schermo+"\n";
        out+="Il televisore è di colore: "+this.colore+"\n";
        out+="Il televisore è sul canale: "+this.canale+"\n";
        out+="volume: "+this.volume+"\n";
        out+="luminosità: "+this.luminos+"\n";
        if(this.acceso){
            out+="Il televisore è acceso";
        }
        else{
            out+="Il televisore è spento";
        }
        return out;
    }
    
    
    
    public void setPollici(int pollici){
        if(pollici<0){
            this.pollici=0;
        }
        else{
            this.pollici=pollici;
        }
    }
    public int getPollici(){
        return this.pollici;
    }
   
   
   
    public void setSchermo(String schermo){
        if(schermo==null){
            this.schermo="anonimo";
        }
        else{
            this.schermo=schermo;
        }
    }
    public String getSchermo(){
        return this.schermo;
    }
   
   
    public void setColore(String colore){
        if(colore==null){
            this.colore="anonimo";
        }
        else{
            this.colore=colore;
        }
    }
    public String getColore(){
        return this.colore;
    }
   
   
    public void setCanale(int canale){
        if(canale<0){
            this.canale=0;
        }
        else{
            this.canale=canale;
        }
    }
    public int getCanale(){
        return this.canale;
    }
   
   
    public void setVolume(int volume){
        if(volume<0){
            this.volume=0;
        }
        else{
            this.volume=volume;
        }
    }
    public int getVolume(){
        return this.volume;
    }
   
   
    public void setLuminos(int luminos){
        if(luminos<0){
            this.luminos=0;
        }
        else{
            this.luminos=luminos;
        }
    }
    public int getLuminos(){
        return this.luminos;
    }
    
     public void accendi(){
        this.acceso=true;
    }
    public void spegni(){
        this.acceso=false;
    }
    public boolean getAcceso(){
        return acceso;
    }
    public void aumentaCanale(){
        this.canale++;
    }
    public void diminuisciCanale(){
        if(this.canale>1){
            this.canale--;
        }
    }
    public void aumentaVolume(){
        this.volume++;
    }
    public void diminuisciVolume(){
        if(this.volume>1){
            this.volume--;
        }
    }
    public void aumentaLuminos(){
        this.luminos++;
    }
    public void diminuisciLuminos(){
        if(this.luminos>1){
            this.luminos--;
        }
    }
}


    

