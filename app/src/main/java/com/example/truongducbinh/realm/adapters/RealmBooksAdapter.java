package com.example.truongducbinh.realm.adapters;

import android.content.Context;

import com.example.truongducbinh.realm.model.Book;

import io.realm.RealmResults;

/**
 * This classes are needed to make the recycler view adapter
 * work with the realm data.
 */
public class RealmBooksAdapter extends RealmModelAdapter<Book>{
    public RealmBooksAdapter(Context context, RealmResults<Book> realmResults, boolean automaticUpdate) {
        super(context, realmResults, automaticUpdate);
    }
}
