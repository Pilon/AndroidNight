package br.com.android.night;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import br.com.android.night.dao.ListaDAO;
import br.com.android.night.entity.Evento;


public class Consultar extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.consultar);
		
		ListView view = (ListView) findViewById(R.id.listEventos);
		
		ArrayAdapter<Evento> adapter = new ArrayAdapter<Evento>(this, android.R.layout.simple_list_item_1, android.R.id.text1, ListaDAO.getInstance().getListaEventos());
		view.setAdapter(adapter);
	}

}
