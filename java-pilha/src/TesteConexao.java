
public class TesteConexao {
	public static void main(String[] args) {
		
		try (Conexao conexao = new Conexao()){
			conexao.leDados();
		}
		catch(IllegalStateException ex){
			System.out.println("Erro de conex?o");
		}
		
		
		
		//--------------------------
		
		/*Conexao con = null;		
		try {
			con = new Conexao();
			con.leDados();
			con.close();
		}
		catch(IllegalStateException ex){
			System.out.println("Erro de conex?o");
			
		}
		finally {
			System.out.println("Finally!");
			if(con != null) {
				con.close();
			}
			
		}*/
	}

}
