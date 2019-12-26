package com.next.testDataShare;

public class ShareState {

    private static ShareState shareState = null;
    private String item;

    public ShareState() {

    }

    /**
     * Sample code for singleton design pattern
     *
     * @return
     */
//    private static MyData getMyData(){
//        if(myData==null) {
//            myData=new MyData();
//        }
//        return myData;
//    }

    // this method returns the value of variable from steps
    public String getData() {
        return item;
    }

    // this method gets the value of variable from to steps
    public void setData(String item) {
        this.item = item;
    }

}


