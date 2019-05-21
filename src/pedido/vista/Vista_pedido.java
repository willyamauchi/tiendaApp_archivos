

package pedido.vista;

import java.util.Scanner;

public class Vista_pedido {
    private final int ADD_PRODUCTO_CESTA=1;
    private final int VISUSALIAR_PRECIO_TOTAL_CESTA=2;
    private final int IMPRIMIR_FACTURA=3;
    private final int TERMINAR_PEDIDO=4;
    
    
     public void submenuPedido() {
    
         Scanner sc = new Scanner(System.in);
        int opcion;
        System.out.println("--Menú Productos -------------------");
        System.out.println("   1.1 Añadir producto a la cesta");
        System.out.println("   1.2 Visualizar precio total de la cesta");
        System.out.println("   1.3 Imprimir factura");
        System.out.println("   1.4 Terminar pedido");
        System.out.println("------------------------------------");
        do {
            System.out.println("Ingrese la op :");
            opcion = sc.nextInt();
        } while (opcion > 4);

        elegirOpcionSubMenuPedido(opcion);
    }

    public void elegirOpcionSubMenuPedido(int opcion) {

        switch (opcion) {
            case ADD_PRODUCTO_CESTA:
                break;
            case VISUSALIAR_PRECIO_TOTAL_CESTA:
                break;
            case IMPRIMIR_FACTURA:
                break;
            case TERMINAR_PEDIDO:
                break;
        }
    }
}
