package activity.example.chaosxu.flowlayout.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import activity.example.chaosxu.flowlayout.R;
import activity.example.chaosxu.flowlayout.view.FlowLayout;

public class MainActivity extends AppCompatActivity {

        private String mNames[] = {
              "welcome", "android", "TextView",
              "apple", "jamy", "kobe bryant",
              "jordan", "layout", "viewgroup",
              "margin", "padding", "text",
              "name", "type", "search", "logcat"
        };

        private FlowLayout mFlowLayout;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

                initChildViews();
        }

        private void initChildViews() {
                mFlowLayout = (FlowLayout) findViewById(R.id.flow_layout);

                ViewGroup.MarginLayoutParams lp = new ViewGroup.MarginLayoutParams(
                      LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                lp.leftMargin = 5;
                lp.rightMargin = 5;
                lp.topMargin = 5;
                lp.bottomMargin = 5;
                for(int i = 0; i < mNames.length; i ++){
                        TextView view = new TextView(this);
                        view.setText(mNames[i]);
                        view.setTextColor(Color.WHITE);
                        view.setBackgroundDrawable(getResources().getDrawable(R.drawable.textview_bg));
                        mFlowLayout.addView(view,lp);
                }

        }
}
