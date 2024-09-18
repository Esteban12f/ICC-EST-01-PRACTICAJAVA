public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        String cadena = "Hola mundo";
        int edad = 10;

        System.out.println(cadena);
        System.out.print("Tamaño de la cadena ");
        System.out.println(cadena.length());
        System.out.println(cadena.split(" ")[0]);

        for (int i = 0; i < cadena.length(); i++){
            System.out.print(cadena.charAt(i));
            if (i != cadena.length()-1){
                System.out.print("-");
            }
        }

        // CONTAR LETRA 
        System.out.println(" ");
        int palabras = cadena.split(" ").length;
        char letra = 'a';
        int cont = 0;

        System.out.println(palabras);

        for (int i = 0; i < cadena.length(); i++){
            if (cadena.charAt(i) == letra){
                cont++;
            }
        }
        System.out.println("La cantidad de letras 'a' que hay son: "+cont);


    }

}



