package com.empat.kelasku.data.api.jastis;

import com.empat.kelasku.Main;
import com.empat.kelasku.data.model.KelasSocketModel;
import com.empat.kelasku.ui.view.KelasView;
import com.empat.kelasku.util.CallbackInterface;

public class KelasSocketCallback implements CallbackInterface {

	@Override
	public void kelasSocketCallback(KelasSocketModel kelasSocket) {
		Main.kelasSocket = kelasSocket;
		if (Main.isKelasFullViewRendered) {
			Main.kelasFullView.createKelasKosong(Main.kelasSocket);		
		}
		if (Main.activeContentPanelView instanceof KelasView) {
			((KelasView) Main.activeContentPanelView).createKelasKosong(Main.kelasSocket);
		}
	}

}
