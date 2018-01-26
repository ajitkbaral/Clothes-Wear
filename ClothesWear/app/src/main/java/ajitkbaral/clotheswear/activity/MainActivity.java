package ajitkbaral.clotheswear.activity;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import ajitkbaral.clotheswear.R;
import ajitkbaral.clotheswear.adapter.ViewPagerAdapter;
import ajitkbaral.clotheswear.fregmant.MyCollectionFragment;
import ajitkbaral.clotheswear.fregmant.SuggestionFragment;
import ajitkbaral.clotheswear.fregmant.TrendingFragment;

public class MainActivity extends AppCompatActivity {

    private Context mContext;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager = (ViewPager) findViewById(R.id.viewPagerPassbook);
        viewPager.setOffscreenPageLimit(0);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabBalance);
        tabLayout.setupWithViewPager(viewPager);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new TrendingFragment(), "Trending");
        adapter.addFragment(new SuggestionFragment(), "Suggestions");
        adapter.addFragment(new MyCollectionFragment(), "My Collection");
        viewPager.setAdapter(adapter);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_signout, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_signout:
                Intent loginActivity = new Intent(mContext, LoginActivity.class);
                startActivity(loginActivity);
                finish();
                break;
        }

        return true;
    }

}
