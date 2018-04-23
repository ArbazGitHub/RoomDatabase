package com.techno.roomdatabase.Dao;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.techno.roomdatabase.Entity.Word;

import java.util.List;

/**
 * Created by Arbaz.
 * Date: 17/3/18
 * Time: 12:17 PM
 */

@Dao
public interface WordDao {
    @Insert
    void insert(Word word);

    @Query("DELETE FROM word_table")
    void deleteAll();

    //@Query("SELECT *from word_table ORDER BY word ASC")
    //List<Word> getAllWords();

    @Query("SELECT * from word_table ORDER BY word ASC")
    LiveData<List<Word>> getAlphabetizedWords();
}
