import java.util.*;
import java.io.*;

public class CreateCategory {
	private String categoryName;
	private String color;
	
	public CreateCategory() {
		this.getCategoryName();
		this.getColor();
	}
	
	public CreateCategory(String categoryName, String color) {
		this.setCategoryName(categoryName);
		this.setColor(color);
	}
	
	private void saveCategory(CreateCategory details) {
		try {
			File saveCat = new File("categoryList.txt");
			if(!saveCat.exists()) {
				saveCat.createNewFile();
			}
			
			FileWriter fw = new FileWriter(saveCat.getName(), true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Category name: " +details.getCategoryName()
					+", Color: " +details.getColor() +"\n");
			bw.close();
			
			System.out.print("\nCategory created!");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void main(String[] args) {
		System.out.print("\nCreating a category.. \n");
		
		System.out.print("\nCategory name: ");
		Scanner scan = new Scanner(System.in);
		String input = "";
		input = scan.nextLine();
		
		System.out.print("\nCategory color: ");
		Scanner scan2 = new Scanner(System.in);
		String input2 = "";
		input2 = scan2.nextLine();
		
		CreateCategory category = new CreateCategory(input, input2);
		saveCategory(category);
		
		scan.close();
		scan2.close();
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
