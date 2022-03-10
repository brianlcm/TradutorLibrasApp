package org.tensorflow.lite.examples.detection;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.Scroller;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Button open_camera = findViewById(R.id.button_openCamera);
        Button list_words = findViewById(R.id.button_listWords);
        open_camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent new_intent = new Intent(HomeActivity.this, DetectorActivity.class);
                startActivity(new_intent);
            }
        });
        list_words.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog dialog = new AlertDialog.Builder(HomeActivity.this)
                        .setTitle("Lista de sinais detectáveis")
                        .setMessage("ajudar\nalergia\namanhã\napenas\naqui\naté\nbem\nbraço\ncair\ncalma\ncerto" +
                                "\ncinco\ncom\ncomo\nconduzir\nconsulta\ncoronavírus\ncustar\ndia" +
                                "\ndiabetes\ndocumento\ndoente\ndois\ndor\nescada\nestar\nfarmácia" +
                                "\nfazer\nfebre\nfisioterapeuta\ngripe\nhoras\nhospital\nligar\nmédico" +
                                "\nmoça\nmostrar\nnegativo\nnormal\nnove\nobrigada\noi\noito\npagar" +
                                "\npositivo\nprecisar\nproblema\nquanto\nquatro\nquerer\nreal\nrecomendar" +
                                "\nremédio\nseis\nsete\nteste\ntontura\ntosse\ntrês\num\nvocê\nvoltar\nzero")
                        .setPositiveButton("Fechar", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        })
                        .show();
                TextView textView = (TextView) dialog.findViewById(android.R.id.message);
                textView.setScroller(new Scroller(HomeActivity.this));
                textView.setVerticalScrollBarEnabled(true);
                textView.setMovementMethod(new ScrollingMovementMethod());
            }
        });
    }
}