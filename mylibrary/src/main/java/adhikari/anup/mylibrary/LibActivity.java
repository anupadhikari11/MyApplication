package adhikari.anup.mylibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;

import io.codetail.animation.SupportAnimator;

public class LibActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lib);
        LinearLayout mRevealView = (LinearLayout)findViewById(R.id.reveal_items);
        int cx = (mRevealView.getLeft() + mRevealView.getRight());
        int cy = mRevealView.getTop();
        int endradius = Math.max(mRevealView.getWidth(), mRevealView.getHeight());
        SupportAnimator mAnimator = io.codetail.animation.ViewAnimationUtils.createCircularReveal(mRevealView, cx, cy, 0, endradius);
    }
}
