package encupsulation;
import java.util.ArrayList;
import java.util.HashSet;
public class inventory {
	private ArrayList<singleproduct> singles = new ArrayList<>();
    private ArrayList<boxproduct> boxes = new ArrayList<>();

   
    public void add(singleproduct p) {
        singles.add(p);
    }

    // maramihang single prod
    public void add(singleproduct p, int quantity) {
        for (int i = 0; i < quantity; i++) {
            singles.add(new singleproduct(p.getBrand()));
        }
    }

    // pfor box
    public void add(boxproduct p) {
        boxes.add(p);
    }
    
    //maramihang box
    public void add(boxproduct p, int quantity) {
        for (int i = 0; i < quantity; i++) {
            boxes.add(new boxproduct(p.getBrand(), p.getQuantity()));
        }
    }

    // return
    public String[] getBrands() {
        HashSet<String> brandSet = new HashSet<>();
        for (int i = 0; i < singles.size(); i++) {
            brandSet.add(singles.get(i).getBrand());}
        for (int i = 0; i < boxes.size(); i++) {
            brandSet.add(boxes.get(i).getBrand());}
        return brandSet.toArray(new String[0]);
    }

    // return sa box
    public boxproduct[] getBoxes(String brand) {
        ArrayList<boxproduct> result = new ArrayList<>();
        for (int i = 0; i < boxes.size(); i++) {
            if (boxes.get(i).getBrand().equalsIgnoreCase(brand)) {
                result.add(boxes.get(i));}
        }
        return result.toArray(new boxproduct[0]); }
    

    // return sa single
    public singleproduct[] getSingles(String brand) {
        ArrayList<singleproduct> result = new ArrayList<>();

        for (int i = 0; i < singles.size(); i++) {
            if (singles.get(i).getBrand().equalsIgnoreCase(brand)) {
                result.add(singles.get(i)); } }

        return result.toArray(new singleproduct[0]);
    }
}


