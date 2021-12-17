package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Produto;

public class NovoProduto {
	public static void main(String[] args) {

		// INSERIR PRODUTO

		 EntityManagerFactory emf =
		 Persistence.createEntityManagerFactory("EmpresaAcc");
		 EntityManager em = emf.createEntityManager();

		 Produto NovoProduto = new Produto("arroz",10, 2.5f);

		 em.getTransaction().begin();
		 em.persist(NovoProduto);
		 em.getTransaction().commit();

		 em.close();
		 emf.close();
		
		
		

		 //DELETAR PRODUTO
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("EmpresaAcc");
//		EntityManager em = emf.createEntityManager();
//
//		Produto RemoverProduto = em.find(Produto.class, 4L);
//
//		if (RemoverProduto != null) {
//			em.getTransaction().begin();
//			em.remove(RemoverProduto);
//			em.getTransaction().commit();
//			
//			emf.close();
//			em.close();
//		}

		
		
		
		// ALTERAR PRODUTO
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("EmpresaAcc");
//		EntityManager em = emf.createEntityManager();
//
//		em.getTransaction().begin(); // METODO DE TRANSAÇAO
//
//		Produto AlterarProduto = em.find(Produto.class, 5L);
//		System.out.println(AlterarProduto.getNome()); // PARA CONSULTAR ID, NOME,EMAIL
//
//		AlterarProduto.setNome("queijo");
//		AlterarProduto.setQuantidade(20);
//		AlterarProduto.setValor(3.50);
//
//		em.merge(AlterarProduto);
//
//		em.getTransaction().commit();
//
//		em.close();
//		emf.close();
	}

}
