
package laboratorio2;


public class Operaciones {

    private float Numero1;
    private float Numero2;

    public Operaciones(float Numero1, float Numero2) {
        this.Numero1 = Numero1;
        this.Numero2 = Numero2;
    }
    
    /**
     * @return the Numero1
     */
    public float getNumero1() {
        return Numero1;
    }

    /**
     * @param Numero1 the Numero1 to set
     */
    public void setNumero1(float Numero1) {
        this.Numero1 = Numero1;
    }

    /**
     * @return the Numero2
     */
    public float getNumero2() {
        return Numero2;
    }

    /**
     * @param Numero2 the Numero2 to set
     */
    public void setNumero2(float Numero2) {
        this.Numero2 = Numero2;
    }
    public float Sumar(){
    return this.Numero1 + this.Numero2;}
    public float Restar(){
    return this.Numero1 - this.Numero2;}
    public float Multiplicar(){
    return this.Numero1 * this.Numero2;}
    public float Dividir(){
    return this.Numero1 / this.Numero2;}
}
