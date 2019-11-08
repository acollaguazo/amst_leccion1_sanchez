package ec.edu.espol.fiec.espol.amst_l1_sanchez_espolservicios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView ivService;
    TextView tvDescription;
    Context mContext = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivService = findViewById(R.id.ivService);
        tvDescription = findViewById(R.id.tvDescription);
    }

    public void selectService(View v) {
        switch (v.getId()) {
            case R.id.btnSidweb:
                tvDescription.setText(R.string.sidweb_description);
                ivService.setImageResource(R.drawable.sidweb);
                Toast.makeText(mContext, "24/7", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnAcademic:
                tvDescription.setText(R.string.academic_system_description);
                ivService.setImageResource(R.drawable.academico);
                Toast.makeText(mContext, "24/7 pero aveces se cae en registros", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnSocietyLinks:
                tvDescription.setText(R.string.society_links_description);
                ivService.setImageResource(R.drawable.vinculos);
                Toast.makeText(mContext, "8:00 - 16:30", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnStudentHeal:
                tvDescription.setText(R.string.student_heal_description);
                ivService.setImageResource(R.drawable.ubep);
                Toast.makeText(mContext, "7:30 - 17:00", Toast.LENGTH_SHORT).show();
                break;
        }
    }

}
