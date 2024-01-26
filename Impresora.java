public class Impresora {
    private int toner;
   private int paginas;
    private boolean doblecara;

    public Impresora(int toner,boolean doblecara){
        this.toner=toner;
        this.doblecara=doblecara;

    }
    public int addcantidad(int nuevotoner){
        //Comprobar que el nuevotoner no sea mas grande que el toner inicial
        if(nuevotoner>this.toner){
            return -1;
        }else{
            this.toner=nuevotoner+this.toner;
        }
        //Asegurar que el toner esté entre 0 y 100
        if(toner>0 && toner<=100){
            return this.toner;
        }else{
            return -1;
        }
    }

    public int imprimirpaginas(int paginas) {

//Imprimir esas páginas y actualizar ese valor de páginas impresas,dependiendo si es par o impar
        if(doblecara){
            if(paginas%2==0){
                return paginas/2;
            }else{
                return (paginas/2)+1;
            }
        }else{
            return paginas;
        }
    }

}
