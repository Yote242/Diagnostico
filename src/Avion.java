public  class Avion {
    String volar;
    String planear;
    String aterrizar;

    public Avion(){
        planear="";
        aterrizar="";
    }
    public Avion(String p, String a){
        planear=p;
        aterrizar=a;
    }
    public void recargar(){
        System.out.println("Esta recargando gasolina");
    }
    public String getVolar() {
        return volar;
    }

    public void setVolar(String volar) {
        this.volar = volar;
    }

    public String getPlanear() {
        return planear;
    }

    public void setPlanear(String planear) {
        this.planear = planear;
    }

    public String getAterrizar() {
        return aterrizar;
    }

    public void setAterrizar(String aterrizar) {
        this.aterrizar = aterrizar;
    }

}


