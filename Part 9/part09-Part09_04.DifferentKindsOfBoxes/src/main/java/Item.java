
public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int hashCode() {
        if(this == null){
            return 0;
        }
        return this.name.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
        if(this.hashCode() == obj.hashCode()){
            return true;
        }
        return false; //To change body of generated methods, choose Tools | Templates.
    }

   
    

}
