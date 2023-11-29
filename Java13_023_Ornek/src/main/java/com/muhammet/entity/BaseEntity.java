package com.muhammet.entity;

public class BaseEntity {
    Long crateAt;
    Long updateAt;
    int state;
    boolean isActive;

    public Long getCrateAt() {
        return crateAt;
    }

    public void setCrateAt(Long crateAt) {
        this.crateAt = crateAt;
    }

    public Long getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Long updateAt) {
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
