package TaskJava2;

    class SmartWatch extends SmartDevice{
        String bateria;

        public SmartWatch (String clima, int pasos, boolean llamadas, String hora, String fecha, String bateria){
            super(clima, pasos, llamadas, hora, fecha);
            this.bateria = bateria;
        }
        public void imprimirDatos(){
            System.out.println("Clima: "+getClima()+
                    "\nPasos dados: "+ getPasos()+
                    "\nRecibe llamadas: "+ isLlamadas()+
                    "\nLa hora es: "+ getHora()+
                    "\nLa fecha es: "+ getFecha()+
                    "\nDuracion de la bateria: " + bateria);
        }
    }

