package encupsulation;
import java.util.Scanner;
public class encupsulation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		inventory inv = new inventory();
		boolean act = true;

		while (act) {
		    System.out.println("Options:");
		    System.out.println("[1] Add Single Product");
		    System.out.println("[2] Add Box Product");
		    System.out.println("[3] Exit");
		    System.out.print("Choice: ");
		    
		int choice = sc.nextInt();
		sc.nextLine();

		    switch (choice)
		    {
		case 1:
		    System.out.print("Brand: ");
		    String brand = sc.nextLine();
		    System.out.print("Quantity: ");
		    int qty = sc.nextInt();
		    sc.nextLine();
		    inv.add(new singleproduct(brand), qty);
		    break;

		case 2:
		    System.out.print("Brand: ");
		    String brand2 = sc.nextLine();
		    System.out.print("Items in Box: ");
		    int items = sc.nextInt();
		    System.out.print("Quantity: ");
		    int qtyBox = sc.nextInt();
		    sc.nextLine();
		    inv.add(new boxproduct(brand2, items), qtyBox);
		break;

		case 3:
		    act = false;
		break;

		default:
		    System.out.println("Invalid option");
		}
		    System.out.println();
		}

		    System.out.println("INVENTORY REPORT");

		String[] brands = inv.getBrands();

		for (int i = 0; i < brands.length; i++) {
		    String b = brands[i];
		    singleproduct[] singles = inv.getSingles(b);
		    boxproduct[] boxes = inv.getBoxes(b);
		    
		int totalSingles = singles.length;
		int totalBoxes = boxes.length;
		int piecesInBoxes = 0;

		for (int j = 0; j < boxes.length; j++) {
		piecesInBoxes += boxes[j].getQuantity();
		}

		int totalPieces = totalSingles + piecesInBoxes;
		    System.out.println("Brand: " + b);
		    System.out.println("Single Items: " + totalSingles);
		    System.out.println("Boxes: " + totalBoxes);
		    System.out.println("Total Pieces: " + totalPieces);
		   
		}


		

	}

}
