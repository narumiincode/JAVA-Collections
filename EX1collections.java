package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class EX1collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op;
		String x ;
		String zero;
		
		Scanner leia= new Scanner(System.in);

		
		Collection <String> estoque= new ArrayList<String>();
	
			estoque.add("caderno");
			estoque.add("lapis");
			estoque.add("borracha");
			estoque.add("mesa");
			estoque.add("toalha");
			estoque.add("racao");
			
	
				
			System.out.println("\n 1-mostrar itens:");
			System.out.println("\n 2-deletar item: ");
			System.out.println("\n 3-atualizar dados (digite sem letra maiuscula e acentuação:");
			op=leia.nextShort();
		
		switch(op)
			
			{
			case 1:
				
				leia.nextLine();
				System.out.println("\n Os itens em estoque são:");
				if (estoque.isEmpty())
				{
				System.out.println("vazio"+estoque);	
				}
				else
				{
				System.out.println("-->"+estoque);
				}
				System.out.println();
				break;
				
			case 2:
				leia.nextLine();
				System.out.println("\n digite o item a ser removido:");
				x=leia.nextLine();
				estoque.remove(x);
				
				if (estoque.isEmpty())
				{
				System.out.println("vazio"+estoque);
				}
				else
					{
					System.out.println("-->"+estoque);
					}
				System.out.println();
				break;
							
			case 3:
			
			leia.nextLine();
			System.out.println("\n atualizando dados (*digite sem letra maiuscula e acentuação.*):");
			x=leia.nextLine();
			estoque.add(x);
			
			if (estoque.isEmpty())
			{
			System.out.println("vazio"+estoque);	
			}
			else
			{
			System.out.println("-->"+estoque);
			}
			System.out.println();
			}
	}
	}

	