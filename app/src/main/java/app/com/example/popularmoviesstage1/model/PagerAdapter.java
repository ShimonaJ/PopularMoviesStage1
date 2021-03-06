package app.com.example.popularmoviesstage1.model;

/**
 * Created by Shimona on 12/20/2015.
 */


        import android.os.Bundle;
        import android.support.v4.app.Fragment;
        import android.support.v4.app.FragmentManager;
        import android.support.v4.app.FragmentStatePagerAdapter;

        import app.com.example.popularmoviesstage1.DetailActivityFragment;
        import app.com.example.popularmoviesstage1.ReviewFragment;
        import app.com.example.popularmoviesstage1.TrailerFragment;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    Bundle args;
    public PagerAdapter(FragmentManager fm, int NumOfTabs,Bundle args) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
        this.args = args;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                DetailActivityFragment tab1 = new DetailActivityFragment();
                tab1.setArguments(args);
                return tab1;
            case 1:
                ReviewFragment tab2 = new ReviewFragment();
                tab2.setArguments(args);
                return tab2;
            case 2:
                TrailerFragment tab3 = new TrailerFragment();
                tab3.setArguments(args);
                return tab3;

//            case 2:
//                TabFragment3 tab3 = new TabFragment3();
//                return tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}