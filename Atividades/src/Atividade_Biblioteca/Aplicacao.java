package Atividade_Biblioteca;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Aplicacao {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		List<Editora> editoraList = new ArrayList();
		List<Genero> generoList = new ArrayList();
		List<Livro> livroList = new ArrayList();

		
		for(int i = 1; i < 3; i++) { // Editora
			System.out.println("Insira o ID da " + i + " editora: ");
			int idEditora = input.nextInt();
			
			input.nextLine();
			System.out.println("Insira a razao social da " + i + " editora: ");
			String razaoSocial= input.nextLine();

			System.out.println("Insira o contato da editora da " + i + " editora: ");
			String contato= input.nextLine();

			System.out.println("Insira a cidade da " + i + " editora: ");
			String cidade= input.nextLine();

			System.out.println("Insira o UF da editora da " + i + " editora: ");
			String UF = input.nextLine();

			Editora editora = new Editora(idEditora, razaoSocial, contato, cidade, UF);
			
			editoraList.add(editora);
			
			System.out.println("id editora: " + editora.getIdEditora());
			System.out.println("contato da editora: " + editora.getRazaoSocial());
			System.out.println("contato: " + editora.getContato());
			System.out.println("cidade: " + editora.getCidade());
			System.out.println("UF da editora: " + editora.getUF());
		}
				
		for(int i = 1; i < 4; i++) { // Genero 
			System.out.println("Insira o ID do " + i + " genero: " );
			int idGenero = input.nextInt();

			System.out.println("Insira o nome do " + i + " genero: ");
			String nomeGenero = input.nextLine();

			Genero genero = new Genero(idGenero, nomeGenero);
			
			generoList.add(genero);
			
			System.out.println("id genero: " + genero.getIdGenero());
			System.out.println("nome do genero: "+genero.getNomeGenero());
		}
		
		for(int i = 1; i < 6; i++) { // Livro
			System.out.println("Insira o ID do " + i +" livro: ");
			int idLivro = input.nextInt();
			
			input.nextLine();

			System.out.println("Insira o titulo do " + i + " livro: " );
			String titulo = input.nextLine();
			
			System.out.println("Insira o ISBN do " + i + " livro: ");
			String ISBN = input.nextLine();
			
			System.out.println("Insira o numero de Paginas do " + i + " livro: ");
			int numeroPaginas = input.nextInt();

			Livro livro = new Livro(idLivro, titulo, ISBN, numeroPaginas);
			
			livroList.add(livro);
			
			System.out.println("id genero: " + livro.getIdLivro());
			System.out.println("titulo: "+ livro.getTitulo());
			System.out.println("ISBN: : "+ livro.getISBN());
			System.out.println("Numero de paginas: "+ livro.getNumeroPaginas());

		}
		
		
		
		
	}
}
