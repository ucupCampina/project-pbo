package com.empat.kelasku.data.model;

import java.util.ArrayList;

import org.json.JSONObject;

import com.google.gson.annotations.SerializedName;

public class KelasSocketModel {

	@SerializedName("kelas_kosong")
	private ArrayList<String> kelasKosong;
	@SerializedName("kelas_berlangsung")
	private ArrayList<String> kelasBerlangsung;
	
	public ArrayList<String> getKelasKosong() {
		return kelasKosong;
	}
	
	public void setKelasKosong(ArrayList<String> kelasKosong) {
		this.kelasKosong = kelasKosong;
	}
	
	public ArrayList<String> getKelasBerlangsung() {
		return kelasBerlangsung;
	}
	
	public void setKelasBerlangsung(ArrayList<String> kelasBerlangsung) {
		this.kelasBerlangsung = kelasBerlangsung;
	}
}
