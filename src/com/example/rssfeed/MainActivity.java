package com.example.rssfeed;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import com.framework.leopardus.activities.BaseFragmentsActivity;
import com.framework.leopardus.fragments.BaseFragment;
import com.framework.leopardus.interfaces.ActivityMethodInterface;
import com.framework.leopardus.interfaces.InterfacesHelper;
import com.framework.leopardus.interfaces.MenuItemEvent;
import com.framework.leopardus.interfaces.injection.InjectMenuItem;
import com.framework.leopardus.utils.UI;

public class MainActivity extends BaseFragmentsActivity {
	
//	BaseFragment bf = new ListaFragment();
//	BaseFragment bf2 = new ListaFragment();
//	BaseFragment bf3 = new PullToRef();
	
	DrawerTest dt = new DrawerTest();
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		enableHomeAsButton();
		setEnabledMenuOnHomeButton();
		getMenu().enableAutoExit();

		setOnCloseEvent(new ActivityMethodInterface() {
			
			@Override
			public void Method(Activity act, Object... args) {
				UI.dialogYesNo(MainActivity.this, new String(new char[] { 191 })
				+ "En realidad desea salir?",
				InterfacesHelper.getCloseMethod(),
				InterfacesHelper.getVoidActivityMethod());
			}
		});

		setActualFragment(dt);
		
	}

//	@InjectMenuItem(stringId = R.string.image, iconId = R.drawable.ico_image)
//	public void onImageItemClick(ListView lv, View v, long id) {
//		setActualFragment(bf2);
//	}

//	@InjectMenuItem(stringId = R.string.another, iconId = R.drawable.ic_launcher_another)
//	public void onAnotherItemClick(ListView lv, View v, long id) {
//		Toast.makeText(getBaseContext(), "This is another event...",
//				Toast.LENGTH_SHORT).show();
//	}

}
