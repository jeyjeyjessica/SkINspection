package jessica.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class NVActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nvactivity);
        TextView text = (TextView) findViewById(R.id.nvtext);
        text.setText(Html.fromHtml("<p><b>\tDescription –</b></p>\n" +
                "\n" +
                "Moles, also called “melanocytic nevi,” are common in newborns and infants (about 1 percent).\n" +
                "If they are seen at birth or develop during the first 1-2 years of life they are called congenital melanocytic nevi. While most of these moles are small, some may be very large.\n" +
                "<p><b>\tCauses –</b></p>\n" +
                "\n" +
                "All moles, including those that are congenital, are made of “melanocytes.” These are the cells that give skin its color (pigment). These cells are present in all skin types and colors, in varying degrees. In congenital melanocytic nevi, there are more of these cells, which makes that skin a darker color. It is not known what causes these to form, but a genetic cause is suspected.\n" +
                "<p><b>\tSymptoms –</b></p>\n" +
                "\n" +
                "Melanocytic nevi usually look like light to dark brown spots on the skin. In children with very light or fair skin, they may appear more pink or red in color. They may have hair growing in them, a bumpy texture, or slowly get darker in color.\n" +
                "<p><b>\tTreatment –</b></p>\n" +
                "\n" +
                "The majority of congenital melanocytic nevi do not need treatment.\n" +
                "Check the mole(s) each month. Watch for any changes in the way the mole(s) look. It may help to take a photo of the mole(s) with your smartphone or digital camera so you can tell if there have been any changes.\n" +
                "If there are any changes, such as areas of bleeding or crusting, new bumpy areas, areas that change color, new pain or itch, change in shape or rapid change in size, have your child see your doctor.\n" +
                "For some congenital nevi, complete removal may be recommended.\n"));
    }
}