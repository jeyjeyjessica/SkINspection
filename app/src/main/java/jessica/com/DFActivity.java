package jessica.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class DFActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dfactivity);
        TextView text = (TextView) findViewById(R.id.dftext);
        text.setText(Html.fromHtml("<p><b>\tDescription –</b></p>\n" +
                "\n"+  "A dermatofibroma is a common benign fibrous nodule usually found on the skin of the lower legs.\n" +
                "A dermatofibroma is also called a cutaneous fibrous histiocytoma.\n" +
                "It is brown often showing a central zone of fibrosis dermatoscopically.\n" +
                "<p><b>\tCauses –</b></p>\n" +
                "\n" +
                "The lesions are composed of proliferating fibroblasts. Histiocytes may also be involved.\n" +
                "They are sometimes attributed to minor trauma including insect bites, injections, or a rose thorn injury, but not consistently.\n" +
                "Multiple dermatofibromas can develop in patients with altered immunity such as HIV, immunosuppression, or autoimmune conditions.\n" +
                "<p><b>\tSymptoms –</b></p>\n" +
                "\n" +
                "They may be flesh-colored, brown or reddish-brown.\n" +
                "Usually, dermatofibromas form on your arms or legs.\n" +
                "They may feel firm to the touch and can be itchy, tender or painful. Sometimes, they're shaped like a dimple — the center of the lesion falls in, and the edges of the lesion pucker around it.\n" +
                "<p><b>\tTreatment –</b></p>\n" +
                "\n" +
                "Steroid injections to reduce pain or lesion size.\n" +
                "Surgical excision, using a surgical tool to scrape off the lesion.\n"));
    }
}