package com.alizhezi.base.lifecycle;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

public class AccountModel extends AndroidViewModel {

    private MutableLiveData<AccountBean> mAccounts=new MutableLiveData<>();

    public AccountModel(@NonNull Application application) {
        super(application);
    }

    public void setAccounts(String name, String phone, String blog){


        mAccounts.setValue(new AccountBean(name,phone,blog));
    }

    public MutableLiveData<AccountBean> getAccount(){
        return mAccounts;
    }

    @Override
    protected void onCleared() {
        super.onCleared();
    }
}
