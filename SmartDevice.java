package TaskJava2;

/*En este ejercicio tendréis que crear una clase SmartDevice.
Dentro crearéis las clases hijas: SmartPhone y SmartWatch.
Agregaréis atributos tal cual tendrían esos objetos en la realidad.
Crear constructor vacío y con todos los parámetros para cada clase.
Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.*/
public class SmartDevice {
        String clima;
        int pasos;
        boolean llamadas = true;
        String hora;
        String fecha;

        public SmartDevice (String clima, int pasos, boolean llamadas, String hora, String fecha){
            this.clima = clima;
            this.pasos = pasos;
            this.llamadas = llamadas;
            this.hora = hora;
            this.fecha = fecha;
        }

    public String getClima() {
        return clima;
    }

    public int getPasos() {
        return pasos;
    }

    public String getHora() {
        return hora;
    }

    public boolean isLlamadas() {
        return llamadas;
    }

    public String getFecha() {
        return fecha;
    }
}
