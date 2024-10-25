import java.util.Arrays;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children; // Uşaqlar üçün dinamik massiv
    private Pet pet;

    // Statik blok
    static {
        System.out.println("Family sinifi yüklənir.");
    }

    // Statik olmayan blok
    {
        System.out.println("Yeni Family obyekti yaradılır.");
    }

    // Konstruktor
    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.children = new Human[0]; // Boş uşaqlar massivi
        mother.setFamily(this);
        father.setFamily(this);
    }

    // Getter və Setter metodları
    public Human getMother() {
        return mother;
    }

    public Human getFather() {
        return father;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    // Uşağı ailəyə əlavə etmək
    public void addChild(Human child) {
        child.setFamily(this);
        children = Arrays.copyOf(children, children.length + 1);
        children[children.length - 1] = child; // Uşağı əlavə et
    }

    // Uşağı indeksə görə silmək
    public boolean deleteChild(int index) {
        if (index < 0 || index >= children.length) {
            return false; // Yanlış indeks
        }
        Human[] newChildren = new Human[children.length - 1];
        for (int i = 0, j = 0; i < children.length; i++) {
            if (i != index) {
                newChildren[j++] = children[i]; // Digər uşaqları kopyala
            }
        }
        children = newChildren; // Uşaqlar massivini yenilə
        return true; // Silinmə uğurlu
    }

    // Ailə üzvlərinin sayını hesablamaq
    public int countFamily() {
        return 2 + children.length; // 2 valideyn + uşaqların sayı
    }

    // toString metodunu yenidən müəyyən et
    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(children) +
                ", pet=" + pet +
                '}';
    }

    // equals metodunu yenidən müəyyən et
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Family)) return false;
        Family family = (Family) obj;
        return mother.equals(family.mother) && father.equals(family.father);
    }

    // hashCode metodunu yenidən müəyyən et
    @Override
    public int hashCode() {
        return 31 * mother.hashCode() + father.hashCode();
    }
}
