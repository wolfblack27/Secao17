package Aplication;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Primeiro Solucao:

		/*
		 * File file =null; Scanner sc = null; try {
		 * 
		 * String path = "C:\\Users\\Casa\\Documents\\ws-java\\Secao17\\leitura.txt";
		 * file = new File(path); sc = new Scanner(file); while(sc.hasNextLine()) {
		 * 
		 * System.out.println(sc.nextLine()); }
		 * 
		 * 
		 * } catch (FileNotFoundException e) { System.out.println("Erro: " +
		 * e.getMessage());
		 * 
		 * 
		 * } finally {
		 * 
		 * if (sc != null && file !=null) {
		 * System.out.println("Scanner e Arquivos fechados"); } }
		 */

		// Segunda Solução:
		FileReader file = null;
		BufferedReader bf = null;

		try {

			String path = "C:\\Users\\Casa\\Documents\\ws-java\\Secao17\\leitura.tt";
			file = new FileReader(path);
			bf = new BufferedReader(file);
			String line = bf.readLine();
			
			while(line !=null) {
				System.out.println(line);
				line = bf.readLine();
			}
			
					

		} catch (IOException e) {
			
			System.out.println("Erro1: "+ e.getMessage());
		}finally {
			
			try {
				if (bf != null)
					bf.close();
					if (file != null)
					file.close();
					
			}catch (IOException e) {
				System.out.println("Erro: "+ e.getMessage());
				
			}
		}

		
		
	}

}
