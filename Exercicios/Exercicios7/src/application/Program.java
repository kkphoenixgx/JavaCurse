package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		String path  = "in.csv";

		FileReader fr = null;
		BufferedReader br = null;

		try{
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			
			String line = br.readLine();
			List<Product> collectionProducts = new ArrayList<Product>();

			//? ----------- Leitura -----------
			
			while(line != null){
				String[] atributes = line.split(", ");
				
				Product product = new Product(
					atributes[0], 
					Double.parseDouble(atributes[1]), 
					Integer.parseInt(atributes[2]) 
				);
					
				collectionProducts.add(product);
				line = br.readLine();
			}
				
			//? ----------- Escrita -----------
				
			String outPath = "../out/summary.csv";

			
			try (
				FileWriter fw = new FileWriter(outPath);
				BufferedWriter bw = new BufferedWriter(fw);
			) {
				for (Product product : collectionProducts) {
					bw.write(product.name);
					bw.write(", ");
					bw.write(String.valueOf(product.calcPrice()));
					
					bw.write("\n");
				}
				
			} 
			catch (Exception e) { e.printStackTrace();}

				
		}
		catch( IOException error ){	
			System.out.println("Error: " + error.getMessage());
		}
		finally{

			try {
				if(br != null) br.close();
				if(fr != null) fr.close();
			}
			catch(IOException error){ error.printStackTrace(); }
		}


	}

}
