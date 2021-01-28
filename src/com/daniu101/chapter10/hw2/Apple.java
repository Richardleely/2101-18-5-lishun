package com.daniu101.chapter10.hw2;

/*
封装一苹果类，其属性有品牌、尺寸、开机状态，打电话和上网行为，
使用关键字private保护尺寸和开机状态在合适的范围内，
并建立测试类进行测试。然后重写toString方法，
输出类似10.1.5的第二个toString例子。
 */
public class Apple {
    private String name;
    private double size;
    private boolean status;

    public void setSize(double size) {
        if (size < 0){
            System.out.println("输入不符合要求");
        }else {
            this.size = size;
        }
    }
    public void setStatus(boolean status) {
        if (!status ) {
            System.out.println("商品属于关机状态");
        }else {
            this.status = status;
        }
    }
    public double getSize() {
        return size;
    }

    public boolean getStatus(){
        return status;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "size=" + size +
                ", status=" + status +
                '}';
    }
    void call(){
        System.out.println("打电话");
    }
    void internal(){
        System.out.println("上网");
    }
}
