package TaskJava1;
/*En este ejercicio tenéis que crear un bucle que permita concatenar textos
e imprima el resultado final por consola.
Tened en cuenta que los textos pueden venir de un array de tipo String. */
public class Main3 {
    public static void main(String[] args){
        String[] nombres = {"Luisa", "Olaya", "Marilau", "Sam"};

        for (String nombre : nombres) {
            System.out.println("Los invitados a la fiesta son: " + nombre);


        }

    }
}
