package jessica.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class MELActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_melactivity);
        TextView text = (TextView) findViewById(R.id.meltext);
        text.setText(Html.fromHtml("<p><b>\tDescription –</b></p>\n" +
                "\n" +
                "Melanoma, the most serious type of skin cancer, develops in the cells (melanocytes) that produce melanin — the pigment that gives your skin its color. Melanoma can also form in your eyes and, rarely, inside your body, such as in your nose or throat. The risk of melanoma seems to be increasing in people under 40, especially women. Knowing the warning signs of skin cancer can help ensure that cancerous changes are detected and treated before the cancer has spread. Melanoma can be treated successfully if it is detected early.\n" +
                "<p><b>\tSymptoms –</b></p>\n" +
                "\n" +
                "The first melanoma signs and symptoms often are:\n" +
                "A change in an existing mole\n" +
                "The development of a new pigmented or unusual-looking growth on your skin\n" +
                "Melanoma doesn't always begin as a mole. It can also occur on otherwise normal-appearing skin.\n" +
                "\n" +
                "<p><b>\tCauses –</b></p>\n" +
                "\n" +
                "Melanoma occurs when something goes wrong in the melanin-producing cells (melanocytes) that give color to your skin. The following are some of the reasons -\n" +
                "A history of sunburn. One or more severe, blistering sunburns can increase your risk of melanoma.\n" +
                "Excessive ultraviolet (UV) light exposure. Exposure to UV radiation, which comes from the sun and from tanning lights and beds, can increase the risk of skin cancer, including melanoma.\n" +
                "Living closer to the equator or at a higher elevation. People living closer to the earth's equator, where the sun's rays are more direct, experience higher amounts of UV radiation than do those living farther north or south. In addition, if you live at a high elevation, you're exposed to more UV radiation.\n" +
                "Having many moles or unusual moles. Having more than 50 ordinary moles on your body indicates an increased risk of melanoma.\n" +
                "A family history of melanoma. If a close relative — such as a parent, child or sibling — has had melanoma, you have a greater chance of developing a melanoma, too.\n" +
                "\n" +
                "<p><b>\tTreatment –</b></p>\n" +
                "\n" +
                "Treatment for small melanomas\n" +
                "Treatment for early-stage melanomas usually includes surgery to remove the melanoma. A very thin melanoma may be removed entirely during the biopsy and require no further treatment.\n" +
                "Treating melanomas that have spread beyond the skin\n" +
                "If melanoma has spread beyond the skin, treatment options may include:\n" +
                "Surgery to remove affected lymph nodes.\n" +
                " If melanoma has spread to nearby lymph nodes, your surgeon may remove the affected nodes.\n" +
                "Immunotherapy.\n" +
                " Immunotherapy is a drug treatment that helps your immune system to fight cancer.\n" +
                "Targeted therapy.\n" +
                "Targeted drug treatments focus on specific weaknesses present within cancer cells. By targeting these weaknesses, targeted drug treatments can cause cancer cells to die.\n" +
                "Radiation therapy.\n" +
                "This treatment uses high-powered energy beams, such as X-rays and protons, to kill cancer cells. Radiation therapy may be directed to the lymph nodes if the melanoma has spread there.\n" +
                "Chemotherapy.\n" +
                "Chemotherapy uses drugs to kill cancer cells. Chemotherapy can be given intravenously, in pill form or both so that it travels throughout your body.\n"));
    }
}