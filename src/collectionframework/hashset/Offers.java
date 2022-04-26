package collectionframework.hashset;

import java.util.Objects;

public class Offers {

    private String name;
    private int save;
    private String category;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSave() {
        return save;
    }

    public void setSave(int save) {
        this.save = save;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Offers offers = (Offers) o;
        return save == offers.save && name.equals(offers.name) && category.equals(offers.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, save, category);
    }

    @Override
    public String toString() {
        return "Offers{" +
                "name='" + name + '\'' +
                ", save=" + save +
                ", category='" + category + '\'' +
                '}';
    }
}
