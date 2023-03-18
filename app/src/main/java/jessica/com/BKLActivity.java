package jessica.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class BKLActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bklactivity);
        TextView text = (TextView) findViewById(R.id.bkltext);
        text.setText(Html.fromHtml("<p><b>\tDescription –</b></p>\n" +
                "\n" +
                "A seborrheic keratosis (seb-o-REE-ik ker-uh-TOE-sis) is a common noncancerous (benign) skin growth. People tend to get more of them as they get older. Seborrheic keratoses are usually brown, black or light tan. The growths (lesions) look waxy or scaly and slightly raised. Seborrheic keratoses do not turn into skin cancer, even after several years, And they don't raise your risk for developing skin cancer or other skin problems. They are not contagious. Typically, the lesions aren't painful, but they may itch.\n" +
                "<p><b>\tSymptoms –</b></p>\n" +
                "\n" +
                "Itching.\n" +
                "Irritation from friction.\n" +
                "Bleeding.\n" +
                "\n" +
                "<p><b>\tCauses –</b></p>\n" +
                "\n" +
                "The first is age: seborrheic keratoses are especially common in adults over 50, and they tend to multiply as people get older. Some studies suggest that sun exposure may increase their occurrence. They also appear more frequently in families, which suggests that genetics may play a role. They are not viral or bacterial. They don’t spread and they aren’t contagious.\n" +
                "<p><b>\tTreatment –</b></p>\n" +
                "\n" +
                "Some options for removing your seborrheic keratosis are\n" +
                "Cryotherapy.\n" +
                "Your healthcare provider will numb the skin and then use liquid nitrogen to freeze the growth. This will cause it to fall off within a few days or weeks.\n" +
                "Electrodessication/Curettage.\n" +
                "Your healthcare provider will numb the skin and then use a targeted electrocurrent to burn the seborrheic keratosis. They use a surgical instrument called a curette to scrape away the remains of the growth.\n" +
                "Laser Therapy.\n" +
                " Lasers offer an alternative to surgery by burning the growth, sterilizing the wound and sealing the tissue all at once. Laser therapy is quick, but the wound will be sore for a while afterward. Lasers are associated with good cosmetic results.\n" +
                "Prescription Hydrogen Peroxide.\n" +
                "The FDA has recently approved a topical solution of 40% hydrogen peroxide to treat seborrheic keratosis. (Over-the-counter hydrogen peroxide is a 1% solution.) The solution comes in an applicator pen, which your healthcare provider will apply to your seborrheic keratosis several times in one visit. You may need more than one visit to see results. Mild skin reactions are a common side effect.\n" +
                "\n" +
                "Some over-the-counter topical treatments have shown promise for reducing seborrheic keratoses. Research is limited on these solutions. They take time and persistence to work and are not 100% effective. But they also have fewer side effects and little-to-no recovery time. They might be a practical option to try if you want to treat many growths at once. Options include:\n" +
                "Tazarotene cream 0.1%.\n" +
                "Alpha Hydroxy Acid (AHA) products, including glycolic acid and salicylic acid peels.\n" +
                "Vitamin D3 cream."));
    }
}