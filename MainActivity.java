package roy.myappcompany.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view)
    {
        Log.i("Info", "Button pressed");

        EditText editText = (EditText) findViewById (R.id.editText);

        String amountInPounds = editText.getText().toString();

        double amountInPoundsDouble = Double.parseDouble(amountInPounds);

        double amountInDollarDouble = amountInPoundsDouble * 1.3;

        String amountInDollarString = String.format("%.2f",amountInDollarDouble);

        Toast.makeText( this, " @" + amountInPounds + "is $" + amountInDollarString, Toast.LENGTH_LONG).show();





        Log.i("Info",editText.getText().toString());

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
