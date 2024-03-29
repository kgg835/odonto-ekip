package teste;

import modelo.Convenio;
import modelo.Procedimento;
import persistencia.DaoConvenio;
import persistencia.DaoProcedimento;

public class TesteProcedimento {
	public static void main(String[] args) {
		boolean result = false;
		try{
		Procedimento procedimento = null;
		DaoProcedimento daoProcedimento = new DaoProcedimento();
		Convenio convenio = new Convenio();
		DaoConvenio daoConvenio = new DaoConvenio();
		convenio = daoConvenio.pesquisarConvenioPorNome(convenio);
		
		/*
		System.out.println("1------------------------------Testando a classe procedimento (Cadastro)");
		procedimento = new Procedimento("Pr�tese");
		procedimento.setValorProcedimento(200.);
		procedimento.setConvenio(convenio);
		daoProcedimento.cadastrarProcedimento(procedimento);
		System.out.println("Procedimento "+procedimento.getDescricaoProcedimento()+" cadastrado!");
		*/
		
		/*
		System.out.println("1------------------------------Testando a classe procedimento (Pesquisa)");
		procedimento = new Procedimento("extra��o");
		procedimento = daoProcedimento.pesquisarProcedimentoPorDescricao("extra��o");
		if (procedimento != null){
			System.out.println("Procedimento "+procedimento.getDescricaoProcedimento()+" encontrado!");
		}else{
			System.out.println("Procedimento n�o encontrado");
		}
		*/
		
		System.out.println("1------------------------------Testando a classe procedimento (Alteracao)");
		procedimento = daoProcedimento.pesquisarProcedimentoPorDescricao(procedimento);
		procedimento.setDescricaoProcedimento("obturacao");
		daoProcedimento.alterarProcedimento(procedimento);
		if (result){
			System.out.println("Procedimento alterado para: "+procedimento.getDescricaoProcedimento());
		}else{
			System.out.println("Erro na altera��o");
		}
		
		/*
		System.out.println("1------------------------------Testando a classe procedimento (Exclusao)");
		result = daoProcedimento.excluirProcedimento(procedimento);
		if (result){
			System.out.println("Procedimento exclu�do");
		}else{
			System.out.println("Erro na exclus�o");
		}
*/
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
