package com.example.rssfeed;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.framework.leopardus.activities.BaseFragmentsActivity;
import com.framework.leopardus.fragments.BaseFragment;
import com.framework.leopardus.interfaces.ActivityMethodInterface;
import com.framework.leopardus.interfaces.InterfacesHelper;
import com.framework.leopardus.interfaces.MethodInterface;
import com.framework.leopardus.utils.UI;

public class MainActivity extends BaseFragmentsActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		BaseFragment bf = new BaseFragment(R.layout.activity_lista_fragment, new MethodInterface() {
			
			@Override
			public void Method(View v, Object... args) {
				// TODO Auto-generated method stub
				
			}
		});
		
		setActualFragment(bf);
		setEnabledMenuOnHome();
		enableHomeAsButton();
		getMenu().enableAutoExit();
		
		setOnCloseEvent(new ActivityMethodInterface() {
			
			@Override
			public void Method(Activity act, Object... args) {
				UI.dialogYesNo(getMySelf(), 
						new String(new char[] { 191 }) + "En realidad desea salir?", 
				InterfacesHelper.getCloseMethod(),
				InterfacesHelper.getVoidActivityMethod());
			}
		});
		
	}
}
