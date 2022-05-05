package Utils;

import Utils.Collections.Stack;

public class Robot {
    public static String nombre;
    public Stack carga = new Stack();

    public Robot(String nombre) {
        this.nombre = nombre;
    }

    public void generarCarga(){
        int e = (int) (Math.random() * 5);
        for (int i = 0; i < 5; i++) {
            carga.push( Producto.generarProducto());
        }
    }

    @Override
    public String toString(){
        String out = nombre;
        for (int i = 0; i < 5; i++) {
            out += carga.pop();
        }
        return out;
    }

}
