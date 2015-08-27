package ninjacoding.us.buttonclickcount;

import android.view.View;

/**
 * Created by wils0n on 27/08/15.
 */
public class OurClickListener implements View.OnClickListener{

    MainActivity caller;
    OurClickListener(MainActivity activity){
        this.caller = activity;
    }

    public void onClick(View view){
        caller.theTextView.setText("The button got clicked");
    }
}
