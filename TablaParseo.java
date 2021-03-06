
public class TablaParseo<T> {

    private T actualEstado;
    private T simbolo;
    private T operacion;
    private T nextEstado;

    public TablaParseo(T actualEstado, T simbolo, T operacion) {
        this.actualEstado = actualEstado;
        this.simbolo = simbolo;
        this.operacion = operacion;
    }

   
    
    public TablaParseo(T actualEstado, T simbolo, T operacion, T nextEstado) {
        this.actualEstado = actualEstado;
        this.simbolo = simbolo;
        this.operacion = operacion;
        this.nextEstado = nextEstado;
    }
    

    public T getActualEstado() {
        return actualEstado;
    }

    public void setActualEstado(T actualEstado) {
        this.actualEstado = actualEstado;
    }

    public T getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(T simbolo) {
        this.simbolo = simbolo;
    }

    public T getNextEstado() {
        return nextEstado;
    }

    public void setNextEstado(T nextEstado) {
        this.nextEstado = nextEstado;
    }

    public T getOperacion() {
        return operacion;
    }

    public void setOperacion(T operacion) {
        this.operacion = operacion;
    }

    @Override
    public String toString() {
        String returnString;
        returnString = "\t" + operacion + nextEstado;
        
        
        return returnString;
    }
     
    public String toString(int espacio) {
        String returnString ="";
        returnString += repeatString("\t",1);
        
        returnString += simbolo +": "+operacion + nextEstado;
      
        
        
        return returnString;
    }
    
    private String repeatString(String s,int count){
        StringBuilder r = new StringBuilder();
        for (int i = 0; i < count; i++) {
            r.append(s);
        }
        return r.toString();
    }
    
}
