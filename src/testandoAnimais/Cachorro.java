package testandoAnimais;

public class Cachorro extends Mamífero{

    //Atributo
    private boolean dono;


    @Override
    public void emitirSom() {
        System.out.println("O cachorro emite latido");
    }

    @Override
    public void alimentar() {
        System.out.println("Se alimenta de ração");
    }

    @Override
    public void locomover() {
        System.out.println("E ele anda e corre quando necessário");
    }

    //Getter e Setter
    public boolean getDono() {
        return dono;
    }
    public void setDono(boolean dono) {
        if (this.dono){
            System.out.println("O cachorro não irá latir");
        }else{
            System.out.println("O cachorro não para de latir, pois está sem seu dono");
        }
    }
}
