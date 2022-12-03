package testandoAnimais;

public class Teste {

    public static void main(String[] args) {

        Ave a = new Ave();
        a.setAge(14);
        System.out.println(a.getAge());
        a.setCorPena("Azul");

        System.out.println("----------------------------");

        Cachorro c1 = new Cachorro();
        c1.setTipoDePelo("Liso");
        c1.alimentar();
        c1.locomover();
        c1.emitirSom();


    }
}
