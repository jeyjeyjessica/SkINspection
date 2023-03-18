package jessica.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class VASCActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vascactivity);
        TextView text = (TextView) findViewById(R.id.vasctext);
        text.setText(Html.fromHtml("<p><b>\tDescription –</b></p>\n" +
                "\n" +
                "These are benign lesions that are composed of proliferating endothelial tissue.  The lesions are more common in females (5:1). They usually appear within a few weeks of birth, grow rapidly and then stabilize and involute by fibrosis and diminished vascularization. Usually after involuting, there is minimal cosmetic defect and 2% require active therapy. A third are gone by 3 years of age, 70% by 7 years of age, and 90% by 9 years of age.\n" +
                "Pyogenic granulomas are small, raised, and red bumps on the skin. The bumps have a smooth surface and may be moist. They bleed easily because of the high number of blood vessels at the site. It is a benign (noncancerous) growth.\n" +
                "<p><b>\tSymptoms –</b></p>\n" +
                "\n" +
                "A pyogenic granuloma starts as a small, fleshy bump protruding from your skin or mucous membranes. It usually grows quickly, from a few millimeters (the tip of a crayon) to about a half-inch (the tip of a finger).\n" +
                "Pyogenic granulomas have been described as looking like ground beef. They may be pink, red, reddish-brown or purple. They often develop a scaly, white “collar” around the bottom.\n" +
                "At maturity, the growths are often attached to your skin by a stalk-like structure (pedunculated). But they can also attach directly to your skin (sessile).\n" +
                "The surface of a pyogenic granuloma starts smooth but can become bumpy or crusty. The lesions are delicate, so they ooze, break and bleed easily.\n" +
                "\n" +
                "\n" +
                "<p><b>\tCauses –</b></p>\n" +
                "\n" +
                "They often happen along with:\n" +
                "Hormonal changes, such as pregnancy or the use of birth control pills.\n" +
                "Infection with the bacteria Staphylococcus aureus (staph infection).\n" +
                "Minor injury or irritation to your skin or mucous membranes (such as poor oral hygiene or piercings).\n" +
                "The skin condition has also been linked to the use of certain types of medications, including:\n" +
                "Antineoplastics (medications used to fight cancer).\n" +
                "Antiretrovirals (often used for HIV).\n" +
                "Immunosuppressants.\n" +
                "Retinoids (vitamin A compounds often used to improve or heal skin).\n" +
                "\n" +
                "<p><b>\tTreatment –</b></p>\n" +
                "\n" +
                "Your healthcare provider may recommend a medication or procedure to treat pyogenic granulomas.\n" +
                "Topical medications applied to your skin to shrink pyogenic granulomas include:\n" +
                "Chemicals such as silver nitrate, phenol and trichloroacetic acid (TCA).\n" +
                "Eye drops such as timolol for a granuloma in your eye.\n" +
                "Imiquimod skin cream.\n" +
                "Steroid injections into the lesion.\n" +
                "Procedures that can remove granulomas include:\n" +
                "Cryotherapy, to freeze it away.\n" +
                "Curettage, to scrape it away, and cautery, to seal the skin with heat.\n" +
                "Laser treatment to destroy the abnormal tissue.\n" +
                "Surgical excision, to cut the granuloma out of your skin.\n"));
    }
}