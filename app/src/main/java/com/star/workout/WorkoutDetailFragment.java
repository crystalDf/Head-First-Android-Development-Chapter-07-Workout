package com.star.workout;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class WorkoutDetailFragment extends Fragment {

    public static final String WORKOUT_ID = "workoutId";

    private long workoutId;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (savedInstanceState != null) {
            workoutId = savedInstanceState.getLong(WORKOUT_ID);
        }
        return inflater.inflate(R.layout.fragment_workout_detail, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();

        View view = getView();

        if (view != null) {
            Workout workout = Workout.workouts[((int) workoutId)];

            TextView title = (TextView) view.findViewById(R.id.text_title);
            title.setText(workout.getName());

            TextView description = (TextView) view.findViewById(R.id.text_description);
            description.setText(workout.getDescription());
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putLong(WORKOUT_ID, workoutId);
        super.onSaveInstanceState(outState);
    }

    public void setWorkoutId(long workoutId) {
        this.workoutId = workoutId;
    }
}
