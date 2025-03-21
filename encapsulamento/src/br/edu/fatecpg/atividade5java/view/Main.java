package br.edu.fatecpg.atividade5java.view;
import br.edu.fatecpg.atividade5java.model.Carro;
import br.edu.fatecpg.atividade5java.model.Conta;
import br.edu.fatecpg.atividade5java.model.Produto;

public class Main {

	public static void main(String[] args) {
		// 1
		
		Carro carro = new Carro("Renault", "Kwid", 2020, 60.0);
        
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Ano: " + carro.getAno());
        System.out.println("Capacidade do tanque: " + carro.getCapacidadeTanque() + " litros");
        
        double precoGasolina = 6.00;
        System.out.println("O custo para encher o tanque é: R$ " + carro.calcularCustoParaEncherTanque(precoGasolina));
		
		// 2
		
		Conta conta = new Conta(1234, 56789, "Gustavo Lemos");
        
        System.out.println("Agência: " + conta.getAgencia());
        System.out.println("Conta: " + conta.getConta());
        System.out.println("Titular: " + conta.getNomeCliente());
        System.out.println("Saldo inicial: R$ " + conta.getSaldo());
        System.out.println("Cheque Especial disponível: R$ " + conta.getChequeEspecial());
        
        conta.depositar(1000);
        conta.sacar(300);
        
		// 3
		
        Produto produto = new Produto("Notebook", 3000.00, 10);

        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: R$" + produto.getPreco());
        System.out.println("Quantidade em Estoque: " + produto.getQuantidadeEstoque());

        produto.setPreco(-500.00);
        produto.setQuantidadeEstoque(-5);

        produto.setPreco(3500.00);
        produto.setQuantidadeEstoque(15);

        System.out.println("\nAtualizações:");
        System.out.println("Preço: R$" + produto.getPreco());
        System.out.println("Quantidade em Estoque: " + produto.getQuantidadeEstoque());
	}

}
