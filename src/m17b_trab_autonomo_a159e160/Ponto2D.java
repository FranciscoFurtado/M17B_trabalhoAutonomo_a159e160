package m17b_trab_autonomo_a159e160;
/**
 * Classe Ponto2D, para 
 * @version 2.0, 18.fev.2021
 * @author francisco furtado
 */
public class Ponto2D {
    /** atributo x, coordenada da abscissa */
    private int x;
    
    /** atributo y, coordenada da ordenada */
    private int y;
    
    /**
     * Construtor sem parâmetros, que inicializa os atributos
     * com valores predefinidos conhecidos.
     */
    public Ponto2D(){
        x = 0;
        y = 0;        
    }
    
    /**
    * Construtor da classe parametrizado com todos os atributos.
    * @param x coordenada da abscissa
    * @param y coordenada da ordenada
    */
    public Ponto2D(int x, int y){
        this.x = x;
        this.y = y;        
    }
    
    /**
     * 
     * @return o valor de x
     */
    public int getX() {
        return x;
    }
    
    /**
     * 
     * @param x muda o valor de x
     */
    public void setX(int x) {
        this.x = x;
    }
    
    /**
     * 
     * @return o valor de y
     */
    public int getY() {
        return y;
    }
    
    /**
     * 
     * @param y muda o valor de y
     */
    public void setY(int y) {
        this.y = y;
    }
    
    /**
     * Método que devolve o valor da distância
     * entre dois pontos.
     * @param a da classe Ponto2D
     * @return o valor da distância entre dois pontos
     */
    public double distancia(Ponto2D a){
        return Math.abs(Math.sqrt(Math.pow((x-a.x),2)+Math.pow((y-a.y),2)));
    }
    
    /**
     * 
     * @return um string composta pelos atributos da classe.
     */
    @Override
    public String toString() {
        return "Ponto2D{" + "x=" + x + ", y=" + y + '}';
    }
}
