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
				UI.dialogYesNo(getMySelf(), new String(new char[] { 191 })
						+ "En realidad desea salir?",
						InterfacesHelper.getCloseMethod(),
						InterfacesHelper.getVoidActivityMethod());
			}
		});
	}

	@InjectMenuItem(stringId = R.string.image, iconId = R.drawable.ico_image)
	public void onImageItemClick(ListView lv, View v, long id) {
		Toast.makeText(getBaseContext(), "This is an Image event...",
				Toast.LENGTH_SHORT).show();
	}

	@InjectMenuItem(stringId = R.string.another, iconId = R.drawable.ic_launcher_another)
	public void onAnotherItemClick(ListView lv, View v, long id) {
		Toast.makeText(getBaseContext(), "This is another event...",
				Toast.LENGTH_SHORT).show();
	}

}
