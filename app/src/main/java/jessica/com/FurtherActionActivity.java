package jessica.com;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import org.checkerframework.checker.units.qual.A;

public class FurtherActionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_further_action);
        CardView exit = findViewById(R.id.exit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FurtherActionActivity.this,HomeActivity.class));
            }
        });
        CardView akiec = findViewById(R.id.akiec);
        akiec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FurtherActionActivity.this,AKIECActivity.class));
            }
        });
        CardView bcc = findViewById(R.id.bcc);
        bcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FurtherActionActivity.this,BCCActivity.class));
            }
        });
        CardView bkl = findViewById(R.id.bkl);
        bkl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FurtherActionActivity.this,BKLActivity.class));
            }
        });
        CardView df = findViewById(R.id.df);
        df.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FurtherActionActivity.this,DFActivity.class));
            }
        });
        CardView mel = findViewById(R.id.mel);
        mel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FurtherActionActivity.this,MELActivity.class));
            }
        });
        CardView nv = findViewById(R.id.nv);
        nv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FurtherActionActivity.this,NVActivity.class));
            }
        });
        CardView vasc = findViewById(R.id.vasc);
        vasc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FurtherActionActivity.this,VASCActivity.class));
            }
        });


    }
}