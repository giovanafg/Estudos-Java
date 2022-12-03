package testandoAnimais;

public class Mamífero extends Animal {

    //Atributos
    private String tipoDePelo;

    //Getter e Setter
    public String getTipoDePelo() {
        return tipoDePelo;
    }
    public void setTipoDePelo(String tipoDePelo) {
        if(tipoDePelo.equals("Liso")){
            System.out.println("Será fácil de pentear");
        }else{
            System.out.println("Será um pouco trabalhoso, talvez leve um tempo maior para pentear");
        }
    }

    //Métodos sobrepostos
    @Override
    public void emitirSom() {
        System.out.println("Emite som de mamífero");
    }
    @Override
    public void alimentar() {
        System.out.println("Se alimenta de vegetais");
    }
    @Override
    public void locomover() {
        System.out.println("Se locomove andando");
    }
}
