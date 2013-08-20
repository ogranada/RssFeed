package com.example.rssfeed;

import com.framework.leopardus.fragments.BaseFragment;
import com.framework.leopardus.interfaces.InjectMethod;
import com.framework.leopardus.interfaces.InjectView;
import com.framework.leopardus.utils.InjectableMethods;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ListaFragment extends BaseFragment {

	@InjectView(id=R.id.btntest)
	Button b;
	
	@InjectMethod(id=R.id.btntest)
	public void onBtn1Click(View v){
		this.getActivity().runOnUiThread(new Runnable() {
			public void run() {
				Toast.makeText(getActivity(), "Click", Toast.LENGTH_LONG).show();
			}
		});
	}

	@InjectMethod(id=R.id.btntest, method=InjectableMethods.OnLongClickListener)
	public void clickLargoBtn1(View v){
		this.getActivity().runOnUiThread(new Runnable() {
			public void run() {
				Toast.makeText(getActivity(), "Long Click", Toast.LENGTH_LONG).show();
			}
		});
	}
	
	public ListaFragment() {
		super(R.layout.activity_lista_fragment);
	}
	
}
