package menu;

import java.sql.SQLException;
import java.util.Scanner;

import controller.ProdutoController;

public class Menu_Console {

	public static void main(String[] args) throws SQLException  {
		
		ProdutoController pd = new ProdutoController();
		
		Scanner scan = new Scanner(System.in);
		int op;
		
		do {
			System.out.println("\n-------------------------------------------");
			System.out.println("\t*** Menu ***");
			System.out.println("-------------------------------------------");
			System.out.println(" 0 - Sair");
			System.out.println(" 1 - Exibir Lista");
			System.out.println(" 2 - Inserir Elemento na Lista");
			System.out.println(" 3 - Atualizar elemento");
			System.out.println(" 4 - Remover elemento da lista");
			System.out.println("-------------------------------------------");

			System.out.print(" Op��o: ");
			System.out.println("\n-------------------------------------------");
			op = scan.nextInt();
			
			// limpa tela
			System.out.flush(); 
			switch (op) {
			case 0:
				System.out.println("Fim da execu��o.");
				break;
			case 1:
				pd.listarProdutos();
				break;
			case 2:
				System.out.println("Inserir registro");
				pd.insereProduto();
				break;
			case 3:
				System.out.println("Atualizar registro");
				pd.alteraProduto();
				break;
			case 4:
				pd.excluiProduto();
				break;
			default:
				System.out.println("Op��o inv�lida.");
				break;
			}
		} while (op != 0);
		scan.close();
	}
}

/*
 * Resultado no console

-------------------------------------------
*** Menu ***
-------------------------------------------
0 - Sair
1 - Exibir Lista
2 - Inserir Elemento na Lista
3 - Atualizar elemento
4 - Remover elemento da lista
-------------------------------------------
Op��o: 
-------------------------------------------
1

--------------------------------
Cod	Produto	Pre�o	Estoque
--------------------------------
1003	Arroz	4.69	35
1004	Feij�o	6.3	40
1005	Farinha	3.25	33
1008	Sab�o	4.25	42
1012	�leo	4.55	30
--------------------------------
Pressione enter para continuar... 

Pressione enter para continuar... 


-------------------------------------------
*** Menu ***
-------------------------------------------
0 - Sair
1 - Exibir Lista
2 - Inserir Elemento na Lista
3 - Atualizar elemento
4 - Remover elemento da lista
-------------------------------------------
Op��o: 
-------------------------------------------
2
Inserir registro
--------------------------------
Produto: 
Mam�o
--------------------------------
Preco: 
3,79
--------------------------------
Estoque: 
32

-------------------------------------------
*** Menu ***
-------------------------------------------
0 - Sair
1 - Exibir Lista
2 - Inserir Elemento na Lista
3 - Atualizar elemento
4 - Remover elemento da lista
-------------------------------------------
Op��o: 
-------------------------------------------
1

--------------------------------
Cod	Produto	Pre�o	Estoque
--------------------------------
1003	Arroz	4.69	35
1004	Feij�o	6.3	40
1005	Farinha	3.25	33
1008	Sab�o	4.25	42
1012	�leo	4.55	30
1013	Mam�o	3.79	32
--------------------------------
Pressione enter para continuar... 
Pressione enter para continuar... 


-------------------------------------------
*** Menu ***
-------------------------------------------
0 - Sair
1 - Exibir Lista
2 - Inserir Elemento na Lista
3 - Atualizar elemento
4 - Remover elemento da lista
-------------------------------------------
Op��o: 
-------------------------------------------
3
Atualizar registro

--------------------------------
Informe Id do produto: 1013
--------------------------------
Produto: 
Mel�o
--------------------------------
Preco: 
3,79
--------------------------------
Estoque: 
25

-------------------------------------------
*** Menu ***
-------------------------------------------
0 - Sair
1 - Exibir Lista
2 - Inserir Elemento na Lista
3 - Atualizar elemento
4 - Remover elemento da lista
-------------------------------------------
Op��o: 
-------------------------------------------
1

--------------------------------
Cod	Produto	Pre�o	Estoque
--------------------------------
1003	Arroz	4.69	35
1004	Feij�o	6.3	40
1005	Farinha	3.25	33
1008	Sab�o	4.25	42
1012	�leo	4.55	30
1013	Mel�o	3.79	25
--------------------------------
Pressione enter para continuar... 
Pressione enter para continuar... 


-------------------------------------------
*** Menu ***
-------------------------------------------
0 - Sair
1 - Exibir Lista
2 - Inserir Elemento na Lista
3 - Atualizar elemento
4 - Remover elemento da lista
-------------------------------------------
Op��o: 
-------------------------------------------

4

--------------------------------
Informe Id do produto: 1005

-------------------------------------------
*** Menu ***
-------------------------------------------
0 - Sair
1 - Exibir Lista
2 - Inserir Elemento na Lista
3 - Atualizar elemento
4 - Remover elemento da lista
-------------------------------------------
Op��o: 
-------------------------------------------
1

--------------------------------
Cod	Produto	Pre�o	Estoque
--------------------------------
1003	Arroz	4.69	35
1004	Feij�o	6.3	40
1008	Sab�o	4.25	42
1012	�leo	4.55	30
1013	Mel�o	3.79	25
--------------------------------
Pressione enter para continuar... 
Pressione enter para continuar... 


-------------------------------------------
*** Menu ***
-------------------------------------------
0 - Sair
1 - Exibir Lista
2 - Inserir Elemento na Lista
3 - Atualizar elemento
4 - Remover elemento da lista
-------------------------------------------
Op��o: 
-------------------------------------------
0
Fim da execu��o.
*/