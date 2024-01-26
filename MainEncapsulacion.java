public class MainEncapsulacion {
    public static void main(String[]args){

        Impresora impresora=new Impresora(6,true);
        System.out.println("Cantidad de toner:"+ impresora.addcantidad(5));
        System.out.println("Páginas de doblecara:"+ impresora.imprimirpaginas(1));


    }
}
