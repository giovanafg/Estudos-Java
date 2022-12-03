package testandoAnimais;

public abstract class Animal {

    //Atributos
    private String name;
    private int age;
    private float weight;

    //Métodos
    public abstract void emitirSom();
    public abstract void alimentar();
    public abstract void locomover();

    //Getters e Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
