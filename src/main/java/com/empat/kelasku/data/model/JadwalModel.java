package com.empat.kelasku.data.model;

import com.google.gson.annotations.SerializedName;

public class JadwalModel {

    @SerializedName("_id")
    private String id;
    @SerializedName("hari")
    private String hari;
    @SerializedName("ruangan")
    private String ruangan;
    @SerializedName("pelajaran")
    private String pelajaran;
    @SerializedName("kelas")
    private String[] kelas;
    @SerializedName("jam")
    private String[] jam;
    @SerializedName("guru")
    private String[] guru;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHari() {
        return hari;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }

    public String getRuangan() {
        return ruangan;
    }

    public void setRuangan(String ruangan) {
        this.ruangan = ruangan;
    }

    public String getPelajaran() {
        return pelajaran;
    }

    public void setPelajaran(String pelajaran) {
        this.pelajaran = pelajaran;
    }

    public String[] getKelas() {
        return kelas;
    }

    public void setKelas(String[] kelas) {
        this.kelas = kelas;
    }

    public String[] getJam() {
        return jam;
    }

    public void setJam(String[] jam) {
        this.jam = jam;
    }

    public String[] getGuru() {
        return guru;
    }

    public void setGuru(String[] guru) {
        this.guru = guru;
    }
}
