package ninjacoding.us.buttonclickcount;

import android.view.View;

/**
 * Created by wils0n on 27/08/15.
 */
public class OurClickListener implements View.OnClickListener{

    private int count;
    MainActivity caller;

    OurClickListener(MainActivity activity){
        this.caller = activity;
        this.count = 0;
    }

    public void onClick(View view){
        count = count + 1;
        String out = "The button has been clicked " + count + " time";

        if (count != 1){
            out += "s";
        }
        caller.theTextView.setText(out);

        // Otra forma
        
        //String tempResult = Integer.toString(count);
        //antiguamente se hacia lo anterior, ahora setText lo castea automaticamente

        //if (count == 1){
        //    caller.theTextView.setText("The button has been clicked " + count + " time.");
        //} else {
        //    caller.theTextView.setText("The button has been clicked " + count + " times.");
        //}
    }
}
