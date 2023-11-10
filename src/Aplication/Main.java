package Aplication;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
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
		/*
		 * FileReader file = null; BufferedReader bf = null;
		 * 
		 * try {
		 * 
		 * String path = "C:\\Users\\Casa\\Documents\\ws-java\\Secao17\\leitura.tt";
		 * file = new FileReader(path); bf = new BufferedReader(file); String line =
		 * bf.readLine();
		 * 
		 * while(line !=null) { System.out.println(line); line = bf.readLine(); }
		 * 
		 * 
		 * 
		 * } catch (IOException e) {
		 * 
		 * System.out.println("Erro1: "+ e.getMessage()); }finally {
		 * 
		 * try { if (bf != null) bf.close(); if (file != null) file.close();
		 * 
		 * }catch (IOException e) { System.out.println("Erro: "+ e.getMessage());
		 * 
		 * } }
		 */

		//Terceira opção:
		/*String path = "C:\\Users\\Casa\\Documents\\ws-java\\Secao17\\leitura.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
			System.out.println(line);
			line = br.readLine();
			}
			} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
			} */
	
	
		
	//Usando o FileWriter: para criar e escrever em arquivo:
		
		/*String path = "C:\\Users\\Casa\\Documents\\ws-java\\Secao17\\escrita.txt";
		String[] dados= new String[] {"Aluno","Notas","Semestre"};
		
		try(BufferedWriter bw = new BufferedWriter( new FileWriter(path,true))){
			for (String lines: dados) {
				bw.write(lines);
				bw.newLine();
				
			}
			
		}catch (IOException e) {
			System.out.println("error: " + e.getMessage());
		}*/
	
		
		// Criando pasta a partir de um caminho - Pegando pastas e arquivos
	/*	Scanner sc = new Scanner(System.in);
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		File path = new File(strPath);
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS:");
		for (File folder : folders) {
			System.out.println(folder);
		}
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES:");
		for (File file : files) {
			System.out.println(file);
		}
		boolean success = new File(strPath + "\\subdir").mkdir();
		System.out.println("Directory created successfully: " + success);
		sc.close();*/
		
		
		//Obtendo informações do arquivo
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		File path = new File(strPath);
		System.out.println("getPath: " + path.getPath());
		System.out.println("getParent: " + path.getParent());
		System.out.println("getName: " + path.getName());
		sc.close();

	}

}
