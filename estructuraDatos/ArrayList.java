package estructuraDatos;

public class ArrayList {

    public static void main(String[] args) {
        java.util.ArrayList<String> fruits = new java.util.ArrayList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("te");

        // Access elements
        System.out.println("fruit-> " + fruits);

        // Modify an element
        fruits.set(1, "Grape");
        fruits.set(3,"lemon");

        // Remove an element
        fruits.remove("Apple");

        // Iterate for-each the list
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Get the size of the list
        System.out.println("----Number of fruits:---- " + fruits.size());
        java.util.ArrayList<String> listas =new java.util.ArrayList<String>();
        listas.add("frutas");
        listas.add("verduras");
        listas.add("carnes");
        listas.set(1,"pan");
        for (String lista : listas) {
            System.out.println("-->" + lista);
        }
    }
    }

