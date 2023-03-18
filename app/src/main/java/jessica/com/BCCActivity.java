package jessica.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class BCCActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bccactivity);
        TextView text = (TextView) findViewById(R.id.bcctext);
        text.setText(Html.fromHtml("<p><b>\tDescription –</b></p>\n" +
                "\n" +
                "Basal cell carcinoma (BCC) is a common, locally invasive, keratinocyte cancer (also known as nonmelanoma cancer).\n" +
                "It is the most common form of skin cancer.\n" +
                "BCC is also known as rodent ulcer and basalioma. Patients with BCC often develop multiple primary tumors over time.\n" +
                "<p><b>\tCauses –</b></p>\n" +
                "\n" +
                "     The cause of BCC is multifactorial.\n" +
                "Most often, there are DNA mutations in the patched (PTCH) tumor suppressor gene, part of the hedgehog signaling pathway.\n" +
                "These may be triggered by exposure to ultraviolet radiation.\n" +
                "Various spontaneous and inherited gene defects predispose to BCC.\n" +
                "<p><b>\tSymptoms –</b></p>\n" +
                "\n" +
                "A shiny, skin-colored bump that's translucent, meaning you can see a bit through the          surface.\n" +
                "A brown, black or blue lesion — or a lesion with dark spots — with a slightly raised, translucent border.\n" +
                "A flat, scaly patch with a raised edge. Over time, these patches can grow quite large.\n" +
                "A white, waxy, scar-like lesion without a clearly defined border.\n" +
                "<p><b>\tTreatment –</b></p>\n" +
                "\n" +
                "Basal cell carcinoma is most often treated with surgery to remove all of the cancer and some of the healthy tissue around it.\n" +
                "Surgical excision. In this procedure, your doctor cuts out the cancerous lesion and a surrounding margin of healthy skin.\n" +
                "Mohs surgery. During Mohs surgery, your doctor removes the cancer layer by layer, examining each layer under the microscope until no abnormal cells remain.\n" +
                "Other treatments\n" +
                "Other treatments include:\n" +
                "Radiation therapy. Radiation therapy uses high-energy beams, such as X-rays and protons, to kill cancer cells.\n" +
                "Freezing. This treatment involves freezing cancer cells with liquid nitrogen (cryosurgery).\n"));
    }
}