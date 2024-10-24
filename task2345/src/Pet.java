public class Pet {
    public String species;
    public String nickname;
    public String age;
    public int trickLevel;
    public String[] habits;

    public Pet(String species,String nickname,String age,int trickLevel,String[] habits){
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }
    public Pet () {

    }
    public void eat () {
        System.out.println();
    }
    public void respond () {

    }
    public void foul () {

    }

}
