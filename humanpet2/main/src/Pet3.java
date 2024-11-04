class Pet {
    private String nickname;
    private String species;
    private int age;

    public Pet(String nickname, String species, int age) {
        this.nickname = nickname;
        this.species = species;
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Pet{nickname='%s', species='%s', age=%d}",
                nickname, species, age);
    }
}
