package controller;

import java.util.ArrayList;

import model.Carro;


public class ControllerCarro{
	public static boolean SalvarCarro(String varId, String varNomeCar, String varAno, String varMarca , String varEstilo, String varCategoria, String varQuilometragem) {
		Carro c = new Carro(varId, varNomeCar, varAno, varMarca, varEstilo, varCategoria, varQuilometragem  );
		return c.Persistir();
	}
	
	public static ArrayList<String[]> getCarros(){
		ArrayList<String[]> Carros = new ArrayList();
		
		ArrayList<Carro> C = Carro.getCarro();
		for(int i=0; i<C.size(); i++) {
			String c[] = new String[6];
			c[0] = C.get(i).getID();
			c[1] = C.get(i).getNome();
			c[2] = C.get(i).getAno();
			c[3] = C.get(i).getMarca();
			c[4] = C.get(i).getEstilo();
			c[5] = C.get(i).getCategoia();
			c[6] = C.get(i).getQuilometragem();
		}
		
		return Carros;
		
		
	}
	
	
	
}
