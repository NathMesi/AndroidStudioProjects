package br.usjt.voosaereos.voos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListagemVoo extends AppCompatActivity {

    public ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listagem_voo);

        exibirVoos();
    }

    private void exibirVoos() {
        lv = (ListView) findViewById(R.id.listView);

        ArrayList<String> listaVoos = gerarVoos();

        ArrayAdapter<String> voos = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listaVoos);

        lv.setAdapter(voos);
    }

    private ArrayList<String> gerarVoos(){

        ArrayList<String> listaVoos = new ArrayList<String>();

        listaVoos.add("Vôo 1");
        listaVoos.add("Vôo 2");
        listaVoos.add("Vôo 3");
        listaVoos.add("Vôo 4");
        listaVoos.add("Vôo 5");
        listaVoos.add("Vôo 6");
        listaVoos.add("Vôo 7");

        return listaVoos;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_listagem_voo, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
