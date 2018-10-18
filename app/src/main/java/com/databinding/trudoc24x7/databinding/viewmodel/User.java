package com.databinding.trudoc24x7.databinding.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.databinding.trudoc24x7.databinding.BR;

public class User extends BaseObservable {
    String name;
    String email;

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        notifyPropertyChanged(BR.email);
    }
}