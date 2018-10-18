package com.databinding.trudoc24x7.databinding;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.databinding.trudoc24x7.databinding.databinding.ActivityMainBinding;
import com.databinding.trudoc24x7.databinding.viewmodel.User;

public class MainActivity extends AppCompatActivity {
    private MyClickHandlers myClickHandlers;
    private EditText edit;
    private User user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user=new User();
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setUser(user);
        myClickHandlers = new MyClickHandlers(this);
        binding.setMyclickhandlers(myClickHandlers);
        edit = findViewById(R.id.editee);
        edit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    public class MyClickHandlers {

        Context context;

        public MyClickHandlers(Context context) {
            this.context = context;
        }

        public void onFabClicked(View view, User user) {
            user.setName(edit.getText().toString());
        }
    }
}
