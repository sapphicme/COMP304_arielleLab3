package arielle.mueller.m301037045.ui.dashboard;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ArielleViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ArielleViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}

//Arielle Mueller
//Student Number: 301037045
//Sec: 002