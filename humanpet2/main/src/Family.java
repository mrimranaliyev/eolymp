import java.util.Arrays;
import java.util.Objects;

class Family {
    private Human3 mother;
    private Human3 father;
    private Human3[] children;
    private Pet pet;

    public Family(Human3 mother, Human3 father) {
        this.mother = mother;
        this.father = father;
        this.children = new Human3[0];
        this.mother.setFamily(this);
        this.father.setFamily(this);
    }

    public Human3 getMother() {
        return mother;
    }

    public void setMother(Human3 mother) {
        this.mother = mother;
    }

    public Human3 getFather() {
        return father;
    }

    public void setFather(Human3 father) {
        this.father = father;
    }

    public Human3[] getChildren() {
        return children;
    }

    public void setChildren(Human3[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void addChild(Human3 child) {
        children = Arrays.copyOf(children, children.length + 1);
        children[children.length - 1] = child;
        child.setFamily(this);
    }

    public boolean deleteChild(int index) {
        if (index < 0 || index >= children.length) {
            return false;
        }

        Human3[] newChildren = new Human3[children.length - 1];
        for (int i = 0, j = 0; i < children.length; i++) {
            if (i != index) {
                newChildren[j++] = children[i];
            }
        }
        children = newChildren;
        return true;
    }

    public int countFamily() {
        return 2 + children.length;
    }

    @Override
    public String toString() {
        return String.format("Family{mother=%s, father=%s, children=%s, pet=%s}",
                mother, father, Arrays.toString(children), pet);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Family)) return false;
        Family family = (Family) o;
        return Objects.equals(mother, family.mother) &&
                Objects.equals(father, family.father) &&
                Arrays.equals(children, family.children) &&
                Objects.equals(pet, family.pet);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(mother, father, pet);
        result = 31 * result + Arrays.hashCode(children);
        return result;
    }
}
