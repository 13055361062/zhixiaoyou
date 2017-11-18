package com.zhixiaoyou.ui;

import com.zhixiaoyou.fragment.BuyFragment;
import com.zhixiaoyou.fragment.MeFragment;
import com.zhixiaoyou.fragment.MessageFragment;
import com.zhixiaoyou.fragment.QuestionFragment;
import com.zhixiaoyou.ui.R;



public enum MainTab {

	BUY(0, R.string.main_tab_name_buy, R.drawable.tab_icon_buy,
			BuyFragment.class),

	QUESTION(1, R.string.main_tab_name_question, R.drawable.tab_icon_question,
			QuestionFragment.class),
	MESSAGE(3, R.string.main_tab_name_message, R.drawable.tab_icon_message,
			MessageFragment.class),
			
	ME(4, R.string.main_tab_name_my, R.drawable.tab_icon_me,
			MeFragment.class);

	private int idx;
	private int resName;
	private int resIcon;
	private Class<?> clz;

	private MainTab(int idx, int resName, int resIcon, Class<?> clz) {
		this.idx = idx;
		this.resName = resName;
		this.resIcon = resIcon;
		this.clz = clz;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public int getResName() {
		return resName;
	}

	public void setResName(int resName) {
		this.resName = resName;
	}

	public int getResIcon() {
		return resIcon;
	}

	public void setResIcon(int resIcon) {
		this.resIcon = resIcon;
	}

	public Class<?> getClz() {
		return clz;
	}

	public void setClz(Class<?> clz) {
		this.clz = clz;
	}
}
