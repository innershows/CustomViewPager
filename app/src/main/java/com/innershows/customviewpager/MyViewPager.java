package com.innershows.customviewpager;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * 自定义ViewPager
 */
public class MyViewPager extends ViewGroup {


    //图片资源
    private static final int[] imgIds = new int[]

            {
                    R.mipmap.ic_launcher,
                    R.mipmap.ic_launcher,
                    R.mipmap.ic_launcher,
                    R.mipmap.ic_launcher,
                    R.mipmap.ic_launcher
            };

    public MyViewPager(Context context) {
        super(context);
        init(context, null, 0);
    }

    public MyViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs, 0);
    }

    public MyViewPager(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs, defStyleAttr);
    }

    /**
     * 初始化
     *
     * @param context
     * @param attrs
     * @param defStyleAttr
     */
    private void init(Context context, AttributeSet attrs, int defStyleAttr) {

        ImageView imageView = null;
        LayoutParams params = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);

        for (int i = 0; i < imgIds.length; i++) {
            imageView = new ImageView(context);
            imageView.setLayoutParams(params);
            addView(imageView);
        }

    }


    /**
     * 测量宽高
     *
     * @param widthMeasureSpec
     * @param heightMeasureSpec
     */
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    /**
     * Called from layout when this view should assign a size and position to each of its children.
     * Derived classes with children
     * should override this method and call layout on each of their children.
     *
     * @param changed
     * @param l       left
     * @param t       top
     * @param r       right
     * @param b       bottom
     */
    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b){

        layout(0, 0, imgIds.length * getWidth(), getHeight());
    }
}
