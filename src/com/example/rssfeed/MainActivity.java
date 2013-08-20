package com.example.rssfeed;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.framework.leopardus.activities.BaseFragmentsActivity;
import com.framework.leopardus.fragments.BaseFragment;
import com.framework.leopardus.interfaces.ActivityMethodInterface;
import com.framework.leopardus.interfaces.InjectMethod;
import com.framework.leopardus.interfaces.InjectView;
import com.framework.leopardus.interfaces.InterfacesHelper;
import com.framework.leopardus.interfaces.MethodInterface;
import com.framework.leopardus.utils.InjectableMethods;
import com.framework.leopardus.utils.UI;

public class MainActivity extends BaseFragmentsActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		BaseFragment bf = new ListaFragment();
		
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
