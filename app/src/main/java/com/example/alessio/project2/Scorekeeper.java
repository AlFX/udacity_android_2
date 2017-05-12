package com.example.alessio.project2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Scorekeeper extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scorekeeper);
    }

    int repsLT = 0;
    int repsLC = 0;
    int repsLB = 0;
    int repsRT = 0;
    int repsRC = 0;
    int repsRB = 0;

    int iden = 0;

    public void increment(View view) {
        switch (view.getId()) {
            case (R.id.LeftTopBtn):
                repsLT++;
                iden = R.id.LeftTop;
                display(repsLT, iden);
                break;
            case (R.id.LeftCenterBtn):
                repsLC++;
                iden = R.id.LeftCenter;
                display(repsLC, iden);
                break;
            case (R.id.LeftBottomBtn):
                repsLB++;
                iden = R.id.LeftBottom;
                display(repsLB, iden);
                break;
            case (R.id.RightTopBtn):
                repsRT++;
                iden = R.id.RightTop;
                display(repsRT, iden);
                break;
            case (R.id.RightCenterBtn):
                repsRC++;
                iden = R.id.RightCenter;
                display(repsRC, iden);
                break;
            case (R.id.RightBottomBtn):
                repsRB++;
                iden = R.id.RightBottom;
                display(repsRB, iden);
                break;
        }
    }

    public void reset(View view) {
        switch (view.getId()) {
            case (R.id.LeftReset):
                iden = R.id.LeftTop;
                display(0, iden);
                iden = R.id.LeftCenter;
                display(0, iden);
                iden = R.id.LeftBottom;
                display(0, iden);
                break;
            case (R.id.RightReset):
                iden = R.id.RightTop;
                display(0, iden);
                iden = R.id.RightCenter;
                display(0, iden);
                iden = R.id.RightBottom;
                display(0, iden);
                break;
        }
    }

    private void display(int number, int iden) {
        TextView stuff = (TextView) findViewById(iden);
        stuff.setText("" + number);
    }

}