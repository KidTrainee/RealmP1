package com.example.truongducbinh.realm.activity;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;

import com.example.truongducbinh.realm.R;
import com.example.truongducbinh.realm.adapters.BooksAdapter;
import com.example.truongducbinh.realm.realm.RealmController;

import io.realm.Realm;

public class MainActivity extends AppCompatActivity {
    private BooksAdapter adapter;
    private Realm realm;
    private LayoutInflater inflater;
    private FloatingActionButton fab;
    private RecyclerView recycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fab = (FloatingActionButton) findViewById(R.id.activity_main_fab);
        recycler = (RecyclerView) findViewById(R.id.content_main_recycler_view);

        // get realm instance
        realm = RealmController.with(this).getRealm();

        // set toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        setupRecycler();

        if (!Prefs.with(this).getPreLoad()) {
            setRealmData();
        }

        // refresh the realm instance
    }

    private void setRealmData() {

    }

    private void setupRecycler() {

    }
}
