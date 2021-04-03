package com.hfad.snackbartoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                final Snackbar snackbar = Snackbar.make(view, "ITEM EXCLUÍDO", Snackbar.LENGTH_INDEFINITE);
                snackbar.setAction("FECHAR", new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        snackbar.dismiss();

                        Toast.makeText(MainActivity.this, "Snackbar foi fechada", Toast.LENGTH_LONG).show();
                    }

                });

                View snackView = snackbar.getView();
                snackView.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));

                TextView snackActionView = snackView.findViewById(com.google.android.material.R.id.snackbar_action);
                snackActionView.setTextColor(getResources().getColor(android.R.color.white));

                snackbar.show();
            }

        });
    }
}
