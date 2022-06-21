import MenuSistemaDeDeposito.funcionesDeProdecimiemtos;

public class AccesoAlSistemaDeposito{
    public static void main(String[] args) { 
        System.out.println("\n\nBienvenido al Sistema de Deposito de Compumundohipermegared S.A. \n\nAqui podra realizar: \n\n**Compra de mercaderia, ingresando manualmente la carga de stock al deposito \n**Informar el stock de cada uno de los productos \n**Informar el costo total de cada producto \n**Informar el costo total de todos los productos disponibles en el deposito \n**Retirar stock(mostrando el costo total de los productos)");


        boolean salida = false;
    do {
        System.out.println("\n\nIngrese por teclado la opcion deseada, para iniciar la actividad\n\n");

        System.out.println("1 Ingresar productos. \n2 Ingresar el stock disponible de los productos \n3 Ver Costo Productos  \n4 Ver Costo Total Porductos Disponibles en Deposito \n5 Ver Stock Vendido y costo total \n6 Salir");

        int opcion = Integer.parseInt(System.console().readLine());
        
        String[]productos= new String[10];
       
       int[] disponibleStock = {100,100,100,100,100,100,100,100,100,100};

       int[] costoProductos = {5000,2500,7000,15000,6000,10000,3000,3500,1000,1250};

        int[] stockVendido =new int[productos.length];
        
        int[] disponibleStockActualizado = new int [disponibleStock.length];
        
        int[] costoProductosActualizado = new int [disponibleStock.length];
        
        int i;

        
        switch (opcion) {
            case 1:
            System.out.println("\nPRODUCTOS DISPONIBLES\n");
            System.out.println("\nIngrese el nombre de los productos que forman el stock disponible: \n");
            //productos[] = {"Gabinete","Memoria Ram","Fuente de Alimentacion","Microprocesadores","Disco Rigidos","Motherboards","Mouses","Teclados","Parlantes","Microfonos"}
            for(i=0; i<10; i ++){
            System.out.println("productos[" + i +"] =");
            productos[i] = System.console().readLine();
            }
            for(i=0; i<productos.length; i++){
            System.out.println(productos[i]);
            }System.out.println();
            break;

            case 2:
            System.out.println("\nSTOCK DISPONIBLE\n");
            MenuSistemaDeDeposito.funcionesDeProdecimiemtos.muestraStock(disponibleStock);
           
            break;

            case 3: 
            System.out.println("\nCOSTO UNITARIO DE LOS PRODUCTOS\n");
            MenuSistemaDeDeposito.funcionesDeProdecimiemtos.muestraStock(costoProductos);
            break;

            case 4:
            System.out.println("\nCOSTO TOTAL DE LOS PRODUCTOS DISPONIBLES EN DEPOSITO");
            MenuSistemaDeDeposito.funcionesDeProdecimiemtos.muestraCostoTotal(costoProductos,disponibleStock,costoProductosActualizado);
            break;

            case 5:
            System.out.println("Ingrese el stock de productos vendidos, respetando el orden de los mismos");
            for(i=0; i<10; i ++){
                System.out.println("stockVendido[" + i +"] =");
                stockVendido[i] =Integer.parseInt(System.console().readLine()) ;
                }
            System.out.println("\n STOCK ACTUALIZADO\n");
            MenuSistemaDeDeposito.funcionesDeProdecimiemtos.nuevoStock( disponibleStock, stockVendido, disponibleStockActualizado);
            System.out.println("\nCOSTO TOTAL ACTUALIZADO DEL STOCK\n");
            MenuSistemaDeDeposito.funcionesDeProdecimiemtos.muestraCostoTotal(disponibleStockActualizado, costoProductos, costoProductosActualizado);
            
            case 6:
            System.out.println("Salir");
            //salida = true;

            default:
            break;
            }
    } while (!salida);
  }
}
