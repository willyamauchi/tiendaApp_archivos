package pedido.persistencia;

import java.nio.file.Files;
import java.nio.file.Paths;
import pedido.dominio.Pedido;
import producto.dominio.Producto;

public class PedidoDAO_Imp implements PedidoDAO {

    @Override
    public boolean actualizarPedido(Pedido pedido) {
        String archivoFactura = "Factura";
        try ( var fw = Files.newBufferedWriter(Paths.get(archivoFactura))) {
            fw.write("Factura Simplificada");
            for (Producto producto : pedido.getCesta()) {
                var codigo = producto.getCodigo();
                var nombre = producto.getNombre();
                var descripcion = producto.getDescripcion();
                var precio = producto.getPrecio();

                fw.write(codigo);
                fw.write(nombre);
                fw.write(descripcion);
                fw.write(String.valueOf(precio));

            }
            fw.write(String.valueOf(pedido.getTotal()));
            fw.write(pedido.getEmpleado());

            return true;
        } catch (Exception e) {
        }

        return false;
    }
    
    

}
