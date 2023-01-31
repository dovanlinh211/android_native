package com.example.recycleview;

import static android.content.ContentValues.TAG;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
// dung de chuyen cac doi tuong vao recycle view
public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder>  {
    private Context mContext;
    private List<User> mListUser;

    public UserAdapter(Context mContext) {
        Log.d(TAG, "UserAdapter context Contructor: ");
        this.mContext = mContext;
    }
    public void setData(List<User> list) {
        Log.d(TAG, "set list Data UserAdapter "+ list);
        this.mListUser = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parentViewGroup, int viewType) {
        Log.d(TAG, "onCreateViewHolder: ");
        View view = LayoutInflater.from(parentViewGroup.getContext()).inflate(R.layout.item,parentViewGroup,false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        Log.d(TAG, "onBindViewHolder: ");
        User user = mListUser.get(position);
        if (user == null) {
            return;
        }
        holder.imageView.setImageResource(user.getSrcImage());
        holder.textView.setText(user.getName());
    }

    @Override
    public int getItemCount() {
        Log.d(TAG, "getItemCount: Lentgh of list :  " + mListUser.size());
        if(mListUser!=null){
            return mListUser.size();
        }
        return 0;
    }

    public  class  UserViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageView;
        private TextView textView;
        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            Log.d(TAG, "UserViewHolder Contructor, get view from layout: ");
            imageView = itemView.findViewById(R.id.img_view);
            textView = itemView.findViewById(R.id.tv_name);
        }
    }
}
