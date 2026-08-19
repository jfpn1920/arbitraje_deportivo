import java.util.Scanner;
public class arbitraje_deportivo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] partidos = new String[10];
        String[] deportes = new String[10];
        String[] arbitros = new String[10];
        String[] equiposLocales = new String[10];
        String[] equiposVisitantes = new String[10];
        String[] fechas = new String[10];
        String[] lugares = new String[10];
        String[] decisiones = new String[10];
        String[] resultados = new String[10];
        String[] estados = new String[10];
        int total = 0;
        int opcion;
        //-------------------------------------------//
        //--|menu_principal_de_arbitraje_deportivo|--//
        //-------------------------------------------//
        do {
            System.out.println("menu principal de arbitraje deportivo");
            System.out.println("1) Registrar arbitraje");
            System.out.println("2) Editar arbitraje");
            System.out.println("3) Listar arbitrajes");
            System.out.println("4) Buscar arbitraje");
            System.out.println("5) Eliminar arbitraje");
            System.out.println("6) Mostrar resumen");
            System.out.println("7) Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                //-------------------------//
                //--|registrar_arbitraje|--//
                //-------------------------//
                case 1:
                    if (total >= partidos.length) {
                        System.out.println("No hay espacio para registrar mas arbitrajes.");
                        break;
                    }
                    int id = total + 1;
                    System.out.println("registro de arbitraje deportivo");
                    System.out.println("id del arbitraje a registrar: " + id);
                    System.out.print("nombre del partido: ");
                    partidos[total] = entrada.nextLine();
                    System.out.print("deporte: ");
                    deportes[total] = entrada.nextLine();
                    System.out.print("nombre del arbitro: ");
                    arbitros[total] = entrada.nextLine();
                    System.out.print("equipo local: ");
                    equiposLocales[total] = entrada.nextLine();
                    System.out.print("equipo visitante: ");
                    equiposVisitantes[total] = entrada.nextLine();
                    System.out.print("fecha del partido: ");
                    fechas[total] = entrada.nextLine();
                    System.out.print("lugar del partido: ");
                    lugares[total] = entrada.nextLine();
                    System.out.print("cantidad de decisiones arbitrales: ");
                    decisiones[total] = entrada.nextLine();
                    System.out.print("resultado del partido: ");
                    resultados[total] = entrada.nextLine();
                    System.out.print("estado del arbitraje: ");
                    estados[total] = entrada.nextLine();
                    System.out.println("Arbitraje registrado correctamente.");
                    total++;
                    break;
                //----------------------//
                //--|editar_arbitraje|--//
                //----------------------//
                case 2:
                    if (total == 0) {
                        System.out.println("No existen arbitrajes registrados.");
                        break;
                    }
                    System.out.println("Datos de los arbitrajes");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Partido: " + partidos[i] + " | Deporte: " + deportes[i] + " | Arbitro: " + arbitros[i] + " | Local: " + equiposLocales[i] + " | Visitante: " + equiposVisitantes[i] + " | Fecha: " + fechas[i] + " | Lugar: " + lugares[i] + " | Decisiones: " + decisiones[i] + " | Resultado: " + resultados[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID del arbitraje: ");
                    int idEditar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEditar >= 1 && idEditar <= total) {
                        int posicion = idEditar - 1;
                        System.out.println("Editar el dato del arbitraje");
                        System.out.print("Nuevo nombre del partido: ");
                        partidos[posicion] = entrada.nextLine();
                        System.out.print("Nuevo deporte: ");
                        deportes[posicion] = entrada.nextLine();
                        System.out.print("Nuevo nombre del arbitro: ");
                        arbitros[posicion] = entrada.nextLine();
                        System.out.print("Nuevo equipo local: ");
                        equiposLocales[posicion] = entrada.nextLine();
                        System.out.print("Nuevo equipo visitante: ");
                        equiposVisitantes[posicion] = entrada.nextLine();
                        System.out.print("Nueva fecha del partido: ");
                        fechas[posicion] = entrada.nextLine();
                        System.out.print("Nuevo lugar del partido: ");
                        lugares[posicion] = entrada.nextLine();
                        System.out.print("Nueva cantidad de decisiones arbitrales: ");
                        decisiones[posicion] = entrada.nextLine();
                        System.out.print("Nuevo resultado del partido: ");
                        resultados[posicion] = entrada.nextLine();
                        System.out.print("Nuevo estado del arbitraje: ");
                        estados[posicion] = entrada.nextLine();
                        System.out.println("Arbitraje actualizado correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //-----------------------//
                //--|listar_arbitrajes|--//
                //-----------------------//
                case 3:
                    if (total == 0) {
                        System.out.println("No existen arbitrajes registrados.");
                    } else {
                        System.out.println("Lista de arbitrajes deportivos");
                        for (int i = 0; i < total; i++) {
                            System.out.println("ID: " + (i + 1) + " | Partido: " + partidos[i] + " | Deporte: " + deportes[i] + " | Arbitro: " + arbitros[i] + " | Local: " + equiposLocales[i] + " | Visitante: " + equiposVisitantes[i] + " | Fecha: " + fechas[i] + " | Lugar: " + lugares[i] + " | Decisiones: " + decisiones[i] + " | Resultado: " + resultados[i] + " | Estado: " + estados[i]);
                        }
                    }
                    break;
                //----------------------//
                //--|buscar_arbitraje|--//
                //----------------------//
                case 4:
                    if (total == 0) {
                        System.out.println("No existen arbitrajes registrados.");
                        break;
                    }
                    System.out.println("busqueda de arbitraje");
                    System.out.print("ingresa la id para buscar arbitraje: ");
                    int idBusqueda = entrada.nextInt();
                    entrada.nextLine();
                    if (idBusqueda >= 1 && idBusqueda <= total) {
                        int posicion = idBusqueda - 1;
                        System.out.println("Datos del arbitraje encontrado:");
                        System.out.println("ID: " + idBusqueda + " | Partido: " + partidos[posicion] + " | Deporte: " + deportes[posicion] + " | Arbitro: " + arbitros[posicion] + " | Local: " + equiposLocales[posicion] + " | Visitante: " + equiposVisitantes[posicion] + " | Fecha: " + fechas[posicion] + " | Lugar: " + lugares[posicion] + " | Decisiones: " + decisiones[posicion] + " | Resultado: " + resultados[posicion] + " | Estado: " + estados[posicion]);
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //------------------------//
                //--|eliminar_arbitraje|--//
                //------------------------//
                case 5:
                    if (total == 0) {
                        System.out.println("No existen arbitrajes registrados.");
                        break;
                    }
                    System.out.println("Datos de los arbitrajes");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Partido: " + partidos[i] + " | Deporte: " + deportes[i] + " | Arbitro: " + arbitros[i] + " | Local: " + equiposLocales[i] + " | Visitante: " + equiposVisitantes[i] + " | Fecha: " + fechas[i] + " | Lugar: " + lugares[i] + " | Decisiones: " + decisiones[i] + " | Resultado: " + resultados[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID del arbitraje a eliminar: ");
                    int idEliminar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEliminar >= 1 && idEliminar <= total) {
                        int posicion = idEliminar - 1;
                        for (int i = posicion; i < total - 1; i++) {
                            partidos[i] = partidos[i + 1];
                            deportes[i] = deportes[i + 1];
                            arbitros[i] = arbitros[i + 1];
                            equiposLocales[i] = equiposLocales[i + 1];
                            equiposVisitantes[i] = equiposVisitantes[i + 1];
                            fechas[i] = fechas[i + 1];
                            lugares[i] = lugares[i + 1];
                            decisiones[i] = decisiones[i + 1];
                            resultados[i] = resultados[i + 1];
                            estados[i] = estados[i + 1];
                        }
                        total--;
                        System.out.println("Arbitraje eliminado correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //---------------------//
                //--|mostrar_resumen|--//
                //---------------------//
                case 6:
                    if (total == 0) {
                        System.out.println("No existen arbitrajes registrados.");
                        break;
                    }
                    int programados = 0;
                    int enCurso = 0;
                    int finalizados = 0;
                    int suspendidos = 0;
                    int otrosEstados = 0;
                    int totalDecisiones = 0;
                    for (int i = 0; i < total; i++) {
                        if (estados[i].equalsIgnoreCase("Programado")) {
                            programados++;
                        } else if (estados[i].equalsIgnoreCase("En curso")) {
                            enCurso++;
                        } else if (estados[i].equalsIgnoreCase("Finalizado")) {
                            finalizados++;
                        } else if (estados[i].equalsIgnoreCase("Suspendido")) {
                            suspendidos++;
                        } else {
                            otrosEstados++;
                        }
                        totalDecisiones += Integer.parseInt(decisiones[i]);
                    }
                    String deporteMayor = deportes[0];
                    int cantidadDeporteMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadDeporte = 0;
                        for (int j = 0; j < total; j++) {
                            if (deportes[i].equalsIgnoreCase(deportes[j])) {
                                cantidadDeporte++;
                            }
                        }
                        if (cantidadDeporte > cantidadDeporteMayor) {
                            cantidadDeporteMayor = cantidadDeporte;
                            deporteMayor = deportes[i];
                        }
                    }
                    String arbitroMayor = arbitros[0];
                    int cantidadArbitroMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadArbitro = 0;
                        for (int j = 0; j < total; j++) {
                            if (arbitros[i].equalsIgnoreCase(arbitros[j])) {
                                cantidadArbitro++;
                            }
                        }
                        if (cantidadArbitro > cantidadArbitroMayor) {
                            cantidadArbitroMayor = cantidadArbitro;
                            arbitroMayor = arbitros[i];
                        }
                    }
                    String lugarMayor = lugares[0];
                    int cantidadLugarMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadLugar = 0;
                        for (int j = 0; j < total; j++) {
                            if (lugares[i].equalsIgnoreCase(lugares[j])) {
                                cantidadLugar++;
                            }
                        }
                        if (cantidadLugar > cantidadLugarMayor) {
                            cantidadLugarMayor = cantidadLugar;
                            lugarMayor = lugares[i];
                        }
                    }
                    System.out.println("resumen de arbitraje deportivo");
                    System.out.println("Arbitrajes registrados: " + total);
                    System.out.println("Deporte mas arbitrado: " + deporteMayor);
                    System.out.println("Arbitro con mas partidos: " + arbitroMayor);
                    System.out.println("Lugar con mas partidos: " + lugarMayor);
                    System.out.println("Total de decisiones arbitrales: " + totalDecisiones);
                    System.out.println("Programados: " + programados);
                    System.out.println("En curso: " + enCurso);
                    System.out.println("Finalizados: " + finalizados);
                    System.out.println("Suspendidos: " + suspendidos);
                    System.out.println("Otros estados: " + otrosEstados);
                    break;
                //------------------------------//
                //--|salir_del_menu_principal|--//
                //------------------------------//
                case 7:
                    System.out.println("Gracias por utilizar Arbitraje Deportivo.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 7);
        entrada.close();
    }
}