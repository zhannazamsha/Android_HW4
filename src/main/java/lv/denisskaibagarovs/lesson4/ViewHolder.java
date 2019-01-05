package lv.denisskaibagarovs.lesson4;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ViewHolder {
    @BindView(R.id.imageView) ImageView imageViewPhoto;
    @BindView(R.id.textViewAuthor) TextView textViewAuthor;
    @BindView(R.id.textViewLocation) TextView textViewLocation;

    public ViewHolder(View view) {
        ButterKnife.bind(this, view);
    }

}
