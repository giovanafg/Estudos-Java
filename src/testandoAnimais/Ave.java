package testandoAnimais;

public class Ave extends Animal {

    //Atributo
    private String corPena;

    //Getter e Setter
    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        if(corPena.equals("Azul")){
            System.out.println("É a cor do céu");
        } else if (corPena.equals("Amarelo")) {
            System.out.println("É a cor do sol");
        }else{
            System.out.println("É uma cor muito bonita");
        }
    }


    //Métodos sobrepostos
    @Override
    public void emitirSom() {
        System.out.println("Emite som de ave");

    }
    @Override
    public void alimentar() {
        System.out.println("Se alimenta de bichinhos");

    }
    @Override
    public void locomover() {
        System.out.println("Se locomove voando");

    }
}
