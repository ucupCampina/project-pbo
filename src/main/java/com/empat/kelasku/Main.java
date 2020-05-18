package com.empat.kelasku;

import com.empat.kelasku.data.api.jastis.JastisApi;
import com.empat.kelasku.data.api.jastis.JastisApiInterface;
import com.empat.kelasku.data.api.jastis.JastisSocket;
import com.empat.kelasku.data.model.JadwalModel;
import com.empat.kelasku.data.model.KelasSocketModel;
import com.empat.kelasku.ui.view.LoginView;
import com.empat.kelasku.util.CallbackInterface;

import java.net.URISyntaxException;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Main {
	
	static JastisSocket jastisSocket;
	static KelasSocketModel kelasSocket;
	
	static class KelasSocketCallback implements CallbackInterface {

		@Override
		public void kelasSocketCallback(KelasSocketModel kelasSocket) {
			Main.kelasSocket = kelasSocket;
			System.out.println(kelasSocket.getKelasKosong());
		}
		
	}
	
    public static void main(String[] args) {
    	jastisSocket = JastisSocket.getInstance();
    	try {
    		jastisSocket.connect();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
    	KelasSocketCallback kelasSocketCallback = new KelasSocketCallback();
    	jastisSocket.listenForEmptyClass(kelasSocketCallback);
    }
    
    public static void loginPage() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }
    
   
}
