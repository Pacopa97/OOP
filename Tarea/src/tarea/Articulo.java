package tarea;

/**
 *
 * @author franc
 */
public class Articulo {
    
    public int SKU;
    private int existencia;
    private double precio;
    private double costo;
    public String descripcion;
    
    public Articulo(int SKU,double costo,double precio,int existencia,String descripcion){
        this.SKU = SKU;
        this.costo = costo;
        this.precio= precio;
        this.existencia=existencia;
        this.descripcion=descripcion;   
    }
    
    public Articulo(){
     this(0,0.00,0.00,0,"Sin descripcion");   
    }
      public int getSKU() {
        return SKU;
    }
    
      public void setSKU(int SKU){
            this.SKU = SKU;
        }
      
      public int getExistencia() {
        return existencia;
    }
    
      public void setExistencia(int existencia){
            this.existencia = existencia;
        }
      public double setCosto(double costo) {
        return costo;
    }
    
      public void getCosto(){
            this.costo =costo;
        }
     
      public double getPrecio(){
          return precio;
      }
      
      public void setPrecio(double precio){
          this.precio = precio;
      }
    
      public String getDescripcion(){
          return descripcion;
      }
      
      public void setDescripcion(String description ){
         this.descripcion = descripcion;
      }
    
    public void compra(int e, double c){
        this.existencia = (e+existencia) ;
        this.setCosto(c); 
    }
    
    public boolean venta(int n){
        if(getExistencia()>=n){
            setExistencia(getExistencia()-n);
        return true;
        }else{
        return false; 
    }
    
    }

    
    public int verificarExistencia(){
        return existencia;
    }
    
    public void actualizaPrecio(double precio){
        this.precio=precio;
        
    }
}
