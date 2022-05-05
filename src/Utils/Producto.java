package Utils;

public class Producto {
    private final static int PRECIO_MAXIMO = 20;
    private final static int CANTIDAD_MAXIMA = 6;

    private String nombre;
    private float precio;

    public Producto(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;

    }

    public static Producto generarProducto() {
        String nombre = RobotUtils.generarNombreProducto();
        float precio = (float) RobotUtils.generarNumeroAleatorio(PRECIO_MAXIMO);
        return new Producto(nombre, precio);
    }

    @Override
    public String toString() {
        return " Producto" +
                "\n" +
                "Nombre = '" + nombre + '\'' +
                "\n" +
                "Precio = " + String.format("%.2f", precio) ;
    }
}
