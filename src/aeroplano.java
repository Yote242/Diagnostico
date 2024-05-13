public class aeroplano  extends Avion{

    public String acelera;
    public String avanza;

    public void volar(){
        System.out.println("Esta volando el aeroplano");
    }
    @Override
    public void recargar(){
        System.out.println("No recarga");
    }

}
