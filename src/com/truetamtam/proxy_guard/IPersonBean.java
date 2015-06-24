package com.truetamtam.proxy_guard;

/**
 * Created by truetamtam on 24.06.15.
 */
public interface IPersonBean {

    String getName();
    String getGender();
    String getInterests();
    int getHotOrNotRating();

    void setName(String name);
    void setGender(String gender);
    void setInterests(String interests);
    void setHotOrNotRating();
}
