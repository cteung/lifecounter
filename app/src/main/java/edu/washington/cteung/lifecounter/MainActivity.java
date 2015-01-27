package edu.washington.cteung.lifecounter;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private int Life1;
    private int Life2;
    private int Life3;
    private int Life4;

    private TextView P1Life;
    private TextView P2Life;
    private TextView P3Life;
    private TextView P4Life;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null) {
            // Restore value of members from saved state
            Life1 = savedInstanceState.getInt("Life1");
            Life2 = savedInstanceState.getInt("Life2");
            Life3 = savedInstanceState.getInt("Life3");
            Life4 = savedInstanceState.getInt("Life4");
        } else {
            Life1 = 20;
            Life2 = 20;
            Life3 = 20;
            Life4 = 20;
        }

        P1Life = (TextView)findViewById(R.id.P1Life);
        P1Life.setText(Integer.toString(Life1));
        P2Life = (TextView)findViewById(R.id.P2Life);
        P2Life.setText(Integer.toString(Life2));
        P3Life = (TextView)findViewById(R.id.P3Life);
        P3Life.setText(Integer.toString(Life3));
        P4Life = (TextView)findViewById(R.id.P4Life);
        P4Life.setText(Integer.toString(Life4));

    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);

        savedInstanceState.putInt("Life1", Life1);
        savedInstanceState.putInt("Life2", Life2);
        savedInstanceState.putInt("Life3", Life3);
        savedInstanceState.putInt("Life4", Life4);

    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        // Restore UI state from the savedInstanceState.
        // This bundle has also been passed to onCreate.
        Life1 = savedInstanceState.getInt("Life1");
        Life2 = savedInstanceState.getInt("Life2");
        Life3 = savedInstanceState.getInt("Life3");
        Life4 = savedInstanceState.getInt("Life4");
    }

    //EXTRA CREDIT: One Listener
    public void onClick(View v) {
        // define the button that invoked the listener by id
        switch (v.getId()) {
            //Player 1
            case R.id.P1m5:
                Life1 -= 5;
                P1Life.setText(Integer.toString(Life1));
                if (Life1 <= 0){
                    Toast.makeText(getApplicationContext(), "Player 1 LOSES!",
                            Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.P1m1:
                Life1 -= 1;
                P1Life.setText(Integer.toString(Life1));
                if (Life1 <= 0){
                    Toast.makeText(getApplicationContext(), "Player 1 LOSES!",
                            Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.P1p1:
                Life1 += 1;
                P1Life.setText(Integer.toString(Life1));
                break;
            case R.id.P1p5:
                Life1 += 5;
                P1Life.setText(Integer.toString(Life1));
                break;

            //Player 2
            case R.id.P2m5:
                Life2 -= 5;
                P2Life.setText(Integer.toString(Life2));
                if (Life2 <= 0){
                    Toast.makeText(getApplicationContext(), "Player 2 LOSES!",
                            Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.P2m1:
                Life2 -= 1;
                P2Life.setText(Integer.toString(Life2));
                if (Life2 <= 0){
                    Toast.makeText(getApplicationContext(), "Player 2 LOSES!",
                            Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.P2p1:
                Life2 += 1;
                P2Life.setText(Integer.toString(Life2));
                break;
            case R.id.P2p5:
                Life2 += 5;
                P2Life.setText(Integer.toString(Life2));
                break;

            //Player 3
            case R.id.P3m5:
                Life3 -= 5;
                P3Life.setText(Integer.toString(Life3));
                if (Life3 <= 0){
                    Toast.makeText(getApplicationContext(), "Player 3 LOSES!",
                            Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.P3m1:
                Life3 -= 1;
                P3Life.setText(Integer.toString(Life3));
                if (Life3 <= 0){
                    Toast.makeText(getApplicationContext(), "Player 3 LOSES!",
                            Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.P3p1:
                Life3 += 1;
                P3Life.setText(Integer.toString(Life3));
                break;
            case R.id.P3p5:
                Life3 += 5;
                P3Life.setText(Integer.toString(Life3));
                break;

            //Player 4
            case R.id.P4m5:
                Life4 -= 5;
                P4Life.setText(Integer.toString(Life4));
                if (Life4 <= 0){
                    Toast.makeText(getApplicationContext(), "Player 4 LOSES!",
                            Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.P4m1:
                Life4 -= 1;
                P4Life.setText(Integer.toString(Life4));
                if (Life4 <= 0){
                    Toast.makeText(getApplicationContext(), "Player 4 LOSES!",
                            Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.P4p1:
                Life4 += 1;
                P4Life.setText(Integer.toString(Life4));
                break;
            case R.id.P4p5:
                Life4 += 5;
                P4Life.setText(Integer.toString(Life4));
                break;
        }
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
