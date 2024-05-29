package com.example.mariagepie;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import com.example.mariagepie.adapter.MariageAdapter;
import com.example.mariagepie.model.MariageModel;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mariageRecyclerView;
    private MariageAdapter mariageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mariageRecyclerView = findViewById(R.id.mariageRecyclerView);
        mariageRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Dummy data
        List<MariageModel> mariageList = new ArrayList<>();
        mariageList.add(new MariageModel("Always communicate openly and honestly with each other. Effective communication helps resolve conflicts and build a stronger bond.", "Type 1", "Communication"));
        mariageList.add(new MariageModel("Remember to make time for each other, even in the midst of busy schedules. Regularly spending quality time together strengthens your relationship.", "Type 2", "Quality Time"));
        mariageList.add(new MariageModel("Support each other's dreams and aspirations, and work together towards common goals. Mutual support fosters growth and happiness.", "Type 3", "Dreams and Goals"));
        mariageList.add(new MariageModel("Express gratitude and appreciation for each other regularly. Showing appreciation can enhance the positive aspects of your relationship.", "Type 4", "Gratitude"));
        mariageList.add(new MariageModel("Learn to forgive and let go of past grievances. Holding onto grudges can create unnecessary tension and resentment.", "Type 5", "Forgiveness"));
        mariageList.add(new MariageModel("Keep the romance alive by surprising each other with thoughtful gestures. Small acts of love and kindness keep the romance alive.", "Type 6", "Romance"));
        mariageList.add(new MariageModel("Prioritize trust and honesty in your relationship. Trust is the foundation of a healthy and enduring relationship.", "Type 7", "Trust"));
        mariageList.add(new MariageModel("Work together as a team, especially during challenging times. Facing challenges together strengthens your partnership.", "Type 8", "Teamwork"));
        mariageList.add(new MariageModel("Be patient and understanding with each other's flaws and imperfections. Acceptance and patience foster a more harmonious relationship.", "Type 9", "Patience"));
        mariageList.add(new MariageModel("Celebrate each other's achievements, no matter how small. Recognizing each other's successes fosters a positive and supportive environment.", "Type 10", "Celebration"));
        mariageList.add(new MariageModel("Listen actively to each other's concerns and feelings. Active listening helps in understanding and resolving issues effectively.", "Type 11", "Active Listening"));
        mariageList.add(new MariageModel("Maintain a healthy balance between independence and togetherness. Balancing personal space and couple time is crucial for a healthy relationship.", "Type 12", "Independence vs Togetherness"));
        mariageList.add(new MariageModel("Remember to laugh together and find joy in everyday moments. Shared laughter and joy strengthen your emotional connection.", "Type 13", "Joy and Laughter"));
        mariageList.add(new MariageModel("Stay committed to working through challenges and conflicts together. Commitment to resolving issues strengthens your bond.", "Type 14", "Commitment"));
        mariageList.add(new MariageModel("Be each other's biggest cheerleader and source of encouragement. Supporting each other boosts confidence and happiness.", "Type 15", "Support"));
        mariageList.add(new MariageModel("Create rituals and traditions that are meaningful to your relationship. Shared rituals foster a sense of togetherness and belonging.", "Type 16", "Rituals"));
        mariageList.add(new MariageModel("Make decisions together and consider each other's opinions and feelings. Collaborative decision-making respects both partners' perspectives.", "Type 17", "Decision Making"));
        mariageList.add(new MariageModel("Show affection and love through both words and actions. Consistent displays of affection reinforce your love and commitment.", "Type 18", "Affection"));
        mariageList.add(new MariageModel("Learn to compromise and find solutions that benefit both partners. Compromise is essential for resolving conflicts and maintaining harmony.", "Type 19", "Compromise"));
        mariageList.add(new MariageModel("Seek opportunities for personal growth and encourage each other's self-improvement. Supporting personal growth enhances your relationship's overall well-being.", "Type 20", "Personal Growth"));

        // Create and set the adapter
        mariageAdapter = new MariageAdapter(mariageList, this);
        mariageRecyclerView.setAdapter(mariageAdapter);
    }
}
