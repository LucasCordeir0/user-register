package application;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import entities.User;
import dao.UserDao;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<User> list = new ArrayList<>();
		
		String name;
		
		UserDao dao = new UserDao();
		
		System.out.println("-CADASTRO DE USUÁRIO-");
		do {
			try {
				System.out.print("ID: ");
				int id = sc.nextInt();
				sc.nextLine(); // LIMPAR BUFFER
				System.out.print("Nome: ");
				name = sc.nextLine();
				System.out.print("CPF: ");
				String cpf = sc.nextLine();
				
				User user = new User(id, name, cpf);
				
				dao.insert(user);
				
				System.out.println("Usuário cadastrado com sucesso!");
				
				list.add(user);
				
			}
			catch (IllegalArgumentException e) {
				System.out.println("Erro: " + e.getMessage());
				System.out.println("Tente novamente.\n");
			}
			
		}
		while (list.isEmpty());
		
		for (User u : list) {
		    System.out.println(u);
		}
		
		
		
		
		sc.close();
	}

}