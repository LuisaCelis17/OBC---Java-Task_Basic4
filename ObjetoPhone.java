package TaskJava2;

public class ObjetoPhone {
    public static void main(String[] args){
        System.out.println("El smartphone muestra las siguientes caracteristicas");
        SmartPhone smartPhone = new SmartPhone("nublado", 4522, true, "11:54pm", "Bandeja vacia", "10 de Marzo 2023", 25.36f);
                smartPhone.imprimirDatos();

    }
}
