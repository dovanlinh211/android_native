package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rcvUser;
    private UserAdapter userAdapter;

    // main de khoi tao va chay cac ham
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rcvUser = findViewById(R.id.recycle_view);
        userAdapter = new UserAdapter(this);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        rcvUser.setLayoutManager(gridLayoutManager);
        userAdapter.pushDataToAdapter(getListUser());
        rcvUser.setAdapter(userAdapter);

    }
    //tao ra 1 list cac doi tuong User voi image va username
    private List<User> getListUser() {
        List<User> list = new ArrayList<>();
        list.add(new User(R.drawable.cafe, "User 1"));
        list.add(new User(R.drawable.coca, "User 2"));
        list.add(new User(R.drawable.tra_chanh, "User 3"));
        list.add(new User(R.drawable.tra_chanh, "User 4"));
        list.add(new User(R.drawable.cafe, "User 5"));
        list.add(new User(R.drawable.coca, "User 6"));
        list.add(new User(R.drawable.tra_chanh, "User 7"));
        list.add(new User(R.drawable.tra_chanh, "User 8"));
        list.add(new User(R.drawable.cafe, "User 9"));

        list.add(new User(R.drawable.tra_chanh, "User 10"));
        list.add(new User(R.drawable.coca, "User 11"));
        list.add(new User(R.drawable.cafe, "User 12"));
        list.add(new User(R.drawable.cafe, "User 13"));
        list.add(new User(R.drawable.cafe, "User 14"));
        list.add(new User(R.drawable.coca, "User 15"));
        list.add(new User(R.drawable.tra_chanh, "User 16"));
        list.add(new User(R.drawable.tra_chanh, "User 17"));
        list.add(new User(R.drawable.cafe, "User 18"));
        return list;
    }
}