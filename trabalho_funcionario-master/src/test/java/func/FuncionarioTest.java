package func;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FuncionarioTest {

	private Funcionario funcionario;
	private FuncionarioTerceirizado funcionarioTerceirizado;

	@BeforeEach
	public void setup() {
		funcionario = new Funcionario("Peter", 40, 50.00);
		funcionarioTerceirizado = new FuncionarioTerceirizado("Júlia", 30, 60.00, 500.00);
	}

	// Testes da classe Funcionario

	@Test
	public void testCalcularPagamento() {
		assertEquals(2000.00, funcionario.calcularPagamento(), 0.001);
	}

	@Test
	public void testSetHorasTrabalhadasSatisfaz() {
		funcionario.setHorasTrabalhadas(30);
		assertEquals(30, funcionario.getHorasTrabalhadas());
	}

	@Test
	public void testSetHorasTrabalhadasNaoSatisfazMaiorQue40() {
		funcionario.setHorasTrabalhadas(50);
		assertEquals(40, funcionario.getHorasTrabalhadas());
	}

	@Test
	public void testSetHorasTrabalhadasNaoSatisfazMenorQue0() {
		funcionario.setHorasTrabalhadas(-5);
		assertEquals(0, funcionario.getHorasTrabalhadas());
	}

	@Test
	public void testSetValorHoraSatisfaz() {
		funcionario.setValorHora(60.00);
		assertEquals(60.00, funcionario.getValorHora(), 0.001);
	}

	@Test
	public void testSetValorHoraNaoSatisfazMenorQueMinimo() {
		funcionario.setValorHora(40.00);
		assertEquals(52.80, funcionario.getValorHora(), 0.001);
	}

	@Test
	public void testSetValorHoraNaoSatisfazMaiorQueMaximo() {
		funcionario.setValorHora(100.00);
		assertEquals(132.00, funcionario.getValorHora(), 0.001);
	}

	// Testes da classe FuncionarioTerceirizado

	@Test
	public void testCalcularPagamentoComDespesasAdicionais() {
		assertEquals(2275.00, funcionarioTerceirizado.calcularPagamento(), 0.001);
	}

	@Test
	public void testSetDespesasAdicionaisSatisfaz() {
		funcionarioTerceirizado.setDespesasAdicionais(800.00);
		assertEquals(800.00, funcionarioTerceirizado.getDespesasAdicionais(), 0.001);
	}

	@Test
	public void testSetDespesasAdicionaisNaoSatisfazMaiorQue1000() {
		funcionarioTerceirizado.setDespesasAdicionais(1500.00);
		assertEquals(1000.00, funcionarioTerceirizado.getDespesasAdicionais(), 0.001);
	}

}