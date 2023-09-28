public class cadenaDeTexto {
    public static void main (String [] args){
        String mensaje = "Para escribir algo tienes que correr el riesgo de burlarte de ti mismo";
        boolean contieneLetraA = mensaje.contains("a");
        System.out.println("La frase escrita contiene la letra a?: " + contieneLetraA);
        boolean contieneLetraB = mensaje.contains("b");
        System.out.println("La frase escrita contiene la letra b?: " + contieneLetraB);
    }
}
