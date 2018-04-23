package com.techno.roomdatabase.ViewModel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;

import com.techno.roomdatabase.Entity.Word;
import com.techno.roomdatabase.Repository.WordRepository;

import java.util.List;

/**
 * Created by Arbaz.
 * Date: 17/3/18
 * Time: 1:09 PM
 */
public class WordViewModel extends AndroidViewModel {
    private WordRepository mRepository;

    private LiveData<List<Word>> mAllWords;

    public WordViewModel (Application application) {
        super(application);
        mRepository = new WordRepository(application);
        mAllWords = mRepository.getAllWords();
    }

    public LiveData<List<Word>> getAllWords() { return mAllWords; }

    public void insert(Word word) { mRepository.insert(word); }
}
