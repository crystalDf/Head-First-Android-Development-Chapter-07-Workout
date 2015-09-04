package com.star.workout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WorkoutDetailFragment workoutDetailFragment = (WorkoutDetailFragment)
                getSupportFragmentManager().findFragmentById(R.id.detail_frag);

        workoutDetailFragment.setWorkoutId(1);
    }

}
