package com.zhixiaoyou.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.ButterKnife;
import butterknife.InjectView;

import com.zhixiaoyou.ui.R;

/**
 * A simple {@link android.support.v4.app.Fragment} subclass. Use the
 * {@link QuestionFragment#newInstance} factory method to create an instance of
 * this fragment.
 * 
 */
public class QuestionFragment extends Fragment {
	private String mParam1;
	
	@InjectView(R.id.tv_content)
	TextView tv_content;

	public QuestionFragment() {
		// Required empty public constructor
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		if (getArguments() != null) {
			mParam1 = getArguments().getString("key");
		}
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return inflater.inflate(R.layout.fragment_question, container, false);
	}
	
	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
		ButterKnife.inject(this, view);
		System.out.println(mParam1 + " - ´´½¨Íê±Ï");
	}


}
