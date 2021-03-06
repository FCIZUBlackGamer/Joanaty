package joanat.freelance.com.joanaty;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import joanat.freelance.com.joanaty.SellBell.FragmentHome;

public class SwitchNav extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch_nav);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        fragmentManager = getSupportFragmentManager();

        fragmentManager.beginTransaction().replace(R.id.main_frame, new FragmentHome()).commit();


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.switch_nav, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_sell) {
            fragmentManager.beginTransaction().replace(R.id.main_frame, new joanat.freelance.com.joanaty.SellBell.FragmentHome()).commit();
        } else if (id == R.id.nav_return) {
            fragmentManager.beginTransaction().replace(R.id.main_frame, new joanat.freelance.com.joanaty.ReturnBell.FragmentHome()).commit();
        } else if (id == R.id.nav_customers) {
            fragmentManager.beginTransaction().replace(R.id.main_frame, new joanat.freelance.com.joanaty.Customers.FragmentHome()).commit();
        } else if (id == R.id.nav_admin) {
            fragmentManager.beginTransaction().replace(R.id.main_frame, new joanat.freelance.com.joanaty.Users.FragmentHome()).commit();
        } else if (id == R.id.nav_report_sell) {
            fragmentManager.beginTransaction().replace(R.id.main_frame, new joanat.freelance.com.joanaty.SaildReport.FragmentHome()).commit();

        } else if (id == R.id.nav_report_return) {
            fragmentManager.beginTransaction().replace(R.id.main_frame, new joanat.freelance.com.joanaty.ReturnedReport.FragmentHome()).commit();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
