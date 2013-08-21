package com.example.rssfeed;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.framework.leopardus.fragments.BaseFragment;
import com.framework.leopardus.interfaces.InjectMethod;
import com.framework.leopardus.interfaces.InjectView;
import com.framework.leopardus.utils.InjectableMethods;

public class ListaFragment extends BaseFragment {

	@InjectView(id=R.id.btntest)
	Button b;
	
	@InjectView(id=R.id.imageView1)
	ImageView imagen;
	
	@InjectMethod(id=R.id.btntest)
	public void onBtn1Click(View v){
		this.getActivity().runOnUiThread(new Runnable() {
			public void run() {
				Toast.makeText(getActivity(), "Click", Toast.LENGTH_LONG).show();
			}
		});
		com.framework.leopardus.utils.ImageLoaderTool.getInstance(this.getActivity()).display("http://blackmarches.wdfiles.com/local--files/red-dragon-king/RedDragon.jpg", imagen);
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
