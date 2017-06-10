package yagu.bean;

import java.io.Serializable;

import lombok.Data;

@Data
public class TestBean implements Serializable{

    private int i;
    private int j;
    
    private int count(){
        return i+j;
    }
}
