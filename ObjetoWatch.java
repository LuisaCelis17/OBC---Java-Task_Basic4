package TaskJava2;

public class ObjetoWatch {
    public static void main(String[] args){
        System.out.println("El smartwatch muestra las siguientes caracteristicas");
        SmartWatch smartWatch = new SmartWatch("Nublado", 4522, true, "11:54pm", "10 de Marzo 2023",
                "Duracion de 10 horas");
        smartWatch.imprimirDatos();
    }
}
