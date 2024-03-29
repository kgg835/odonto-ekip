package persistencia;

import java.util.ArrayList;
import java.util.List;

import modelo.Usuario;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class DaoUsuario {
	
	private SessionFactory fabrica;
	private Session session = null;
	private Transaction transaction = null;
	
	public DaoUsuario(){
		fabrica = Fabrica.obtemFabrica();
		session = fabrica.openSession();
		transaction = session.beginTransaction();
	}	
	
	public void doRollBack() {
		transaction.rollback();
		closeSession();
	}
	
	public void closeSession(){
		session.flush();
		session.close();
	}
	
	public void cadastrarUsuario(Usuario usuario) throws Exception{
			session.persist(usuario);
			transaction.commit();
			closeSession();
	}

	public void alterarUsuario(Usuario usuario) throws Exception{
			session.update(usuario);
			transaction.commit();
			closeSession();
	}

	public void excluirUsuario(Usuario usuario) throws Exception{
			session.delete(usuario);
			transaction.commit();
			closeSession();
	}

	public Usuario pesquisarUsuarioPorCpf(Usuario usuario) throws Exception{
		Usuario u = null;
		Criteria cr = session.createCriteria(Usuario.class).add(Restrictions.eq("cpfUsuario", usuario.getCpfUsuario()));
		u = (Usuario) cr.uniqueResult();
		closeSession();
		return u;
	}
	
	public Usuario pesquisarUsuarioPorNome(Usuario usuario) throws Exception{
		Criteria cr = session.createCriteria(Usuario.class).add(Restrictions.eq("nomeUsuario", usuario.getNomeUsuario()));
		Usuario u = (Usuario)cr.uniqueResult();
		closeSession();
		return u;
	}

	public List<Usuario> pesquisarTodosUsuario() throws Exception{
		List<Usuario> lista = null;
		Criteria cr = session.createCriteria(Usuario.class);
		lista = (ArrayList)cr.list();
		closeSession();
		return lista;
	}
}
