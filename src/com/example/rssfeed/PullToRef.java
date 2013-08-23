package com.example.rssfeed;

import uk.co.senab.actionbarpulltorefresh.library.PullToRefreshAttacher.OnRefreshListener;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.framework.leopardus.fragments.BaseFragment;

public class PullToRef extends BaseFragment {

	public PullToRef() {
		super(R.layout.activity_pull_to_ref);
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v = super.onCreateView(inflater, container, savedInstanceState);
		View vw = v.findViewById(R.id.lyt_pull);
		getParentActivity().PullToRefreshInit(vw, new OnRefreshListener() {
			
			@Override
			public void onRefreshStarted(View view) {
				// TODO Auto-generated method stub
				System.err.println("Hola...");
			}
		});
		return v;
	}

}
