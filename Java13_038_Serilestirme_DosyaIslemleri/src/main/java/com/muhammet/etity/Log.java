package com.muhammet.etity;

import java.io.Serializable;

/**
 * Bir çok dosyalama işleminde ve dataların transferleri işlemlerinde verilerin bellir türler için
 * serileştirilip gönderilmesi gerekir. bir çok dilde bulunan bu özellik ortak türlere dönüşümlerde
 * fayda sağlar.
 */
public class Log implements Serializable {
    String classAdi;
    String methodAdi;
    Long dataTarihi;
    String errorMessage;

    @Override
    public String toString() {
        return "Log{" +
                "classAdi='" + classAdi + '\'' +
                ", methodAdi='" + methodAdi + '\'' +
                ", dataTarihi=" + dataTarihi +
                ", errorMessage='" + errorMessage + '\'' +
                '}';
    }

    public Log(String classAdi, String methodAdi, String errorMessage) {
        this.classAdi = classAdi;
        this.methodAdi = methodAdi;
        this.errorMessage = errorMessage;
        this.dataTarihi = System.currentTimeMillis();
    }

    public String getClassAdi() {
        return classAdi;
    }

    public void setClassAdi(String classAdi) {
        this.classAdi = classAdi;
    }

    public String getMethodAdi() {
        return methodAdi;
    }

    public void setMethodAdi(String methodAdi) {
        this.methodAdi = methodAdi;
    }

    public Long getDataTarihi() {
        return dataTarihi;
    }

    public void setDataTarihi(Long dataTarihi) {
        this.dataTarihi = dataTarihi;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
