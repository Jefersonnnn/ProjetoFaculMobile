package univille.com.br.loggermarker.interfaces;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by Jeferson Machado on 03/09/16.
 */
public class RecyclerItemClickListener implements RecyclerView.OnItemTouchListener {

    private OnItemClickListener mListener;
    GestureDetector mGestureDetector;
    private Context context;

    public interface OnItemClickListener {
        public void onItemClick(View view, int position);
        public void onLongPressClick(View view, int position);
    }

    public RecyclerItemClickListener(Context context,final RecyclerView rv, OnItemClickListener listener) {
        mListener = listener;

        mGestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() {
            @Override
            public boolean onSingleTapUp(MotionEvent e) {
                View childView = rv.findChildViewUnder(e.getX(), e.getY());

                if (childView != null && mListener != null) {
                    mListener.onItemClick(childView, rv.getChildAdapterPosition(childView));
                }

                return true;
            }

            @Override
            public void onLongPress(MotionEvent e) {
                super.onLongPress(e);

                View childView = rv.findChildViewUnder(e.getX(), e.getY());

                if(childView != null && mListener != null){
                    mListener.onLongPressClick(childView, rv.getChildAdapterPosition(childView));
                }
            }
        });
    }

    @Override
    public boolean onInterceptTouchEvent(RecyclerView view, MotionEvent e) {
        mGestureDetector.onTouchEvent(e);
        return false;
    }

    @Override
    public void onTouchEvent(RecyclerView view, MotionEvent motionEvent) {
    }

    @Override
    public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

    }


}