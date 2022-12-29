import java.util.ArrayList;

public class Authors {
    private String name;
    private ArrayList<String> catalog;

    public Authors(String name, ArrayList<String> catalog) {
        this.name = name;
        this.catalog = catalog;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Authors{" +
                "name='" + name + '\'' +
                ", catalog=" + catalog +
                '}';
    }
}
