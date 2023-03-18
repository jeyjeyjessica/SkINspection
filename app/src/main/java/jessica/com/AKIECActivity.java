package jessica.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class AKIECActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akiecactivity);
        TextView text = (TextView) findViewById(R.id.myTextView);
        text.setText(Html.fromHtml("<p><b>\tDescription –</b></p>\n\n" +
                "Actinic keratosis is an abnormal growth of cells caused by long-term damage from the sun,” he says. “They are not cancerous, but a small fraction of them will develop into skin cancer”. Because we don't know which ones will become cancer and which will not, dermatologists recommend treatment of these lesions. It is a skin disorder that causes rough, scaly patches of skin. Another name for this is solar keratosis. Without treatment, AKIEC can lead to a type of skin cancer called squamous cell carcinoma.\n" +
                "<p><b>\tSymptoms –</b></p>\n\n" +
                "Usually, the first signs of actinic keratosis are rough, raised bumps on your skin. They can vary in color but often have a yellow or brown crust on top. These bumps may be:Gray. Pink. Red. The same color as your skin.\n" +
                "Symptoms may also include: Bleeding. Burning, stinging or itching. Dry, scaly lips. Hornlike skin growths that stick out (like an animal’s horn). Loss of color in the lips. Pain or tenderness.\n" +
                "\n" +
                "\n" +
                "<p><b>\tCauses –</b></p>\n\n" +
                "The most common cause of actinic keratosis is too much exposure to ultraviolet (UV) light. UV light comes from the sun or indoor tanning equipment, such as tanning beds. UV light can damage your outer layer of skin cells, called keratinocytes.\n" +
                "<p><b>\tTreatment –</b></p>\n\n" +
                "Treatment options depend on how many actinic keratoses (AKs) you have and what they look like. Your healthcare provider may recommend removing the skin patches during an office visit.\n" +
                "To remove actinic keratosis, your doctor may use: Chemical peels: A chemical peel is like a medical-grade face mask. Your healthcare provider applies the peel during an office visit. The chemicals in the treatment safely destroy unwanted patches in your top layer of skin. In the first few days, the treated area will be sore and red. As the skin heals, you will see a new, healthy layer of skin. Cryotherapy: If you have one or two AKIECs, your provider may use cryotherapy. During this treatment, your provider uses a cold substance such as liquid nitrogen to freeze skin growths. Within a few days, these growths will blister and peel off. Excision: During this treatment, your healthcare provider first numbs the skin around your AKIEC. Your provider then scrapes away or cuts out the AKIECs and stitches the area back together. Usually, your wound will heal in two to three weeks. Photodynamic therapy: If you have multiple AKIECs or AKIECs that return after treatment, your provider may recommend photodynamic therapy. This treatment uses creams and special light therapy to destroy precancerous skin cells. You will need to stay out of the sun for a few days while the treated skin heals.\n"));

    }
}