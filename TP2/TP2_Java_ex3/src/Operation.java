public class Operation {

    private Nombre nombre; // : un attribut priv ́e de type Nombre

    public Operation(Nombre nombre) {
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public void setNombre(Nombre nombre) {
        this.nombre = nombre;
    }

    public int division() throws OperationException{
        if(nombre.getVar2() == 0 ) throw  new OperationException();
        else return nombre.getVar1() / nombre.getVar2();
    }

    public int racineDeLaSomme() throws OperationException{
        if(! (nombre.getVar2() + nombre.getVar1() >= 0) ) throw  new OperationException(true);
        else return (int)Math.sqrt(nombre.getVar1() + nombre.getVar2());
    }
}
