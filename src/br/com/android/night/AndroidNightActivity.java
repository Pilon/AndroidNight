package br.com.android.night;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import br.com.android.night.dao.ListaDAO;
import br.com.android.night.entity.Evento;

public class AndroidNightActivity extends Activity implements OnClickListener{

	private Button btSalvar;
	private Button btConsultar;
	private TextView txtEvento;
	private TextView txtDescricao;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		btSalvar = (Button) findViewById(R.id.btSalvar);
		btConsultar = (Button) findViewById(R.id.btConsultar);
		txtDescricao = (TextView) findViewById(R.id.txtDescricao);
		txtEvento = (TextView) findViewById(R.id.txtEvento);
		
		btSalvar.setOnClickListener(this);
		btConsultar.setOnClickListener(this);
	}
	
	@Override
	public void onClick(View v) {
		Button tmpButton = (Button) v;
		switch (tmpButton.getId()) {
		case R.id.btSalvar:
			String descricao = txtDescricao.getText().toString();
			String evento = txtEvento.getText().toString();
			
			if(descricao.isEmpty() || evento.isEmpty())
			{
				Toast.makeText(this, "Por favor, preencha os campos", 3);
			}
			else
				ListaDAO.getInstance().add(new Evento(evento, descricao));
			
			break;
		case R.id.btConsultar:
			startActivity(new Intent(this, Consultar.class));
			break;
		}
	}
}