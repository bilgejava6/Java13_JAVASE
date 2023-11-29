package com.muhammet.entity;

import java.util.Date;

public class BaseEntity {
    /**
     * Bir varlığın oluşturulma zamanı
     */
    Date createAt;
    /**
     * Bir varlığın değiştirilme zamanı
     */
    Date updateAt;
    /**
     * Bir varlığın durumunu tutar, uyulama isterlerine göre liste değişebilir.
     * 0-> silinmiş kayıt
     * 1-> aktif kayıt
     * 2-> onayda
     * 3-> iptal edilmiş
     * 4-> bloklanmış
     * .
     * .
     * .
     */
    int state;
    boolean isActive;

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
