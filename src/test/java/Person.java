import java.util.*;

public class Person {
    public static void main(String[] args) {
        List<People> personsList = new ArrayList<>();
        Set<People> personsSet = new TreeSet<>();

        addElements(personsList);
        addElements(personsSet);

        Collections.sort(personsList);

        System.out.println(personsList);
        System.out.println(personsSet);
    }

    private static void addElements(Collection collection){
        collection.add(new People(4, "Anna"));
        collection.add(new People(2, "Bob"));
        collection.add(new People(1, "Dasha"));
        collection.add(new People(3, "Tom"));
    }
}

class People implements Comparable<People>{
    private int id;
    private String name;

    public People(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        if(id!=people.id) return false;
        return Objects.equals(name, people.name);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(People o) {
        if(this.id > o.getId()) { //this.name.length() > o.getName().length()
            return 1;
        }else if(this.id < o.getId()) {//this.name.length() < o.getName().length()
            return -1;
        }else {
            return 0;
        }
    }


}