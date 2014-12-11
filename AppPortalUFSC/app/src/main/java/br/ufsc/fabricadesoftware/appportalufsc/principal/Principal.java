package br.ufsc.fabricadesoftware.appportalufsc.principal;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import br.ufsc.fabricadesoftware.appportalufsc.R;


public class Principal extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        GridView gridView = (GridView) findViewById(R.id.gridView);
        gridView.setAdapter(new Adapter(this));
        registerForContextMenu(gridView);

         /*Event opens an Activity when an item is clicked*/
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                try {
                    Intent novaIntent;
                    switch ((int) id) {
                        case R.drawable.img2: {
                            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                            startActivity(browserIntent);
                            break;
                        }
                        default: {
                            Toast.makeText(Principal.this, "Clique inválido",
                                    Toast.LENGTH_SHORT).show();
                        }
                    }
                } catch (Exception e) {
                    Toast t = Toast.makeText(Principal.this, e.getMessage(), Toast.LENGTH_SHORT);
                    t.show();
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_principal, menu);
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
