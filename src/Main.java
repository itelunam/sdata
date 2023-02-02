import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    static List<Ambiente> listaAmbiente = new ArrayList<Ambiente>();
    static int getNumeroRandom(int min, int max){
        return ThreadLocalRandom.current().nextInt(min, max);
    }

    public static void cargaDatosListaAmbiente(){
        System.out.println("cargando datos...");
        int i = 1;
        int cantidadLista = getNumeroRandom(1,50);
        while(i <= cantidadLista){
            Ambiente ambiente = new Ambiente();
            ambiente.setCapacidad(getNumeroRandom(1,100));
            ambiente.setPiso(getNumeroRandom(1,10));
            ambiente.setNumAmbiente(i);
            listaAmbiente.add(ambiente);
            i++;
        }
        System.out.println("Finalizo carga de datos...");
        for(Ambiente a: listaAmbiente){
            a.showData();
        }
    }
    public static void main(String[] args) {
        cargaDatosListaAmbiente();
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while (!salir) {

            System.out.println("1. Cuantos ambientes existen con capac. mayor a X y piso P?");
            System.out.println("2. Cuantos ambientes en la ubicacion P existen?");
            System.out.println("3. Emitir un reporte de todo los ambientes que tiene la Facultad");
            System.out.println("4. Emitir un reporte de los primeros N ambientes que tenga una capacidad minima de X");
            System.out.println("5. Indicar si es posible añadir un ambiente mas a la Facultad");
            System.out.println("6. Permitir ingresar un nuevo ambiente mas");
            System.out.println("7. Realizar un reporte que indica la sauma de toda las capacidades por ubicación");
            System.out.println("8. Salir");

            try {

                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
                int X;
                int P;
                int conteo;
                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1 -  ingresa valor para X[1-100]");
                        X = sn.nextInt();
                        System.out.println("Has seleccionado la opcion 1 -  ingresa valor para P[1-10]");
                        P = sn.nextInt();
                        conteo = 0;
                        for(Ambiente a: listaAmbiente){
                            if(a.getCapacidad() > X && a.getPiso() == P){
                                a.showData();
                                conteo+=1;
                            }
                        }
                        System.out.println("RESP = Existen "+conteo+" ambientes, con capacidad mayor a "+ X + " ubicados en piso "+ P);
                        break;
                    case 2:
                            System.out.println("Has seleccionado la opcion 2 -  ingresa valor para P[1-10]");
                            P = sn.nextInt();
                            conteo = 0;
                            for(Ambiente a: listaAmbiente){
                                if(a.getPiso() == P){
                                    a.showData();
                                    conteo+=1;
                                }
                            }
                            System.out.println("RESP = Existen "+conteo+" ambientes ubicados en piso "+ P);
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion 3");
                        for(Ambiente a: listaAmbiente){
                            a.showData();
                        }
                        break;
                    case 4:
                            System.out.println("Has seleccionado la opcion 4 -  ingresa valor de los primeros N");
                            P = sn.nextInt();
                            System.out.println("Has seleccionado la opcion 4 -  ingresa valor de capacidad minima X");
                            X = sn.nextInt();
                            conteo = 0;
                            int y = 1;
                            for(Ambiente a: listaAmbiente){
                                if(a.getCapacidad() >= X ){
                                    a.showData();
                                    conteo+=1;
                                    y+=1;
                                }
                                if(y > P) break;
                            }
                        break;
                    case 5:
                            if(listaAmbiente.size() <50){
                                System.out.println("RESP=Es posible agregar un ambiente, porque solo se tiene "+listaAmbiente.size() + " ambientes");
                            }else{
                                System.out.println("RESP=NO es posible, maximo de ambientes completo");
                            }
                        break;
                    case 6:
                        System.out.println("Ingresa la capacidad X para el ambiente");
                        X = sn.nextInt();
                        System.out.println("Ingresa el piso P para el ambiente");
                        P = sn.nextInt();
                        Ambiente nuevo = new Ambiente();
                        nuevo.setCapacidad(X);
                        nuevo.setPiso(P);
                        nuevo.setNumAmbiente(listaAmbiente.size()+1);
                        if(listaAmbiente.size() <50){
                            listaAmbiente.add(nuevo);
                            System.out.println("Se agrego el nuevo ambiente...");
                        }else{
                            System.out.println("No es posible agregar el nuevo ambiente, maximo es 50");
                        }

                        break;
                    case 7:
                        int qP1=0, qP2=0, qP3=0, qP4=0, qP5=0, qP6=0, qP7=0, qP8=0, qP9=0, qP10=0;
                        for(Ambiente a: listaAmbiente){
                            if(a.getPiso()==1){
                                qP1=qP1+a.getCapacidad();
                            }
                            if(a.getPiso()==2){
                                qP2=qP2+a.getCapacidad();
                            }
                            if(a.getPiso()==3){
                                qP3=qP3+a.getCapacidad();
                            }
                            if(a.getPiso()==4){
                                qP4=qP4+a.getCapacidad();
                            }
                            if(a.getPiso()==5){
                                qP5=qP5+a.getCapacidad();
                            }
                            if(a.getPiso()==6){
                                qP6=qP6+a.getCapacidad();
                            }
                            if(a.getPiso()==7){
                                qP7=qP7+a.getCapacidad();
                            }
                            if(a.getPiso()==8){
                                qP8=qP8+a.getCapacidad();
                            }
                            if(a.getPiso()==9){
                                qP9=qP9+a.getCapacidad();
                            }
                            if(a.getPiso()==10){
                                qP10=qP10+a.getCapacidad();
                            }
                        }
                        System.out.println("Cantidad en ubicacion Piso 1:"+qP1);
                        System.out.println("Cantidad en ubicacion Piso 2:"+qP2);
                        System.out.println("Cantidad en ubicacion Piso 3:"+qP3);
                        System.out.println("Cantidad en ubicacion Piso 4:"+qP4);
                        System.out.println("Cantidad en ubicacion Piso 5:"+qP5);
                        System.out.println("Cantidad en ubicacion Piso 6:"+qP6);
                        System.out.println("Cantidad en ubicacion Piso 7:"+qP7);
                        System.out.println("Cantidad en ubicacion Piso 8:"+qP8);
                        System.out.println("Cantidad en ubicacion Piso 9:"+qP9);
                        System.out.println("Cantidad en ubicacion Piso 10:"+qP10);
                        break;
                    case 8:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 8");
                }
            } catch (Exception e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }

    }
}