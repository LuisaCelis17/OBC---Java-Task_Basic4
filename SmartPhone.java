package TaskJava2;
class SmartPhone extends SmartDevice{
    String mensajes;
    float usoDatos;

    public SmartPhone (String clima, int pasos, boolean llamadas, String hora, String mensajes, String fecha, float usoDatos){
        super(clima, pasos,llamadas, hora, fecha);
        this.mensajes = mensajes;
        this.usoDatos = usoDatos;
    }

    public void imprimirDatos(){
        System.out.println("Clima: "+getClima()+
                "\nPasos dados: "+ getPasos()+
                "\nRecibe llamadas: "+ isLlamadas()+
                "\nLa hora es: "+ getHora()+
                "\nLa fecha es: "+ getFecha() +
                "\nTiene mensajes sin abrir: " + mensajes +
                "\nUso de datos mensuales: "+ usoDatos);
    }
}
