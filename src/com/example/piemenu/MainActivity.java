package com.example.piemenu;
import com.example.piemenu.view.PieMenuView;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {
	PieMenuView pieMenuView1;
	private String[] names3={"ϵͳ����","�������","������","UI����","IPA����"};
	private int[] images3={R.drawable.ic_launcher,R.drawable.ic_launcher,R.drawable.ic_launcher,R.drawable.ic_launcher,R.drawable.ic_launcher};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		pieMenuView1=(PieMenuView)findViewById(R.id.pieMenuView1);
		pieMenuView1.init(images3, names3,R.drawable.ic_launcher, 0, PieMenuView.CENTERBOTTOM, 200, 200);
		pieMenuView1.setOnClickListener(clickit);
	}

	OnClickListener clickit = new OnClickListener() {
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			if (v.getId() == 100 + 0) {
				System.out.println("�ֻ�����");
			} else if (v.getId() == 100 + 1) {
				System.out.println("�ֻ�������ʾ");
			} else if (v.getId() == 100 + 2) {
				System.out.println("΢��������ʾ");
			} else if (v.getId() == 100 + 3) {
				System.out.println("��������");
			} else if (v.getId() == 100 + 4) {
				System.out.println("��ҵ����");
			} else if (v.getId() == 100 + 5) {
				System.out.println("����");
			}
		}
	};

}
